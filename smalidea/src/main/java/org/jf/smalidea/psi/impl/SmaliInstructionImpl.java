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
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.smalidea.SmaliTokens;
import org.jf.smalidea.psi.iface.SmaliInstruction;

import javax.annotation.Nonnull;

public class SmaliInstructionImpl extends ASTWrapperPsiElement implements SmaliInstruction {
    @Nonnull
    private Opcode opcode;
    private int offset = -1;

    public SmaliInstructionImpl(@NotNull ASTNode node, @NotNull Opcodes opcodes) {
        super(node);

        ASTNode instrNode = node.findChildByType(SmaliTokens.INSTRUCTION_TOKENS);
        assert instrNode != null;

        if (instrNode.getElementType() == SmaliTokens.ARRAY_DATA_DIRECTIVE) {
            opcode = Opcode.ARRAY_PAYLOAD;
        } else if (instrNode.getElementType() == SmaliTokens.PACKED_SWITCH_DIRECTIVE) {
            opcode = Opcode.PACKED_SWITCH_PAYLOAD;
        } else if (instrNode.getElementType() == SmaliTokens.SPARSE_SWITCH_DIRECTIVE) {
            opcode = Opcode.SPARSE_SWITCH_PAYLOAD;
        } else {
            Opcode opcode = opcodes.getOpcodeByName(instrNode.getText());
            assert opcode != null;
            this.opcode = opcode;
        }
    }

    @Nonnull
    public Opcode getOpcode() {
        return opcode;
    }

    @Override public int getOffset() {
        if (offset == -1) {
            PsiElement previous = getPrevSibling();
            while (true) {
                if (previous == null) {
                    offset = 0;
                    break;
                } else if (previous instanceof SmaliInstruction) {
                    // TODO: handle variable size instructions
                    offset = ((SmaliInstruction)previous).getOffset() + opcode.format.size;
                    break;
                }
                previous = previous.getPrevSibling();
            }
        }
        return offset;
    }

    @Override public void setOffset(int offset) {
        this.offset = offset;
    }

    @Nonnull @Override public Instruction getDexlib2Instruction() {
        return null;
    }
}
