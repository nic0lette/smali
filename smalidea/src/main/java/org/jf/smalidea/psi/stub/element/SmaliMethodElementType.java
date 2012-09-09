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

package org.jf.smalidea.psi.stub.element;

import com.intellij.lang.Language;
import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.SmaliLanguage;
import org.jf.smalidea.psi.iface.SmaliMethod;
import org.jf.smalidea.psi.impl.SmaliMethodImpl;
import org.jf.smalidea.psi.stub.SmaliClassStub;
import org.jf.smalidea.psi.stub.SmaliMethodStub;

import java.io.IOException;

public class SmaliMethodElementType extends IStubElementType<SmaliMethodStub, SmaliMethod> {
    public static final SmaliMethodElementType INSTANCE = new SmaliMethodElementType();

    private SmaliMethodElementType() {
        super("smali method", SmaliLanguage.INSTANCE);
    }

    @Override
    public SmaliMethod createPsi(@NotNull SmaliMethodStub stub) {
        return new SmaliMethodImpl(stub, this);
    }

    @Override
    public SmaliMethodStub createStub(@NotNull SmaliMethod psi, StubElement parentStub) {
        return new SmaliMethodStub(parentStub, this, psi.getMethodNameAndProto());
    }

    public String getExternalId() {
        return "smali.method";
    }

    public void serialize(SmaliMethodStub stub, StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getNameAndProto());
    }

    public SmaliMethodStub deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
        String nameAndProto = dataStream.readName().getString();
        return new SmaliMethodStub(parentStub, this, nameAndProto);
    }

    public void indexStub(SmaliMethodStub stub, IndexSink sink) {
    }
}
