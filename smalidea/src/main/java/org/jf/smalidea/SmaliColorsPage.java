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

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.util.Map;

public class SmaliColorsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] ATTRS;

    static {
        ATTRS = new AttributesDescriptor[SmaliTokens.Attributes.ALL_KEYS.length];
        for (int i=0; i<SmaliTokens.Attributes.ALL_KEYS.length; i++) {
            TextAttributesKey key = SmaliTokens.Attributes.ALL_KEYS[i];

            ATTRS[i] = new AttributesDescriptor(key.getExternalName(), key);
        }
    }


    public Icon getIcon() {
        return SmaliIcons.SmaliIcon;
    }

    @NotNull
    public SyntaxHighlighter getHighlighter() {
        return new SmaliHighlighter();
    }

    @NotNull
    public String getDemoText() {
        return ".class public LLineTest;\n" +
                ".super Ljava/lang/Object;\n" +
                ".source \"LineTest.smali\"\n" +
                "\n" +
                "#this class tests line debug info\n" +
                "\n" +
                ".method public constructor <init>()V\n" +
                "    .registers 1\n" +
                "    invoke-direct {p0}, Ljava/lang/Object;-><init>()V\n" +
                "    return-void\n" +
                ".end method\n" +
                "\n" +
                ".method public largerThanSignedShort()V\n" +
                "    .registers 1\n" +
                "    .annotation runtime Lorg/junit/Test;\n" +
                "    .end annotation\n" +
                "\n" +
                "    #a line number that just barely doesn't fit in a signed short\n" +
                "    .line 0x8000\n" +
                "\n" +
                "\treturn-void\n" +
                ".end method\n" +
                "\n" +
                ".method public largerThanUnsignedShort()V\n" +
                "    .registers 1\n" +
                "    .annotation runtime Lorg/junit/Test;\n" +
                "    .end annotation\n" +
                "\n" +
                "    #a line number that is way bigger than a signed short\n" +
                "    .line 0x10000\n" +
                "\n" +
                "\treturn-void\n" +
                ".end method\n" +
                "\n" +
                ".method public largerThanSignedInt()V\n" +
                "    .registers 1\n" +
                "    .annotation runtime Lorg/junit/Test;\n" +
                "    .end annotation\n" +
                "\n" +
                "    #a line number that just barely doesn't fit in a signed int\n" +
                "    .line 0x80000000\n" +
                "\n" +
                "\treturn-void\n" +
                ".end method";
    }

    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    public AttributesDescriptor[] getAttributeDescriptors() {
        return ATTRS;
    }

    @NotNull
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    public String getDisplayName() {
        return "Smali";
    }
}
