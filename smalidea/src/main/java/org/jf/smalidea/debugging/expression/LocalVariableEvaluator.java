/*
 * Copyright 2000-2009 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Class LocalVariableEvaluator
 * @author Jeka
 */
package org.jf.smalidea.debugging.expression;

import com.intellij.debugger.DebuggerBundle;
import com.intellij.debugger.engine.evaluation.EvaluateException;
import com.intellij.debugger.engine.evaluation.EvaluateExceptionUtil;
import com.intellij.debugger.engine.evaluation.EvaluationContextImpl;
import com.intellij.debugger.engine.evaluation.expression.Evaluator;
import com.intellij.debugger.engine.evaluation.expression.Modifier;
import com.intellij.debugger.jdi.LocalVariableProxyImpl;
import com.intellij.debugger.jdi.StackFrameProxyImpl;
import com.intellij.debugger.jdi.ThreadReferenceProxyImpl;
import com.intellij.debugger.ui.impl.watch.LocalVariableDescriptorImpl;
import com.intellij.debugger.ui.impl.watch.NodeDescriptorImpl;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.sun.jdi.*;
import com.sun.tools.jdi.LocalVariableImpl;
import com.sun.tools.jdi.LocationImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * This class is copied wholesale from
 * java/debugger/impl/src/com/intellij/debugger/engine/evaluation/expression/LocalVariableEvaluator.java
 * at revision 1949ef9dc7e91e5efaa2ac801fa374eb1e04586d (Nov-20 2009)
 *
 * And then modified to support evaluating dalvik registers in the form of vNN, or pNN
 */
public class LocalVariableEvaluator implements Evaluator {
  private static final Logger LOG = Logger.getInstance("#com.intellij.debugger.engine.evaluation.expression.LocalVariableEvaluator");

  private final String myLocalVariableName;
  private EvaluationContextImpl myContext;
  private LocalVariableProxyImpl myEvaluatedVariable;
  private int myParameterIndex = -1;

  public LocalVariableEvaluator(String localVariableName) {
    myLocalVariableName = localVariableName;
  }

  public void setParameterIndex(int parameterIndex) {
    myParameterIndex = parameterIndex;
  }

  private static final Pattern registerPattern = Pattern.compile("[rv]([0-9]+)", Pattern.CASE_INSENSITIVE);

  public Object evaluate(EvaluationContextImpl context) throws EvaluateException {
    StackFrameProxyImpl frameProxy = context.getFrameProxy();
    if (frameProxy == null) {
      throw EvaluateExceptionUtil.createEvaluateException(DebuggerBundle.message("evaluation.error.no.stackframe"));
    }

    try {
      ThreadReferenceProxyImpl threadProxy = null;
      int lastFrameIndex = -1;
      EvaluateException savedEx = null;

      try {
        LocalVariableProxyImpl local = frameProxy.visibleVariableByName(myLocalVariableName);
        if (local != null) {
          myEvaluatedVariable = local;
          myContext = context;
          return frameProxy.getValue(local);
        }
      } catch (EvaluateException e) {
        if (!(e.getCause() instanceof AbsentInformationException)) {
          throw e;
        }
        savedEx = e;
      }

      if (myParameterIndex >= 0) {
        final List<Value> values = frameProxy.getArgumentValues();
        if (!values.isEmpty() && myParameterIndex < values.size()) {
          return values.get(myParameterIndex);
        }
      }

      Matcher m = registerPattern.matcher(myLocalVariableName);
      if (m.matches()) {
        Object o = evaluateRegister(context, Integer.parseInt(m.group(1)));
        if (o != null) {
          return o;
        }
      }

      if (savedEx == null) {
        savedEx = EvaluateExceptionUtil.createEvaluateException(DebuggerBundle.message("evaluation.error.local.variable.missing", myLocalVariableName));
      }
      throw savedEx;
    } catch (EvaluateException e) {
      myEvaluatedVariable = null;
      myContext = null;
      throw e;
    }
  }

  public Object evaluateRegister(EvaluationContextImpl context, int registerNum) throws EvaluateException {
    StackFrameProxyImpl frameProxy = context.getFrameProxy();
    if (frameProxy == null) {
      throw EvaluateExceptionUtil.createEvaluateException(DebuggerBundle.message("evaluation.error.no.stackframe"));
    }

    try {
      VirtualMachine vm = frameProxy.getVirtualMachine().getVirtualMachine();
      Method method = frameProxy.location().method();

      Constructor<LocalVariableImpl> constructor = LocalVariableImpl.class.getDeclaredConstructor(
              VirtualMachine.class, Method.class, Integer.TYPE, Location.class, Location.class, String.class,
              String.class, String.class);
      constructor.setAccessible(true);

      Constructor<LocationImpl> locationConstructor = LocationImpl.class.getDeclaredConstructor(
              VirtualMachine.class, Method.class, Long.TYPE);
      locationConstructor.setAccessible(true);

      Location endLocation = locationConstructor.newInstance(vm, method, Integer.MAX_VALUE);

      LocalVariable localVariable = constructor.newInstance(vm,
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
    }
  }

  public Modifier getModifier() {
    Modifier modifier = null;
    if (myEvaluatedVariable != null && myContext != null) {
      modifier = new Modifier() {
        public boolean canInspect() {
          return true;
        }

        public boolean canSetValue() {
          return true;
        }

        public void setValue(Value value) throws ClassNotLoadedException, InvalidTypeException {
          StackFrameProxyImpl frameProxy = myContext.getFrameProxy();
          try {
            frameProxy.setValue(myEvaluatedVariable, value);
          } catch (EvaluateException e) {
            LOG.error(e);
          }
        }

        public Type getExpectedType() throws ClassNotLoadedException {
          try {
            return myEvaluatedVariable.getType();
          } catch (EvaluateException e) {
            LOG.error(e);
            return null;
          }
        }

        public NodeDescriptorImpl getInspectItem(Project project) {
          return new LocalVariableDescriptorImpl(project, myEvaluatedVariable);
        }
      };
    }
    return modifier;
  }
}
