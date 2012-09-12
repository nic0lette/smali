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

import com.intellij.debugger.NoDataException;
import com.intellij.debugger.PositionManager;
import com.intellij.debugger.SourcePosition;
import com.intellij.debugger.engine.DebugProcess;
import com.intellij.debugger.requests.ClassPrepareRequestor;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.util.Computable;
import com.intellij.psi.PsiClass;
import com.intellij.psi.PsiElement;
import com.intellij.psi.search.GlobalSearchScope;
import com.sun.jdi.Location;
import com.sun.jdi.ReferenceType;
import com.sun.jdi.request.ClassPrepareRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jf.smalidea.psi.iface.SmaliMethod;
import org.jf.smalidea.psi.index.SmaliClassNameIndex;
import org.jf.smalidea.psi.iface.SmaliClass;
import org.jf.smalidea.psi.index.SmaliMethodNameAndProtoIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SmaliPositionManager implements PositionManager {
    private final DebugProcess debugProcess;

    public SmaliPositionManager(DebugProcess debugProcess) {
        this.debugProcess = debugProcess;
    }

    public SourcePosition getSourcePosition(@Nullable Location location) throws NoDataException {
        String sig = location.declaringType().signature();
        Collection<SmaliClass> classes = SmaliClassNameIndex.INSTANCE.get(sig, debugProcess.getProject(),
                GlobalSearchScope.projectScope(debugProcess.getProject()));

        if (classes.size() > 0) {
            SmaliClass smaliClass = classes.iterator().next();

            String methodNameAndProto = location.method().name() + location.method().signature();

            Collection<SmaliMethod> methods = SmaliMethodNameAndProtoIndex.INSTANCE.get(methodNameAndProto,
                    debugProcess.getProject(), GlobalSearchScope.fileScope(smaliClass.getContainingFile()));
            if (methods.size() > 0) {
                SmaliMethod smaliMethod = methods.iterator().next();
                return smaliMethod.getSourcePositionForAddress((int)location.codeIndex());
            }
        }

        return null;
    }

    @NotNull
    public List<ReferenceType> getAllClasses(SourcePosition classPosition) throws NoDataException {
        List<ReferenceType> list = new ArrayList<ReferenceType>();
        String className = ((SmaliClass)classPosition.getElementAt().getContainingFile().getFirstChild()).getName();
        className = className.substring(1, className.length()-1);
        return debugProcess.getVirtualMachineProxy().classesByName(className);
    }

    @NotNull
    public List<Location> locationsOfLine(final ReferenceType type, final SourcePosition position) throws NoDataException {
        final ArrayList<Location> locations = new ArrayList<Location>(1);

        ApplicationManager.getApplication().runReadAction(new Runnable() {
            public void run() {
                String sig = type.signature();
                Collection<SmaliClass> classes = SmaliClassNameIndex.INSTANCE.get(sig, debugProcess.getProject(),
                        GlobalSearchScope.projectScope(debugProcess.getProject()));

                if (classes.size() > 0) {
                    final SmaliClass smaliClass = classes.iterator().next();

                    Location location = smaliClass.getLocationForSourcePosition(type, position);

                    if (location != null) {
                        locations.add(location);
                    }
                }
            }
        });
        return locations;
    }

    public ClassPrepareRequest createPrepareRequest(ClassPrepareRequestor requestor, SourcePosition position) throws NoDataException {
        String className = ((SmaliClass)position.getElementAt().getContainingFile().getFirstChild()).getName();

        return debugProcess.getRequestsManager().createClassPrepareRequest(requestor, className);
    }
}
