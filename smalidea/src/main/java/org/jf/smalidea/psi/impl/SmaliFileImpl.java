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

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiClassOwner;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.SmaliFileType;
import org.jf.smalidea.SmaliLanguage;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliClass;

public class SmaliFileImpl extends PsiFileBase implements PsiClassOwner {
    public SmaliFileImpl(FileViewProvider viewProvider) {
        super(viewProvider, SmaliLanguage.INSTANCE);
    }

    @NotNull
    public FileType getFileType() {
        return SmaliFileType.INSTANCE;
    }

    @Nullable
    public SmaliClassImpl getPsiClass() {
        for (ASTNode node: getNode().getChildren(TokenSet.create(ElementTypes.SMALI_CLASS))) {
            // we can only have a single class declaration in a file
            return (SmaliClassImpl)node.getPsi();
        }
        return null;
    }

    @NotNull @Override public PsiClass[] getClasses() {
        SmaliClass cls = getPsiClass();
        if (cls == null) {
            return PsiClass.EMPTY_ARRAY;
        }
        return new PsiClass[]{cls};
    }

    @Override public String getPackageName() {
        SmaliClass cls = getPsiClass();
        if (cls == null) {
            return null;
        }
        return cls.getPackageName();
    }

    @Override public void setPackageName(String packageName) throws IncorrectOperationException {
        throw new IncorrectOperationException();
    }
}
