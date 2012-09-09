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

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.util.Pair;
import com.intellij.psi.*;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.SmaliTokens;
import org.jf.smalidea.psi.iface.SmaliClass;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.stub.SmaliClassStub;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SmaliClassImpl extends StubBasedPsiElementBase<SmaliClassStub>
        implements SmaliClass, StubBasedPsiElement<SmaliClassStub>, ItemPresentation {
    private String qualifiedName;
    private String shortName;


    public SmaliClassImpl(@NotNull ASTNode node) {
        super(node);
        ASTNode classDeclNode = node.findChildByType(ElementTypes.CLASS_SPEC);
        ASTNode classDescNode = classDeclNode.findChildByType(SmaliTokens.CLASS_DESCRIPTOR);
        String dalvikName = classDescNode.getText();
        qualifiedName = dalvikName.substring(1, dalvikName.length()-1).replace('/', '.');
        shortName = shortNameFromQualifiedName(qualifiedName);
    }

    public SmaliClassImpl(@NotNull SmaliClassStub stub, @NotNull IStubElementType nodeType) {
        super(stub, nodeType);
        qualifiedName = stub.getQualifiedName();
        shortName = shortNameFromQualifiedName(qualifiedName);
    }

    public static String shortNameFromQualifiedName(String qualifiedName) {
        int index = qualifiedName.lastIndexOf('.');
        if (index == -1) {
            return qualifiedName;
        }
        return qualifiedName.substring(index+1);
    }

    public String getQualifiedName() {
        return qualifiedName;
    }

    @Override
    public ItemPresentation getPresentation() {
        return this;
    }

    public String getName() {
        return shortName;
    }

    public boolean isInterface() {
        return false;
    }

    public boolean isAnnotationType() {
        return false;
    }

    public boolean isEnum() {
        return false;
    }

    public PsiReferenceList getExtendsList() {
        return null;
    }

    public PsiReferenceList getImplementsList() {
        return null;
    }

    @NotNull
    public PsiClassType[] getExtendsListTypes() {
        return new PsiClassType[0];
    }

    @NotNull
    public PsiClassType[] getImplementsListTypes() {
        return new PsiClassType[0];
    }

    public PsiClass getSuperClass() {
        return null;
    }

    public PsiClass[] getInterfaces() {
        return new PsiClass[0];
    }

    @NotNull
    public PsiClass[] getSupers() {
        return new PsiClass[0];
    }

    @NotNull
    public PsiClassType[] getSuperTypes() {
        return new PsiClassType[0];
    }

    @NotNull
    public PsiField[] getFields() {
        return new PsiField[0];
    }

    @NotNull
    public PsiMethod[] getMethods() {
        return new PsiMethod[0];
    }

    @NotNull
    public PsiMethod[] getConstructors() {
        return new PsiMethod[0];
    }

    @NotNull
    public PsiClass[] getInnerClasses() {
        return new PsiClass[0];
    }

    @NotNull
    public PsiClassInitializer[] getInitializers() {
        return new PsiClassInitializer[0];
    }

    @NotNull
    public PsiField[] getAllFields() {
        return new PsiField[0];
    }

    @NotNull
    public PsiMethod[] getAllMethods() {
        return new PsiMethod[0];
    }

    @NotNull
    public PsiClass[] getAllInnerClasses() {
        return new PsiClass[0];
    }

    public PsiField findFieldByName(@NonNls String name, boolean checkBases) {
        return null;
    }

    public PsiMethod findMethodBySignature(PsiMethod patternMethod, boolean checkBases) {
        return null;
    }

    @NotNull
    public PsiMethod[] findMethodsBySignature(PsiMethod patternMethod, boolean checkBases) {
        return new PsiMethod[0];
    }

    @NotNull
    public PsiMethod[] findMethodsByName(@NonNls String name, boolean checkBases) {
        return new PsiMethod[0];
    }

    @NotNull
    public List<Pair<PsiMethod, PsiSubstitutor>> findMethodsAndTheirSubstitutorsByName(@NonNls String name, boolean checkBases) {
        return new ArrayList<Pair<PsiMethod, PsiSubstitutor>>(0);
    }

    @NotNull
    public List<Pair<PsiMethod, PsiSubstitutor>> getAllMethodsAndTheirSubstitutors() {
        return new ArrayList<Pair<PsiMethod, PsiSubstitutor>>(0);
    }

    public PsiClass findInnerClassByName(@NonNls String name, boolean checkBases) {
        return null;
    }

    public PsiElement getLBrace() {
        return null;
    }

    public PsiElement getRBrace() {
        return null;
    }

    public PsiIdentifier getNameIdentifier() {
        return null;
    }

    public PsiElement getScope() {
        return null;
    }

    public boolean isInheritor(@NotNull PsiClass baseClass, boolean checkDeep) {
        return false;
    }

    public boolean isInheritorDeep(PsiClass baseClass, @Nullable PsiClass classToByPass) {
        return false;
    }

    public PsiClass getContainingClass() {
        return null;
    }

    @NotNull
    public Collection<HierarchicalMethodSignature> getVisibleSignatures() {
        return new ArrayList<HierarchicalMethodSignature>(0);
    }

    public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
        return null;
    }

    public PsiDocComment getDocComment() {
        return null;
    }

    public boolean isDeprecated() {
        return false;
    }

    public boolean hasTypeParameters() {
        return false;
    }

    public PsiTypeParameterList getTypeParameterList() {
        return null;
    }

    @NotNull
    public PsiTypeParameter[] getTypeParameters() {
        return new PsiTypeParameter[0];
    }

    public PsiModifierList getModifierList() {
        return null;
    }

    public boolean hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull String name) {
        return false;
    }

    public String getPresentableText() {
        return getQualifiedName();
    }

    public String getLocationString() {
        return null;
    }

    public Icon getIcon(boolean open) {
        return null;
    }
}
