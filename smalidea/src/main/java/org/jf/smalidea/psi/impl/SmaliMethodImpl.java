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

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.psi.*;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.util.MethodSignature;
import com.intellij.psi.util.MethodSignatureBackedByPsiMethod;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliMethod;
import org.jf.smalidea.psi.stub.SmaliMethodStub;

import java.util.List;

public class SmaliMethodImpl extends StubBasedPsiElementBase<SmaliMethodStub>
        implements SmaliMethod, StubBasedPsiElement<SmaliMethodStub> {
    private String nameAndProto;

    public SmaliMethodImpl(@NotNull ASTNode node) {
        super(node);
        ASTNode nameElement = node.findChildByType(ElementTypes.METHOD_NAME);
        ASTNode protoElement = node.findChildByType(ElementTypes.METHOD_PROTOTYPE);
        this.nameAndProto = nameElement.getText() + protoElement.getText();
    }

    public SmaliMethodImpl(@NotNull SmaliMethodStub stub, @NotNull IStubElementType nodeType) {
        super(stub, nodeType);
        this.nameAndProto = stub.getNameAndProto();
    }

    public String getMethodNameAndProto() {
        return nameAndProto;
    }
}
