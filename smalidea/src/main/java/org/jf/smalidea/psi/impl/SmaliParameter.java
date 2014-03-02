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

import com.google.common.collect.ImmutableSet;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.*;
import com.intellij.psi.PsiModifier.ModifierConstant;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.dexlib2.base.BaseMethodParameter;
import org.jf.dexlib2.iface.Annotation;
import org.jf.dexlib2.iface.MethodParameter;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliModifierList;
import org.jf.smalidea.psi.iface.SmaliTypeElement;

import javax.annotation.Nonnull;
import java.util.Set;

public class SmaliParameter extends ASTWrapperPsiElement implements PsiParameter, PsiAnnotationOwner {
    public SmaliParameter(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable @Override public PsiModifierList getModifierList() {
        SmaliModifierList modifierList = (SmaliModifierList)findChildByType(ElementTypes.MODIFIER_LIST);
        assert modifierList != null;
        return modifierList;
    }

    @NotNull @Override public PsiElement getDeclarationScope() {
        PsiElement paramList = getParent();
        assert paramList != null;

        PsiElement methodPrototype = getParent();
        assert methodPrototype != null;

        PsiElement method = paramList.getParent();
        assert method != null;

        return method;
    }

    @Override public boolean isVarArgs() {
        return false;
    }

    @Nullable @Override public PsiTypeElement getTypeElement() {
        return findChildByClass(SmaliTypeElement.class);
    }

    @NotNull @Override public PsiType getType() {
        PsiTypeElement typeElement = getTypeElement();
        if (typeElement == null) {
            return PsiType.getJavaLangObject(getManager(), getResolveScope());
        }
        return typeElement.getType();
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

    @Nullable @Override public PsiIdentifier getNameIdentifier() {
        return null;
    }

    @Override public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        return null;
    }

    @Override public boolean hasModifierProperty(@ModifierConstant @NonNls @NotNull String name) {
        return false;
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

    @Nonnull public MethodParameter getDexlib2MethodParameter() {
        return new BaseMethodParameter() {
            @Nonnull @Override public Set<? extends Annotation> getAnnotations() {
                // TODO: implement this
                return ImmutableSet.of();
            }

            @Nullable @Override public String getName() {
                return SmaliParameter.this.getName();
            }

            @Nonnull @Override public String getType() {
                PsiTypeElement typeElement = SmaliParameter.this.getTypeElement();
                assert typeElement != null;
                return typeElement.getText();
            }
        };
    }
}
