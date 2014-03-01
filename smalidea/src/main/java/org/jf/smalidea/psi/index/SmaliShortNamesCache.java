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

package org.jf.smalidea.psi.index;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiField;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.search.PsiShortNamesCache;
import com.intellij.psi.stubs.StubIndex;
import com.intellij.util.CommonProcessors;
import com.intellij.util.Processor;
import com.intellij.util.SmartList;
import com.intellij.util.containers.HashSet;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.psi.iface.SmaliClass;
import org.jf.smalidea.psi.iface.SmaliField;
import org.jf.smalidea.psi.iface.SmaliMethod;

import java.util.Collection;
import java.util.List;

public class SmaliShortNamesCache extends PsiShortNamesCache {
    private final Project project;

    public SmaliShortNamesCache(Project project) {
        this.project = project;
    }

    @NotNull @Override
    public PsiClass[] getClassesByName(@NotNull @NonNls String name, @NotNull GlobalSearchScope scope) {
        Collection<SmaliClass> classes = StubIndex.getInstance().get(SmaliShortClassNameIndex.KEY, name, project,
                new SmaliSourceFilterScope(scope));
        return classes.toArray(new SmaliClass[classes.size()]);
    }

    @NotNull @Override public String[] getAllClassNames() {
        Collection<String> names = SmaliShortClassNameIndex.INSTANCE.getAllKeys(project);
        return names.toArray(new String[names.size()]);
    }

    @Override public void getAllClassNames(@NotNull HashSet<String> dest) {
        dest.addAll(SmaliShortClassNameIndex.INSTANCE.getAllKeys(project));
    }

    @NotNull @Override
    public PsiMethod[] getMethodsByName(@NonNls @NotNull String name, @NotNull GlobalSearchScope scope) {
        Collection<SmaliMethod> methods = StubIndex.getInstance().get(SmaliShortMethodNameIndex.KEY, name, project,
                new SmaliSourceFilterScope(scope));
        return methods.toArray(new SmaliMethod[methods.size()]);
    }

    @NotNull @Override
    public PsiMethod[] getMethodsByNameIfNotMoreThan(@NonNls @NotNull String name, @NotNull GlobalSearchScope scope,
                                                     final int maxCount) {
        final List<SmaliMethod> methods = new SmartList<SmaliMethod>();
        StubIndex.getInstance().process(SmaliShortMethodNameIndex.KEY, name, project, scope,
                new CommonProcessors.CollectProcessor<SmaliMethod>(methods){
                    @Override
                    public boolean process(SmaliMethod method) {
                        if (methods.size() < maxCount) {
                            return super.process(method);
                        }
                        return false;
                    }
                });
        return methods.toArray(new SmaliMethod[methods.size()]);
    }

    @NotNull @Override
    public PsiField[] getFieldsByNameIfNotMoreThan(@NonNls @NotNull String name, @NotNull GlobalSearchScope scope,
                                                   final int maxCount) {
        final List<SmaliField> fields = new SmartList<SmaliField>();
        StubIndex.getInstance().process(SmaliShortFieldNameIndex.KEY, name, project, scope,
                new CommonProcessors.CollectProcessor<SmaliField>(fields){
                    @Override
                    public boolean process(SmaliField field) {
                        if (fields.size() < maxCount) {
                            return super.process(field);
                        }
                        return false;
                    }
                });
        return fields.toArray(new SmaliField[fields.size()]);
    }

    @Override
    public boolean processMethodsWithName(@NonNls @NotNull String name, @NotNull GlobalSearchScope scope,
                                          @NotNull Processor<PsiMethod> processor) {
        return StubIndex.getInstance().process(SmaliShortMethodNameIndex.KEY, name, project, scope, processor);
    }

    @NotNull @Override public String[] getAllMethodNames() {
        Collection<String> methods = SmaliShortMethodNameIndex.INSTANCE.getAllKeys(project);
        return methods.toArray(new String[methods.size()]);
    }

    @Override public void getAllMethodNames(@NotNull HashSet<String> set) {
        SmaliShortMethodNameIndex.INSTANCE.processAllKeys(project, new CommonProcessors.CollectProcessor<String>(set));
    }

    @NotNull @Override
    public PsiField[] getFieldsByName(@NotNull @NonNls String name, @NotNull GlobalSearchScope scope) {
        Collection<SmaliField> fields = StubIndex.getInstance().get(SmaliShortFieldNameIndex.KEY, name, project,
                new SmaliSourceFilterScope(scope));
        return fields.toArray(new SmaliField[fields.size()]);
    }

    @NotNull @Override public String[] getAllFieldNames() {
        Collection<String> fields = SmaliShortFieldNameIndex.INSTANCE.getAllKeys(project);
        return fields.toArray(new String[fields.size()]);
    }

    @Override public void getAllFieldNames(@NotNull HashSet<String> set) {
        SmaliShortFieldNameIndex.INSTANCE.processAllKeys(project, new CommonProcessors.CollectProcessor<String>(set));
    }
}
