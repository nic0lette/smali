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

package org.jf.dexlib2;

import com.google.common.base.Objects;
import com.google.common.io.ByteStreams;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.dexbacked.DexBackedOdexFile;
import org.jf.dexlib2.dexbacked.OatFile;
import org.jf.dexlib2.dexbacked.OatFile.NotAnOatFileException;
import org.jf.dexlib2.dexbacked.OatFile.OatDexFile;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.writer.pool.DexPool;
import org.jf.util.ExceptionWithContext;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class DexFileFactory {
    @Nonnull
    public static DexBackedDexFile loadDexFile(@Nonnull String path, int api) throws IOException {
        return loadDexFile(new File(path), null, new Opcodes(api));
    }

    @Nonnull
    public static DexBackedDexFile loadDexFile(@Nonnull File dexFile, int api) throws IOException {
        return loadDexFile(dexFile, null, new Opcodes(api));
    }

    @Nonnull
    public static DexBackedDexFile loadDexFile(@Nonnull File dexFile, @Nullable String dexEntry,
                                               int api) throws IOException {
        return loadDexFile(dexFile, dexEntry, new Opcodes(api));
    }

    @Nonnull
    public static DexBackedDexFile loadDexFile(@Nonnull File dexFile, @Nullable String dexEntry,
                                               @Nonnull Opcodes opcodes) throws IOException {
        ZipFile zipFile = null;
        boolean isZipFile = false;
        try {
            zipFile = new ZipFile(dexFile);
            // if we get here, it's safe to assume we have a zip file
            isZipFile = true;

            String zipEntryName = Objects.firstNonNull(dexEntry, "classes.dex");
            ZipEntry zipEntry = zipFile.getEntry(zipEntryName);
            if (zipEntry == null) {
                throw new DexFileNotFound("zip file %s does not contain a %s file",
                        dexFile.getName(), zipEntryName);
            }
            long fileLength = zipEntry.getSize();
            if (fileLength < 40) {
                throw new ExceptionWithContext("The %s file in %s is too small to be a valid dex file",
                        zipEntryName, dexFile.getName());
            } else if (fileLength > Integer.MAX_VALUE) {
                throw new ExceptionWithContext("The %s file in %s is too large to read in",
                        zipEntryName, dexFile.getName());
            }
            byte[] dexBytes = new byte[(int)fileLength];
            ByteStreams.readFully(zipFile.getInputStream(zipEntry), dexBytes);
            return new DexBackedDexFile(opcodes, dexBytes);
        } catch (IOException ex) {
            // don't continue on if we know it's a zip file
            if (isZipFile) {
                throw ex;
            }
        } finally {
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException ex) {
                    // just eat it
                }
            }
        }

        InputStream inputStream = new BufferedInputStream(new FileInputStream(dexFile));

        try {
            return DexBackedDexFile.fromInputStream(opcodes, inputStream);
        } catch (DexBackedDexFile.NotADexFile ex) {
            // just eat it
        }

        // Note: DexBackedDexFile.fromInputStream will reset inputStream back to the same position, if it fails

        try {
            return DexBackedOdexFile.fromInputStream(opcodes, inputStream);
        } catch (DexBackedOdexFile.NotAnOdexFile ex) {
            // just eat it
        }

        if (opcodes.api >= 21) {
            OatFile oatFile = null;
            try {
                oatFile = OatFile.fromInputStream(opcodes, inputStream);
            } catch (NotAnOatFileException ex) {
                // just eat it
            }

            if (oatFile != null) {
                List<OatDexFile> oatDexFiles = oatFile.getDexFiles();

                if (oatDexFiles.size() == 0) {
                    throw new DexFileNotFound("Oat file %s contains no dex files", dexFile.getName());
                }

                if (dexEntry == null) {
                    if (oatDexFiles.size() > 1) {
                        throw new MultipleDexFilesException(oatFile);
                    }
                    return oatDexFiles.get(0);
                } else {
                    // first check for an exact match
                    for (OatDexFile oatDexFile : oatFile.getDexFiles()) {
                        if (oatDexFile.filename.equals(dexEntry)) {
                            return oatDexFile;
                        }
                    }

                    if (!dexEntry.contains("/")) {
                        for (OatDexFile oatDexFile : oatFile.getDexFiles()) {
                            File oatEntryFile = new File(oatDexFile.filename);
                            if (oatEntryFile.getName().equals(dexEntry)) {
                                return oatDexFile;
                            }
                        }
                    }

                    throw new DexFileNotFound("oat file %s does not contain a dex file named %s",
                            dexFile.getName(), dexEntry);
                }
            }
        }

        throw new ExceptionWithContext("%s is not an apk, dex, odex or oat file.", dexFile.getPath());
    }

    public static void writeDexFile(String path, DexFile dexFile) throws IOException {
        DexPool.writeTo(path, dexFile);
    }

    private DexFileFactory() {}

    public static class DexFileNotFound extends ExceptionWithContext {
        public DexFileNotFound(Throwable cause) {
            super(cause);
        }

        public DexFileNotFound(Throwable cause, String message, Object... formatArgs) {
            super(cause, message, formatArgs);
        }

        public DexFileNotFound(String message, Object... formatArgs) {
            super(message, formatArgs);
        }
    }

    public static class MultipleDexFilesException extends ExceptionWithContext {
        public final OatFile oatFile;

        public MultipleDexFilesException(OatFile oatFile) {
            super("Oat file has multiple dex files.");
            this.oatFile = oatFile;
        }
    }
}
