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

import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.tree.IElementType;
import org.jf.smali.smaliParser;

import java.util.HashMap;

public class SmaliTokens {
    public static class Attributes {
        public static final TextAttributesKey ACCESS = TextAttributesKey.createTextAttributesKey(
                "ACCESS", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey ARROW = TextAttributesKey.createTextAttributesKey(
                "ARROW", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey(
                "BRACES", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey COLON = TextAttributesKey.createTextAttributesKey(
                "COLON", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey COMMA = TextAttributesKey.createTextAttributesKey(
                "COMMA", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey(
                "COMMENT", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey DIRECTIVE = TextAttributesKey.createTextAttributesKey(
                "DIRECTIVE", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey DOTDOT = TextAttributesKey.createTextAttributesKey(
                "DOTDOT", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey EQUAL = TextAttributesKey.createTextAttributesKey(
                "EQUAL", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey(
                "IDENTIFIER", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey INSTRUCTION = TextAttributesKey.createTextAttributesKey(
                "INSTRUCTION", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey LITERAL = TextAttributesKey.createTextAttributesKey(
                "LITERAL", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey(
                "NUMBER", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey ODEX_REFERENCE = TextAttributesKey.createTextAttributesKey(
                "ODEX_REFERENCE", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey OFFSET = TextAttributesKey.createTextAttributesKey("OFFSET", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey PARENS = TextAttributesKey.createTextAttributesKey("PARENS", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey REGISTER = TextAttributesKey.createTextAttributesKey("REGISTER", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey(
                "STRING", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey TYPE = TextAttributesKey.createTextAttributesKey(
                "TYPE", HighlighterColors.TEXT.getDefaultAttributes());
        public static final TextAttributesKey VERIFICATION_ERROR_TYPE = TextAttributesKey.createTextAttributesKey(
                "VERIFICATION_ERROR_TYPE", HighlighterColors.TEXT.getDefaultAttributes());

        public static final TextAttributesKey[] ALL_KEYS = new TextAttributesKey[] {
                ACCESS,
                ARROW,
                BRACES,
                COLON,
                COMMA,
                COMMENT,
                DIRECTIVE,
                DOTDOT,
                EQUAL,
                IDENTIFIER,
                INSTRUCTION,
                LITERAL,
                NUMBER,
                ODEX_REFERENCE,
                OFFSET,
                PARENS,
                REGISTER,
                STRING,
                TYPE,
                VERIFICATION_ERROR_TYPE
        };
    }

    private static final IElementType[] ELEMENT_TYPES;
    private static final HashMap<Short, Integer> TOKEN_ID_BY_ELEMENT = new HashMap<Short, Integer>();

    public static IElementType getElementType(int tokenType) {
        return ELEMENT_TYPES[tokenType];
    }

    public static int getTokenId(IElementType elementType) {
        return TOKEN_ID_BY_ELEMENT.get(elementType.getIndex());
    }

    static {
        class TokenRegisterer {
            public int tokenCount = smaliParser.tokenNames.length;
            private HashMap<String, Integer> tokenIdsByName = new HashMap<String, Integer>();

            public TokenRegisterer() {
                for (int i=0; i<tokenCount; i++) {
                    String tokenName = smaliParser.tokenNames[i];
                    tokenIdsByName.put(tokenName, i);
                }
            }

            public SmaliElementType register(String tokenName, TextAttributesKey textAttributesKey) {
                int tokenId = tokenIdsByName.get(tokenName);
                SmaliElementType smaliElementType = new SmaliElementType(tokenId, tokenName, textAttributesKey);
                ELEMENT_TYPES[tokenId] = smaliElementType;
                TOKEN_ID_BY_ELEMENT.put(smaliElementType.getIndex(), tokenId);
                return smaliElementType;
            }
        }

        TokenRegisterer tokenRegisterer = new TokenRegisterer();
        ELEMENT_TYPES = new IElementType[tokenRegisterer.tokenCount];

        tokenRegisterer.register("CLASS_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("SUPER_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("IMPLEMENTS_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("SOURCE_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("FIELD_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_FIELD_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("SUBANNOTATION_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_SUBANNOTATION_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("ANNOTATION_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_ANNOTATION_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("ENUM_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("METHOD_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_METHOD_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("REGISTERS_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("LOCALS_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("ARRAY_DATA_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_ARRAY_DATA_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("PACKED_SWITCH_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_PACKED_SWITCH_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("SPARSE_SWITCH_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_SPARSE_SWITCH_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("CATCH_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("CATCHALL_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("LINE_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("PARAMETER_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_PARAMETER_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("LOCAL_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("END_LOCAL_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("RESTART_LOCAL_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("PROLOGUE_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("EPILOGUE_DIRECTIVE", Attributes.DIRECTIVE);
        tokenRegisterer.register("POSITIVE_INTEGER_LITERAL", Attributes.NUMBER);
        tokenRegisterer.register("NEGATIVE_INTEGER_LITERAL", Attributes.NUMBER);
        tokenRegisterer.register("INTEGER_LITERAL", Attributes.NUMBER);

        tokenRegisterer.register("LONG_LITERAL", Attributes.NUMBER);
        tokenRegisterer.register("SHORT_LITERAL", Attributes.NUMBER);
        tokenRegisterer.register("BYTE_LITERAL", Attributes.NUMBER);
        tokenRegisterer.register("FLOAT_LITERAL_OR_ID", Attributes.NUMBER);
        tokenRegisterer.register("DOUBLE_LITERAL_OR_ID", Attributes.NUMBER);
        tokenRegisterer.register("FLOAT_LITERAL", Attributes.NUMBER);
        tokenRegisterer.register("DOUBLE_LITERAL", Attributes.NUMBER);
        tokenRegisterer.register("BOOL_LITERAL", Attributes.LITERAL);
        tokenRegisterer.register("NULL_LITERAL", Attributes.LITERAL);
        tokenRegisterer.register("STRING_LITERAL", Attributes.STRING);
        tokenRegisterer.register("CHAR_LITERAL", Attributes.STRING);
        tokenRegisterer.register("REGISTER", Attributes.REGISTER);
        tokenRegisterer.register("ANNOTATION_VISIBILITY", Attributes.ACCESS);
        tokenRegisterer.register("ACCESS_SPEC", Attributes.ACCESS);
        tokenRegisterer.register("VERIFICATION_ERROR_TYPE", Attributes.VERIFICATION_ERROR_TYPE);
        tokenRegisterer.register("INLINE_INDEX", Attributes.ODEX_REFERENCE);
        tokenRegisterer.register("VTABLE_INDEX", Attributes.ODEX_REFERENCE);
        tokenRegisterer.register("FIELD_OFFSET", Attributes.ODEX_REFERENCE);
        tokenRegisterer.register("OFFSET", Attributes.OFFSET);
        tokenRegisterer.register("LINE_COMMENT", Attributes.COMMENT);
        tokenRegisterer.register("INSTRUCTION_FORMAT10t", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT10x", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT10x_ODEX", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT11n", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT11x", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT12x_OR_ID", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT12x", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT20bc", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT20t", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT21c_FIELD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT21c_FIELD_ODEX", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT21c_STRING", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT21c_TYPE", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT21h", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT21s", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT21t", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22b", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22c_FIELD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22c_FIELD_ODEX", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22c_TYPE", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22cs_FIELD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22s_OR_ID", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22s", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22t", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT22x", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT23x", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT30t", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT31c", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT31i_OR_ID", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT31i", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT31t", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT32x", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT35c_METHOD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT35c_METHOD_ODEX", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT35c_TYPE", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT35mi_METHOD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT35ms_METHOD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT3rc_METHOD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT3rc_METHOD_ODEX", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT3rc_TYPE", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT3rmi_METHOD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT3rms_METHOD", Attributes.INSTRUCTION);
        tokenRegisterer.register("INSTRUCTION_FORMAT51l", Attributes.INSTRUCTION);
        tokenRegisterer.register("PRIMITIVE_TYPE", Attributes.TYPE);
        tokenRegisterer.register("VOID_TYPE", Attributes.TYPE);
        tokenRegisterer.register("CLASS_DESCRIPTOR", Attributes.TYPE);
        tokenRegisterer.register("ARRAY_DESCRIPTOR", Attributes.TYPE);
        tokenRegisterer.register("PARAM_LIST_OR_ID", Attributes.TYPE);
        tokenRegisterer.register("PARAM_LIST", Attributes.TYPE);
        tokenRegisterer.register("SIMPLE_NAME", Attributes.IDENTIFIER);
        tokenRegisterer.register("METHOD_NAME", Attributes.IDENTIFIER);
        tokenRegisterer.register("DOTDOT", Attributes.DOTDOT);
        tokenRegisterer.register("ARROW", Attributes.ARROW);
        tokenRegisterer.register("EQUAL", Attributes.EQUAL);
        tokenRegisterer.register("COLON", Attributes.COLON);
        tokenRegisterer.register("COMMA", Attributes.COMMA);
        tokenRegisterer.register("OPEN_BRACE", Attributes.BRACES);
        tokenRegisterer.register("CLOSE_BRACE", Attributes.BRACES);
        tokenRegisterer.register("OPEN_PAREN", Attributes.PARENS);
        tokenRegisterer.register("CLOSE_PAREN", Attributes.PARENS);
    }
}
