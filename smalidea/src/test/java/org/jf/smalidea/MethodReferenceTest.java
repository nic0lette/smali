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

package org.jf.smalidea;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.psi.PsiElement;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import junit.framework.Assert;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliInstruction;
import org.jf.smalidea.psi.impl.SmaliFileImpl;
import org.jf.smalidea.psi.impl.SmaliInstructionImpl;
import org.jf.smalidea.psi.impl.SmaliMethodImpl;
import org.jf.smalidea.psi.impl.SmaliMethodReference;

import java.util.List;

public class MethodReferenceTest extends LightCodeInsightFixtureTestCase {

    public void testModifyAccessList() {
        myFixture.configureByText("test.smali",
                ".class public Ltest;\n" +
                        ".super Ljava/lang/Object;\n" +
                        ".method public static method1(Ljava/lang/String;)Ljava/lang/String;\n" +
                        "  return-void\n" +
                        ".end method\n" +
                        ".method public static method2()V\n" +
                        "  invoke-static {}, Ltest;->method1(Ljava/lang/String;)Ljava/lang/String;\n" +
                        ".end method\n");


        ApplicationManager.getApplication().runWriteAction(new Runnable() {
            @Override public void run() {
                List<SmaliInstruction> instructions =
                        ((SmaliMethodImpl)((SmaliFileImpl)myFixture.getFile()).getPsiClass().getAllMethods()[1]).getInstructions();

                SmaliMethodReference methodRef = (SmaliMethodReference)((SmaliInstructionImpl)instructions.get(0)).getNode().findChildByType(ElementTypes.METHOD_REFERENCE).getPsi();

                Assert.assertNotNull(methodRef);

                PsiElement resolved = methodRef.resolve();
                Assert.assertNotNull(resolved);
                Assert.assertTrue(resolved instanceof SmaliMethodImpl);
                Assert.assertEquals("method1", ((SmaliMethodImpl)resolved).getName());
            }
        });
    }
}
