package org.jf.smalidea.psi.stub.element;

import com.intellij.psi.stubs.StubElement;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.SmaliLanguage;
import org.jf.smalidea.psi.impl.SmaliImplementsListImpl;
import org.jf.smalidea.psi.stub.SmaliImplementsListStub;

public class SmaliImplementsListElementType
        extends SmaliBaseReferenceListElementType<SmaliImplementsListStub, SmaliImplementsListImpl> {
    public static final SmaliImplementsListElementType INSTANCE = new SmaliImplementsListElementType();

    public SmaliImplementsListElementType() {
        super("smali implements list", SmaliLanguage.INSTANCE);
    }

    @NotNull @Override public String getExternalId() {
        return "smali.implementslist";
    }

    @Override protected SmaliImplementsListStub createStub(StubElement parentStub, String[] references) {
        return new SmaliImplementsListStub(parentStub, references);
    }

    @Override public SmaliImplementsListImpl createPsi(@NotNull SmaliImplementsListStub stub) {
        return new SmaliImplementsListImpl(stub);
    }

    @Override public SmaliImplementsListStub createStub(@NotNull SmaliImplementsListImpl psi, StubElement parentStub) {
        return new SmaliImplementsListStub(parentStub, psi.getReferenceNames());
    }
}