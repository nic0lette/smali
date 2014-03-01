/*
 * Copyright 2014, Google Inc.
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

package org.jf.smalidea.psi.stub.element;

import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.SmaliLanguage;
import org.jf.smalidea.psi.iface.SmaliField;
import org.jf.smalidea.psi.impl.SmaliFieldImpl;
import org.jf.smalidea.psi.index.SmaliShortFieldNameIndex;
import org.jf.smalidea.psi.stub.SmaliFieldStub;

import java.io.IOException;

public class SmaliFieldElementType extends IStubElementType<SmaliFieldStub, SmaliField> {
    public static final SmaliFieldElementType INSTANCE = new SmaliFieldElementType();

    public SmaliFieldElementType() {
        super("smali field", SmaliLanguage.INSTANCE);
    }

    @NotNull @Override public String getExternalId() {
        return "smali.field";
    }

    @Override public SmaliField createPsi(@NotNull SmaliFieldStub stub) {
        return new SmaliFieldImpl(stub);
    }

    @Override public SmaliFieldStub createStub(@NotNull SmaliField psi, StubElement parentStub) {
        return new SmaliFieldStub(parentStub, psi.getAccessFlags(), psi.getName(), psi.getType().getCanonicalText());
    }

    @Override
    public void serialize(@NotNull SmaliFieldStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getName());
        dataStream.writeName(stub.getType());
        dataStream.writeInt(stub.getAccessFlags());
    }

    @NotNull @Override
    public SmaliFieldStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        String name = dataStream.readName().getString();
        String type = dataStream.readName().getString();
        int accessFlags = dataStream.readInt();
        return new SmaliFieldStub(parentStub, accessFlags, name, type);
    }

    @Override public void indexStub(@NotNull SmaliFieldStub stub, @NotNull IndexSink sink) {
        sink.occurrence(SmaliShortFieldNameIndex.KEY, stub.getName());
        // TODO: need to index in JavaStubIndexKeys.JVM_STATIC_MEMBERS_NAMES and JavaStubIndexKeys.JVM_STATIC_MEMBERS_TYPES?
    }
}
