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

parser grammar smaliIdeaParser;

options {
	tokenVocab=smaliParser;
}

@header {
package org.jf.smalidea;

import org.jf.smalidea.SmaliElementTypes;
import com.intellij.lang.PsiBuilder;
import static com.intellij.lang.PsiBuilder.Marker;
}


@members {
	private boolean verboseErrors = false;
	private boolean allowOdex = false;
	private int apiLevel;

	private PsiBuilder psiBuilder;

	public void setPsiBuilder(PsiBuilder psiBuilder) {
	    this.psiBuilder = psiBuilder;
	}

	public Marker mark() {
	    return psiBuilder.mark();
	}

	public void setVerboseErrors(boolean verboseErrors) {
		this.verboseErrors = verboseErrors;
	}

	public void setAllowOdex(boolean allowOdex) {
	    this.allowOdex = allowOdex;
	}

	public void setApiLevel(int apiLevel) {
	    this.apiLevel = apiLevel;
	}

	public String getErrorMessage(RecognitionException e,
		String[] tokenNames) {

		if (verboseErrors) {
			List stack = getRuleInvocationStack(e, this.getClass().getName());
			String msg = null;

			if (e instanceof NoViableAltException) {
				NoViableAltException nvae = (NoViableAltException)e;
				msg = " no viable alt; token="+getTokenErrorDisplay(e.token)+
				" (decision="+nvae.decisionNumber+
				" state "+nvae.stateNumber+")"+
				" decision=<<"+nvae.grammarDecisionDescription+">>";
			} else {
				msg = super.getErrorMessage(e, tokenNames);
			}

			return stack + " " + msg;
		} else {
			return super.getErrorMessage(e, tokenNames);
		}
	}

	public String getTokenErrorDisplay(Token t) {
		if (!verboseErrors) {
			String s = t.getText();
			if ( s==null ) {
				if ( t.getType()==Token.EOF ) {
					s = "<EOF>";
				}
				else {
					s = "<"+tokenNames[t.getType()]+">";
				}
			}
			s = s.replaceAll("\n","\\\\n");
			s = s.replaceAll("\r","\\\\r");
			s = s.replaceAll("\t","\\\\t");
			return "'"+s+"'";
		}

		CommonToken ct = (CommonToken)t;

		String channelStr = "";
		if (t.getChannel()>0) {
			channelStr=",channel="+t.getChannel();
		}
		String txt = t.getText();
		if ( txt!=null ) {
			txt = txt.replaceAll("\n","\\\\n");
			txt = txt.replaceAll("\r","\\\\r");
			txt = txt.replaceAll("\t","\\\\t");
		}
		else {
			txt = "<no text>";
		}
		return "[@"+t.getTokenIndex()+","+ct.getStartIndex()+":"+ct.getStopIndex()+"='"+txt+"',<"+tokenNames[t.getType()]+">"+channelStr+","+t.getLine()+":"+t.getCharPositionInLine()+"]";
	}

	public String getErrorHeader(RecognitionException e) {
		return getSourceName()+"["+ e.line+","+e.charPositionInLine+"]";
	}
}

smali_file
	@init { Marker marker = mark(); }
	@after { marker.done(SmaliElementTypes.SMALI_FILE); }
	:
	(class_spec
    |	super_spec
    |	implements_spec
    |	source_spec
    |	method
    |	field
    |	annotation)+
	EOF;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

class_spec
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.CLASS_SPEC); }
	:	CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

super_spec
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.SUPER_SPEC); }
	:	SUPER_DIRECTIVE CLASS_DESCRIPTOR;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

implements_spec
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.IMPLEMENTS_SPEC); }
	:	IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

source_spec
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.SOURCE_SPEC); }
	:	SOURCE_DIRECTIVE STRING_LITERAL;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

access_list
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.ACCESS_LIST); }
	:	ACCESS_SPEC*;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }


/*When there are annotations immediately after a field definition, we don't know whether they are field annotations
or class annotations until we determine if there is an .end field directive. In either case, we still "consume" and parse
the annotations. If it turns out that they are field annotations, we include them in the I_FIELD AST. Otherwise, we
add them to the $smali_file::classAnnotations list*/
field
	@init {
	    boolean markerDone = false;
	    Marker marker = mark();
	    boolean annotationsDone = false;
	    Marker annotationsMarker = null;
    }
	:	FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor (EQUAL literal)?
		(	({input.LA(1) == ANNOTATION_DIRECTIVE}? { annotationsMarker = mark(); } annotation)*

		    (   {annotationsMarker.done(SmaliElementTypes.FIELD_ANNOTATIONS); annotationsDone = true;}
		        END_FIELD_DIRECTIVE
		        { marker.done(SmaliElementTypes.FIELD); markerDone = true;}
		    |   /*epsilon*/ { marker.doneBefore(SmaliElementTypes.FIELD, annotationsMarker); annotationsMarker.done(SmaliElementTypes.CLASS_ANNOTATIONS); }
		    )
		);
	catch [RecognitionException ex] {
	    String error = getErrorMessage(ex, tokenNames);
	    if (annotationsMarker != null){
	        if (!markerDone) {
	            marker.errorBefore(error, annotationsMarker);
	        }
	        if (!annotationsDone) {
	            annotationsMarker.error(error);
	        }
	    } else {
	        if (!markerDone) {
	            marker.error(error);
	        }
	    }
	    recover(input,ex);
	}


