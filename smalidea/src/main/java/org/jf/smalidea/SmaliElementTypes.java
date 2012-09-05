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

import com.intellij.psi.tree.IElementType;

public class SmaliElementTypes {
    public static final IElementType CLASS_DECLARATION = new IElementType("class declaration", SmaliLanguage.INSTANCE);
    public static final IElementType CLASS_DESCRIPTOR = new IElementType("class descriptor", SmaliLanguage.INSTANCE);

    public static final IElementType SMALI_FILE = new IElementType("smali file", SmaliLanguage.INSTANCE);
    public static final IElementType CLASS_SPEC = new IElementType("class spec", SmaliLanguage.INSTANCE);
    public static final IElementType SUPER_SPEC = new IElementType("super spec", SmaliLanguage.INSTANCE);
    public static final IElementType IMPLEMENTS_SPEC = new IElementType("implements spec", SmaliLanguage.INSTANCE);
    public static final IElementType SOURCE_SPEC = new IElementType("source spec", SmaliLanguage.INSTANCE);
    public static final IElementType ACCESS_LIST = new IElementType("access list", SmaliLanguage.INSTANCE);
    public static final IElementType FIELD = new IElementType("field", SmaliLanguage.INSTANCE);
    public static final IElementType FIELD_ANNOTATIONS = new IElementType("field annotations", SmaliLanguage.INSTANCE);
    public static final IElementType CLASS_ANNOTATIONS = new IElementType("class annotations", SmaliLanguage.INSTANCE);
    public static final IElementType ANNOTATION = new IElementType("annotation", SmaliLanguage.INSTANCE);
    public static final IElementType METHOD = new IElementType("method", SmaliLanguage.INSTANCE);

    public static final IElementType METHOD_BODY = new IElementType("method body", SmaliLanguage.INSTANCE);
    public static final IElementType REGISTERS_SPEC = new IElementType("registers spec", SmaliLanguage.INSTANCE);
    public static final IElementType SIMPLE_NAME = new IElementType("simple name", SmaliLanguage.INSTANCE);
    public static final IElementType METHOD_NAME = new IElementType("method name", SmaliLanguage.INSTANCE);
    public static final IElementType METHOD_PROTOTYPE = new IElementType("method prototype", SmaliLanguage.INSTANCE);
    public static final IElementType INSTRUCTION = new IElementType("instruction", SmaliLanguage.INSTANCE);
}
