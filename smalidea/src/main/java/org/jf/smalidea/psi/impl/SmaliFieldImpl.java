/*
 * Copyright 2014, Google Inc.
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

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.*;
import com.intellij.psi.PsiModifier.ModifierConstant;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliField;
import org.jf.smalidea.psi.iface.SmaliModifierList;
import org.jf.smalidea.psi.iface.SmaliTypeElement;
import org.jf.smalidea.psi.stub.SmaliFieldStub;
import org.jf.smalidea.psi.stub.element.SmaliFieldElementType;

import javax.annotation.Nonnull;

public class SmaliFieldImpl extends StubBasedPsiElementBase<SmaliFieldStub>
        implements SmaliField, StubBasedPsiElement<SmaliFieldStub> {
    public SmaliFieldImpl(@NotNull ASTNode node) {
        super(node);
    }

    public SmaliFieldImpl(@NotNull SmaliFieldStub stub) {
        super(stub, SmaliFieldElementType.INSTANCE);
    }

    @Nonnull @Override public String getName() {
        SmaliFieldStub stub = getStub();
        if (stub != null) {
            return stub.getName();
        }

        PsiElement name = findChildByType(ElementTypes.MEMBER_NAME);
        if (name != null) {
            return name.getText();
        }
        return "";
    }

    @Override public int getAccessFlags() {
        SmaliFieldStub stub = getStub();
        if (stub != null) {
            return stub.getAccessFlags();
        }

        SmaliModifierList modifierList = getModifierList();
        if (modifierList != null) {
            return modifierList.getAccessFlags();
        }
        return 0;
    }

    @Nullable @Override public SmaliModifierList getModifierList() {
        return (SmaliModifierList)findChildByType(ElementTypes.MODIFIER_LIST);
    }

    @Override public void setInitializer(@Nullable PsiExpression initializer) throws IncorrectOperationException {

    }

    @NotNull @Override public PsiIdentifier getNameIdentifier() {
        PsiElement element = findChildByType(ElementTypes.MEMBER_NAME);
        assert element != null;
        return (PsiIdentifier)element;
    }

    @Nullable @Override public PsiDocComment getDocComment() {
        return null;
    }

    @Override public boolean isDeprecated() {
        return false;
    }

    @Nullable @Override public PsiClass getContainingClass() {
        return (PsiClass)getParent();
    }

    @NotNull @Override public PsiType getType() {
        SmaliFieldStub stub = getStub();
        if (stub != null) {
            String type = stub.getType();
            PsiElementFactory factory = JavaPsiFacade.getInstance(getProject()).getElementFactory();
            return factory.createTypeByFQClassName(type, getResolveScope());
        } else {
            PsiTypeElement typeElement = getTypeElement();
            if (typeElement != null) {
                return getTypeElement().getType();
            }
        }

        return PsiType.getJavaLangObject(getManager(), getResolveScope());
    }

    @Nullable @Override public PsiTypeElement getTypeElement() {
        return findChildByClass(SmaliTypeElement.class);
    }

    @Nullable @Override public PsiExpression getInitializer() {
        return null;
    }

    @Override public boolean hasInitializer() {
        return false;
    }

    @Override public void normalizeDeclaration() throws IncorrectOperationException {

    }

    @Nullable @Override public Object computeConstantValue() {
        return null;
    }

    @Override public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        return null;
    }

    @Override public boolean hasModifierProperty(@ModifierConstant @NonNls @NotNull String name) {
        SmaliModifierList modifierList = getModifierList();
        if (modifierList != null) {
            return getModifierList().hasModifierProperty(name);
        }
        return false;
    }

    @Nullable @Override public ASTNode getAccessFlagsNode() {
        PsiElement accessFlagsElement = findChildByType(ElementTypes.ACCESS_LIST);
        if (accessFlagsElement == null) {
            return null;
        }
        return accessFlagsElement.getNode();
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
