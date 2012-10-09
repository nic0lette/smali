package org.jf.smalidea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.*;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import org.jetbrains.annotations.NotNull;
import org.jf.smalidea.psi.ElementTypes;
import org.jf.smalidea.psi.iface.SmaliTypeElement;

public class SmaliVoidTypeElementImpl extends LeafPsiElement implements SmaliTypeElement {
    public SmaliVoidTypeElementImpl(@NotNull ASTNode node) {
        super(node.getElementType(), node.getText());
    }

    public SmaliVoidTypeElementImpl(@NotNull CharSequence text) {
        super(ElementTypes.VOID_TYPE, text);
    }

    @NotNull
    @Override
    public PsiType getType() {
        return PsiType.VOID;
    }
}
