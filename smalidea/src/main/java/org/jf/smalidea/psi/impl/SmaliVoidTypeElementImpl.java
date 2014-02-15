package org.jf.smalidea.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiAnnotation;
import com.intellij.psi.PsiJavaCodeReferenceElement;
import com.intellij.psi.PsiType;
import com.intellij.psi.impl.source.tree.LeafPsiElement;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

    @NotNull @Override public PsiAnnotation[] getAnnotations() {
        return new PsiAnnotation[0];
    }

    @Nullable @Override public PsiJavaCodeReferenceElement getInnermostComponentReferenceElement() {
        return null;
    }

    @NotNull @Override public PsiAnnotation[] getApplicableAnnotations() {
        return new PsiAnnotation[0];
    }

    @Nullable @Override public PsiAnnotation findAnnotation(@NotNull @NonNls String qualifiedName) {
        return null;
    }

    @NotNull @Override public PsiAnnotation addAnnotation(@NotNull @NonNls String qualifiedName) {
        throw new UnsupportedOperationException();
    }
}