method
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.METHOD); }
	:	METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

statements_and_directives
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.METHOD_BODY); }
	:	(	instruction
		|	registers_directive
		|	label
		|	catch_directive
		|	catchall_directive
		|	parameter_directive
		|	ordered_debug_directive
		|	annotation
		)*;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

registers_directive
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.REGISTERS_SPEC); }
	:	(
			REGISTERS_DIRECTIVE integral_literal
		|	LOCALS_DIRECTIVE integral_literal
		);
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

/*identifiers are much more general than most languages. Any of the below can either be
the indicated type OR an identifier, depending on the context*/
simple_name
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.SIMPLE_NAME); }
	:	SIMPLE_NAME
	|	ACCESS_SPEC
	|	VERIFICATION_ERROR_TYPE
	|	POSITIVE_INTEGER_LITERAL
	|	NEGATIVE_INTEGER_LITERAL
	|   INTEGER_LITERAL
	|	FLOAT_LITERAL_OR_ID
	|	DOUBLE_LITERAL_OR_ID
	|	BOOL_LITERAL
	|	NULL_LITERAL
	|	REGISTER
	|	PARAM_LIST_OR_ID
	|	PRIMITIVE_TYPE
	|	VOID_TYPE
	|	ANNOTATION_VISIBILITY
	|	INSTRUCTION_FORMAT10t
	|	INSTRUCTION_FORMAT10x
	|	INSTRUCTION_FORMAT10x_ODEX
	|	INSTRUCTION_FORMAT11x
	|	INSTRUCTION_FORMAT12x_OR_ID
	|	INSTRUCTION_FORMAT21c_FIELD
	|	INSTRUCTION_FORMAT21c_FIELD_ODEX
	|	INSTRUCTION_FORMAT21c_STRING
	|	INSTRUCTION_FORMAT21c_TYPE
	|	INSTRUCTION_FORMAT21t
	|	INSTRUCTION_FORMAT22c_FIELD
	|	INSTRUCTION_FORMAT22c_FIELD_ODEX
	|	INSTRUCTION_FORMAT22c_TYPE
	|	INSTRUCTION_FORMAT22cs_FIELD
	|	INSTRUCTION_FORMAT22s_OR_ID
	|	INSTRUCTION_FORMAT22t
	|	INSTRUCTION_FORMAT23x
	|	INSTRUCTION_FORMAT31i_OR_ID
	|	INSTRUCTION_FORMAT31t
	|	INSTRUCTION_FORMAT35c_METHOD
	|	INSTRUCTION_FORMAT35c_METHOD_ODEX
	|	INSTRUCTION_FORMAT35c_TYPE
	|	INSTRUCTION_FORMAT35mi_METHOD
	|	INSTRUCTION_FORMAT35ms_METHOD
	|	INSTRUCTION_FORMAT51l;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

method_name
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.METHOD_NAME); }
	:	simple_name
	|	METHOD_NAME;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

method_prototype
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.METHOD_PROTOTYPE); }
	:	OPEN_PAREN param_list CLOSE_PAREN type_descriptor;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

param_list
	:	PARAM_LIST
	|	PARAM_LIST_OR_ID
	|	nonvoid_type_descriptor*;

type_descriptor
	:	VOID_TYPE
	|	PRIMITIVE_TYPE
	|	CLASS_DESCRIPTOR
	|	ARRAY_DESCRIPTOR;

nonvoid_type_descriptor
	:	PRIMITIVE_TYPE
	|	CLASS_DESCRIPTOR
	|	ARRAY_DESCRIPTOR;

reference_type_descriptor
	:	CLASS_DESCRIPTOR
	|	ARRAY_DESCRIPTOR;

integer_literal
	:	POSITIVE_INTEGER_LITERAL
	|	NEGATIVE_INTEGER_LITERAL
	|   INTEGER_LITERAL;

float_literal
	:	FLOAT_LITERAL_OR_ID
	|	FLOAT_LITERAL;

double_literal
	:	DOUBLE_LITERAL_OR_ID
	|	DOUBLE_LITERAL;

