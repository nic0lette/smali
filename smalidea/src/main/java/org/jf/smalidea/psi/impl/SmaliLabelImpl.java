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

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.psi.iface.SmaliInstruction;

public class SmaliLabelImpl extends ASTWrapperPsiElement {
    public SmaliLabelImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    public SmaliInstruction getInstruction() {
        PsiElement next = getNextSibling();
        while (true) {
            if (next == null) {
                return null;
            }
            if (next instanceof SmaliInstruction) {
                return (SmaliInstruction)next;
            }
            next = next.getNextSibling();
        }
    }

    @Nullable
    private SmaliInstruction getPreviousInstruction() {
        PsiElement prev = getPrevSibling();
        while (true) {
            if (prev == null) {
                return null;
            }
            if (prev instanceof SmaliInstruction) {
                return (SmaliInstruction)prev;
            }
            prev = prev.getPrevSibling();
        }
    }

    public int getOffset() {
        SmaliInstruction instruction = getInstruction();
        if (instruction == null) {
            instruction = getPreviousInstruction();
            if (instruction == null) {
                return 0;
            }
            // TODO: handle variable size instructions
            return instruction.getOffset() + instruction.getOpcode().format.size;
        }
        return instruction.getOffset();
    }
}
