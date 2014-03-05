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

import com.google.common.base.Preconditions;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.dexlib2.Opcode;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.analysis.AnalyzedInstruction;
import org.jf.dexlib2.analysis.ClassPath;
import org.jf.dexlib2.analysis.MethodAnalyzer;
import org.jf.dexlib2.iface.Method;
import org.jf.dexlib2.iface.instruction.Instruction;
import org.jf.dexlib2.util.MethodUtil;
import org.jf.smalidea.SmaliTokens;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliInstruction;
import org.jf.smalidea.psi.iface.SmaliLiteral;
import org.jf.smalidea.psi.iface.SmaliTypeElement;
import org.jf.smalidea.psi.impl.instruction.SmalideaInstruction;
import org.jf.smalidea.util.PsiUtils;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.List;

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

    @Nullable
    protected SmaliMethodImpl getMethod() {
        return PsiUtils.findParentByClass(this, SmaliMethodImpl.class);
    }

    @Nonnull
    public Opcode getOpcode() {
        return opcode;
    }

    @Override public int getOffset() {
        if (offset == -1) {
            SmaliInstruction previousInstruction = PsiUtils.findPrevSiblingByClass(this, SmaliInstruction.class);
            if (previousInstruction == null) {
                offset = 0;
            } else {
                // TODO: handle variable size instructions
                offset = previousInstruction.getOffset() + previousInstruction.getOpcode().format.size;
            }
        }
        return offset;
    }

    @Override public void setOffset(int offset) {
        this.offset = offset;
    }

    @Nonnull @Override public Instruction getDexlib2Instruction() {
        return SmalideaInstruction.of(this);
    }

    @Nullable public AnalyzedInstruction getAnalyzedInstruction() {
        Method method = getMethod().getDexlib2Method();
        ClassPath classPath;
        try {
            classPath = new ClassPath();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        MethodAnalyzer analyzer = new MethodAnalyzer(classPath, method, null);

        int codeOffset = 0;
        for (AnalyzedInstruction instruction: analyzer.getAnalyzedInstructions()) {
            if (codeOffset == this.getCodeOffset()) {
                return instruction;
            }
            assert codeOffset < this.getCodeOffset();

            codeOffset += instruction.getOriginalInstruction().getCodeUnits();
        }
        return null;
    }

    public int getCodeOffset() {
        SmaliLabelReferenceImpl labelReference =
                (SmaliLabelReferenceImpl)getNode().findChildByType(ElementTypes.LABEL_REF);

        if (labelReference == null) {
            return -1;
        }
        SmaliLabelImpl label = labelReference.resolve();
        if (label == null) {
            return -1;
        }
        return label.getOffset();
    }

    @Override
    public int getRegister(int registerIndex) {
        Preconditions.checkArgument(registerIndex >= 0);
        List<PsiElement> registers = findChildrenByType(SmaliTokens.REGISTER);
        if (registerIndex >= registers.size()) {
            return -1;
        }

        String registerText = registers.get(registerIndex).getText();
        if (registerText.startsWith("v")) {
            return Integer.parseInt(registerText.substring(1));
        } else {
            SmaliMethodImpl method = getMethod();
            if (method == null) {
                return -1;
            }

            return Integer.parseInt(registerText.substring(1)) +
                    MethodUtil.getParameterRegisterCount(method.getDexlib2Method());
        }
    }

    @Override
    public int getRegisterCount() {
        return findChildrenByType(SmaliTokens.REGISTER).size();
    }

    @Nullable @Override
    public SmaliLiteral getLiteral() {
        return findChildByClass(SmaliLiteral.class);
    }

    @Nullable @Override
    public SmaliTypeElement getTypeReference() {
        return findChildByClass(SmaliTypeElement.class);
    }

    @Nullable @Override
    public SmaliFieldReference getFieldReference() {
        return findChildByClass(SmaliFieldReference.class);
    }

    @Nullable @Override
    public SmaliMethodReference getMethodReference() {
        return findChildByClass(SmaliMethodReference.class);
    }
}