literal
	:	LONG_LITERAL
	|	integer_literal
	|	SHORT_LITERAL
	|	BYTE_LITERAL
	|	float_literal
	|	double_literal
	|	CHAR_LITERAL
	|	STRING_LITERAL
	|	BOOL_LITERAL
	|	NULL_LITERAL
	|	array_literal
	|	subannotation
	|	type_field_method_literal
	|	enum_literal;

integral_literal
	:	LONG_LITERAL
	|	integer_literal
	|	SHORT_LITERAL
	|	CHAR_LITERAL
	|	BYTE_LITERAL;

fixed_32bit_literal
	:	LONG_LITERAL
	|	integer_literal
	|	SHORT_LITERAL
	|	BYTE_LITERAL
	|	float_literal
	|	CHAR_LITERAL
	|	BOOL_LITERAL;

fixed_literal
	:	integer_literal
	|	LONG_LITERAL
	|	SHORT_LITERAL
	|	BYTE_LITERAL
	|	float_literal
	|	double_literal
	|	CHAR_LITERAL
	|	BOOL_LITERAL;

array_literal
	:	OPEN_BRACE (literal (COMMA literal)* | ) CLOSE_BRACE;

annotation_element
	:	simple_name EQUAL literal;


annotation
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.ANNOTATION); }
	:	ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR
		annotation_element* END_ANNOTATION_DIRECTIVE;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }

subannotation
	:	SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR annotation_element* END_SUBANNOTATION_DIRECTIVE;

enum_literal
	:	ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor;

type_field_method_literal
	:	reference_type_descriptor
		(	ARROW
			(	simple_name COLON nonvoid_type_descriptor
			|	method_name method_prototype
			)
		)
	|	PRIMITIVE_TYPE
	|	VOID_TYPE;

fully_qualified_method
	:	reference_type_descriptor ARROW method_name method_prototype;

fully_qualified_field
	:	reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor;

label
	:	COLON simple_name;

label_ref_or_offset
	:	COLON simple_name
	|	OFFSET
	|	NEGATIVE_INTEGER_LITERAL;

register_list
	:	(REGISTER (COMMA REGISTER)*)?;

register_range
	:	(REGISTER (DOTDOT REGISTER)?)?;

verification_error_reference
	:	CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method;

catch_directive
	:	CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset;

catchall_directive
	:	CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset;

/*When there are annotations immediately after a parameter definition, we don't know whether they are parameter annotations
or method annotations until we determine if there is an .end parameter directive. In either case, we still "consume" and parse
the annotations. If it turns out that they are parameter annotations, we include them in the I_PARAMETER AST. Otherwise, we
add them to the $statements_and_directives::methodAnnotations list*/
parameter_directive
	:	PARAMETER_DIRECTIVE STRING_LITERAL?
		({input.LA(1) == ANNOTATION_DIRECTIVE}? annotation)*
		(	END_PARAMETER_DIRECTIVE
		|	/*epsilon*/
		);

ordered_debug_directive
	:	line_directive
	|	local_directive
	|	end_local_directive
	|	restart_local_directive
	|	prologue_directive
	|	epilogue_directive
	|	source_directive;

line_directive
	:	LINE_DIRECTIVE integral_literal;

local_directive
	:	LOCAL_DIRECTIVE	REGISTER COMMA simple_name COLON nonvoid_type_descriptor (COMMA STRING_LITERAL)?;

end_local_directive
	:	END_LOCAL_DIRECTIVE REGISTER;

restart_local_directive
	:	RESTART_LOCAL_DIRECTIVE REGISTER;

prologue_directive
	:	PROLOGUE_DIRECTIVE;

epilogue_directive
	:	EPILOGUE_DIRECTIVE;

source_directive
	:	SOURCE_DIRECTIVE STRING_LITERAL;

instruction_format12x
	:	INSTRUCTION_FORMAT12x
	|	INSTRUCTION_FORMAT12x_OR_ID;

instruction_format22s
	:	INSTRUCTION_FORMAT22s
	|	INSTRUCTION_FORMAT22s_OR_ID;

instruction_format31i
	:	INSTRUCTION_FORMAT31i
	|	INSTRUCTION_FORMAT31i_OR_ID;

