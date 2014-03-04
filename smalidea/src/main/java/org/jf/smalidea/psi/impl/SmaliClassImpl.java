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

import com.google.common.collect.Lists;
import com.intellij.debugger.SourcePosition;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.openapi.util.Pair;
import com.intellij.psi.*;
import com.intellij.psi.PsiModifier.ModifierConstant;
import com.intellij.psi.impl.PsiClassImplUtil;
import com.intellij.psi.impl.PsiClassImplUtil.MemberType;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.scope.PsiScopeProcessor;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.util.PsiUtil;
import com.intellij.util.IncorrectOperationException;
import com.sun.jdi.Location;
import com.sun.jdi.Method;
import com.sun.jdi.ReferenceType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.SmaliIcons;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.*;
import org.jf.smalidea.psi.stub.SmaliClassStub;
import org.jf.smalidea.util.NameUtils;

import javax.annotation.Nonnull;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SmaliClassImpl extends StubBasedPsiElementBase<SmaliClassStub>
        implements SmaliClass, StubBasedPsiElement<SmaliClassStub>, ItemPresentation {
    private String name;

    @Nullable @Override public Icon getIcon(int flags) {
        return SmaliIcons.SmaliIcon;
    }

    public static SmaliClassImpl make(@NotNull ASTNode node) {
        ASTNode classDeclNode = node.findChildByType(ElementTypes.CLASS_SPEC);
        if (classDeclNode != null) {
            ASTNode classDescNode = classDeclNode.findChildByType(ElementTypes.CLASS_TYPE);
            if (classDescNode != null) {
                return new SmaliClassImpl(node, NameUtils.smaliToJavaType(classDescNode.getText()));
            }
        }
        return null;
    }


    private SmaliClassImpl(@NotNull ASTNode node, String name) {
        super(node);
        this.name = name;
    }

    public SmaliClassImpl(@NotNull SmaliClassStub stub, @NotNull IStubElementType nodeType) {
        super(stub, nodeType);
        name = stub.getName();
    }

    @NotNull
    public String getPackageName() {
        String name = getQualifiedName();
        int lastDot = name.lastIndexOf('.');
        if (lastDot < 0) {
            return "";
        }
        return name.substring(0, lastDot);
    }

    @Nullable
    public static String shortNameFromQualifiedName(@Nullable String qualifiedName) {
        if (qualifiedName == null) {
            return null;
        }

        int index = qualifiedName.lastIndexOf('.');
        if (index == -1) {
            return qualifiedName;
        }
        return qualifiedName.substring(index+1);
    }

    public Location getLocationForSourcePosition(ReferenceType type, SourcePosition position) {
        SmaliMethod[] smaliMethods = findChildrenByType(ElementTypes.METHOD, SmaliMethod.class);

        for (SmaliMethod smaliMethod: smaliMethods) {
            //TODO: check the start line+end line of the method
            int offset = smaliMethod.getOffsetForLine(position.getLine());
            if (offset != -1) {
                List<Method> methods = type.methodsByName(smaliMethod.getName(), smaliMethod.getProto());
                if (methods.size() > 0) {
                    return methods.get(0).locationOfCodeIndex(offset/2);
                }
            }
        }
        return null;
    }

    @Override
    public ItemPresentation getPresentation() {
        return this;
    }

    @Nonnull
    public String getName() {
        int lastDot = name.lastIndexOf('.');
        if (lastDot < 0) {
            return name;
        }
        return name.substring(lastDot+1);
    }

    @Nonnull
    public String getQualifiedName() {
        return name;
    }

    public boolean isInterface() {
        SmaliModifierList modifierList = getModifierList();
        if (modifierList == null) {
            return false;
        }
        return modifierList.hasModifierProperty("interface");
    }

    public boolean isAnnotationType() {
        SmaliModifierList modifierList = getModifierList();
        if (modifierList == null) {
            return false;
        }
        return modifierList.hasModifierProperty("annotation");
    }

    public boolean isEnum() {
        SmaliModifierList modifierList = getModifierList();
        if (modifierList == null) {
            return false;
        }
        return modifierList.hasModifierProperty("enum");
    }

    public SmaliReferenceList getExtendsList() {
        return (SmaliReferenceList)findChildByType(ElementTypes.EXTENDS_LIST);
    }

    public SmaliReferenceList getImplementsList() {
        return (SmaliReferenceList)findChildByType(ElementTypes.IMPLEMENTS_LIST);
    }

    @NotNull
    public PsiClassType[] getExtendsListTypes() {
        SmaliReferenceList extendsList = getExtendsList();
        if (extendsList == null) {
            return PsiClassType.EMPTY_ARRAY;
        }
        return extendsList.getReferencedTypes();
    }

    @NotNull
    public PsiClassType[] getImplementsListTypes() {
        SmaliReferenceList implementsList = getImplementsList();
        if (implementsList == null) {
            return PsiClassType.EMPTY_ARRAY;
        }
        return implementsList.getReferencedTypes();
    }

    public PsiClassType getSuperClassType() {
        PsiElement parent = getParent();

        ASTNode superSpec = parent.getNode().findChildByType(ElementTypes.SUPER_SPEC);

        if (superSpec != null) {
            ASTNode superType = superSpec.findChildByType(ElementTypes.CLASS_TYPE);
            if (superType != null) {
                return ((SmaliClassTypeElementImpl)superType).getType();
            }
        }

        if (isEnum()) {
            PsiElementFactory factory = JavaPsiFacade.getInstance(getProject()).getElementFactory();
            return factory.createTypeByFQClassName(CommonClassNames.JAVA_LANG_ENUM, getResolveScope());
        }

        if (getQualifiedName().equals(CommonClassNames.JAVA_LANG_OBJECT)) {
            return null;
        }
        return PsiType.getJavaLangObject(getManager(), getResolveScope());
    }

    public PsiClass getSuperClass() {
        return getSuperClassType().resolve();
    }

    public PsiClass[] getInterfaces() {
        PsiClassType[] interfaceTypes;
        if (isInterface()) {
            interfaceTypes = getExtendsListTypes();
        } else {
            interfaceTypes = getImplementsListTypes();
        }

        List<PsiClass> resolvedTypes = Lists.newArrayList();

        for (PsiClassType classType: interfaceTypes) {
            PsiClass resolvedType = classType.resolve();
            if (resolvedType != null) {
                resolvedTypes.add(resolvedType);
            }
        }

        return resolvedTypes.toArray(new PsiClass[resolvedTypes.size()]);
    }

    @NotNull
    public PsiClass[] getSupers() {
        List<PsiClass> resolvedTypes = Lists.newArrayList();

        for (PsiClassType classType: getSuperTypes()) {
            PsiClass resolvedType = classType.resolve();
            if (resolvedType != null) {
                resolvedTypes.add(resolvedType);
            }
        }
        return resolvedTypes.toArray(new PsiClass[resolvedTypes.size()]);
    }

    @NotNull
    public PsiClassType[] getSuperTypes() {
        PsiClassType superclass = getSuperClassType();
        PsiClassType[] interfaces;

        if (isInterface()) {
            interfaces = getExtendsListTypes();
        } else {
            interfaces = getImplementsListTypes();
        }

        if (superclass == null) {
            return interfaces;
        }

        PsiClassType[] combined = new PsiClassType[interfaces.length + 1];
        combined[0] = superclass;
        System.arraycopy(interfaces, 0, combined, 1 , interfaces.length);
        return combined;
    }

    @NotNull
    public PsiField[] getFields() {
        return findChildrenByClass(SmaliField.class);
    }

    @NotNull
    public PsiMethod[] getMethods() {
        return findChildrenByClass(SmaliMethod.class);
    }

    @NotNull
    public PsiMethod[] getConstructors() {
        PsiMethod[] methods = getMethods();
        List<PsiMethod> constructors = Lists.newArrayList();
        for (PsiMethod method: methods) {
            if (method.isConstructor()) {
                constructors.add(method);
            }
        }
        return constructors.toArray(new PsiMethod[constructors.size()]);
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
        return PsiClassImplUtil.getAllFields(this);
    }

    @NotNull
    public PsiMethod[] getAllMethods() {
        return PsiClassImplUtil.getAllMethods(this);
    }

    @NotNull
    public PsiClass[] getAllInnerClasses() {
        return new PsiClass[0];
    }

    public PsiField findFieldByName(@NonNls String name, boolean checkBases) {
        return PsiClassImplUtil.findFieldByName(this, name, checkBases);
    }

    public PsiMethod findMethodBySignature(PsiMethod patternMethod, boolean checkBases) {
        return PsiClassImplUtil.findMethodBySignature(this, patternMethod, checkBases);
    }

    @NotNull
    public PsiMethod[] findMethodsBySignature(PsiMethod patternMethod, boolean checkBases) {
        return PsiClassImplUtil.findMethodsBySignature(this, patternMethod, checkBases);
    }

    @NotNull
    public PsiMethod[] findMethodsByName(@NonNls String name, boolean checkBases) {
        return PsiClassImplUtil.findMethodsByName(this, name, checkBases);
    }

    @NotNull
    public List<Pair<PsiMethod, PsiSubstitutor>> findMethodsAndTheirSubstitutorsByName(
            @NonNls String name, boolean checkBases) {
        return PsiClassImplUtil.findMethodsAndTheirSubstitutorsByName(this, name, checkBases);
    }

    @NotNull
    public List<Pair<PsiMethod, PsiSubstitutor>> getAllMethodsAndTheirSubstitutors() {
        return PsiClassImplUtil.getAllWithSubstitutorsByMap(this, MemberType.METHOD);
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

    @Nullable @Override public ASTNode getAccessFlagsNode() {
        PsiElement classSpecElement = findChildByType(ElementTypes.CLASS_SPEC);
        if (classSpecElement == null) {
            return null;
        }

        return classSpecElement.getNode().findChildByType(ElementTypes.ACCESS_LIST);
    }

    public SmaliModifierList getModifierList() {
        return (SmaliModifierList)findChildByType(ElementTypes.MODIFIER_LIST);
    }

    @Override public boolean hasModifierProperty(@ModifierConstant @NonNls @NotNull String name) {
        PsiModifierList modifierList = getModifierList();
        if (modifierList == null) {
            return false;
        }
        return modifierList.hasModifierProperty(name);
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

    @Override
    public boolean processDeclarations(@NotNull PsiScopeProcessor processor, @NotNull ResolveState state,
                                       PsiElement lastParent, @NotNull PsiElement place) {
        return PsiClassImplUtil.processDeclarationsInClass(this, processor, state, null, lastParent, place,
                PsiUtil.getLanguageLevel(place), false);
    }
}
