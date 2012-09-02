package org.jf.smalidea;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;


public class SmaliHighlighter extends SyntaxHighlighterBase {
    @NotNull
    public Lexer getHighlightingLexer() {
        return new SmaliLexer();
    }

    @NotNull
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType instanceof  SmaliElementType) {
            return ((SmaliElementType) tokenType).textAttributesKeys;
        }
        return new TextAttributesKey[] {};
    }
}