instruction
    @init { Marker marker = mark(); }
    @after { marker.done(SmaliElementTypes.INSTRUCTION); }
	:	//e.g. goto endloop:
		//e.g. goto +3
		INSTRUCTION_FORMAT10t label_ref_or_offset
	|	//e.g. return-void
		INSTRUCTION_FORMAT10x
	|	//e.g. return-void-barrier
		INSTRUCTION_FORMAT10x_ODEX
	|	//e.g. const/4 v0, 5
		INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
	|	//e.g. move-result-object v1
		INSTRUCTION_FORMAT11x REGISTER
	|	//e.g. move v1 v2
		instruction_format12x REGISTER COMMA REGISTER
	|	//e.g. throw-verification-error generic-error, Lsome/class;
		INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference
	|	//e.g. goto/16 endloop:
		INSTRUCTION_FORMAT20t label_ref_or_offset
	|	//e.g. sget-object v0, java/lang/System/out LJava/io/PrintStream;
		INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field
	|	//e.g. sget-object-volatile v0, java/lang/System/out LJava/io/PrintStream;
		INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field
	|	//e.g. const-string v1, "Hello World!"
		INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
	|	//e.g. const-class v2, Lorg/jf/HelloWorld2/HelloWorld2;
		INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor
	|	//e.g. const/high16 v1, 1234
		INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal
	|	//e.g. const/16 v1, 1234
		INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
	|	//e.g. if-eqz v0, endloop:
		INSTRUCTION_FORMAT21t REGISTER COMMA (label_ref_or_offset)
	|	//e.g. add-int v0, v1, 123
		INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
	|	//e.g. iput-object v1, v0 org/jf/HelloWorld2/HelloWorld2.helloWorld Ljava/lang/String;
		INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
	|	//e.g. iput-object-volatile v1, v0 org/jf/HelloWorld2/HelloWorld2.helloWorld Ljava/lang/String;
		INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
	|	//e.g. instance-of v0, v1, Ljava/lang/String;
		INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
	|	//e.g. iget-quick v0, v1, field@0xc
		INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
	|	//e.g. add-int/lit16 v0, v1, 12345
		instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
	|	//e.g. if-eq v0, v1, endloop:
		INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset
	|	//e.g. move/from16 v1, v1234
		INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
	|	//e.g. add-int v1, v2, v3
		INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
	|	//e.g. goto/32 endloop:
		INSTRUCTION_FORMAT30t label_ref_or_offset
	|	//e.g. const-string/jumbo v1 "Hello World!"
		INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
	|	//e.g. const v0, 123456
		instruction_format31i REGISTER COMMA fixed_32bit_literal
	|	//e.g. fill-array-data v0, ArrayData:
		INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset
	|	//e.g. move/16 v4567, v1234
		INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
	|	//e.g. invoke-virtual {v0,v1} java/io/PrintStream/print(Ljava/lang/Stream;)V
		INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
	|	//e.g. filled-new-array {v0,v1}, I
		INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
	|	//e.g. invoke-direct {p0}, Ljava/lang/Object;-><init>()V
		INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
	|	//e.g. execute-inline {v0, v1}, inline@0x4
		INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX
	|	//e.g. invoke-virtual-quick {v0, v1}, vtable@0x4
		INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX
	|	//e.g. invoke-virtual/range {v25..v26}, java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
	|	//e.g. invoke-object-init/range {p0}, Ljava/lang/Object;-><init>()V
		INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
	|	//e.g. filled-new-array/range {v0..v6}, I
		INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
	|	//e.g. execute-inline/range {v0 .. v10}, inline@0x14
		INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX
	|	//e.g. invoke-virtual-quick/range {v0 .. v10}, vtable@0x14
		INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX
	|	//e.g. const-class/jumbo v2, Lorg/jf/HelloWorld2/HelloWorld2;
		INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor
	|	//e.g. sget-object/jumbo v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
		INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field
	|	//e.g. sget-object-volatile/jumbo v0, Ljava/lang/System;->out:Ljava/io/PrintStream;
		INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field
	|	//e.g. const-wide v0, 5000000000L
		INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
	|	//e.g. instance-of/jumbo v0, v1, Ljava/lang/String;
		INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
	|	//e.g. iput-object/jumbo v1, v0 Lorg/jf/HelloWorld2/HelloWorld2;->helloWorld:Ljava/lang/String;
		INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
	|	//e.g. iput-object-volatile/jumbo v1, v0 Lorg/jf/HelloWorld2/HelloWorld2;->helloWorld:Ljava/lang/String;
		INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
	|	//e.g. invoke-virtual/jumbo {v25..v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
	|	//e.g. invoke-object-init/jumbo {v25}, Ljava/lang/Object-><init>()V
		INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
	|	//e.g. filled-new-array/jumbo {v0..v6}, I
		INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
	|   ARRAY_DATA_DIRECTIVE integral_literal fixed_literal* END_ARRAY_DATA_DIRECTIVE
	|   PACKED_SWITCH_DIRECTIVE fixed_32bit_literal label_ref_or_offset* END_PACKED_SWITCH_DIRECTIVE
	|   SPARSE_SWITCH_DIRECTIVE (fixed_32bit_literal ARROW label_ref_or_offset)* END_SPARSE_SWITCH_DIRECTIVE;
	catch [RecognitionException ex] { marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); }