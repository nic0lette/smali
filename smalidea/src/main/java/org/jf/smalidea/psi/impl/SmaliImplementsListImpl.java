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

package org.jf.smalidea.psi.impl;

import com.google.common.collect.Lists;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliClass;
import org.jf.smalidea.psi.stub.SmaliImplementsListStub;
import org.jf.smalidea.psi.stub.element.SmaliImplementsListElementType;

import java.util.List;

public class SmaliImplementsListImpl extends SmaliBaseReferenceListImpl<SmaliImplementsListStub> {
    public SmaliImplementsListImpl(@NotNull ASTNode node) {
        super(node);
    }

    public SmaliImplementsListImpl(@NotNull SmaliImplementsListStub stub) {
        super(stub, SmaliImplementsListElementType.INSTANCE);
    }

    @Override public Role getRole() {
        return Role.EXTENDS_LIST;
    }

    @NotNull @Override public SmaliClassTypeElementImpl[] getReferenceElementsSmali() {
        // TODO: get from stub, when possible

        PsiElement parent = getParent();

        if (!((SmaliClass)parent).isInterface()) {
            // all implemented interfaces go in the extends list for an interface
            ASTNode[] implementSpecs = parent.getNode().getChildren(TokenSet.create(ElementTypes.IMPLEMENTS_SPEC));
            List<SmaliClassTypeElementImpl> types = Lists.newArrayList();

            for (int i=0; i<implementSpecs.length; i++) {
                ASTNode implementType = implementSpecs[i].findChildByType(ElementTypes.CLASS_TYPE);
                if (implementType != null) {
                    types.add((SmaliClassTypeElementImpl)implementType.getPsi());
                }
            }
            return types.toArray(new SmaliClassTypeElementImpl[types.size()]);
        }
        return new SmaliClassTypeElementImpl[0];
    }
}
