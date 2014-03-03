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

import com.google.common.base.Function;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.intellij.debugger.SourcePosition;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.editor.Document;
import com.intellij.psi.*;
import com.intellij.psi.PsiModifier.ModifierConstant;
import com.intellij.psi.impl.PsiSuperMethodImplUtil;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.util.MethodSignature;
import com.intellij.psi.util.MethodSignatureBackedByPsiMethod;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.dexlib2.base.reference.BaseMethodReference;
import org.jf.dexlib2.iface.*;
import org.jf.dexlib2.iface.debug.DebugItem;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.util.MethodUtil;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.*;
import org.jf.smalidea.psi.stub.SmaliMethodStub;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SmaliMethodImpl extends StubBasedPsiElementBase<SmaliMethodStub>
        implements SmaliMethod, StubBasedPsiElement<SmaliMethodStub> {
    private Method dexlib2Method = null;
    private Map<String, SmaliLabelImpl> labelMap = null;

    public SmaliMethodImpl(@NotNull ASTNode node) {
        super(node);
    }

    public SmaliMethodImpl(@NotNull SmaliMethodStub stub, @NotNull IStubElementType nodeType) {
        super(stub, nodeType);
    }

    @Override public void subtreeChanged() {
        super.subtreeChanged();
        dexlib2Method = null;
        labelMap = null;
        for (SmaliInstruction instruction: getInstructions()) {
            instruction.setOffset(-1);
        }
    }

    @Nonnull
    public String getName() {
        SmaliMethodStub stub = getStub();
        if (stub != null) {
            return stub.getName();
        }

        ASTNode nameElement = getNode().findChildByType(ElementTypes.MEMBER_NAME);
        if (nameElement != null) {
            return nameElement.getText();
        }
        return "";
    }

    @Nonnull
    public String getProto() {
        SmaliMethodStub stub = getStub();
        if (stub != null) {
            return stub.getProto();
        }

        ASTNode protoElement = getNode().findChildByType(ElementTypes.METHOD_PROTOTYPE);
        if (protoElement != null) {
            return protoElement.getText();
        }
        return "()V";
    }


    public int getRegisters() {
        MethodImplementation implementation = getDexlib2Method().getImplementation();
        if (implementation == null) {
            return 0;
        }
        return implementation.getRegisterCount();
    }

    @Nonnull @Override public List<SmaliInstruction> getInstructions() {
        return Arrays.asList(findChildrenByType(ElementTypes.INSTRUCTION, SmaliInstruction.class));
    }

    @Nullable
    public SourcePosition getSourcePositionForOffset(int offset) {
        for (SmaliInstruction instruction: getInstructions()) {
            if (instruction.getOffset() >= offset) {
                return SourcePosition.createFromElement(instruction);
            }
        }
        return null;
    }

    public int getOffsetForLine(int line) {
        PsiDocumentManager documentManager = PsiDocumentManager.getInstance(getProject());
        final Document document = documentManager.getDocument(getContainingFile());
        if (document == null) {
            return -1;
        }

        for (final SmaliInstruction instruction: getInstructions()) {
            int curLine = document.getLineNumber(instruction.getTextOffset());
            if (curLine >= line) {
                return instruction.getOffset();
            }
        }
        return -1;
    }

    private Map<String, SmaliLabelImpl> getLabelMap() {
        if (labelMap == null) {
            labelMap = Maps.newHashMap();
            for (SmaliLabelImpl label: findChildrenByClass(SmaliLabelImpl.class)) {
                labelMap.put(label.getText(), label);
            }
        }
        return labelMap;
    }

    @Nullable public SmaliLabelImpl getLabel(String name) {
        // TODO: how to handle duplicate labels
        return getLabelMap().get(name);
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

    @NotNull @Override public SmaliParameterList getParameterList() {
        PsiElement methodPrototype = findChildByType(ElementTypes.METHOD_PROTOTYPE);
        assert methodPrototype != null;

        ASTNode paramListNode = methodPrototype.getNode().findChildByType(ElementTypes.METHOD_PARAM_LIST);
        assert paramListNode != null;

        return (SmaliParameterList)paramListNode.getPsi();
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
        return MethodSignatureBackedByPsiMethod.create(this, substitutor);
    }

    @Nullable @Override public PsiIdentifier getNameIdentifier() {
        PsiElement element = findChildByType(ElementTypes.MEMBER_NAME);
        assert element != null;
        return (PsiIdentifier)element;
    }

    @NotNull @Override public PsiMethod[] findSuperMethods() {
        return PsiSuperMethodImplUtil.findSuperMethods(this);
    }

    @NotNull @Override public PsiMethod[] findSuperMethods(boolean checkAccess) {
        return PsiSuperMethodImplUtil.findSuperMethods(this, checkAccess);
    }

    @NotNull @Override public PsiMethod[] findSuperMethods(PsiClass parentClass) {
        return PsiSuperMethodImplUtil.findSuperMethods(this, parentClass);
    }

    @NotNull @Override
    public List<MethodSignatureBackedByPsiMethod> findSuperMethodSignaturesIncludingStatic(boolean checkAccess) {
        return PsiSuperMethodImplUtil.findSuperMethodSignaturesIncludingStatic(this, checkAccess);
    }

    @Nullable @Override public PsiMethod findDeepestSuperMethod() {
        final PsiMethod[] methods = findDeepestSuperMethods();
        if (methods.length == 0) {
            return null;
        }
        return methods[0];
    }

    @NotNull @Override public PsiMethod[] findDeepestSuperMethods() {
        return PsiSuperMethodImplUtil.findDeepestSuperMethods(this);
    }

    @NotNull @Override public SmaliModifierList getModifierList() {
        SmaliModifierList modifierList = (SmaliModifierList)findChildByType(ElementTypes.MODIFIER_LIST);
        assert modifierList != null;
        return modifierList;
    }

    @Override public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        return null;
    }

    @NotNull @Override public HierarchicalMethodSignature getHierarchicalMethodSignature() {
        return PsiSuperMethodImplUtil.getHierarchicalMethodSignature(this);
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

    @NotNull @Override public Method getDexlib2Method() {
        if (dexlib2Method == null) {
            dexlib2Method = new SmalideaMethod();
        }
        return dexlib2Method;
    }

    private class SmalideaMethod extends BaseMethodReference implements Method {
        @Nonnull @Override public String getDefiningClass() {
            PsiClass cls = getContainingClass();
            assert cls != null;
            return cls.getText();
        }

        @Nonnull @Override public List<? extends MethodParameter> getParameters() {
            SmaliParameter[] parameters = getParameterList().getParameters();

            return Lists.transform(Arrays.asList(parameters), new Function<SmaliParameter, MethodParameter>() {
                @Nullable @Override
                public MethodParameter apply(@Nullable SmaliParameter smaliParameter) {
                    if (smaliParameter == null) {
                        return null;
                    }
                    return smaliParameter.getDexlib2MethodParameter();
                }
            });
        }

        @Override public int getAccessFlags() {
            return getModifierList().getAccessFlags();
        }

        @Nonnull @Override public Set<? extends Annotation> getAnnotations() {
            // TODO: implement this
            return ImmutableSet.of();
        }

        @Nullable @Override public MethodImplementation getImplementation() {
            List<SmaliInstruction> instructions = getInstructions();
            if (instructions.size() == 0) {
                return null;
            }

            // TODO: cache this?
            return new MethodImplementation() {
                @Override public int getRegisterCount() {
                    SmaliRegistersSpec registersSpec = (SmaliRegistersSpec)findChildByType(ElementTypes.REGISTERS_SPEC);
                    if (registersSpec != null) {
                        if (registersSpec.isLocals()) {
                            int locals = registersSpec.getRegistersCount();
                            return locals + MethodUtil.getParameterRegisterCount(SmalideaMethod.this);
                        } else {
                            return registersSpec.getRegistersCount();
                        }
                    }
                    return 0;
                }

                @Nonnull @Override public Iterable<? extends Instruction> getInstructions() {
                    return Lists.transform(SmaliMethodImpl.this.getInstructions(),
                            new Function<SmaliInstruction, Instruction>() {
                        @javax.annotation.Nullable @Override
                        public Instruction apply(@javax.annotation.Nullable SmaliInstruction smaliInstruction) {
                            if (smaliInstruction == null) {
                                return null;
                            }
                            return smaliInstruction.getDexlib2Instruction();
                        }
                    });
                }

                @Nonnull @Override public List<? extends TryBlock<? extends ExceptionHandler>> getTryBlocks() {
                    return null;
                }

                @Nonnull @Override public Iterable<? extends DebugItem> getDebugItems() {
                    return null;
                }
            };
        }

        @Nonnull @Override public String getName() {
            return SmaliMethodImpl.this.getName();
        }

        @Nonnull @Override public List<? extends CharSequence> getParameterTypes() {
            PsiParameter[] parameters = getParameterList().getParameters();

            return Lists.transform(Arrays.asList(parameters), new Function<PsiParameter, CharSequence>() {
                @Nullable @Override
                public CharSequence apply(@Nullable PsiParameter psiParameter) {
                    if (psiParameter == null) {
                        return null;
                    }
                    return psiParameter.getText();
                }
            });
        }

        @Nonnull @Override public String getReturnType() {
            PsiTypeElement element = SmaliMethodImpl.this.getReturnTypeElement();
            assert element != null;
            return element.getText();
        }
    }
}
