package org.jf.smalidea;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SmaliFileTypeFactory extends FileTypeFactory {
    private static class SmaliFileType extends LanguageFileType {
        public static final SmaliFileType INSTANCE = new SmaliFileType();
        public static final String DEFAULT_EXTENSION = "smali";

        private SmaliFileType() {
            super(SmaliLanguage.INSTANCE);
        }

        @NotNull
        public String getName() {
            return "smali";
        }

        @NotNull
        public String getDescription() {
            return "smali files";
        }

        @NotNull
        public String getDefaultExtension() {
            return DEFAULT_EXTENSION;
        }

        public Icon getIcon() {
            return org.jf.smalidea.SmaliIcons.SmaliIcon;
        }
    }

    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(SmaliFileType.INSTANCE, SmaliFileType.DEFAULT_EXTENSION);
    }
}
