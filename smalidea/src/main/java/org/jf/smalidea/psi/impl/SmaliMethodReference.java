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

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.impl.light.LightMethodBuilder;
import com.intellij.psi.impl.light.LightModifierList;
import com.intellij.psi.impl.light.LightParameter;
import com.intellij.psi.impl.light.LightParameterListBuilder;
import com.intellij.util.ArrayUtil;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.SmaliLanguage;
import org.jf.smalidea.psi.ElementTypes;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.List;

public class SmaliMethodReference extends ASTWrapperPsiElement implements PsiReference {
    public SmaliMethodReference(@NotNull ASTNode node) {
        super(node);
    }

    @Override public String getName() {
        PsiElement memberName = getMemberName();
        if (memberName == null) {
            return null;
        }
        return memberName.getText();
    }

    @Override public PsiReference getReference() {
        return this;
    }

    @Override public PsiElement getElement() {
        return this;
    }

    @Override public TextRange getRangeInElement() {
        return new TextRange(0, getTextLength());
    }

    @Nullable
    public PsiClass getContainingClass() {
        SmaliClassTypeElementImpl containingClassReference = findChildByClass(SmaliClassTypeElementImpl.class);
        if (containingClassReference == null) {
            return null;
        }
        PsiClass containingClass = containingClassReference.resolve();
        if (containingClass == null) {
            return null;
        }

        return containingClass;
    }

    @Nullable
    public SmaliMemberName getMemberName() {
        return findChildByClass(SmaliMemberName.class);
    }

    @Nonnull
    public List<PsiType> getParameterTypes() {
        PsiElement prototype = findChildByType(ElementTypes.METHOD_PROTOTYPE);
        if (prototype == null) {
            return null;
        }

        ASTNode paramListNode = prototype.getNode().findChildByType(ElementTypes.METHOD_REF_PARAM_LIST);
        if (paramListNode == null) {
            return null;
        }

        ASTNode[] types = paramListNode.getChildren(ElementTypes.NONVOID_TYPE_TOKENS);

        return Lists.transform(Arrays.asList(types), new Function<ASTNode, PsiType>() {
            @Nullable @Override public PsiType apply(@javax.annotation.Nullable ASTNode typeNode) {
                if (typeNode == null) {
                    return null;
                }
                PsiElement typeElement = typeNode.getPsi();
                if (typeElement instanceof SmaliPrimitiveTypeElementImpl) {
                    return ((SmaliPrimitiveTypeElementImpl)typeElement).getType();
                } else if (typeElement instanceof SmaliClassTypeElementImpl) {
                    return ((SmaliClassTypeElementImpl)typeElement).getType();
                } else {
                    PsiElementFactory factory = JavaPsiFacade.getInstance(getProject()).getElementFactory();
                    // TODO: handle array types
                    PsiType psiType = factory.createPrimitiveType("int");
                    assert psiType != null;
                    return psiType;
                }
            }
        });
    }

    @Nullable
    public ASTNode getReturnType() {
        PsiElement prototype = findChildByType(ElementTypes.METHOD_PROTOTYPE);
        if (prototype == null) {
            return null;
        }

        return prototype.getNode().findChildByType(ElementTypes.VOID_TYPE_TOKENS);
    }

    @Nullable @Override public PsiElement resolve() {
        PsiClass containingClass = getContainingClass();
        if (containingClass == null) {
            return null;
        }

        SmaliMemberName memberName = getMemberName();
        if (memberName == null) {
            return null;
        }

        LightParameterListBuilder paramList = new LightParameterListBuilder(getManager(), SmaliLanguage.INSTANCE);
        PsiElement prototype = findChildByType(ElementTypes.METHOD_PROTOTYPE);

        for (PsiType type: getParameterTypes()) {
            paramList.addParameter(new LightParameter("", type, prototype, SmaliLanguage.INSTANCE));
        }

        LightMethodBuilder pattern = new LightMethodBuilder(getManager(), SmaliLanguage.INSTANCE,
                memberName.getText(), paramList, new LightModifierList(getManager(), SmaliLanguage.INSTANCE));

        // TODO: what about static constructor?
        pattern.setConstructor(memberName.getText().equals("<init>"));

        return containingClass.findMethodBySignature(pattern, true);
    }

    @NotNull @Override public String getCanonicalText() {
        return getText();
    }

    @Override public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        //TODO: implement this
        throw new IncorrectOperationException();
    }

    @Override public PsiElement bindToElement(@NotNull PsiElement element) throws IncorrectOperationException {
        //TODO: implement this
        throw new IncorrectOperationException();
    }

    @Override public boolean isReferenceTo(PsiElement element) {
        return resolve() == element;
    }

    @NotNull @Override public Object[] getVariants() {
        return ArrayUtil.EMPTY_OBJECT_ARRAY;
    }

    @Override public boolean isSoft() {
        return false;
    }
}
