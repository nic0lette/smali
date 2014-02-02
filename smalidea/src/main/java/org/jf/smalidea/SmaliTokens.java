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

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import org.jf.smali.smaliParser;

import java.util.HashMap;

public class SmaliTokens {
    public static class Attributes {
        public static final TextAttributesKey ACCESS = TextAttributesKey.createTextAttributesKey(
                "ACCESS", DefaultLanguageHighlighterColors.KEYWORD);
        public static final TextAttributesKey ARROW = TextAttributesKey.createTextAttributesKey(
                "ARROW", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
        public static final TextAttributesKey BRACES = TextAttributesKey.createTextAttributesKey(
                "BRACES", DefaultLanguageHighlighterColors.BRACES);
        public static final TextAttributesKey COLON = TextAttributesKey.createTextAttributesKey(
                "COLON", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
        public static final TextAttributesKey COMMA = TextAttributesKey.createTextAttributesKey(
                "COMMA", DefaultLanguageHighlighterColors.COMMA);
        public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey(
                "COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
        public static final TextAttributesKey DIRECTIVE = TextAttributesKey.createTextAttributesKey(
                "DIRECTIVE", DefaultLanguageHighlighterColors.KEYWORD);
        public static final TextAttributesKey DOTDOT = TextAttributesKey.createTextAttributesKey(
                "DOTDOT", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
        public static final TextAttributesKey EQUAL = TextAttributesKey.createTextAttributesKey(
                "EQUAL", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL);
        public static final TextAttributesKey IDENTIFIER = TextAttributesKey.createTextAttributesKey(
                "IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
        public static final TextAttributesKey INSTRUCTION = TextAttributesKey.createTextAttributesKey(
                "INSTRUCTION", DefaultLanguageHighlighterColors.KEYWORD);
        public static final TextAttributesKey LITERAL = TextAttributesKey.createTextAttributesKey(
                "LITERAL", DefaultLanguageHighlighterColors.NUMBER);
        public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey(
                "NUMBER", DefaultLanguageHighlighterColors.NUMBER);
        public static final TextAttributesKey ODEX_REFERENCE = TextAttributesKey.createTextAttributesKey(
                "ODEX_REFERENCE", DefaultLanguageHighlighterColors.INSTANCE_METHOD);
        public static final TextAttributesKey PARENS = TextAttributesKey.createTextAttributesKey(
                "PARENS", DefaultLanguageHighlighterColors.PARENTHESES);
        public static final TextAttributesKey REGISTER = TextAttributesKey.createTextAttributesKey(
                "REGISTER", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);
        public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey(
                "STRING", DefaultLanguageHighlighterColors.STRING);
        public static final TextAttributesKey TYPE = TextAttributesKey.createTextAttributesKey(
                "TYPE", DefaultLanguageHighlighterColors.CLASS_REFERENCE);
        public static final TextAttributesKey VERIFICATION_ERROR_TYPE = TextAttributesKey.createTextAttributesKey(
                "VERIFICATION_ERROR_TYPE", DefaultLanguageHighlighterColors.KEYWORD);

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

    public static final IElementType CLASS_DIRECTIVE;
    public static final IElementType SUPER_DIRECTIVE;
    public static final IElementType IMPLEMENTS_DIRECTIVE;
    public static final IElementType SOURCE_DIRECTIVE;
    public static final IElementType FIELD_DIRECTIVE;
    public static final IElementType END_FIELD_DIRECTIVE;
    public static final IElementType SUBANNOTATION_DIRECTIVE;
    public static final IElementType END_SUBANNOTATION_DIRECTIVE;
    public static final IElementType ANNOTATION_DIRECTIVE;
    public static final IElementType END_ANNOTATION_DIRECTIVE;
    public static final IElementType ENUM_DIRECTIVE;
    public static final IElementType METHOD_DIRECTIVE;
    public static final IElementType END_METHOD_DIRECTIVE;
    public static final IElementType REGISTERS_DIRECTIVE;
    public static final IElementType LOCALS_DIRECTIVE;
    public static final IElementType ARRAY_DATA_DIRECTIVE;
    public static final IElementType END_ARRAY_DATA_DIRECTIVE;
    public static final IElementType PACKED_SWITCH_DIRECTIVE;
    public static final IElementType END_PACKED_SWITCH_DIRECTIVE;
    public static final IElementType SPARSE_SWITCH_DIRECTIVE;
    public static final IElementType END_SPARSE_SWITCH_DIRECTIVE;
    public static final IElementType CATCH_DIRECTIVE;
    public static final IElementType CATCHALL_DIRECTIVE;
    public static final IElementType LINE_DIRECTIVE;
    public static final IElementType PARAMETER_DIRECTIVE;
    public static final IElementType END_PARAMETER_DIRECTIVE;
    public static final IElementType LOCAL_DIRECTIVE;
    public static final IElementType END_LOCAL_DIRECTIVE;
    public static final IElementType RESTART_LOCAL_DIRECTIVE;
    public static final IElementType PROLOGUE_DIRECTIVE;
    public static final IElementType EPILOGUE_DIRECTIVE;
    public static final IElementType POSITIVE_INTEGER_LITERAL;
    public static final IElementType NEGATIVE_INTEGER_LITERAL;
    public static final IElementType INTEGER_LITERAL;

    public static final IElementType LONG_LITERAL;
    public static final IElementType SHORT_LITERAL;
    public static final IElementType BYTE_LITERAL;
    public static final IElementType FLOAT_LITERAL_OR_ID;
    public static final IElementType DOUBLE_LITERAL_OR_ID;
    public static final IElementType FLOAT_LITERAL;
    public static final IElementType DOUBLE_LITERAL;
    public static final IElementType BOOL_LITERAL;
    public static final IElementType NULL_LITERAL;
    public static final IElementType STRING_LITERAL;
    public static final IElementType CHAR_LITERAL;
    public static final IElementType REGISTER;
    public static final IElementType ANNOTATION_VISIBILITY;
    public static final IElementType ACCESS_SPEC;
    public static final IElementType VERIFICATION_ERROR_TYPE;
    public static final IElementType INLINE_INDEX;
    public static final IElementType VTABLE_INDEX;
    public static final IElementType FIELD_OFFSET;
    public static final IElementType LINE_COMMENT;
    public static final IElementType INSTRUCTION_FORMAT10t;
    public static final IElementType INSTRUCTION_FORMAT10x;
    public static final IElementType INSTRUCTION_FORMAT10x_ODEX;
    public static final IElementType INSTRUCTION_FORMAT11n;
    public static final IElementType INSTRUCTION_FORMAT11x;
    public static final IElementType INSTRUCTION_FORMAT12x_OR_ID;
    public static final IElementType INSTRUCTION_FORMAT12x;
    public static final IElementType INSTRUCTION_FORMAT20bc;
    public static final IElementType INSTRUCTION_FORMAT20t;
    public static final IElementType INSTRUCTION_FORMAT21c_FIELD;
    public static final IElementType INSTRUCTION_FORMAT21c_FIELD_ODEX;
    public static final IElementType INSTRUCTION_FORMAT21c_STRING;
    public static final IElementType INSTRUCTION_FORMAT21c_TYPE;
    public static final IElementType INSTRUCTION_FORMAT21ih;
    public static final IElementType INSTRUCTION_FORMAT21lh;
    public static final IElementType INSTRUCTION_FORMAT21s;
    public static final IElementType INSTRUCTION_FORMAT21t;
    public static final IElementType INSTRUCTION_FORMAT22b;
    public static final IElementType INSTRUCTION_FORMAT22c_FIELD;
    public static final IElementType INSTRUCTION_FORMAT22c_FIELD_ODEX;
    public static final IElementType INSTRUCTION_FORMAT22c_TYPE;
    public static final IElementType INSTRUCTION_FORMAT22cs_FIELD;
    public static final IElementType INSTRUCTION_FORMAT22s_OR_ID;
    public static final IElementType INSTRUCTION_FORMAT22s;
    public static final IElementType INSTRUCTION_FORMAT22t;
    public static final IElementType INSTRUCTION_FORMAT22x;
    public static final IElementType INSTRUCTION_FORMAT23x;
    public static final IElementType INSTRUCTION_FORMAT30t;
    public static final IElementType INSTRUCTION_FORMAT31c;
    public static final IElementType INSTRUCTION_FORMAT31i_OR_ID;
    public static final IElementType INSTRUCTION_FORMAT31i;
    public static final IElementType INSTRUCTION_FORMAT31t;
    public static final IElementType INSTRUCTION_FORMAT32x;
    public static final IElementType INSTRUCTION_FORMAT35c_METHOD;
    public static final IElementType INSTRUCTION_FORMAT35c_METHOD_ODEX;
    public static final IElementType INSTRUCTION_FORMAT35c_TYPE;
    public static final IElementType INSTRUCTION_FORMAT35mi_METHOD;
    public static final IElementType INSTRUCTION_FORMAT35ms_METHOD;
    public static final IElementType INSTRUCTION_FORMAT3rc_METHOD;
    public static final IElementType INSTRUCTION_FORMAT3rc_METHOD_ODEX;
    public static final IElementType INSTRUCTION_FORMAT3rc_TYPE;
    public static final IElementType INSTRUCTION_FORMAT3rmi_METHOD;
    public static final IElementType INSTRUCTION_FORMAT3rms_METHOD;
    public static final IElementType INSTRUCTION_FORMAT51l;
    public static final IElementType PRIMITIVE_TYPE;
    public static final IElementType VOID_TYPE;
    public static final IElementType CLASS_DESCRIPTOR;
    public static final IElementType ARRAY_DESCRIPTOR;
    public static final IElementType PARAM_LIST_OR_ID;
    public static final IElementType PARAM_LIST;
    public static final IElementType SIMPLE_NAME;
    public static final IElementType MEMBER_NAME;
    public static final IElementType DOTDOT;
    public static final IElementType ARROW;
    public static final IElementType EQUAL;
    public static final IElementType COLON;
    public static final IElementType COMMA;
    public static final IElementType OPEN_BRACE;
    public static final IElementType CLOSE_BRACE;
    public static final IElementType OPEN_PAREN;
    public static final IElementType CLOSE_PAREN;

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

            public SmaliLexicalElementType register(String tokenName, TextAttributesKey textAttributesKey) {
                int tokenId = tokenIdsByName.get(tokenName);
                SmaliLexicalElementType smaliElementType = new SmaliLexicalElementType(tokenId, tokenName, textAttributesKey);
                ELEMENT_TYPES[tokenId] = smaliElementType;
                TOKEN_ID_BY_ELEMENT.put(smaliElementType.getIndex(), tokenId);
                return smaliElementType;
            }
        }

        TokenRegisterer tokenRegisterer = new TokenRegisterer();
        ELEMENT_TYPES = new IElementType[tokenRegisterer.tokenCount];

        CLASS_DIRECTIVE = tokenRegisterer.register("CLASS_DIRECTIVE", Attributes.DIRECTIVE);
        SUPER_DIRECTIVE = tokenRegisterer.register("SUPER_DIRECTIVE", Attributes.DIRECTIVE);
        IMPLEMENTS_DIRECTIVE = tokenRegisterer.register("IMPLEMENTS_DIRECTIVE", Attributes.DIRECTIVE);
        SOURCE_DIRECTIVE = tokenRegisterer.register("SOURCE_DIRECTIVE", Attributes.DIRECTIVE);
        FIELD_DIRECTIVE = tokenRegisterer.register("FIELD_DIRECTIVE", Attributes.DIRECTIVE);
        END_FIELD_DIRECTIVE = tokenRegisterer.register("END_FIELD_DIRECTIVE", Attributes.DIRECTIVE);
        SUBANNOTATION_DIRECTIVE = tokenRegisterer.register("SUBANNOTATION_DIRECTIVE", Attributes.DIRECTIVE);
        END_SUBANNOTATION_DIRECTIVE = tokenRegisterer.register("END_SUBANNOTATION_DIRECTIVE", Attributes.DIRECTIVE);
        ANNOTATION_DIRECTIVE = tokenRegisterer.register("ANNOTATION_DIRECTIVE", Attributes.DIRECTIVE);
        END_ANNOTATION_DIRECTIVE = tokenRegisterer.register("END_ANNOTATION_DIRECTIVE", Attributes.DIRECTIVE);
        ENUM_DIRECTIVE = tokenRegisterer.register("ENUM_DIRECTIVE", Attributes.DIRECTIVE);
        METHOD_DIRECTIVE = tokenRegisterer.register("METHOD_DIRECTIVE", Attributes.DIRECTIVE);
        END_METHOD_DIRECTIVE = tokenRegisterer.register("END_METHOD_DIRECTIVE", Attributes.DIRECTIVE);
        REGISTERS_DIRECTIVE = tokenRegisterer.register("REGISTERS_DIRECTIVE", Attributes.DIRECTIVE);
        LOCALS_DIRECTIVE = tokenRegisterer.register("LOCALS_DIRECTIVE", Attributes.DIRECTIVE);
        ARRAY_DATA_DIRECTIVE = tokenRegisterer.register("ARRAY_DATA_DIRECTIVE", Attributes.DIRECTIVE);
        END_ARRAY_DATA_DIRECTIVE = tokenRegisterer.register("END_ARRAY_DATA_DIRECTIVE", Attributes.DIRECTIVE);
        PACKED_SWITCH_DIRECTIVE = tokenRegisterer.register("PACKED_SWITCH_DIRECTIVE", Attributes.DIRECTIVE);
        END_PACKED_SWITCH_DIRECTIVE = tokenRegisterer.register("END_PACKED_SWITCH_DIRECTIVE", Attributes.DIRECTIVE);
        SPARSE_SWITCH_DIRECTIVE = tokenRegisterer.register("SPARSE_SWITCH_DIRECTIVE", Attributes.DIRECTIVE);
        END_SPARSE_SWITCH_DIRECTIVE = tokenRegisterer.register("END_SPARSE_SWITCH_DIRECTIVE", Attributes.DIRECTIVE);
        CATCH_DIRECTIVE = tokenRegisterer.register("CATCH_DIRECTIVE", Attributes.DIRECTIVE);
        CATCHALL_DIRECTIVE = tokenRegisterer.register("CATCHALL_DIRECTIVE", Attributes.DIRECTIVE);
        LINE_DIRECTIVE = tokenRegisterer.register("LINE_DIRECTIVE", Attributes.DIRECTIVE);
        PARAMETER_DIRECTIVE = tokenRegisterer.register("PARAMETER_DIRECTIVE", Attributes.DIRECTIVE);
        END_PARAMETER_DIRECTIVE = tokenRegisterer.register("END_PARAMETER_DIRECTIVE", Attributes.DIRECTIVE);
        LOCAL_DIRECTIVE = tokenRegisterer.register("LOCAL_DIRECTIVE", Attributes.DIRECTIVE);
        END_LOCAL_DIRECTIVE = tokenRegisterer.register("END_LOCAL_DIRECTIVE", Attributes.DIRECTIVE);
        RESTART_LOCAL_DIRECTIVE = tokenRegisterer.register("RESTART_LOCAL_DIRECTIVE", Attributes.DIRECTIVE);
        PROLOGUE_DIRECTIVE = tokenRegisterer.register("PROLOGUE_DIRECTIVE", Attributes.DIRECTIVE);
        EPILOGUE_DIRECTIVE = tokenRegisterer.register("EPILOGUE_DIRECTIVE", Attributes.DIRECTIVE);
        POSITIVE_INTEGER_LITERAL = tokenRegisterer.register("POSITIVE_INTEGER_LITERAL", Attributes.NUMBER);
        NEGATIVE_INTEGER_LITERAL = tokenRegisterer.register("NEGATIVE_INTEGER_LITERAL", Attributes.NUMBER);
        INTEGER_LITERAL = tokenRegisterer.register("INTEGER_LITERAL", Attributes.NUMBER);

        LONG_LITERAL = tokenRegisterer.register("LONG_LITERAL", Attributes.NUMBER);
        SHORT_LITERAL = tokenRegisterer.register("SHORT_LITERAL", Attributes.NUMBER);
        BYTE_LITERAL = tokenRegisterer.register("BYTE_LITERAL", Attributes.NUMBER);
        FLOAT_LITERAL_OR_ID = tokenRegisterer.register("FLOAT_LITERAL_OR_ID", Attributes.NUMBER);
        DOUBLE_LITERAL_OR_ID = tokenRegisterer.register("DOUBLE_LITERAL_OR_ID", Attributes.NUMBER);
        FLOAT_LITERAL = tokenRegisterer.register("FLOAT_LITERAL", Attributes.NUMBER);
        DOUBLE_LITERAL = tokenRegisterer.register("DOUBLE_LITERAL", Attributes.NUMBER);
        BOOL_LITERAL = tokenRegisterer.register("BOOL_LITERAL", Attributes.LITERAL);
        NULL_LITERAL = tokenRegisterer.register("NULL_LITERAL", Attributes.LITERAL);
        STRING_LITERAL = tokenRegisterer.register("STRING_LITERAL", Attributes.STRING);
        CHAR_LITERAL = tokenRegisterer.register("CHAR_LITERAL", Attributes.STRING);
        REGISTER = tokenRegisterer.register("REGISTER", Attributes.REGISTER);
        ANNOTATION_VISIBILITY = tokenRegisterer.register("ANNOTATION_VISIBILITY", Attributes.ACCESS);
        ACCESS_SPEC = tokenRegisterer.register("ACCESS_SPEC", Attributes.ACCESS);
        VERIFICATION_ERROR_TYPE = tokenRegisterer.register("VERIFICATION_ERROR_TYPE", Attributes.VERIFICATION_ERROR_TYPE);
        INLINE_INDEX = tokenRegisterer.register("INLINE_INDEX", Attributes.ODEX_REFERENCE);
        VTABLE_INDEX = tokenRegisterer.register("VTABLE_INDEX", Attributes.ODEX_REFERENCE);
        FIELD_OFFSET = tokenRegisterer.register("FIELD_OFFSET", Attributes.ODEX_REFERENCE);
        LINE_COMMENT = tokenRegisterer.register("LINE_COMMENT", Attributes.COMMENT);
        INSTRUCTION_FORMAT10t = tokenRegisterer.register("INSTRUCTION_FORMAT10t", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT10x = tokenRegisterer.register("INSTRUCTION_FORMAT10x", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT10x_ODEX = tokenRegisterer.register("INSTRUCTION_FORMAT10x_ODEX", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT11n = tokenRegisterer.register("INSTRUCTION_FORMAT11n", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT11x = tokenRegisterer.register("INSTRUCTION_FORMAT11x", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT12x_OR_ID = tokenRegisterer.register("INSTRUCTION_FORMAT12x_OR_ID", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT12x = tokenRegisterer.register("INSTRUCTION_FORMAT12x", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT20bc = tokenRegisterer.register("INSTRUCTION_FORMAT20bc", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT20t = tokenRegisterer.register("INSTRUCTION_FORMAT20t", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT21c_FIELD = tokenRegisterer.register("INSTRUCTION_FORMAT21c_FIELD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT21c_FIELD_ODEX = tokenRegisterer.register("INSTRUCTION_FORMAT21c_FIELD_ODEX", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT21c_STRING = tokenRegisterer.register("INSTRUCTION_FORMAT21c_STRING", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT21c_TYPE = tokenRegisterer.register("INSTRUCTION_FORMAT21c_TYPE", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT21ih = tokenRegisterer.register("INSTRUCTION_FORMAT21ih", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT21lh = tokenRegisterer.register("INSTRUCTION_FORMAT21lh", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT21s = tokenRegisterer.register("INSTRUCTION_FORMAT21s", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT21t = tokenRegisterer.register("INSTRUCTION_FORMAT21t", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22b = tokenRegisterer.register("INSTRUCTION_FORMAT22b", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22c_FIELD = tokenRegisterer.register("INSTRUCTION_FORMAT22c_FIELD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22c_FIELD_ODEX = tokenRegisterer.register("INSTRUCTION_FORMAT22c_FIELD_ODEX", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22c_TYPE = tokenRegisterer.register("INSTRUCTION_FORMAT22c_TYPE", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22cs_FIELD = tokenRegisterer.register("INSTRUCTION_FORMAT22cs_FIELD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22s_OR_ID = tokenRegisterer.register("INSTRUCTION_FORMAT22s_OR_ID", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22s = tokenRegisterer.register("INSTRUCTION_FORMAT22s", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22t = tokenRegisterer.register("INSTRUCTION_FORMAT22t", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT22x = tokenRegisterer.register("INSTRUCTION_FORMAT22x", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT23x = tokenRegisterer.register("INSTRUCTION_FORMAT23x", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT30t = tokenRegisterer.register("INSTRUCTION_FORMAT30t", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT31c = tokenRegisterer.register("INSTRUCTION_FORMAT31c", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT31i_OR_ID = tokenRegisterer.register("INSTRUCTION_FORMAT31i_OR_ID", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT31i = tokenRegisterer.register("INSTRUCTION_FORMAT31i", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT31t = tokenRegisterer.register("INSTRUCTION_FORMAT31t", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT32x = tokenRegisterer.register("INSTRUCTION_FORMAT32x", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT35c_METHOD = tokenRegisterer.register("INSTRUCTION_FORMAT35c_METHOD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT35c_METHOD_ODEX = tokenRegisterer.register("INSTRUCTION_FORMAT35c_METHOD_ODEX", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT35c_TYPE = tokenRegisterer.register("INSTRUCTION_FORMAT35c_TYPE", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT35mi_METHOD = tokenRegisterer.register("INSTRUCTION_FORMAT35mi_METHOD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT35ms_METHOD = tokenRegisterer.register("INSTRUCTION_FORMAT35ms_METHOD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT3rc_METHOD = tokenRegisterer.register("INSTRUCTION_FORMAT3rc_METHOD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT3rc_METHOD_ODEX = tokenRegisterer.register("INSTRUCTION_FORMAT3rc_METHOD_ODEX", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT3rc_TYPE = tokenRegisterer.register("INSTRUCTION_FORMAT3rc_TYPE", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT3rmi_METHOD = tokenRegisterer.register("INSTRUCTION_FORMAT3rmi_METHOD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT3rms_METHOD = tokenRegisterer.register("INSTRUCTION_FORMAT3rms_METHOD", Attributes.INSTRUCTION);
        INSTRUCTION_FORMAT51l = tokenRegisterer.register("INSTRUCTION_FORMAT51l", Attributes.INSTRUCTION);
        PRIMITIVE_TYPE = tokenRegisterer.register("PRIMITIVE_TYPE", Attributes.TYPE);
        VOID_TYPE = tokenRegisterer.register("VOID_TYPE", Attributes.TYPE);
        CLASS_DESCRIPTOR = tokenRegisterer.register("CLASS_DESCRIPTOR", Attributes.TYPE);
        ARRAY_DESCRIPTOR = tokenRegisterer.register("ARRAY_DESCRIPTOR", Attributes.TYPE);
        PARAM_LIST_OR_ID = tokenRegisterer.register("PARAM_LIST_OR_ID", Attributes.TYPE);
        PARAM_LIST = tokenRegisterer.register("PARAM_LIST", Attributes.TYPE);
        SIMPLE_NAME = tokenRegisterer.register("SIMPLE_NAME", Attributes.IDENTIFIER);
        MEMBER_NAME = tokenRegisterer.register("MEMBER_NAME", Attributes.IDENTIFIER);
        DOTDOT = tokenRegisterer.register("DOTDOT", Attributes.DOTDOT);
        ARROW = tokenRegisterer.register("ARROW", Attributes.ARROW);
        EQUAL = tokenRegisterer.register("EQUAL", Attributes.EQUAL);
        COLON = tokenRegisterer.register("COLON", Attributes.COLON);
        COMMA = tokenRegisterer.register("COMMA", Attributes.COMMA);
        OPEN_BRACE = tokenRegisterer.register("OPEN_BRACE", Attributes.BRACES);
        CLOSE_BRACE = tokenRegisterer.register("CLOSE_BRACE", Attributes.BRACES);
        OPEN_PAREN = tokenRegisterer.register("OPEN_PAREN", Attributes.PARENS);
        CLOSE_PAREN = tokenRegisterer.register("CLOSE_PAREN", Attributes.PARENS);
    }

    public static final TokenSet INSTRUCTION_TOKENS = TokenSet.create(
            INSTRUCTION_FORMAT10t,
            INSTRUCTION_FORMAT10x,
            INSTRUCTION_FORMAT10x_ODEX,
            INSTRUCTION_FORMAT11n,
            INSTRUCTION_FORMAT11x,
            INSTRUCTION_FORMAT12x_OR_ID,
            INSTRUCTION_FORMAT12x,
            INSTRUCTION_FORMAT20bc,
            INSTRUCTION_FORMAT20t,
            INSTRUCTION_FORMAT21c_FIELD,
            INSTRUCTION_FORMAT21c_FIELD_ODEX,
            INSTRUCTION_FORMAT21c_STRING,
            INSTRUCTION_FORMAT21c_TYPE,
            INSTRUCTION_FORMAT21ih,
            INSTRUCTION_FORMAT21lh,
            INSTRUCTION_FORMAT21s,
            INSTRUCTION_FORMAT21t,
            INSTRUCTION_FORMAT22b,
            INSTRUCTION_FORMAT22c_FIELD,
            INSTRUCTION_FORMAT22c_FIELD_ODEX,
            INSTRUCTION_FORMAT22c_TYPE,
            INSTRUCTION_FORMAT22cs_FIELD,
            INSTRUCTION_FORMAT22s_OR_ID,
            INSTRUCTION_FORMAT22s,
            INSTRUCTION_FORMAT22t,
            INSTRUCTION_FORMAT22x,
            INSTRUCTION_FORMAT23x,
            INSTRUCTION_FORMAT30t,
            INSTRUCTION_FORMAT31c,
            INSTRUCTION_FORMAT31i_OR_ID,
            INSTRUCTION_FORMAT31i,
            INSTRUCTION_FORMAT31t,
            INSTRUCTION_FORMAT32x,
            INSTRUCTION_FORMAT35c_METHOD,
            INSTRUCTION_FORMAT35c_METHOD_ODEX,
            INSTRUCTION_FORMAT35c_TYPE,
            INSTRUCTION_FORMAT35mi_METHOD,
            INSTRUCTION_FORMAT35ms_METHOD,
            INSTRUCTION_FORMAT3rc_METHOD,
            INSTRUCTION_FORMAT3rc_METHOD_ODEX,
            INSTRUCTION_FORMAT3rc_TYPE,
            INSTRUCTION_FORMAT3rmi_METHOD,
            INSTRUCTION_FORMAT3rms_METHOD,
            INSTRUCTION_FORMAT51l
    );
}
