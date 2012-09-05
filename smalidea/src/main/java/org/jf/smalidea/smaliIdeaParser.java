// $ANTLR 3.4 smaliIdeaParser.g 2012-09-07 22:19:10

package org.jf.smalidea;

import org.jf.smalidea.SmaliElementTypes;
import com.intellij.lang.PsiBuilder;
import static com.intellij.lang.PsiBuilder.Marker;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class smaliIdeaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS_DIRECTIVE", "SUPER_DIRECTIVE", "IMPLEMENTS_DIRECTIVE", "SOURCE_DIRECTIVE", "FIELD_DIRECTIVE", "END_FIELD_DIRECTIVE", "SUBANNOTATION_DIRECTIVE", "END_SUBANNOTATION_DIRECTIVE", "ANNOTATION_DIRECTIVE", "END_ANNOTATION_DIRECTIVE", "ENUM_DIRECTIVE", "METHOD_DIRECTIVE", "END_METHOD_DIRECTIVE", "REGISTERS_DIRECTIVE", "LOCALS_DIRECTIVE", "ARRAY_DATA_DIRECTIVE", "END_ARRAY_DATA_DIRECTIVE", "PACKED_SWITCH_DIRECTIVE", "END_PACKED_SWITCH_DIRECTIVE", "SPARSE_SWITCH_DIRECTIVE", "END_SPARSE_SWITCH_DIRECTIVE", "CATCH_DIRECTIVE", "CATCHALL_DIRECTIVE", "LINE_DIRECTIVE", "PARAMETER_DIRECTIVE", "END_PARAMETER_DIRECTIVE", "LOCAL_DIRECTIVE", "END_LOCAL_DIRECTIVE", "RESTART_LOCAL_DIRECTIVE", "PROLOGUE_DIRECTIVE", "EPILOGUE_DIRECTIVE", "HEX_PREFIX", "HEX_DIGIT", "BASE_INTEGER", "DECIMAL_EXPONENT", "BINARY_EXPONENT", "HEX_DIGITS", "BASE_FLOAT_OR_ID", "BASE_FLOAT", "ESCAPE_SEQUENCE", "POSITIVE_INTEGER_LITERAL", "NEGATIVE_INTEGER_LITERAL", "LONG_LITERAL", "SHORT_LITERAL", "BYTE_LITERAL", "FLOAT_LITERAL_OR_ID", "DOUBLE_LITERAL_OR_ID", "FLOAT_LITERAL", "DOUBLE_LITERAL", "BOOL_LITERAL", "NULL_LITERAL", "BASE_STRING_LITERAL", "STRING_LITERAL", "BASE_CHAR_LITERAL", "CHAR_LITERAL", "REGISTER", "ANNOTATION_VISIBILITY", "ACCESS_SPEC", "VERIFICATION_ERROR_TYPE", "INLINE_INDEX", "VTABLE_INDEX", "FIELD_OFFSET", "OFFSET", "LINE_COMMENT", "INSTRUCTION_FORMAT10t", "INSTRUCTION_FORMAT10x", "INSTRUCTION_FORMAT10x_ODEX", "INSTRUCTION_FORMAT11n", "INSTRUCTION_FORMAT11x", "INSTRUCTION_FORMAT12x_OR_ID", "INSTRUCTION_FORMAT12x", "INSTRUCTION_FORMAT20bc", "INSTRUCTION_FORMAT20t", "INSTRUCTION_FORMAT21c_FIELD", "INSTRUCTION_FORMAT21c_FIELD_ODEX", "INSTRUCTION_FORMAT21c_STRING", "INSTRUCTION_FORMAT21c_TYPE", "INSTRUCTION_FORMAT21h", "INSTRUCTION_FORMAT21s", "INSTRUCTION_FORMAT21t", "INSTRUCTION_FORMAT22b", "INSTRUCTION_FORMAT22c_FIELD", "INSTRUCTION_FORMAT22c_FIELD_ODEX", "INSTRUCTION_FORMAT22c_TYPE", "INSTRUCTION_FORMAT22cs_FIELD", "INSTRUCTION_FORMAT22s_OR_ID", "INSTRUCTION_FORMAT22s", "INSTRUCTION_FORMAT22t", "INSTRUCTION_FORMAT22x", "INSTRUCTION_FORMAT23x", "INSTRUCTION_FORMAT30t", "INSTRUCTION_FORMAT31c", "INSTRUCTION_FORMAT31i_OR_ID", "INSTRUCTION_FORMAT31i", "INSTRUCTION_FORMAT31t", "INSTRUCTION_FORMAT32x", "INSTRUCTION_FORMAT35c_METHOD", "INSTRUCTION_FORMAT35c_METHOD_ODEX", "INSTRUCTION_FORMAT35c_TYPE", "INSTRUCTION_FORMAT35mi_METHOD", "INSTRUCTION_FORMAT35ms_METHOD", "INSTRUCTION_FORMAT3rc_METHOD", "INSTRUCTION_FORMAT3rc_METHOD_ODEX", "INSTRUCTION_FORMAT3rc_TYPE", "INSTRUCTION_FORMAT3rmi_METHOD", "INSTRUCTION_FORMAT3rms_METHOD", "INSTRUCTION_FORMAT41c_TYPE", "INSTRUCTION_FORMAT41c_FIELD", "INSTRUCTION_FORMAT41c_FIELD_ODEX", "INSTRUCTION_FORMAT51l", "INSTRUCTION_FORMAT52c_TYPE", "INSTRUCTION_FORMAT52c_FIELD", "INSTRUCTION_FORMAT52c_FIELD_ODEX", "INSTRUCTION_FORMAT5rc_METHOD", "INSTRUCTION_FORMAT5rc_METHOD_ODEX", "INSTRUCTION_FORMAT5rc_TYPE", "BASE_SIMPLE_NAME", "BASE_PRIMITIVE_TYPE", "BASE_CLASS_DESCRIPTOR", "BASE_ARRAY_DESCRIPTOR", "BASE_TYPE", "PRIMITIVE_TYPE", "VOID_TYPE", "CLASS_DESCRIPTOR", "ARRAY_DESCRIPTOR", "PARAM_LIST_OR_ID", "PARAM_LIST", "SIMPLE_NAME", "METHOD_NAME", "DOTDOT", "ARROW", "EQUAL", "COLON", "COMMA", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "WHITE_SPACE", "I_CLASS_DEF", "I_SUPER", "I_IMPLEMENTS", "I_SOURCE", "I_ACCESS_LIST", "I_METHODS", "I_FIELDS", "I_FIELD", "I_FIELD_TYPE", "I_FIELD_INITIAL_VALUE", "I_METHOD", "I_METHOD_PROTOTYPE", "I_METHOD_RETURN_TYPE", "I_REGISTERS", "I_LOCALS", "I_LABELS", "I_LABEL", "I_ANNOTATIONS", "I_ANNOTATION", "I_ANNOTATION_ELEMENT", "I_SUBANNOTATION", "I_ENCODED_FIELD", "I_ENCODED_METHOD", "I_ENCODED_ENUM", "I_ENCODED_ARRAY", "I_ARRAY_ELEMENT_SIZE", "I_ARRAY_ELEMENTS", "I_PACKED_SWITCH_START_KEY", "I_PACKED_SWITCH_TARGET_COUNT", "I_PACKED_SWITCH_TARGETS", "I_PACKED_SWITCH_DECLARATION", "I_PACKED_SWITCH_DECLARATIONS", "I_SPARSE_SWITCH_KEYS", "I_SPARSE_SWITCH_TARGET_COUNT", "I_SPARSE_SWITCH_TARGETS", "I_SPARSE_SWITCH_DECLARATION", "I_SPARSE_SWITCH_DECLARATIONS", "I_ADDRESS", "I_CATCH", "I_CATCHALL", "I_CATCHES", "I_PARAMETER", "I_PARAMETERS", "I_PARAMETER_NOT_SPECIFIED", "I_ORDERED_DEBUG_DIRECTIVES", "I_LINE", "I_LOCAL", "I_END_LOCAL", "I_RESTART_LOCAL", "I_PROLOGUE", "I_EPILOGUE", "I_STATEMENTS", "I_STATEMENT_FORMAT10t", "I_STATEMENT_FORMAT10x", "I_STATEMENT_FORMAT11n", "I_STATEMENT_FORMAT11x", "I_STATEMENT_FORMAT12x", "I_STATEMENT_FORMAT20bc", "I_STATEMENT_FORMAT20t", "I_STATEMENT_FORMAT21c_TYPE", "I_STATEMENT_FORMAT21c_FIELD", "I_STATEMENT_FORMAT21c_STRING", "I_STATEMENT_FORMAT21h", "I_STATEMENT_FORMAT21s", "I_STATEMENT_FORMAT21t", "I_STATEMENT_FORMAT22b", "I_STATEMENT_FORMAT22c_FIELD", "I_STATEMENT_FORMAT22c_TYPE", "I_STATEMENT_FORMAT22s", "I_STATEMENT_FORMAT22t", "I_STATEMENT_FORMAT22x", "I_STATEMENT_FORMAT23x", "I_STATEMENT_FORMAT30t", "I_STATEMENT_FORMAT31c", "I_STATEMENT_FORMAT31i", "I_STATEMENT_FORMAT31t", "I_STATEMENT_FORMAT32x", "I_STATEMENT_FORMAT35c_METHOD", "I_STATEMENT_FORMAT35c_TYPE", "I_STATEMENT_FORMAT3rc_METHOD", "I_STATEMENT_FORMAT3rc_TYPE", "I_STATEMENT_FORMAT41c_TYPE", "I_STATEMENT_FORMAT41c_FIELD", "I_STATEMENT_FORMAT51l", "I_STATEMENT_FORMAT52c_TYPE", "I_STATEMENT_FORMAT52c_FIELD", "I_STATEMENT_FORMAT5rc_METHOD", "I_STATEMENT_FORMAT5rc_TYPE", "I_STATEMENT_ARRAY_DATA", "I_STATEMENT_PACKED_SWITCH", "I_STATEMENT_SPARSE_SWITCH", "I_REGISTER_RANGE", "I_REGISTER_LIST", "LABEL", "INTEGER_LITERAL", "INVALID_TOKEN"
    };

    public static final int EOF=-1;
    public static final int I_REGISTER_LIST=235;
    public static final int I_STATEMENT_FORMAT51l=226;
    public static final int SPARSE_SWITCH_DIRECTIVE=23;
    public static final int END_PARAMETER_DIRECTIVE=29;
    public static final int I_ORDERED_DEBUG_DIRECTIVES=187;
    public static final int BINARY_EXPONENT=39;
    public static final int INSTRUCTION_FORMAT11x=72;
    public static final int ANNOTATION_VISIBILITY=60;
    public static final int INVALID_TOKEN=238;
    public static final int END_SUBANNOTATION_DIRECTIVE=11;
    public static final int HEX_PREFIX=35;
    public static final int I_STATEMENT_FORMAT12x=199;
    public static final int I_METHOD=153;
    public static final int I_SUBANNOTATION=163;
    public static final int INSTRUCTION_FORMAT11n=71;
    public static final int I_SPARSE_SWITCH_TARGETS=177;
    public static final int I_PACKED_SWITCH_TARGET_COUNT=171;
    public static final int STRING_LITERAL=56;
    public static final int I_STATEMENT_FORMAT5rc_METHOD=229;
    public static final int SHORT_LITERAL=47;
    public static final int I_FIELD_INITIAL_VALUE=152;
    public static final int INSTRUCTION_FORMAT10x=69;
    public static final int I_PACKED_SWITCH_DECLARATION=173;
    public static final int I_STATEMENT_FORMAT11n=197;
    public static final int I_SUPER=144;
    public static final int INSTRUCTION_FORMAT10t=68;
    public static final int NEGATIVE_INTEGER_LITERAL=45;
    public static final int I_STATEMENT_FORMAT11x=198;
    public static final int REGISTER=59;
    public static final int INSTRUCTION_FORMAT21c_TYPE=80;
    public static final int I_LINE=188;
    public static final int LOCAL_DIRECTIVE=30;
    public static final int LOCALS_DIRECTIVE=18;
    public static final int I_CATCHALL=182;
    public static final int INSTRUCTION_FORMAT35c_TYPE=102;
    public static final int INSTRUCTION_FORMAT31i_OR_ID=96;
    public static final int I_PARAMETERS=185;
    public static final int I_METHOD_RETURN_TYPE=155;
    public static final int INSTRUCTION_FORMAT51l=113;
    public static final int ENUM_DIRECTIVE=14;
    public static final int NULL_LITERAL=54;
    public static final int REGISTERS_DIRECTIVE=17;
    public static final int BASE_SIMPLE_NAME=120;
    public static final int END_ARRAY_DATA_DIRECTIVE=20;
    public static final int I_STATEMENT_FORMAT21c_FIELD=203;
    public static final int I_METHOD_PROTOTYPE=154;
    public static final int EPILOGUE_DIRECTIVE=34;
    public static final int INSTRUCTION_FORMAT35mi_METHOD=103;
    public static final int INSTRUCTION_FORMAT41c_TYPE=110;
    public static final int I_LOCALS=157;
    public static final int RESTART_LOCAL_DIRECTIVE=32;
    public static final int I_ENCODED_ARRAY=167;
    public static final int POSITIVE_INTEGER_LITERAL=44;
    public static final int INSTRUCTION_FORMAT41c_FIELD_ODEX=112;
    public static final int BASE_PRIMITIVE_TYPE=121;
    public static final int CATCH_DIRECTIVE=25;
    public static final int I_CATCH=181;
    public static final int I_PARAMETER_NOT_SPECIFIED=186;
    public static final int INSTRUCTION_FORMAT21h=81;
    public static final int I_ANNOTATION=161;
    public static final int INSTRUCTION_FORMAT21s=82;
    public static final int INSTRUCTION_FORMAT21t=83;
    public static final int INSTRUCTION_FORMAT41c_FIELD=111;
    public static final int WHITE_SPACE=142;
    public static final int INSTRUCTION_FORMAT3rmi_METHOD=108;
    public static final int INSTRUCTION_FORMAT22b=84;
    public static final int INSTRUCTION_FORMAT52c_FIELD_ODEX=116;
    public static final int INSTRUCTION_FORMAT20t=76;
    public static final int OFFSET=66;
    public static final int FLOAT_LITERAL_OR_ID=49;
    public static final int INSTRUCTION_FORMAT20bc=75;
    public static final int I_PACKED_SWITCH_START_KEY=170;
    public static final int I_ACCESS_LIST=147;
    public static final int I_REGISTERS=156;
    public static final int SOURCE_DIRECTIVE=7;
    public static final int IMPLEMENTS_DIRECTIVE=6;
    public static final int CLASS_DIRECTIVE=4;
    public static final int BASE_CHAR_LITERAL=57;
    public static final int I_STATEMENT_FORMAT35c_METHOD=220;
    public static final int I_STATEMENT_SPARSE_SWITCH=233;
    public static final int BASE_STRING_LITERAL=55;
    public static final int INSTRUCTION_FORMAT23x=93;
    public static final int OPEN_PAREN=140;
    public static final int HEX_DIGIT=36;
    public static final int END_PACKED_SWITCH_DIRECTIVE=22;
    public static final int CLOSE_BRACE=139;
    public static final int I_EPILOGUE=193;
    public static final int LONG_LITERAL=46;
    public static final int I_METHODS=148;
    public static final int INSTRUCTION_FORMAT22c_FIELD=85;
    public static final int END_FIELD_DIRECTIVE=9;
    public static final int ACCESS_SPEC=61;
    public static final int I_IMPLEMENTS=145;
    public static final int COLON=136;
    public static final int I_STATEMENT_FORMAT23x=214;
    public static final int INSTRUCTION_FORMAT35ms_METHOD=104;
    public static final int CHAR_LITERAL=58;
    public static final int INSTRUCTION_FORMAT22s=90;
    public static final int VOID_TYPE=126;
    public static final int INSTRUCTION_FORMAT22t=91;
    public static final int CLASS_DESCRIPTOR=127;
    public static final int ARROW=134;
    public static final int INSTRUCTION_FORMAT22x=92;
    public static final int INSTRUCTION_FORMAT12x=74;
    public static final int I_LOCAL=189;
    public static final int I_REGISTER_RANGE=234;
    public static final int INSTRUCTION_FORMAT32x=99;
    public static final int I_STATEMENT_FORMAT22b=208;
    public static final int ANNOTATION_DIRECTIVE=12;
    public static final int END_ANNOTATION_DIRECTIVE=13;
    public static final int I_SPARSE_SWITCH_TARGET_COUNT=176;
    public static final int DOUBLE_LITERAL=52;
    public static final int I_STATEMENT_FORMAT22s=211;
    public static final int VTABLE_INDEX=64;
    public static final int I_STATEMENT_FORMAT22t=212;
    public static final int I_STATEMENT_FORMAT32x=219;
    public static final int END_LOCAL_DIRECTIVE=31;
    public static final int BASE_FLOAT_OR_ID=41;
    public static final int BASE_INTEGER=37;
    public static final int I_STATEMENT_FORMAT22x=213;
    public static final int I_STATEMENT_FORMAT21c_STRING=204;
    public static final int INSTRUCTION_FORMAT12x_OR_ID=73;
    public static final int I_STATEMENT_FORMAT31c=216;
    public static final int I_STATEMENT_FORMAT31i=217;
    public static final int I_STATEMENT_FORMAT21h=205;
    public static final int I_ANNOTATIONS=160;
    public static final int PRIMITIVE_TYPE=125;
    public static final int CATCHALL_DIRECTIVE=26;
    public static final int I_STATEMENT_FORMAT21s=206;
    public static final int DOUBLE_LITERAL_OR_ID=50;
    public static final int I_STATEMENT_FORMAT31t=218;
    public static final int I_SOURCE=146;
    public static final int CLOSE_PAREN=141;
    public static final int I_SPARSE_SWITCH_DECLARATIONS=179;
    public static final int INSTRUCTION_FORMAT5rc_METHOD=117;
    public static final int VERIFICATION_ERROR_TYPE=62;
    public static final int ARRAY_DESCRIPTOR=128;
    public static final int INSTRUCTION_FORMAT3rc_METHOD_ODEX=106;
    public static final int I_ADDRESS=180;
    public static final int I_STATEMENT_FORMAT21t=207;
    public static final int I_STATEMENTS=194;
    public static final int INSTRUCTION_FORMAT31c=95;
    public static final int SUBANNOTATION_DIRECTIVE=10;
    public static final int I_STATEMENT_FORMAT41c_FIELD=225;
    public static final int INLINE_INDEX=63;
    public static final int LINE_COMMENT=67;
    public static final int I_PARAMETER=184;
    public static final int I_ARRAY_ELEMENTS=169;
    public static final int I_STATEMENT_FORMAT52c_FIELD=228;
    public static final int I_SPARSE_SWITCH_DECLARATION=178;
    public static final int I_STATEMENT_FORMAT52c_TYPE=227;
    public static final int INSTRUCTION_FORMAT5rc_METHOD_ODEX=118;
    public static final int INSTRUCTION_FORMAT30t=94;
    public static final int I_STATEMENT_FORMAT21c_TYPE=202;
    public static final int BOOL_LITERAL=53;
    public static final int I_STATEMENT_FORMAT20t=201;
    public static final int I_STATEMENT_FORMAT3rc_TYPE=223;
    public static final int BASE_FLOAT=42;
    public static final int METHOD_NAME=132;
    public static final int I_ANNOTATION_ELEMENT=162;
    public static final int PACKED_SWITCH_DIRECTIVE=21;
    public static final int PARAMETER_DIRECTIVE=28;
    public static final int ARRAY_DATA_DIRECTIVE=19;
    public static final int DECIMAL_EXPONENT=38;
    public static final int INTEGER_LITERAL=237;
    public static final int PROLOGUE_DIRECTIVE=33;
    public static final int INSTRUCTION_FORMAT52c_FIELD=115;
    public static final int I_SPARSE_SWITCH_KEYS=175;
    public static final int INSTRUCTION_FORMAT10x_ODEX=70;
    public static final int INSTRUCTION_FORMAT31t=98;
    public static final int I_RESTART_LOCAL=191;
    public static final int INSTRUCTION_FORMAT31i=97;
    public static final int METHOD_DIRECTIVE=15;
    public static final int I_ENCODED_FIELD=164;
    public static final int INSTRUCTION_FORMAT22c_TYPE=87;
    public static final int INSTRUCTION_FORMAT35c_METHOD=100;
    public static final int I_END_LOCAL=190;
    public static final int INSTRUCTION_FORMAT3rc_METHOD=105;
    public static final int BASE_ARRAY_DESCRIPTOR=123;
    public static final int INSTRUCTION_FORMAT22s_OR_ID=89;
    public static final int I_CATCHES=183;
    public static final int SUPER_DIRECTIVE=5;
    public static final int DOTDOT=133;
    public static final int END_SPARSE_SWITCH_DIRECTIVE=24;
    public static final int I_ENCODED_METHOD=165;
    public static final int INSTRUCTION_FORMAT21c_FIELD=77;
    public static final int INSTRUCTION_FORMAT35c_METHOD_ODEX=101;
    public static final int I_ARRAY_ELEMENT_SIZE=168;
    public static final int I_FIELDS=149;
    public static final int I_STATEMENT_FORMAT20bc=200;
    public static final int I_LABELS=158;
    public static final int ESCAPE_SEQUENCE=43;
    public static final int I_STATEMENT_FORMAT35c_TYPE=221;
    public static final int BYTE_LITERAL=48;
    public static final int COMMA=137;
    public static final int I_CLASS_DEF=143;
    public static final int EQUAL=135;
    public static final int PARAM_LIST_OR_ID=129;
    public static final int I_FIELD=150;
    public static final int I_STATEMENT_PACKED_SWITCH=232;
    public static final int INSTRUCTION_FORMAT5rc_TYPE=119;
    public static final int I_STATEMENT_FORMAT22c_FIELD=209;
    public static final int FIELD_OFFSET=65;
    public static final int I_STATEMENT_FORMAT41c_TYPE=224;
    public static final int FIELD_DIRECTIVE=8;
    public static final int INSTRUCTION_FORMAT3rc_TYPE=107;
    public static final int INSTRUCTION_FORMAT21c_FIELD_ODEX=78;
    public static final int I_STATEMENT_FORMAT10x=196;
    public static final int I_LABEL=159;
    public static final int I_STATEMENT_ARRAY_DATA=231;
    public static final int END_METHOD_DIRECTIVE=16;
    public static final int I_STATEMENT_FORMAT10t=195;
    public static final int I_PROLOGUE=192;
    public static final int I_ENCODED_ENUM=166;
    public static final int I_PACKED_SWITCH_DECLARATIONS=174;
    public static final int I_STATEMENT_FORMAT30t=215;
    public static final int I_FIELD_TYPE=151;
    public static final int INSTRUCTION_FORMAT52c_TYPE=114;
    public static final int FLOAT_LITERAL=51;
    public static final int INSTRUCTION_FORMAT21c_STRING=79;
    public static final int SIMPLE_NAME=131;
    public static final int PARAM_LIST=130;
    public static final int I_PACKED_SWITCH_TARGETS=172;
    public static final int BASE_CLASS_DESCRIPTOR=122;
    public static final int LINE_DIRECTIVE=27;
    public static final int INSTRUCTION_FORMAT22cs_FIELD=88;
    public static final int LABEL=236;
    public static final int BASE_TYPE=124;
    public static final int I_STATEMENT_FORMAT3rc_METHOD=222;
    public static final int HEX_DIGITS=40;
    public static final int I_STATEMENT_FORMAT5rc_TYPE=230;
    public static final int INSTRUCTION_FORMAT22c_FIELD_ODEX=86;
    public static final int INSTRUCTION_FORMAT3rms_METHOD=109;
    public static final int OPEN_BRACE=138;
    public static final int I_STATEMENT_FORMAT22c_TYPE=210;

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

    public String[] getTokenNames() { return smaliIdeaParser.tokenNames; }
    public String getGrammarFileName() { return "smaliIdeaParser.g"; }


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



    // $ANTLR start "smali_file"
    // smaliIdeaParser.g:134:1: smali_file : ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation )+ EOF ;
    public final void smali_file() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:137:2: ( ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation )+ EOF )
            // smaliIdeaParser.g:138:2: ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation )+ EOF
            {
            // smaliIdeaParser.g:138:2: ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation )+
            int cnt1=0;
            loop1:
            do {
                int alt1=8;
                switch ( input.LA(1) ) {
                case CLASS_DIRECTIVE:
                    {
                    alt1=1;
                    }
                    break;
                case SUPER_DIRECTIVE:
                    {
                    alt1=2;
                    }
                    break;
                case IMPLEMENTS_DIRECTIVE:
                    {
                    alt1=3;
                    }
                    break;
                case SOURCE_DIRECTIVE:
                    {
                    alt1=4;
                    }
                    break;
                case METHOD_DIRECTIVE:
                    {
                    alt1=5;
                    }
                    break;
                case FIELD_DIRECTIVE:
                    {
                    alt1=6;
                    }
                    break;
                case ANNOTATION_DIRECTIVE:
                    {
                    alt1=7;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // smaliIdeaParser.g:138:3: class_spec
            	    {
            	    pushFollow(FOLLOW_class_spec_in_smali_file54);
            	    class_spec();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // smaliIdeaParser.g:139:7: super_spec
            	    {
            	    pushFollow(FOLLOW_super_spec_in_smali_file62);
            	    super_spec();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // smaliIdeaParser.g:140:7: implements_spec
            	    {
            	    pushFollow(FOLLOW_implements_spec_in_smali_file70);
            	    implements_spec();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // smaliIdeaParser.g:141:7: source_spec
            	    {
            	    pushFollow(FOLLOW_source_spec_in_smali_file78);
            	    source_spec();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // smaliIdeaParser.g:142:7: method
            	    {
            	    pushFollow(FOLLOW_method_in_smali_file86);
            	    method();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // smaliIdeaParser.g:143:7: field
            	    {
            	    pushFollow(FOLLOW_field_in_smali_file94);
            	    field();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // smaliIdeaParser.g:144:7: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_smali_file102);
            	    annotation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_smali_file107); 

            }

             marker.done(SmaliElementTypes.SMALI_FILE); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "smali_file"



    // $ANTLR start "class_spec"
    // smaliIdeaParser.g:148:1: class_spec : CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR ;
    public final void class_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:151:2: ( CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:151:4: CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR
            {
            match(input,CLASS_DIRECTIVE,FOLLOW_CLASS_DIRECTIVE_in_class_spec141); 

            pushFollow(FOLLOW_access_list_in_class_spec143);
            access_list();

            state._fsp--;


            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_class_spec145); 

            }

             marker.done(SmaliElementTypes.CLASS_SPEC); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "class_spec"



    // $ANTLR start "super_spec"
    // smaliIdeaParser.g:154:1: super_spec : SUPER_DIRECTIVE CLASS_DESCRIPTOR ;
    public final void super_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:157:2: ( SUPER_DIRECTIVE CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:157:4: SUPER_DIRECTIVE CLASS_DESCRIPTOR
            {
            match(input,SUPER_DIRECTIVE,FOLLOW_SUPER_DIRECTIVE_in_super_spec179); 

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_super_spec181); 

            }

             marker.done(SmaliElementTypes.SUPER_SPEC); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "super_spec"



    // $ANTLR start "implements_spec"
    // smaliIdeaParser.g:160:1: implements_spec : IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR ;
    public final void implements_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:163:2: ( IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:163:4: IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR
            {
            match(input,IMPLEMENTS_DIRECTIVE,FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec215); 

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_implements_spec217); 

            }

             marker.done(SmaliElementTypes.IMPLEMENTS_SPEC); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "implements_spec"



    // $ANTLR start "source_spec"
    // smaliIdeaParser.g:166:1: source_spec : SOURCE_DIRECTIVE STRING_LITERAL ;
    public final void source_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:169:2: ( SOURCE_DIRECTIVE STRING_LITERAL )
            // smaliIdeaParser.g:169:4: SOURCE_DIRECTIVE STRING_LITERAL
            {
            match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_spec251); 

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_spec253); 

            }

             marker.done(SmaliElementTypes.SOURCE_SPEC); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "source_spec"



    // $ANTLR start "access_list"
    // smaliIdeaParser.g:172:1: access_list : ( ACCESS_SPEC )* ;
    public final void access_list() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:175:2: ( ( ACCESS_SPEC )* )
            // smaliIdeaParser.g:175:4: ( ACCESS_SPEC )*
            {
            // smaliIdeaParser.g:175:4: ( ACCESS_SPEC )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ACCESS_SPEC) ) {
                    int LA2_2 = input.LA(2);

                    if ( ((LA2_2 >= POSITIVE_INTEGER_LITERAL && LA2_2 <= NEGATIVE_INTEGER_LITERAL)||(LA2_2 >= FLOAT_LITERAL_OR_ID && LA2_2 <= DOUBLE_LITERAL_OR_ID)||(LA2_2 >= BOOL_LITERAL && LA2_2 <= NULL_LITERAL)||(LA2_2 >= REGISTER && LA2_2 <= VERIFICATION_ERROR_TYPE)||(LA2_2 >= INSTRUCTION_FORMAT10t && LA2_2 <= INSTRUCTION_FORMAT10x_ODEX)||(LA2_2 >= INSTRUCTION_FORMAT11x && LA2_2 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA2_2 >= INSTRUCTION_FORMAT21c_FIELD && LA2_2 <= INSTRUCTION_FORMAT21c_TYPE)||LA2_2==INSTRUCTION_FORMAT21t||(LA2_2 >= INSTRUCTION_FORMAT22c_FIELD && LA2_2 <= INSTRUCTION_FORMAT22s_OR_ID)||LA2_2==INSTRUCTION_FORMAT22t||LA2_2==INSTRUCTION_FORMAT23x||LA2_2==INSTRUCTION_FORMAT31i_OR_ID||LA2_2==INSTRUCTION_FORMAT31t||(LA2_2 >= INSTRUCTION_FORMAT35c_METHOD && LA2_2 <= INSTRUCTION_FORMAT35ms_METHOD)||LA2_2==INSTRUCTION_FORMAT51l||(LA2_2 >= PRIMITIVE_TYPE && LA2_2 <= CLASS_DESCRIPTOR)||LA2_2==PARAM_LIST_OR_ID||(LA2_2 >= SIMPLE_NAME && LA2_2 <= METHOD_NAME)||LA2_2==INTEGER_LITERAL) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // smaliIdeaParser.g:175:4: ACCESS_SPEC
            	    {
            	    match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_access_list287); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

             marker.done(SmaliElementTypes.ACCESS_LIST); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "access_list"



    // $ANTLR start "field"
    // smaliIdeaParser.g:183:1: field : FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE |) ) ;
    public final void field() throws RecognitionException {

        	    boolean markerDone = false;
        	    Marker marker = mark();
        	    boolean annotationsDone = false;
        	    Marker annotationsMarker = null;
            
        try {
            // smaliIdeaParser.g:190:2: ( FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE |) ) )
            // smaliIdeaParser.g:190:4: FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ({...}? annotation )* ( END_FIELD_DIRECTIVE |) )
            {
            match(input,FIELD_DIRECTIVE,FOLLOW_FIELD_DIRECTIVE_in_field313); 

            pushFollow(FOLLOW_access_list_in_field315);
            access_list();

            state._fsp--;


            pushFollow(FOLLOW_simple_name_in_field317);
            simple_name();

            state._fsp--;


            match(input,COLON,FOLLOW_COLON_in_field319); 

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_field321);
            nonvoid_type_descriptor();

            state._fsp--;


            // smaliIdeaParser.g:190:74: ( EQUAL literal )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // smaliIdeaParser.g:190:75: EQUAL literal
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_field324); 

                    pushFollow(FOLLOW_literal_in_field326);
                    literal();

                    state._fsp--;


                    }
                    break;

            }


            // smaliIdeaParser.g:191:3: ( ({...}? annotation )* ( END_FIELD_DIRECTIVE |) )
            // smaliIdeaParser.g:191:5: ({...}? annotation )* ( END_FIELD_DIRECTIVE |)
            {
            // smaliIdeaParser.g:191:5: ({...}? annotation )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ANNOTATION_DIRECTIVE) ) {
                    int LA4_9 = input.LA(2);

                    if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // smaliIdeaParser.g:191:6: {...}? annotation
            	    {
            	    if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
            	        throw new FailedPredicateException(input, "field", "input.LA(1) == ANNOTATION_DIRECTIVE");
            	    }

            	     annotationsMarker = mark(); 

            	    pushFollow(FOLLOW_annotation_in_field339);
            	    annotation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // smaliIdeaParser.g:193:7: ( END_FIELD_DIRECTIVE |)
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==END_FIELD_DIRECTIVE) ) {
                alt5=1;
            }
            else if ( (LA5_0==EOF||(LA5_0 >= CLASS_DIRECTIVE && LA5_0 <= FIELD_DIRECTIVE)||LA5_0==ANNOTATION_DIRECTIVE||LA5_0==METHOD_DIRECTIVE) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // smaliIdeaParser.g:193:11: END_FIELD_DIRECTIVE
                    {
                    annotationsMarker.done(SmaliElementTypes.FIELD_ANNOTATIONS); annotationsDone = true;

                    match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field366); 

                     marker.done(SmaliElementTypes.FIELD); markerDone = true;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:196:23: 
                    {
                     marker.doneBefore(SmaliElementTypes.FIELD, annotationsMarker); annotationsMarker.done(SmaliElementTypes.CLASS_ANNOTATIONS); 

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException ex) {

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

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "field"



    // $ANTLR start "method"
    // smaliIdeaParser.g:217:1: method : METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE ;
    public final void method() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:220:2: ( METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE )
            // smaliIdeaParser.g:220:4: METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE
            {
            match(input,METHOD_DIRECTIVE,FOLLOW_METHOD_DIRECTIVE_in_method439); 

            pushFollow(FOLLOW_access_list_in_method441);
            access_list();

            state._fsp--;


            pushFollow(FOLLOW_method_name_in_method443);
            method_name();

            state._fsp--;


            pushFollow(FOLLOW_method_prototype_in_method445);
            method_prototype();

            state._fsp--;


            pushFollow(FOLLOW_statements_and_directives_in_method447);
            statements_and_directives();

            state._fsp--;


            match(input,END_METHOD_DIRECTIVE,FOLLOW_END_METHOD_DIRECTIVE_in_method449); 

            }

             marker.done(SmaliElementTypes.METHOD); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "method"



    // $ANTLR start "statements_and_directives"
    // smaliIdeaParser.g:223:1: statements_and_directives : ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )* ;
    public final void statements_and_directives() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:226:2: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )* )
            // smaliIdeaParser.g:226:4: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )*
            {
            // smaliIdeaParser.g:226:4: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )*
            loop6:
            do {
                int alt6=9;
                switch ( input.LA(1) ) {
                case ARRAY_DATA_DIRECTIVE:
                case PACKED_SWITCH_DIRECTIVE:
                case SPARSE_SWITCH_DIRECTIVE:
                case INSTRUCTION_FORMAT10t:
                case INSTRUCTION_FORMAT10x:
                case INSTRUCTION_FORMAT10x_ODEX:
                case INSTRUCTION_FORMAT11n:
                case INSTRUCTION_FORMAT11x:
                case INSTRUCTION_FORMAT12x_OR_ID:
                case INSTRUCTION_FORMAT12x:
                case INSTRUCTION_FORMAT20bc:
                case INSTRUCTION_FORMAT20t:
                case INSTRUCTION_FORMAT21c_FIELD:
                case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                case INSTRUCTION_FORMAT21c_STRING:
                case INSTRUCTION_FORMAT21c_TYPE:
                case INSTRUCTION_FORMAT21h:
                case INSTRUCTION_FORMAT21s:
                case INSTRUCTION_FORMAT21t:
                case INSTRUCTION_FORMAT22b:
                case INSTRUCTION_FORMAT22c_FIELD:
                case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                case INSTRUCTION_FORMAT22c_TYPE:
                case INSTRUCTION_FORMAT22cs_FIELD:
                case INSTRUCTION_FORMAT22s_OR_ID:
                case INSTRUCTION_FORMAT22s:
                case INSTRUCTION_FORMAT22t:
                case INSTRUCTION_FORMAT22x:
                case INSTRUCTION_FORMAT23x:
                case INSTRUCTION_FORMAT30t:
                case INSTRUCTION_FORMAT31c:
                case INSTRUCTION_FORMAT31i_OR_ID:
                case INSTRUCTION_FORMAT31i:
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
                case INSTRUCTION_FORMAT41c_TYPE:
                case INSTRUCTION_FORMAT41c_FIELD:
                case INSTRUCTION_FORMAT41c_FIELD_ODEX:
                case INSTRUCTION_FORMAT51l:
                case INSTRUCTION_FORMAT52c_TYPE:
                case INSTRUCTION_FORMAT52c_FIELD:
                case INSTRUCTION_FORMAT52c_FIELD_ODEX:
                case INSTRUCTION_FORMAT5rc_METHOD:
                case INSTRUCTION_FORMAT5rc_METHOD_ODEX:
                case INSTRUCTION_FORMAT5rc_TYPE:
                    {
                    alt6=1;
                    }
                    break;
                case REGISTERS_DIRECTIVE:
                case LOCALS_DIRECTIVE:
                    {
                    alt6=2;
                    }
                    break;
                case COLON:
                    {
                    alt6=3;
                    }
                    break;
                case CATCH_DIRECTIVE:
                    {
                    alt6=4;
                    }
                    break;
                case CATCHALL_DIRECTIVE:
                    {
                    alt6=5;
                    }
                    break;
                case PARAMETER_DIRECTIVE:
                    {
                    alt6=6;
                    }
                    break;
                case SOURCE_DIRECTIVE:
                case LINE_DIRECTIVE:
                case LOCAL_DIRECTIVE:
                case END_LOCAL_DIRECTIVE:
                case RESTART_LOCAL_DIRECTIVE:
                case PROLOGUE_DIRECTIVE:
                case EPILOGUE_DIRECTIVE:
                    {
                    alt6=7;
                    }
                    break;
                case ANNOTATION_DIRECTIVE:
                    {
                    alt6=8;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // smaliIdeaParser.g:226:6: instruction
            	    {
            	    pushFollow(FOLLOW_instruction_in_statements_and_directives485);
            	    instruction();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // smaliIdeaParser.g:227:5: registers_directive
            	    {
            	    pushFollow(FOLLOW_registers_directive_in_statements_and_directives491);
            	    registers_directive();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // smaliIdeaParser.g:228:5: label
            	    {
            	    pushFollow(FOLLOW_label_in_statements_and_directives497);
            	    label();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // smaliIdeaParser.g:229:5: catch_directive
            	    {
            	    pushFollow(FOLLOW_catch_directive_in_statements_and_directives503);
            	    catch_directive();

            	    state._fsp--;


            	    }
            	    break;
            	case 5 :
            	    // smaliIdeaParser.g:230:5: catchall_directive
            	    {
            	    pushFollow(FOLLOW_catchall_directive_in_statements_and_directives509);
            	    catchall_directive();

            	    state._fsp--;


            	    }
            	    break;
            	case 6 :
            	    // smaliIdeaParser.g:231:5: parameter_directive
            	    {
            	    pushFollow(FOLLOW_parameter_directive_in_statements_and_directives515);
            	    parameter_directive();

            	    state._fsp--;


            	    }
            	    break;
            	case 7 :
            	    // smaliIdeaParser.g:232:5: ordered_debug_directive
            	    {
            	    pushFollow(FOLLOW_ordered_debug_directive_in_statements_and_directives521);
            	    ordered_debug_directive();

            	    state._fsp--;


            	    }
            	    break;
            	case 8 :
            	    // smaliIdeaParser.g:233:5: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_statements_and_directives527);
            	    annotation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

             marker.done(SmaliElementTypes.METHOD_BODY); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "statements_and_directives"



    // $ANTLR start "registers_directive"
    // smaliIdeaParser.g:237:1: registers_directive : ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal ) ;
    public final void registers_directive() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:240:2: ( ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal ) )
            // smaliIdeaParser.g:240:4: ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal )
            {
            // smaliIdeaParser.g:240:4: ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==REGISTERS_DIRECTIVE) ) {
                alt7=1;
            }
            else if ( (LA7_0==LOCALS_DIRECTIVE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // smaliIdeaParser.g:241:4: REGISTERS_DIRECTIVE integral_literal
                    {
                    match(input,REGISTERS_DIRECTIVE,FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive571); 

                    pushFollow(FOLLOW_integral_literal_in_registers_directive573);
                    integral_literal();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:242:5: LOCALS_DIRECTIVE integral_literal
                    {
                    match(input,LOCALS_DIRECTIVE,FOLLOW_LOCALS_DIRECTIVE_in_registers_directive579); 

                    pushFollow(FOLLOW_integral_literal_in_registers_directive581);
                    integral_literal();

                    state._fsp--;


                    }
                    break;

            }


            }

             marker.done(SmaliElementTypes.REGISTERS_SPEC); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "registers_directive"



    // $ANTLR start "simple_name"
    // smaliIdeaParser.g:248:1: simple_name : ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l );
    public final void simple_name() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:251:2: ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= POSITIVE_INTEGER_LITERAL && input.LA(1) <= NEGATIVE_INTEGER_LITERAL)||(input.LA(1) >= FLOAT_LITERAL_OR_ID && input.LA(1) <= DOUBLE_LITERAL_OR_ID)||(input.LA(1) >= BOOL_LITERAL && input.LA(1) <= NULL_LITERAL)||(input.LA(1) >= REGISTER && input.LA(1) <= VERIFICATION_ERROR_TYPE)||(input.LA(1) >= INSTRUCTION_FORMAT10t && input.LA(1) <= INSTRUCTION_FORMAT10x_ODEX)||(input.LA(1) >= INSTRUCTION_FORMAT11x && input.LA(1) <= INSTRUCTION_FORMAT12x_OR_ID)||(input.LA(1) >= INSTRUCTION_FORMAT21c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT21c_TYPE)||input.LA(1)==INSTRUCTION_FORMAT21t||(input.LA(1) >= INSTRUCTION_FORMAT22c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT22s_OR_ID)||input.LA(1)==INSTRUCTION_FORMAT22t||input.LA(1)==INSTRUCTION_FORMAT23x||input.LA(1)==INSTRUCTION_FORMAT31i_OR_ID||input.LA(1)==INSTRUCTION_FORMAT31t||(input.LA(1) >= INSTRUCTION_FORMAT35c_METHOD && input.LA(1) <= INSTRUCTION_FORMAT35ms_METHOD)||input.LA(1)==INSTRUCTION_FORMAT51l||(input.LA(1) >= PRIMITIVE_TYPE && input.LA(1) <= VOID_TYPE)||input.LA(1)==PARAM_LIST_OR_ID||input.LA(1)==SIMPLE_NAME||input.LA(1)==INTEGER_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

             marker.done(SmaliElementTypes.SIMPLE_NAME); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "simple_name"



    // $ANTLR start "method_name"
    // smaliIdeaParser.g:293:1: method_name : ( simple_name | METHOD_NAME );
    public final void method_name() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:296:2: ( simple_name | METHOD_NAME )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= POSITIVE_INTEGER_LITERAL && LA8_0 <= NEGATIVE_INTEGER_LITERAL)||(LA8_0 >= FLOAT_LITERAL_OR_ID && LA8_0 <= DOUBLE_LITERAL_OR_ID)||(LA8_0 >= BOOL_LITERAL && LA8_0 <= NULL_LITERAL)||(LA8_0 >= REGISTER && LA8_0 <= VERIFICATION_ERROR_TYPE)||(LA8_0 >= INSTRUCTION_FORMAT10t && LA8_0 <= INSTRUCTION_FORMAT10x_ODEX)||(LA8_0 >= INSTRUCTION_FORMAT11x && LA8_0 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA8_0 >= INSTRUCTION_FORMAT21c_FIELD && LA8_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA8_0==INSTRUCTION_FORMAT21t||(LA8_0 >= INSTRUCTION_FORMAT22c_FIELD && LA8_0 <= INSTRUCTION_FORMAT22s_OR_ID)||LA8_0==INSTRUCTION_FORMAT22t||LA8_0==INSTRUCTION_FORMAT23x||LA8_0==INSTRUCTION_FORMAT31i_OR_ID||LA8_0==INSTRUCTION_FORMAT31t||(LA8_0 >= INSTRUCTION_FORMAT35c_METHOD && LA8_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA8_0==INSTRUCTION_FORMAT51l||(LA8_0 >= PRIMITIVE_TYPE && LA8_0 <= VOID_TYPE)||LA8_0==PARAM_LIST_OR_ID||LA8_0==SIMPLE_NAME||LA8_0==INTEGER_LITERAL) ) {
                alt8=1;
            }
            else if ( (LA8_0==METHOD_NAME) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // smaliIdeaParser.g:296:4: simple_name
                    {
                    pushFollow(FOLLOW_simple_name_in_method_name852);
                    simple_name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:297:4: METHOD_NAME
                    {
                    match(input,METHOD_NAME,FOLLOW_METHOD_NAME_in_method_name857); 

                    }
                    break;

            }
             marker.done(SmaliElementTypes.METHOD_NAME); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "method_name"



    // $ANTLR start "method_prototype"
    // smaliIdeaParser.g:300:1: method_prototype : OPEN_PAREN param_list CLOSE_PAREN type_descriptor ;
    public final void method_prototype() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:303:2: ( OPEN_PAREN param_list CLOSE_PAREN type_descriptor )
            // smaliIdeaParser.g:303:4: OPEN_PAREN param_list CLOSE_PAREN type_descriptor
            {
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_method_prototype891); 

            pushFollow(FOLLOW_param_list_in_method_prototype893);
            param_list();

            state._fsp--;


            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_method_prototype895); 

            pushFollow(FOLLOW_type_descriptor_in_method_prototype897);
            type_descriptor();

            state._fsp--;


            }

             marker.done(SmaliElementTypes.METHOD_PROTOTYPE); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "method_prototype"



    // $ANTLR start "param_list"
    // smaliIdeaParser.g:306:1: param_list : ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* );
    public final void param_list() throws RecognitionException {
        try {
            // smaliIdeaParser.g:307:2: ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* )
            int alt10=3;
            switch ( input.LA(1) ) {
            case PARAM_LIST:
                {
                alt10=1;
                }
                break;
            case PARAM_LIST_OR_ID:
                {
                alt10=2;
                }
                break;
            case PRIMITIVE_TYPE:
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
            case CLOSE_PAREN:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // smaliIdeaParser.g:307:4: PARAM_LIST
                    {
                    match(input,PARAM_LIST,FOLLOW_PARAM_LIST_in_param_list913); 

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:308:4: PARAM_LIST_OR_ID
                    {
                    match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_param_list918); 

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:309:4: ( nonvoid_type_descriptor )*
                    {
                    // smaliIdeaParser.g:309:4: ( nonvoid_type_descriptor )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==PRIMITIVE_TYPE||(LA9_0 >= CLASS_DESCRIPTOR && LA9_0 <= ARRAY_DESCRIPTOR)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // smaliIdeaParser.g:309:4: nonvoid_type_descriptor
                    	    {
                    	    pushFollow(FOLLOW_nonvoid_type_descriptor_in_param_list923);
                    	    nonvoid_type_descriptor();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


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
        return ;
    }
    // $ANTLR end "param_list"



    // $ANTLR start "type_descriptor"
    // smaliIdeaParser.g:311:1: type_descriptor : ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:312:2: ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= PRIMITIVE_TYPE && input.LA(1) <= ARRAY_DESCRIPTOR) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "type_descriptor"



    // $ANTLR start "nonvoid_type_descriptor"
    // smaliIdeaParser.g:317:1: nonvoid_type_descriptor : ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void nonvoid_type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:318:2: ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==PRIMITIVE_TYPE||(input.LA(1) >= CLASS_DESCRIPTOR && input.LA(1) <= ARRAY_DESCRIPTOR) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "nonvoid_type_descriptor"



    // $ANTLR start "reference_type_descriptor"
    // smaliIdeaParser.g:322:1: reference_type_descriptor : ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void reference_type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:323:2: ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= CLASS_DESCRIPTOR && input.LA(1) <= ARRAY_DESCRIPTOR) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "reference_type_descriptor"



    // $ANTLR start "integer_literal"
    // smaliIdeaParser.g:326:1: integer_literal : ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL );
    public final void integer_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:327:2: ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= POSITIVE_INTEGER_LITERAL && input.LA(1) <= NEGATIVE_INTEGER_LITERAL)||input.LA(1)==INTEGER_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "integer_literal"



    // $ANTLR start "float_literal"
    // smaliIdeaParser.g:331:1: float_literal : ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL );
    public final void float_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:332:2: ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==FLOAT_LITERAL_OR_ID||input.LA(1)==FLOAT_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "float_literal"



    // $ANTLR start "double_literal"
    // smaliIdeaParser.g:335:1: double_literal : ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL );
    public final void double_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:336:2: ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==DOUBLE_LITERAL_OR_ID||input.LA(1)==DOUBLE_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "double_literal"



    // $ANTLR start "literal"
    // smaliIdeaParser.g:339:1: literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal );
    public final void literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:340:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal )
            int alt11=14;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt11=1;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt11=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt11=3;
                }
                break;
            case BYTE_LITERAL:
                {
                alt11=4;
                }
                break;
            case FLOAT_LITERAL_OR_ID:
            case FLOAT_LITERAL:
                {
                alt11=5;
                }
                break;
            case DOUBLE_LITERAL_OR_ID:
            case DOUBLE_LITERAL:
                {
                alt11=6;
                }
                break;
            case CHAR_LITERAL:
                {
                alt11=7;
                }
                break;
            case STRING_LITERAL:
                {
                alt11=8;
                }
                break;
            case BOOL_LITERAL:
                {
                alt11=9;
                }
                break;
            case NULL_LITERAL:
                {
                alt11=10;
                }
                break;
            case OPEN_BRACE:
                {
                alt11=11;
                }
                break;
            case SUBANNOTATION_DIRECTIVE:
                {
                alt11=12;
                }
                break;
            case PRIMITIVE_TYPE:
            case VOID_TYPE:
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
                {
                alt11=13;
                }
                break;
            case ENUM_DIRECTIVE:
                {
                alt11=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // smaliIdeaParser.g:340:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_literal1039); 

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:341:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_literal1044);
                    integer_literal();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:342:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_literal1049); 

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:343:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_literal1054); 

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:344:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_literal1059);
                    float_literal();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:345:4: double_literal
                    {
                    pushFollow(FOLLOW_double_literal_in_literal1064);
                    double_literal();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:346:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal1069); 

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:347:4: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal1074); 

                    }
                    break;
                case 9 :
                    // smaliIdeaParser.g:348:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_literal1079); 

                    }
                    break;
                case 10 :
                    // smaliIdeaParser.g:349:4: NULL_LITERAL
                    {
                    match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_literal1084); 

                    }
                    break;
                case 11 :
                    // smaliIdeaParser.g:350:4: array_literal
                    {
                    pushFollow(FOLLOW_array_literal_in_literal1089);
                    array_literal();

                    state._fsp--;


                    }
                    break;
                case 12 :
                    // smaliIdeaParser.g:351:4: subannotation
                    {
                    pushFollow(FOLLOW_subannotation_in_literal1094);
                    subannotation();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // smaliIdeaParser.g:352:4: type_field_method_literal
                    {
                    pushFollow(FOLLOW_type_field_method_literal_in_literal1099);
                    type_field_method_literal();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // smaliIdeaParser.g:353:4: enum_literal
                    {
                    pushFollow(FOLLOW_enum_literal_in_literal1104);
                    enum_literal();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "literal"



    // $ANTLR start "integral_literal"
    // smaliIdeaParser.g:355:1: integral_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL );
    public final void integral_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:356:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL )
            int alt12=5;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt12=1;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt12=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt12=3;
                }
                break;
            case CHAR_LITERAL:
                {
                alt12=4;
                }
                break;
            case BYTE_LITERAL:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // smaliIdeaParser.g:356:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_integral_literal1113); 

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:357:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_integral_literal1118);
                    integer_literal();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:358:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_integral_literal1123); 

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:359:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_integral_literal1128); 

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:360:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_integral_literal1133); 

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
        return ;
    }
    // $ANTLR end "integral_literal"



    // $ANTLR start "fixed_32bit_literal"
    // smaliIdeaParser.g:362:1: fixed_32bit_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL );
    public final void fixed_32bit_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:363:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL )
            int alt13=7;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt13=1;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt13=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt13=3;
                }
                break;
            case BYTE_LITERAL:
                {
                alt13=4;
                }
                break;
            case FLOAT_LITERAL_OR_ID:
            case FLOAT_LITERAL:
                {
                alt13=5;
                }
                break;
            case CHAR_LITERAL:
                {
                alt13=6;
                }
                break;
            case BOOL_LITERAL:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // smaliIdeaParser.g:363:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1142); 

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:364:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_fixed_32bit_literal1147);
                    integer_literal();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:365:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1152); 

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:366:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1157); 

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:367:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_fixed_32bit_literal1162);
                    float_literal();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:368:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1167); 

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:369:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1172); 

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
        return ;
    }
    // $ANTLR end "fixed_32bit_literal"



    // $ANTLR start "fixed_literal"
    // smaliIdeaParser.g:371:1: fixed_literal : ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL );
    public final void fixed_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:372:2: ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL )
            int alt14=8;
            switch ( input.LA(1) ) {
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt14=1;
                }
                break;
            case LONG_LITERAL:
                {
                alt14=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt14=3;
                }
                break;
            case BYTE_LITERAL:
                {
                alt14=4;
                }
                break;
            case FLOAT_LITERAL_OR_ID:
            case FLOAT_LITERAL:
                {
                alt14=5;
                }
                break;
            case DOUBLE_LITERAL_OR_ID:
            case DOUBLE_LITERAL:
                {
                alt14=6;
                }
                break;
            case CHAR_LITERAL:
                {
                alt14=7;
                }
                break;
            case BOOL_LITERAL:
                {
                alt14=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // smaliIdeaParser.g:372:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_fixed_literal1181);
                    integer_literal();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:373:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_literal1186); 

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:374:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_literal1191); 

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:375:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_literal1196); 

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:376:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_fixed_literal1201);
                    float_literal();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:377:4: double_literal
                    {
                    pushFollow(FOLLOW_double_literal_in_fixed_literal1206);
                    double_literal();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:378:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_literal1211); 

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:379:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_literal1216); 

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
        return ;
    }
    // $ANTLR end "fixed_literal"



    // $ANTLR start "array_literal"
    // smaliIdeaParser.g:381:1: array_literal : OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE ;
    public final void array_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:382:2: ( OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE )
            // smaliIdeaParser.g:382:4: OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE
            {
            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_array_literal1225); 

            // smaliIdeaParser.g:382:15: ( literal ( COMMA literal )* |)
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==SUBANNOTATION_DIRECTIVE||LA16_0==ENUM_DIRECTIVE||(LA16_0 >= POSITIVE_INTEGER_LITERAL && LA16_0 <= NULL_LITERAL)||LA16_0==STRING_LITERAL||LA16_0==CHAR_LITERAL||(LA16_0 >= PRIMITIVE_TYPE && LA16_0 <= ARRAY_DESCRIPTOR)||LA16_0==OPEN_BRACE||LA16_0==INTEGER_LITERAL) ) {
                alt16=1;
            }
            else if ( (LA16_0==CLOSE_BRACE) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // smaliIdeaParser.g:382:16: literal ( COMMA literal )*
                    {
                    pushFollow(FOLLOW_literal_in_array_literal1228);
                    literal();

                    state._fsp--;


                    // smaliIdeaParser.g:382:24: ( COMMA literal )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // smaliIdeaParser.g:382:25: COMMA literal
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_array_literal1231); 

                    	    pushFollow(FOLLOW_literal_in_array_literal1233);
                    	    literal();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:382:43: 
                    {
                    }
                    break;

            }


            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_array_literal1241); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "array_literal"



    // $ANTLR start "annotation_element"
    // smaliIdeaParser.g:384:1: annotation_element : simple_name EQUAL literal ;
    public final void annotation_element() throws RecognitionException {
        try {
            // smaliIdeaParser.g:385:2: ( simple_name EQUAL literal )
            // smaliIdeaParser.g:385:4: simple_name EQUAL literal
            {
            pushFollow(FOLLOW_simple_name_in_annotation_element1250);
            simple_name();

            state._fsp--;


            match(input,EQUAL,FOLLOW_EQUAL_in_annotation_element1252); 

            pushFollow(FOLLOW_literal_in_annotation_element1254);
            literal();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "annotation_element"



    // $ANTLR start "annotation"
    // smaliIdeaParser.g:388:1: annotation : ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE ;
    public final void annotation() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:391:2: ( ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE )
            // smaliIdeaParser.g:391:4: ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE
            {
            match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1282); 

            match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_annotation1284); 

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_annotation1286); 

            // smaliIdeaParser.g:392:3: ( annotation_element )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0 >= POSITIVE_INTEGER_LITERAL && LA17_0 <= NEGATIVE_INTEGER_LITERAL)||(LA17_0 >= FLOAT_LITERAL_OR_ID && LA17_0 <= DOUBLE_LITERAL_OR_ID)||(LA17_0 >= BOOL_LITERAL && LA17_0 <= NULL_LITERAL)||(LA17_0 >= REGISTER && LA17_0 <= VERIFICATION_ERROR_TYPE)||(LA17_0 >= INSTRUCTION_FORMAT10t && LA17_0 <= INSTRUCTION_FORMAT10x_ODEX)||(LA17_0 >= INSTRUCTION_FORMAT11x && LA17_0 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA17_0 >= INSTRUCTION_FORMAT21c_FIELD && LA17_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA17_0==INSTRUCTION_FORMAT21t||(LA17_0 >= INSTRUCTION_FORMAT22c_FIELD && LA17_0 <= INSTRUCTION_FORMAT22s_OR_ID)||LA17_0==INSTRUCTION_FORMAT22t||LA17_0==INSTRUCTION_FORMAT23x||LA17_0==INSTRUCTION_FORMAT31i_OR_ID||LA17_0==INSTRUCTION_FORMAT31t||(LA17_0 >= INSTRUCTION_FORMAT35c_METHOD && LA17_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA17_0==INSTRUCTION_FORMAT51l||(LA17_0 >= PRIMITIVE_TYPE && LA17_0 <= VOID_TYPE)||LA17_0==PARAM_LIST_OR_ID||LA17_0==SIMPLE_NAME||LA17_0==INTEGER_LITERAL) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // smaliIdeaParser.g:392:3: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_annotation1290);
            	    annotation_element();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            match(input,END_ANNOTATION_DIRECTIVE,FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1293); 

            }

             marker.done(SmaliElementTypes.ANNOTATION); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "annotation"



    // $ANTLR start "subannotation"
    // smaliIdeaParser.g:395:1: subannotation : SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE ;
    public final void subannotation() throws RecognitionException {
        try {
            // smaliIdeaParser.g:396:2: ( SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE )
            // smaliIdeaParser.g:396:4: SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE
            {
            match(input,SUBANNOTATION_DIRECTIVE,FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1309); 

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_subannotation1311); 

            // smaliIdeaParser.g:396:45: ( annotation_element )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0 >= POSITIVE_INTEGER_LITERAL && LA18_0 <= NEGATIVE_INTEGER_LITERAL)||(LA18_0 >= FLOAT_LITERAL_OR_ID && LA18_0 <= DOUBLE_LITERAL_OR_ID)||(LA18_0 >= BOOL_LITERAL && LA18_0 <= NULL_LITERAL)||(LA18_0 >= REGISTER && LA18_0 <= VERIFICATION_ERROR_TYPE)||(LA18_0 >= INSTRUCTION_FORMAT10t && LA18_0 <= INSTRUCTION_FORMAT10x_ODEX)||(LA18_0 >= INSTRUCTION_FORMAT11x && LA18_0 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA18_0 >= INSTRUCTION_FORMAT21c_FIELD && LA18_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA18_0==INSTRUCTION_FORMAT21t||(LA18_0 >= INSTRUCTION_FORMAT22c_FIELD && LA18_0 <= INSTRUCTION_FORMAT22s_OR_ID)||LA18_0==INSTRUCTION_FORMAT22t||LA18_0==INSTRUCTION_FORMAT23x||LA18_0==INSTRUCTION_FORMAT31i_OR_ID||LA18_0==INSTRUCTION_FORMAT31t||(LA18_0 >= INSTRUCTION_FORMAT35c_METHOD && LA18_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA18_0==INSTRUCTION_FORMAT51l||(LA18_0 >= PRIMITIVE_TYPE && LA18_0 <= VOID_TYPE)||LA18_0==PARAM_LIST_OR_ID||LA18_0==SIMPLE_NAME||LA18_0==INTEGER_LITERAL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // smaliIdeaParser.g:396:45: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_subannotation1313);
            	    annotation_element();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            match(input,END_SUBANNOTATION_DIRECTIVE,FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1316); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "subannotation"



    // $ANTLR start "enum_literal"
    // smaliIdeaParser.g:398:1: enum_literal : ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor ;
    public final void enum_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:399:2: ( ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor )
            // smaliIdeaParser.g:399:4: ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor
            {
            match(input,ENUM_DIRECTIVE,FOLLOW_ENUM_DIRECTIVE_in_enum_literal1325); 

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1327);
            reference_type_descriptor();

            state._fsp--;


            match(input,ARROW,FOLLOW_ARROW_in_enum_literal1329); 

            pushFollow(FOLLOW_simple_name_in_enum_literal1331);
            simple_name();

            state._fsp--;


            match(input,COLON,FOLLOW_COLON_in_enum_literal1333); 

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1335);
            reference_type_descriptor();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "enum_literal"



    // $ANTLR start "type_field_method_literal"
    // smaliIdeaParser.g:401:1: type_field_method_literal : ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) ) | PRIMITIVE_TYPE | VOID_TYPE );
    public final void type_field_method_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:402:2: ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) ) | PRIMITIVE_TYPE | VOID_TYPE )
            int alt20=3;
            switch ( input.LA(1) ) {
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
                {
                alt20=1;
                }
                break;
            case PRIMITIVE_TYPE:
                {
                alt20=2;
                }
                break;
            case VOID_TYPE:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // smaliIdeaParser.g:402:4: reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) )
                    {
                    pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal1344);
                    reference_type_descriptor();

                    state._fsp--;


                    // smaliIdeaParser.g:403:3: ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) )
                    // smaliIdeaParser.g:403:5: ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
                    {
                    match(input,ARROW,FOLLOW_ARROW_in_type_field_method_literal1350); 

                    // smaliIdeaParser.g:404:4: ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0 >= POSITIVE_INTEGER_LITERAL && LA19_0 <= NEGATIVE_INTEGER_LITERAL)||(LA19_0 >= FLOAT_LITERAL_OR_ID && LA19_0 <= DOUBLE_LITERAL_OR_ID)||(LA19_0 >= BOOL_LITERAL && LA19_0 <= NULL_LITERAL)||(LA19_0 >= REGISTER && LA19_0 <= VERIFICATION_ERROR_TYPE)||(LA19_0 >= INSTRUCTION_FORMAT10t && LA19_0 <= INSTRUCTION_FORMAT10x_ODEX)||(LA19_0 >= INSTRUCTION_FORMAT11x && LA19_0 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA19_0 >= INSTRUCTION_FORMAT21c_FIELD && LA19_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA19_0==INSTRUCTION_FORMAT21t||(LA19_0 >= INSTRUCTION_FORMAT22c_FIELD && LA19_0 <= INSTRUCTION_FORMAT22s_OR_ID)||LA19_0==INSTRUCTION_FORMAT22t||LA19_0==INSTRUCTION_FORMAT23x||LA19_0==INSTRUCTION_FORMAT31i_OR_ID||LA19_0==INSTRUCTION_FORMAT31t||(LA19_0 >= INSTRUCTION_FORMAT35c_METHOD && LA19_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA19_0==INSTRUCTION_FORMAT51l||(LA19_0 >= PRIMITIVE_TYPE && LA19_0 <= VOID_TYPE)||LA19_0==PARAM_LIST_OR_ID||LA19_0==SIMPLE_NAME||LA19_0==INTEGER_LITERAL) ) {
                        int LA19_1 = input.LA(2);

                        if ( (LA19_1==COLON) ) {
                            alt19=1;
                        }
                        else if ( (LA19_1==OPEN_PAREN) ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 1, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA19_0==METHOD_NAME) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // smaliIdeaParser.g:404:6: simple_name COLON nonvoid_type_descriptor
                            {
                            pushFollow(FOLLOW_simple_name_in_type_field_method_literal1357);
                            simple_name();

                            state._fsp--;


                            match(input,COLON,FOLLOW_COLON_in_type_field_method_literal1359); 

                            pushFollow(FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1361);
                            nonvoid_type_descriptor();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // smaliIdeaParser.g:405:6: method_name method_prototype
                            {
                            pushFollow(FOLLOW_method_name_in_type_field_method_literal1368);
                            method_name();

                            state._fsp--;


                            pushFollow(FOLLOW_method_prototype_in_type_field_method_literal1370);
                            method_prototype();

                            state._fsp--;


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:408:4: PRIMITIVE_TYPE
                    {
                    match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal1384); 

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:409:4: VOID_TYPE
                    {
                    match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type_field_method_literal1389); 

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
        return ;
    }
    // $ANTLR end "type_field_method_literal"



    // $ANTLR start "fully_qualified_method"
    // smaliIdeaParser.g:411:1: fully_qualified_method : reference_type_descriptor ARROW method_name method_prototype ;
    public final void fully_qualified_method() throws RecognitionException {
        try {
            // smaliIdeaParser.g:412:2: ( reference_type_descriptor ARROW method_name method_prototype )
            // smaliIdeaParser.g:412:4: reference_type_descriptor ARROW method_name method_prototype
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_method1398);
            reference_type_descriptor();

            state._fsp--;


            match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_method1400); 

            pushFollow(FOLLOW_method_name_in_fully_qualified_method1402);
            method_name();

            state._fsp--;


            pushFollow(FOLLOW_method_prototype_in_fully_qualified_method1404);
            method_prototype();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fully_qualified_method"



    // $ANTLR start "fully_qualified_field"
    // smaliIdeaParser.g:414:1: fully_qualified_field : reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor ;
    public final void fully_qualified_field() throws RecognitionException {
        try {
            // smaliIdeaParser.g:415:2: ( reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor )
            // smaliIdeaParser.g:415:4: reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_field1413);
            reference_type_descriptor();

            state._fsp--;


            match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_field1415); 

            pushFollow(FOLLOW_simple_name_in_fully_qualified_field1417);
            simple_name();

            state._fsp--;


            match(input,COLON,FOLLOW_COLON_in_fully_qualified_field1419); 

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1421);
            nonvoid_type_descriptor();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "fully_qualified_field"



    // $ANTLR start "label"
    // smaliIdeaParser.g:417:1: label : COLON simple_name ;
    public final void label() throws RecognitionException {
        try {
            // smaliIdeaParser.g:418:2: ( COLON simple_name )
            // smaliIdeaParser.g:418:4: COLON simple_name
            {
            match(input,COLON,FOLLOW_COLON_in_label1430); 

            pushFollow(FOLLOW_simple_name_in_label1432);
            simple_name();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "label"



    // $ANTLR start "label_ref_or_offset"
    // smaliIdeaParser.g:420:1: label_ref_or_offset : ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL );
    public final void label_ref_or_offset() throws RecognitionException {
        try {
            // smaliIdeaParser.g:421:2: ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL )
            int alt21=3;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt21=1;
                }
                break;
            case OFFSET:
                {
                alt21=2;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // smaliIdeaParser.g:421:4: COLON simple_name
                    {
                    match(input,COLON,FOLLOW_COLON_in_label_ref_or_offset1441); 

                    pushFollow(FOLLOW_simple_name_in_label_ref_or_offset1443);
                    simple_name();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:422:4: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_label_ref_or_offset1448); 

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:423:4: NEGATIVE_INTEGER_LITERAL
                    {
                    match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1453); 

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
        return ;
    }
    // $ANTLR end "label_ref_or_offset"



    // $ANTLR start "register_list"
    // smaliIdeaParser.g:425:1: register_list : ( REGISTER ( COMMA REGISTER )* )? ;
    public final void register_list() throws RecognitionException {
        try {
            // smaliIdeaParser.g:426:2: ( ( REGISTER ( COMMA REGISTER )* )? )
            // smaliIdeaParser.g:426:4: ( REGISTER ( COMMA REGISTER )* )?
            {
            // smaliIdeaParser.g:426:4: ( REGISTER ( COMMA REGISTER )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==REGISTER) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // smaliIdeaParser.g:426:5: REGISTER ( COMMA REGISTER )*
                    {
                    match(input,REGISTER,FOLLOW_REGISTER_in_register_list1463); 

                    // smaliIdeaParser.g:426:14: ( COMMA REGISTER )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==COMMA) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // smaliIdeaParser.g:426:15: COMMA REGISTER
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_register_list1466); 

                    	    match(input,REGISTER,FOLLOW_REGISTER_in_register_list1468); 

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


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
        return ;
    }
    // $ANTLR end "register_list"



    // $ANTLR start "register_range"
    // smaliIdeaParser.g:428:1: register_range : ( REGISTER ( DOTDOT REGISTER )? )? ;
    public final void register_range() throws RecognitionException {
        try {
            // smaliIdeaParser.g:429:2: ( ( REGISTER ( DOTDOT REGISTER )? )? )
            // smaliIdeaParser.g:429:4: ( REGISTER ( DOTDOT REGISTER )? )?
            {
            // smaliIdeaParser.g:429:4: ( REGISTER ( DOTDOT REGISTER )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==REGISTER) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // smaliIdeaParser.g:429:5: REGISTER ( DOTDOT REGISTER )?
                    {
                    match(input,REGISTER,FOLLOW_REGISTER_in_register_range1482); 

                    // smaliIdeaParser.g:429:14: ( DOTDOT REGISTER )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==DOTDOT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // smaliIdeaParser.g:429:15: DOTDOT REGISTER
                            {
                            match(input,DOTDOT,FOLLOW_DOTDOT_in_register_range1485); 

                            match(input,REGISTER,FOLLOW_REGISTER_in_register_range1487); 

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
        return ;
    }
    // $ANTLR end "register_range"



    // $ANTLR start "verification_error_reference"
    // smaliIdeaParser.g:431:1: verification_error_reference : ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method );
    public final void verification_error_reference() throws RecognitionException {
        try {
            // smaliIdeaParser.g:432:2: ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CLASS_DESCRIPTOR) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==SOURCE_DIRECTIVE||LA26_1==ANNOTATION_DIRECTIVE||(LA26_1 >= END_METHOD_DIRECTIVE && LA26_1 <= ARRAY_DATA_DIRECTIVE)||LA26_1==PACKED_SWITCH_DIRECTIVE||LA26_1==SPARSE_SWITCH_DIRECTIVE||(LA26_1 >= CATCH_DIRECTIVE && LA26_1 <= PARAMETER_DIRECTIVE)||(LA26_1 >= LOCAL_DIRECTIVE && LA26_1 <= EPILOGUE_DIRECTIVE)||(LA26_1 >= INSTRUCTION_FORMAT10t && LA26_1 <= INSTRUCTION_FORMAT5rc_TYPE)||LA26_1==COLON) ) {
                    alt26=1;
                }
                else if ( (LA26_1==ARROW) ) {
                    int LA26_4 = input.LA(3);

                    if ( ((LA26_4 >= POSITIVE_INTEGER_LITERAL && LA26_4 <= NEGATIVE_INTEGER_LITERAL)||(LA26_4 >= FLOAT_LITERAL_OR_ID && LA26_4 <= DOUBLE_LITERAL_OR_ID)||(LA26_4 >= BOOL_LITERAL && LA26_4 <= NULL_LITERAL)||(LA26_4 >= REGISTER && LA26_4 <= VERIFICATION_ERROR_TYPE)||(LA26_4 >= INSTRUCTION_FORMAT10t && LA26_4 <= INSTRUCTION_FORMAT10x_ODEX)||(LA26_4 >= INSTRUCTION_FORMAT11x && LA26_4 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA26_4 >= INSTRUCTION_FORMAT21c_FIELD && LA26_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA26_4==INSTRUCTION_FORMAT21t||(LA26_4 >= INSTRUCTION_FORMAT22c_FIELD && LA26_4 <= INSTRUCTION_FORMAT22s_OR_ID)||LA26_4==INSTRUCTION_FORMAT22t||LA26_4==INSTRUCTION_FORMAT23x||LA26_4==INSTRUCTION_FORMAT31i_OR_ID||LA26_4==INSTRUCTION_FORMAT31t||(LA26_4 >= INSTRUCTION_FORMAT35c_METHOD && LA26_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA26_4==INSTRUCTION_FORMAT51l||(LA26_4 >= PRIMITIVE_TYPE && LA26_4 <= VOID_TYPE)||LA26_4==PARAM_LIST_OR_ID||LA26_4==SIMPLE_NAME||LA26_4==INTEGER_LITERAL) ) {
                        int LA26_5 = input.LA(4);

                        if ( (LA26_5==COLON) ) {
                            alt26=2;
                        }
                        else if ( (LA26_5==OPEN_PAREN) ) {
                            alt26=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA26_4==METHOD_NAME) ) {
                        alt26=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA26_0==ARRAY_DESCRIPTOR) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==ARROW) ) {
                    int LA26_4 = input.LA(3);

                    if ( ((LA26_4 >= POSITIVE_INTEGER_LITERAL && LA26_4 <= NEGATIVE_INTEGER_LITERAL)||(LA26_4 >= FLOAT_LITERAL_OR_ID && LA26_4 <= DOUBLE_LITERAL_OR_ID)||(LA26_4 >= BOOL_LITERAL && LA26_4 <= NULL_LITERAL)||(LA26_4 >= REGISTER && LA26_4 <= VERIFICATION_ERROR_TYPE)||(LA26_4 >= INSTRUCTION_FORMAT10t && LA26_4 <= INSTRUCTION_FORMAT10x_ODEX)||(LA26_4 >= INSTRUCTION_FORMAT11x && LA26_4 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA26_4 >= INSTRUCTION_FORMAT21c_FIELD && LA26_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA26_4==INSTRUCTION_FORMAT21t||(LA26_4 >= INSTRUCTION_FORMAT22c_FIELD && LA26_4 <= INSTRUCTION_FORMAT22s_OR_ID)||LA26_4==INSTRUCTION_FORMAT22t||LA26_4==INSTRUCTION_FORMAT23x||LA26_4==INSTRUCTION_FORMAT31i_OR_ID||LA26_4==INSTRUCTION_FORMAT31t||(LA26_4 >= INSTRUCTION_FORMAT35c_METHOD && LA26_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA26_4==INSTRUCTION_FORMAT51l||(LA26_4 >= PRIMITIVE_TYPE && LA26_4 <= VOID_TYPE)||LA26_4==PARAM_LIST_OR_ID||LA26_4==SIMPLE_NAME||LA26_4==INTEGER_LITERAL) ) {
                        int LA26_5 = input.LA(4);

                        if ( (LA26_5==COLON) ) {
                            alt26=2;
                        }
                        else if ( (LA26_5==OPEN_PAREN) ) {
                            alt26=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 26, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA26_4==METHOD_NAME) ) {
                        alt26=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // smaliIdeaParser.g:432:4: CLASS_DESCRIPTOR
                    {
                    match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference1500); 

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:432:23: fully_qualified_field
                    {
                    pushFollow(FOLLOW_fully_qualified_field_in_verification_error_reference1504);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:432:47: fully_qualified_method
                    {
                    pushFollow(FOLLOW_fully_qualified_method_in_verification_error_reference1508);
                    fully_qualified_method();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "verification_error_reference"



    // $ANTLR start "catch_directive"
    // smaliIdeaParser.g:434:1: catch_directive : CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset ;
    public final void catch_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:435:2: ( CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
            // smaliIdeaParser.g:435:4: CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
            {
            match(input,CATCH_DIRECTIVE,FOLLOW_CATCH_DIRECTIVE_in_catch_directive1517); 

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_catch_directive1519);
            nonvoid_type_descriptor();

            state._fsp--;


            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catch_directive1521); 

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1523);
            label_ref_or_offset();

            state._fsp--;


            match(input,DOTDOT,FOLLOW_DOTDOT_in_catch_directive1525); 

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1527);
            label_ref_or_offset();

            state._fsp--;


            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catch_directive1529); 

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1531);
            label_ref_or_offset();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "catch_directive"



    // $ANTLR start "catchall_directive"
    // smaliIdeaParser.g:437:1: catchall_directive : CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset ;
    public final void catchall_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:438:2: ( CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
            // smaliIdeaParser.g:438:4: CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
            {
            match(input,CATCHALL_DIRECTIVE,FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1540); 

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catchall_directive1542); 

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1544);
            label_ref_or_offset();

            state._fsp--;


            match(input,DOTDOT,FOLLOW_DOTDOT_in_catchall_directive1546); 

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1548);
            label_ref_or_offset();

            state._fsp--;


            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catchall_directive1550); 

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1552);
            label_ref_or_offset();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "catchall_directive"



    // $ANTLR start "parameter_directive"
    // smaliIdeaParser.g:444:1: parameter_directive : PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) ;
    public final void parameter_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:445:2: ( PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) )
            // smaliIdeaParser.g:445:4: PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |)
            {
            match(input,PARAMETER_DIRECTIVE,FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1563); 

            // smaliIdeaParser.g:445:24: ( STRING_LITERAL )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==STRING_LITERAL) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // smaliIdeaParser.g:445:24: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parameter_directive1565); 

                    }
                    break;

            }


            // smaliIdeaParser.g:446:3: ({...}? annotation )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // smaliIdeaParser.g:446:4: {...}? annotation
            	    {
            	    if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
            	        throw new FailedPredicateException(input, "parameter_directive", "input.LA(1) == ANNOTATION_DIRECTIVE");
            	    }

            	    pushFollow(FOLLOW_annotation_in_parameter_directive1573);
            	    annotation();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // smaliIdeaParser.g:447:3: ( END_PARAMETER_DIRECTIVE |)
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==END_PARAMETER_DIRECTIVE) ) {
                alt29=1;
            }
            else if ( (LA29_0==SOURCE_DIRECTIVE||LA29_0==ANNOTATION_DIRECTIVE||(LA29_0 >= END_METHOD_DIRECTIVE && LA29_0 <= ARRAY_DATA_DIRECTIVE)||LA29_0==PACKED_SWITCH_DIRECTIVE||LA29_0==SPARSE_SWITCH_DIRECTIVE||(LA29_0 >= CATCH_DIRECTIVE && LA29_0 <= PARAMETER_DIRECTIVE)||(LA29_0 >= LOCAL_DIRECTIVE && LA29_0 <= EPILOGUE_DIRECTIVE)||(LA29_0 >= INSTRUCTION_FORMAT10t && LA29_0 <= INSTRUCTION_FORMAT5rc_TYPE)||LA29_0==COLON) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // smaliIdeaParser.g:447:5: END_PARAMETER_DIRECTIVE
                    {
                    match(input,END_PARAMETER_DIRECTIVE,FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1581); 

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:449:3: 
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
        return ;
    }
    // $ANTLR end "parameter_directive"



    // $ANTLR start "ordered_debug_directive"
    // smaliIdeaParser.g:451:1: ordered_debug_directive : ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive );
    public final void ordered_debug_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:452:2: ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive )
            int alt30=7;
            switch ( input.LA(1) ) {
            case LINE_DIRECTIVE:
                {
                alt30=1;
                }
                break;
            case LOCAL_DIRECTIVE:
                {
                alt30=2;
                }
                break;
            case END_LOCAL_DIRECTIVE:
                {
                alt30=3;
                }
                break;
            case RESTART_LOCAL_DIRECTIVE:
                {
                alt30=4;
                }
                break;
            case PROLOGUE_DIRECTIVE:
                {
                alt30=5;
                }
                break;
            case EPILOGUE_DIRECTIVE:
                {
                alt30=6;
                }
                break;
            case SOURCE_DIRECTIVE:
                {
                alt30=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // smaliIdeaParser.g:452:4: line_directive
                    {
                    pushFollow(FOLLOW_line_directive_in_ordered_debug_directive1600);
                    line_directive();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:453:4: local_directive
                    {
                    pushFollow(FOLLOW_local_directive_in_ordered_debug_directive1605);
                    local_directive();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:454:4: end_local_directive
                    {
                    pushFollow(FOLLOW_end_local_directive_in_ordered_debug_directive1610);
                    end_local_directive();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:455:4: restart_local_directive
                    {
                    pushFollow(FOLLOW_restart_local_directive_in_ordered_debug_directive1615);
                    restart_local_directive();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:456:4: prologue_directive
                    {
                    pushFollow(FOLLOW_prologue_directive_in_ordered_debug_directive1620);
                    prologue_directive();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:457:4: epilogue_directive
                    {
                    pushFollow(FOLLOW_epilogue_directive_in_ordered_debug_directive1625);
                    epilogue_directive();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:458:4: source_directive
                    {
                    pushFollow(FOLLOW_source_directive_in_ordered_debug_directive1630);
                    source_directive();

                    state._fsp--;


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
        return ;
    }
    // $ANTLR end "ordered_debug_directive"



    // $ANTLR start "line_directive"
    // smaliIdeaParser.g:460:1: line_directive : LINE_DIRECTIVE integral_literal ;
    public final void line_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:461:2: ( LINE_DIRECTIVE integral_literal )
            // smaliIdeaParser.g:461:4: LINE_DIRECTIVE integral_literal
            {
            match(input,LINE_DIRECTIVE,FOLLOW_LINE_DIRECTIVE_in_line_directive1639); 

            pushFollow(FOLLOW_integral_literal_in_line_directive1641);
            integral_literal();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "line_directive"



    // $ANTLR start "local_directive"
    // smaliIdeaParser.g:463:1: local_directive : LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? ;
    public final void local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:464:2: ( LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? )
            // smaliIdeaParser.g:464:4: LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )?
            {
            match(input,LOCAL_DIRECTIVE,FOLLOW_LOCAL_DIRECTIVE_in_local_directive1650); 

            match(input,REGISTER,FOLLOW_REGISTER_in_local_directive1652); 

            match(input,COMMA,FOLLOW_COMMA_in_local_directive1654); 

            pushFollow(FOLLOW_simple_name_in_local_directive1656);
            simple_name();

            state._fsp--;


            match(input,COLON,FOLLOW_COLON_in_local_directive1658); 

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_local_directive1660);
            nonvoid_type_descriptor();

            state._fsp--;


            // smaliIdeaParser.g:464:77: ( COMMA STRING_LITERAL )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==COMMA) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // smaliIdeaParser.g:464:78: COMMA STRING_LITERAL
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_local_directive1663); 

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive1665); 

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
        return ;
    }
    // $ANTLR end "local_directive"



    // $ANTLR start "end_local_directive"
    // smaliIdeaParser.g:466:1: end_local_directive : END_LOCAL_DIRECTIVE REGISTER ;
    public final void end_local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:467:2: ( END_LOCAL_DIRECTIVE REGISTER )
            // smaliIdeaParser.g:467:4: END_LOCAL_DIRECTIVE REGISTER
            {
            match(input,END_LOCAL_DIRECTIVE,FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1676); 

            match(input,REGISTER,FOLLOW_REGISTER_in_end_local_directive1678); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "end_local_directive"



    // $ANTLR start "restart_local_directive"
    // smaliIdeaParser.g:469:1: restart_local_directive : RESTART_LOCAL_DIRECTIVE REGISTER ;
    public final void restart_local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:470:2: ( RESTART_LOCAL_DIRECTIVE REGISTER )
            // smaliIdeaParser.g:470:4: RESTART_LOCAL_DIRECTIVE REGISTER
            {
            match(input,RESTART_LOCAL_DIRECTIVE,FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1687); 

            match(input,REGISTER,FOLLOW_REGISTER_in_restart_local_directive1689); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "restart_local_directive"



    // $ANTLR start "prologue_directive"
    // smaliIdeaParser.g:472:1: prologue_directive : PROLOGUE_DIRECTIVE ;
    public final void prologue_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:473:2: ( PROLOGUE_DIRECTIVE )
            // smaliIdeaParser.g:473:4: PROLOGUE_DIRECTIVE
            {
            match(input,PROLOGUE_DIRECTIVE,FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1698); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prologue_directive"



    // $ANTLR start "epilogue_directive"
    // smaliIdeaParser.g:475:1: epilogue_directive : EPILOGUE_DIRECTIVE ;
    public final void epilogue_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:476:2: ( EPILOGUE_DIRECTIVE )
            // smaliIdeaParser.g:476:4: EPILOGUE_DIRECTIVE
            {
            match(input,EPILOGUE_DIRECTIVE,FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1707); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "epilogue_directive"



    // $ANTLR start "source_directive"
    // smaliIdeaParser.g:478:1: source_directive : SOURCE_DIRECTIVE STRING_LITERAL ;
    public final void source_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:479:2: ( SOURCE_DIRECTIVE STRING_LITERAL )
            // smaliIdeaParser.g:479:4: SOURCE_DIRECTIVE STRING_LITERAL
            {
            match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_directive1716); 

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_directive1718); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "source_directive"



    // $ANTLR start "instruction_format12x"
    // smaliIdeaParser.g:481:1: instruction_format12x : ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID );
    public final void instruction_format12x() throws RecognitionException {
        try {
            // smaliIdeaParser.g:482:2: ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT12x_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT12x) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "instruction_format12x"



    // $ANTLR start "instruction_format22s"
    // smaliIdeaParser.g:485:1: instruction_format22s : ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID );
    public final void instruction_format22s() throws RecognitionException {
        try {
            // smaliIdeaParser.g:486:2: ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT22s_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT22s) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "instruction_format22s"



    // $ANTLR start "instruction_format31i"
    // smaliIdeaParser.g:489:1: instruction_format31i : ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID );
    public final void instruction_format31i() throws RecognitionException {
        try {
            // smaliIdeaParser.g:490:2: ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT31i_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT31i) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "instruction_format31i"



    // $ANTLR start "instruction"
    // smaliIdeaParser.g:493:1: instruction : ( INSTRUCTION_FORMAT10t label_ref_or_offset | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal | INSTRUCTION_FORMAT11x REGISTER | instruction_format12x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference | INSTRUCTION_FORMAT20t label_ref_or_offset | INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL | INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) | INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET | instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER | INSTRUCTION_FORMAT30t label_ref_or_offset | INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL | instruction_format31i REGISTER COMMA fixed_32bit_literal | INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal | INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE | PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE | SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE );
    public final void instruction() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:496:2: ( INSTRUCTION_FORMAT10t label_ref_or_offset | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal | INSTRUCTION_FORMAT11x REGISTER | instruction_format12x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference | INSTRUCTION_FORMAT20t label_ref_or_offset | INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL | INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) | INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET | instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER | INSTRUCTION_FORMAT30t label_ref_or_offset | INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL | instruction_format31i REGISTER COMMA fixed_32bit_literal | INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal | INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE | PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE | SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE )
            int alt35=52;
            switch ( input.LA(1) ) {
            case INSTRUCTION_FORMAT10t:
                {
                alt35=1;
                }
                break;
            case INSTRUCTION_FORMAT10x:
                {
                alt35=2;
                }
                break;
            case INSTRUCTION_FORMAT10x_ODEX:
                {
                alt35=3;
                }
                break;
            case INSTRUCTION_FORMAT11n:
                {
                alt35=4;
                }
                break;
            case INSTRUCTION_FORMAT11x:
                {
                alt35=5;
                }
                break;
            case INSTRUCTION_FORMAT12x_OR_ID:
            case INSTRUCTION_FORMAT12x:
                {
                alt35=6;
                }
                break;
            case INSTRUCTION_FORMAT20bc:
                {
                alt35=7;
                }
                break;
            case INSTRUCTION_FORMAT20t:
                {
                alt35=8;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD:
                {
                alt35=9;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                {
                alt35=10;
                }
                break;
            case INSTRUCTION_FORMAT21c_STRING:
                {
                alt35=11;
                }
                break;
            case INSTRUCTION_FORMAT21c_TYPE:
                {
                alt35=12;
                }
                break;
            case INSTRUCTION_FORMAT21h:
                {
                alt35=13;
                }
                break;
            case INSTRUCTION_FORMAT21s:
                {
                alt35=14;
                }
                break;
            case INSTRUCTION_FORMAT21t:
                {
                alt35=15;
                }
                break;
            case INSTRUCTION_FORMAT22b:
                {
                alt35=16;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD:
                {
                alt35=17;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                {
                alt35=18;
                }
                break;
            case INSTRUCTION_FORMAT22c_TYPE:
                {
                alt35=19;
                }
                break;
            case INSTRUCTION_FORMAT22cs_FIELD:
                {
                alt35=20;
                }
                break;
            case INSTRUCTION_FORMAT22s_OR_ID:
            case INSTRUCTION_FORMAT22s:
                {
                alt35=21;
                }
                break;
            case INSTRUCTION_FORMAT22t:
                {
                alt35=22;
                }
                break;
            case INSTRUCTION_FORMAT22x:
                {
                alt35=23;
                }
                break;
            case INSTRUCTION_FORMAT23x:
                {
                alt35=24;
                }
                break;
            case INSTRUCTION_FORMAT30t:
                {
                alt35=25;
                }
                break;
            case INSTRUCTION_FORMAT31c:
                {
                alt35=26;
                }
                break;
            case INSTRUCTION_FORMAT31i_OR_ID:
            case INSTRUCTION_FORMAT31i:
                {
                alt35=27;
                }
                break;
            case INSTRUCTION_FORMAT31t:
                {
                alt35=28;
                }
                break;
            case INSTRUCTION_FORMAT32x:
                {
                alt35=29;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD:
                {
                alt35=30;
                }
                break;
            case INSTRUCTION_FORMAT35c_TYPE:
                {
                alt35=31;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD_ODEX:
                {
                alt35=32;
                }
                break;
            case INSTRUCTION_FORMAT35mi_METHOD:
                {
                alt35=33;
                }
                break;
            case INSTRUCTION_FORMAT35ms_METHOD:
                {
                alt35=34;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD:
                {
                alt35=35;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
                {
                alt35=36;
                }
                break;
            case INSTRUCTION_FORMAT3rc_TYPE:
                {
                alt35=37;
                }
                break;
            case INSTRUCTION_FORMAT3rmi_METHOD:
                {
                alt35=38;
                }
                break;
            case INSTRUCTION_FORMAT3rms_METHOD:
                {
                alt35=39;
                }
                break;
            case INSTRUCTION_FORMAT41c_TYPE:
                {
                alt35=40;
                }
                break;
            case INSTRUCTION_FORMAT41c_FIELD:
                {
                alt35=41;
                }
                break;
            case INSTRUCTION_FORMAT41c_FIELD_ODEX:
                {
                alt35=42;
                }
                break;
            case INSTRUCTION_FORMAT51l:
                {
                alt35=43;
                }
                break;
            case INSTRUCTION_FORMAT52c_TYPE:
                {
                alt35=44;
                }
                break;
            case INSTRUCTION_FORMAT52c_FIELD:
                {
                alt35=45;
                }
                break;
            case INSTRUCTION_FORMAT52c_FIELD_ODEX:
                {
                alt35=46;
                }
                break;
            case INSTRUCTION_FORMAT5rc_METHOD:
                {
                alt35=47;
                }
                break;
            case INSTRUCTION_FORMAT5rc_METHOD_ODEX:
                {
                alt35=48;
                }
                break;
            case INSTRUCTION_FORMAT5rc_TYPE:
                {
                alt35=49;
                }
                break;
            case ARRAY_DATA_DIRECTIVE:
                {
                alt35=50;
                }
                break;
            case PACKED_SWITCH_DIRECTIVE:
                {
                alt35=51;
                }
                break;
            case SPARSE_SWITCH_DIRECTIVE:
                {
                alt35=52;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // smaliIdeaParser.g:498:3: INSTRUCTION_FORMAT10t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_instruction1793); 

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1795);
                    label_ref_or_offset();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:500:3: INSTRUCTION_FORMAT10x
                    {
                    match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_instruction1803); 

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:502:3: INSTRUCTION_FORMAT10x_ODEX
                    {
                    match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_instruction1811); 

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:504:3: INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT11n,FOLLOW_INSTRUCTION_FORMAT11n_in_instruction1819); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1821); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1823); 

                    pushFollow(FOLLOW_integral_literal_in_instruction1825);
                    integral_literal();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:506:3: INSTRUCTION_FORMAT11x REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_instruction1833); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1835); 

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:508:3: instruction_format12x REGISTER COMMA REGISTER
                    {
                    pushFollow(FOLLOW_instruction_format12x_in_instruction1843);
                    instruction_format12x();

                    state._fsp--;


                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1845); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1847); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1849); 

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:510:3: INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference
                    {
                    match(input,INSTRUCTION_FORMAT20bc,FOLLOW_INSTRUCTION_FORMAT20bc_in_instruction1857); 

                    match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_instruction1859); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1861); 

                    pushFollow(FOLLOW_verification_error_reference_in_instruction1863);
                    verification_error_reference();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:512:3: INSTRUCTION_FORMAT20t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT20t,FOLLOW_INSTRUCTION_FORMAT20t_in_instruction1871); 

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1873);
                    label_ref_or_offset();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // smaliIdeaParser.g:514:3: INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_instruction1881); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1883); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1885); 

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction1887);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // smaliIdeaParser.g:516:3: INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_instruction1895); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1897); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1899); 

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction1901);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // smaliIdeaParser.g:518:3: INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
                    {
                    match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_instruction1909); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1911); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1913); 

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_instruction1915); 

                    }
                    break;
                case 12 :
                    // smaliIdeaParser.g:520:3: INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_instruction1923); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1925); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1927); 

                    pushFollow(FOLLOW_reference_type_descriptor_in_instruction1929);
                    reference_type_descriptor();

                    state._fsp--;


                    }
                    break;
                case 13 :
                    // smaliIdeaParser.g:522:3: INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT21h,FOLLOW_INSTRUCTION_FORMAT21h_in_instruction1937); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1939); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1941); 

                    pushFollow(FOLLOW_integral_literal_in_instruction1943);
                    integral_literal();

                    state._fsp--;


                    }
                    break;
                case 14 :
                    // smaliIdeaParser.g:524:3: INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT21s,FOLLOW_INSTRUCTION_FORMAT21s_in_instruction1951); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1953); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1955); 

                    pushFollow(FOLLOW_integral_literal_in_instruction1957);
                    integral_literal();

                    state._fsp--;


                    }
                    break;
                case 15 :
                    // smaliIdeaParser.g:526:3: INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset )
                    {
                    match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_instruction1965); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1967); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1969); 

                    // smaliIdeaParser.g:526:40: ( label_ref_or_offset )
                    // smaliIdeaParser.g:526:41: label_ref_or_offset
                    {
                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1972);
                    label_ref_or_offset();

                    state._fsp--;


                    }


                    }
                    break;
                case 16 :
                    // smaliIdeaParser.g:528:3: INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT22b,FOLLOW_INSTRUCTION_FORMAT22b_in_instruction1981); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1983); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1985); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1987); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1989); 

                    pushFollow(FOLLOW_integral_literal_in_instruction1991);
                    integral_literal();

                    state._fsp--;


                    }
                    break;
                case 17 :
                    // smaliIdeaParser.g:530:3: INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_instruction1999); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2001); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2003); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2005); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2007); 

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2009);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 18 :
                    // smaliIdeaParser.g:532:3: INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_instruction2017); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2019); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2021); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2023); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2025); 

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2027);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 19 :
                    // smaliIdeaParser.g:534:3: INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_instruction2035); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2037); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2039); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2041); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2043); 

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2045);
                    nonvoid_type_descriptor();

                    state._fsp--;


                    }
                    break;
                case 20 :
                    // smaliIdeaParser.g:536:3: INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
                    {
                    match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_instruction2053); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2055); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2057); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2059); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2061); 

                    match(input,FIELD_OFFSET,FOLLOW_FIELD_OFFSET_in_instruction2063); 

                    }
                    break;
                case 21 :
                    // smaliIdeaParser.g:538:3: instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
                    {
                    pushFollow(FOLLOW_instruction_format22s_in_instruction2071);
                    instruction_format22s();

                    state._fsp--;


                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2073); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2075); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2077); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2079); 

                    pushFollow(FOLLOW_integral_literal_in_instruction2081);
                    integral_literal();

                    state._fsp--;


                    }
                    break;
                case 22 :
                    // smaliIdeaParser.g:540:3: INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_instruction2089); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2091); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2093); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2095); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2097); 

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2099);
                    label_ref_or_offset();

                    state._fsp--;


                    }
                    break;
                case 23 :
                    // smaliIdeaParser.g:542:3: INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT22x,FOLLOW_INSTRUCTION_FORMAT22x_in_instruction2107); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2109); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2111); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2113); 

                    }
                    break;
                case 24 :
                    // smaliIdeaParser.g:544:3: INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_instruction2121); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2123); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2125); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2127); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2129); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2131); 

                    }
                    break;
                case 25 :
                    // smaliIdeaParser.g:546:3: INSTRUCTION_FORMAT30t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT30t,FOLLOW_INSTRUCTION_FORMAT30t_in_instruction2139); 

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2141);
                    label_ref_or_offset();

                    state._fsp--;


                    }
                    break;
                case 26 :
                    // smaliIdeaParser.g:548:3: INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
                    {
                    match(input,INSTRUCTION_FORMAT31c,FOLLOW_INSTRUCTION_FORMAT31c_in_instruction2149); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2151); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2153); 

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_instruction2155); 

                    }
                    break;
                case 27 :
                    // smaliIdeaParser.g:550:3: instruction_format31i REGISTER COMMA fixed_32bit_literal
                    {
                    pushFollow(FOLLOW_instruction_format31i_in_instruction2163);
                    instruction_format31i();

                    state._fsp--;


                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2165); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2167); 

                    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2169);
                    fixed_32bit_literal();

                    state._fsp--;


                    }
                    break;
                case 28 :
                    // smaliIdeaParser.g:552:3: INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_instruction2177); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2179); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2181); 

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2183);
                    label_ref_or_offset();

                    state._fsp--;


                    }
                    break;
                case 29 :
                    // smaliIdeaParser.g:554:3: INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT32x,FOLLOW_INSTRUCTION_FORMAT32x_in_instruction2191); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2193); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2195); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2197); 

                    }
                    break;
                case 30 :
                    // smaliIdeaParser.g:556:3: INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_instruction2205); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2207); 

                    pushFollow(FOLLOW_register_list_in_instruction2209);
                    register_list();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2211); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2213); 

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2215);
                    fully_qualified_method();

                    state._fsp--;


                    }
                    break;
                case 31 :
                    // smaliIdeaParser.g:558:3: INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_instruction2223); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2225); 

                    pushFollow(FOLLOW_register_list_in_instruction2227);
                    register_list();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2229); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2231); 

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2233);
                    nonvoid_type_descriptor();

                    state._fsp--;


                    }
                    break;
                case 32 :
                    // smaliIdeaParser.g:560:3: INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_instruction2241); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2243); 

                    pushFollow(FOLLOW_register_list_in_instruction2245);
                    register_list();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2247); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2249); 

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2251);
                    fully_qualified_method();

                    state._fsp--;


                    }
                    break;
                case 33 :
                    // smaliIdeaParser.g:562:3: INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_instruction2259); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2261); 

                    pushFollow(FOLLOW_register_list_in_instruction2263);
                    register_list();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2265); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2267); 

                    match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_instruction2269); 

                    }
                    break;
                case 34 :
                    // smaliIdeaParser.g:564:3: INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_instruction2277); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2279); 

                    pushFollow(FOLLOW_register_list_in_instruction2281);
                    register_list();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2283); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2285); 

                    match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_instruction2287); 

                    }
                    break;
                case 35 :
                    // smaliIdeaParser.g:566:3: INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT3rc_METHOD,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_instruction2295); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2297); 

                    pushFollow(FOLLOW_register_range_in_instruction2299);
                    register_range();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2301); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2303); 

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2305);
                    fully_qualified_method();

                    state._fsp--;


                    }
                    break;
                case 36 :
                    // smaliIdeaParser.g:568:3: INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT3rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_instruction2313); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2315); 

                    pushFollow(FOLLOW_register_list_in_instruction2317);
                    register_list();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2319); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2321); 

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2323);
                    fully_qualified_method();

                    state._fsp--;


                    }
                    break;
                case 37 :
                    // smaliIdeaParser.g:570:3: INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT3rc_TYPE,FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_instruction2331); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2333); 

                    pushFollow(FOLLOW_register_range_in_instruction2335);
                    register_range();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2337); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2339); 

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2341);
                    nonvoid_type_descriptor();

                    state._fsp--;


                    }
                    break;
                case 38 :
                    // smaliIdeaParser.g:572:3: INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT3rmi_METHOD,FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_instruction2349); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2351); 

                    pushFollow(FOLLOW_register_range_in_instruction2353);
                    register_range();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2355); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2357); 

                    match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_instruction2359); 

                    }
                    break;
                case 39 :
                    // smaliIdeaParser.g:574:3: INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT3rms_METHOD,FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_instruction2367); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2369); 

                    pushFollow(FOLLOW_register_range_in_instruction2371);
                    register_range();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2373); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2375); 

                    match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_instruction2377); 

                    }
                    break;
                case 40 :
                    // smaliIdeaParser.g:576:3: INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT41c_TYPE,FOLLOW_INSTRUCTION_FORMAT41c_TYPE_in_instruction2385); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2387); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2389); 

                    pushFollow(FOLLOW_reference_type_descriptor_in_instruction2391);
                    reference_type_descriptor();

                    state._fsp--;


                    }
                    break;
                case 41 :
                    // smaliIdeaParser.g:578:3: INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT41c_FIELD,FOLLOW_INSTRUCTION_FORMAT41c_FIELD_in_instruction2399); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2401); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2403); 

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2405);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 42 :
                    // smaliIdeaParser.g:580:3: INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT41c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT41c_FIELD_ODEX_in_instruction2413); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2415); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2417); 

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2419);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 43 :
                    // smaliIdeaParser.g:582:3: INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
                    {
                    match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_instruction2427); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2429); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2431); 

                    pushFollow(FOLLOW_fixed_literal_in_instruction2433);
                    fixed_literal();

                    state._fsp--;


                    }
                    break;
                case 44 :
                    // smaliIdeaParser.g:584:3: INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT52c_TYPE,FOLLOW_INSTRUCTION_FORMAT52c_TYPE_in_instruction2441); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2443); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2445); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2447); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2449); 

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2451);
                    nonvoid_type_descriptor();

                    state._fsp--;


                    }
                    break;
                case 45 :
                    // smaliIdeaParser.g:586:3: INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT52c_FIELD,FOLLOW_INSTRUCTION_FORMAT52c_FIELD_in_instruction2459); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2461); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2463); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2465); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2467); 

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2469);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 46 :
                    // smaliIdeaParser.g:588:3: INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT52c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT52c_FIELD_ODEX_in_instruction2477); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2479); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2481); 

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2483); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2485); 

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2487);
                    fully_qualified_field();

                    state._fsp--;


                    }
                    break;
                case 47 :
                    // smaliIdeaParser.g:590:3: INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT5rc_METHOD,FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_in_instruction2495); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2497); 

                    pushFollow(FOLLOW_register_range_in_instruction2499);
                    register_range();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2501); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2503); 

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2505);
                    fully_qualified_method();

                    state._fsp--;


                    }
                    break;
                case 48 :
                    // smaliIdeaParser.g:592:3: INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT5rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_ODEX_in_instruction2513); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2515); 

                    pushFollow(FOLLOW_register_range_in_instruction2517);
                    register_range();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2519); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2521); 

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2523);
                    fully_qualified_method();

                    state._fsp--;


                    }
                    break;
                case 49 :
                    // smaliIdeaParser.g:594:3: INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT5rc_TYPE,FOLLOW_INSTRUCTION_FORMAT5rc_TYPE_in_instruction2531); 

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2533); 

                    pushFollow(FOLLOW_register_range_in_instruction2535);
                    register_range();

                    state._fsp--;


                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2537); 

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2539); 

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2541);
                    nonvoid_type_descriptor();

                    state._fsp--;


                    }
                    break;
                case 50 :
                    // smaliIdeaParser.g:595:6: ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE
                    {
                    match(input,ARRAY_DATA_DIRECTIVE,FOLLOW_ARRAY_DATA_DIRECTIVE_in_instruction2548); 

                    pushFollow(FOLLOW_integral_literal_in_instruction2550);
                    integral_literal();

                    state._fsp--;


                    // smaliIdeaParser.g:595:44: ( fixed_literal )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0 >= POSITIVE_INTEGER_LITERAL && LA32_0 <= BOOL_LITERAL)||LA32_0==CHAR_LITERAL||LA32_0==INTEGER_LITERAL) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // smaliIdeaParser.g:595:44: fixed_literal
                    	    {
                    	    pushFollow(FOLLOW_fixed_literal_in_instruction2552);
                    	    fixed_literal();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    match(input,END_ARRAY_DATA_DIRECTIVE,FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_instruction2555); 

                    }
                    break;
                case 51 :
                    // smaliIdeaParser.g:596:6: PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE
                    {
                    match(input,PACKED_SWITCH_DIRECTIVE,FOLLOW_PACKED_SWITCH_DIRECTIVE_in_instruction2562); 

                    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2564);
                    fixed_32bit_literal();

                    state._fsp--;


                    // smaliIdeaParser.g:596:50: ( label_ref_or_offset )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==NEGATIVE_INTEGER_LITERAL||LA33_0==OFFSET||LA33_0==COLON) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // smaliIdeaParser.g:596:50: label_ref_or_offset
                    	    {
                    	    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2566);
                    	    label_ref_or_offset();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    match(input,END_PACKED_SWITCH_DIRECTIVE,FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_instruction2569); 

                    }
                    break;
                case 52 :
                    // smaliIdeaParser.g:597:6: SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE
                    {
                    match(input,SPARSE_SWITCH_DIRECTIVE,FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_instruction2576); 

                    // smaliIdeaParser.g:597:30: ( fixed_32bit_literal ARROW label_ref_or_offset )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0 >= POSITIVE_INTEGER_LITERAL && LA34_0 <= FLOAT_LITERAL_OR_ID)||LA34_0==FLOAT_LITERAL||LA34_0==BOOL_LITERAL||LA34_0==CHAR_LITERAL||LA34_0==INTEGER_LITERAL) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // smaliIdeaParser.g:597:31: fixed_32bit_literal ARROW label_ref_or_offset
                    	    {
                    	    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2579);
                    	    fixed_32bit_literal();

                    	    state._fsp--;


                    	    match(input,ARROW,FOLLOW_ARROW_in_instruction2581); 

                    	    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2583);
                    	    label_ref_or_offset();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    match(input,END_SPARSE_SWITCH_DIRECTIVE,FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_instruction2587); 

                    }
                    break;

            }
             marker.done(SmaliElementTypes.INSTRUCTION); 
        }
        catch (RecognitionException ex) {
             marker.error(getErrorMessage(ex, tokenNames)); recover(input,ex); 
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "instruction"

    // Delegated rules


    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA28_eotS =
        "\106\uffff";
    static final String DFA28_eofS =
        "\106\uffff";
    static final String DFA28_minS =
        "\1\7\103\uffff\1\0\1\uffff";
    static final String DFA28_maxS =
        "\1\u0088\103\uffff\1\0\1\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\103\uffff\1\1";
    static final String DFA28_specialS =
        "\104\uffff\1\0\1\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\4\uffff\1\104\3\uffff\4\1\1\uffff\1\1\1\uffff\1\1\1\uffff"+
            "\12\1\41\uffff\64\1\20\uffff\1\1",
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 446:3: ({...}? annotation )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_68 = input.LA(1);

                         
                        int index28_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 69;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index28_68);

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_class_spec_in_smali_file54 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_super_spec_in_smali_file62 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_implements_spec_in_smali_file70 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_source_spec_in_smali_file78 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_method_in_smali_file86 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_field_in_smali_file94 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_annotation_in_smali_file102 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_EOF_in_smali_file107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_DIRECTIVE_in_class_spec141 = new BitSet(new long[]{0x2000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_access_list_in_class_spec143 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_class_spec145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_DIRECTIVE_in_super_spec179 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_super_spec181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec215 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_implements_spec217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_spec251 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_spec253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_SPEC_in_access_list287 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_FIELD_DIRECTIVE_in_field313 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_access_list_in_field315 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_field317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_field319 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field321 = new BitSet(new long[]{0x0000000000001202L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_EQUAL_in_field324 = new BitSet(new long[]{0x057FF00000004400L,0xE000000000000000L,0x0000000000000401L,0x0000200000000000L});
    public static final BitSet FOLLOW_literal_in_field326 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_annotation_in_field339 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DIRECTIVE_in_method439 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000001AL,0x0000200000000000L});
    public static final BitSet FOLLOW_access_list_in_method441 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000001AL,0x0000200000000000L});
    public static final BitSet FOLLOW_method_name_in_method443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_method_prototype_in_method445 = new BitSet(new long[]{0x00000007DEAF1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_statements_and_directives_in_method447 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_METHOD_DIRECTIVE_in_method449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_statements_and_directives485 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_registers_directive_in_statements_and_directives491 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_in_statements_and_directives497 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_catch_directive_in_statements_and_directives503 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchall_directive_in_statements_and_directives509 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_parameter_directive_in_statements_and_directives515 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_ordered_debug_directive_in_statements_and_directives521 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_annotation_in_statements_and_directives527 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive571 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCALS_DIRECTIVE_in_registers_directive579 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_method_name852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_NAME_in_method_name857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_method_prototype891 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000002007L});
    public static final BitSet FOLLOW_param_list_in_method_prototype893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_method_prototype895 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_descriptor_in_method_prototype897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_in_param_list913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_param_list918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_param_list923 = new BitSet(new long[]{0x0000000000000002L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_literal1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_literal1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_literal1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_literal1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_literal1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_literal1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_literal1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_literal1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LITERAL_in_literal1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_literal_in_literal1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subannotation_in_literal1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_field_method_literal_in_literal1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_literal_in_literal1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_integral_literal1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_integral_literal1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_integral_literal1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_integral_literal1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_integral_literal1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_32bit_literal1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_32bit_literal1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_literal1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_literal1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_literal1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_literal1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_literal1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_fixed_literal1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_literal1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_literal1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_array_literal1225 = new BitSet(new long[]{0x057FF00000004400L,0xE000000000000000L,0x0000000000000C01L,0x0000200000000000L});
    public static final BitSet FOLLOW_literal_in_array_literal1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_COMMA_in_array_literal1231 = new BitSet(new long[]{0x057FF00000004400L,0xE000000000000000L,0x0000000000000401L,0x0000200000000000L});
    public static final BitSet FOLLOW_literal_in_array_literal1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_array_literal1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_annotation_element1250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_element1252 = new BitSet(new long[]{0x057FF00000004400L,0xE000000000000000L,0x0000000000000401L,0x0000200000000000L});
    public static final BitSet FOLLOW_literal_in_annotation_element1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1282 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_annotation1284 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_annotation1286 = new BitSet(new long[]{0x7866300000002000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_annotation_element_in_annotation1290 = new BitSet(new long[]{0x7866300000002000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1309 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_subannotation1311 = new BitSet(new long[]{0x7866300000000800L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_annotation_element_in_subannotation1313 = new BitSet(new long[]{0x7866300000000800L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_DIRECTIVE_in_enum_literal1325 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_enum_literal1329 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_enum_literal1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_enum_literal1333 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal1344 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_type_field_method_literal1350 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000001AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_type_field_method_literal1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_type_field_method_literal1359 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_type_field_method_literal1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_method_prototype_in_type_field_method_literal1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_TYPE_in_type_field_method_literal1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_method1398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_method1400 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000001AL,0x0000200000000000L});
    public static final BitSet FOLLOW_method_name_in_fully_qualified_method1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_method_prototype_in_fully_qualified_method1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_field1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_field1415 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_fully_qualified_field1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_fully_qualified_field1419 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label1430 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_label1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label_ref_or_offset1441 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_label_ref_or_offset1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFFSET_in_label_ref_or_offset1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGISTER_in_register_list1463 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_register_list1466 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_list1468 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_REGISTER_in_register_range1482 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOTDOT_in_register_range1485 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_range1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_field_in_verification_error_reference1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_method_in_verification_error_reference1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_DIRECTIVE_in_catch_directive1517 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_catch_directive1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catch_directive1521 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOTDOT_in_catch_directive1525 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catch_directive1529 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catchall_directive1542 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOTDOT_in_catchall_directive1546 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catchall_directive1550 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1563 = new BitSet(new long[]{0x0100000020001002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parameter_directive1565 = new BitSet(new long[]{0x0000000020001002L});
    public static final BitSet FOLLOW_annotation_in_parameter_directive1573 = new BitSet(new long[]{0x0000000020001002L});
    public static final BitSet FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_ordered_debug_directive1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_directive_in_ordered_debug_directive1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_end_local_directive_in_ordered_debug_directive1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_restart_local_directive_in_ordered_debug_directive1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_directive_in_ordered_debug_directive1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_epilogue_directive_in_ordered_debug_directive1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_directive_in_ordered_debug_directive1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_DIRECTIVE_in_line_directive1639 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_line_directive1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_DIRECTIVE_in_local_directive1650 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_local_directive1652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_local_directive1654 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_local_directive1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_local_directive1658 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_local_directive1660 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_local_directive1663 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1676 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_end_local_directive1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1687 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_restart_local_directive1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_directive1716 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_directive1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_instruction1793 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_instruction1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_instruction1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11n_in_instruction1819 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1823 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_instruction1833 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format12x_in_instruction1843 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1847 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20bc_in_instruction1857 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_instruction1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1861 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_verification_error_reference_in_instruction1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20t_in_instruction1871 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_instruction1881 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1885 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_instruction1895 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1899 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_instruction1909 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1913 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_instruction1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_instruction1923 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1927 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_instruction1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21h_in_instruction1937 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1941 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21s_in_instruction1951 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1955 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_instruction1965 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1969 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22b_in_instruction1981 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1985 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1989 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_instruction1999 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2003 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2007 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_instruction2017 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2021 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2025 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_instruction2035 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2039 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2043 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_instruction2053 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2057 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_OFFSET_in_instruction2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format22s_in_instruction2071 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2075 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2079 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_instruction2089 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2093 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2097 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22x_in_instruction2107 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2111 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_instruction2121 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2125 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2129 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT30t_in_instruction2139 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31c_in_instruction2149 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2153 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_instruction2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format31i_in_instruction2163 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2167 = new BitSet(new long[]{0x042BF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_instruction2177 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2181 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT32x_in_instruction2191 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2195 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_instruction2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2207 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2213 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_instruction2223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2225 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2231 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_instruction2241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2243 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2245 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2249 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_instruction2259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2261 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2267 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_INLINE_INDEX_in_instruction2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_instruction2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2279 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VTABLE_INDEX_in_instruction2287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_instruction2295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2297 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2303 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_instruction2313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2315 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2321 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_instruction2331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2333 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2339 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_instruction2349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2351 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2357 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_INLINE_INDEX_in_instruction2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_instruction2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2369 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VTABLE_INDEX_in_instruction2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_TYPE_in_instruction2385 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2389 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_instruction2391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_FIELD_in_instruction2399 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2403 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_FIELD_ODEX_in_instruction2413 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2417 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_instruction2427 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2431 = new BitSet(new long[]{0x043FF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_literal_in_instruction2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_TYPE_in_instruction2441 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2445 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2449 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_FIELD_in_instruction2459 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2463 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2467 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_FIELD_ODEX_in_instruction2477 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2481 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2485 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_in_instruction2495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2497 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2503 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_ODEX_in_instruction2513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2515 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2521 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_TYPE_in_instruction2531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2533 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2539 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DATA_DIRECTIVE_in_instruction2548 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction2550 = new BitSet(new long[]{0x043FF00000100000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_literal_in_instruction2552 = new BitSet(new long[]{0x043FF00000100000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_instruction2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKED_SWITCH_DIRECTIVE_in_instruction2562 = new BitSet(new long[]{0x042BF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2564 = new BitSet(new long[]{0x0000200000400000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2566 = new BitSet(new long[]{0x0000200000400000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_instruction2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_instruction2576 = new BitSet(new long[]{0x042BF00001000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_instruction2581 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2583 = new BitSet(new long[]{0x042BF00001000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_instruction2587 = new BitSet(new long[]{0x0000000000000002L});

}