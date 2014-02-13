package org.jf.smalidea.psi.stub.element;

import com.intellij.psi.stubs.StubElement;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.SmaliLanguage;
import org.jf.smalidea.psi.impl.SmaliExtendsListImpl;
import org.jf.smalidea.psi.stub.SmaliExtendsListStub;

public class SmaliExtendsListElementType
        extends SmaliBaseReferenceListElementType<SmaliExtendsListStub, SmaliExtendsListImpl> {
    public static final SmaliExtendsListElementType INSTANCE = new SmaliExtendsListElementType();

    public SmaliExtendsListElementType() {
        super("smali extends list", SmaliLanguage.INSTANCE);
    }

    @NotNull @Override public String getExternalId() {
        return "smali.extendslist";
    }

    @Override protected SmaliExtendsListStub createStub(StubElement parentStub, String[] references) {
        return new SmaliExtendsListStub(parentStub, references);
    }

    @Override public SmaliExtendsListImpl createPsi(@NotNull SmaliExtendsListStub stub) {
        return new SmaliExtendsListImpl(stub);
    }

    @Override public SmaliExtendsListStub createStub(@NotNull SmaliExtendsListImpl psi, StubElement parentStub) {
        return new SmaliExtendsListStub(parentStub, psi.getReferenceNames());
    }
}
