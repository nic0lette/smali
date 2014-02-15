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
import com.intellij.psi.impl.source.tree.CompositeElement;
import com.intellij.psi.impl.source.tree.Factory;
import com.intellij.psi.impl.source.tree.TreeElement;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.dexlib2.AccessFlags;
import org.jf.smalidea.SmaliTokens;
import org.jf.smalidea.psi.iface.SmaliAccessFlagsOwner;
import org.jf.smalidea.psi.iface.SmaliModifierList;
import org.jf.smalidea.psi.stub.SmaliModifierListStub;
import org.jf.smalidea.psi.stub.element.SmaliModifierListElementType;

import javax.annotation.Nonnull;

public class SmaliModifierListImpl extends StubBasedPsiElementBase<SmaliModifierListStub>
        implements SmaliModifierList, StubBasedPsiElement<SmaliModifierListStub> {
    public SmaliModifierListImpl(@NotNull ASTNode node) {
        super(node);
    }

    public SmaliModifierListImpl(@NotNull SmaliModifierListStub stub) {
        super(stub, SmaliModifierListElementType.INSTANCE);
    }

    @Override public boolean hasModifierProperty(@ModifierConstant @NotNull @NonNls String name) {
        return hasExplicitModifier(name);
    }

    private ASTNode findAccessListNode() {
        return ((SmaliAccessFlagsOwner)getParent()).getAccessFlagsNode();
    }

    @Override public boolean hasExplicitModifier(@ModifierConstant @NotNull @NonNls String name) {
        SmaliModifierListStub stub = getStub();
        if (stub != null) {
            AccessFlags flag = AccessFlags.getAccessFlag(name);
            if (flag == null) {
                return false;
            }
            return (stub.getAccessFlags() & flag.getValue()) != 0;
        }

        ASTNode accessListNode = findAccessListNode();
        if (accessListNode == null) {
            return false;
        }

        for (ASTNode accessSpecNode: accessListNode.getChildren(TokenSet.create(SmaliTokens.ACCESS_SPEC))) {
            if (accessSpecNode.getText().equals(name)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void setModifierProperty(@ModifierConstant @NotNull @NonNls String name, boolean addModifier)
            throws IncorrectOperationException {
        if (addModifier) {
            ASTNode accessListNode = findAccessListNode();
            if (accessListNode == null) {
                // TODO: create access list...
                return;
            }
            TreeElement leaf = Factory.createSingleLeafElement(SmaliTokens.ACCESS_SPEC, name, null, getManager());
            ((CompositeElement)accessListNode).addInternal(leaf, leaf, null, null);
        } else {
            ASTNode accessListNode = findAccessListNode();
            if (accessListNode == null) {
                return;
            }

            for (PsiElement accessSpec: findChildrenByType(SmaliTokens.ACCESS_SPEC)) {
                if (accessSpec.getText().equals(name)) {
                    accessSpec.delete();
                }
            }
        }
    }

    public int getAccessFlags() {
        SmaliModifierListStub stub = getStub();
        if (stub != null) {
            return stub.getAccessFlags();
        }

        ASTNode accessListNode = findAccessListNode();
        if (accessListNode == null) {
            return 0;
        }

        int flags = 0;
        for (ASTNode accessSpecNode: accessListNode.getChildren(TokenSet.create(SmaliTokens.ACCESS_SPEC))) {
            AccessFlags flag = AccessFlags.getAccessFlag(accessSpecNode.getText());
            if (flag != null) {
                flags |= flag.getValue();
            }
        }

        return flags;
    }

    @Override
    public void checkSetModifierProperty(@ModifierConstant @NotNull @NonNls String name, boolean value)
            throws IncorrectOperationException {
    }

    @Nonnull
    private PsiAnnotationOwner getParentForAnnotations() {
        PsiAnnotationOwner parent = (PsiAnnotationOwner)getStubOrPsiParentOfType(PsiModifierListOwner.class);
        assert parent != null;
        return parent;
    }

    @NotNull @Override public PsiAnnotation[] getAnnotations() {
        return getParentForAnnotations().getAnnotations();
    }

    @NotNull @Override public PsiAnnotation[] getApplicableAnnotations() {
        return getParentForAnnotations().getApplicableAnnotations();
    }

    @Nullable @Override public PsiAnnotation findAnnotation(@NotNull @NonNls String qualifiedName) {
        return getParentForAnnotations().findAnnotation(qualifiedName);
    }

    @NotNull @Override public PsiAnnotation addAnnotation(@NotNull @NonNls String qualifiedName) {
        return getParentForAnnotations().addAnnotation(qualifiedName);
    }
}
