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

import com.google.common.collect.Maps;
import com.intellij.debugger.DebuggerManagerEx;
import com.intellij.debugger.SourcePosition;
import com.intellij.debugger.engine.DebugProcessImpl;
import com.intellij.debugger.engine.evaluation.*;
import com.intellij.debugger.engine.evaluation.expression.EvaluatorBuilder;
import com.intellij.debugger.engine.events.DebuggerCommandImpl;
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
import org.jf.dexlib2.analysis.AnalyzedInstruction;
import org.jf.dexlib2.analysis.RegisterType;
import org.jf.smalidea.psi.iface.SmaliMethod;
import org.jf.smalidea.psi.impl.SmaliInstructionImpl;
import org.jf.smalidea.psi.impl.SmaliMethodImpl;

import java.lang.reflect.Constructor;
import java.util.Map;

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


        AnalyzedInstruction analyzedInstruction = ((SmaliInstructionImpl)currentInstruction).getAnalyzedInstruction();

        final Map<String, String> registerMap = Maps.newHashMap();
        StringBuilder variablesText = new StringBuilder();
        for (int i=0; i<((SmaliMethodImpl)currentMethod).getRegisters(); i++) {
            RegisterType registerType = analyzedInstruction.getPreInstructionRegisterType(i);
            switch (registerType.category) {
                case RegisterType.UNKNOWN:
                case RegisterType.UNINIT:
                case RegisterType.CONFLICTED:
                case RegisterType.LONG_HI:
                case RegisterType.DOUBLE_HI:
                    continue;
                case RegisterType.NULL:
                case RegisterType.ONE:
                case RegisterType.INTEGER:
                    variablesText.append("int v").append(i).append(";\n");
                    registerMap.put("v" + i, "I");
                    break;
                case RegisterType.BOOLEAN:
                    variablesText.append("boolean v").append(i).append(";\n");
                    registerMap.put("v" + i, "Z");
                    break;
                case RegisterType.BYTE:
                case RegisterType.POS_BYTE:
                    variablesText.append("byte v").append(i).append(";\n");
                    registerMap.put("v" + i, "B");
                    break;
                case RegisterType.SHORT:
                case RegisterType.POS_SHORT:
                    variablesText.append("short v").append(i).append(";\n");
                    registerMap.put("v" + i, "S");
                    break;
                case RegisterType.CHAR:
                    variablesText.append("char v").append(i).append(";\n");
                    registerMap.put("v" + i, "C");
                    break;
                case RegisterType.FLOAT:
                    variablesText.append("float v").append(i).append(";\n");
                    registerMap.put("v" + i, "F");
                    break;
                case RegisterType.LONG_LO:
                    variablesText.append("long v").append(i).append(";\n");
                    registerMap.put("v" + i, "J");
                    break;
                case RegisterType.DOUBLE_LO:
                    variablesText.append("double v").append(i).append(";\n");
                    registerMap.put("v" + i, "D");
                    break;
                case RegisterType.UNINIT_REF:
                case RegisterType.UNINIT_THIS:
                case RegisterType.REFERENCE:
                    variablesText.append("Object v").append(i).append(";\n");
                    registerMap.put("v" + i, "Ljava/lang/Object;");
                    break;
            }
        }
        final TextWithImportsImpl textWithImports = new TextWithImportsImpl(CodeFragmentKind.CODE_BLOCK,
                variablesText.toString(), "", myDelegate.getFileType());

        final JavaCodeFragment codeFragment = myDelegate.createCodeFragment(textWithImports, originalContext, project);


        codeFragment.accept(new JavaRecursiveElementVisitor() {
            public void visitLocalVariable(final PsiLocalVariable variable) {
                final String name = variable.getName();
                if (registerMap.containsKey(name)) {
                    debuggerContext.getDebugProcess().getManagerThread().invoke(new DebuggerCommandImpl() {
                        @Override protected void action() throws Exception {
                            Value value = evaluateRegister(debuggerContext.createEvaluationContext(),
                                    Integer.parseInt(name.substring(1)),
                                    registerMap.get(name));
                            variable.putUserData(CodeFragmentFactoryContextWrapper.LABEL_VARIABLE_VALUE_KEY, value);
                        }
                    });


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

    public Value evaluateRegister(EvaluationContextImpl context, final int registerNum, final String type) {
        final StackFrameProxyImpl frameProxy = context.getFrameProxy();
        if (frameProxy == null) {
            return null;
        }

        // the jdi apis don't provide any way to get the value of an arbitrary register, so we use reflection
        // to create a LocalVariable instance for the register
        final Value[] ret = new Value[1];

        DebugProcessImpl debugProcess = context.getDebugProcess();
        debugProcess.getManagerThread().invoke(
                new DebuggerCommandImpl() {

                    @Override protected void action() throws Exception {
                        VirtualMachine vm = frameProxy.getVirtualMachine().getVirtualMachine();
                        Method method = frameProxy.location().method();

                        final Constructor<LocalVariableImpl> localVariableConstructor = LocalVariableImpl.class.getDeclaredConstructor(
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
                                String.format("v%d", registerNum), type, null);

                        ret[0] = frameProxy.getStackFrame().getValue(localVariable);
                    }
                }
        );

        return ret[0];
    }
}