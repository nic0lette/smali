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

package org.jf.smalidea.debugging;

import com.intellij.debugger.DebuggerManagerEx;
import com.intellij.debugger.SourcePosition;
import com.intellij.debugger.engine.evaluation.*;
import com.intellij.debugger.engine.evaluation.expression.EvaluatorBuilder;
import com.intellij.debugger.impl.DebuggerContextImpl;
import com.intellij.debugger.jdi.StackFrameProxyImpl;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.project.Project;
import com.intellij.psi.JavaCodeFragment;
import com.intellij.psi.JavaRecursiveElementVisitor;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiLocalVariable;
import com.sun.jdi.*;
import com.sun.tools.jdi.LocalVariableImpl;
import com.sun.tools.jdi.LocationImpl;
import org.jf.smalidea.psi.iface.SmaliMethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SmaliCodeFragmentFactory extends CodeFragmentFactory {
    private final CodeFragmentFactory myDelegate;

    public SmaliCodeFragmentFactory() {
        myDelegate = DefaultCodeFragmentFactory.getInstance();
    }

    public JavaCodeFragment createCodeFragment(TextWithImports item, PsiElement context, Project project) {
        return myDelegate.createCodeFragment(item, wrapContext(project, context), project);
    }

    public JavaCodeFragment createPresentationCodeFragment(TextWithImports item, PsiElement context, Project project) {
        return myDelegate.createPresentationCodeFragment(item, wrapContext(project, context), project);
    }

    public boolean isContextAccepted(PsiElement contextElement) {
        return myDelegate.isContextAccepted(contextElement);
    }

    public LanguageFileType getFileType() {
        return myDelegate.getFileType();
    }

    @Override
    public EvaluatorBuilder getEvaluatorBuilder() {
        return myDelegate.getEvaluatorBuilder();
    }

    private PsiElement wrapContext(final Project project, final PsiElement originalContext) {
        if (project.isDefault()) return originalContext;

        final DebuggerContextImpl debuggerContext = DebuggerManagerEx.getInstanceEx(project).getContext();

        SourcePosition position = debuggerContext.getSourcePosition();
        PsiElement currentInstruction = position.getElementAt();

        PsiElement currentMethod = currentInstruction;
        while (currentMethod != null && !(currentMethod instanceof SmaliMethod)) {
            currentMethod = currentMethod.getParent();
        }

        String variablesText = "java.lang.Object v18; ";
        final TextWithImportsImpl textWithImports = new TextWithImportsImpl(CodeFragmentKind.CODE_BLOCK,
                variablesText, "", myDelegate.getFileType());

        final JavaCodeFragment codeFragment = myDelegate.createCodeFragment(textWithImports, originalContext, project);

        codeFragment.accept(new JavaRecursiveElementVisitor() {
            public void visitLocalVariable(PsiLocalVariable variable) {
                final String name = variable.getName();
                if (name.equals("v18")) {
                    Value value = evaluateRegister(debuggerContext.createEvaluationContext(), 18);
                    variable.putUserData(CodeFragmentFactoryContextWrapper.LABEL_VARIABLE_VALUE_KEY, value);
                }
            }
        });

        int offset = variablesText.length() - 1;

        final PsiElement newContext = codeFragment.findElementAt(offset);
        if (newContext != null) {
            return newContext;
        }
        return originalContext;
    }

    public Value evaluateRegister(EvaluationContextImpl context, int registerNum) {
        StackFrameProxyImpl frameProxy = context.getFrameProxy();
        if (frameProxy == null) {
            return null;
        }

        try {
            // the jdi apis don't provide any way to get the value of an arbitrary register, so we use reflection
            // to create a LocalVariable instance for the register
            VirtualMachine vm = frameProxy.getVirtualMachine().getVirtualMachine();
            Method method = frameProxy.location().method();

            Constructor<LocalVariableImpl> localVariableConstructor = LocalVariableImpl.class.getDeclaredConstructor(
                    VirtualMachine.class, Method.class, Integer.TYPE, Location.class, Location.class, String.class,
                    String.class, String.class);
            localVariableConstructor.setAccessible(true);

            Constructor<LocationImpl> locationConstructor = LocationImpl.class.getDeclaredConstructor(
                    VirtualMachine.class, Method.class, Long.TYPE);
            locationConstructor.setAccessible(true);

            // TODO: use frameProxy.location().method().locationOfCodeIndex() here
            Location endLocation = locationConstructor.newInstance(vm, method, Integer.MAX_VALUE);

            LocalVariable localVariable = localVariableConstructor.newInstance(vm,
                    method,
                    registerNum,
                    frameProxy.location().method().locationOfCodeIndex(0),
                    endLocation,
                    String.format("v%d", registerNum), "Ljava/lang/Object;", null);
            return frameProxy.getStackFrame().getValue(localVariable);
        } catch (NoSuchMethodException ex) {
            return null;
        } catch (IllegalAccessException ex) {
            return null;
        } catch (InstantiationException ex) {
            return null;
        } catch (InvocationTargetException ex) {
            return null;
        } catch (EvaluateException e) {
            return null;
        }
    }
}
