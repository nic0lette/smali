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

import com.intellij.debugger.SourcePosition;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.util.Computable;
import com.intellij.psi.*;
import com.intellij.psi.javadoc.PsiDocComment;
import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.util.MethodSignature;
import com.intellij.psi.util.MethodSignatureBackedByPsiMethod;
import com.intellij.util.IncorrectOperationException;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliInstruction;
import org.jf.smalidea.psi.iface.SmaliMethod;
import org.jf.smalidea.psi.iface.SmaliRegistersSpec;
import org.jf.smalidea.psi.stub.SmaliMethodStub;

import java.util.List;

public class SmaliMethodImpl extends StubBasedPsiElementBase<SmaliMethodStub>
        implements SmaliMethod, StubBasedPsiElement<SmaliMethodStub> {
    public SmaliMethodImpl(@NotNull ASTNode node) {
        super(node);
    }

    public SmaliMethodImpl(@NotNull SmaliMethodStub stub, @NotNull IStubElementType nodeType) {
        super(stub, nodeType);
    }

    public String getMethodNameAndProto() {
        String name = getName();
        String proto = getProto();
        if (name != null && proto != null) {
           return name + proto;
        }
        return null;
    }

    public String getName() {
        ASTNode nameElement = getNode().findChildByType(ElementTypes.METHOD_NAME);
        if (nameElement != null) {
            return nameElement.getText();
        }
        return null;
    }

    public String getProto() {
        ASTNode protoElement = getNode().findChildByType(ElementTypes.METHOD_PROTOTYPE);
        if (protoElement != null) {
            return protoElement.getText();
        }
        return null;
    }


    public int getRegisters() {
        PsiElement element = findChildByType(ElementTypes.REGISTERS_SPEC);
        if (element != null) {
            return ((SmaliRegistersSpec)element).getRegistersCount();
            //TODO: correctly process .locals directive
        }
        return -1;
    }

    public SourcePosition getSourcePositionForAddress(int address) {
        SmaliInstruction[] instructions = findChildrenByType(ElementTypes.INSTRUCTION, SmaliInstruction.class);

        address *= 2;

        int curAddress = 0;
        for (SmaliInstruction instruction: instructions) {
            if (curAddress >= address) {
                return SourcePosition.createFromElement(instruction);
            }
            curAddress += instruction.getOpcode().format.size;
            //TODO: add support for variable size instructions
        }
        return null;
    }

    public int getAddressForLine(int line) {
        SmaliInstruction[] instructions = findChildrenByType(ElementTypes.INSTRUCTION, SmaliInstruction.class);
        PsiDocumentManager documentManager = PsiDocumentManager.getInstance(getProject());
        final Document document = documentManager.getDocument(getContainingFile());

        int curAddress = 0;
        int prevAddress = 0;
        for (final SmaliInstruction instruction: instructions) {
            prevAddress = curAddress;
            curAddress += instruction.getOpcode().format.size;

            int curLine = document.getLineNumber(instruction.getTextOffset());
            if (curLine >= line) {
                return prevAddress;
            }
            //TODO: add support for variable size instructions
        }
        return -1;
    }
}
