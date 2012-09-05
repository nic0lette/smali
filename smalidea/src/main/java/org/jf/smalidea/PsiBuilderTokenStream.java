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

package org.jf.smalidea;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;
import org.jf.smali.InvalidToken;
import org.jf.smali.smaliParser;

import java.util.ArrayList;

public class PsiBuilderTokenStream implements TokenStream {
    private PsiBuilder psiBuilder;
    private CommonToken currentToken = null;
    private ArrayList<PsiBuilder.Marker> markers = new ArrayList<PsiBuilder.Marker>();

    public PsiBuilderTokenStream(PsiBuilder psiBuilder) {
        this.psiBuilder = psiBuilder;
    }

    public Token LT(int k) {
        if (k == 1) {
            if (currentToken == null) {
                buildCurrentToken();
            }
            return currentToken;
        }
        throw new UnsupportedOperationException();
    }

    public Token get(int i) {
        throw new UnsupportedOperationException();
    }

    public TokenSource getTokenSource() {
        throw new UnsupportedOperationException();
    }

    public String toString(int start, int stop) {
        throw new UnsupportedOperationException();
    }

    public String toString(Token start, Token stop) {
        throw new UnsupportedOperationException();
    }

    public void consume() {
        psiBuilder.advanceLexer();
        buildCurrentToken();
    }

    private void buildCurrentToken() {
        IElementType element = psiBuilder.getTokenType();
        if (element != null) {
            if (element instanceof  SmaliElementType) {
                SmaliElementType elementType = (SmaliElementType)element;
                currentToken = new CommonToken(elementType.tokenId, psiBuilder.getTokenText());
            } else if (element == TokenType.BAD_CHARACTER) {
                currentToken = new InvalidToken("", psiBuilder.getTokenText());
            } else {
                throw new UnsupportedOperationException();
            }
        } else {
            currentToken = null;
        }
    }

    public int LA(int i) {
        IElementType elementType = psiBuilder.lookAhead(i-1);
        if (elementType == null) {
            return -1;
        } else if (elementType instanceof  SmaliElementType) {
            return ((SmaliElementType)elementType).tokenId;
        } else if (elementType == TokenType.BAD_CHARACTER) {
            return smaliParser.INVALID_TOKEN;
        }
        throw new UnsupportedOperationException();
    }

    public int mark() {
        int ret = markers.size();
        markers.add(psiBuilder.mark());
        return ret;
    }

    public int index() {
        return psiBuilder.getCurrentOffset();
    }

    public void rewind(int markerIndex) {
        PsiBuilder.Marker marker = markers.get(markerIndex);
        marker.rollbackTo();
        while (markerIndex <= markers.size() - 1) {
            markers.remove(markers.size()-1);
        }
    }

    public void rewind() {
        rewind(markers.size()-1);
    }

    public void release(int marker) {
        throw new UnsupportedOperationException();
    }

    public void seek(int index) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        throw new UnsupportedOperationException();
    }

    public String getSourceName() {
        return null;
    }
}
