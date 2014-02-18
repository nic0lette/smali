/*
 * Copyright 2012, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.jf.smalidea.psi.impl;

import com.google.common.base.Strings;
import com.intellij.debugger.SourcePosition;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.editor.Document;
import com.intellij.psi.*;
import com.intellij.psi.PsiModifier.ModifierConstant;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.util.MethodSignature;
import com.intellij.psi.util.MethodSignatureBackedByPsiMethod;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.*;
import org.jf.smalidea.psi.stub.SmaliMethodStub;

import javax.annotation.Nonnull;
import java.util.List;

public class SmaliMethodImpl extends StubBasedPsiElementBase<SmaliMethodStub>
        implements SmaliMethod, StubBasedPsiElement<SmaliMethodStub> {
    public SmaliMethodImpl(@NotNull ASTNode node) {
        super(node);
    }

    public SmaliMethodImpl(@NotNull SmaliMethodStub stub, @NotNull IStubElementType nodeType) {
        super(stub, nodeType);
    }

    public String getMethodNameAndProto() {
        String name = getName();
        String proto = getProto();
        if (!Strings.isNullOrEmpty(name) && proto != null) {
           return name + proto;
        }
        return null;
    }

    @Nonnull
    public String getName() {
        ASTNode nameElement = getNode().findChildByType(ElementTypes.MEMBER_NAME);
        if (nameElement != null) {
            return nameElement.getText();
        }
        return "";
    }

    public String getProto() {
        ASTNode protoElement = getNode().findChildByType(ElementTypes.METHOD_PROTOTYPE);
        if (protoElement != null) {
            return protoElement.getText();
        }
        return null;
    }


    public int getRegisters() {
        PsiElement element = findChildByType(ElementTypes.REGISTERS_SPEC);
        if (element != null) {
            return ((SmaliRegistersSpec)element).getRegistersCount();
            //TODO: correctly process .locals directive
        }
        return -1;
    }

    public SourcePosition getSourcePositionForAddress(int address) {
        SmaliInstruction[] instructions = findChildrenByType(ElementTypes.INSTRUCTION, SmaliInstruction.class);

        address *= 2;

        int curAddress = 0;
        for (SmaliInstruction instruction: instructions) {
            if (curAddress >= address) {
                return SourcePosition.createFromElement(instruction);
            }
            curAddress += instruction.getOpcode().format.size;
            //TODO: add support for variable size instructions
        }
        return null;
    }

    public int getAddressForLine(int line) {
        SmaliInstruction[] instructions = findChildrenByType(ElementTypes.INSTRUCTION, SmaliInstruction.class);
        PsiDocumentManager documentManager = PsiDocumentManager.getInstance(getProject());
        final Document document = documentManager.getDocument(getContainingFile());
        if (document == null) {
            return -1;
        }

        int curAddress = 0;
        int prevAddress;
        for (final SmaliInstruction instruction: instructions) {
            prevAddress = curAddress;
            curAddress += instruction.getOpcode().format.size;

            int curLine = document.getLineNumber(instruction.getTextOffset());
            if (curLine >= line) {
                return prevAddress;
            }
            //TODO: add support for variable size instructions
        }
        return -1;
    }

    @Nullable @Override public ASTNode getAccessFlagsNode() {
        PsiElement accessFlagsElement = findChildByType(ElementTypes.ACCESS_LIST);
        if (accessFlagsElement == null) {
            return null;
        }
        return accessFlagsElement.getNode();
    }

    @Override public boolean hasTypeParameters() {
        return false;
    }

    @Nullable @Override public PsiType getReturnType() {
        PsiTypeElement returnTypeElement = getReturnTypeElement();
        if (returnTypeElement != null) {
            return returnTypeElement.getType();
        }
        return null;
    }

    @Nullable @Override public PsiTypeElement getReturnTypeElement() {
        PsiTypeElement returnTypeElement = findChildByClass(SmaliTypeElement.class);
        if (returnTypeElement == null) {
            return null;
        }
        return returnTypeElement;
    }

    @NotNull @Override public PsiParameterList getParameterList() {
        PsiElement methodPrototype = findChildByType(ElementTypes.METHOD_PROTOTYPE);
        assert methodPrototype != null;

        ASTNode paramListNode = methodPrototype.getNode().findChildByType(ElementTypes.METHOD_PARAM_LIST);
        assert paramListNode != null;

        return (PsiParameterList)paramListNode.getPsi();
    }

    @NotNull @Override public PsiReferenceList getThrowsList() {
        // TODO: find the throws annotations
        return null;
    }

    @Nullable @Override public PsiCodeBlock getBody() {
        return null;
    }

    @Override public boolean isConstructor() {
        // TODO: should this return true for a static constructor?
        return hasModifierProperty("constructor");
    }

    @Override public boolean isVarArgs() {
        // TODO: detect varargs methods
        return false;
    }

    @NotNull @Override public MethodSignature getSignature(@NotNull PsiSubstitutor substitutor) {
        return this;
    }

    @NotNull @Override public PsiSubstitutor getSubstitutor() {
        return PsiSubstitutor.EMPTY;
    }

    @NotNull @Override public PsiType[] getParameterTypes() {
        PsiParameter[] parameters = SmaliMethodImpl.this.getParameterList().getParameters();
        PsiType[] parameterTypes = new PsiType[parameters.length];
        for (int i=0; i<parameters.length; i++) {
            parameterTypes[i] = parameters[i].getType();
        }
        return parameterTypes;
    }

    @Override public boolean isRaw() {
        return false;
    }

    @Nullable @Override public PsiIdentifier getNameIdentifier() {
        PsiElement element = findChildByType(ElementTypes.MEMBER_NAME);
        assert element != null;
        return (PsiIdentifier)element;
    }

    @NotNull @Override public PsiMethod[] findSuperMethods() {
        return new PsiMethod[0];
    }

    @NotNull @Override public PsiMethod[] findSuperMethods(boolean checkAccess) {
        return new PsiMethod[0];
    }

    @NotNull @Override public PsiMethod[] findSuperMethods(PsiClass parentClass) {
        return new PsiMethod[0];
    }

    @NotNull @Override
    public List<MethodSignatureBackedByPsiMethod> findSuperMethodSignaturesIncludingStatic(boolean checkAccess) {
        return null;
    }

    @Nullable @Override public PsiMethod findDeepestSuperMethod() {
        return null;
    }

    @NotNull @Override public PsiMethod[] findDeepestSuperMethods() {
        return new PsiMethod[0];
    }

    @NotNull @Override public PsiModifierList getModifierList() {
        SmaliModifierList modifierList = (SmaliModifierList)findChildByType(ElementTypes.MODIFIER_LIST);
        assert modifierList != null;
        return modifierList;
    }

    @Override public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        return null;
    }

    @NotNull @Override public HierarchicalMethodSignature getHierarchicalMethodSignature() {
        return null;
    }

    @Nullable @Override public PsiDocComment getDocComment() {
        return null;
    }

    @Override public boolean isDeprecated() {
        return false;
    }

    @Nullable @Override public PsiTypeParameterList getTypeParameterList() {
        return null;
    }

    @NotNull @Override public PsiTypeParameter[] getTypeParameters() {
        return new PsiTypeParameter[0];
    }

    @Nullable @Override public PsiClass getContainingClass() {
        return (PsiClass)getParent();
    }

    @Override public boolean hasModifierProperty(@ModifierConstant @NonNls @NotNull String name) {
        return getModifierList().hasModifierProperty(name);
    }

    @NotNull @Override public PsiAnnotation[] getAnnotations() {
        return new PsiAnnotation[0];
    }

    @NotNull @Override public PsiAnnotation[] getApplicableAnnotations() {
        return new PsiAnnotation[0];
    }

    @Nullable @Override public PsiAnnotation findAnnotation(@NotNull @NonNls String qualifiedName) {
        return null;
    }

    @NotNull @Override public PsiAnnotation addAnnotation(@NotNull @NonNls String qualifiedName) {
        return null;
    }
}
