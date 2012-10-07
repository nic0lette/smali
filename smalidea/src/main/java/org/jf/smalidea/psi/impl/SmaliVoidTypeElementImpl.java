package org.jf.smalidea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.psi.iface.SmaliTypeElement;

public class SmaliVoidTypeElementImpl extends ASTWrapperPsiElement implements SmaliTypeElement {
    public SmaliVoidTypeElementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @NotNull
    @Override
    public PsiType getType() {
        return PsiType.VOID;
    }
}
