package org.jf.smalidea;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import org.jetbrains.annotations.NotNull;

public class SmaliLanguage extends Language {
    public static final SmaliLanguage INSTANCE = new SmaliLanguage();

    private SmaliLanguage() {
        super("smali");
    }
}
