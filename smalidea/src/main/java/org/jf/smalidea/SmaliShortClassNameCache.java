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

package org.jf.smalidea;

import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiField;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.impl.PsiManagerEx;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiShortNamesCache;
import com.intellij.util.ArrayUtil;
import com.intellij.util.Processor;
import com.intellij.util.containers.HashSet;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.psi.iface.SmaliClass;
import org.jf.smalidea.psi.index.SmaliClassNameIndex;

import java.util.Collection;

public class SmaliShortClassNameCache extends PsiShortNamesCache {
    private final PsiManagerEx manager;

    public SmaliShortClassNameCache(PsiManagerEx manager) {
        this.manager = manager;
    }

    @NotNull
    @Override
    public PsiClass[] getClassesByName(@NotNull @NonNls String name, @NotNull GlobalSearchScope scope) {
        Collection<SmaliClass> classes = SmaliClassNameIndex.INSTANCE.get(name, manager.getProject(), scope);
        PsiClass[] classesArray = new PsiClass[classes.size()];
        return classes.toArray(classesArray);
    }

    @NotNull
    @Override
    public String[] getAllClassNames() {
        final Collection<String> names = SmaliClassNameIndex.INSTANCE.getAllKeys(manager.getProject());
        return ArrayUtil.toStringArray(names);
    }

    @Override
    public void getAllClassNames(@NotNull HashSet<String> dest) {
        dest.addAll(SmaliClassNameIndex.INSTANCE.getAllKeys(manager.getProject()));
    }

    @NotNull
    @Override
    public PsiMethod[] getMethodsByName(@NonNls @NotNull String name, @NotNull GlobalSearchScope scope) {
        return new PsiMethod[0];
    }

    @NotNull
    @Override
    public PsiMethod[] getMethodsByNameIfNotMoreThan(@NonNls @NotNull String name, @NotNull GlobalSearchScope scope, int maxCount) {
        return new PsiMethod[0];
    }

    @Override
    public boolean processMethodsWithName(@NonNls @NotNull String name, @NotNull GlobalSearchScope scope, @NotNull Processor<PsiMethod> processor) {
        return false;
    }

    @NotNull
    @Override
    public String[] getAllMethodNames() {
        return new String[0];
    }

    @Override
    public void getAllMethodNames(@NotNull HashSet<String> set) {
    }

    @NotNull
    @Override
    public PsiField[] getFieldsByName(@NotNull @NonNls String name, @NotNull GlobalSearchScope scope) {
        return new PsiField[0];
    }

    @NotNull
    @Override
    public String[] getAllFieldNames() {
        return new String[0];
    }

    @Override
    public void getAllFieldNames(@NotNull HashSet<String> set) {
    }
}
