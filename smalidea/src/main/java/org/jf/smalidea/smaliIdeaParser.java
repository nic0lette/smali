// $ANTLR 3.5 smaliIdeaParser.g 2013-05-05 19:09:55

package org.jf.smalidea;

import com.intellij.lang.PsiBuilder;
import org.antlr.runtime.*;
import org.jf.smalidea.psi.ElementTypes;

import static com.intellij.lang.PsiBuilder.Marker;

@SuppressWarnings("all")
public class smaliIdeaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESS_SPEC", "ANNOTATION_DIRECTIVE", 
		"ANNOTATION_VISIBILITY", "ARRAY_DATA_DIRECTIVE", "ARRAY_DESCRIPTOR", "ARROW", 
		"BASE_ARRAY_DESCRIPTOR", "BASE_CHAR_LITERAL", "BASE_CLASS_DESCRIPTOR", 
		"BASE_FLOAT", "BASE_FLOAT_OR_ID", "BASE_INTEGER", "BASE_PRIMITIVE_TYPE", 
		"BASE_SIMPLE_NAME", "BASE_STRING_LITERAL", "BASE_TYPE", "BINARY_EXPONENT", 
		"BOOL_LITERAL", "BYTE_LITERAL", "CATCHALL_DIRECTIVE", "CATCH_DIRECTIVE", 
		"CHAR_LITERAL", "CLASS_DESCRIPTOR", "CLASS_DIRECTIVE", "CLOSE_BRACE", 
		"CLOSE_PAREN", "COLON", "COMMA", "DECIMAL_EXPONENT", "DOTDOT", "DOUBLE_LITERAL", 
		"DOUBLE_LITERAL_OR_ID", "END_ANNOTATION_DIRECTIVE", "END_ARRAY_DATA_DIRECTIVE", 
		"END_FIELD_DIRECTIVE", "END_LOCAL_DIRECTIVE", "END_METHOD_DIRECTIVE", 
		"END_PACKED_SWITCH_DIRECTIVE", "END_PARAMETER_DIRECTIVE", "END_SPARSE_SWITCH_DIRECTIVE", 
		"END_SUBANNOTATION_DIRECTIVE", "ENUM_DIRECTIVE", "EPILOGUE_DIRECTIVE", 
		"EQUAL", "ESCAPE_SEQUENCE", "FIELD_DIRECTIVE", "FIELD_OFFSET", "FLOAT_LITERAL", 
		"FLOAT_LITERAL_OR_ID", "HEX_DIGIT", "HEX_DIGITS", "HEX_PREFIX", "IMPLEMENTS_DIRECTIVE", 
		"INLINE_INDEX", "INSTRUCTION_FORMAT10t", "INSTRUCTION_FORMAT10x", "INSTRUCTION_FORMAT10x_ODEX", 
		"INSTRUCTION_FORMAT11n", "INSTRUCTION_FORMAT11x", "INSTRUCTION_FORMAT12x", 
		"INSTRUCTION_FORMAT12x_OR_ID", "INSTRUCTION_FORMAT20bc", "INSTRUCTION_FORMAT20t", 
		"INSTRUCTION_FORMAT21c_FIELD", "INSTRUCTION_FORMAT21c_FIELD_ODEX", "INSTRUCTION_FORMAT21c_STRING", 
		"INSTRUCTION_FORMAT21c_TYPE", "INSTRUCTION_FORMAT21ih", "INSTRUCTION_FORMAT21lh", 
		"INSTRUCTION_FORMAT21s", "INSTRUCTION_FORMAT21t", "INSTRUCTION_FORMAT22b", 
		"INSTRUCTION_FORMAT22c_FIELD", "INSTRUCTION_FORMAT22c_FIELD_ODEX", "INSTRUCTION_FORMAT22c_TYPE", 
		"INSTRUCTION_FORMAT22cs_FIELD", "INSTRUCTION_FORMAT22s", "INSTRUCTION_FORMAT22s_OR_ID", 
		"INSTRUCTION_FORMAT22t", "INSTRUCTION_FORMAT22x", "INSTRUCTION_FORMAT23x", 
		"INSTRUCTION_FORMAT30t", "INSTRUCTION_FORMAT31c", "INSTRUCTION_FORMAT31i", 
		"INSTRUCTION_FORMAT31i_OR_ID", "INSTRUCTION_FORMAT31t", "INSTRUCTION_FORMAT32x", 
		"INSTRUCTION_FORMAT35c_METHOD", "INSTRUCTION_FORMAT35c_METHOD_ODEX", "INSTRUCTION_FORMAT35c_TYPE", 
		"INSTRUCTION_FORMAT35mi_METHOD", "INSTRUCTION_FORMAT35ms_METHOD", "INSTRUCTION_FORMAT3rc_METHOD", 
		"INSTRUCTION_FORMAT3rc_METHOD_ODEX", "INSTRUCTION_FORMAT3rc_TYPE", "INSTRUCTION_FORMAT3rmi_METHOD", 
		"INSTRUCTION_FORMAT3rms_METHOD", "INSTRUCTION_FORMAT51l", "INTEGER_LITERAL", 
		"INVALID_TOKEN", "I_ACCESS_LIST", "I_ADDRESS", "I_ANNOTATION", "I_ANNOTATIONS", 
		"I_ANNOTATION_ELEMENT", "I_ARRAY_ELEMENTS", "I_ARRAY_ELEMENT_SIZE", "I_CATCH", 
		"I_CATCHALL", "I_CATCHES", "I_CLASS_DEF", "I_ENCODED_ARRAY", "I_ENCODED_ENUM", 
		"I_ENCODED_FIELD", "I_ENCODED_METHOD", "I_END_LOCAL", "I_EPILOGUE", "I_FIELD", 
		"I_FIELDS", "I_FIELD_INITIAL_VALUE", "I_FIELD_TYPE", "I_IMPLEMENTS", "I_LABEL", 
		"I_LABELS", "I_LINE", "I_LOCAL", "I_LOCALS", "I_METHOD", "I_METHODS", 
		"I_METHOD_PROTOTYPE", "I_METHOD_RETURN_TYPE", "I_ORDERED_DEBUG_DIRECTIVES", 
		"I_PACKED_SWITCH_DECLARATION", "I_PACKED_SWITCH_DECLARATIONS", "I_PACKED_SWITCH_ELEMENTS", 
		"I_PACKED_SWITCH_START_KEY", "I_PARAMETER", "I_PARAMETERS", "I_PARAMETER_NOT_SPECIFIED", 
		"I_PROLOGUE", "I_REGISTERS", "I_REGISTER_LIST", "I_REGISTER_RANGE", "I_RESTART_LOCAL", 
		"I_SOURCE", "I_SPARSE_SWITCH_DECLARATION", "I_SPARSE_SWITCH_DECLARATIONS", 
		"I_SPARSE_SWITCH_ELEMENTS", "I_STATEMENTS", "I_STATEMENT_ARRAY_DATA", 
		"I_STATEMENT_FORMAT10t", "I_STATEMENT_FORMAT10x", "I_STATEMENT_FORMAT11n", 
		"I_STATEMENT_FORMAT11x", "I_STATEMENT_FORMAT12x", "I_STATEMENT_FORMAT20bc", 
		"I_STATEMENT_FORMAT20t", "I_STATEMENT_FORMAT21c_FIELD", "I_STATEMENT_FORMAT21c_STRING", 
		"I_STATEMENT_FORMAT21c_TYPE", "I_STATEMENT_FORMAT21ih", "I_STATEMENT_FORMAT21lh", 
		"I_STATEMENT_FORMAT21s", "I_STATEMENT_FORMAT21t", "I_STATEMENT_FORMAT22b", 
		"I_STATEMENT_FORMAT22c_FIELD", "I_STATEMENT_FORMAT22c_TYPE", "I_STATEMENT_FORMAT22s", 
		"I_STATEMENT_FORMAT22t", "I_STATEMENT_FORMAT22x", "I_STATEMENT_FORMAT23x", 
		"I_STATEMENT_FORMAT30t", "I_STATEMENT_FORMAT31c", "I_STATEMENT_FORMAT31i", 
		"I_STATEMENT_FORMAT31t", "I_STATEMENT_FORMAT32x", "I_STATEMENT_FORMAT35c_METHOD", 
		"I_STATEMENT_FORMAT35c_TYPE", "I_STATEMENT_FORMAT3rc_METHOD", "I_STATEMENT_FORMAT3rc_TYPE", 
		"I_STATEMENT_FORMAT51l", "I_STATEMENT_PACKED_SWITCH", "I_STATEMENT_SPARSE_SWITCH", 
		"I_SUBANNOTATION", "I_SUPER", "LABEL", "LINE_COMMENT", "LINE_DIRECTIVE", 
		"LOCALS_DIRECTIVE", "LOCAL_DIRECTIVE", "LONG_LITERAL", "METHOD_DIRECTIVE", 
		"METHOD_NAME", "NEGATIVE_INTEGER_LITERAL", "NULL_LITERAL", "OFFSET", "OPEN_BRACE", 
		"OPEN_PAREN", "PACKED_SWITCH_DIRECTIVE", "PARAMETER_DIRECTIVE", "PARAM_LIST", 
		"PARAM_LIST_OR_ID", "POSITIVE_INTEGER_LITERAL", "PRIMITIVE_TYPE", "PROLOGUE_DIRECTIVE", 
		"REGISTER", "REGISTERS_DIRECTIVE", "RESTART_LOCAL_DIRECTIVE", "SHORT_LITERAL", 
		"SIMPLE_NAME", "SOURCE_DIRECTIVE", "SPARSE_SWITCH_DIRECTIVE", "STRING_LITERAL", 
		"SUBANNOTATION_DIRECTIVE", "SUPER_DIRECTIVE", "VERIFICATION_ERROR_TYPE", 
		"VOID_TYPE", "VTABLE_INDEX", "WHITE_SPACE"
	};
	public static final int EOF=-1;
	public static final int ACCESS_SPEC=4;
	public static final int ANNOTATION_DIRECTIVE=5;
	public static final int ANNOTATION_VISIBILITY=6;
	public static final int ARRAY_DATA_DIRECTIVE=7;
	public static final int ARRAY_DESCRIPTOR=8;
	public static final int ARROW=9;
	public static final int BASE_ARRAY_DESCRIPTOR=10;
	public static final int BASE_CHAR_LITERAL=11;
	public static final int BASE_CLASS_DESCRIPTOR=12;
	public static final int BASE_FLOAT=13;
	public static final int BASE_FLOAT_OR_ID=14;
	public static final int BASE_INTEGER=15;
	public static final int BASE_PRIMITIVE_TYPE=16;
	public static final int BASE_SIMPLE_NAME=17;
	public static final int BASE_STRING_LITERAL=18;
	public static final int BASE_TYPE=19;
	public static final int BINARY_EXPONENT=20;
	public static final int BOOL_LITERAL=21;
	public static final int BYTE_LITERAL=22;
	public static final int CATCHALL_DIRECTIVE=23;
	public static final int CATCH_DIRECTIVE=24;
	public static final int CHAR_LITERAL=25;
	public static final int CLASS_DESCRIPTOR=26;
	public static final int CLASS_DIRECTIVE=27;
	public static final int CLOSE_BRACE=28;
	public static final int CLOSE_PAREN=29;
	public static final int COLON=30;
	public static final int COMMA=31;
	public static final int DECIMAL_EXPONENT=32;
	public static final int DOTDOT=33;
	public static final int DOUBLE_LITERAL=34;
	public static final int DOUBLE_LITERAL_OR_ID=35;
	public static final int END_ANNOTATION_DIRECTIVE=36;
	public static final int END_ARRAY_DATA_DIRECTIVE=37;
	public static final int END_FIELD_DIRECTIVE=38;
	public static final int END_LOCAL_DIRECTIVE=39;
	public static final int END_METHOD_DIRECTIVE=40;
	public static final int END_PACKED_SWITCH_DIRECTIVE=41;
	public static final int END_PARAMETER_DIRECTIVE=42;
	public static final int END_SPARSE_SWITCH_DIRECTIVE=43;
	public static final int END_SUBANNOTATION_DIRECTIVE=44;
	public static final int ENUM_DIRECTIVE=45;
	public static final int EPILOGUE_DIRECTIVE=46;
	public static final int EQUAL=47;
	public static final int ESCAPE_SEQUENCE=48;
	public static final int FIELD_DIRECTIVE=49;
	public static final int FIELD_OFFSET=50;
	public static final int FLOAT_LITERAL=51;
	public static final int FLOAT_LITERAL_OR_ID=52;
	public static final int HEX_DIGIT=53;
	public static final int HEX_DIGITS=54;
	public static final int HEX_PREFIX=55;
	public static final int IMPLEMENTS_DIRECTIVE=56;
	public static final int INLINE_INDEX=57;
	public static final int INSTRUCTION_FORMAT10t=58;
	public static final int INSTRUCTION_FORMAT10x=59;
	public static final int INSTRUCTION_FORMAT10x_ODEX=60;
	public static final int INSTRUCTION_FORMAT11n=61;
	public static final int INSTRUCTION_FORMAT11x=62;
	public static final int INSTRUCTION_FORMAT12x=63;
	public static final int INSTRUCTION_FORMAT12x_OR_ID=64;
	public static final int INSTRUCTION_FORMAT20bc=65;
	public static final int INSTRUCTION_FORMAT20t=66;
	public static final int INSTRUCTION_FORMAT21c_FIELD=67;
	public static final int INSTRUCTION_FORMAT21c_FIELD_ODEX=68;
	public static final int INSTRUCTION_FORMAT21c_STRING=69;
	public static final int INSTRUCTION_FORMAT21c_TYPE=70;
	public static final int INSTRUCTION_FORMAT21ih=71;
	public static final int INSTRUCTION_FORMAT21lh=72;
	public static final int INSTRUCTION_FORMAT21s=73;
	public static final int INSTRUCTION_FORMAT21t=74;
	public static final int INSTRUCTION_FORMAT22b=75;
	public static final int INSTRUCTION_FORMAT22c_FIELD=76;
	public static final int INSTRUCTION_FORMAT22c_FIELD_ODEX=77;
	public static final int INSTRUCTION_FORMAT22c_TYPE=78;
	public static final int INSTRUCTION_FORMAT22cs_FIELD=79;
	public static final int INSTRUCTION_FORMAT22s=80;
	public static final int INSTRUCTION_FORMAT22s_OR_ID=81;
	public static final int INSTRUCTION_FORMAT22t=82;
	public static final int INSTRUCTION_FORMAT22x=83;
	public static final int INSTRUCTION_FORMAT23x=84;
	public static final int INSTRUCTION_FORMAT30t=85;
	public static final int INSTRUCTION_FORMAT31c=86;
	public static final int INSTRUCTION_FORMAT31i=87;
	public static final int INSTRUCTION_FORMAT31i_OR_ID=88;
	public static final int INSTRUCTION_FORMAT31t=89;
	public static final int INSTRUCTION_FORMAT32x=90;
	public static final int INSTRUCTION_FORMAT35c_METHOD=91;
	public static final int INSTRUCTION_FORMAT35c_METHOD_ODEX=92;
	public static final int INSTRUCTION_FORMAT35c_TYPE=93;
	public static final int INSTRUCTION_FORMAT35mi_METHOD=94;
	public static final int INSTRUCTION_FORMAT35ms_METHOD=95;
	public static final int INSTRUCTION_FORMAT3rc_METHOD=96;
	public static final int INSTRUCTION_FORMAT3rc_METHOD_ODEX=97;
	public static final int INSTRUCTION_FORMAT3rc_TYPE=98;
	public static final int INSTRUCTION_FORMAT3rmi_METHOD=99;
	public static final int INSTRUCTION_FORMAT3rms_METHOD=100;
	public static final int INSTRUCTION_FORMAT51l=101;
	public static final int INTEGER_LITERAL=102;
	public static final int INVALID_TOKEN=103;
	public static final int I_ACCESS_LIST=104;
	public static final int I_ADDRESS=105;
	public static final int I_ANNOTATION=106;
	public static final int I_ANNOTATIONS=107;
	public static final int I_ANNOTATION_ELEMENT=108;
	public static final int I_ARRAY_ELEMENTS=109;
	public static final int I_ARRAY_ELEMENT_SIZE=110;
	public static final int I_CATCH=111;
	public static final int I_CATCHALL=112;
	public static final int I_CATCHES=113;
	public static final int I_CLASS_DEF=114;
	public static final int I_ENCODED_ARRAY=115;
	public static final int I_ENCODED_ENUM=116;
	public static final int I_ENCODED_FIELD=117;
	public static final int I_ENCODED_METHOD=118;
	public static final int I_END_LOCAL=119;
	public static final int I_EPILOGUE=120;
	public static final int I_FIELD=121;
	public static final int I_FIELDS=122;
	public static final int I_FIELD_INITIAL_VALUE=123;
	public static final int I_FIELD_TYPE=124;
	public static final int I_IMPLEMENTS=125;
	public static final int I_LABEL=126;
	public static final int I_LABELS=127;
	public static final int I_LINE=128;
	public static final int I_LOCAL=129;
	public static final int I_LOCALS=130;
	public static final int I_METHOD=131;
	public static final int I_METHODS=132;
	public static final int I_METHOD_PROTOTYPE=133;
	public static final int I_METHOD_RETURN_TYPE=134;
	public static final int I_ORDERED_DEBUG_DIRECTIVES=135;
	public static final int I_PACKED_SWITCH_DECLARATION=136;
	public static final int I_PACKED_SWITCH_DECLARATIONS=137;
	public static final int I_PACKED_SWITCH_ELEMENTS=138;
	public static final int I_PACKED_SWITCH_START_KEY=139;
	public static final int I_PARAMETER=140;
	public static final int I_PARAMETERS=141;
	public static final int I_PARAMETER_NOT_SPECIFIED=142;
	public static final int I_PROLOGUE=143;
	public static final int I_REGISTERS=144;
	public static final int I_REGISTER_LIST=145;
	public static final int I_REGISTER_RANGE=146;
	public static final int I_RESTART_LOCAL=147;
	public static final int I_SOURCE=148;
	public static final int I_SPARSE_SWITCH_DECLARATION=149;
	public static final int I_SPARSE_SWITCH_DECLARATIONS=150;
	public static final int I_SPARSE_SWITCH_ELEMENTS=151;
	public static final int I_STATEMENTS=152;
	public static final int I_STATEMENT_ARRAY_DATA=153;
	public static final int I_STATEMENT_FORMAT10t=154;
	public static final int I_STATEMENT_FORMAT10x=155;
	public static final int I_STATEMENT_FORMAT11n=156;
	public static final int I_STATEMENT_FORMAT11x=157;
	public static final int I_STATEMENT_FORMAT12x=158;
	public static final int I_STATEMENT_FORMAT20bc=159;
	public static final int I_STATEMENT_FORMAT20t=160;
	public static final int I_STATEMENT_FORMAT21c_FIELD=161;
	public static final int I_STATEMENT_FORMAT21c_STRING=162;
	public static final int I_STATEMENT_FORMAT21c_TYPE=163;
	public static final int I_STATEMENT_FORMAT21ih=164;
	public static final int I_STATEMENT_FORMAT21lh=165;
	public static final int I_STATEMENT_FORMAT21s=166;
	public static final int I_STATEMENT_FORMAT21t=167;
	public static final int I_STATEMENT_FORMAT22b=168;
	public static final int I_STATEMENT_FORMAT22c_FIELD=169;
	public static final int I_STATEMENT_FORMAT22c_TYPE=170;
	public static final int I_STATEMENT_FORMAT22s=171;
	public static final int I_STATEMENT_FORMAT22t=172;
	public static final int I_STATEMENT_FORMAT22x=173;
	public static final int I_STATEMENT_FORMAT23x=174;
	public static final int I_STATEMENT_FORMAT30t=175;
	public static final int I_STATEMENT_FORMAT31c=176;
	public static final int I_STATEMENT_FORMAT31i=177;
	public static final int I_STATEMENT_FORMAT31t=178;
	public static final int I_STATEMENT_FORMAT32x=179;
	public static final int I_STATEMENT_FORMAT35c_METHOD=180;
	public static final int I_STATEMENT_FORMAT35c_TYPE=181;
	public static final int I_STATEMENT_FORMAT3rc_METHOD=182;
	public static final int I_STATEMENT_FORMAT3rc_TYPE=183;
	public static final int I_STATEMENT_FORMAT51l=184;
	public static final int I_STATEMENT_PACKED_SWITCH=185;
	public static final int I_STATEMENT_SPARSE_SWITCH=186;
	public static final int I_SUBANNOTATION=187;
	public static final int I_SUPER=188;
	public static final int LABEL=189;
	public static final int LINE_COMMENT=190;
	public static final int LINE_DIRECTIVE=191;
	public static final int LOCALS_DIRECTIVE=192;
	public static final int LOCAL_DIRECTIVE=193;
	public static final int LONG_LITERAL=194;
	public static final int METHOD_DIRECTIVE=195;
	public static final int METHOD_NAME=196;
	public static final int NEGATIVE_INTEGER_LITERAL=197;
	public static final int NULL_LITERAL=198;
	public static final int OFFSET=199;
	public static final int OPEN_BRACE=200;
	public static final int OPEN_PAREN=201;
	public static final int PACKED_SWITCH_DIRECTIVE=202;
	public static final int PARAMETER_DIRECTIVE=203;
	public static final int PARAM_LIST=204;
	public static final int PARAM_LIST_OR_ID=205;
	public static final int POSITIVE_INTEGER_LITERAL=206;
	public static final int PRIMITIVE_TYPE=207;
	public static final int PROLOGUE_DIRECTIVE=208;
	public static final int REGISTER=209;
	public static final int REGISTERS_DIRECTIVE=210;
	public static final int RESTART_LOCAL_DIRECTIVE=211;
	public static final int SHORT_LITERAL=212;
	public static final int SIMPLE_NAME=213;
	public static final int SOURCE_DIRECTIVE=214;
	public static final int SPARSE_SWITCH_DIRECTIVE=215;
	public static final int STRING_LITERAL=216;
	public static final int SUBANNOTATION_DIRECTIVE=217;
	public static final int SUPER_DIRECTIVE=218;
	public static final int VERIFICATION_ERROR_TYPE=219;
	public static final int VOID_TYPE=220;
	public static final int VTABLE_INDEX=221;
	public static final int WHITE_SPACE=222;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public smaliIdeaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public smaliIdeaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return smaliIdeaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "smaliIdeaParser.g"; }


	  private PsiBuilder psiBuilder;

	  public void setPsiBuilder(PsiBuilder psiBuilder) {
	      this.psiBuilder = psiBuilder;
	  }

	  public Marker mark() {
	      return psiBuilder.mark();
	  }

	    protected void syncToFollows(boolean acceptEof)
	    {
	        BitSet follow = computeErrorRecoverySet();
	        int mark = input.mark();
	        Marker marker = null;
	        try {
	            int token = input.LA(1);
	            while (!follow.member(token)) {
	                if (token == Token.EOF) {
	                    if (acceptEof) {
	                        break;
	                    }
	                    input.rewind();
	                    mark = -1;
	                    marker = null;
	                    return;
	                }
	                if (marker == null) {
	                    marker = mark();
	                }
	                input.consume();
	                token = input.LA(1);
	            }
	        } finally {
	            if  (mark != -1) {
	                input.release(mark);
	            }
	            if (marker != null) {
	                marker.error("Unexpected tokens");
	            }
	        }
	    }

	    @Override
	    public void recover(IntStream input, RecognitionException re) {
	        Marker mark = mark();
	        super.recover(input, re);
	        mark.error(getErrorMessage(re, tokenNames));
	    }

	    @Override
	    protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
	            throws RecognitionException
	    {
	        RecognitionException e = null;
	        // if next token is what we are looking for then "delete" this token
	        if ( mismatchIsUnwantedToken(input, ttype) ) {
	            e = new UnwantedTokenException(ttype, input);
	            /*
	               System.err.println("recoverFromMismatchedToken deleting "+
	                                  ((TokenStream)input).LT(1)+
	                                  " since "+((TokenStream)input).LT(2)+" is what we want");
	                */
	            beginResync();
	            Marker mark = mark();
	            input.consume(); // simply delete extra token
	            mark.error(getErrorMessage(e, tokenNames));
	            endResync();
	            reportError(e);  // report after consuming so AW sees the token in the exception
	            // we want to return the token we're actually matching
	            Object matchedSymbol = getCurrentInputSymbol(input);
	            input.consume(); // move past ttype token as if all were ok
	            return matchedSymbol;
	        }
	        // can't recover with single token deletion, try insertion
	        if ( mismatchIsMissingToken(input, follow) ) {
	            Object inserted = getMissingSymbol(input, e, ttype, follow);
	            e = new MissingTokenException(ttype, input, inserted);
	            reportError(e);  // report after inserting so AW sees the token in the exception
	            return inserted;
	        }
	        // even that didn't work; must throw the exception
	        e = new MismatchedTokenException(ttype, input);
	        throw e;
	    }



	// $ANTLR start "sync"
	// smaliIdeaParser.g:135:1: sync[boolean toEof] :;
	public final void sync(boolean toEof) throws RecognitionException {
		 syncToFollows(toEof); 
		try {
			// smaliIdeaParser.g:137:3: ()
			// smaliIdeaParser.g:137:16: 
			{
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sync"



	// $ANTLR start "smali_file"
	// smaliIdeaParser.g:140:1: smali_file : ( class_element sync[true] )+ EOF ;
	public final void smali_file() throws RecognitionException {
		try {
			// smaliIdeaParser.g:141:3: ( ( class_element sync[true] )+ EOF )
			// smaliIdeaParser.g:141:5: ( class_element sync[true] )+ EOF
			{
			// smaliIdeaParser.g:141:5: ( class_element sync[true] )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ANNOTATION_DIRECTIVE||LA1_0==CLASS_DIRECTIVE||LA1_0==FIELD_DIRECTIVE||LA1_0==IMPLEMENTS_DIRECTIVE||LA1_0==METHOD_DIRECTIVE||LA1_0==SOURCE_DIRECTIVE||LA1_0==SUPER_DIRECTIVE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// smaliIdeaParser.g:141:6: class_element sync[true]
					{
					pushFollow(FOLLOW_class_element_in_smali_file62);
					class_element();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_sync_in_smali_file64);
					sync(true);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input,EOF,FOLLOW_EOF_in_smali_file69); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "smali_file"



	// $ANTLR start "class_element"
	// smaliIdeaParser.g:143:1: class_element : ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation ) ;
	public final void class_element() throws RecognitionException {
		try {
			// smaliIdeaParser.g:144:3: ( ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation ) )
			// smaliIdeaParser.g:145:3: ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation )
			{
			// smaliIdeaParser.g:145:3: ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation )
			int alt2=7;
			switch ( input.LA(1) ) {
			case CLASS_DIRECTIVE:
				{
				alt2=1;
				}
				break;
			case SUPER_DIRECTIVE:
				{
				alt2=2;
				}
				break;
			case IMPLEMENTS_DIRECTIVE:
				{
				alt2=3;
				}
				break;
			case SOURCE_DIRECTIVE:
				{
				alt2=4;
				}
				break;
			case METHOD_DIRECTIVE:
				{
				alt2=5;
				}
				break;
			case FIELD_DIRECTIVE:
				{
				alt2=6;
				}
				break;
			case ANNOTATION_DIRECTIVE:
				{
				alt2=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// smaliIdeaParser.g:145:5: class_spec
					{
					pushFollow(FOLLOW_class_spec_in_class_element83);
					class_spec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:146:5: super_spec
					{
					pushFollow(FOLLOW_super_spec_in_class_element89);
					super_spec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:147:5: implements_spec
					{
					pushFollow(FOLLOW_implements_spec_in_class_element95);
					implements_spec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// smaliIdeaParser.g:148:5: source_spec
					{
					pushFollow(FOLLOW_source_spec_in_class_element101);
					source_spec();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// smaliIdeaParser.g:149:5: method
					{
					pushFollow(FOLLOW_method_in_class_element107);
					method();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// smaliIdeaParser.g:150:5: field
					{
					pushFollow(FOLLOW_field_in_class_element113);
					field();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// smaliIdeaParser.g:151:5: annotation
					{
					pushFollow(FOLLOW_annotation_in_class_element119);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "class_element"



	// $ANTLR start "class_spec"
	// smaliIdeaParser.g:153:1: class_spec : CLASS_DIRECTIVE access_list class_descriptor ;
	public final void class_spec() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:155:3: ( CLASS_DIRECTIVE access_list class_descriptor )
			// smaliIdeaParser.g:155:5: CLASS_DIRECTIVE access_list class_descriptor
			{
			match(input,CLASS_DIRECTIVE,FOLLOW_CLASS_DIRECTIVE_in_class_spec137); if (state.failed) return;
			pushFollow(FOLLOW_access_list_in_class_spec139);
			access_list();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_class_descriptor_in_class_spec141);
			class_descriptor();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.CLASS_SPEC); 
		}
	}
	// $ANTLR end "class_spec"



	// $ANTLR start "super_spec"
	// smaliIdeaParser.g:158:1: super_spec : SUPER_DIRECTIVE class_descriptor ;
	public final void super_spec() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:160:3: ( SUPER_DIRECTIVE class_descriptor )
			// smaliIdeaParser.g:160:5: SUPER_DIRECTIVE class_descriptor
			{
			match(input,SUPER_DIRECTIVE,FOLLOW_SUPER_DIRECTIVE_in_super_spec164); if (state.failed) return;
			pushFollow(FOLLOW_class_descriptor_in_super_spec166);
			class_descriptor();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.SUPER_SPEC); 
		}
	}
	// $ANTLR end "super_spec"



	// $ANTLR start "implements_spec"
	// smaliIdeaParser.g:163:1: implements_spec : IMPLEMENTS_DIRECTIVE class_descriptor ;
	public final void implements_spec() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:165:3: ( IMPLEMENTS_DIRECTIVE class_descriptor )
			// smaliIdeaParser.g:165:5: IMPLEMENTS_DIRECTIVE class_descriptor
			{
			match(input,IMPLEMENTS_DIRECTIVE,FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec189); if (state.failed) return;
			pushFollow(FOLLOW_class_descriptor_in_implements_spec191);
			class_descriptor();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.IMPLEMENTS_SPEC); 
		}
	}
	// $ANTLR end "implements_spec"



	// $ANTLR start "source_spec"
	// smaliIdeaParser.g:168:1: source_spec : SOURCE_DIRECTIVE STRING_LITERAL ;
	public final void source_spec() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:170:3: ( SOURCE_DIRECTIVE STRING_LITERAL )
			// smaliIdeaParser.g:170:5: SOURCE_DIRECTIVE STRING_LITERAL
			{
			match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_spec214); if (state.failed) return;
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_spec216); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.SOURCE_SPEC); 
		}
	}
	// $ANTLR end "source_spec"



	// $ANTLR start "access_list"
	// smaliIdeaParser.g:173:1: access_list : ( ACCESS_SPEC )* ;
	public final void access_list() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:175:3: ( ( ACCESS_SPEC )* )
			// smaliIdeaParser.g:175:5: ( ACCESS_SPEC )*
			{
			// smaliIdeaParser.g:175:5: ( ACCESS_SPEC )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ACCESS_SPEC) ) {
					int LA3_2 = input.LA(2);
					if ( (LA3_2==ACCESS_SPEC||LA3_2==ANNOTATION_VISIBILITY||LA3_2==BOOL_LITERAL||LA3_2==CLASS_DESCRIPTOR||LA3_2==DOUBLE_LITERAL_OR_ID||LA3_2==FLOAT_LITERAL_OR_ID||(LA3_2 >= INSTRUCTION_FORMAT10t && LA3_2 <= INSTRUCTION_FORMAT10x_ODEX)||LA3_2==INSTRUCTION_FORMAT11x||LA3_2==INSTRUCTION_FORMAT12x_OR_ID||(LA3_2 >= INSTRUCTION_FORMAT21c_FIELD && LA3_2 <= INSTRUCTION_FORMAT21c_TYPE)||LA3_2==INSTRUCTION_FORMAT21t||(LA3_2 >= INSTRUCTION_FORMAT22c_FIELD && LA3_2 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA3_2 >= INSTRUCTION_FORMAT22s_OR_ID && LA3_2 <= INSTRUCTION_FORMAT22t)||LA3_2==INSTRUCTION_FORMAT23x||(LA3_2 >= INSTRUCTION_FORMAT31i_OR_ID && LA3_2 <= INSTRUCTION_FORMAT31t)||(LA3_2 >= INSTRUCTION_FORMAT35c_METHOD && LA3_2 <= INSTRUCTION_FORMAT35ms_METHOD)||LA3_2==INSTRUCTION_FORMAT51l||(LA3_2 >= METHOD_NAME && LA3_2 <= NULL_LITERAL)||(LA3_2 >= PARAM_LIST_OR_ID && LA3_2 <= PRIMITIVE_TYPE)||LA3_2==REGISTER||LA3_2==SIMPLE_NAME||(LA3_2 >= VERIFICATION_ERROR_TYPE && LA3_2 <= VOID_TYPE)) ) {
						alt3=1;
					}

				}

				switch (alt3) {
				case 1 :
					// smaliIdeaParser.g:175:5: ACCESS_SPEC
					{
					match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_access_list239); if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.ACCESS_LIST); 
		}
	}
	// $ANTLR end "access_list"



	// $ANTLR start "field"
	// smaliIdeaParser.g:183:1: field : FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |) ;
	public final void field() throws RecognitionException {

		    Marker marker = mark();
		    Marker annotationsMarker = null;
		    boolean classAnnotations = true;
		  
		try {
			// smaliIdeaParser.g:189:3: ( FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |) )
			// smaliIdeaParser.g:189:5: FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |)
			{
			match(input,FIELD_DIRECTIVE,FOLLOW_FIELD_DIRECTIVE_in_field266); if (state.failed) return;
			pushFollow(FOLLOW_access_list_in_field268);
			access_list();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_simple_name_in_field270);
			simple_name();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_field272); if (state.failed) return;
			pushFollow(FOLLOW_nonvoid_type_descriptor_in_field274);
			nonvoid_type_descriptor();
			state._fsp--;
			if (state.failed) return;
			// smaliIdeaParser.g:189:75: ( EQUAL literal )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==EQUAL) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// smaliIdeaParser.g:189:76: EQUAL literal
					{
					match(input,EQUAL,FOLLOW_EQUAL_in_field277); if (state.failed) return;
					pushFollow(FOLLOW_literal_in_field279);
					literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			// smaliIdeaParser.g:190:5: ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |)
			int alt7=3;
			switch ( input.LA(1) ) {
			case END_FIELD_DIRECTIVE:
				{
				alt7=1;
				}
				break;
			case ANNOTATION_DIRECTIVE:
				{
				int LA7_2 = input.LA(2);
				if ( (synpred1_smaliIdeaParser()) ) {
					alt7=2;
				}
				else if ( (true) ) {
					alt7=3;
				}

				}
				break;
			case EOF:
			case CLASS_DIRECTIVE:
			case FIELD_DIRECTIVE:
			case IMPLEMENTS_DIRECTIVE:
			case METHOD_DIRECTIVE:
			case SOURCE_DIRECTIVE:
			case SUPER_DIRECTIVE:
				{
				alt7=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// smaliIdeaParser.g:190:7: END_FIELD_DIRECTIVE
					{
					match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field289); if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:191:7: ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? )
					{
					// smaliIdeaParser.g:191:32: ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? )
					// smaliIdeaParser.g:191:34: ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )?
					{
					if ( state.backtracking==0 ) {annotationsMarker = mark();}
					// smaliIdeaParser.g:192:34: ( ( ANNOTATION_DIRECTIVE )=> annotation )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0==ANNOTATION_DIRECTIVE) ) {
							int LA5_9 = input.LA(2);
							if ( (synpred2_smaliIdeaParser()) ) {
								alt5=1;
							}

						}

						switch (alt5) {
						case 1 :
							// smaliIdeaParser.g:192:35: ( ANNOTATION_DIRECTIVE )=> annotation
							{
							pushFollow(FOLLOW_annotation_in_field345);
							annotation();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					// smaliIdeaParser.g:193:34: ( END_FIELD_DIRECTIVE )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==END_FIELD_DIRECTIVE) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// smaliIdeaParser.g:193:35: END_FIELD_DIRECTIVE
							{
							match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field383); if (state.failed) return;
							if ( state.backtracking==0 ) {classAnnotations = false;}
							}
							break;

					}

					}

					}
					break;
				case 3 :
					// smaliIdeaParser.g:196:5: 
					{
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving

			    if (annotationsMarker != null) {
			      if (classAnnotations) {
			        marker.doneBefore(ElementTypes.FIELD, annotationsMarker);
			        annotationsMarker.drop();
			      } else {
			        annotationsMarker.drop();
			        marker.done(ElementTypes.FIELD);
			      }
			    } else {
			      marker.done(ElementTypes.FIELD);
			    }
			  
		}
	}
	// $ANTLR end "field"



	// $ANTLR start "method"
	// smaliIdeaParser.g:211:1: method : METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE ;
	public final void method() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:213:3: ( METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE )
			// smaliIdeaParser.g:213:5: METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE
			{
			match(input,METHOD_DIRECTIVE,FOLLOW_METHOD_DIRECTIVE_in_method457); if (state.failed) return;
			pushFollow(FOLLOW_access_list_in_method459);
			access_list();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_method_name_in_method461);
			method_name();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_method_prototype_in_method463);
			method_prototype();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_statements_and_directives_in_method465);
			statements_and_directives();
			state._fsp--;
			if (state.failed) return;
			match(input,END_METHOD_DIRECTIVE,FOLLOW_END_METHOD_DIRECTIVE_in_method467); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.METHOD); 
		}
	}
	// $ANTLR end "method"



	// $ANTLR start "statements_and_directives"
	// smaliIdeaParser.g:216:1: statements_and_directives : ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )* ;
	public final void statements_and_directives() throws RecognitionException {
		try {
			// smaliIdeaParser.g:217:3: ( ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )* )
			// smaliIdeaParser.g:217:5: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )*
			{
			// smaliIdeaParser.g:217:5: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==ANNOTATION_DIRECTIVE||LA9_0==ARRAY_DATA_DIRECTIVE||(LA9_0 >= CATCHALL_DIRECTIVE && LA9_0 <= CATCH_DIRECTIVE)||LA9_0==COLON||LA9_0==END_LOCAL_DIRECTIVE||LA9_0==EPILOGUE_DIRECTIVE||(LA9_0 >= INSTRUCTION_FORMAT10t && LA9_0 <= INSTRUCTION_FORMAT51l)||(LA9_0 >= LINE_DIRECTIVE && LA9_0 <= LOCAL_DIRECTIVE)||(LA9_0 >= PACKED_SWITCH_DIRECTIVE && LA9_0 <= PARAMETER_DIRECTIVE)||LA9_0==PROLOGUE_DIRECTIVE||(LA9_0 >= REGISTERS_DIRECTIVE && LA9_0 <= RESTART_LOCAL_DIRECTIVE)||(LA9_0 >= SOURCE_DIRECTIVE && LA9_0 <= SPARSE_SWITCH_DIRECTIVE)) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// smaliIdeaParser.g:218:7: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false]
					{
					// smaliIdeaParser.g:218:7: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )
					int alt8=8;
					switch ( input.LA(1) ) {
					case ARRAY_DATA_DIRECTIVE:
					case INSTRUCTION_FORMAT10t:
					case INSTRUCTION_FORMAT10x:
					case INSTRUCTION_FORMAT10x_ODEX:
					case INSTRUCTION_FORMAT11n:
					case INSTRUCTION_FORMAT11x:
					case INSTRUCTION_FORMAT12x:
					case INSTRUCTION_FORMAT12x_OR_ID:
					case INSTRUCTION_FORMAT20bc:
					case INSTRUCTION_FORMAT20t:
					case INSTRUCTION_FORMAT21c_FIELD:
					case INSTRUCTION_FORMAT21c_FIELD_ODEX:
					case INSTRUCTION_FORMAT21c_STRING:
					case INSTRUCTION_FORMAT21c_TYPE:
					case INSTRUCTION_FORMAT21ih:
					case INSTRUCTION_FORMAT21lh:
					case INSTRUCTION_FORMAT21s:
					case INSTRUCTION_FORMAT21t:
					case INSTRUCTION_FORMAT22b:
					case INSTRUCTION_FORMAT22c_FIELD:
					case INSTRUCTION_FORMAT22c_FIELD_ODEX:
					case INSTRUCTION_FORMAT22c_TYPE:
					case INSTRUCTION_FORMAT22cs_FIELD:
					case INSTRUCTION_FORMAT22s:
					case INSTRUCTION_FORMAT22s_OR_ID:
					case INSTRUCTION_FORMAT22t:
					case INSTRUCTION_FORMAT22x:
					case INSTRUCTION_FORMAT23x:
					case INSTRUCTION_FORMAT30t:
					case INSTRUCTION_FORMAT31c:
					case INSTRUCTION_FORMAT31i:
					case INSTRUCTION_FORMAT31i_OR_ID:
					case INSTRUCTION_FORMAT31t:
					case INSTRUCTION_FORMAT32x:
					case INSTRUCTION_FORMAT35c_METHOD:
					case INSTRUCTION_FORMAT35c_METHOD_ODEX:
					case INSTRUCTION_FORMAT35c_TYPE:
					case INSTRUCTION_FORMAT35mi_METHOD:
					case INSTRUCTION_FORMAT35ms_METHOD:
					case INSTRUCTION_FORMAT3rc_METHOD:
					case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
					case INSTRUCTION_FORMAT3rc_TYPE:
					case INSTRUCTION_FORMAT3rmi_METHOD:
					case INSTRUCTION_FORMAT3rms_METHOD:
					case INSTRUCTION_FORMAT51l:
					case PACKED_SWITCH_DIRECTIVE:
					case SPARSE_SWITCH_DIRECTIVE:
						{
						alt8=1;
						}
						break;
					case LOCALS_DIRECTIVE:
					case REGISTERS_DIRECTIVE:
						{
						alt8=2;
						}
						break;
					case COLON:
						{
						alt8=3;
						}
						break;
					case CATCH_DIRECTIVE:
						{
						alt8=4;
						}
						break;
					case CATCHALL_DIRECTIVE:
						{
						alt8=5;
						}
						break;
					case PARAMETER_DIRECTIVE:
						{
						alt8=6;
						}
						break;
					case END_LOCAL_DIRECTIVE:
					case EPILOGUE_DIRECTIVE:
					case LINE_DIRECTIVE:
					case LOCAL_DIRECTIVE:
					case PROLOGUE_DIRECTIVE:
					case RESTART_LOCAL_DIRECTIVE:
					case SOURCE_DIRECTIVE:
						{
						alt8=7;
						}
						break;
					case ANNOTATION_DIRECTIVE:
						{
						alt8=8;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}
					switch (alt8) {
						case 1 :
							// smaliIdeaParser.g:218:8: instruction
							{
							pushFollow(FOLLOW_instruction_in_statements_and_directives492);
							instruction();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// smaliIdeaParser.g:219:9: registers_directive
							{
							pushFollow(FOLLOW_registers_directive_in_statements_and_directives502);
							registers_directive();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 3 :
							// smaliIdeaParser.g:220:9: label
							{
							pushFollow(FOLLOW_label_in_statements_and_directives512);
							label();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 4 :
							// smaliIdeaParser.g:221:9: catch_directive
							{
							pushFollow(FOLLOW_catch_directive_in_statements_and_directives522);
							catch_directive();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 5 :
							// smaliIdeaParser.g:222:9: catchall_directive
							{
							pushFollow(FOLLOW_catchall_directive_in_statements_and_directives532);
							catchall_directive();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 6 :
							// smaliIdeaParser.g:223:9: parameter_directive
							{
							pushFollow(FOLLOW_parameter_directive_in_statements_and_directives542);
							parameter_directive();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 7 :
							// smaliIdeaParser.g:224:9: ordered_debug_directive
							{
							pushFollow(FOLLOW_ordered_debug_directive_in_statements_and_directives552);
							ordered_debug_directive();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 8 :
							// smaliIdeaParser.g:225:9: annotation
							{
							pushFollow(FOLLOW_annotation_in_statements_and_directives562);
							annotation();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					pushFollow(FOLLOW_sync_in_statements_and_directives576);
					sync(false);
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements_and_directives"



	// $ANTLR start "registers_directive"
	// smaliIdeaParser.g:229:1: registers_directive : ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal ) ;
	public final void registers_directive() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:231:3: ( ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal ) )
			// smaliIdeaParser.g:231:5: ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal )
			{
			// smaliIdeaParser.g:231:5: ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==REGISTERS_DIRECTIVE) ) {
				alt10=1;
			}
			else if ( (LA10_0==LOCALS_DIRECTIVE) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// smaliIdeaParser.g:231:7: REGISTERS_DIRECTIVE integral_literal
					{
					match(input,REGISTERS_DIRECTIVE,FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive598); if (state.failed) return;
					pushFollow(FOLLOW_integral_literal_in_registers_directive600);
					integral_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:232:7: LOCALS_DIRECTIVE integral_literal
					{
					match(input,LOCALS_DIRECTIVE,FOLLOW_LOCALS_DIRECTIVE_in_registers_directive608); if (state.failed) return;
					pushFollow(FOLLOW_integral_literal_in_registers_directive610);
					integral_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.REGISTERS_SPEC); 
		}
	}
	// $ANTLR end "registers_directive"



	// $ANTLR start "simple_name"
	// smaliIdeaParser.g:238:1: simple_name : ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l );
	public final void simple_name() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:241:3: ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l )
			// smaliIdeaParser.g:
			{
			if ( input.LA(1)==ACCESS_SPEC||input.LA(1)==ANNOTATION_VISIBILITY||input.LA(1)==BOOL_LITERAL||input.LA(1)==DOUBLE_LITERAL_OR_ID||input.LA(1)==FLOAT_LITERAL_OR_ID||(input.LA(1) >= INSTRUCTION_FORMAT10t && input.LA(1) <= INSTRUCTION_FORMAT10x_ODEX)||input.LA(1)==INSTRUCTION_FORMAT11x||input.LA(1)==INSTRUCTION_FORMAT12x_OR_ID||(input.LA(1) >= INSTRUCTION_FORMAT21c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT21c_TYPE)||input.LA(1)==INSTRUCTION_FORMAT21t||(input.LA(1) >= INSTRUCTION_FORMAT22c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT22cs_FIELD)||(input.LA(1) >= INSTRUCTION_FORMAT22s_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT22t)||input.LA(1)==INSTRUCTION_FORMAT23x||(input.LA(1) >= INSTRUCTION_FORMAT31i_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT31t)||(input.LA(1) >= INSTRUCTION_FORMAT35c_METHOD && input.LA(1) <= INSTRUCTION_FORMAT35ms_METHOD)||input.LA(1)==INSTRUCTION_FORMAT51l||(input.LA(1) >= NEGATIVE_INTEGER_LITERAL && input.LA(1) <= NULL_LITERAL)||(input.LA(1) >= PARAM_LIST_OR_ID && input.LA(1) <= PRIMITIVE_TYPE)||input.LA(1)==REGISTER||input.LA(1)==SIMPLE_NAME||(input.LA(1) >= VERIFICATION_ERROR_TYPE && input.LA(1) <= VOID_TYPE) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			if ( state.backtracking==0 ) { marker.done(ElementTypes.SIMPLE_NAME); }
		}
		catch (RecognitionException ex) {
			 marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
		}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "simple_name"



	// $ANTLR start "method_name"
	// smaliIdeaParser.g:282:1: method_name : ( simple_name | METHOD_NAME );
	public final void method_name() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:284:3: ( simple_name | METHOD_NAME )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==ACCESS_SPEC||LA11_0==ANNOTATION_VISIBILITY||LA11_0==BOOL_LITERAL||LA11_0==DOUBLE_LITERAL_OR_ID||LA11_0==FLOAT_LITERAL_OR_ID||(LA11_0 >= INSTRUCTION_FORMAT10t && LA11_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA11_0==INSTRUCTION_FORMAT11x||LA11_0==INSTRUCTION_FORMAT12x_OR_ID||(LA11_0 >= INSTRUCTION_FORMAT21c_FIELD && LA11_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA11_0==INSTRUCTION_FORMAT21t||(LA11_0 >= INSTRUCTION_FORMAT22c_FIELD && LA11_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA11_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA11_0 <= INSTRUCTION_FORMAT22t)||LA11_0==INSTRUCTION_FORMAT23x||(LA11_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA11_0 <= INSTRUCTION_FORMAT31t)||(LA11_0 >= INSTRUCTION_FORMAT35c_METHOD && LA11_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA11_0==INSTRUCTION_FORMAT51l||(LA11_0 >= NEGATIVE_INTEGER_LITERAL && LA11_0 <= NULL_LITERAL)||(LA11_0 >= PARAM_LIST_OR_ID && LA11_0 <= PRIMITIVE_TYPE)||LA11_0==REGISTER||LA11_0==SIMPLE_NAME||(LA11_0 >= VERIFICATION_ERROR_TYPE && LA11_0 <= VOID_TYPE)) ) {
				alt11=1;
			}
			else if ( (LA11_0==METHOD_NAME) ) {
				alt11=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// smaliIdeaParser.g:284:5: simple_name
					{
					pushFollow(FOLLOW_simple_name_in_method_name901);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:285:5: METHOD_NAME
					{
					match(input,METHOD_NAME,FOLLOW_METHOD_NAME_in_method_name907); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.METHOD_NAME); 
		}
	}
	// $ANTLR end "method_name"



	// $ANTLR start "method_prototype"
	// smaliIdeaParser.g:288:1: method_prototype : OPEN_PAREN param_list CLOSE_PAREN type_descriptor ;
	public final void method_prototype() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:290:3: ( OPEN_PAREN param_list CLOSE_PAREN type_descriptor )
			// smaliIdeaParser.g:290:5: OPEN_PAREN param_list CLOSE_PAREN type_descriptor
			{
			match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_method_prototype930); if (state.failed) return;
			pushFollow(FOLLOW_param_list_in_method_prototype932);
			param_list();
			state._fsp--;
			if (state.failed) return;
			match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_method_prototype934); if (state.failed) return;
			pushFollow(FOLLOW_type_descriptor_in_method_prototype936);
			type_descriptor();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.METHOD_PROTOTYPE); 
		}
	}
	// $ANTLR end "method_prototype"



	// $ANTLR start "param_list"
	// smaliIdeaParser.g:293:1: param_list : ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* );
	public final void param_list() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:295:3: ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* )
			int alt13=3;
			switch ( input.LA(1) ) {
			case PARAM_LIST:
				{
				alt13=1;
				}
				break;
			case PARAM_LIST_OR_ID:
				{
				alt13=2;
				}
				break;
			case ARRAY_DESCRIPTOR:
			case CLASS_DESCRIPTOR:
			case CLOSE_PAREN:
			case PRIMITIVE_TYPE:
				{
				alt13=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// smaliIdeaParser.g:295:5: PARAM_LIST
					{
					match(input,PARAM_LIST,FOLLOW_PARAM_LIST_in_param_list959); if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:296:5: PARAM_LIST_OR_ID
					{
					match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_param_list965); if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:297:5: ( nonvoid_type_descriptor )*
					{
					// smaliIdeaParser.g:297:5: ( nonvoid_type_descriptor )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==ARRAY_DESCRIPTOR||LA12_0==CLASS_DESCRIPTOR||LA12_0==PRIMITIVE_TYPE) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// smaliIdeaParser.g:297:5: nonvoid_type_descriptor
							{
							pushFollow(FOLLOW_nonvoid_type_descriptor_in_param_list971);
							nonvoid_type_descriptor();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.METHOD_PARAM_LIST); 
		}
	}
	// $ANTLR end "param_list"



	// $ANTLR start "void_type"
	// smaliIdeaParser.g:300:1: void_type : VOID_TYPE ;
	public final void void_type() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:302:3: ( VOID_TYPE )
			// smaliIdeaParser.g:302:5: VOID_TYPE
			{
			match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_void_type995); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.VOID_TYPE); 
		}
	}
	// $ANTLR end "void_type"



	// $ANTLR start "primitive_type"
	// smaliIdeaParser.g:305:1: primitive_type : PRIMITIVE_TYPE ;
	public final void primitive_type() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:307:3: ( PRIMITIVE_TYPE )
			// smaliIdeaParser.g:307:5: PRIMITIVE_TYPE
			{
			match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_primitive_type1018); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.PRIMITIVE_TYPE); 
		}
	}
	// $ANTLR end "primitive_type"



	// $ANTLR start "class_descriptor"
	// smaliIdeaParser.g:310:1: class_descriptor : CLASS_DESCRIPTOR ;
	public final void class_descriptor() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:312:3: ( CLASS_DESCRIPTOR )
			// smaliIdeaParser.g:312:5: CLASS_DESCRIPTOR
			{
			match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_class_descriptor1041); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.CLASS_TYPE); 
		}
	}
	// $ANTLR end "class_descriptor"



	// $ANTLR start "type_descriptor"
	// smaliIdeaParser.g:315:1: type_descriptor : ( void_type | primitive_type | class_descriptor | ARRAY_DESCRIPTOR );
	public final void type_descriptor() throws RecognitionException {
		try {
			// smaliIdeaParser.g:316:3: ( void_type | primitive_type | class_descriptor | ARRAY_DESCRIPTOR )
			int alt14=4;
			switch ( input.LA(1) ) {
			case VOID_TYPE:
				{
				alt14=1;
				}
				break;
			case PRIMITIVE_TYPE:
				{
				alt14=2;
				}
				break;
			case CLASS_DESCRIPTOR:
				{
				alt14=3;
				}
				break;
			case ARRAY_DESCRIPTOR:
				{
				alt14=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// smaliIdeaParser.g:316:5: void_type
					{
					pushFollow(FOLLOW_void_type_in_type_descriptor1057);
					void_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:317:5: primitive_type
					{
					pushFollow(FOLLOW_primitive_type_in_type_descriptor1063);
					primitive_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:318:5: class_descriptor
					{
					pushFollow(FOLLOW_class_descriptor_in_type_descriptor1069);
					class_descriptor();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// smaliIdeaParser.g:319:5: ARRAY_DESCRIPTOR
					{
					match(input,ARRAY_DESCRIPTOR,FOLLOW_ARRAY_DESCRIPTOR_in_type_descriptor1075); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_descriptor"



	// $ANTLR start "nonvoid_type_descriptor"
	// smaliIdeaParser.g:321:1: nonvoid_type_descriptor : ( primitive_type | class_descriptor | ARRAY_DESCRIPTOR );
	public final void nonvoid_type_descriptor() throws RecognitionException {
		try {
			// smaliIdeaParser.g:322:3: ( primitive_type | class_descriptor | ARRAY_DESCRIPTOR )
			int alt15=3;
			switch ( input.LA(1) ) {
			case PRIMITIVE_TYPE:
				{
				alt15=1;
				}
				break;
			case CLASS_DESCRIPTOR:
				{
				alt15=2;
				}
				break;
			case ARRAY_DESCRIPTOR:
				{
				alt15=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// smaliIdeaParser.g:322:5: primitive_type
					{
					pushFollow(FOLLOW_primitive_type_in_nonvoid_type_descriptor1085);
					primitive_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:323:5: class_descriptor
					{
					pushFollow(FOLLOW_class_descriptor_in_nonvoid_type_descriptor1091);
					class_descriptor();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:324:5: ARRAY_DESCRIPTOR
					{
					match(input,ARRAY_DESCRIPTOR,FOLLOW_ARRAY_DESCRIPTOR_in_nonvoid_type_descriptor1097); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nonvoid_type_descriptor"



	// $ANTLR start "reference_type_descriptor"
	// smaliIdeaParser.g:326:1: reference_type_descriptor : ( class_descriptor | ARRAY_DESCRIPTOR );
	public final void reference_type_descriptor() throws RecognitionException {
		try {
			// smaliIdeaParser.g:327:3: ( class_descriptor | ARRAY_DESCRIPTOR )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==CLASS_DESCRIPTOR) ) {
				alt16=1;
			}
			else if ( (LA16_0==ARRAY_DESCRIPTOR) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// smaliIdeaParser.g:327:5: class_descriptor
					{
					pushFollow(FOLLOW_class_descriptor_in_reference_type_descriptor1107);
					class_descriptor();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:328:5: ARRAY_DESCRIPTOR
					{
					match(input,ARRAY_DESCRIPTOR,FOLLOW_ARRAY_DESCRIPTOR_in_reference_type_descriptor1113); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "reference_type_descriptor"



	// $ANTLR start "integer_literal"
	// smaliIdeaParser.g:330:1: integer_literal : ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL );
	public final void integer_literal() throws RecognitionException {
		try {
			// smaliIdeaParser.g:331:3: ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL )
			// smaliIdeaParser.g:
			{
			if ( input.LA(1)==NEGATIVE_INTEGER_LITERAL||input.LA(1)==POSITIVE_INTEGER_LITERAL ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "integer_literal"



	// $ANTLR start "float_literal"
	// smaliIdeaParser.g:334:1: float_literal : ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL );
	public final void float_literal() throws RecognitionException {
		try {
			// smaliIdeaParser.g:335:3: ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL )
			// smaliIdeaParser.g:
			{
			if ( (input.LA(1) >= FLOAT_LITERAL && input.LA(1) <= FLOAT_LITERAL_OR_ID) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "float_literal"



	// $ANTLR start "double_literal"
	// smaliIdeaParser.g:338:1: double_literal : ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL );
	public final void double_literal() throws RecognitionException {
		try {
			// smaliIdeaParser.g:339:3: ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL )
			// smaliIdeaParser.g:
			{
			if ( (input.LA(1) >= DOUBLE_LITERAL && input.LA(1) <= DOUBLE_LITERAL_OR_ID) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "double_literal"



	// $ANTLR start "literal"
	// smaliIdeaParser.g:342:1: literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal );
	public final void literal() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:344:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal )
			int alt17=14;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt17=1;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt17=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt17=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt17=4;
				}
				break;
			case FLOAT_LITERAL:
			case FLOAT_LITERAL_OR_ID:
				{
				alt17=5;
				}
				break;
			case DOUBLE_LITERAL:
			case DOUBLE_LITERAL_OR_ID:
				{
				alt17=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt17=7;
				}
				break;
			case STRING_LITERAL:
				{
				alt17=8;
				}
				break;
			case BOOL_LITERAL:
				{
				alt17=9;
				}
				break;
			case NULL_LITERAL:
				{
				alt17=10;
				}
				break;
			case OPEN_BRACE:
				{
				alt17=11;
				}
				break;
			case SUBANNOTATION_DIRECTIVE:
				{
				alt17=12;
				}
				break;
			case ARRAY_DESCRIPTOR:
			case CLASS_DESCRIPTOR:
			case PRIMITIVE_TYPE:
			case VOID_TYPE:
				{
				alt17=13;
				}
				break;
			case ENUM_DIRECTIVE:
				{
				alt17=14;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// smaliIdeaParser.g:344:5: LONG_LITERAL
					{
					match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_literal1178); if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:345:5: integer_literal
					{
					pushFollow(FOLLOW_integer_literal_in_literal1184);
					integer_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:346:5: SHORT_LITERAL
					{
					match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_literal1190); if (state.failed) return;
					}
					break;
				case 4 :
					// smaliIdeaParser.g:347:5: BYTE_LITERAL
					{
					match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_literal1196); if (state.failed) return;
					}
					break;
				case 5 :
					// smaliIdeaParser.g:348:5: float_literal
					{
					pushFollow(FOLLOW_float_literal_in_literal1202);
					float_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// smaliIdeaParser.g:349:5: double_literal
					{
					pushFollow(FOLLOW_double_literal_in_literal1208);
					double_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// smaliIdeaParser.g:350:5: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal1214); if (state.failed) return;
					}
					break;
				case 8 :
					// smaliIdeaParser.g:351:5: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal1220); if (state.failed) return;
					}
					break;
				case 9 :
					// smaliIdeaParser.g:352:5: BOOL_LITERAL
					{
					match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_literal1226); if (state.failed) return;
					}
					break;
				case 10 :
					// smaliIdeaParser.g:353:5: NULL_LITERAL
					{
					match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_literal1232); if (state.failed) return;
					}
					break;
				case 11 :
					// smaliIdeaParser.g:354:5: array_literal
					{
					pushFollow(FOLLOW_array_literal_in_literal1238);
					array_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// smaliIdeaParser.g:355:5: subannotation
					{
					pushFollow(FOLLOW_subannotation_in_literal1244);
					subannotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// smaliIdeaParser.g:356:5: type_field_method_literal
					{
					pushFollow(FOLLOW_type_field_method_literal_in_literal1250);
					type_field_method_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					// smaliIdeaParser.g:357:5: enum_literal
					{
					pushFollow(FOLLOW_enum_literal_in_literal1256);
					enum_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.LITERAL); 
		}
	}
	// $ANTLR end "literal"



	// $ANTLR start "integral_literal"
	// smaliIdeaParser.g:360:1: integral_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL );
	public final void integral_literal() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:362:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL )
			int alt18=5;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt18=1;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt18=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt18=3;
				}
				break;
			case CHAR_LITERAL:
				{
				alt18=4;
				}
				break;
			case BYTE_LITERAL:
				{
				alt18=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// smaliIdeaParser.g:362:5: LONG_LITERAL
					{
					match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_integral_literal1279); if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:363:5: integer_literal
					{
					pushFollow(FOLLOW_integer_literal_in_integral_literal1285);
					integer_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:364:5: SHORT_LITERAL
					{
					match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_integral_literal1291); if (state.failed) return;
					}
					break;
				case 4 :
					// smaliIdeaParser.g:365:5: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_integral_literal1297); if (state.failed) return;
					}
					break;
				case 5 :
					// smaliIdeaParser.g:366:5: BYTE_LITERAL
					{
					match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_integral_literal1303); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.LITERAL); 
		}
	}
	// $ANTLR end "integral_literal"



	// $ANTLR start "fixed_32bit_literal"
	// smaliIdeaParser.g:369:1: fixed_32bit_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL );
	public final void fixed_32bit_literal() throws RecognitionException {
		try {
			// smaliIdeaParser.g:370:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL )
			int alt19=7;
			switch ( input.LA(1) ) {
			case LONG_LITERAL:
				{
				alt19=1;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt19=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt19=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt19=4;
				}
				break;
			case FLOAT_LITERAL:
			case FLOAT_LITERAL_OR_ID:
				{
				alt19=5;
				}
				break;
			case CHAR_LITERAL:
				{
				alt19=6;
				}
				break;
			case BOOL_LITERAL:
				{
				alt19=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// smaliIdeaParser.g:370:5: LONG_LITERAL
					{
					match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1319); if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:371:5: integer_literal
					{
					pushFollow(FOLLOW_integer_literal_in_fixed_32bit_literal1325);
					integer_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:372:5: SHORT_LITERAL
					{
					match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1331); if (state.failed) return;
					}
					break;
				case 4 :
					// smaliIdeaParser.g:373:5: BYTE_LITERAL
					{
					match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1337); if (state.failed) return;
					}
					break;
				case 5 :
					// smaliIdeaParser.g:374:5: float_literal
					{
					pushFollow(FOLLOW_float_literal_in_fixed_32bit_literal1343);
					float_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// smaliIdeaParser.g:375:5: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1349); if (state.failed) return;
					}
					break;
				case 7 :
					// smaliIdeaParser.g:376:5: BOOL_LITERAL
					{
					match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1355); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fixed_32bit_literal"



	// $ANTLR start "fixed_literal"
	// smaliIdeaParser.g:378:1: fixed_literal : ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL );
	public final void fixed_literal() throws RecognitionException {
		try {
			// smaliIdeaParser.g:379:3: ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL )
			int alt20=8;
			switch ( input.LA(1) ) {
			case NEGATIVE_INTEGER_LITERAL:
			case POSITIVE_INTEGER_LITERAL:
				{
				alt20=1;
				}
				break;
			case LONG_LITERAL:
				{
				alt20=2;
				}
				break;
			case SHORT_LITERAL:
				{
				alt20=3;
				}
				break;
			case BYTE_LITERAL:
				{
				alt20=4;
				}
				break;
			case FLOAT_LITERAL:
			case FLOAT_LITERAL_OR_ID:
				{
				alt20=5;
				}
				break;
			case DOUBLE_LITERAL:
			case DOUBLE_LITERAL_OR_ID:
				{
				alt20=6;
				}
				break;
			case CHAR_LITERAL:
				{
				alt20=7;
				}
				break;
			case BOOL_LITERAL:
				{
				alt20=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// smaliIdeaParser.g:379:5: integer_literal
					{
					pushFollow(FOLLOW_integer_literal_in_fixed_literal1365);
					integer_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:380:5: LONG_LITERAL
					{
					match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_literal1371); if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:381:5: SHORT_LITERAL
					{
					match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_literal1377); if (state.failed) return;
					}
					break;
				case 4 :
					// smaliIdeaParser.g:382:5: BYTE_LITERAL
					{
					match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_literal1383); if (state.failed) return;
					}
					break;
				case 5 :
					// smaliIdeaParser.g:383:5: float_literal
					{
					pushFollow(FOLLOW_float_literal_in_fixed_literal1389);
					float_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// smaliIdeaParser.g:384:5: double_literal
					{
					pushFollow(FOLLOW_double_literal_in_fixed_literal1395);
					double_literal();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// smaliIdeaParser.g:385:5: CHAR_LITERAL
					{
					match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_literal1401); if (state.failed) return;
					}
					break;
				case 8 :
					// smaliIdeaParser.g:386:5: BOOL_LITERAL
					{
					match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_literal1407); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fixed_literal"



	// $ANTLR start "array_literal"
	// smaliIdeaParser.g:388:1: array_literal : OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE ;
	public final void array_literal() throws RecognitionException {
		try {
			// smaliIdeaParser.g:389:3: ( OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE )
			// smaliIdeaParser.g:389:5: OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE
			{
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_array_literal1417); if (state.failed) return;
			// smaliIdeaParser.g:389:16: ( literal ( COMMA literal )* |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ARRAY_DESCRIPTOR||(LA22_0 >= BOOL_LITERAL && LA22_0 <= BYTE_LITERAL)||(LA22_0 >= CHAR_LITERAL && LA22_0 <= CLASS_DESCRIPTOR)||(LA22_0 >= DOUBLE_LITERAL && LA22_0 <= DOUBLE_LITERAL_OR_ID)||LA22_0==ENUM_DIRECTIVE||(LA22_0 >= FLOAT_LITERAL && LA22_0 <= FLOAT_LITERAL_OR_ID)||LA22_0==LONG_LITERAL||(LA22_0 >= NEGATIVE_INTEGER_LITERAL && LA22_0 <= NULL_LITERAL)||LA22_0==OPEN_BRACE||(LA22_0 >= POSITIVE_INTEGER_LITERAL && LA22_0 <= PRIMITIVE_TYPE)||LA22_0==SHORT_LITERAL||(LA22_0 >= STRING_LITERAL && LA22_0 <= SUBANNOTATION_DIRECTIVE)||LA22_0==VOID_TYPE) ) {
				alt22=1;
			}
			else if ( (LA22_0==CLOSE_BRACE) ) {
				alt22=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// smaliIdeaParser.g:389:17: literal ( COMMA literal )*
					{
					pushFollow(FOLLOW_literal_in_array_literal1420);
					literal();
					state._fsp--;
					if (state.failed) return;
					// smaliIdeaParser.g:389:25: ( COMMA literal )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==COMMA) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// smaliIdeaParser.g:389:26: COMMA literal
							{
							match(input,COMMA,FOLLOW_COMMA_in_array_literal1423); if (state.failed) return;
							pushFollow(FOLLOW_literal_in_array_literal1425);
							literal();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop21;
						}
					}

					}
					break;
				case 2 :
					// smaliIdeaParser.g:389:44: 
					{
					}
					break;

			}

			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_array_literal1433); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "array_literal"



	// $ANTLR start "annotation_element"
	// smaliIdeaParser.g:391:1: annotation_element : simple_name EQUAL literal ;
	public final void annotation_element() throws RecognitionException {
		try {
			// smaliIdeaParser.g:392:3: ( simple_name EQUAL literal )
			// smaliIdeaParser.g:392:5: simple_name EQUAL literal
			{
			pushFollow(FOLLOW_simple_name_in_annotation_element1443);
			simple_name();
			state._fsp--;
			if (state.failed) return;
			match(input,EQUAL,FOLLOW_EQUAL_in_annotation_element1445); if (state.failed) return;
			pushFollow(FOLLOW_literal_in_annotation_element1447);
			literal();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "annotation_element"



	// $ANTLR start "annotation"
	// smaliIdeaParser.g:395:1: annotation : ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY class_descriptor ( annotation_element )* END_ANNOTATION_DIRECTIVE ;
	public final void annotation() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:397:3: ( ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY class_descriptor ( annotation_element )* END_ANNOTATION_DIRECTIVE )
			// smaliIdeaParser.g:397:5: ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY class_descriptor ( annotation_element )* END_ANNOTATION_DIRECTIVE
			{
			match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1465); if (state.failed) return;
			match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_annotation1467); if (state.failed) return;
			pushFollow(FOLLOW_class_descriptor_in_annotation1469);
			class_descriptor();
			state._fsp--;
			if (state.failed) return;
			// smaliIdeaParser.g:398:5: ( annotation_element )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==ACCESS_SPEC||LA23_0==ANNOTATION_VISIBILITY||LA23_0==BOOL_LITERAL||LA23_0==DOUBLE_LITERAL_OR_ID||LA23_0==FLOAT_LITERAL_OR_ID||(LA23_0 >= INSTRUCTION_FORMAT10t && LA23_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA23_0==INSTRUCTION_FORMAT11x||LA23_0==INSTRUCTION_FORMAT12x_OR_ID||(LA23_0 >= INSTRUCTION_FORMAT21c_FIELD && LA23_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA23_0==INSTRUCTION_FORMAT21t||(LA23_0 >= INSTRUCTION_FORMAT22c_FIELD && LA23_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA23_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA23_0 <= INSTRUCTION_FORMAT22t)||LA23_0==INSTRUCTION_FORMAT23x||(LA23_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA23_0 <= INSTRUCTION_FORMAT31t)||(LA23_0 >= INSTRUCTION_FORMAT35c_METHOD && LA23_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA23_0==INSTRUCTION_FORMAT51l||(LA23_0 >= NEGATIVE_INTEGER_LITERAL && LA23_0 <= NULL_LITERAL)||(LA23_0 >= PARAM_LIST_OR_ID && LA23_0 <= PRIMITIVE_TYPE)||LA23_0==REGISTER||LA23_0==SIMPLE_NAME||(LA23_0 >= VERIFICATION_ERROR_TYPE && LA23_0 <= VOID_TYPE)) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// smaliIdeaParser.g:398:5: annotation_element
					{
					pushFollow(FOLLOW_annotation_element_in_annotation1475);
					annotation_element();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			match(input,END_ANNOTATION_DIRECTIVE,FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1478); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.ANNOTATION); 
		}
	}
	// $ANTLR end "annotation"



	// $ANTLR start "subannotation"
	// smaliIdeaParser.g:401:1: subannotation : SUBANNOTATION_DIRECTIVE class_descriptor ( annotation_element )* END_SUBANNOTATION_DIRECTIVE ;
	public final void subannotation() throws RecognitionException {
		try {
			// smaliIdeaParser.g:402:3: ( SUBANNOTATION_DIRECTIVE class_descriptor ( annotation_element )* END_SUBANNOTATION_DIRECTIVE )
			// smaliIdeaParser.g:402:5: SUBANNOTATION_DIRECTIVE class_descriptor ( annotation_element )* END_SUBANNOTATION_DIRECTIVE
			{
			match(input,SUBANNOTATION_DIRECTIVE,FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1494); if (state.failed) return;
			pushFollow(FOLLOW_class_descriptor_in_subannotation1496);
			class_descriptor();
			state._fsp--;
			if (state.failed) return;
			// smaliIdeaParser.g:402:46: ( annotation_element )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==ACCESS_SPEC||LA24_0==ANNOTATION_VISIBILITY||LA24_0==BOOL_LITERAL||LA24_0==DOUBLE_LITERAL_OR_ID||LA24_0==FLOAT_LITERAL_OR_ID||(LA24_0 >= INSTRUCTION_FORMAT10t && LA24_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA24_0==INSTRUCTION_FORMAT11x||LA24_0==INSTRUCTION_FORMAT12x_OR_ID||(LA24_0 >= INSTRUCTION_FORMAT21c_FIELD && LA24_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA24_0==INSTRUCTION_FORMAT21t||(LA24_0 >= INSTRUCTION_FORMAT22c_FIELD && LA24_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA24_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA24_0 <= INSTRUCTION_FORMAT22t)||LA24_0==INSTRUCTION_FORMAT23x||(LA24_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA24_0 <= INSTRUCTION_FORMAT31t)||(LA24_0 >= INSTRUCTION_FORMAT35c_METHOD && LA24_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA24_0==INSTRUCTION_FORMAT51l||(LA24_0 >= NEGATIVE_INTEGER_LITERAL && LA24_0 <= NULL_LITERAL)||(LA24_0 >= PARAM_LIST_OR_ID && LA24_0 <= PRIMITIVE_TYPE)||LA24_0==REGISTER||LA24_0==SIMPLE_NAME||(LA24_0 >= VERIFICATION_ERROR_TYPE && LA24_0 <= VOID_TYPE)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// smaliIdeaParser.g:402:46: annotation_element
					{
					pushFollow(FOLLOW_annotation_element_in_subannotation1498);
					annotation_element();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,END_SUBANNOTATION_DIRECTIVE,FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1501); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "subannotation"



	// $ANTLR start "enum_literal"
	// smaliIdeaParser.g:404:1: enum_literal : ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor ;
	public final void enum_literal() throws RecognitionException {
		try {
			// smaliIdeaParser.g:405:3: ( ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor )
			// smaliIdeaParser.g:405:5: ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor
			{
			match(input,ENUM_DIRECTIVE,FOLLOW_ENUM_DIRECTIVE_in_enum_literal1511); if (state.failed) return;
			pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1513);
			reference_type_descriptor();
			state._fsp--;
			if (state.failed) return;
			match(input,ARROW,FOLLOW_ARROW_in_enum_literal1515); if (state.failed) return;
			pushFollow(FOLLOW_simple_name_in_enum_literal1517);
			simple_name();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_enum_literal1519); if (state.failed) return;
			pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1521);
			reference_type_descriptor();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "enum_literal"



	// $ANTLR start "type_field_method_literal"
	// smaliIdeaParser.g:407:1: type_field_method_literal : ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |) | primitive_type | void_type );
	public final void type_field_method_literal() throws RecognitionException {
		try {
			// smaliIdeaParser.g:408:3: ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |) | primitive_type | void_type )
			int alt27=3;
			switch ( input.LA(1) ) {
			case ARRAY_DESCRIPTOR:
			case CLASS_DESCRIPTOR:
				{
				alt27=1;
				}
				break;
			case PRIMITIVE_TYPE:
				{
				alt27=2;
				}
				break;
			case VOID_TYPE:
				{
				alt27=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// smaliIdeaParser.g:408:5: reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |)
					{
					pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal1531);
					reference_type_descriptor();
					state._fsp--;
					if (state.failed) return;
					// smaliIdeaParser.g:409:5: ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |)
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==ARROW) ) {
						alt26=1;
					}
					else if ( (LA26_0==EOF||(LA26_0 >= ACCESS_SPEC && LA26_0 <= ARRAY_DATA_DIRECTIVE)||LA26_0==BOOL_LITERAL||(LA26_0 >= CATCHALL_DIRECTIVE && LA26_0 <= CATCH_DIRECTIVE)||(LA26_0 >= CLASS_DIRECTIVE && LA26_0 <= CLOSE_BRACE)||(LA26_0 >= COLON && LA26_0 <= COMMA)||(LA26_0 >= DOUBLE_LITERAL_OR_ID && LA26_0 <= END_ANNOTATION_DIRECTIVE)||(LA26_0 >= END_FIELD_DIRECTIVE && LA26_0 <= END_METHOD_DIRECTIVE)||LA26_0==END_SUBANNOTATION_DIRECTIVE||LA26_0==EPILOGUE_DIRECTIVE||LA26_0==FIELD_DIRECTIVE||LA26_0==FLOAT_LITERAL_OR_ID||LA26_0==IMPLEMENTS_DIRECTIVE||(LA26_0 >= INSTRUCTION_FORMAT10t && LA26_0 <= INSTRUCTION_FORMAT51l)||(LA26_0 >= LINE_DIRECTIVE && LA26_0 <= LOCAL_DIRECTIVE)||LA26_0==METHOD_DIRECTIVE||(LA26_0 >= NEGATIVE_INTEGER_LITERAL && LA26_0 <= NULL_LITERAL)||(LA26_0 >= PACKED_SWITCH_DIRECTIVE && LA26_0 <= PARAMETER_DIRECTIVE)||(LA26_0 >= PARAM_LIST_OR_ID && LA26_0 <= RESTART_LOCAL_DIRECTIVE)||(LA26_0 >= SIMPLE_NAME && LA26_0 <= SPARSE_SWITCH_DIRECTIVE)||(LA26_0 >= SUPER_DIRECTIVE && LA26_0 <= VOID_TYPE)) ) {
						alt26=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// smaliIdeaParser.g:409:7: ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
							{
							match(input,ARROW,FOLLOW_ARROW_in_type_field_method_literal1539); if (state.failed) return;
							// smaliIdeaParser.g:410:7: ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==ACCESS_SPEC||LA25_0==ANNOTATION_VISIBILITY||LA25_0==BOOL_LITERAL||LA25_0==DOUBLE_LITERAL_OR_ID||LA25_0==FLOAT_LITERAL_OR_ID||(LA25_0 >= INSTRUCTION_FORMAT10t && LA25_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA25_0==INSTRUCTION_FORMAT11x||LA25_0==INSTRUCTION_FORMAT12x_OR_ID||(LA25_0 >= INSTRUCTION_FORMAT21c_FIELD && LA25_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA25_0==INSTRUCTION_FORMAT21t||(LA25_0 >= INSTRUCTION_FORMAT22c_FIELD && LA25_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA25_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA25_0 <= INSTRUCTION_FORMAT22t)||LA25_0==INSTRUCTION_FORMAT23x||(LA25_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA25_0 <= INSTRUCTION_FORMAT31t)||(LA25_0 >= INSTRUCTION_FORMAT35c_METHOD && LA25_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA25_0==INSTRUCTION_FORMAT51l||(LA25_0 >= NEGATIVE_INTEGER_LITERAL && LA25_0 <= NULL_LITERAL)||(LA25_0 >= PARAM_LIST_OR_ID && LA25_0 <= PRIMITIVE_TYPE)||LA25_0==REGISTER||LA25_0==SIMPLE_NAME||(LA25_0 >= VERIFICATION_ERROR_TYPE && LA25_0 <= VOID_TYPE)) ) {
								int LA25_1 = input.LA(2);
								if ( (LA25_1==COLON) ) {
									alt25=1;
								}
								else if ( (LA25_1==OPEN_PAREN) ) {
									alt25=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 25, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA25_0==METHOD_NAME) ) {
								alt25=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								NoViableAltException nvae =
									new NoViableAltException("", 25, 0, input);
								throw nvae;
							}

							switch (alt25) {
								case 1 :
									// smaliIdeaParser.g:410:9: simple_name COLON nonvoid_type_descriptor
									{
									pushFollow(FOLLOW_simple_name_in_type_field_method_literal1549);
									simple_name();
									state._fsp--;
									if (state.failed) return;
									match(input,COLON,FOLLOW_COLON_in_type_field_method_literal1551); if (state.failed) return;
									pushFollow(FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1553);
									nonvoid_type_descriptor();
									state._fsp--;
									if (state.failed) return;
									}
									break;
								case 2 :
									// smaliIdeaParser.g:411:9: method_name method_prototype
									{
									pushFollow(FOLLOW_method_name_in_type_field_method_literal1563);
									method_name();
									state._fsp--;
									if (state.failed) return;
									pushFollow(FOLLOW_method_prototype_in_type_field_method_literal1565);
									method_prototype();
									state._fsp--;
									if (state.failed) return;
									}
									break;

							}

							}
							break;
						case 2 :
							// smaliIdeaParser.g:414:5: 
							{
							}
							break;

					}

					}
					break;
				case 2 :
					// smaliIdeaParser.g:415:5: primitive_type
					{
					pushFollow(FOLLOW_primitive_type_in_type_field_method_literal1595);
					primitive_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:416:5: void_type
					{
					pushFollow(FOLLOW_void_type_in_type_field_method_literal1601);
					void_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type_field_method_literal"



	// $ANTLR start "fully_qualified_method"
	// smaliIdeaParser.g:418:1: fully_qualified_method : reference_type_descriptor ARROW method_name method_prototype ;
	public final void fully_qualified_method() throws RecognitionException {
		try {
			// smaliIdeaParser.g:419:3: ( reference_type_descriptor ARROW method_name method_prototype )
			// smaliIdeaParser.g:419:5: reference_type_descriptor ARROW method_name method_prototype
			{
			pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_method1611);
			reference_type_descriptor();
			state._fsp--;
			if (state.failed) return;
			match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_method1613); if (state.failed) return;
			pushFollow(FOLLOW_method_name_in_fully_qualified_method1615);
			method_name();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_method_prototype_in_fully_qualified_method1617);
			method_prototype();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fully_qualified_method"



	// $ANTLR start "fully_qualified_field"
	// smaliIdeaParser.g:421:1: fully_qualified_field : reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor ;
	public final void fully_qualified_field() throws RecognitionException {
		try {
			// smaliIdeaParser.g:422:3: ( reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor )
			// smaliIdeaParser.g:422:5: reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor
			{
			pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_field1627);
			reference_type_descriptor();
			state._fsp--;
			if (state.failed) return;
			match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_field1629); if (state.failed) return;
			pushFollow(FOLLOW_simple_name_in_fully_qualified_field1631);
			simple_name();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_fully_qualified_field1633); if (state.failed) return;
			pushFollow(FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1635);
			nonvoid_type_descriptor();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fully_qualified_field"



	// $ANTLR start "label"
	// smaliIdeaParser.g:424:1: label : COLON simple_name ;
	public final void label() throws RecognitionException {
		try {
			// smaliIdeaParser.g:425:3: ( COLON simple_name )
			// smaliIdeaParser.g:425:5: COLON simple_name
			{
			match(input,COLON,FOLLOW_COLON_in_label1645); if (state.failed) return;
			pushFollow(FOLLOW_simple_name_in_label1647);
			simple_name();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "label"



	// $ANTLR start "label_ref_or_offset"
	// smaliIdeaParser.g:427:1: label_ref_or_offset : ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL );
	public final void label_ref_or_offset() throws RecognitionException {
		try {
			// smaliIdeaParser.g:428:3: ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL )
			int alt28=3;
			switch ( input.LA(1) ) {
			case COLON:
				{
				alt28=1;
				}
				break;
			case OFFSET:
				{
				alt28=2;
				}
				break;
			case NEGATIVE_INTEGER_LITERAL:
				{
				alt28=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// smaliIdeaParser.g:428:5: COLON simple_name
					{
					match(input,COLON,FOLLOW_COLON_in_label_ref_or_offset1657); if (state.failed) return;
					pushFollow(FOLLOW_simple_name_in_label_ref_or_offset1659);
					simple_name();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:429:5: OFFSET
					{
					match(input,OFFSET,FOLLOW_OFFSET_in_label_ref_or_offset1665); if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:430:5: NEGATIVE_INTEGER_LITERAL
					{
					match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1671); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "label_ref_or_offset"



	// $ANTLR start "register_list"
	// smaliIdeaParser.g:432:1: register_list : ( REGISTER ( COMMA REGISTER )* )? ;
	public final void register_list() throws RecognitionException {
		try {
			// smaliIdeaParser.g:433:3: ( ( REGISTER ( COMMA REGISTER )* )? )
			// smaliIdeaParser.g:433:5: ( REGISTER ( COMMA REGISTER )* )?
			{
			// smaliIdeaParser.g:433:5: ( REGISTER ( COMMA REGISTER )* )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==REGISTER) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// smaliIdeaParser.g:433:6: REGISTER ( COMMA REGISTER )*
					{
					match(input,REGISTER,FOLLOW_REGISTER_in_register_list1682); if (state.failed) return;
					// smaliIdeaParser.g:433:15: ( COMMA REGISTER )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==COMMA) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// smaliIdeaParser.g:433:16: COMMA REGISTER
							{
							match(input,COMMA,FOLLOW_COMMA_in_register_list1685); if (state.failed) return;
							match(input,REGISTER,FOLLOW_REGISTER_in_register_list1687); if (state.failed) return;
							}
							break;

						default :
							break loop29;
						}
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "register_list"



	// $ANTLR start "register_range"
	// smaliIdeaParser.g:435:1: register_range : ( REGISTER ( DOTDOT REGISTER )? )? ;
	public final void register_range() throws RecognitionException {
		try {
			// smaliIdeaParser.g:436:3: ( ( REGISTER ( DOTDOT REGISTER )? )? )
			// smaliIdeaParser.g:436:5: ( REGISTER ( DOTDOT REGISTER )? )?
			{
			// smaliIdeaParser.g:436:5: ( REGISTER ( DOTDOT REGISTER )? )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==REGISTER) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// smaliIdeaParser.g:436:6: REGISTER ( DOTDOT REGISTER )?
					{
					match(input,REGISTER,FOLLOW_REGISTER_in_register_range1702); if (state.failed) return;
					// smaliIdeaParser.g:436:15: ( DOTDOT REGISTER )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==DOTDOT) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// smaliIdeaParser.g:436:16: DOTDOT REGISTER
							{
							match(input,DOTDOT,FOLLOW_DOTDOT_in_register_range1705); if (state.failed) return;
							match(input,REGISTER,FOLLOW_REGISTER_in_register_range1707); if (state.failed) return;
							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "register_range"



	// $ANTLR start "verification_error_reference"
	// smaliIdeaParser.g:438:1: verification_error_reference : ( class_descriptor | fully_qualified_field | fully_qualified_method );
	public final void verification_error_reference() throws RecognitionException {
		try {
			// smaliIdeaParser.g:439:3: ( class_descriptor | fully_qualified_field | fully_qualified_method )
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==CLASS_DESCRIPTOR) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==ANNOTATION_DIRECTIVE||LA33_1==ARRAY_DATA_DIRECTIVE||(LA33_1 >= CATCHALL_DIRECTIVE && LA33_1 <= CATCH_DIRECTIVE)||LA33_1==COLON||(LA33_1 >= END_LOCAL_DIRECTIVE && LA33_1 <= END_METHOD_DIRECTIVE)||LA33_1==EPILOGUE_DIRECTIVE||(LA33_1 >= INSTRUCTION_FORMAT10t && LA33_1 <= INSTRUCTION_FORMAT51l)||(LA33_1 >= LINE_DIRECTIVE && LA33_1 <= LOCAL_DIRECTIVE)||(LA33_1 >= PACKED_SWITCH_DIRECTIVE && LA33_1 <= PARAMETER_DIRECTIVE)||LA33_1==PROLOGUE_DIRECTIVE||(LA33_1 >= REGISTERS_DIRECTIVE && LA33_1 <= RESTART_LOCAL_DIRECTIVE)||(LA33_1 >= SOURCE_DIRECTIVE && LA33_1 <= SPARSE_SWITCH_DIRECTIVE)) ) {
					alt33=1;
				}
				else if ( (LA33_1==ARROW) ) {
					int LA33_4 = input.LA(3);
					if ( (LA33_4==ACCESS_SPEC||LA33_4==ANNOTATION_VISIBILITY||LA33_4==BOOL_LITERAL||LA33_4==DOUBLE_LITERAL_OR_ID||LA33_4==FLOAT_LITERAL_OR_ID||(LA33_4 >= INSTRUCTION_FORMAT10t && LA33_4 <= INSTRUCTION_FORMAT10x_ODEX)||LA33_4==INSTRUCTION_FORMAT11x||LA33_4==INSTRUCTION_FORMAT12x_OR_ID||(LA33_4 >= INSTRUCTION_FORMAT21c_FIELD && LA33_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA33_4==INSTRUCTION_FORMAT21t||(LA33_4 >= INSTRUCTION_FORMAT22c_FIELD && LA33_4 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA33_4 >= INSTRUCTION_FORMAT22s_OR_ID && LA33_4 <= INSTRUCTION_FORMAT22t)||LA33_4==INSTRUCTION_FORMAT23x||(LA33_4 >= INSTRUCTION_FORMAT31i_OR_ID && LA33_4 <= INSTRUCTION_FORMAT31t)||(LA33_4 >= INSTRUCTION_FORMAT35c_METHOD && LA33_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA33_4==INSTRUCTION_FORMAT51l||(LA33_4 >= NEGATIVE_INTEGER_LITERAL && LA33_4 <= NULL_LITERAL)||(LA33_4 >= PARAM_LIST_OR_ID && LA33_4 <= PRIMITIVE_TYPE)||LA33_4==REGISTER||LA33_4==SIMPLE_NAME||(LA33_4 >= VERIFICATION_ERROR_TYPE && LA33_4 <= VOID_TYPE)) ) {
						int LA33_5 = input.LA(4);
						if ( (LA33_5==COLON) ) {
							alt33=2;
						}
						else if ( (LA33_5==OPEN_PAREN) ) {
							alt33=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 33, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA33_4==METHOD_NAME) ) {
						alt33=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 33, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA33_0==ARRAY_DESCRIPTOR) ) {
				int LA33_2 = input.LA(2);
				if ( (LA33_2==ARROW) ) {
					int LA33_4 = input.LA(3);
					if ( (LA33_4==ACCESS_SPEC||LA33_4==ANNOTATION_VISIBILITY||LA33_4==BOOL_LITERAL||LA33_4==DOUBLE_LITERAL_OR_ID||LA33_4==FLOAT_LITERAL_OR_ID||(LA33_4 >= INSTRUCTION_FORMAT10t && LA33_4 <= INSTRUCTION_FORMAT10x_ODEX)||LA33_4==INSTRUCTION_FORMAT11x||LA33_4==INSTRUCTION_FORMAT12x_OR_ID||(LA33_4 >= INSTRUCTION_FORMAT21c_FIELD && LA33_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA33_4==INSTRUCTION_FORMAT21t||(LA33_4 >= INSTRUCTION_FORMAT22c_FIELD && LA33_4 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA33_4 >= INSTRUCTION_FORMAT22s_OR_ID && LA33_4 <= INSTRUCTION_FORMAT22t)||LA33_4==INSTRUCTION_FORMAT23x||(LA33_4 >= INSTRUCTION_FORMAT31i_OR_ID && LA33_4 <= INSTRUCTION_FORMAT31t)||(LA33_4 >= INSTRUCTION_FORMAT35c_METHOD && LA33_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA33_4==INSTRUCTION_FORMAT51l||(LA33_4 >= NEGATIVE_INTEGER_LITERAL && LA33_4 <= NULL_LITERAL)||(LA33_4 >= PARAM_LIST_OR_ID && LA33_4 <= PRIMITIVE_TYPE)||LA33_4==REGISTER||LA33_4==SIMPLE_NAME||(LA33_4 >= VERIFICATION_ERROR_TYPE && LA33_4 <= VOID_TYPE)) ) {
						int LA33_5 = input.LA(4);
						if ( (LA33_5==COLON) ) {
							alt33=2;
						}
						else if ( (LA33_5==OPEN_PAREN) ) {
							alt33=3;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 33, 5, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA33_4==METHOD_NAME) ) {
						alt33=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 33, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// smaliIdeaParser.g:439:5: class_descriptor
					{
					pushFollow(FOLLOW_class_descriptor_in_verification_error_reference1721);
					class_descriptor();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:439:24: fully_qualified_field
					{
					pushFollow(FOLLOW_fully_qualified_field_in_verification_error_reference1725);
					fully_qualified_field();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:439:48: fully_qualified_method
					{
					pushFollow(FOLLOW_fully_qualified_method_in_verification_error_reference1729);
					fully_qualified_method();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "verification_error_reference"



	// $ANTLR start "catch_directive"
	// smaliIdeaParser.g:441:1: catch_directive : CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset ;
	public final void catch_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:442:3: ( CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
			// smaliIdeaParser.g:442:5: CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
			{
			match(input,CATCH_DIRECTIVE,FOLLOW_CATCH_DIRECTIVE_in_catch_directive1739); if (state.failed) return;
			pushFollow(FOLLOW_nonvoid_type_descriptor_in_catch_directive1741);
			nonvoid_type_descriptor();
			state._fsp--;
			if (state.failed) return;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catch_directive1743); if (state.failed) return;
			pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1745);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return;
			match(input,DOTDOT,FOLLOW_DOTDOT_in_catch_directive1747); if (state.failed) return;
			pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1749);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catch_directive1751); if (state.failed) return;
			pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1753);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "catch_directive"



	// $ANTLR start "catchall_directive"
	// smaliIdeaParser.g:444:1: catchall_directive : CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset ;
	public final void catchall_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:445:3: ( CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
			// smaliIdeaParser.g:445:5: CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
			{
			match(input,CATCHALL_DIRECTIVE,FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1763); if (state.failed) return;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catchall_directive1765); if (state.failed) return;
			pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1767);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return;
			match(input,DOTDOT,FOLLOW_DOTDOT_in_catchall_directive1769); if (state.failed) return;
			pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1771);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catchall_directive1773); if (state.failed) return;
			pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1775);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "catchall_directive"



	// $ANTLR start "parameter_directive"
	// smaliIdeaParser.g:451:1: parameter_directive : PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) ;
	public final void parameter_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:452:3: ( PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) )
			// smaliIdeaParser.g:452:5: PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |)
			{
			match(input,PARAMETER_DIRECTIVE,FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1787); if (state.failed) return;
			// smaliIdeaParser.g:452:25: ( STRING_LITERAL )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==STRING_LITERAL) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// smaliIdeaParser.g:452:25: STRING_LITERAL
					{
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parameter_directive1789); if (state.failed) return;
					}
					break;

			}

			// smaliIdeaParser.g:453:5: ({...}? annotation )*
			loop35:
			while (true) {
				int alt35=2;
				alt35 = dfa35.predict(input);
				switch (alt35) {
				case 1 :
					// smaliIdeaParser.g:453:6: {...}? annotation
					{
					if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "parameter_directive", "input.LA(1) == ANNOTATION_DIRECTIVE");
					}
					pushFollow(FOLLOW_annotation_in_parameter_directive1799);
					annotation();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
				}
			}

			// smaliIdeaParser.g:454:5: ( END_PARAMETER_DIRECTIVE |)
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==END_PARAMETER_DIRECTIVE) ) {
				alt36=1;
			}
			else if ( (LA36_0==EOF||LA36_0==ANNOTATION_DIRECTIVE||LA36_0==ARRAY_DATA_DIRECTIVE||(LA36_0 >= CATCHALL_DIRECTIVE && LA36_0 <= CATCH_DIRECTIVE)||LA36_0==CLASS_DIRECTIVE||LA36_0==COLON||(LA36_0 >= END_LOCAL_DIRECTIVE && LA36_0 <= END_METHOD_DIRECTIVE)||LA36_0==EPILOGUE_DIRECTIVE||LA36_0==FIELD_DIRECTIVE||LA36_0==IMPLEMENTS_DIRECTIVE||(LA36_0 >= INSTRUCTION_FORMAT10t && LA36_0 <= INSTRUCTION_FORMAT51l)||(LA36_0 >= LINE_DIRECTIVE && LA36_0 <= LOCAL_DIRECTIVE)||LA36_0==METHOD_DIRECTIVE||(LA36_0 >= PACKED_SWITCH_DIRECTIVE && LA36_0 <= PARAMETER_DIRECTIVE)||LA36_0==PROLOGUE_DIRECTIVE||(LA36_0 >= REGISTERS_DIRECTIVE && LA36_0 <= RESTART_LOCAL_DIRECTIVE)||(LA36_0 >= SOURCE_DIRECTIVE && LA36_0 <= SPARSE_SWITCH_DIRECTIVE)||LA36_0==SUPER_DIRECTIVE) ) {
				alt36=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// smaliIdeaParser.g:454:7: END_PARAMETER_DIRECTIVE
					{
					match(input,END_PARAMETER_DIRECTIVE,FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1809); if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:456:5: 
					{
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parameter_directive"



	// $ANTLR start "ordered_debug_directive"
	// smaliIdeaParser.g:458:1: ordered_debug_directive : ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive );
	public final void ordered_debug_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:459:3: ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive )
			int alt37=7;
			switch ( input.LA(1) ) {
			case LINE_DIRECTIVE:
				{
				alt37=1;
				}
				break;
			case LOCAL_DIRECTIVE:
				{
				alt37=2;
				}
				break;
			case END_LOCAL_DIRECTIVE:
				{
				alt37=3;
				}
				break;
			case RESTART_LOCAL_DIRECTIVE:
				{
				alt37=4;
				}
				break;
			case PROLOGUE_DIRECTIVE:
				{
				alt37=5;
				}
				break;
			case EPILOGUE_DIRECTIVE:
				{
				alt37=6;
				}
				break;
			case SOURCE_DIRECTIVE:
				{
				alt37=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// smaliIdeaParser.g:459:5: line_directive
					{
					pushFollow(FOLLOW_line_directive_in_ordered_debug_directive1833);
					line_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:460:5: local_directive
					{
					pushFollow(FOLLOW_local_directive_in_ordered_debug_directive1839);
					local_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:461:5: end_local_directive
					{
					pushFollow(FOLLOW_end_local_directive_in_ordered_debug_directive1845);
					end_local_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// smaliIdeaParser.g:462:5: restart_local_directive
					{
					pushFollow(FOLLOW_restart_local_directive_in_ordered_debug_directive1851);
					restart_local_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// smaliIdeaParser.g:463:5: prologue_directive
					{
					pushFollow(FOLLOW_prologue_directive_in_ordered_debug_directive1857);
					prologue_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// smaliIdeaParser.g:464:5: epilogue_directive
					{
					pushFollow(FOLLOW_epilogue_directive_in_ordered_debug_directive1863);
					epilogue_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// smaliIdeaParser.g:465:5: source_directive
					{
					pushFollow(FOLLOW_source_directive_in_ordered_debug_directive1869);
					source_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ordered_debug_directive"



	// $ANTLR start "line_directive"
	// smaliIdeaParser.g:467:1: line_directive : LINE_DIRECTIVE integral_literal ;
	public final void line_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:468:3: ( LINE_DIRECTIVE integral_literal )
			// smaliIdeaParser.g:468:5: LINE_DIRECTIVE integral_literal
			{
			match(input,LINE_DIRECTIVE,FOLLOW_LINE_DIRECTIVE_in_line_directive1879); if (state.failed) return;
			pushFollow(FOLLOW_integral_literal_in_line_directive1881);
			integral_literal();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "line_directive"



	// $ANTLR start "local_directive"
	// smaliIdeaParser.g:470:1: local_directive : LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? ;
	public final void local_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:471:3: ( LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? )
			// smaliIdeaParser.g:471:5: LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )?
			{
			match(input,LOCAL_DIRECTIVE,FOLLOW_LOCAL_DIRECTIVE_in_local_directive1891); if (state.failed) return;
			match(input,REGISTER,FOLLOW_REGISTER_in_local_directive1893); if (state.failed) return;
			match(input,COMMA,FOLLOW_COMMA_in_local_directive1895); if (state.failed) return;
			pushFollow(FOLLOW_simple_name_in_local_directive1897);
			simple_name();
			state._fsp--;
			if (state.failed) return;
			match(input,COLON,FOLLOW_COLON_in_local_directive1899); if (state.failed) return;
			pushFollow(FOLLOW_nonvoid_type_descriptor_in_local_directive1901);
			nonvoid_type_descriptor();
			state._fsp--;
			if (state.failed) return;
			// smaliIdeaParser.g:471:78: ( COMMA STRING_LITERAL )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==COMMA) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// smaliIdeaParser.g:471:79: COMMA STRING_LITERAL
					{
					match(input,COMMA,FOLLOW_COMMA_in_local_directive1904); if (state.failed) return;
					match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive1906); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "local_directive"



	// $ANTLR start "end_local_directive"
	// smaliIdeaParser.g:473:1: end_local_directive : END_LOCAL_DIRECTIVE REGISTER ;
	public final void end_local_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:474:3: ( END_LOCAL_DIRECTIVE REGISTER )
			// smaliIdeaParser.g:474:5: END_LOCAL_DIRECTIVE REGISTER
			{
			match(input,END_LOCAL_DIRECTIVE,FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1918); if (state.failed) return;
			match(input,REGISTER,FOLLOW_REGISTER_in_end_local_directive1920); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "end_local_directive"



	// $ANTLR start "restart_local_directive"
	// smaliIdeaParser.g:476:1: restart_local_directive : RESTART_LOCAL_DIRECTIVE REGISTER ;
	public final void restart_local_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:477:3: ( RESTART_LOCAL_DIRECTIVE REGISTER )
			// smaliIdeaParser.g:477:5: RESTART_LOCAL_DIRECTIVE REGISTER
			{
			match(input,RESTART_LOCAL_DIRECTIVE,FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1930); if (state.failed) return;
			match(input,REGISTER,FOLLOW_REGISTER_in_restart_local_directive1932); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "restart_local_directive"



	// $ANTLR start "prologue_directive"
	// smaliIdeaParser.g:479:1: prologue_directive : PROLOGUE_DIRECTIVE ;
	public final void prologue_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:480:3: ( PROLOGUE_DIRECTIVE )
			// smaliIdeaParser.g:480:5: PROLOGUE_DIRECTIVE
			{
			match(input,PROLOGUE_DIRECTIVE,FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1942); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prologue_directive"



	// $ANTLR start "epilogue_directive"
	// smaliIdeaParser.g:482:1: epilogue_directive : EPILOGUE_DIRECTIVE ;
	public final void epilogue_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:483:3: ( EPILOGUE_DIRECTIVE )
			// smaliIdeaParser.g:483:5: EPILOGUE_DIRECTIVE
			{
			match(input,EPILOGUE_DIRECTIVE,FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1952); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "epilogue_directive"



	// $ANTLR start "source_directive"
	// smaliIdeaParser.g:485:1: source_directive : SOURCE_DIRECTIVE STRING_LITERAL ;
	public final void source_directive() throws RecognitionException {
		try {
			// smaliIdeaParser.g:486:3: ( SOURCE_DIRECTIVE STRING_LITERAL )
			// smaliIdeaParser.g:486:5: SOURCE_DIRECTIVE STRING_LITERAL
			{
			match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_directive1962); if (state.failed) return;
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_directive1964); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "source_directive"



	// $ANTLR start "instruction_format12x"
	// smaliIdeaParser.g:488:1: instruction_format12x : ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID );
	public final void instruction_format12x() throws RecognitionException {
		try {
			// smaliIdeaParser.g:489:3: ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID )
			// smaliIdeaParser.g:
			{
			if ( (input.LA(1) >= INSTRUCTION_FORMAT12x && input.LA(1) <= INSTRUCTION_FORMAT12x_OR_ID) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instruction_format12x"



	// $ANTLR start "instruction_format22s"
	// smaliIdeaParser.g:492:1: instruction_format22s : ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID );
	public final void instruction_format22s() throws RecognitionException {
		try {
			// smaliIdeaParser.g:493:3: ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID )
			// smaliIdeaParser.g:
			{
			if ( (input.LA(1) >= INSTRUCTION_FORMAT22s && input.LA(1) <= INSTRUCTION_FORMAT22s_OR_ID) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instruction_format22s"



	// $ANTLR start "instruction_format31i"
	// smaliIdeaParser.g:496:1: instruction_format31i : ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID );
	public final void instruction_format31i() throws RecognitionException {
		try {
			// smaliIdeaParser.g:497:3: ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID )
			// smaliIdeaParser.g:
			{
			if ( (input.LA(1) >= INSTRUCTION_FORMAT31i && input.LA(1) <= INSTRUCTION_FORMAT31i_OR_ID) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instruction_format31i"



	// $ANTLR start "instruction"
	// smaliIdeaParser.g:500:1: instruction : ( insn_format10t | insn_format10x | insn_format10x_odex | insn_format11n | insn_format11x | insn_format12x | insn_format20bc | insn_format20t | insn_format21c_field | insn_format21c_field_odex | insn_format21c_string | insn_format21c_type | insn_format21ih | insn_format21lh | insn_format21s | insn_format21t | insn_format22b | insn_format22c_field | insn_format22c_field_odex | insn_format22c_type | insn_format22cs_field | insn_format22s | insn_format22t | insn_format22x | insn_format23x | insn_format30t | insn_format31c | insn_format31i | insn_format31t | insn_format32x | insn_format35c_method | insn_format35c_type | insn_format35c_method_odex | insn_format35mi_method | insn_format35ms_method | insn_format3rc_method | insn_format3rc_method_odex | insn_format3rc_type | insn_format3rmi_method | insn_format3rms_method | insn_format51l | insn_array_data_directive | insn_packed_switch_directive | insn_sparse_switch_directive );
	public final void instruction() throws RecognitionException {
		 Marker marker = mark(); 
		try {
			// smaliIdeaParser.g:502:3: ( insn_format10t | insn_format10x | insn_format10x_odex | insn_format11n | insn_format11x | insn_format12x | insn_format20bc | insn_format20t | insn_format21c_field | insn_format21c_field_odex | insn_format21c_string | insn_format21c_type | insn_format21ih | insn_format21lh | insn_format21s | insn_format21t | insn_format22b | insn_format22c_field | insn_format22c_field_odex | insn_format22c_type | insn_format22cs_field | insn_format22s | insn_format22t | insn_format22x | insn_format23x | insn_format30t | insn_format31c | insn_format31i | insn_format31t | insn_format32x | insn_format35c_method | insn_format35c_type | insn_format35c_method_odex | insn_format35mi_method | insn_format35ms_method | insn_format3rc_method | insn_format3rc_method_odex | insn_format3rc_type | insn_format3rmi_method | insn_format3rms_method | insn_format51l | insn_array_data_directive | insn_packed_switch_directive | insn_sparse_switch_directive )
			int alt39=44;
			switch ( input.LA(1) ) {
			case INSTRUCTION_FORMAT10t:
				{
				alt39=1;
				}
				break;
			case INSTRUCTION_FORMAT10x:
				{
				alt39=2;
				}
				break;
			case INSTRUCTION_FORMAT10x_ODEX:
				{
				alt39=3;
				}
				break;
			case INSTRUCTION_FORMAT11n:
				{
				alt39=4;
				}
				break;
			case INSTRUCTION_FORMAT11x:
				{
				alt39=5;
				}
				break;
			case INSTRUCTION_FORMAT12x:
			case INSTRUCTION_FORMAT12x_OR_ID:
				{
				alt39=6;
				}
				break;
			case INSTRUCTION_FORMAT20bc:
				{
				alt39=7;
				}
				break;
			case INSTRUCTION_FORMAT20t:
				{
				alt39=8;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD:
				{
				alt39=9;
				}
				break;
			case INSTRUCTION_FORMAT21c_FIELD_ODEX:
				{
				alt39=10;
				}
				break;
			case INSTRUCTION_FORMAT21c_STRING:
				{
				alt39=11;
				}
				break;
			case INSTRUCTION_FORMAT21c_TYPE:
				{
				alt39=12;
				}
				break;
			case INSTRUCTION_FORMAT21ih:
				{
				alt39=13;
				}
				break;
			case INSTRUCTION_FORMAT21lh:
				{
				alt39=14;
				}
				break;
			case INSTRUCTION_FORMAT21s:
				{
				alt39=15;
				}
				break;
			case INSTRUCTION_FORMAT21t:
				{
				alt39=16;
				}
				break;
			case INSTRUCTION_FORMAT22b:
				{
				alt39=17;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD:
				{
				alt39=18;
				}
				break;
			case INSTRUCTION_FORMAT22c_FIELD_ODEX:
				{
				alt39=19;
				}
				break;
			case INSTRUCTION_FORMAT22c_TYPE:
				{
				alt39=20;
				}
				break;
			case INSTRUCTION_FORMAT22cs_FIELD:
				{
				alt39=21;
				}
				break;
			case INSTRUCTION_FORMAT22s:
			case INSTRUCTION_FORMAT22s_OR_ID:
				{
				alt39=22;
				}
				break;
			case INSTRUCTION_FORMAT22t:
				{
				alt39=23;
				}
				break;
			case INSTRUCTION_FORMAT22x:
				{
				alt39=24;
				}
				break;
			case INSTRUCTION_FORMAT23x:
				{
				alt39=25;
				}
				break;
			case INSTRUCTION_FORMAT30t:
				{
				alt39=26;
				}
				break;
			case INSTRUCTION_FORMAT31c:
				{
				alt39=27;
				}
				break;
			case INSTRUCTION_FORMAT31i:
			case INSTRUCTION_FORMAT31i_OR_ID:
				{
				alt39=28;
				}
				break;
			case INSTRUCTION_FORMAT31t:
				{
				alt39=29;
				}
				break;
			case INSTRUCTION_FORMAT32x:
				{
				alt39=30;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD:
				{
				alt39=31;
				}
				break;
			case INSTRUCTION_FORMAT35c_TYPE:
				{
				alt39=32;
				}
				break;
			case INSTRUCTION_FORMAT35c_METHOD_ODEX:
				{
				alt39=33;
				}
				break;
			case INSTRUCTION_FORMAT35mi_METHOD:
				{
				alt39=34;
				}
				break;
			case INSTRUCTION_FORMAT35ms_METHOD:
				{
				alt39=35;
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD:
				{
				alt39=36;
				}
				break;
			case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
				{
				alt39=37;
				}
				break;
			case INSTRUCTION_FORMAT3rc_TYPE:
				{
				alt39=38;
				}
				break;
			case INSTRUCTION_FORMAT3rmi_METHOD:
				{
				alt39=39;
				}
				break;
			case INSTRUCTION_FORMAT3rms_METHOD:
				{
				alt39=40;
				}
				break;
			case INSTRUCTION_FORMAT51l:
				{
				alt39=41;
				}
				break;
			case ARRAY_DATA_DIRECTIVE:
				{
				alt39=42;
				}
				break;
			case PACKED_SWITCH_DIRECTIVE:
				{
				alt39=43;
				}
				break;
			case SPARSE_SWITCH_DIRECTIVE:
				{
				alt39=44;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// smaliIdeaParser.g:502:5: insn_format10t
					{
					pushFollow(FOLLOW_insn_format10t_in_instruction2029);
					insn_format10t();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// smaliIdeaParser.g:503:5: insn_format10x
					{
					pushFollow(FOLLOW_insn_format10x_in_instruction2035);
					insn_format10x();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// smaliIdeaParser.g:504:5: insn_format10x_odex
					{
					pushFollow(FOLLOW_insn_format10x_odex_in_instruction2041);
					insn_format10x_odex();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// smaliIdeaParser.g:505:5: insn_format11n
					{
					pushFollow(FOLLOW_insn_format11n_in_instruction2047);
					insn_format11n();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// smaliIdeaParser.g:506:5: insn_format11x
					{
					pushFollow(FOLLOW_insn_format11x_in_instruction2053);
					insn_format11x();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// smaliIdeaParser.g:507:5: insn_format12x
					{
					pushFollow(FOLLOW_insn_format12x_in_instruction2059);
					insn_format12x();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// smaliIdeaParser.g:508:5: insn_format20bc
					{
					pushFollow(FOLLOW_insn_format20bc_in_instruction2065);
					insn_format20bc();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// smaliIdeaParser.g:509:5: insn_format20t
					{
					pushFollow(FOLLOW_insn_format20t_in_instruction2071);
					insn_format20t();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// smaliIdeaParser.g:510:5: insn_format21c_field
					{
					pushFollow(FOLLOW_insn_format21c_field_in_instruction2077);
					insn_format21c_field();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 10 :
					// smaliIdeaParser.g:511:5: insn_format21c_field_odex
					{
					pushFollow(FOLLOW_insn_format21c_field_odex_in_instruction2083);
					insn_format21c_field_odex();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 11 :
					// smaliIdeaParser.g:512:5: insn_format21c_string
					{
					pushFollow(FOLLOW_insn_format21c_string_in_instruction2089);
					insn_format21c_string();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 12 :
					// smaliIdeaParser.g:513:5: insn_format21c_type
					{
					pushFollow(FOLLOW_insn_format21c_type_in_instruction2095);
					insn_format21c_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 13 :
					// smaliIdeaParser.g:514:5: insn_format21ih
					{
					pushFollow(FOLLOW_insn_format21ih_in_instruction2101);
					insn_format21ih();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 14 :
					// smaliIdeaParser.g:515:5: insn_format21lh
					{
					pushFollow(FOLLOW_insn_format21lh_in_instruction2107);
					insn_format21lh();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 15 :
					// smaliIdeaParser.g:516:5: insn_format21s
					{
					pushFollow(FOLLOW_insn_format21s_in_instruction2113);
					insn_format21s();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 16 :
					// smaliIdeaParser.g:517:5: insn_format21t
					{
					pushFollow(FOLLOW_insn_format21t_in_instruction2119);
					insn_format21t();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 17 :
					// smaliIdeaParser.g:518:5: insn_format22b
					{
					pushFollow(FOLLOW_insn_format22b_in_instruction2125);
					insn_format22b();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 18 :
					// smaliIdeaParser.g:519:5: insn_format22c_field
					{
					pushFollow(FOLLOW_insn_format22c_field_in_instruction2131);
					insn_format22c_field();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 19 :
					// smaliIdeaParser.g:520:5: insn_format22c_field_odex
					{
					pushFollow(FOLLOW_insn_format22c_field_odex_in_instruction2137);
					insn_format22c_field_odex();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 20 :
					// smaliIdeaParser.g:521:5: insn_format22c_type
					{
					pushFollow(FOLLOW_insn_format22c_type_in_instruction2143);
					insn_format22c_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 21 :
					// smaliIdeaParser.g:522:5: insn_format22cs_field
					{
					pushFollow(FOLLOW_insn_format22cs_field_in_instruction2149);
					insn_format22cs_field();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 22 :
					// smaliIdeaParser.g:523:5: insn_format22s
					{
					pushFollow(FOLLOW_insn_format22s_in_instruction2155);
					insn_format22s();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 23 :
					// smaliIdeaParser.g:524:5: insn_format22t
					{
					pushFollow(FOLLOW_insn_format22t_in_instruction2161);
					insn_format22t();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 24 :
					// smaliIdeaParser.g:525:5: insn_format22x
					{
					pushFollow(FOLLOW_insn_format22x_in_instruction2167);
					insn_format22x();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 25 :
					// smaliIdeaParser.g:526:5: insn_format23x
					{
					pushFollow(FOLLOW_insn_format23x_in_instruction2173);
					insn_format23x();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 26 :
					// smaliIdeaParser.g:527:5: insn_format30t
					{
					pushFollow(FOLLOW_insn_format30t_in_instruction2179);
					insn_format30t();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 27 :
					// smaliIdeaParser.g:528:5: insn_format31c
					{
					pushFollow(FOLLOW_insn_format31c_in_instruction2185);
					insn_format31c();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 28 :
					// smaliIdeaParser.g:529:5: insn_format31i
					{
					pushFollow(FOLLOW_insn_format31i_in_instruction2191);
					insn_format31i();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 29 :
					// smaliIdeaParser.g:530:5: insn_format31t
					{
					pushFollow(FOLLOW_insn_format31t_in_instruction2197);
					insn_format31t();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 30 :
					// smaliIdeaParser.g:531:5: insn_format32x
					{
					pushFollow(FOLLOW_insn_format32x_in_instruction2203);
					insn_format32x();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 31 :
					// smaliIdeaParser.g:532:5: insn_format35c_method
					{
					pushFollow(FOLLOW_insn_format35c_method_in_instruction2209);
					insn_format35c_method();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 32 :
					// smaliIdeaParser.g:533:5: insn_format35c_type
					{
					pushFollow(FOLLOW_insn_format35c_type_in_instruction2215);
					insn_format35c_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 33 :
					// smaliIdeaParser.g:534:5: insn_format35c_method_odex
					{
					pushFollow(FOLLOW_insn_format35c_method_odex_in_instruction2221);
					insn_format35c_method_odex();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 34 :
					// smaliIdeaParser.g:535:5: insn_format35mi_method
					{
					pushFollow(FOLLOW_insn_format35mi_method_in_instruction2227);
					insn_format35mi_method();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 35 :
					// smaliIdeaParser.g:536:5: insn_format35ms_method
					{
					pushFollow(FOLLOW_insn_format35ms_method_in_instruction2233);
					insn_format35ms_method();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 36 :
					// smaliIdeaParser.g:537:5: insn_format3rc_method
					{
					pushFollow(FOLLOW_insn_format3rc_method_in_instruction2239);
					insn_format3rc_method();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 37 :
					// smaliIdeaParser.g:538:5: insn_format3rc_method_odex
					{
					pushFollow(FOLLOW_insn_format3rc_method_odex_in_instruction2245);
					insn_format3rc_method_odex();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 38 :
					// smaliIdeaParser.g:539:5: insn_format3rc_type
					{
					pushFollow(FOLLOW_insn_format3rc_type_in_instruction2251);
					insn_format3rc_type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 39 :
					// smaliIdeaParser.g:540:5: insn_format3rmi_method
					{
					pushFollow(FOLLOW_insn_format3rmi_method_in_instruction2257);
					insn_format3rmi_method();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 40 :
					// smaliIdeaParser.g:541:5: insn_format3rms_method
					{
					pushFollow(FOLLOW_insn_format3rms_method_in_instruction2263);
					insn_format3rms_method();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 41 :
					// smaliIdeaParser.g:542:5: insn_format51l
					{
					pushFollow(FOLLOW_insn_format51l_in_instruction2269);
					insn_format51l();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 42 :
					// smaliIdeaParser.g:543:5: insn_array_data_directive
					{
					pushFollow(FOLLOW_insn_array_data_directive_in_instruction2275);
					insn_array_data_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 43 :
					// smaliIdeaParser.g:544:5: insn_packed_switch_directive
					{
					pushFollow(FOLLOW_insn_packed_switch_directive_in_instruction2281);
					insn_packed_switch_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 44 :
					// smaliIdeaParser.g:545:5: insn_sparse_switch_directive
					{
					pushFollow(FOLLOW_insn_sparse_switch_directive_in_instruction2287);
					insn_sparse_switch_directive();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			 marker.done(ElementTypes.INSTRUCTION); 
		}
	}
	// $ANTLR end "instruction"



	// $ANTLR start "insn_format10t"
	// smaliIdeaParser.g:548:1: insn_format10t returns [int size] : INSTRUCTION_FORMAT10t label_ref_or_offset ;
	public final int insn_format10t() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:549:3: ( INSTRUCTION_FORMAT10t label_ref_or_offset )
			// smaliIdeaParser.g:551:5: INSTRUCTION_FORMAT10t label_ref_or_offset
			{
			match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_insn_format10t2317); if (state.failed) return size;
			pushFollow(FOLLOW_label_ref_or_offset_in_insn_format10t2319);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format10t"



	// $ANTLR start "insn_format10x"
	// smaliIdeaParser.g:553:1: insn_format10x returns [int size] : INSTRUCTION_FORMAT10x ;
	public final int insn_format10x() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:554:3: ( INSTRUCTION_FORMAT10x )
			// smaliIdeaParser.g:555:5: INSTRUCTION_FORMAT10x
			{
			match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_insn_format10x2338); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format10x"



	// $ANTLR start "insn_format10x_odex"
	// smaliIdeaParser.g:557:1: insn_format10x_odex returns [int size] : INSTRUCTION_FORMAT10x_ODEX ;
	public final int insn_format10x_odex() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:558:3: ( INSTRUCTION_FORMAT10x_ODEX )
			// smaliIdeaParser.g:559:5: INSTRUCTION_FORMAT10x_ODEX
			{
			match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_insn_format10x_odex2357); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format10x_odex"



	// $ANTLR start "insn_format11n"
	// smaliIdeaParser.g:561:1: insn_format11n returns [int size] : INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal ;
	public final int insn_format11n() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:562:3: ( INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal )
			// smaliIdeaParser.g:563:5: INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
			{
			match(input,INSTRUCTION_FORMAT11n,FOLLOW_INSTRUCTION_FORMAT11n_in_insn_format11n2376); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format11n2378); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format11n2380); if (state.failed) return size;
			pushFollow(FOLLOW_integral_literal_in_insn_format11n2382);
			integral_literal();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format11n"



	// $ANTLR start "insn_format11x"
	// smaliIdeaParser.g:565:1: insn_format11x returns [int size] : INSTRUCTION_FORMAT11x REGISTER ;
	public final int insn_format11x() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:566:3: ( INSTRUCTION_FORMAT11x REGISTER )
			// smaliIdeaParser.g:567:5: INSTRUCTION_FORMAT11x REGISTER
			{
			match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_insn_format11x2401); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format11x2403); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format11x"



	// $ANTLR start "insn_format12x"
	// smaliIdeaParser.g:569:1: insn_format12x returns [int size] : instruction_format12x REGISTER COMMA REGISTER ;
	public final int insn_format12x() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:570:3: ( instruction_format12x REGISTER COMMA REGISTER )
			// smaliIdeaParser.g:571:5: instruction_format12x REGISTER COMMA REGISTER
			{
			pushFollow(FOLLOW_instruction_format12x_in_insn_format12x2422);
			instruction_format12x();
			state._fsp--;
			if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format12x2424); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format12x2426); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format12x2428); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format12x"



	// $ANTLR start "insn_format20bc"
	// smaliIdeaParser.g:573:1: insn_format20bc returns [int size] : INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference ;
	public final int insn_format20bc() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:574:3: ( INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference )
			// smaliIdeaParser.g:575:5: INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference
			{
			match(input,INSTRUCTION_FORMAT20bc,FOLLOW_INSTRUCTION_FORMAT20bc_in_insn_format20bc2447); if (state.failed) return size;
			match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_insn_format20bc2449); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format20bc2451); if (state.failed) return size;
			pushFollow(FOLLOW_verification_error_reference_in_insn_format20bc2453);
			verification_error_reference();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format20bc"



	// $ANTLR start "insn_format20t"
	// smaliIdeaParser.g:577:1: insn_format20t returns [int size] : INSTRUCTION_FORMAT20t label_ref_or_offset ;
	public final int insn_format20t() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:578:3: ( INSTRUCTION_FORMAT20t label_ref_or_offset )
			// smaliIdeaParser.g:579:5: INSTRUCTION_FORMAT20t label_ref_or_offset
			{
			match(input,INSTRUCTION_FORMAT20t,FOLLOW_INSTRUCTION_FORMAT20t_in_insn_format20t2472); if (state.failed) return size;
			pushFollow(FOLLOW_label_ref_or_offset_in_insn_format20t2474);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format20t"



	// $ANTLR start "insn_format21c_field"
	// smaliIdeaParser.g:581:1: insn_format21c_field returns [int size] : INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field ;
	public final int insn_format21c_field() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:582:3: ( INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field )
			// smaliIdeaParser.g:583:5: INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field
			{
			match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_insn_format21c_field2493); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_field2495); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_field2497); if (state.failed) return size;
			pushFollow(FOLLOW_fully_qualified_field_in_insn_format21c_field2499);
			fully_qualified_field();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format21c_field"



	// $ANTLR start "insn_format21c_field_odex"
	// smaliIdeaParser.g:585:1: insn_format21c_field_odex returns [int size] : INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field ;
	public final int insn_format21c_field_odex() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:586:3: ( INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field )
			// smaliIdeaParser.g:587:5: INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field
			{
			match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_insn_format21c_field_odex2518); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_field_odex2520); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_field_odex2522); if (state.failed) return size;
			pushFollow(FOLLOW_fully_qualified_field_in_insn_format21c_field_odex2524);
			fully_qualified_field();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format21c_field_odex"



	// $ANTLR start "insn_format21c_string"
	// smaliIdeaParser.g:589:1: insn_format21c_string returns [int size] : INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL ;
	public final int insn_format21c_string() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:590:3: ( INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL )
			// smaliIdeaParser.g:591:5: INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
			{
			match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_insn_format21c_string2543); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_string2545); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_string2547); if (state.failed) return size;
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_insn_format21c_string2549); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format21c_string"



	// $ANTLR start "insn_format21c_type"
	// smaliIdeaParser.g:593:1: insn_format21c_type returns [int size] : INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor ;
	public final int insn_format21c_type() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:594:3: ( INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor )
			// smaliIdeaParser.g:595:5: INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor
			{
			match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_insn_format21c_type2568); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_type2570); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_type2572); if (state.failed) return size;
			pushFollow(FOLLOW_reference_type_descriptor_in_insn_format21c_type2574);
			reference_type_descriptor();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format21c_type"



	// $ANTLR start "insn_format21ih"
	// smaliIdeaParser.g:597:1: insn_format21ih returns [int size] : INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal ;
	public final int insn_format21ih() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:598:3: ( INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal )
			// smaliIdeaParser.g:599:5: INSTRUCTION_FORMAT21ih REGISTER COMMA fixed_32bit_literal
			{
			match(input,INSTRUCTION_FORMAT21ih,FOLLOW_INSTRUCTION_FORMAT21ih_in_insn_format21ih2593); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21ih2595); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format21ih2597); if (state.failed) return size;
			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format21ih2599);
			fixed_32bit_literal();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format21ih"



	// $ANTLR start "insn_format21lh"
	// smaliIdeaParser.g:601:1: insn_format21lh returns [int size] : INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal ;
	public final int insn_format21lh() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:602:3: ( INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal )
			// smaliIdeaParser.g:603:5: INSTRUCTION_FORMAT21lh REGISTER COMMA fixed_32bit_literal
			{
			match(input,INSTRUCTION_FORMAT21lh,FOLLOW_INSTRUCTION_FORMAT21lh_in_insn_format21lh2618); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21lh2620); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format21lh2622); if (state.failed) return size;
			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format21lh2624);
			fixed_32bit_literal();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format21lh"



	// $ANTLR start "insn_format21s"
	// smaliIdeaParser.g:605:1: insn_format21s returns [int size] : INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal ;
	public final int insn_format21s() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:606:3: ( INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal )
			// smaliIdeaParser.g:607:5: INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
			{
			match(input,INSTRUCTION_FORMAT21s,FOLLOW_INSTRUCTION_FORMAT21s_in_insn_format21s2643); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21s2645); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format21s2647); if (state.failed) return size;
			pushFollow(FOLLOW_integral_literal_in_insn_format21s2649);
			integral_literal();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format21s"



	// $ANTLR start "insn_format21t"
	// smaliIdeaParser.g:609:1: insn_format21t returns [int size] : INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) ;
	public final int insn_format21t() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:610:3: ( INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) )
			// smaliIdeaParser.g:611:5: INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset )
			{
			match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_insn_format21t2668); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21t2670); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format21t2672); if (state.failed) return size;
			// smaliIdeaParser.g:611:42: ( label_ref_or_offset )
			// smaliIdeaParser.g:611:43: label_ref_or_offset
			{
			pushFollow(FOLLOW_label_ref_or_offset_in_insn_format21t2675);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return size;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format21t"



	// $ANTLR start "insn_format22b"
	// smaliIdeaParser.g:613:1: insn_format22b returns [int size] : INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal ;
	public final int insn_format22b() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:614:3: ( INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal )
			// smaliIdeaParser.g:615:5: INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
			{
			match(input,INSTRUCTION_FORMAT22b,FOLLOW_INSTRUCTION_FORMAT22b_in_insn_format22b2695); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22b2697); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22b2699); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22b2701); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22b2703); if (state.failed) return size;
			pushFollow(FOLLOW_integral_literal_in_insn_format22b2705);
			integral_literal();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format22b"



	// $ANTLR start "insn_format22c_field"
	// smaliIdeaParser.g:617:1: insn_format22c_field returns [int size] : INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field ;
	public final int insn_format22c_field() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:618:3: ( INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field )
			// smaliIdeaParser.g:619:5: INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
			{
			match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_insn_format22c_field2724); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field2726); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field2728); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field2730); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field2732); if (state.failed) return size;
			pushFollow(FOLLOW_fully_qualified_field_in_insn_format22c_field2734);
			fully_qualified_field();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format22c_field"



	// $ANTLR start "insn_format22c_field_odex"
	// smaliIdeaParser.g:621:1: insn_format22c_field_odex returns [int size] : INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field ;
	public final int insn_format22c_field_odex() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:622:3: ( INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field )
			// smaliIdeaParser.g:623:5: INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
			{
			match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_insn_format22c_field_odex2753); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field_odex2755); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field_odex2757); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field_odex2759); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field_odex2761); if (state.failed) return size;
			pushFollow(FOLLOW_fully_qualified_field_in_insn_format22c_field_odex2763);
			fully_qualified_field();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format22c_field_odex"



	// $ANTLR start "insn_format22c_type"
	// smaliIdeaParser.g:625:1: insn_format22c_type returns [int size] : INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor ;
	public final int insn_format22c_type() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:626:3: ( INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor )
			// smaliIdeaParser.g:627:5: INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
			{
			match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_insn_format22c_type2782); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_type2784); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_type2786); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_type2788); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_type2790); if (state.failed) return size;
			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format22c_type2792);
			nonvoid_type_descriptor();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format22c_type"



	// $ANTLR start "insn_format22cs_field"
	// smaliIdeaParser.g:629:1: insn_format22cs_field returns [int size] : INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET ;
	public final int insn_format22cs_field() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:630:3: ( INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET )
			// smaliIdeaParser.g:631:5: INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
			{
			match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_insn_format22cs_field2811); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22cs_field2813); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22cs_field2815); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22cs_field2817); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22cs_field2819); if (state.failed) return size;
			match(input,FIELD_OFFSET,FOLLOW_FIELD_OFFSET_in_insn_format22cs_field2821); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format22cs_field"



	// $ANTLR start "insn_format22s"
	// smaliIdeaParser.g:633:1: insn_format22s returns [int size] : instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal ;
	public final int insn_format22s() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:634:3: ( instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal )
			// smaliIdeaParser.g:635:5: instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
			{
			pushFollow(FOLLOW_instruction_format22s_in_insn_format22s2840);
			instruction_format22s();
			state._fsp--;
			if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22s2842); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22s2844); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22s2846); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22s2848); if (state.failed) return size;
			pushFollow(FOLLOW_integral_literal_in_insn_format22s2850);
			integral_literal();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format22s"



	// $ANTLR start "insn_format22t"
	// smaliIdeaParser.g:637:1: insn_format22t returns [int size] : INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset ;
	public final int insn_format22t() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:638:3: ( INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset )
			// smaliIdeaParser.g:639:5: INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset
			{
			match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_insn_format22t2869); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22t2871); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22t2873); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22t2875); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22t2877); if (state.failed) return size;
			pushFollow(FOLLOW_label_ref_or_offset_in_insn_format22t2879);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format22t"



	// $ANTLR start "insn_format22x"
	// smaliIdeaParser.g:641:1: insn_format22x returns [int size] : INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER ;
	public final int insn_format22x() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:642:3: ( INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER )
			// smaliIdeaParser.g:643:5: INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
			{
			match(input,INSTRUCTION_FORMAT22x,FOLLOW_INSTRUCTION_FORMAT22x_in_insn_format22x2898); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22x2900); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format22x2902); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22x2904); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format22x"



	// $ANTLR start "insn_format23x"
	// smaliIdeaParser.g:645:1: insn_format23x returns [int size] : INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER ;
	public final int insn_format23x() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:646:3: ( INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER )
			// smaliIdeaParser.g:647:5: INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
			{
			match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_insn_format23x2923); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x2925); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format23x2927); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x2929); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format23x2931); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x2933); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format23x"



	// $ANTLR start "insn_format30t"
	// smaliIdeaParser.g:649:1: insn_format30t returns [int size] : INSTRUCTION_FORMAT30t label_ref_or_offset ;
	public final int insn_format30t() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:650:3: ( INSTRUCTION_FORMAT30t label_ref_or_offset )
			// smaliIdeaParser.g:651:5: INSTRUCTION_FORMAT30t label_ref_or_offset
			{
			match(input,INSTRUCTION_FORMAT30t,FOLLOW_INSTRUCTION_FORMAT30t_in_insn_format30t2952); if (state.failed) return size;
			pushFollow(FOLLOW_label_ref_or_offset_in_insn_format30t2954);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format30t"



	// $ANTLR start "insn_format31c"
	// smaliIdeaParser.g:653:1: insn_format31c returns [int size] : INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL ;
	public final int insn_format31c() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:654:3: ( INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL )
			// smaliIdeaParser.g:655:5: INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
			{
			match(input,INSTRUCTION_FORMAT31c,FOLLOW_INSTRUCTION_FORMAT31c_in_insn_format31c2973); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31c2975); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format31c2977); if (state.failed) return size;
			match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_insn_format31c2979); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format31c"



	// $ANTLR start "insn_format31i"
	// smaliIdeaParser.g:657:1: insn_format31i returns [int size] : instruction_format31i REGISTER COMMA fixed_32bit_literal ;
	public final int insn_format31i() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:658:3: ( instruction_format31i REGISTER COMMA fixed_32bit_literal )
			// smaliIdeaParser.g:659:5: instruction_format31i REGISTER COMMA fixed_32bit_literal
			{
			pushFollow(FOLLOW_instruction_format31i_in_insn_format31i2998);
			instruction_format31i();
			state._fsp--;
			if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31i3000); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format31i3002); if (state.failed) return size;
			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format31i3004);
			fixed_32bit_literal();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format31i"



	// $ANTLR start "insn_format31t"
	// smaliIdeaParser.g:661:1: insn_format31t returns [int size] : INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset ;
	public final int insn_format31t() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:662:3: ( INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset )
			// smaliIdeaParser.g:663:5: INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset
			{
			match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_insn_format31t3023); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31t3025); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format31t3027); if (state.failed) return size;
			pushFollow(FOLLOW_label_ref_or_offset_in_insn_format31t3029);
			label_ref_or_offset();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format31t"



	// $ANTLR start "insn_format32x"
	// smaliIdeaParser.g:665:1: insn_format32x returns [int size] : INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER ;
	public final int insn_format32x() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:666:3: ( INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER )
			// smaliIdeaParser.g:667:5: INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
			{
			match(input,INSTRUCTION_FORMAT32x,FOLLOW_INSTRUCTION_FORMAT32x_in_insn_format32x3048); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format32x3050); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format32x3052); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format32x3054); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format32x"



	// $ANTLR start "insn_format35c_method"
	// smaliIdeaParser.g:669:1: insn_format35c_method returns [int size] : INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method ;
	public final int insn_format35c_method() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:670:3: ( INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method )
			// smaliIdeaParser.g:671:5: INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
			{
			match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_insn_format35c_method3073); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_method3075); if (state.failed) return size;
			pushFollow(FOLLOW_register_list_in_insn_format35c_method3077);
			register_list();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_method3079); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_method3081); if (state.failed) return size;
			pushFollow(FOLLOW_fully_qualified_method_in_insn_format35c_method3083);
			fully_qualified_method();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format35c_method"



	// $ANTLR start "insn_format35c_type"
	// smaliIdeaParser.g:673:1: insn_format35c_type returns [int size] : INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor ;
	public final int insn_format35c_type() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:674:3: ( INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor )
			// smaliIdeaParser.g:675:5: INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
			{
			match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_insn_format35c_type3102); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_type3104); if (state.failed) return size;
			pushFollow(FOLLOW_register_list_in_insn_format35c_type3106);
			register_list();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_type3108); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_type3110); if (state.failed) return size;
			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format35c_type3112);
			nonvoid_type_descriptor();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format35c_type"



	// $ANTLR start "insn_format35c_method_odex"
	// smaliIdeaParser.g:677:1: insn_format35c_method_odex returns [int size] : INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method ;
	public final int insn_format35c_method_odex() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:678:3: ( INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method )
			// smaliIdeaParser.g:679:5: INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
			{
			match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_insn_format35c_method_odex3131); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_method_odex3133); if (state.failed) return size;
			pushFollow(FOLLOW_register_list_in_insn_format35c_method_odex3135);
			register_list();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_method_odex3137); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_method_odex3139); if (state.failed) return size;
			pushFollow(FOLLOW_fully_qualified_method_in_insn_format35c_method_odex3141);
			fully_qualified_method();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format35c_method_odex"



	// $ANTLR start "insn_format35mi_method"
	// smaliIdeaParser.g:681:1: insn_format35mi_method returns [int size] : INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX ;
	public final int insn_format35mi_method() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:682:3: ( INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX )
			// smaliIdeaParser.g:683:5: INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX
			{
			match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_insn_format35mi_method3160); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35mi_method3162); if (state.failed) return size;
			pushFollow(FOLLOW_register_list_in_insn_format35mi_method3164);
			register_list();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35mi_method3166); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format35mi_method3168); if (state.failed) return size;
			match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_insn_format35mi_method3170); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format35mi_method"



	// $ANTLR start "insn_format35ms_method"
	// smaliIdeaParser.g:685:1: insn_format35ms_method returns [int size] : INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX ;
	public final int insn_format35ms_method() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:686:3: ( INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX )
			// smaliIdeaParser.g:687:5: INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX
			{
			match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_insn_format35ms_method3189); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35ms_method3191); if (state.failed) return size;
			pushFollow(FOLLOW_register_list_in_insn_format35ms_method3193);
			register_list();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35ms_method3195); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format35ms_method3197); if (state.failed) return size;
			match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_insn_format35ms_method3199); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format35ms_method"



	// $ANTLR start "insn_format3rc_method"
	// smaliIdeaParser.g:689:1: insn_format3rc_method returns [int size] : INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method ;
	public final int insn_format3rc_method() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:690:3: ( INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method )
			// smaliIdeaParser.g:691:5: INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
			{
			match(input,INSTRUCTION_FORMAT3rc_METHOD,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_insn_format3rc_method3218); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_method3220); if (state.failed) return size;
			pushFollow(FOLLOW_register_range_in_insn_format3rc_method3222);
			register_range();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_method3224); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_method3226); if (state.failed) return size;
			pushFollow(FOLLOW_fully_qualified_method_in_insn_format3rc_method3228);
			fully_qualified_method();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format3rc_method"



	// $ANTLR start "insn_format3rc_method_odex"
	// smaliIdeaParser.g:693:1: insn_format3rc_method_odex returns [int size] : INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method ;
	public final int insn_format3rc_method_odex() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:694:3: ( INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method )
			// smaliIdeaParser.g:695:5: INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
			{
			match(input,INSTRUCTION_FORMAT3rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_insn_format3rc_method_odex3247); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_method_odex3249); if (state.failed) return size;
			pushFollow(FOLLOW_register_list_in_insn_format3rc_method_odex3251);
			register_list();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_method_odex3253); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_method_odex3255); if (state.failed) return size;
			pushFollow(FOLLOW_fully_qualified_method_in_insn_format3rc_method_odex3257);
			fully_qualified_method();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format3rc_method_odex"



	// $ANTLR start "insn_format3rc_type"
	// smaliIdeaParser.g:697:1: insn_format3rc_type returns [int size] : INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor ;
	public final int insn_format3rc_type() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:698:3: ( INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor )
			// smaliIdeaParser.g:699:5: INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
			{
			match(input,INSTRUCTION_FORMAT3rc_TYPE,FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_insn_format3rc_type3276); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_type3278); if (state.failed) return size;
			pushFollow(FOLLOW_register_range_in_insn_format3rc_type3280);
			register_range();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_type3282); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_type3284); if (state.failed) return size;
			pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format3rc_type3286);
			nonvoid_type_descriptor();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format3rc_type"



	// $ANTLR start "insn_format3rmi_method"
	// smaliIdeaParser.g:701:1: insn_format3rmi_method returns [int size] : INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX ;
	public final int insn_format3rmi_method() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:702:3: ( INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX )
			// smaliIdeaParser.g:703:5: INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX
			{
			match(input,INSTRUCTION_FORMAT3rmi_METHOD,FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_insn_format3rmi_method3305); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rmi_method3307); if (state.failed) return size;
			pushFollow(FOLLOW_register_range_in_insn_format3rmi_method3309);
			register_range();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rmi_method3311); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format3rmi_method3313); if (state.failed) return size;
			match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_insn_format3rmi_method3315); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format3rmi_method"



	// $ANTLR start "insn_format3rms_method"
	// smaliIdeaParser.g:705:1: insn_format3rms_method returns [int size] : INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX ;
	public final int insn_format3rms_method() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:706:3: ( INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX )
			// smaliIdeaParser.g:707:5: INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX
			{
			match(input,INSTRUCTION_FORMAT3rms_METHOD,FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_insn_format3rms_method3334); if (state.failed) return size;
			match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rms_method3336); if (state.failed) return size;
			pushFollow(FOLLOW_register_range_in_insn_format3rms_method3338);
			register_range();
			state._fsp--;
			if (state.failed) return size;
			match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rms_method3340); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format3rms_method3342); if (state.failed) return size;
			match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_insn_format3rms_method3344); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format3rms_method"



	// $ANTLR start "insn_format51l"
	// smaliIdeaParser.g:709:1: insn_format51l returns [int size] : INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal ;
	public final int insn_format51l() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:710:3: ( INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal )
			// smaliIdeaParser.g:711:5: INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
			{
			match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_insn_format51l3363); if (state.failed) return size;
			match(input,REGISTER,FOLLOW_REGISTER_in_insn_format51l3365); if (state.failed) return size;
			match(input,COMMA,FOLLOW_COMMA_in_insn_format51l3367); if (state.failed) return size;
			pushFollow(FOLLOW_fixed_literal_in_insn_format51l3369);
			fixed_literal();
			state._fsp--;
			if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_format51l"



	// $ANTLR start "insn_array_data_directive"
	// smaliIdeaParser.g:713:1: insn_array_data_directive returns [int size] : ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE ;
	public final int insn_array_data_directive() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:714:3: ( ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE )
			// smaliIdeaParser.g:714:5: ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE
			{
			match(input,ARRAY_DATA_DIRECTIVE,FOLLOW_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive3383); if (state.failed) return size;
			pushFollow(FOLLOW_integral_literal_in_insn_array_data_directive3385);
			integral_literal();
			state._fsp--;
			if (state.failed) return size;
			// smaliIdeaParser.g:714:43: ( fixed_literal )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( ((LA40_0 >= BOOL_LITERAL && LA40_0 <= BYTE_LITERAL)||LA40_0==CHAR_LITERAL||(LA40_0 >= DOUBLE_LITERAL && LA40_0 <= DOUBLE_LITERAL_OR_ID)||(LA40_0 >= FLOAT_LITERAL && LA40_0 <= FLOAT_LITERAL_OR_ID)||LA40_0==LONG_LITERAL||LA40_0==NEGATIVE_INTEGER_LITERAL||LA40_0==POSITIVE_INTEGER_LITERAL||LA40_0==SHORT_LITERAL) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// smaliIdeaParser.g:714:43: fixed_literal
					{
					pushFollow(FOLLOW_fixed_literal_in_insn_array_data_directive3387);
					fixed_literal();
					state._fsp--;
					if (state.failed) return size;
					}
					break;

				default :
					break loop40;
				}
			}

			match(input,END_ARRAY_DATA_DIRECTIVE,FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive3390); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_array_data_directive"



	// $ANTLR start "insn_packed_switch_directive"
	// smaliIdeaParser.g:716:1: insn_packed_switch_directive returns [int size] : PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE ;
	public final int insn_packed_switch_directive() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:717:3: ( PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE )
			// smaliIdeaParser.g:717:5: PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE
			{
			match(input,PACKED_SWITCH_DIRECTIVE,FOLLOW_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive3404); if (state.failed) return size;
			pushFollow(FOLLOW_fixed_32bit_literal_in_insn_packed_switch_directive3406);
			fixed_32bit_literal();
			state._fsp--;
			if (state.failed) return size;
			// smaliIdeaParser.g:717:49: ( label_ref_or_offset )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==COLON||LA41_0==NEGATIVE_INTEGER_LITERAL||LA41_0==OFFSET) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// smaliIdeaParser.g:717:49: label_ref_or_offset
					{
					pushFollow(FOLLOW_label_ref_or_offset_in_insn_packed_switch_directive3408);
					label_ref_or_offset();
					state._fsp--;
					if (state.failed) return size;
					}
					break;

				default :
					break loop41;
				}
			}

			match(input,END_PACKED_SWITCH_DIRECTIVE,FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive3411); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_packed_switch_directive"



	// $ANTLR start "insn_sparse_switch_directive"
	// smaliIdeaParser.g:719:1: insn_sparse_switch_directive returns [int size] : SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE ;
	public final int insn_sparse_switch_directive() throws RecognitionException {
		int size = 0;


		try {
			// smaliIdeaParser.g:720:3: ( SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE )
			// smaliIdeaParser.g:720:5: SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE
			{
			match(input,SPARSE_SWITCH_DIRECTIVE,FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive3425); if (state.failed) return size;
			// smaliIdeaParser.g:720:29: ( fixed_32bit_literal ARROW label_ref_or_offset )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( ((LA42_0 >= BOOL_LITERAL && LA42_0 <= BYTE_LITERAL)||LA42_0==CHAR_LITERAL||(LA42_0 >= FLOAT_LITERAL && LA42_0 <= FLOAT_LITERAL_OR_ID)||LA42_0==LONG_LITERAL||LA42_0==NEGATIVE_INTEGER_LITERAL||LA42_0==POSITIVE_INTEGER_LITERAL||LA42_0==SHORT_LITERAL) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// smaliIdeaParser.g:720:30: fixed_32bit_literal ARROW label_ref_or_offset
					{
					pushFollow(FOLLOW_fixed_32bit_literal_in_insn_sparse_switch_directive3428);
					fixed_32bit_literal();
					state._fsp--;
					if (state.failed) return size;
					match(input,ARROW,FOLLOW_ARROW_in_insn_sparse_switch_directive3430); if (state.failed) return size;
					pushFollow(FOLLOW_label_ref_or_offset_in_insn_sparse_switch_directive3432);
					label_ref_or_offset();
					state._fsp--;
					if (state.failed) return size;
					}
					break;

				default :
					break loop42;
				}
			}

			match(input,END_SPARSE_SWITCH_DIRECTIVE,FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive3436); if (state.failed) return size;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return size;
	}
	// $ANTLR end "insn_sparse_switch_directive"

	// $ANTLR start synpred1_smaliIdeaParser
	public final void synpred1_smaliIdeaParser_fragment() throws RecognitionException {
		// smaliIdeaParser.g:191:7: ( ANNOTATION_DIRECTIVE )
		// smaliIdeaParser.g:191:8: ANNOTATION_DIRECTIVE
		{
		match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_synpred1_smaliIdeaParser298); if (state.failed) return;
		}

	}
	// $ANTLR end synpred1_smaliIdeaParser

	// $ANTLR start synpred2_smaliIdeaParser
	public final void synpred2_smaliIdeaParser_fragment() throws RecognitionException {
		// smaliIdeaParser.g:192:35: ( ANNOTATION_DIRECTIVE )
		// smaliIdeaParser.g:192:36: ANNOTATION_DIRECTIVE
		{
		match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_synpred2_smaliIdeaParser341); if (state.failed) return;
		}

	}
	// $ANTLR end synpred2_smaliIdeaParser

	// Delegated rules

	public final boolean synpred2_smaliIdeaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_smaliIdeaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_smaliIdeaParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_smaliIdeaParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA35 dfa35 = new DFA35(this);
	static final String DFA35_eotS =
		"\76\uffff";
	static final String DFA35_eofS =
		"\76\uffff";
	static final String DFA35_minS =
		"\1\5\73\uffff\1\0\1\uffff";
	static final String DFA35_maxS =
		"\1\u00d7\73\uffff\1\0\1\uffff";
	static final String DFA35_acceptS =
		"\1\uffff\1\2\73\uffff\1\1";
	static final String DFA35_specialS =
		"\74\uffff\1\0\1\uffff}>";
	static final String[] DFA35_transitionS = {
			"\1\74\1\uffff\1\1\17\uffff\2\1\5\uffff\1\1\10\uffff\2\1\1\uffff\1\1\3"+
			"\uffff\1\1\13\uffff\54\1\131\uffff\3\1\10\uffff\2\1\4\uffff\1\1\1\uffff"+
			"\2\1\2\uffff\2\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			""
	};

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 453:5: ({...}? annotation )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA35_60 = input.LA(1);
						 
						int index35_60 = input.index();
						input.rewind();
						s = -1;
						if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 61;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index35_60);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 35, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_class_element_in_smali_file62 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x0000000000000000L,0x0000000004400008L});
	public static final BitSet FOLLOW_sync_in_smali_file64 = new BitSet(new long[]{0x0102000008000020L,0x0000000000000000L,0x0000000000000000L,0x0000000004400008L});
	public static final BitSet FOLLOW_EOF_in_smali_file69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_spec_in_class_element83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_super_spec_in_class_element89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_implements_spec_in_class_element95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_source_spec_in_class_element101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_in_class_element107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_field_in_class_element113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_class_element119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DIRECTIVE_in_class_spec137 = new BitSet(new long[]{0x0000000004000010L});
	public static final BitSet FOLLOW_access_list_in_class_spec139 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_class_descriptor_in_class_spec141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUPER_DIRECTIVE_in_super_spec164 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_class_descriptor_in_super_spec166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec189 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_class_descriptor_in_implements_spec191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_spec214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_source_spec216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ACCESS_SPEC_in_access_list239 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_FIELD_DIRECTIVE_in_field266 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_access_list_in_field268 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_simple_name_in_field270 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_field272 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field274 = new BitSet(new long[]{0x0000804000000022L});
	public static final BitSet FOLLOW_EQUAL_in_field277 = new BitSet(new long[]{0x0018200C06600100L,0x0000000000000000L,0x0000000000000000L,0x000000001310C164L});
	public static final BitSet FOLLOW_literal_in_field279 = new BitSet(new long[]{0x0000004000000022L});
	public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_annotation_in_field345 = new BitSet(new long[]{0x0000004000000022L});
	public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DIRECTIVE_in_method457 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E070L});
	public static final BitSet FOLLOW_access_list_in_method459 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E070L});
	public static final BitSet FOLLOW_method_name_in_method461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_method_prototype_in_method463 = new BitSet(new long[]{0xFC004180418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_statements_and_directives_in_method465 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_END_METHOD_DIRECTIVE_in_method467 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_statements_and_directives492 = new BitSet(new long[]{0xFC004080418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_registers_directive_in_statements_and_directives502 = new BitSet(new long[]{0xFC004080418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_label_in_statements_and_directives512 = new BitSet(new long[]{0xFC004080418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_catch_directive_in_statements_and_directives522 = new BitSet(new long[]{0xFC004080418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_catchall_directive_in_statements_and_directives532 = new BitSet(new long[]{0xFC004080418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_parameter_directive_in_statements_and_directives542 = new BitSet(new long[]{0xFC004080418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_ordered_debug_directive_in_statements_and_directives552 = new BitSet(new long[]{0xFC004080418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_annotation_in_statements_and_directives562 = new BitSet(new long[]{0xFC004080418000A0L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_sync_in_statements_and_directives576 = new BitSet(new long[]{0xFC004080418000A2L,0x0000003FFFFFFFFFL,0x8000000000000000L,0x0000000000CD0C03L});
	public static final BitSet FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive598 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_integral_literal_in_registers_directive600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCALS_DIRECTIVE_in_registers_directive608 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_integral_literal_in_registers_directive610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_method_name901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_NAME_in_method_name907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_PAREN_in_method_prototype930 = new BitSet(new long[]{0x0000000024000100L,0x0000000000000000L,0x0000000000000000L,0x000000000000B000L});
	public static final BitSet FOLLOW_param_list_in_method_prototype932 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_CLOSE_PAREN_in_method_prototype934 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000010008000L});
	public static final BitSet FOLLOW_type_descriptor_in_method_prototype936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_LIST_in_param_list959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_param_list965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_param_list971 = new BitSet(new long[]{0x0000000004000102L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_VOID_TYPE_in_void_type995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_primitive_type1018 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_class_descriptor1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_void_type_in_type_descriptor1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitive_type_in_type_descriptor1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_descriptor_in_type_descriptor1069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DESCRIPTOR_in_type_descriptor1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitive_type_in_nonvoid_type_descriptor1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_descriptor_in_nonvoid_type_descriptor1091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DESCRIPTOR_in_nonvoid_type_descriptor1097 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_descriptor_in_reference_type_descriptor1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DESCRIPTOR_in_reference_type_descriptor1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_literal1178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_literal1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_literal1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_literal1196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_literal1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_double_literal_in_literal1208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_literal1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_literal1220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_literal1226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NULL_LITERAL_in_literal1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_literal_in_literal1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subannotation_in_literal1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_field_method_literal_in_literal1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enum_literal_in_literal1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_integral_literal1279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_integral_literal1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_integral_literal1291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_integral_literal1297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_integral_literal1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_fixed_32bit_literal1325 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_fixed_32bit_literal1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_literal_in_fixed_literal1365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_literal1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_literal1377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_literal1383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_float_literal_in_fixed_literal1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_double_literal_in_fixed_literal1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_literal1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_literal1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_array_literal1417 = new BitSet(new long[]{0x0018200C16600100L,0x0000000000000000L,0x0000000000000000L,0x000000001310C164L});
	public static final BitSet FOLLOW_literal_in_array_literal1420 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_COMMA_in_array_literal1423 = new BitSet(new long[]{0x0018200C06600100L,0x0000000000000000L,0x0000000000000000L,0x000000001310C164L});
	public static final BitSet FOLLOW_literal_in_array_literal1425 = new BitSet(new long[]{0x0000000090000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_array_literal1433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simple_name_in_annotation_element1443 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_EQUAL_in_annotation_element1445 = new BitSet(new long[]{0x0018200C06600100L,0x0000000000000000L,0x0000000000000000L,0x000000001310C164L});
	public static final BitSet FOLLOW_literal_in_annotation_element1447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1465 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_annotation1467 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_class_descriptor_in_annotation1469 = new BitSet(new long[]{0x5C10001800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_annotation_element_in_annotation1475 = new BitSet(new long[]{0x5C10001800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1494 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_class_descriptor_in_subannotation1496 = new BitSet(new long[]{0x5C10100800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_annotation_element_in_subannotation1498 = new BitSet(new long[]{0x5C10100800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ENUM_DIRECTIVE_in_enum_literal1511 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1513 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_enum_literal1515 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_simple_name_in_enum_literal1517 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_enum_literal1519 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal1531 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ARROW_in_type_field_method_literal1539 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E070L});
	public static final BitSet FOLLOW_simple_name_in_type_field_method_literal1549 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_type_field_method_literal1551 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_method_name_in_type_field_method_literal1563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_method_prototype_in_type_field_method_literal1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitive_type_in_type_field_method_literal1595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_void_type_in_type_field_method_literal1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_method1611 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_fully_qualified_method1613 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E070L});
	public static final BitSet FOLLOW_method_name_in_fully_qualified_method1615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_method_prototype_in_fully_qualified_method1617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_field1627 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_fully_qualified_field1629 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_simple_name_in_fully_qualified_field1631 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_fully_qualified_field1633 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_label1645 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_simple_name_in_label1647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_label_ref_or_offset1657 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_simple_name_in_label_ref_or_offset1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OFFSET_in_label_ref_or_offset1665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REGISTER_in_register_list1682 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_register_list1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_register_list1687 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_REGISTER_in_register_range1702 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_DOTDOT_in_register_range1705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_register_range1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_descriptor_in_verification_error_reference1721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_field_in_verification_error_reference1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_method_in_verification_error_reference1729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCH_DIRECTIVE_in_catch_directive1739 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_catch_directive1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_catch_directive1743 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1745 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DOTDOT_in_catch_directive1747 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1749 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_catch_directive1751 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_catchall_directive1765 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1767 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_DOTDOT_in_catchall_directive1769 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1771 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_catchall_directive1773 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1787 = new BitSet(new long[]{0x0000040000000022L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_parameter_directive1789 = new BitSet(new long[]{0x0000040000000022L});
	public static final BitSet FOLLOW_annotation_in_parameter_directive1799 = new BitSet(new long[]{0x0000040000000022L});
	public static final BitSet FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_line_directive_in_ordered_debug_directive1833 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_local_directive_in_ordered_debug_directive1839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_end_local_directive_in_ordered_debug_directive1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_restart_local_directive_in_ordered_debug_directive1851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prologue_directive_in_ordered_debug_directive1857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_epilogue_directive_in_ordered_debug_directive1863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_source_directive_in_ordered_debug_directive1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LINE_DIRECTIVE_in_line_directive1879 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_integral_literal_in_line_directive1881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCAL_DIRECTIVE_in_local_directive1891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_local_directive1893 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_local_directive1895 = new BitSet(new long[]{0x5C10000800200050L,0x00000020FB16F479L,0x0000000000000000L,0x000000001822E060L});
	public static final BitSet FOLLOW_simple_name_in_local_directive1897 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COLON_in_local_directive1899 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_local_directive1901 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_COMMA_in_local_directive1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive1906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_end_local_directive1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_restart_local_directive1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1952 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_directive1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_source_directive1964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10t_in_instruction2029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10x_in_instruction2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format10x_odex_in_instruction2041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format11n_in_instruction2047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format11x_in_instruction2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format12x_in_instruction2059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format20bc_in_instruction2065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format20t_in_instruction2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_field_in_instruction2077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_field_odex_in_instruction2083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_string_in_instruction2089 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21c_type_in_instruction2095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21ih_in_instruction2101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21lh_in_instruction2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21s_in_instruction2113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format21t_in_instruction2119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22b_in_instruction2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_field_in_instruction2131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_field_odex_in_instruction2137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22c_type_in_instruction2143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22cs_field_in_instruction2149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22s_in_instruction2155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22t_in_instruction2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format22x_in_instruction2167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format23x_in_instruction2173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format30t_in_instruction2179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31c_in_instruction2185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31i_in_instruction2191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format31t_in_instruction2197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format32x_in_instruction2203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_method_in_instruction2209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_type_in_instruction2215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35c_method_odex_in_instruction2221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35mi_method_in_instruction2227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format35ms_method_in_instruction2233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_method_in_instruction2239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_method_odex_in_instruction2245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rc_type_in_instruction2251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rmi_method_in_instruction2257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format3rms_method_in_instruction2263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_format51l_in_instruction2269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_array_data_directive_in_instruction2275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_packed_switch_directive_in_instruction2281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insn_sparse_switch_directive_in_instruction2287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_insn_format10t2317 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format10t2319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_insn_format10x2338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_insn_format10x_odex2357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT11n_in_insn_format11n2376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format11n2378 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format11n2380 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format11n2382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_insn_format11x2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format11x2403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format12x_in_insn_format12x2422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format12x2424 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format12x2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format12x2428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT20bc_in_insn_format20bc2447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_insn_format20bc2449 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format20bc2451 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_verification_error_reference_in_insn_format20bc2453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT20t_in_insn_format20t2472 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format20t2474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_insn_format21c_field2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_field2495 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_field2497 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_field_in_insn_format21c_field2499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_insn_format21c_field_odex2518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_field_odex2520 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_field_odex2522 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_field_in_insn_format21c_field_odex2524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_insn_format21c_string2543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_string2545 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_string2547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_insn_format21c_string2549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_insn_format21c_type2568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21c_type2570 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21c_type2572 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_reference_type_descriptor_in_insn_format21c_type2574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21ih_in_insn_format21ih2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21ih2595 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21ih2597 = new BitSet(new long[]{0x0018000002600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format21ih2599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21lh_in_insn_format21lh2618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21lh2620 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21lh2622 = new BitSet(new long[]{0x0018000002600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format21lh2624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21s_in_insn_format21s2643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21s2645 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21s2647 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format21s2649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_insn_format21t2668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format21t2670 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format21t2672 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format21t2675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22b_in_insn_format22b2695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22b2697 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22b2699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22b2701 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22b2703 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format22b2705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_insn_format22c_field2724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field2726 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field2730 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field2732 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_field_in_insn_format22c_field2734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_insn_format22c_field_odex2753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field_odex2755 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field_odex2757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field_odex2759 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_field_odex2761 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_field_in_insn_format22c_field_odex2763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_insn_format22c_type2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_type2784 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_type2786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22c_type2788 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22c_type2790 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format22c_type2792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_insn_format22cs_field2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22cs_field2813 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22cs_field2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22cs_field2817 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22cs_field2819 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_FIELD_OFFSET_in_insn_format22cs_field2821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format22s_in_insn_format22s2840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22s2842 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22s2844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22s2846 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22s2848 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_integral_literal_in_insn_format22s2850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_insn_format22t2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22t2871 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22t2873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22t2875 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22t2877 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format22t2879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT22x_in_insn_format22x2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22x2900 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format22x2902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format22x2904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_insn_format23x2923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x2925 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format23x2927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x2929 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format23x2931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format23x2933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT30t_in_insn_format30t2952 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format30t2954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31c_in_insn_format31c2973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31c2975 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31c2977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_insn_format31c2979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_format31i_in_insn_format31i2998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31i3000 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31i3002 = new BitSet(new long[]{0x0018000002600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format31i3004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_insn_format31t3023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format31t3025 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format31t3027 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format31t3029 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT32x_in_insn_format32x3048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format32x3050 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format32x3052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format32x3054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_insn_format35c_method3073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_method3075 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_method3077 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_method3079 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_method3081 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_method_in_insn_format35c_method3083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_insn_format35c_type3102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_type3104 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_type3106 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_type3108 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_type3110 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format35c_type3112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_insn_format35c_method_odex3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_method_odex3133 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_list_in_insn_format35c_method_odex3135 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_method_odex3137 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35c_method_odex3139 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_method_in_insn_format35c_method_odex3141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_insn_format35mi_method3160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35mi_method3162 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_list_in_insn_format35mi_method3164 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35mi_method3166 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35mi_method3168 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_INLINE_INDEX_in_insn_format35mi_method3170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_insn_format35ms_method3189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35ms_method3191 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_list_in_insn_format35ms_method3193 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35ms_method3195 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format35ms_method3197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_VTABLE_INDEX_in_insn_format35ms_method3199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_insn_format3rc_method3218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_method3220 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rc_method3222 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_method3224 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_method3226 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_method_in_insn_format3rc_method3228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_insn_format3rc_method_odex3247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_method_odex3249 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_list_in_insn_format3rc_method_odex3251 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_method_odex3253 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_method_odex3255 = new BitSet(new long[]{0x0000000004000100L});
	public static final BitSet FOLLOW_fully_qualified_method_in_insn_format3rc_method_odex3257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_insn_format3rc_type3276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_type3278 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rc_type3280 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_type3282 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rc_type3284 = new BitSet(new long[]{0x0000000004000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format3rc_type3286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_insn_format3rmi_method3305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rmi_method3307 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rmi_method3309 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rmi_method3311 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rmi_method3313 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_INLINE_INDEX_in_insn_format3rmi_method3315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_insn_format3rms_method3334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rms_method3336 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_register_range_in_insn_format3rms_method3338 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rms_method3340 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format3rms_method3342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_VTABLE_INDEX_in_insn_format3rms_method3344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_insn_format51l3363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_REGISTER_in_insn_format51l3365 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMA_in_insn_format51l3367 = new BitSet(new long[]{0x0018000C02600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_fixed_literal_in_insn_format51l3369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive3383 = new BitSet(new long[]{0x0000000002400000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_integral_literal_in_insn_array_data_directive3385 = new BitSet(new long[]{0x0018002C02600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_fixed_literal_in_insn_array_data_directive3387 = new BitSet(new long[]{0x0018002C02600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive3390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive3404 = new BitSet(new long[]{0x0018000002600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_packed_switch_directive3406 = new BitSet(new long[]{0x0000020040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_insn_packed_switch_directive3408 = new BitSet(new long[]{0x0000020040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive3411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive3425 = new BitSet(new long[]{0x0018080002600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_sparse_switch_directive3428 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ARROW_in_insn_sparse_switch_directive3430 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000000L,0x0000000000000000L,0x00000000000000A0L});
	public static final BitSet FOLLOW_label_ref_or_offset_in_insn_sparse_switch_directive3432 = new BitSet(new long[]{0x0018080002600000L,0x0000000000000000L,0x0000000000000000L,0x0000000000104024L});
	public static final BitSet FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive3436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_synpred1_smaliIdeaParser298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_synpred2_smaliIdeaParser341 = new BitSet(new long[]{0x0000000000000002L});
}
