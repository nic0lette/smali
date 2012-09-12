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
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jf.smali.LiteralTools;
import org.jf.smalidea.SmaliLexicalElementType;
import org.jf.smalidea.psi.iface.SmaliLiteral;
import org.jf.smalidea.smaliIdeaParser;

public class SmaliLiteralImpl extends ASTWrapperPsiElement implements SmaliLiteral {
    public SmaliLiteralImpl(@NotNull ASTNode node) {
        super(node);
    }

    public Object getValue() {
        ASTNode valueNode = getNode().getFirstChildNode();
        String text = valueNode.getText();

        IElementType elementType = valueNode.getElementType();

        if (elementType instanceof SmaliLexicalElementType) {
            switch (((SmaliLexicalElementType)valueNode.getElementType()).tokenId) {
                case smaliIdeaParser.INTEGER_LITERAL:
                case smaliIdeaParser.POSITIVE_INTEGER_LITERAL:
                case smaliIdeaParser.NEGATIVE_INTEGER_LITERAL:
                    return LiteralTools.parseInt(text);
                case smaliIdeaParser.LONG_LITERAL:
                    return LiteralTools.parseLong(text);
                case smaliIdeaParser.SHORT_LITERAL:
                    return LiteralTools.parseShort(text);
                case smaliIdeaParser.BYTE_LITERAL:
                    return LiteralTools.parseByte(text);
                case smaliIdeaParser.FLOAT_LITERAL:
                case smaliIdeaParser.FLOAT_LITERAL_OR_ID:
                    return LiteralTools.parseFloat(text);
                case smaliIdeaParser.DOUBLE_LITERAL:
                case smaliIdeaParser.DOUBLE_LITERAL_OR_ID:
                    return LiteralTools.parseDouble(text);
                case smaliIdeaParser.CHAR_LITERAL:
                    //TODO: implement this
                    break;
                case smaliIdeaParser.STRING_LITERAL:
                    //TODO: implement this
                    break;
            }
        }
        //TODO: array, annotation, type, field, method, enum
        return null;
    }
}
