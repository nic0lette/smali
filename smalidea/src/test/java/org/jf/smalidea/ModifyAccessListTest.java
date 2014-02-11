package org.jf.smalidea;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import org.jf.smalidea.psi.impl.SmaliFileImpl;

public class ModifyAccessListTest extends LightCodeInsightFixtureTestCase {

    public void testModifyAccessList() {
        myFixture.configureByText("test.smali",
                ".class public Lmy/test/class;\n" +
                ".super Ljava/lang/Object;");


        ApplicationManager.getApplication().runWriteAction(new Runnable() {
            @Override public void run() {
                ((SmaliFileImpl)myFixture.getFile()).getPsiClass().getModifierList().setModifierProperty("final", true);
            }
        });

        myFixture.checkResult(
                ".class public final Lmy/test/class;\n" +
                ".super Ljava/lang/Object;");
    }
}
