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

package org.jf.smalidea.debugging;

import com.intellij.debugger.DebuggerBundle;
import com.intellij.debugger.actions.AbstractSteppingActionHandler;
import com.intellij.debugger.engine.DebugProcessImpl;
import com.intellij.debugger.engine.RequestHint;
import com.intellij.debugger.engine.SuspendContextImpl;
import com.intellij.debugger.engine.evaluation.EvaluateException;
import com.intellij.debugger.engine.requests.MethodReturnValueWatcher;
import com.intellij.debugger.impl.DebuggerContextImpl;
import com.intellij.debugger.impl.DebuggerSession;
import com.intellij.debugger.impl.DebuggerStateManager;
import com.intellij.debugger.impl.DebuggerUtilsEx;
import com.intellij.debugger.jdi.StackFrameProxyImpl;
import com.intellij.debugger.jdi.ThreadReferenceProxyImpl;
import com.intellij.debugger.settings.DebuggerSettings;
import com.intellij.debugger.ui.JavaDebuggerSupport;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.project.Project;
import com.intellij.ui.classFilter.ClassFilter;
import com.intellij.ui.classFilter.DebuggerClassFilterProvider;
import com.intellij.xdebugger.impl.actions.DebuggerActionHandler;
import com.sun.jdi.Location;
import com.sun.jdi.ObjectCollectedException;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.StepRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SmaliDebuggerSupport extends JavaDebuggerSupport {
    /*
     * This method is based on, and is intended to replicate the following series of calls:
     * - getStepOverhandler() in java/debugger/impl/src/com/intellij/debugger/ui/JavaDebuggerSupport.java
     *   at revision e7fe08a983e3483ee62e61b82f54daf068ed2c06 (Nov-25 2011)
     * - java/debugger/impl/src/com/intellij/debugger/actions/StepOverActionHandler.java
     *   at revision 0d2b409276faa90a10b5c62fb740ab07eb7fa0c3 (Oct-11 2009)
     * - stepOver() in java/debugger/impl/src/com/intellij/debugger/impl/DebuggerSession.java
     *   at revision 524751e07a275e482607f3c1a131025bf7824584 (Dec-9 2011)
     * - createStepOverCommand() in java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java
     *   at revision fa7e4eeb1a07b8789992cd5db86c0c742594b3cc (Feb-27 2012)
     * - StepOverCommand in java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java
     *   at revision fa7e4eeb1a07b8789992cd5db86c0c742594b3cc (Feb-27 2012)
     *
     * with tweaks to support single-instruction stepping
     */
    @NotNull
    @Override
    public DebuggerActionHandler getStepOverHandler() {
        return new AbstractSteppingActionHandler() {
            @Override
            public void perform(@NotNull Project project, AnActionEvent event) {
                final DebuggerSession session = getSession(project);
                if (session != null) {
                    DebuggerStateManager contextManager = session.getContextManager();
                    final SuspendContextImpl suspendContext = contextManager.getContext().getSuspendContext();
                    final DebugProcessImpl debugProcess = session.getProcess();

                    DebugProcessImpl.ResumeCommand command = debugProcess.new ResumeCommand(suspendContext) {

                        @Override
                        public void contextAction() {
                            debugProcess.showStatusText(DebuggerBundle.message("status.step.over"));
                            final SuspendContextImpl suspendContext = getSuspendContext();
                            final ThreadReferenceProxyImpl stepThread = getContextThread();
                            // need this hint whil stepping over for JSR45 support:
                            // several lines of generated java code may correspond to a single line in the source file,
                            // from which the java code was generated
                            RequestHint hint = new RequestHint(stepThread, suspendContext, StepRequest.STEP_OVER);
                            hint.setRestoreBreakpoints(false);
                            hint.setIgnoreFilters(session.shouldIgnoreSteppingFilters());

                            applyThreadFilter(stepThread);

                            try {
                                Field field = DebugProcessImpl.class.getDeclaredField("myReturnValueWatcher");
                                field.setAccessible(true);
                                final MethodReturnValueWatcher rvWatcher = (MethodReturnValueWatcher)field.get(debugProcess);
                                if (rvWatcher != null) {
                                    rvWatcher.enable(stepThread.getThreadReference());
                                }
                            } catch (NoSuchFieldException ex) {
                                throw new RuntimeException(ex);
                            } catch (IllegalAccessException ex) {
                                throw new RuntimeException(ex);
                            }

                            doStep(suspendContext, stepThread, StepRequest.STEP_OVER, hint);

                            super.contextAction();
                        }
                    };
                    //TODO: check if we're in a smali file

                    DebuggerContextImpl SESSION_EMPTY_CONTEXT = DebuggerContextImpl.createDebuggerContext(session, null, null, null);

                    //TODO: use reflection to do this
                    //mySteppingThroughThreads.add(cmd.getContextThread());
                    contextManager.setState(SESSION_EMPTY_CONTEXT, DebuggerSession.STATE_WAIT_EVALUATION, DebuggerSession.EVENT_STEP, null);
                    debugProcess.getManagerThread().schedule(command);
                }
            }
        };
    }

    /*
     * Copied from java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java
     * at revision fa7e4eeb1a07b8789992cd5db86c0c742594b3cc (Feb-27 2012)
     */
    protected void doStep(final SuspendContextImpl suspendContext, final ThreadReferenceProxyImpl stepThread, int depth, RequestHint hint) {
        if (stepThread == null) {
            return;
        }
        try {
            final ThreadReference stepThreadReference = stepThread.getThreadReference();
            EventRequestManager requestManager = suspendContext.getDebugProcess().getVirtualMachineProxy().eventRequestManager();

            deleteStepRequests(requestManager, stepThreadReference);

            StepRequest stepRequest = requestManager.createStepRequest(stepThreadReference, StepRequest.STEP_MIN, depth);
            DebuggerSettings settings = DebuggerSettings.getInstance();
            if (!(hint != null && hint.isIgnoreFilters()) /*&& depth == StepRequest.STEP_INTO*/) {
                final List<ClassFilter> activeFilters = new ArrayList<ClassFilter>();
                if (settings.TRACING_FILTERS_ENABLED) {
                    for (ClassFilter filter : settings.getSteppingFilters()) {
                        if (filter.isEnabled()) {
                            activeFilters.add(filter);
                        }
                    }
                }
                for (DebuggerClassFilterProvider provider : Extensions.getExtensions(DebuggerClassFilterProvider.EP_NAME)) {
                    for (ClassFilter filter : provider.getFilters()) {
                        if (filter.isEnabled()) {
                            activeFilters.add(filter);
                        }
                    }
                }

                if (!activeFilters.isEmpty()) {
                    final String currentClassName = getCurrentClassName(stepThread);
                    if (currentClassName == null || !DebuggerUtilsEx.isFiltered(currentClassName, activeFilters)) {
                        // add class filters
                        for (ClassFilter filter : activeFilters) {
                            stepRequest.addClassExclusionFilter(filter.getPattern());
                        }
                    }
                }
            }

            // suspend policy to match the suspend policy of the context:
            // if all threads were suspended, then during stepping all the threads must be suspended
            // if only event thread were suspended, then only this particular thread must be suspended during stepping
            stepRequest.setSuspendPolicy(suspendContext.getSuspendPolicy() == EventRequest.SUSPEND_EVENT_THREAD? EventRequest.SUSPEND_EVENT_THREAD : EventRequest.SUSPEND_ALL);

            if (hint != null) {
                //noinspection HardCodedStringLiteral
                stepRequest.putProperty("hint", hint);
            }
            stepRequest.enable();
        }
        catch (ObjectCollectedException ignored) {

        }
    }

    /*
     * Copied from java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java
     * at revision fa7e4eeb1a07b8789992cd5db86c0c742594b3cc (Feb-27 2012)
     */
    private void deleteStepRequests(EventRequestManager requestManager, @Nullable final ThreadReference stepThread) {
        List<StepRequest> stepRequests = requestManager.stepRequests();
        if (!stepRequests.isEmpty()) {
            final List<StepRequest> toDelete = new ArrayList<StepRequest>(stepRequests.size());
            for (final StepRequest request : stepRequests) {
                ThreadReference threadReference = request.thread();
                // [jeka] on attempt to delete a request assigned to a thread with unknown status, a JDWP error occures
                if (threadReference.status() != ThreadReference.THREAD_STATUS_UNKNOWN && (stepThread == null || stepThread.equals(threadReference))) {
                    toDelete.add(request);
                }
            }
            requestManager.deleteEventRequests(toDelete);
        }
    }

    /*
     * Copied from java/debugger/impl/src/com/intellij/debugger/engine/DebugProcessImpl.java
     * at revision fa7e4eeb1a07b8789992cd5db86c0c742594b3cc (Feb-27 2012)
     */
    @Nullable
    private static String getCurrentClassName(ThreadReferenceProxyImpl thread) {
        try {
            if (thread != null && thread.frameCount() > 0) {
                StackFrameProxyImpl stackFrame = thread.frame(0);
                Location location = stackFrame.location();
                ReferenceType referenceType = location.declaringType();
                if (referenceType != null) {
                    return referenceType.name();
                }
            }
        }
        catch (EvaluateException ignored) {
        }
        return null;
    }
}
