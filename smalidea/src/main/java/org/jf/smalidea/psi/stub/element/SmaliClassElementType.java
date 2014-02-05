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

import com.intellij.psi.stubs.*;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.psi.iface.SmaliClass;
import org.jf.smalidea.SmaliLanguage;
import org.jf.smalidea.psi.impl.SmaliClassImpl;
import org.jf.smalidea.psi.stub.SmaliClassStub;
import org.jf.smalidea.psi.index.SmaliClassNameIndex;

import java.io.IOException;

public class SmaliClassElementType extends IStubElementType<SmaliClassStub, SmaliClass> {
    public static final SmaliClassElementType INSTANCE = new SmaliClassElementType();

    private SmaliClassElementType() {
        super("smali class", SmaliLanguage.INSTANCE);
    }

    @Override
    public SmaliClass createPsi(@NotNull SmaliClassStub stub) {
        return new SmaliClassImpl(stub, this);
    }

    @Override
    public SmaliClassStub createStub(@NotNull SmaliClass psi, StubElement parentStub) {
        return new SmaliClassStub(parentStub, this, psi.getQualifiedName());
    }

    @Override
    public String getId(SmaliClassStub stub) {
        return stub.getName();
    }

    public String getExternalId() {
        return "smali.class";
    }

    public void serialize(SmaliClassStub stub, StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getQualifiedName());
    }

    public SmaliClassStub deserialize(StubInputStream dataStream, StubElement parentStub) throws IOException {
        String name = dataStream.readName().getString();
        return new SmaliClassStub(parentStub, this, name);
    }

    public void indexStub(SmaliClassStub stub, IndexSink sink) {
        sink.occurrence(SmaliClassNameIndex.KEY, stub.getQualifiedName());
    }
}
