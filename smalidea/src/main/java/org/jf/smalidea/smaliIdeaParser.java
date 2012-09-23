// $ANTLR 3.4 smaliIdeaParser.g 2012-09-23 18:41:30

package org.jf.smalidea;

import org.jf.smalidea.psi.ElementTypes;
import com.intellij.lang.PsiBuilder;
import static com.intellij.lang.PsiBuilder.Marker;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class smaliIdeaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESS_SPEC", "ANNOTATION_DIRECTIVE", "ANNOTATION_VISIBILITY", "ARRAY_DATA_DIRECTIVE", "ARRAY_DESCRIPTOR", "ARROW", "BASE_ARRAY_DESCRIPTOR", "BASE_CHAR_LITERAL", "BASE_CLASS_DESCRIPTOR", "BASE_FLOAT", "BASE_FLOAT_OR_ID", "BASE_INTEGER", "BASE_PRIMITIVE_TYPE", "BASE_SIMPLE_NAME", "BASE_STRING_LITERAL", "BASE_TYPE", "BINARY_EXPONENT", "BOOL_LITERAL", "BYTE_LITERAL", "CATCH_DIRECTIVE", "CATCHALL_DIRECTIVE", "CHAR_LITERAL", "CLASS_DESCRIPTOR", "CLASS_DIRECTIVE", "CLOSE_BRACE", "CLOSE_PAREN", "COLON", "COMMA", "DECIMAL_EXPONENT", "DOTDOT", "DOUBLE_LITERAL", "DOUBLE_LITERAL_OR_ID", "END_ANNOTATION_DIRECTIVE", "END_ARRAY_DATA_DIRECTIVE", "END_FIELD_DIRECTIVE", "END_LOCAL_DIRECTIVE", "END_METHOD_DIRECTIVE", "END_PACKED_SWITCH_DIRECTIVE", "END_PARAMETER_DIRECTIVE", "END_SPARSE_SWITCH_DIRECTIVE", "END_SUBANNOTATION_DIRECTIVE", "ENUM_DIRECTIVE", "EPILOGUE_DIRECTIVE", "EQUAL", "ESCAPE_SEQUENCE", "FIELD_DIRECTIVE", "FIELD_OFFSET", "FLOAT_LITERAL", "FLOAT_LITERAL_OR_ID", "HEX_DIGIT", "HEX_DIGITS", "HEX_PREFIX", "IMPLEMENTS_DIRECTIVE", "INLINE_INDEX", "INSTRUCTION_FORMAT10t", "INSTRUCTION_FORMAT10x", "INSTRUCTION_FORMAT10x_ODEX", "INSTRUCTION_FORMAT11n", "INSTRUCTION_FORMAT11x", "INSTRUCTION_FORMAT12x", "INSTRUCTION_FORMAT12x_OR_ID", "INSTRUCTION_FORMAT20bc", "INSTRUCTION_FORMAT20t", "INSTRUCTION_FORMAT21c_FIELD", "INSTRUCTION_FORMAT21c_FIELD_ODEX", "INSTRUCTION_FORMAT21c_STRING", "INSTRUCTION_FORMAT21c_TYPE", "INSTRUCTION_FORMAT21h", "INSTRUCTION_FORMAT21s", "INSTRUCTION_FORMAT21t", "INSTRUCTION_FORMAT22b", "INSTRUCTION_FORMAT22c_FIELD", "INSTRUCTION_FORMAT22c_FIELD_ODEX", "INSTRUCTION_FORMAT22c_TYPE", "INSTRUCTION_FORMAT22cs_FIELD", "INSTRUCTION_FORMAT22s", "INSTRUCTION_FORMAT22s_OR_ID", "INSTRUCTION_FORMAT22t", "INSTRUCTION_FORMAT22x", "INSTRUCTION_FORMAT23x", "INSTRUCTION_FORMAT30t", "INSTRUCTION_FORMAT31c", "INSTRUCTION_FORMAT31i", "INSTRUCTION_FORMAT31i_OR_ID", "INSTRUCTION_FORMAT31t", "INSTRUCTION_FORMAT32x", "INSTRUCTION_FORMAT35c_METHOD", "INSTRUCTION_FORMAT35c_METHOD_ODEX", "INSTRUCTION_FORMAT35c_TYPE", "INSTRUCTION_FORMAT35mi_METHOD", "INSTRUCTION_FORMAT35ms_METHOD", "INSTRUCTION_FORMAT3rc_METHOD", "INSTRUCTION_FORMAT3rc_METHOD_ODEX", "INSTRUCTION_FORMAT3rc_TYPE", "INSTRUCTION_FORMAT3rmi_METHOD", "INSTRUCTION_FORMAT3rms_METHOD", "INSTRUCTION_FORMAT51l", "INVALID_TOKEN", "LINE_COMMENT", "LINE_DIRECTIVE", "LOCAL_DIRECTIVE", "LOCALS_DIRECTIVE", "LONG_LITERAL", "METHOD_DIRECTIVE", "METHOD_NAME", "NEGATIVE_INTEGER_LITERAL", "NULL_LITERAL", "OFFSET", "OPEN_BRACE", "OPEN_PAREN", "PACKED_SWITCH_DIRECTIVE", "PARAM_LIST", "PARAM_LIST_OR_ID", "PARAMETER_DIRECTIVE", "POSITIVE_INTEGER_LITERAL", "PRIMITIVE_TYPE", "PROLOGUE_DIRECTIVE", "REGISTER", "REGISTERS_DIRECTIVE", "RESTART_LOCAL_DIRECTIVE", "SHORT_LITERAL", "SIMPLE_NAME", "SOURCE_DIRECTIVE", "SPARSE_SWITCH_DIRECTIVE", "STRING_LITERAL", "SUBANNOTATION_DIRECTIVE", "SUPER_DIRECTIVE", "VERIFICATION_ERROR_TYPE", "VOID_TYPE", "VTABLE_INDEX", "WHITE_SPACE", "LABEL", "INTEGER_LITERAL", "I_CLASS_DEF", "I_SUPER", "I_IMPLEMENTS", "I_SOURCE", "I_ACCESS_LIST", "I_METHODS", "I_FIELDS", "I_FIELD", "I_FIELD_TYPE", "I_FIELD_INITIAL_VALUE", "I_METHOD", "I_METHOD_PROTOTYPE", "I_METHOD_RETURN_TYPE", "I_REGISTERS", "I_LOCALS", "I_LABELS", "I_LABEL", "I_ANNOTATIONS", "I_ANNOTATION", "I_ANNOTATION_ELEMENT", "I_SUBANNOTATION", "I_ENCODED_FIELD", "I_ENCODED_METHOD", "I_ENCODED_ENUM", "I_ENCODED_ARRAY", "I_ARRAY_ELEMENT_SIZE", "I_ARRAY_ELEMENTS", "I_PACKED_SWITCH_START_KEY", "I_PACKED_SWITCH_TARGET_COUNT", "I_PACKED_SWITCH_TARGETS", "I_PACKED_SWITCH_DECLARATION", "I_PACKED_SWITCH_DECLARATIONS", "I_SPARSE_SWITCH_KEYS", "I_SPARSE_SWITCH_TARGET_COUNT", "I_SPARSE_SWITCH_TARGETS", "I_SPARSE_SWITCH_DECLARATION", "I_SPARSE_SWITCH_DECLARATIONS", "I_ADDRESS", "I_CATCH", "I_CATCHALL", "I_CATCHES", "I_PARAMETER", "I_PARAMETERS", "I_PARAMETER_NOT_SPECIFIED", "I_ORDERED_DEBUG_DIRECTIVES", "I_LINE", "I_LOCAL", "I_END_LOCAL", "I_RESTART_LOCAL", "I_PROLOGUE", "I_EPILOGUE", "I_STATEMENTS", "I_STATEMENT_FORMAT10t", "I_STATEMENT_FORMAT10x", "I_STATEMENT_FORMAT11n", "I_STATEMENT_FORMAT11x", "I_STATEMENT_FORMAT12x", "I_STATEMENT_FORMAT20bc", "I_STATEMENT_FORMAT20t", "I_STATEMENT_FORMAT21c_TYPE", "I_STATEMENT_FORMAT21c_FIELD", "I_STATEMENT_FORMAT21c_STRING", "I_STATEMENT_FORMAT21h", "I_STATEMENT_FORMAT21s", "I_STATEMENT_FORMAT21t", "I_STATEMENT_FORMAT22b", "I_STATEMENT_FORMAT22c_FIELD", "I_STATEMENT_FORMAT22c_TYPE", "I_STATEMENT_FORMAT22s", "I_STATEMENT_FORMAT22t", "I_STATEMENT_FORMAT22x", "I_STATEMENT_FORMAT23x", "I_STATEMENT_FORMAT30t", "I_STATEMENT_FORMAT31c", "I_STATEMENT_FORMAT31i", "I_STATEMENT_FORMAT31t", "I_STATEMENT_FORMAT32x", "I_STATEMENT_FORMAT35c_METHOD", "I_STATEMENT_FORMAT35c_TYPE", "I_STATEMENT_FORMAT3rc_METHOD", "I_STATEMENT_FORMAT3rc_TYPE", "I_STATEMENT_FORMAT51l", "I_STATEMENT_ARRAY_DATA", "I_STATEMENT_PACKED_SWITCH", "I_STATEMENT_SPARSE_SWITCH", "I_REGISTER_RANGE", "I_REGISTER_LIST", "INSTRUCTION_FORMAT41c_FIELD", "INSTRUCTION_FORMAT41c_FIELD_ODEX", "INSTRUCTION_FORMAT41c_TYPE", "INSTRUCTION_FORMAT52c_FIELD", "INSTRUCTION_FORMAT52c_FIELD_ODEX", "INSTRUCTION_FORMAT52c_TYPE", "INSTRUCTION_FORMAT5rc_METHOD", "INSTRUCTION_FORMAT5rc_METHOD_ODEX", "INSTRUCTION_FORMAT5rc_TYPE"
    };

    public static final int EOF=-1;
    public static final int I_REGISTER_LIST=223;
    public static final int I_STATEMENT_FORMAT51l=218;
    public static final int SPARSE_SWITCH_DIRECTIVE=127;
    public static final int END_PARAMETER_DIRECTIVE=42;
    public static final int I_ORDERED_DEBUG_DIRECTIVES=181;
    public static final int BINARY_EXPONENT=20;
    public static final int INSTRUCTION_FORMAT11x=62;
    public static final int ANNOTATION_VISIBILITY=6;
    public static final int INVALID_TOKEN=101;
    public static final int HEX_PREFIX=55;
    public static final int END_SUBANNOTATION_DIRECTIVE=44;
    public static final int I_STATEMENT_FORMAT12x=193;
    public static final int I_METHOD=147;
    public static final int I_SUBANNOTATION=157;
    public static final int INSTRUCTION_FORMAT11n=61;
    public static final int I_SPARSE_SWITCH_TARGETS=171;
    public static final int I_PACKED_SWITCH_TARGET_COUNT=165;
    public static final int STRING_LITERAL=128;
    public static final int SHORT_LITERAL=124;
    public static final int I_FIELD_INITIAL_VALUE=146;
    public static final int INSTRUCTION_FORMAT10x=59;
    public static final int I_PACKED_SWITCH_DECLARATION=167;
    public static final int I_STATEMENT_FORMAT11n=191;
    public static final int I_SUPER=138;
    public static final int INSTRUCTION_FORMAT10t=58;
    public static final int NEGATIVE_INTEGER_LITERAL=109;
    public static final int I_STATEMENT_FORMAT11x=192;
    public static final int INSTRUCTION_FORMAT21c_TYPE=70;
    public static final int REGISTER=121;
    public static final int LOCAL_DIRECTIVE=104;
    public static final int I_LINE=182;
    public static final int LOCALS_DIRECTIVE=105;
    public static final int I_CATCHALL=176;
    public static final int INSTRUCTION_FORMAT35c_TYPE=92;
    public static final int INSTRUCTION_FORMAT31i_OR_ID=87;
    public static final int I_PARAMETERS=179;
    public static final int I_METHOD_RETURN_TYPE=149;
    public static final int INSTRUCTION_FORMAT51l=100;
    public static final int ENUM_DIRECTIVE=45;
    public static final int NULL_LITERAL=110;
    public static final int REGISTERS_DIRECTIVE=122;
    public static final int BASE_SIMPLE_NAME=17;
    public static final int END_ARRAY_DATA_DIRECTIVE=37;
    public static final int I_STATEMENT_FORMAT21c_FIELD=197;
    public static final int I_METHOD_PROTOTYPE=148;
    public static final int EPILOGUE_DIRECTIVE=46;
    public static final int INSTRUCTION_FORMAT35mi_METHOD=93;
    public static final int I_LOCALS=151;
    public static final int RESTART_LOCAL_DIRECTIVE=123;
    public static final int I_ENCODED_ARRAY=161;
    public static final int POSITIVE_INTEGER_LITERAL=118;
    public static final int BASE_PRIMITIVE_TYPE=16;
    public static final int CATCH_DIRECTIVE=23;
    public static final int I_CATCH=175;
    public static final int I_PARAMETER_NOT_SPECIFIED=180;
    public static final int INSTRUCTION_FORMAT21h=71;
    public static final int I_ANNOTATION=155;
    public static final int INSTRUCTION_FORMAT21s=72;
    public static final int INSTRUCTION_FORMAT21t=73;
    public static final int WHITE_SPACE=134;
    public static final int INSTRUCTION_FORMAT3rmi_METHOD=98;
    public static final int INSTRUCTION_FORMAT22b=74;
    public static final int INSTRUCTION_FORMAT20t=66;
    public static final int OFFSET=111;
    public static final int FLOAT_LITERAL_OR_ID=52;
    public static final int INSTRUCTION_FORMAT20bc=65;
    public static final int I_PACKED_SWITCH_START_KEY=164;
    public static final int I_ACCESS_LIST=141;
    public static final int I_REGISTERS=150;
    public static final int IMPLEMENTS_DIRECTIVE=56;
    public static final int SOURCE_DIRECTIVE=126;
    public static final int CLASS_DIRECTIVE=27;
    public static final int BASE_CHAR_LITERAL=11;
    public static final int I_STATEMENT_FORMAT35c_METHOD=214;
    public static final int I_STATEMENT_SPARSE_SWITCH=221;
    public static final int BASE_STRING_LITERAL=18;
    public static final int INSTRUCTION_FORMAT23x=83;
    public static final int HEX_DIGIT=53;
    public static final int OPEN_PAREN=113;
    public static final int END_PACKED_SWITCH_DIRECTIVE=41;
    public static final int CLOSE_BRACE=28;
    public static final int I_EPILOGUE=187;
    public static final int LONG_LITERAL=106;
    public static final int I_METHODS=142;
    public static final int INSTRUCTION_FORMAT22c_FIELD=75;
    public static final int ACCESS_SPEC=4;
    public static final int END_FIELD_DIRECTIVE=38;
    public static final int I_IMPLEMENTS=139;
    public static final int COLON=30;
    public static final int I_STATEMENT_FORMAT23x=208;
    public static final int INSTRUCTION_FORMAT35ms_METHOD=94;
    public static final int CHAR_LITERAL=25;
    public static final int INSTRUCTION_FORMAT22s=79;
    public static final int VOID_TYPE=132;
    public static final int INSTRUCTION_FORMAT22t=81;
    public static final int CLASS_DESCRIPTOR=26;
    public static final int ARROW=9;
    public static final int INSTRUCTION_FORMAT22x=82;
    public static final int INSTRUCTION_FORMAT12x=63;
    public static final int I_LOCAL=183;
    public static final int I_REGISTER_RANGE=222;
    public static final int INSTRUCTION_FORMAT32x=89;
    public static final int I_STATEMENT_FORMAT22b=202;
    public static final int ANNOTATION_DIRECTIVE=5;
    public static final int END_ANNOTATION_DIRECTIVE=36;
    public static final int I_SPARSE_SWITCH_TARGET_COUNT=170;
    public static final int DOUBLE_LITERAL=34;
    public static final int I_STATEMENT_FORMAT22s=205;
    public static final int VTABLE_INDEX=133;
    public static final int I_STATEMENT_FORMAT22t=206;
    public static final int I_STATEMENT_FORMAT32x=213;
    public static final int END_LOCAL_DIRECTIVE=39;
    public static final int BASE_FLOAT_OR_ID=14;
    public static final int BASE_INTEGER=15;
    public static final int I_STATEMENT_FORMAT22x=207;
    public static final int I_STATEMENT_FORMAT21c_STRING=198;
    public static final int INSTRUCTION_FORMAT12x_OR_ID=64;
    public static final int I_STATEMENT_FORMAT31c=210;
    public static final int I_STATEMENT_FORMAT31i=211;
    public static final int I_STATEMENT_FORMAT21h=199;
    public static final int I_ANNOTATIONS=154;
    public static final int CATCHALL_DIRECTIVE=24;
    public static final int PRIMITIVE_TYPE=119;
    public static final int I_STATEMENT_FORMAT21s=200;
    public static final int DOUBLE_LITERAL_OR_ID=35;
    public static final int I_STATEMENT_FORMAT31t=212;
    public static final int I_SOURCE=140;
    public static final int CLOSE_PAREN=29;
    public static final int I_SPARSE_SWITCH_DECLARATIONS=173;
    public static final int VERIFICATION_ERROR_TYPE=131;
    public static final int ARRAY_DESCRIPTOR=8;
    public static final int INSTRUCTION_FORMAT3rc_METHOD_ODEX=96;
    public static final int I_ADDRESS=174;
    public static final int I_STATEMENT_FORMAT21t=201;
    public static final int I_STATEMENTS=188;
    public static final int INSTRUCTION_FORMAT31c=85;
    public static final int SUBANNOTATION_DIRECTIVE=129;
    public static final int INLINE_INDEX=57;
    public static final int LINE_COMMENT=102;
    public static final int I_PARAMETER=178;
    public static final int I_ARRAY_ELEMENTS=163;
    public static final int I_SPARSE_SWITCH_DECLARATION=172;
    public static final int INSTRUCTION_FORMAT30t=84;
    public static final int I_STATEMENT_FORMAT21c_TYPE=196;
    public static final int BOOL_LITERAL=21;
    public static final int I_STATEMENT_FORMAT20t=195;
    public static final int I_STATEMENT_FORMAT3rc_TYPE=217;
    public static final int BASE_FLOAT=13;
    public static final int METHOD_NAME=108;
    public static final int I_ANNOTATION_ELEMENT=156;
    public static final int PACKED_SWITCH_DIRECTIVE=114;
    public static final int PARAMETER_DIRECTIVE=117;
    public static final int ARRAY_DATA_DIRECTIVE=7;
    public static final int DECIMAL_EXPONENT=32;
    public static final int PROLOGUE_DIRECTIVE=120;
    public static final int INTEGER_LITERAL=136;
    public static final int I_SPARSE_SWITCH_KEYS=169;
    public static final int INSTRUCTION_FORMAT10x_ODEX=60;
    public static final int INSTRUCTION_FORMAT31t=88;
    public static final int I_RESTART_LOCAL=185;
    public static final int INSTRUCTION_FORMAT31i=86;
    public static final int METHOD_DIRECTIVE=107;
    public static final int I_ENCODED_FIELD=158;
    public static final int INSTRUCTION_FORMAT22c_TYPE=77;
    public static final int INSTRUCTION_FORMAT35c_METHOD=90;
    public static final int I_END_LOCAL=184;
    public static final int INSTRUCTION_FORMAT3rc_METHOD=95;
    public static final int BASE_ARRAY_DESCRIPTOR=10;
    public static final int INSTRUCTION_FORMAT22s_OR_ID=80;
    public static final int I_CATCHES=177;
    public static final int SUPER_DIRECTIVE=130;
    public static final int DOTDOT=33;
    public static final int END_SPARSE_SWITCH_DIRECTIVE=43;
    public static final int I_ENCODED_METHOD=159;
    public static final int INSTRUCTION_FORMAT21c_FIELD=67;
    public static final int INSTRUCTION_FORMAT35c_METHOD_ODEX=91;
    public static final int I_ARRAY_ELEMENT_SIZE=162;
    public static final int I_FIELDS=143;
    public static final int I_STATEMENT_FORMAT20bc=194;
    public static final int I_LABELS=152;
    public static final int ESCAPE_SEQUENCE=48;
    public static final int I_STATEMENT_FORMAT35c_TYPE=215;
    public static final int BYTE_LITERAL=22;
    public static final int COMMA=31;
    public static final int I_CLASS_DEF=137;
    public static final int EQUAL=47;
    public static final int PARAM_LIST_OR_ID=116;
    public static final int I_FIELD=144;
    public static final int I_STATEMENT_PACKED_SWITCH=220;
    public static final int I_STATEMENT_FORMAT22c_FIELD=203;
    public static final int FIELD_OFFSET=50;
    public static final int FIELD_DIRECTIVE=49;
    public static final int INSTRUCTION_FORMAT3rc_TYPE=97;
    public static final int INSTRUCTION_FORMAT21c_FIELD_ODEX=68;
    public static final int I_STATEMENT_FORMAT10x=190;
    public static final int I_LABEL=153;
    public static final int I_STATEMENT_ARRAY_DATA=219;
    public static final int END_METHOD_DIRECTIVE=40;
    public static final int I_STATEMENT_FORMAT10t=189;
    public static final int I_PROLOGUE=186;
    public static final int I_ENCODED_ENUM=160;
    public static final int I_PACKED_SWITCH_DECLARATIONS=168;
    public static final int I_STATEMENT_FORMAT30t=209;
    public static final int I_FIELD_TYPE=145;
    public static final int FLOAT_LITERAL=51;
    public static final int INSTRUCTION_FORMAT21c_STRING=69;
    public static final int PARAM_LIST=115;
    public static final int SIMPLE_NAME=125;
    public static final int I_PACKED_SWITCH_TARGETS=166;
    public static final int BASE_CLASS_DESCRIPTOR=12;
    public static final int LINE_DIRECTIVE=103;
    public static final int INSTRUCTION_FORMAT22cs_FIELD=78;
    public static final int LABEL=135;
    public static final int BASE_TYPE=19;
    public static final int I_STATEMENT_FORMAT3rc_METHOD=216;
    public static final int HEX_DIGITS=54;
    public static final int INSTRUCTION_FORMAT22c_FIELD_ODEX=76;
    public static final int INSTRUCTION_FORMAT3rms_METHOD=99;
    public static final int OPEN_BRACE=112;
    public static final int I_STATEMENT_FORMAT22c_TYPE=204;
    public static final int INSTRUCTION_FORMAT41c_FIELD=224;
    public static final int INSTRUCTION_FORMAT41c_FIELD_ODEX=225;
    public static final int INSTRUCTION_FORMAT41c_TYPE=226;
    public static final int INSTRUCTION_FORMAT52c_FIELD=227;
    public static final int INSTRUCTION_FORMAT52c_FIELD_ODEX=228;
    public static final int INSTRUCTION_FORMAT52c_TYPE=229;
    public static final int INSTRUCTION_FORMAT5rc_METHOD=230;
    public static final int INSTRUCTION_FORMAT5rc_METHOD_ODEX=231;
    public static final int INSTRUCTION_FORMAT5rc_TYPE=232;

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
    // smaliIdeaParser.g:132:1: sync[boolean toEof] :;
    public final void sync(boolean toEof) throws RecognitionException {
         syncToFollows(toEof); 
        try {
            // smaliIdeaParser.g:134:5: ()
            // smaliIdeaParser.g:134:18: 
            {
            }

        }
        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "sync"



    // $ANTLR start "smali_file"
    // smaliIdeaParser.g:137:1: smali_file : ( class_element sync[true] )+ EOF ;
    public final void smali_file() throws RecognitionException {
        try {
            // smaliIdeaParser.g:138:2: ( ( class_element sync[true] )+ EOF )
            // smaliIdeaParser.g:139:2: ( class_element sync[true] )+ EOF
            {
            // smaliIdeaParser.g:139:2: ( class_element sync[true] )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ANNOTATION_DIRECTIVE||LA1_0==CLASS_DIRECTIVE||LA1_0==FIELD_DIRECTIVE||LA1_0==IMPLEMENTS_DIRECTIVE||LA1_0==METHOD_DIRECTIVE||LA1_0==SOURCE_DIRECTIVE||LA1_0==SUPER_DIRECTIVE) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // smaliIdeaParser.g:139:3: class_element sync[true]
            	    {
            	    pushFollow(FOLLOW_class_element_in_smali_file65);
            	    class_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_sync_in_smali_file67);
            	    sync(true);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_smali_file73); if (state.failed) return ;

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
    // $ANTLR end "smali_file"



    // $ANTLR start "class_element"
    // smaliIdeaParser.g:142:1: class_element : ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation ) ;
    public final void class_element() throws RecognitionException {
        try {
            // smaliIdeaParser.g:143:5: ( ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation ) )
            // smaliIdeaParser.g:144:5: ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation )
            {
            // smaliIdeaParser.g:144:5: ( class_spec | super_spec | implements_spec | source_spec | method | field | annotation )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // smaliIdeaParser.g:144:9: class_spec
                    {
                    pushFollow(FOLLOW_class_spec_in_class_element93);
                    class_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:145:7: super_spec
                    {
                    pushFollow(FOLLOW_super_spec_in_class_element101);
                    super_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:146:7: implements_spec
                    {
                    pushFollow(FOLLOW_implements_spec_in_class_element109);
                    implements_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:147:7: source_spec
                    {
                    pushFollow(FOLLOW_source_spec_in_class_element117);
                    source_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:148:7: method
                    {
                    pushFollow(FOLLOW_method_in_class_element125);
                    method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:149:7: field
                    {
                    pushFollow(FOLLOW_field_in_class_element133);
                    field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:150:7: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_class_element141);
                    annotation();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "class_element"



    // $ANTLR start "class_spec"
    // smaliIdeaParser.g:152:1: class_spec : CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR ;
    public final void class_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:154:2: ( CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:154:4: CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR
            {
            match(input,CLASS_DIRECTIVE,FOLLOW_CLASS_DIRECTIVE_in_class_spec160); if (state.failed) return ;

            pushFollow(FOLLOW_access_list_in_class_spec162);
            access_list();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_class_spec164); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "class_spec"



    // $ANTLR start "super_spec"
    // smaliIdeaParser.g:157:1: super_spec : SUPER_DIRECTIVE CLASS_DESCRIPTOR ;
    public final void super_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:159:2: ( SUPER_DIRECTIVE CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:159:4: SUPER_DIRECTIVE CLASS_DESCRIPTOR
            {
            match(input,SUPER_DIRECTIVE,FOLLOW_SUPER_DIRECTIVE_in_super_spec187); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_super_spec189); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "super_spec"



    // $ANTLR start "implements_spec"
    // smaliIdeaParser.g:162:1: implements_spec : IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR ;
    public final void implements_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:164:2: ( IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:164:4: IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR
            {
            match(input,IMPLEMENTS_DIRECTIVE,FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec215); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_implements_spec217); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "implements_spec"



    // $ANTLR start "source_spec"
    // smaliIdeaParser.g:167:1: source_spec : SOURCE_DIRECTIVE STRING_LITERAL ;
    public final void source_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:169:2: ( SOURCE_DIRECTIVE STRING_LITERAL )
            // smaliIdeaParser.g:169:4: SOURCE_DIRECTIVE STRING_LITERAL
            {
            match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_spec243); if (state.failed) return ;

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_spec245); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "source_spec"



    // $ANTLR start "access_list"
    // smaliIdeaParser.g:172:1: access_list : ( ACCESS_SPEC )* ;
    public final void access_list() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:174:2: ( ( ACCESS_SPEC )* )
            // smaliIdeaParser.g:174:4: ( ACCESS_SPEC )*
            {
            // smaliIdeaParser.g:174:4: ( ACCESS_SPEC )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ACCESS_SPEC) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==ACCESS_SPEC||LA3_2==ANNOTATION_VISIBILITY||LA3_2==BOOL_LITERAL||LA3_2==CLASS_DESCRIPTOR||LA3_2==DOUBLE_LITERAL_OR_ID||LA3_2==FLOAT_LITERAL_OR_ID||(LA3_2 >= INSTRUCTION_FORMAT10t && LA3_2 <= INSTRUCTION_FORMAT10x_ODEX)||LA3_2==INSTRUCTION_FORMAT11x||LA3_2==INSTRUCTION_FORMAT12x_OR_ID||(LA3_2 >= INSTRUCTION_FORMAT21c_FIELD && LA3_2 <= INSTRUCTION_FORMAT21c_TYPE)||LA3_2==INSTRUCTION_FORMAT21t||(LA3_2 >= INSTRUCTION_FORMAT22c_FIELD && LA3_2 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA3_2 >= INSTRUCTION_FORMAT22s_OR_ID && LA3_2 <= INSTRUCTION_FORMAT22t)||LA3_2==INSTRUCTION_FORMAT23x||(LA3_2 >= INSTRUCTION_FORMAT31i_OR_ID && LA3_2 <= INSTRUCTION_FORMAT31t)||(LA3_2 >= INSTRUCTION_FORMAT35c_METHOD && LA3_2 <= INSTRUCTION_FORMAT35ms_METHOD)||LA3_2==INSTRUCTION_FORMAT51l||(LA3_2 >= METHOD_NAME && LA3_2 <= NULL_LITERAL)||LA3_2==PARAM_LIST_OR_ID||(LA3_2 >= POSITIVE_INTEGER_LITERAL && LA3_2 <= PRIMITIVE_TYPE)||LA3_2==REGISTER||LA3_2==SIMPLE_NAME||(LA3_2 >= VERIFICATION_ERROR_TYPE && LA3_2 <= VOID_TYPE)||LA3_2==INTEGER_LITERAL) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // smaliIdeaParser.g:174:4: ACCESS_SPEC
            	    {
            	    match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_access_list268); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
        return ;
    }
    // $ANTLR end "access_list"



    // $ANTLR start "field"
    // smaliIdeaParser.g:182:1: field : FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |) ;
    public final void field() throws RecognitionException {

                Marker marker = mark();
                Marker annotationsMarker = null;
                boolean classAnnotations = true;
            
        try {
            // smaliIdeaParser.g:188:5: ( FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |) )
            // smaliIdeaParser.g:188:9: FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |)
            {
            match(input,FIELD_DIRECTIVE,FOLLOW_FIELD_DIRECTIVE_in_field303); if (state.failed) return ;

            pushFollow(FOLLOW_access_list_in_field305);
            access_list();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_field307);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_field309); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_field311);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            // smaliIdeaParser.g:188:79: ( EQUAL literal )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EQUAL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // smaliIdeaParser.g:188:80: EQUAL literal
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_field314); if (state.failed) return ;

                    pushFollow(FOLLOW_literal_in_field316);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // smaliIdeaParser.g:189:9: ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |)
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
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;

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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // smaliIdeaParser.g:189:13: END_FIELD_DIRECTIVE
                    {
                    match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field332); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:190:13: ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? )
                    {
                    // smaliIdeaParser.g:190:38: ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? )
                    // smaliIdeaParser.g:190:40: ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )?
                    {
                    if ( state.backtracking==0 ) {annotationsMarker = mark();}

                    // smaliIdeaParser.g:190:70: ( ( ANNOTATION_DIRECTIVE )=> annotation )+
                    int cnt5=0;
                    loop5:
                    do {
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
                    	    // smaliIdeaParser.g:190:71: ( ANNOTATION_DIRECTIVE )=> annotation
                    	    {
                    	    pushFollow(FOLLOW_annotation_in_field361);
                    	    annotation();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    // smaliIdeaParser.g:191:40: ( END_FIELD_DIRECTIVE )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==END_FIELD_DIRECTIVE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // smaliIdeaParser.g:191:41: END_FIELD_DIRECTIVE
                            {
                            match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field405); if (state.failed) return ;

                            if ( state.backtracking==0 ) {classAnnotations = false;}

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:194:9: 
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
        return ;
    }
    // $ANTLR end "field"



    // $ANTLR start "method"
    // smaliIdeaParser.g:210:1: method : METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE ;
    public final void method() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:212:2: ( METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE )
            // smaliIdeaParser.g:212:4: METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE
            {
            match(input,METHOD_DIRECTIVE,FOLLOW_METHOD_DIRECTIVE_in_method499); if (state.failed) return ;

            pushFollow(FOLLOW_access_list_in_method501);
            access_list();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_method_name_in_method503);
            method_name();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_method_prototype_in_method505);
            method_prototype();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_statements_and_directives_in_method507);
            statements_and_directives();

            state._fsp--;
            if (state.failed) return ;

            match(input,END_METHOD_DIRECTIVE,FOLLOW_END_METHOD_DIRECTIVE_in_method509); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "method"



    // $ANTLR start "statements_and_directives"
    // smaliIdeaParser.g:215:1: statements_and_directives : ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )* ;
    public final void statements_and_directives() throws RecognitionException {
        try {
            // smaliIdeaParser.g:216:2: ( ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )* )
            // smaliIdeaParser.g:216:4: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )*
            {
            // smaliIdeaParser.g:216:4: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ANNOTATION_DIRECTIVE||LA9_0==ARRAY_DATA_DIRECTIVE||(LA9_0 >= CATCH_DIRECTIVE && LA9_0 <= CATCHALL_DIRECTIVE)||LA9_0==COLON||LA9_0==END_LOCAL_DIRECTIVE||LA9_0==EPILOGUE_DIRECTIVE||(LA9_0 >= INSTRUCTION_FORMAT10t && LA9_0 <= INSTRUCTION_FORMAT51l)||(LA9_0 >= LINE_DIRECTIVE && LA9_0 <= LOCALS_DIRECTIVE)||LA9_0==PACKED_SWITCH_DIRECTIVE||LA9_0==PARAMETER_DIRECTIVE||LA9_0==PROLOGUE_DIRECTIVE||(LA9_0 >= REGISTERS_DIRECTIVE && LA9_0 <= RESTART_LOCAL_DIRECTIVE)||(LA9_0 >= SOURCE_DIRECTIVE && LA9_0 <= SPARSE_SWITCH_DIRECTIVE)||(LA9_0 >= INSTRUCTION_FORMAT41c_FIELD && LA9_0 <= INSTRUCTION_FORMAT5rc_TYPE)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // smaliIdeaParser.g:216:5: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false]
            	    {
            	    // smaliIdeaParser.g:216:5: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )
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
            	    case INSTRUCTION_FORMAT21h:
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
            	    case INSTRUCTION_FORMAT41c_FIELD:
            	    case INSTRUCTION_FORMAT41c_FIELD_ODEX:
            	    case INSTRUCTION_FORMAT41c_TYPE:
            	    case INSTRUCTION_FORMAT52c_FIELD:
            	    case INSTRUCTION_FORMAT52c_FIELD_ODEX:
            	    case INSTRUCTION_FORMAT52c_TYPE:
            	    case INSTRUCTION_FORMAT5rc_METHOD:
            	    case INSTRUCTION_FORMAT5rc_METHOD_ODEX:
            	    case INSTRUCTION_FORMAT5rc_TYPE:
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
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // smaliIdeaParser.g:216:7: instruction
            	            {
            	            pushFollow(FOLLOW_instruction_in_statements_and_directives526);
            	            instruction();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // smaliIdeaParser.g:217:5: registers_directive
            	            {
            	            pushFollow(FOLLOW_registers_directive_in_statements_and_directives532);
            	            registers_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // smaliIdeaParser.g:218:5: label
            	            {
            	            pushFollow(FOLLOW_label_in_statements_and_directives538);
            	            label();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // smaliIdeaParser.g:219:5: catch_directive
            	            {
            	            pushFollow(FOLLOW_catch_directive_in_statements_and_directives544);
            	            catch_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 5 :
            	            // smaliIdeaParser.g:220:5: catchall_directive
            	            {
            	            pushFollow(FOLLOW_catchall_directive_in_statements_and_directives550);
            	            catchall_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 6 :
            	            // smaliIdeaParser.g:221:5: parameter_directive
            	            {
            	            pushFollow(FOLLOW_parameter_directive_in_statements_and_directives556);
            	            parameter_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 7 :
            	            // smaliIdeaParser.g:222:5: ordered_debug_directive
            	            {
            	            pushFollow(FOLLOW_ordered_debug_directive_in_statements_and_directives562);
            	            ordered_debug_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 8 :
            	            // smaliIdeaParser.g:223:5: annotation
            	            {
            	            pushFollow(FOLLOW_annotation_in_statements_and_directives568);
            	            annotation();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_sync_in_statements_and_directives574);
            	    sync(false);

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


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
    // $ANTLR end "statements_and_directives"



    // $ANTLR start "registers_directive"
    // smaliIdeaParser.g:226:1: registers_directive : ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal ) ;
    public final void registers_directive() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:228:2: ( ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal ) )
            // smaliIdeaParser.g:228:4: ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal )
            {
            // smaliIdeaParser.g:228:4: ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==REGISTERS_DIRECTIVE) ) {
                alt10=1;
            }
            else if ( (LA10_0==LOCALS_DIRECTIVE) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // smaliIdeaParser.g:229:4: REGISTERS_DIRECTIVE integral_literal
                    {
                    match(input,REGISTERS_DIRECTIVE,FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive600); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_registers_directive602);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:230:5: LOCALS_DIRECTIVE integral_literal
                    {
                    match(input,LOCALS_DIRECTIVE,FOLLOW_LOCALS_DIRECTIVE_in_registers_directive608); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_registers_directive610);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "registers_directive"



    // $ANTLR start "simple_name"
    // smaliIdeaParser.g:236:1: simple_name : ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l );
    public final void simple_name() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:239:2: ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==ACCESS_SPEC||input.LA(1)==ANNOTATION_VISIBILITY||input.LA(1)==BOOL_LITERAL||input.LA(1)==DOUBLE_LITERAL_OR_ID||input.LA(1)==FLOAT_LITERAL_OR_ID||(input.LA(1) >= INSTRUCTION_FORMAT10t && input.LA(1) <= INSTRUCTION_FORMAT10x_ODEX)||input.LA(1)==INSTRUCTION_FORMAT11x||input.LA(1)==INSTRUCTION_FORMAT12x_OR_ID||(input.LA(1) >= INSTRUCTION_FORMAT21c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT21c_TYPE)||input.LA(1)==INSTRUCTION_FORMAT21t||(input.LA(1) >= INSTRUCTION_FORMAT22c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT22cs_FIELD)||(input.LA(1) >= INSTRUCTION_FORMAT22s_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT22t)||input.LA(1)==INSTRUCTION_FORMAT23x||(input.LA(1) >= INSTRUCTION_FORMAT31i_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT31t)||(input.LA(1) >= INSTRUCTION_FORMAT35c_METHOD && input.LA(1) <= INSTRUCTION_FORMAT35ms_METHOD)||input.LA(1)==INSTRUCTION_FORMAT51l||(input.LA(1) >= NEGATIVE_INTEGER_LITERAL && input.LA(1) <= NULL_LITERAL)||input.LA(1)==PARAM_LIST_OR_ID||(input.LA(1) >= POSITIVE_INTEGER_LITERAL && input.LA(1) <= PRIMITIVE_TYPE)||input.LA(1)==REGISTER||input.LA(1)==SIMPLE_NAME||(input.LA(1) >= VERIFICATION_ERROR_TYPE && input.LA(1) <= VOID_TYPE)||input.LA(1)==INTEGER_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
        return ;
    }
    // $ANTLR end "simple_name"



    // $ANTLR start "method_name"
    // smaliIdeaParser.g:281:1: method_name : ( simple_name | METHOD_NAME );
    public final void method_name() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:283:2: ( simple_name | METHOD_NAME )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ACCESS_SPEC||LA11_0==ANNOTATION_VISIBILITY||LA11_0==BOOL_LITERAL||LA11_0==DOUBLE_LITERAL_OR_ID||LA11_0==FLOAT_LITERAL_OR_ID||(LA11_0 >= INSTRUCTION_FORMAT10t && LA11_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA11_0==INSTRUCTION_FORMAT11x||LA11_0==INSTRUCTION_FORMAT12x_OR_ID||(LA11_0 >= INSTRUCTION_FORMAT21c_FIELD && LA11_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA11_0==INSTRUCTION_FORMAT21t||(LA11_0 >= INSTRUCTION_FORMAT22c_FIELD && LA11_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA11_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA11_0 <= INSTRUCTION_FORMAT22t)||LA11_0==INSTRUCTION_FORMAT23x||(LA11_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA11_0 <= INSTRUCTION_FORMAT31t)||(LA11_0 >= INSTRUCTION_FORMAT35c_METHOD && LA11_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA11_0==INSTRUCTION_FORMAT51l||(LA11_0 >= NEGATIVE_INTEGER_LITERAL && LA11_0 <= NULL_LITERAL)||LA11_0==PARAM_LIST_OR_ID||(LA11_0 >= POSITIVE_INTEGER_LITERAL && LA11_0 <= PRIMITIVE_TYPE)||LA11_0==REGISTER||LA11_0==SIMPLE_NAME||(LA11_0 >= VERIFICATION_ERROR_TYPE && LA11_0 <= VOID_TYPE)||LA11_0==INTEGER_LITERAL) ) {
                alt11=1;
            }
            else if ( (LA11_0==METHOD_NAME) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // smaliIdeaParser.g:283:4: simple_name
                    {
                    pushFollow(FOLLOW_simple_name_in_method_name873);
                    simple_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:284:4: METHOD_NAME
                    {
                    match(input,METHOD_NAME,FOLLOW_METHOD_NAME_in_method_name878); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "method_name"



    // $ANTLR start "method_prototype"
    // smaliIdeaParser.g:287:1: method_prototype : OPEN_PAREN param_list CLOSE_PAREN type_descriptor ;
    public final void method_prototype() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:289:2: ( OPEN_PAREN param_list CLOSE_PAREN type_descriptor )
            // smaliIdeaParser.g:289:4: OPEN_PAREN param_list CLOSE_PAREN type_descriptor
            {
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_method_prototype904); if (state.failed) return ;

            pushFollow(FOLLOW_param_list_in_method_prototype906);
            param_list();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_method_prototype908); if (state.failed) return ;

            pushFollow(FOLLOW_type_descriptor_in_method_prototype910);
            type_descriptor();

            state._fsp--;
            if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "method_prototype"



    // $ANTLR start "param_list"
    // smaliIdeaParser.g:292:1: param_list : ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* );
    public final void param_list() throws RecognitionException {
        try {
            // smaliIdeaParser.g:293:2: ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* )
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // smaliIdeaParser.g:293:4: PARAM_LIST
                    {
                    match(input,PARAM_LIST,FOLLOW_PARAM_LIST_in_param_list924); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:294:4: PARAM_LIST_OR_ID
                    {
                    match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_param_list929); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:295:4: ( nonvoid_type_descriptor )*
                    {
                    // smaliIdeaParser.g:295:4: ( nonvoid_type_descriptor )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==ARRAY_DESCRIPTOR||LA12_0==CLASS_DESCRIPTOR||LA12_0==PRIMITIVE_TYPE) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // smaliIdeaParser.g:295:4: nonvoid_type_descriptor
                    	    {
                    	    pushFollow(FOLLOW_nonvoid_type_descriptor_in_param_list934);
                    	    nonvoid_type_descriptor();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
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
    // smaliIdeaParser.g:297:1: type_descriptor : ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:298:2: ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==ARRAY_DESCRIPTOR||input.LA(1)==CLASS_DESCRIPTOR||input.LA(1)==PRIMITIVE_TYPE||input.LA(1)==VOID_TYPE ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:303:1: nonvoid_type_descriptor : ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void nonvoid_type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:304:2: ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==ARRAY_DESCRIPTOR||input.LA(1)==CLASS_DESCRIPTOR||input.LA(1)==PRIMITIVE_TYPE ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:308:1: reference_type_descriptor : ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void reference_type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:309:2: ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==ARRAY_DESCRIPTOR||input.LA(1)==CLASS_DESCRIPTOR ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:312:1: integer_literal : ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL );
    public final void integer_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:313:2: ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==NEGATIVE_INTEGER_LITERAL||input.LA(1)==POSITIVE_INTEGER_LITERAL||input.LA(1)==INTEGER_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:317:1: float_literal : ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL );
    public final void float_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:318:2: ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= FLOAT_LITERAL && input.LA(1) <= FLOAT_LITERAL_OR_ID) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:321:1: double_literal : ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL );
    public final void double_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:322:2: ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= DOUBLE_LITERAL && input.LA(1) <= DOUBLE_LITERAL_OR_ID) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:325:1: literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal );
    public final void literal() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:327:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal )
            int alt14=14;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt14=1;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
            case POSITIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
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
            case FLOAT_LITERAL:
            case FLOAT_LITERAL_OR_ID:
                {
                alt14=5;
                }
                break;
            case DOUBLE_LITERAL:
            case DOUBLE_LITERAL_OR_ID:
                {
                alt14=6;
                }
                break;
            case CHAR_LITERAL:
                {
                alt14=7;
                }
                break;
            case STRING_LITERAL:
                {
                alt14=8;
                }
                break;
            case BOOL_LITERAL:
                {
                alt14=9;
                }
                break;
            case NULL_LITERAL:
                {
                alt14=10;
                }
                break;
            case OPEN_BRACE:
                {
                alt14=11;
                }
                break;
            case SUBANNOTATION_DIRECTIVE:
                {
                alt14=12;
                }
                break;
            case ARRAY_DESCRIPTOR:
            case CLASS_DESCRIPTOR:
            case PRIMITIVE_TYPE:
            case VOID_TYPE:
                {
                alt14=13;
                }
                break;
            case ENUM_DIRECTIVE:
                {
                alt14=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // smaliIdeaParser.g:327:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_literal1059); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:328:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_literal1064);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:329:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_literal1069); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:330:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_literal1074); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:331:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_literal1079);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:332:4: double_literal
                    {
                    pushFollow(FOLLOW_double_literal_in_literal1084);
                    double_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:333:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal1089); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:334:4: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal1094); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // smaliIdeaParser.g:335:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_literal1099); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // smaliIdeaParser.g:336:4: NULL_LITERAL
                    {
                    match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_literal1104); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // smaliIdeaParser.g:337:4: array_literal
                    {
                    pushFollow(FOLLOW_array_literal_in_literal1109);
                    array_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // smaliIdeaParser.g:338:4: subannotation
                    {
                    pushFollow(FOLLOW_subannotation_in_literal1114);
                    subannotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // smaliIdeaParser.g:339:4: type_field_method_literal
                    {
                    pushFollow(FOLLOW_type_field_method_literal_in_literal1119);
                    type_field_method_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // smaliIdeaParser.g:340:4: enum_literal
                    {
                    pushFollow(FOLLOW_enum_literal_in_literal1124);
                    enum_literal();

                    state._fsp--;
                    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "literal"



    // $ANTLR start "integral_literal"
    // smaliIdeaParser.g:343:1: integral_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL );
    public final void integral_literal() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:345:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL )
            int alt15=5;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt15=1;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
            case POSITIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt15=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt15=3;
                }
                break;
            case CHAR_LITERAL:
                {
                alt15=4;
                }
                break;
            case BYTE_LITERAL:
                {
                alt15=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // smaliIdeaParser.g:345:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_integral_literal1147); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:346:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_integral_literal1152);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:347:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_integral_literal1157); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:348:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_integral_literal1162); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:349:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_integral_literal1167); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "integral_literal"



    // $ANTLR start "fixed_32bit_literal"
    // smaliIdeaParser.g:352:1: fixed_32bit_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL );
    public final void fixed_32bit_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:353:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL )
            int alt16=7;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt16=1;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
            case POSITIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt16=2;
                }
                break;
            case SHORT_LITERAL:
                {
                alt16=3;
                }
                break;
            case BYTE_LITERAL:
                {
                alt16=4;
                }
                break;
            case FLOAT_LITERAL:
            case FLOAT_LITERAL_OR_ID:
                {
                alt16=5;
                }
                break;
            case CHAR_LITERAL:
                {
                alt16=6;
                }
                break;
            case BOOL_LITERAL:
                {
                alt16=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // smaliIdeaParser.g:353:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1181); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:354:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_fixed_32bit_literal1186);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:355:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1191); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:356:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1196); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:357:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_fixed_32bit_literal1201);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:358:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1206); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:359:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1211); if (state.failed) return ;

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
    // smaliIdeaParser.g:361:1: fixed_literal : ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL );
    public final void fixed_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:362:2: ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL )
            int alt17=8;
            switch ( input.LA(1) ) {
            case NEGATIVE_INTEGER_LITERAL:
            case POSITIVE_INTEGER_LITERAL:
            case INTEGER_LITERAL:
                {
                alt17=1;
                }
                break;
            case LONG_LITERAL:
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
            case BOOL_LITERAL:
                {
                alt17=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // smaliIdeaParser.g:362:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_fixed_literal1220);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:363:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_literal1225); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:364:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_literal1230); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:365:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_literal1235); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:366:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_fixed_literal1240);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:367:4: double_literal
                    {
                    pushFollow(FOLLOW_double_literal_in_fixed_literal1245);
                    double_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:368:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_literal1250); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:369:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_literal1255); if (state.failed) return ;

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
    // smaliIdeaParser.g:371:1: array_literal : OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE ;
    public final void array_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:372:2: ( OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE )
            // smaliIdeaParser.g:372:4: OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE
            {
            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_array_literal1264); if (state.failed) return ;

            // smaliIdeaParser.g:372:15: ( literal ( COMMA literal )* |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ARRAY_DESCRIPTOR||(LA19_0 >= BOOL_LITERAL && LA19_0 <= BYTE_LITERAL)||(LA19_0 >= CHAR_LITERAL && LA19_0 <= CLASS_DESCRIPTOR)||(LA19_0 >= DOUBLE_LITERAL && LA19_0 <= DOUBLE_LITERAL_OR_ID)||LA19_0==ENUM_DIRECTIVE||(LA19_0 >= FLOAT_LITERAL && LA19_0 <= FLOAT_LITERAL_OR_ID)||LA19_0==LONG_LITERAL||(LA19_0 >= NEGATIVE_INTEGER_LITERAL && LA19_0 <= NULL_LITERAL)||LA19_0==OPEN_BRACE||(LA19_0 >= POSITIVE_INTEGER_LITERAL && LA19_0 <= PRIMITIVE_TYPE)||LA19_0==SHORT_LITERAL||(LA19_0 >= STRING_LITERAL && LA19_0 <= SUBANNOTATION_DIRECTIVE)||LA19_0==VOID_TYPE||LA19_0==INTEGER_LITERAL) ) {
                alt19=1;
            }
            else if ( (LA19_0==CLOSE_BRACE) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // smaliIdeaParser.g:372:16: literal ( COMMA literal )*
                    {
                    pushFollow(FOLLOW_literal_in_array_literal1267);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:372:24: ( COMMA literal )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // smaliIdeaParser.g:372:25: COMMA literal
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_array_literal1270); if (state.failed) return ;

                    	    pushFollow(FOLLOW_literal_in_array_literal1272);
                    	    literal();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:372:43: 
                    {
                    }
                    break;

            }


            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_array_literal1280); if (state.failed) return ;

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
    // smaliIdeaParser.g:374:1: annotation_element : simple_name EQUAL literal ;
    public final void annotation_element() throws RecognitionException {
        try {
            // smaliIdeaParser.g:375:2: ( simple_name EQUAL literal )
            // smaliIdeaParser.g:375:4: simple_name EQUAL literal
            {
            pushFollow(FOLLOW_simple_name_in_annotation_element1289);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,EQUAL,FOLLOW_EQUAL_in_annotation_element1291); if (state.failed) return ;

            pushFollow(FOLLOW_literal_in_annotation_element1293);
            literal();

            state._fsp--;
            if (state.failed) return ;

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
    // smaliIdeaParser.g:378:1: annotation : ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE ;
    public final void annotation() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:380:2: ( ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE )
            // smaliIdeaParser.g:380:4: ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE
            {
            match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1312); if (state.failed) return ;

            match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_annotation1314); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_annotation1316); if (state.failed) return ;

            // smaliIdeaParser.g:381:3: ( annotation_element )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ACCESS_SPEC||LA20_0==ANNOTATION_VISIBILITY||LA20_0==BOOL_LITERAL||LA20_0==DOUBLE_LITERAL_OR_ID||LA20_0==FLOAT_LITERAL_OR_ID||(LA20_0 >= INSTRUCTION_FORMAT10t && LA20_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA20_0==INSTRUCTION_FORMAT11x||LA20_0==INSTRUCTION_FORMAT12x_OR_ID||(LA20_0 >= INSTRUCTION_FORMAT21c_FIELD && LA20_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA20_0==INSTRUCTION_FORMAT21t||(LA20_0 >= INSTRUCTION_FORMAT22c_FIELD && LA20_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA20_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA20_0 <= INSTRUCTION_FORMAT22t)||LA20_0==INSTRUCTION_FORMAT23x||(LA20_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA20_0 <= INSTRUCTION_FORMAT31t)||(LA20_0 >= INSTRUCTION_FORMAT35c_METHOD && LA20_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA20_0==INSTRUCTION_FORMAT51l||(LA20_0 >= NEGATIVE_INTEGER_LITERAL && LA20_0 <= NULL_LITERAL)||LA20_0==PARAM_LIST_OR_ID||(LA20_0 >= POSITIVE_INTEGER_LITERAL && LA20_0 <= PRIMITIVE_TYPE)||LA20_0==REGISTER||LA20_0==SIMPLE_NAME||(LA20_0 >= VERIFICATION_ERROR_TYPE && LA20_0 <= VOID_TYPE)||LA20_0==INTEGER_LITERAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // smaliIdeaParser.g:381:3: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_annotation1320);
            	    annotation_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(input,END_ANNOTATION_DIRECTIVE,FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1323); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "annotation"



    // $ANTLR start "subannotation"
    // smaliIdeaParser.g:384:1: subannotation : SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE ;
    public final void subannotation() throws RecognitionException {
        try {
            // smaliIdeaParser.g:385:2: ( SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE )
            // smaliIdeaParser.g:385:4: SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE
            {
            match(input,SUBANNOTATION_DIRECTIVE,FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1337); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_subannotation1339); if (state.failed) return ;

            // smaliIdeaParser.g:385:45: ( annotation_element )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ACCESS_SPEC||LA21_0==ANNOTATION_VISIBILITY||LA21_0==BOOL_LITERAL||LA21_0==DOUBLE_LITERAL_OR_ID||LA21_0==FLOAT_LITERAL_OR_ID||(LA21_0 >= INSTRUCTION_FORMAT10t && LA21_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA21_0==INSTRUCTION_FORMAT11x||LA21_0==INSTRUCTION_FORMAT12x_OR_ID||(LA21_0 >= INSTRUCTION_FORMAT21c_FIELD && LA21_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_0==INSTRUCTION_FORMAT21t||(LA21_0 >= INSTRUCTION_FORMAT22c_FIELD && LA21_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA21_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA21_0 <= INSTRUCTION_FORMAT22t)||LA21_0==INSTRUCTION_FORMAT23x||(LA21_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA21_0 <= INSTRUCTION_FORMAT31t)||(LA21_0 >= INSTRUCTION_FORMAT35c_METHOD && LA21_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA21_0==INSTRUCTION_FORMAT51l||(LA21_0 >= NEGATIVE_INTEGER_LITERAL && LA21_0 <= NULL_LITERAL)||LA21_0==PARAM_LIST_OR_ID||(LA21_0 >= POSITIVE_INTEGER_LITERAL && LA21_0 <= PRIMITIVE_TYPE)||LA21_0==REGISTER||LA21_0==SIMPLE_NAME||(LA21_0 >= VERIFICATION_ERROR_TYPE && LA21_0 <= VOID_TYPE)||LA21_0==INTEGER_LITERAL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // smaliIdeaParser.g:385:45: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_subannotation1341);
            	    annotation_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,END_SUBANNOTATION_DIRECTIVE,FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1344); if (state.failed) return ;

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
    // smaliIdeaParser.g:387:1: enum_literal : ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor ;
    public final void enum_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:388:2: ( ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor )
            // smaliIdeaParser.g:388:4: ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor
            {
            match(input,ENUM_DIRECTIVE,FOLLOW_ENUM_DIRECTIVE_in_enum_literal1353); if (state.failed) return ;

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1355);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_enum_literal1357); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_enum_literal1359);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_enum_literal1361); if (state.failed) return ;

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1363);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

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
    // smaliIdeaParser.g:390:1: type_field_method_literal : ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |) | PRIMITIVE_TYPE | VOID_TYPE );
    public final void type_field_method_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:391:2: ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |) | PRIMITIVE_TYPE | VOID_TYPE )
            int alt24=3;
            switch ( input.LA(1) ) {
            case ARRAY_DESCRIPTOR:
            case CLASS_DESCRIPTOR:
                {
                alt24=1;
                }
                break;
            case PRIMITIVE_TYPE:
                {
                alt24=2;
                }
                break;
            case VOID_TYPE:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // smaliIdeaParser.g:391:4: reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |)
                    {
                    pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal1372);
                    reference_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:392:3: ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |)
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==ARROW) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==EOF||(LA23_0 >= ACCESS_SPEC && LA23_0 <= ARRAY_DATA_DIRECTIVE)||LA23_0==BOOL_LITERAL||(LA23_0 >= CATCH_DIRECTIVE && LA23_0 <= CATCHALL_DIRECTIVE)||(LA23_0 >= CLASS_DIRECTIVE && LA23_0 <= CLOSE_BRACE)||(LA23_0 >= COLON && LA23_0 <= COMMA)||(LA23_0 >= DOUBLE_LITERAL_OR_ID && LA23_0 <= END_ANNOTATION_DIRECTIVE)||(LA23_0 >= END_FIELD_DIRECTIVE && LA23_0 <= END_METHOD_DIRECTIVE)||LA23_0==END_SUBANNOTATION_DIRECTIVE||LA23_0==EPILOGUE_DIRECTIVE||LA23_0==FIELD_DIRECTIVE||LA23_0==FLOAT_LITERAL_OR_ID||LA23_0==IMPLEMENTS_DIRECTIVE||(LA23_0 >= INSTRUCTION_FORMAT10t && LA23_0 <= INSTRUCTION_FORMAT51l)||(LA23_0 >= LINE_DIRECTIVE && LA23_0 <= LOCALS_DIRECTIVE)||LA23_0==METHOD_DIRECTIVE||(LA23_0 >= NEGATIVE_INTEGER_LITERAL && LA23_0 <= NULL_LITERAL)||LA23_0==PACKED_SWITCH_DIRECTIVE||(LA23_0 >= PARAM_LIST_OR_ID && LA23_0 <= RESTART_LOCAL_DIRECTIVE)||(LA23_0 >= SIMPLE_NAME && LA23_0 <= SPARSE_SWITCH_DIRECTIVE)||(LA23_0 >= SUPER_DIRECTIVE && LA23_0 <= VOID_TYPE)||LA23_0==INTEGER_LITERAL||(LA23_0 >= INSTRUCTION_FORMAT41c_FIELD && LA23_0 <= INSTRUCTION_FORMAT5rc_TYPE)) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;

                    }
                    switch (alt23) {
                        case 1 :
                            // smaliIdeaParser.g:392:5: ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
                            {
                            match(input,ARROW,FOLLOW_ARROW_in_type_field_method_literal1378); if (state.failed) return ;

                            // smaliIdeaParser.g:393:4: ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==ACCESS_SPEC||LA22_0==ANNOTATION_VISIBILITY||LA22_0==BOOL_LITERAL||LA22_0==DOUBLE_LITERAL_OR_ID||LA22_0==FLOAT_LITERAL_OR_ID||(LA22_0 >= INSTRUCTION_FORMAT10t && LA22_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA22_0==INSTRUCTION_FORMAT11x||LA22_0==INSTRUCTION_FORMAT12x_OR_ID||(LA22_0 >= INSTRUCTION_FORMAT21c_FIELD && LA22_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA22_0==INSTRUCTION_FORMAT21t||(LA22_0 >= INSTRUCTION_FORMAT22c_FIELD && LA22_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA22_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA22_0 <= INSTRUCTION_FORMAT22t)||LA22_0==INSTRUCTION_FORMAT23x||(LA22_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA22_0 <= INSTRUCTION_FORMAT31t)||(LA22_0 >= INSTRUCTION_FORMAT35c_METHOD && LA22_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA22_0==INSTRUCTION_FORMAT51l||(LA22_0 >= NEGATIVE_INTEGER_LITERAL && LA22_0 <= NULL_LITERAL)||LA22_0==PARAM_LIST_OR_ID||(LA22_0 >= POSITIVE_INTEGER_LITERAL && LA22_0 <= PRIMITIVE_TYPE)||LA22_0==REGISTER||LA22_0==SIMPLE_NAME||(LA22_0 >= VERIFICATION_ERROR_TYPE && LA22_0 <= VOID_TYPE)||LA22_0==INTEGER_LITERAL) ) {
                                int LA22_1 = input.LA(2);

                                if ( (LA22_1==COLON) ) {
                                    alt22=1;
                                }
                                else if ( (LA22_1==OPEN_PAREN) ) {
                                    alt22=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return ;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 22, 1, input);

                                    throw nvae;

                                }
                            }
                            else if ( (LA22_0==METHOD_NAME) ) {
                                alt22=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 22, 0, input);

                                throw nvae;

                            }
                            switch (alt22) {
                                case 1 :
                                    // smaliIdeaParser.g:393:6: simple_name COLON nonvoid_type_descriptor
                                    {
                                    pushFollow(FOLLOW_simple_name_in_type_field_method_literal1385);
                                    simple_name();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    match(input,COLON,FOLLOW_COLON_in_type_field_method_literal1387); if (state.failed) return ;

                                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1389);
                                    nonvoid_type_descriptor();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // smaliIdeaParser.g:394:6: method_name method_prototype
                                    {
                                    pushFollow(FOLLOW_method_name_in_type_field_method_literal1396);
                                    method_name();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    pushFollow(FOLLOW_method_prototype_in_type_field_method_literal1398);
                                    method_prototype();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // smaliIdeaParser.g:397:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:398:4: PRIMITIVE_TYPE
                    {
                    match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal1420); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:399:4: VOID_TYPE
                    {
                    match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type_field_method_literal1425); if (state.failed) return ;

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
    // smaliIdeaParser.g:401:1: fully_qualified_method : reference_type_descriptor ARROW method_name method_prototype ;
    public final void fully_qualified_method() throws RecognitionException {
        try {
            // smaliIdeaParser.g:402:2: ( reference_type_descriptor ARROW method_name method_prototype )
            // smaliIdeaParser.g:402:4: reference_type_descriptor ARROW method_name method_prototype
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_method1434);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_method1436); if (state.failed) return ;

            pushFollow(FOLLOW_method_name_in_fully_qualified_method1438);
            method_name();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_method_prototype_in_fully_qualified_method1440);
            method_prototype();

            state._fsp--;
            if (state.failed) return ;

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
    // smaliIdeaParser.g:404:1: fully_qualified_field : reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor ;
    public final void fully_qualified_field() throws RecognitionException {
        try {
            // smaliIdeaParser.g:405:2: ( reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor )
            // smaliIdeaParser.g:405:4: reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_field1449);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_field1451); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_fully_qualified_field1453);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_fully_qualified_field1455); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1457);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

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
    // smaliIdeaParser.g:407:1: label : COLON simple_name ;
    public final void label() throws RecognitionException {
        try {
            // smaliIdeaParser.g:408:2: ( COLON simple_name )
            // smaliIdeaParser.g:408:4: COLON simple_name
            {
            match(input,COLON,FOLLOW_COLON_in_label1466); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_label1468);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

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
    // smaliIdeaParser.g:410:1: label_ref_or_offset : ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL );
    public final void label_ref_or_offset() throws RecognitionException {
        try {
            // smaliIdeaParser.g:411:2: ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL )
            int alt25=3;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt25=1;
                }
                break;
            case OFFSET:
                {
                alt25=2;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // smaliIdeaParser.g:411:4: COLON simple_name
                    {
                    match(input,COLON,FOLLOW_COLON_in_label_ref_or_offset1477); if (state.failed) return ;

                    pushFollow(FOLLOW_simple_name_in_label_ref_or_offset1479);
                    simple_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:412:4: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_label_ref_or_offset1484); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:413:4: NEGATIVE_INTEGER_LITERAL
                    {
                    match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1489); if (state.failed) return ;

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
    // smaliIdeaParser.g:415:1: register_list : ( REGISTER ( COMMA REGISTER )* )? ;
    public final void register_list() throws RecognitionException {
        try {
            // smaliIdeaParser.g:416:2: ( ( REGISTER ( COMMA REGISTER )* )? )
            // smaliIdeaParser.g:416:4: ( REGISTER ( COMMA REGISTER )* )?
            {
            // smaliIdeaParser.g:416:4: ( REGISTER ( COMMA REGISTER )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==REGISTER) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // smaliIdeaParser.g:416:5: REGISTER ( COMMA REGISTER )*
                    {
                    match(input,REGISTER,FOLLOW_REGISTER_in_register_list1499); if (state.failed) return ;

                    // smaliIdeaParser.g:416:14: ( COMMA REGISTER )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==COMMA) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // smaliIdeaParser.g:416:15: COMMA REGISTER
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_register_list1502); if (state.failed) return ;

                    	    match(input,REGISTER,FOLLOW_REGISTER_in_register_list1504); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
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
    // smaliIdeaParser.g:418:1: register_range : ( REGISTER ( DOTDOT REGISTER )? )? ;
    public final void register_range() throws RecognitionException {
        try {
            // smaliIdeaParser.g:419:2: ( ( REGISTER ( DOTDOT REGISTER )? )? )
            // smaliIdeaParser.g:419:4: ( REGISTER ( DOTDOT REGISTER )? )?
            {
            // smaliIdeaParser.g:419:4: ( REGISTER ( DOTDOT REGISTER )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==REGISTER) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // smaliIdeaParser.g:419:5: REGISTER ( DOTDOT REGISTER )?
                    {
                    match(input,REGISTER,FOLLOW_REGISTER_in_register_range1518); if (state.failed) return ;

                    // smaliIdeaParser.g:419:14: ( DOTDOT REGISTER )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==DOTDOT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // smaliIdeaParser.g:419:15: DOTDOT REGISTER
                            {
                            match(input,DOTDOT,FOLLOW_DOTDOT_in_register_range1521); if (state.failed) return ;

                            match(input,REGISTER,FOLLOW_REGISTER_in_register_range1523); if (state.failed) return ;

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
    // smaliIdeaParser.g:421:1: verification_error_reference : ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method );
    public final void verification_error_reference() throws RecognitionException {
        try {
            // smaliIdeaParser.g:422:2: ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CLASS_DESCRIPTOR) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==ANNOTATION_DIRECTIVE||LA30_1==ARRAY_DATA_DIRECTIVE||(LA30_1 >= CATCH_DIRECTIVE && LA30_1 <= CATCHALL_DIRECTIVE)||LA30_1==COLON||(LA30_1 >= END_LOCAL_DIRECTIVE && LA30_1 <= END_METHOD_DIRECTIVE)||LA30_1==EPILOGUE_DIRECTIVE||(LA30_1 >= INSTRUCTION_FORMAT10t && LA30_1 <= INSTRUCTION_FORMAT51l)||(LA30_1 >= LINE_DIRECTIVE && LA30_1 <= LOCALS_DIRECTIVE)||LA30_1==PACKED_SWITCH_DIRECTIVE||LA30_1==PARAMETER_DIRECTIVE||LA30_1==PROLOGUE_DIRECTIVE||(LA30_1 >= REGISTERS_DIRECTIVE && LA30_1 <= RESTART_LOCAL_DIRECTIVE)||(LA30_1 >= SOURCE_DIRECTIVE && LA30_1 <= SPARSE_SWITCH_DIRECTIVE)||(LA30_1 >= INSTRUCTION_FORMAT41c_FIELD && LA30_1 <= INSTRUCTION_FORMAT5rc_TYPE)) ) {
                    alt30=1;
                }
                else if ( (LA30_1==ARROW) ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4==ACCESS_SPEC||LA30_4==ANNOTATION_VISIBILITY||LA30_4==BOOL_LITERAL||LA30_4==DOUBLE_LITERAL_OR_ID||LA30_4==FLOAT_LITERAL_OR_ID||(LA30_4 >= INSTRUCTION_FORMAT10t && LA30_4 <= INSTRUCTION_FORMAT10x_ODEX)||LA30_4==INSTRUCTION_FORMAT11x||LA30_4==INSTRUCTION_FORMAT12x_OR_ID||(LA30_4 >= INSTRUCTION_FORMAT21c_FIELD && LA30_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA30_4==INSTRUCTION_FORMAT21t||(LA30_4 >= INSTRUCTION_FORMAT22c_FIELD && LA30_4 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA30_4 >= INSTRUCTION_FORMAT22s_OR_ID && LA30_4 <= INSTRUCTION_FORMAT22t)||LA30_4==INSTRUCTION_FORMAT23x||(LA30_4 >= INSTRUCTION_FORMAT31i_OR_ID && LA30_4 <= INSTRUCTION_FORMAT31t)||(LA30_4 >= INSTRUCTION_FORMAT35c_METHOD && LA30_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA30_4==INSTRUCTION_FORMAT51l||(LA30_4 >= NEGATIVE_INTEGER_LITERAL && LA30_4 <= NULL_LITERAL)||LA30_4==PARAM_LIST_OR_ID||(LA30_4 >= POSITIVE_INTEGER_LITERAL && LA30_4 <= PRIMITIVE_TYPE)||LA30_4==REGISTER||LA30_4==SIMPLE_NAME||(LA30_4 >= VERIFICATION_ERROR_TYPE && LA30_4 <= VOID_TYPE)||LA30_4==INTEGER_LITERAL) ) {
                        int LA30_5 = input.LA(4);

                        if ( (LA30_5==COLON) ) {
                            alt30=2;
                        }
                        else if ( (LA30_5==OPEN_PAREN) ) {
                            alt30=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA30_4==METHOD_NAME) ) {
                        alt30=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA30_0==ARRAY_DESCRIPTOR) ) {
                int LA30_2 = input.LA(2);

                if ( (LA30_2==ARROW) ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4==ACCESS_SPEC||LA30_4==ANNOTATION_VISIBILITY||LA30_4==BOOL_LITERAL||LA30_4==DOUBLE_LITERAL_OR_ID||LA30_4==FLOAT_LITERAL_OR_ID||(LA30_4 >= INSTRUCTION_FORMAT10t && LA30_4 <= INSTRUCTION_FORMAT10x_ODEX)||LA30_4==INSTRUCTION_FORMAT11x||LA30_4==INSTRUCTION_FORMAT12x_OR_ID||(LA30_4 >= INSTRUCTION_FORMAT21c_FIELD && LA30_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA30_4==INSTRUCTION_FORMAT21t||(LA30_4 >= INSTRUCTION_FORMAT22c_FIELD && LA30_4 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA30_4 >= INSTRUCTION_FORMAT22s_OR_ID && LA30_4 <= INSTRUCTION_FORMAT22t)||LA30_4==INSTRUCTION_FORMAT23x||(LA30_4 >= INSTRUCTION_FORMAT31i_OR_ID && LA30_4 <= INSTRUCTION_FORMAT31t)||(LA30_4 >= INSTRUCTION_FORMAT35c_METHOD && LA30_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA30_4==INSTRUCTION_FORMAT51l||(LA30_4 >= NEGATIVE_INTEGER_LITERAL && LA30_4 <= NULL_LITERAL)||LA30_4==PARAM_LIST_OR_ID||(LA30_4 >= POSITIVE_INTEGER_LITERAL && LA30_4 <= PRIMITIVE_TYPE)||LA30_4==REGISTER||LA30_4==SIMPLE_NAME||(LA30_4 >= VERIFICATION_ERROR_TYPE && LA30_4 <= VOID_TYPE)||LA30_4==INTEGER_LITERAL) ) {
                        int LA30_5 = input.LA(4);

                        if ( (LA30_5==COLON) ) {
                            alt30=2;
                        }
                        else if ( (LA30_5==OPEN_PAREN) ) {
                            alt30=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 30, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA30_4==METHOD_NAME) ) {
                        alt30=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // smaliIdeaParser.g:422:4: CLASS_DESCRIPTOR
                    {
                    match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference1536); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:422:23: fully_qualified_field
                    {
                    pushFollow(FOLLOW_fully_qualified_field_in_verification_error_reference1540);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:422:47: fully_qualified_method
                    {
                    pushFollow(FOLLOW_fully_qualified_method_in_verification_error_reference1544);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

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
    // smaliIdeaParser.g:424:1: catch_directive : CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset ;
    public final void catch_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:425:2: ( CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
            // smaliIdeaParser.g:425:4: CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
            {
            match(input,CATCH_DIRECTIVE,FOLLOW_CATCH_DIRECTIVE_in_catch_directive1553); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_catch_directive1555);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catch_directive1557); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1559);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_catch_directive1561); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1563);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catch_directive1565); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1567);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

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
    // smaliIdeaParser.g:427:1: catchall_directive : CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset ;
    public final void catchall_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:428:2: ( CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
            // smaliIdeaParser.g:428:4: CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
            {
            match(input,CATCHALL_DIRECTIVE,FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1576); if (state.failed) return ;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catchall_directive1578); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1580);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_catchall_directive1582); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1584);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catchall_directive1586); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1588);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

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
    // smaliIdeaParser.g:434:1: parameter_directive : PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) ;
    public final void parameter_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:435:2: ( PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) )
            // smaliIdeaParser.g:435:4: PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |)
            {
            match(input,PARAMETER_DIRECTIVE,FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1599); if (state.failed) return ;

            // smaliIdeaParser.g:435:24: ( STRING_LITERAL )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==STRING_LITERAL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // smaliIdeaParser.g:435:24: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parameter_directive1601); if (state.failed) return ;

                    }
                    break;

            }


            // smaliIdeaParser.g:436:3: ({...}? annotation )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // smaliIdeaParser.g:436:4: {...}? annotation
            	    {
            	    if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "parameter_directive", "input.LA(1) == ANNOTATION_DIRECTIVE");
            	    }

            	    pushFollow(FOLLOW_annotation_in_parameter_directive1609);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // smaliIdeaParser.g:437:3: ( END_PARAMETER_DIRECTIVE |)
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==END_PARAMETER_DIRECTIVE) ) {
                alt33=1;
            }
            else if ( (LA33_0==EOF||LA33_0==ANNOTATION_DIRECTIVE||LA33_0==ARRAY_DATA_DIRECTIVE||(LA33_0 >= CATCH_DIRECTIVE && LA33_0 <= CATCHALL_DIRECTIVE)||LA33_0==CLASS_DIRECTIVE||LA33_0==COLON||(LA33_0 >= END_LOCAL_DIRECTIVE && LA33_0 <= END_METHOD_DIRECTIVE)||LA33_0==EPILOGUE_DIRECTIVE||LA33_0==FIELD_DIRECTIVE||LA33_0==IMPLEMENTS_DIRECTIVE||(LA33_0 >= INSTRUCTION_FORMAT10t && LA33_0 <= INSTRUCTION_FORMAT51l)||(LA33_0 >= LINE_DIRECTIVE && LA33_0 <= LOCALS_DIRECTIVE)||LA33_0==METHOD_DIRECTIVE||LA33_0==PACKED_SWITCH_DIRECTIVE||LA33_0==PARAMETER_DIRECTIVE||LA33_0==PROLOGUE_DIRECTIVE||(LA33_0 >= REGISTERS_DIRECTIVE && LA33_0 <= RESTART_LOCAL_DIRECTIVE)||(LA33_0 >= SOURCE_DIRECTIVE && LA33_0 <= SPARSE_SWITCH_DIRECTIVE)||LA33_0==SUPER_DIRECTIVE||(LA33_0 >= INSTRUCTION_FORMAT41c_FIELD && LA33_0 <= INSTRUCTION_FORMAT5rc_TYPE)) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // smaliIdeaParser.g:437:5: END_PARAMETER_DIRECTIVE
                    {
                    match(input,END_PARAMETER_DIRECTIVE,FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1617); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:439:3: 
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
    // smaliIdeaParser.g:441:1: ordered_debug_directive : ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive );
    public final void ordered_debug_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:442:2: ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive )
            int alt34=7;
            switch ( input.LA(1) ) {
            case LINE_DIRECTIVE:
                {
                alt34=1;
                }
                break;
            case LOCAL_DIRECTIVE:
                {
                alt34=2;
                }
                break;
            case END_LOCAL_DIRECTIVE:
                {
                alt34=3;
                }
                break;
            case RESTART_LOCAL_DIRECTIVE:
                {
                alt34=4;
                }
                break;
            case PROLOGUE_DIRECTIVE:
                {
                alt34=5;
                }
                break;
            case EPILOGUE_DIRECTIVE:
                {
                alt34=6;
                }
                break;
            case SOURCE_DIRECTIVE:
                {
                alt34=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // smaliIdeaParser.g:442:4: line_directive
                    {
                    pushFollow(FOLLOW_line_directive_in_ordered_debug_directive1636);
                    line_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:443:4: local_directive
                    {
                    pushFollow(FOLLOW_local_directive_in_ordered_debug_directive1641);
                    local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:444:4: end_local_directive
                    {
                    pushFollow(FOLLOW_end_local_directive_in_ordered_debug_directive1646);
                    end_local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:445:4: restart_local_directive
                    {
                    pushFollow(FOLLOW_restart_local_directive_in_ordered_debug_directive1651);
                    restart_local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:446:4: prologue_directive
                    {
                    pushFollow(FOLLOW_prologue_directive_in_ordered_debug_directive1656);
                    prologue_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:447:4: epilogue_directive
                    {
                    pushFollow(FOLLOW_epilogue_directive_in_ordered_debug_directive1661);
                    epilogue_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:448:4: source_directive
                    {
                    pushFollow(FOLLOW_source_directive_in_ordered_debug_directive1666);
                    source_directive();

                    state._fsp--;
                    if (state.failed) return ;

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
    // smaliIdeaParser.g:450:1: line_directive : LINE_DIRECTIVE integral_literal ;
    public final void line_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:451:2: ( LINE_DIRECTIVE integral_literal )
            // smaliIdeaParser.g:451:4: LINE_DIRECTIVE integral_literal
            {
            match(input,LINE_DIRECTIVE,FOLLOW_LINE_DIRECTIVE_in_line_directive1675); if (state.failed) return ;

            pushFollow(FOLLOW_integral_literal_in_line_directive1677);
            integral_literal();

            state._fsp--;
            if (state.failed) return ;

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
    // smaliIdeaParser.g:453:1: local_directive : LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? ;
    public final void local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:454:2: ( LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? )
            // smaliIdeaParser.g:454:4: LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )?
            {
            match(input,LOCAL_DIRECTIVE,FOLLOW_LOCAL_DIRECTIVE_in_local_directive1686); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_local_directive1688); if (state.failed) return ;

            match(input,COMMA,FOLLOW_COMMA_in_local_directive1690); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_local_directive1692);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_local_directive1694); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_local_directive1696);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            // smaliIdeaParser.g:454:77: ( COMMA STRING_LITERAL )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==COMMA) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // smaliIdeaParser.g:454:78: COMMA STRING_LITERAL
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_local_directive1699); if (state.failed) return ;

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive1701); if (state.failed) return ;

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
    // smaliIdeaParser.g:456:1: end_local_directive : END_LOCAL_DIRECTIVE REGISTER ;
    public final void end_local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:457:2: ( END_LOCAL_DIRECTIVE REGISTER )
            // smaliIdeaParser.g:457:4: END_LOCAL_DIRECTIVE REGISTER
            {
            match(input,END_LOCAL_DIRECTIVE,FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1712); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_end_local_directive1714); if (state.failed) return ;

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
    // smaliIdeaParser.g:459:1: restart_local_directive : RESTART_LOCAL_DIRECTIVE REGISTER ;
    public final void restart_local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:460:2: ( RESTART_LOCAL_DIRECTIVE REGISTER )
            // smaliIdeaParser.g:460:4: RESTART_LOCAL_DIRECTIVE REGISTER
            {
            match(input,RESTART_LOCAL_DIRECTIVE,FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1723); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_restart_local_directive1725); if (state.failed) return ;

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
    // smaliIdeaParser.g:462:1: prologue_directive : PROLOGUE_DIRECTIVE ;
    public final void prologue_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:463:2: ( PROLOGUE_DIRECTIVE )
            // smaliIdeaParser.g:463:4: PROLOGUE_DIRECTIVE
            {
            match(input,PROLOGUE_DIRECTIVE,FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1734); if (state.failed) return ;

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
    // smaliIdeaParser.g:465:1: epilogue_directive : EPILOGUE_DIRECTIVE ;
    public final void epilogue_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:466:2: ( EPILOGUE_DIRECTIVE )
            // smaliIdeaParser.g:466:4: EPILOGUE_DIRECTIVE
            {
            match(input,EPILOGUE_DIRECTIVE,FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1743); if (state.failed) return ;

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
    // smaliIdeaParser.g:468:1: source_directive : SOURCE_DIRECTIVE STRING_LITERAL ;
    public final void source_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:469:2: ( SOURCE_DIRECTIVE STRING_LITERAL )
            // smaliIdeaParser.g:469:4: SOURCE_DIRECTIVE STRING_LITERAL
            {
            match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_directive1752); if (state.failed) return ;

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_directive1754); if (state.failed) return ;

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
    // smaliIdeaParser.g:471:1: instruction_format12x : ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID );
    public final void instruction_format12x() throws RecognitionException {
        try {
            // smaliIdeaParser.g:472:2: ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT12x && input.LA(1) <= INSTRUCTION_FORMAT12x_OR_ID) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:475:1: instruction_format22s : ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID );
    public final void instruction_format22s() throws RecognitionException {
        try {
            // smaliIdeaParser.g:476:2: ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT22s && input.LA(1) <= INSTRUCTION_FORMAT22s_OR_ID) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:479:1: instruction_format31i : ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID );
    public final void instruction_format31i() throws RecognitionException {
        try {
            // smaliIdeaParser.g:480:2: ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT31i && input.LA(1) <= INSTRUCTION_FORMAT31i_OR_ID) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // smaliIdeaParser.g:483:1: instruction : ( INSTRUCTION_FORMAT10t label_ref_or_offset | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal | INSTRUCTION_FORMAT11x REGISTER | instruction_format12x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference | INSTRUCTION_FORMAT20t label_ref_or_offset | INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL | INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) | INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET | instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER | INSTRUCTION_FORMAT30t label_ref_or_offset | INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL | instruction_format31i REGISTER COMMA fixed_32bit_literal | INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal | INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE | PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE | SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE );
    public final void instruction() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:485:2: ( INSTRUCTION_FORMAT10t label_ref_or_offset | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal | INSTRUCTION_FORMAT11x REGISTER | instruction_format12x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference | INSTRUCTION_FORMAT20t label_ref_or_offset | INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL | INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) | INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET | instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER | INSTRUCTION_FORMAT30t label_ref_or_offset | INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL | instruction_format31i REGISTER COMMA fixed_32bit_literal | INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal | INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE | PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE | SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE )
            int alt39=52;
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
            case INSTRUCTION_FORMAT21h:
                {
                alt39=13;
                }
                break;
            case INSTRUCTION_FORMAT21s:
                {
                alt39=14;
                }
                break;
            case INSTRUCTION_FORMAT21t:
                {
                alt39=15;
                }
                break;
            case INSTRUCTION_FORMAT22b:
                {
                alt39=16;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD:
                {
                alt39=17;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                {
                alt39=18;
                }
                break;
            case INSTRUCTION_FORMAT22c_TYPE:
                {
                alt39=19;
                }
                break;
            case INSTRUCTION_FORMAT22cs_FIELD:
                {
                alt39=20;
                }
                break;
            case INSTRUCTION_FORMAT22s:
            case INSTRUCTION_FORMAT22s_OR_ID:
                {
                alt39=21;
                }
                break;
            case INSTRUCTION_FORMAT22t:
                {
                alt39=22;
                }
                break;
            case INSTRUCTION_FORMAT22x:
                {
                alt39=23;
                }
                break;
            case INSTRUCTION_FORMAT23x:
                {
                alt39=24;
                }
                break;
            case INSTRUCTION_FORMAT30t:
                {
                alt39=25;
                }
                break;
            case INSTRUCTION_FORMAT31c:
                {
                alt39=26;
                }
                break;
            case INSTRUCTION_FORMAT31i:
            case INSTRUCTION_FORMAT31i_OR_ID:
                {
                alt39=27;
                }
                break;
            case INSTRUCTION_FORMAT31t:
                {
                alt39=28;
                }
                break;
            case INSTRUCTION_FORMAT32x:
                {
                alt39=29;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD:
                {
                alt39=30;
                }
                break;
            case INSTRUCTION_FORMAT35c_TYPE:
                {
                alt39=31;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD_ODEX:
                {
                alt39=32;
                }
                break;
            case INSTRUCTION_FORMAT35mi_METHOD:
                {
                alt39=33;
                }
                break;
            case INSTRUCTION_FORMAT35ms_METHOD:
                {
                alt39=34;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD:
                {
                alt39=35;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
                {
                alt39=36;
                }
                break;
            case INSTRUCTION_FORMAT3rc_TYPE:
                {
                alt39=37;
                }
                break;
            case INSTRUCTION_FORMAT3rmi_METHOD:
                {
                alt39=38;
                }
                break;
            case INSTRUCTION_FORMAT3rms_METHOD:
                {
                alt39=39;
                }
                break;
            case INSTRUCTION_FORMAT41c_TYPE:
                {
                alt39=40;
                }
                break;
            case INSTRUCTION_FORMAT41c_FIELD:
                {
                alt39=41;
                }
                break;
            case INSTRUCTION_FORMAT41c_FIELD_ODEX:
                {
                alt39=42;
                }
                break;
            case INSTRUCTION_FORMAT51l:
                {
                alt39=43;
                }
                break;
            case INSTRUCTION_FORMAT52c_TYPE:
                {
                alt39=44;
                }
                break;
            case INSTRUCTION_FORMAT52c_FIELD:
                {
                alt39=45;
                }
                break;
            case INSTRUCTION_FORMAT52c_FIELD_ODEX:
                {
                alt39=46;
                }
                break;
            case INSTRUCTION_FORMAT5rc_METHOD:
                {
                alt39=47;
                }
                break;
            case INSTRUCTION_FORMAT5rc_METHOD_ODEX:
                {
                alt39=48;
                }
                break;
            case INSTRUCTION_FORMAT5rc_TYPE:
                {
                alt39=49;
                }
                break;
            case ARRAY_DATA_DIRECTIVE:
                {
                alt39=50;
                }
                break;
            case PACKED_SWITCH_DIRECTIVE:
                {
                alt39=51;
                }
                break;
            case SPARSE_SWITCH_DIRECTIVE:
                {
                alt39=52;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // smaliIdeaParser.g:487:3: INSTRUCTION_FORMAT10t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_instruction1820); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1822);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:489:3: INSTRUCTION_FORMAT10x
                    {
                    match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_instruction1830); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:491:3: INSTRUCTION_FORMAT10x_ODEX
                    {
                    match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_instruction1838); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:493:3: INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT11n,FOLLOW_INSTRUCTION_FORMAT11n_in_instruction1846); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1848); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1850); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction1852);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:495:3: INSTRUCTION_FORMAT11x REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_instruction1860); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1862); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:497:3: instruction_format12x REGISTER COMMA REGISTER
                    {
                    pushFollow(FOLLOW_instruction_format12x_in_instruction1870);
                    instruction_format12x();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1872); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1874); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1876); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:499:3: INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference
                    {
                    match(input,INSTRUCTION_FORMAT20bc,FOLLOW_INSTRUCTION_FORMAT20bc_in_instruction1884); if (state.failed) return ;

                    match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_instruction1886); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1888); if (state.failed) return ;

                    pushFollow(FOLLOW_verification_error_reference_in_instruction1890);
                    verification_error_reference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:501:3: INSTRUCTION_FORMAT20t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT20t,FOLLOW_INSTRUCTION_FORMAT20t_in_instruction1898); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1900);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // smaliIdeaParser.g:503:3: INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_instruction1908); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1910); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1912); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction1914);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // smaliIdeaParser.g:505:3: INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_instruction1922); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1924); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1926); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction1928);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // smaliIdeaParser.g:507:3: INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
                    {
                    match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_instruction1936); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1938); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1940); if (state.failed) return ;

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_instruction1942); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // smaliIdeaParser.g:509:3: INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_instruction1950); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1952); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1954); if (state.failed) return ;

                    pushFollow(FOLLOW_reference_type_descriptor_in_instruction1956);
                    reference_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // smaliIdeaParser.g:511:3: INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT21h,FOLLOW_INSTRUCTION_FORMAT21h_in_instruction1964); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1966); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1968); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction1970);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // smaliIdeaParser.g:513:3: INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT21s,FOLLOW_INSTRUCTION_FORMAT21s_in_instruction1978); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1980); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1982); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction1984);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // smaliIdeaParser.g:515:3: INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset )
                    {
                    match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_instruction1992); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1994); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1996); if (state.failed) return ;

                    // smaliIdeaParser.g:515:40: ( label_ref_or_offset )
                    // smaliIdeaParser.g:515:41: label_ref_or_offset
                    {
                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1999);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 16 :
                    // smaliIdeaParser.g:517:3: INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT22b,FOLLOW_INSTRUCTION_FORMAT22b_in_instruction2008); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2010); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2012); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2014); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2016); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction2018);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // smaliIdeaParser.g:519:3: INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_instruction2026); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2028); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2030); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2032); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2034); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2036);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // smaliIdeaParser.g:521:3: INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_instruction2044); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2046); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2048); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2050); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2052); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2054);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 19 :
                    // smaliIdeaParser.g:523:3: INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_instruction2062); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2064); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2066); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2068); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2070); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2072);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 20 :
                    // smaliIdeaParser.g:525:3: INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
                    {
                    match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_instruction2080); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2082); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2084); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2086); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2088); if (state.failed) return ;

                    match(input,FIELD_OFFSET,FOLLOW_FIELD_OFFSET_in_instruction2090); if (state.failed) return ;

                    }
                    break;
                case 21 :
                    // smaliIdeaParser.g:527:3: instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
                    {
                    pushFollow(FOLLOW_instruction_format22s_in_instruction2098);
                    instruction_format22s();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2100); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2102); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2104); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2106); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction2108);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 22 :
                    // smaliIdeaParser.g:529:3: INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_instruction2116); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2118); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2120); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2122); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2124); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2126);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 23 :
                    // smaliIdeaParser.g:531:3: INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT22x,FOLLOW_INSTRUCTION_FORMAT22x_in_instruction2134); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2136); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2138); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2140); if (state.failed) return ;

                    }
                    break;
                case 24 :
                    // smaliIdeaParser.g:533:3: INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_instruction2148); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2150); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2152); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2154); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2156); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2158); if (state.failed) return ;

                    }
                    break;
                case 25 :
                    // smaliIdeaParser.g:535:3: INSTRUCTION_FORMAT30t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT30t,FOLLOW_INSTRUCTION_FORMAT30t_in_instruction2166); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2168);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 26 :
                    // smaliIdeaParser.g:537:3: INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
                    {
                    match(input,INSTRUCTION_FORMAT31c,FOLLOW_INSTRUCTION_FORMAT31c_in_instruction2176); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2178); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2180); if (state.failed) return ;

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_instruction2182); if (state.failed) return ;

                    }
                    break;
                case 27 :
                    // smaliIdeaParser.g:539:3: instruction_format31i REGISTER COMMA fixed_32bit_literal
                    {
                    pushFollow(FOLLOW_instruction_format31i_in_instruction2190);
                    instruction_format31i();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2192); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2194); if (state.failed) return ;

                    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2196);
                    fixed_32bit_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 28 :
                    // smaliIdeaParser.g:541:3: INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_instruction2204); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2206); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2208); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2210);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 29 :
                    // smaliIdeaParser.g:543:3: INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT32x,FOLLOW_INSTRUCTION_FORMAT32x_in_instruction2218); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2220); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2222); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2224); if (state.failed) return ;

                    }
                    break;
                case 30 :
                    // smaliIdeaParser.g:545:3: INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_instruction2232); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2234); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2236);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2238); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2240); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2242);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 31 :
                    // smaliIdeaParser.g:547:3: INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_instruction2250); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2252); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2254);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2256); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2258); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2260);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 32 :
                    // smaliIdeaParser.g:549:3: INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_instruction2268); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2270); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2272);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2274); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2276); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2278);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 33 :
                    // smaliIdeaParser.g:551:3: INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_instruction2286); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2288); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2290);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2292); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2294); if (state.failed) return ;

                    match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_instruction2296); if (state.failed) return ;

                    }
                    break;
                case 34 :
                    // smaliIdeaParser.g:553:3: INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_instruction2304); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2306); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2308);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2310); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2312); if (state.failed) return ;

                    match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_instruction2314); if (state.failed) return ;

                    }
                    break;
                case 35 :
                    // smaliIdeaParser.g:555:3: INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT3rc_METHOD,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_instruction2322); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2324); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2326);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2328); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2330); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2332);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 36 :
                    // smaliIdeaParser.g:557:3: INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT3rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_instruction2340); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2342); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2344);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2346); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2348); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2350);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 37 :
                    // smaliIdeaParser.g:559:3: INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT3rc_TYPE,FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_instruction2358); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2360); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2362);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2364); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2366); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2368);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 38 :
                    // smaliIdeaParser.g:561:3: INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT3rmi_METHOD,FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_instruction2376); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2378); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2380);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2382); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2384); if (state.failed) return ;

                    match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_instruction2386); if (state.failed) return ;

                    }
                    break;
                case 39 :
                    // smaliIdeaParser.g:563:3: INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT3rms_METHOD,FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_instruction2394); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2396); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2398);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2400); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2402); if (state.failed) return ;

                    match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_instruction2404); if (state.failed) return ;

                    }
                    break;
                case 40 :
                    // smaliIdeaParser.g:565:3: INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT41c_TYPE,FOLLOW_INSTRUCTION_FORMAT41c_TYPE_in_instruction2412); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2414); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2416); if (state.failed) return ;

                    pushFollow(FOLLOW_reference_type_descriptor_in_instruction2418);
                    reference_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 41 :
                    // smaliIdeaParser.g:567:3: INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT41c_FIELD,FOLLOW_INSTRUCTION_FORMAT41c_FIELD_in_instruction2426); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2428); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2430); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2432);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 42 :
                    // smaliIdeaParser.g:569:3: INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT41c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT41c_FIELD_ODEX_in_instruction2440); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2442); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2444); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2446);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 43 :
                    // smaliIdeaParser.g:571:3: INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
                    {
                    match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_instruction2454); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2456); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2458); if (state.failed) return ;

                    pushFollow(FOLLOW_fixed_literal_in_instruction2460);
                    fixed_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 44 :
                    // smaliIdeaParser.g:573:3: INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT52c_TYPE,FOLLOW_INSTRUCTION_FORMAT52c_TYPE_in_instruction2468); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2470); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2472); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2474); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2476); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2478);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 45 :
                    // smaliIdeaParser.g:575:3: INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT52c_FIELD,FOLLOW_INSTRUCTION_FORMAT52c_FIELD_in_instruction2486); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2488); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2490); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2492); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2494); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2496);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 46 :
                    // smaliIdeaParser.g:577:3: INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT52c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT52c_FIELD_ODEX_in_instruction2504); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2506); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2508); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2510); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2512); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2514);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 47 :
                    // smaliIdeaParser.g:579:3: INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT5rc_METHOD,FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_in_instruction2522); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2524); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2526);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2528); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2530); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2532);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 48 :
                    // smaliIdeaParser.g:581:3: INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT5rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_ODEX_in_instruction2540); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2542); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2544);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2546); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2548); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2550);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 49 :
                    // smaliIdeaParser.g:583:3: INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT5rc_TYPE,FOLLOW_INSTRUCTION_FORMAT5rc_TYPE_in_instruction2558); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2560); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2562);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2564); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2566); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2568);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 50 :
                    // smaliIdeaParser.g:584:6: ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE
                    {
                    match(input,ARRAY_DATA_DIRECTIVE,FOLLOW_ARRAY_DATA_DIRECTIVE_in_instruction2575); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction2577);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:584:44: ( fixed_literal )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0 >= BOOL_LITERAL && LA36_0 <= BYTE_LITERAL)||LA36_0==CHAR_LITERAL||(LA36_0 >= DOUBLE_LITERAL && LA36_0 <= DOUBLE_LITERAL_OR_ID)||(LA36_0 >= FLOAT_LITERAL && LA36_0 <= FLOAT_LITERAL_OR_ID)||LA36_0==LONG_LITERAL||LA36_0==NEGATIVE_INTEGER_LITERAL||LA36_0==POSITIVE_INTEGER_LITERAL||LA36_0==SHORT_LITERAL||LA36_0==INTEGER_LITERAL) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // smaliIdeaParser.g:584:44: fixed_literal
                    	    {
                    	    pushFollow(FOLLOW_fixed_literal_in_instruction2579);
                    	    fixed_literal();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    match(input,END_ARRAY_DATA_DIRECTIVE,FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_instruction2582); if (state.failed) return ;

                    }
                    break;
                case 51 :
                    // smaliIdeaParser.g:585:6: PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE
                    {
                    match(input,PACKED_SWITCH_DIRECTIVE,FOLLOW_PACKED_SWITCH_DIRECTIVE_in_instruction2589); if (state.failed) return ;

                    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2591);
                    fixed_32bit_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:585:50: ( label_ref_or_offset )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==COLON||LA37_0==NEGATIVE_INTEGER_LITERAL||LA37_0==OFFSET) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // smaliIdeaParser.g:585:50: label_ref_or_offset
                    	    {
                    	    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2593);
                    	    label_ref_or_offset();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    match(input,END_PACKED_SWITCH_DIRECTIVE,FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_instruction2596); if (state.failed) return ;

                    }
                    break;
                case 52 :
                    // smaliIdeaParser.g:586:6: SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE
                    {
                    match(input,SPARSE_SWITCH_DIRECTIVE,FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_instruction2603); if (state.failed) return ;

                    // smaliIdeaParser.g:586:30: ( fixed_32bit_literal ARROW label_ref_or_offset )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0 >= BOOL_LITERAL && LA38_0 <= BYTE_LITERAL)||LA38_0==CHAR_LITERAL||(LA38_0 >= FLOAT_LITERAL && LA38_0 <= FLOAT_LITERAL_OR_ID)||LA38_0==LONG_LITERAL||LA38_0==NEGATIVE_INTEGER_LITERAL||LA38_0==POSITIVE_INTEGER_LITERAL||LA38_0==SHORT_LITERAL||LA38_0==INTEGER_LITERAL) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // smaliIdeaParser.g:586:31: fixed_32bit_literal ARROW label_ref_or_offset
                    	    {
                    	    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2606);
                    	    fixed_32bit_literal();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    match(input,ARROW,FOLLOW_ARROW_in_instruction2608); if (state.failed) return ;

                    	    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2610);
                    	    label_ref_or_offset();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    match(input,END_SPARSE_SWITCH_DIRECTIVE,FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_instruction2614); if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "instruction"

    // $ANTLR start synpred1_smaliIdeaParser
    public final void synpred1_smaliIdeaParser_fragment() throws RecognitionException {
        // smaliIdeaParser.g:190:13: ( ANNOTATION_DIRECTIVE )
        // smaliIdeaParser.g:190:14: ANNOTATION_DIRECTIVE
        {
        match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_synpred1_smaliIdeaParser347); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_smaliIdeaParser

    // $ANTLR start synpred2_smaliIdeaParser
    public final void synpred2_smaliIdeaParser_fragment() throws RecognitionException {
        // smaliIdeaParser.g:190:71: ( ANNOTATION_DIRECTIVE )
        // smaliIdeaParser.g:190:72: ANNOTATION_DIRECTIVE
        {
        match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_synpred2_smaliIdeaParser357); if (state.failed) return ;

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


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\106\uffff";
    static final String DFA32_eofS =
        "\106\uffff";
    static final String DFA32_minS =
        "\1\5\103\uffff\1\0\1\uffff";
    static final String DFA32_maxS =
        "\1\u00e8\103\uffff\1\0\1\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\103\uffff\1\1";
    static final String DFA32_specialS =
        "\104\uffff\1\0\1\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\104\1\uffff\1\1\17\uffff\2\1\5\uffff\1\1\10\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\13\uffff\53\1\2\uffff\3\1\10\uffff\1\1\2\uffff"+
            "\1\1\2\uffff\1\1\1\uffff\2\1\2\uffff\2\1\140\uffff\11\1",
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

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 436:3: ({...}? annotation )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_68 = input.LA(1);

                         
                        int index32_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 69;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_68);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_class_element_in_smali_file65 = new BitSet(new long[]{0x0102000008000020L,0x4000080000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_sync_in_smali_file67 = new BitSet(new long[]{0x0102000008000020L,0x4000080000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_EOF_in_smali_file73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_spec_in_class_element93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_super_spec_in_class_element101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implements_spec_in_class_element109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_spec_in_class_element117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_class_element125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_class_element133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_class_element141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_DIRECTIVE_in_class_spec160 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_access_list_in_class_spec162 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_class_spec164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_DIRECTIVE_in_super_spec187 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_super_spec189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec215 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_implements_spec217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_spec243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_spec245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_SPEC_in_access_list268 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_FIELD_DIRECTIVE_in_field303 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_access_list_in_field305 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_simple_name_in_field307 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_field309 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field311 = new BitSet(new long[]{0x0000804000000022L});
    public static final BitSet FOLLOW_EQUAL_in_field314 = new BitSet(new long[]{0x0018200C06600100L,0x10C1640000000000L,0x0000000000000113L});
    public static final BitSet FOLLOW_literal_in_field316 = new BitSet(new long[]{0x0000004000000022L});
    public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_field361 = new BitSet(new long[]{0x0000004000000022L});
    public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DIRECTIVE_in_method499 = new BitSet(new long[]{0x5C10000800200050L,0x22D070107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_access_list_in_method501 = new BitSet(new long[]{0x5C10000800200050L,0x22D070107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_method_name_in_method503 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_method505 = new BitSet(new long[]{0xFC004180418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_statements_and_directives_in_method507 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_END_METHOD_DIRECTIVE_in_method509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_statements_and_directives526 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_registers_directive_in_statements_and_directives532 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_label_in_statements_and_directives538 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_catch_directive_in_statements_and_directives544 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_catchall_directive_in_statements_and_directives550 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_parameter_directive_in_statements_and_directives556 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_ordered_debug_directive_in_statements_and_directives562 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_annotation_in_statements_and_directives568 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_sync_in_statements_and_directives574 = new BitSet(new long[]{0xFC004080418000A2L,0xCD24039FFFFFFFFFL,0x0000000000000000L,0x000001FF00000000L});
    public static final BitSet FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive600 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCALS_DIRECTIVE_in_registers_directive608 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_method_name873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_NAME_in_method_name878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_method_prototype904 = new BitSet(new long[]{0x0000000024000100L,0x0098000000000000L});
    public static final BitSet FOLLOW_param_list_in_method_prototype906 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_method_prototype908 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_descriptor_in_method_prototype910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_in_param_list924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_param_list929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_param_list934 = new BitSet(new long[]{0x0000000004000102L,0x0080000000000000L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_literal1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_literal1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_literal1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_literal1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_literal1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_literal1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_literal1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_literal1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LITERAL_in_literal1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_literal_in_literal1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subannotation_in_literal1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_field_method_literal_in_literal1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_literal_in_literal1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_integral_literal1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_integral_literal1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_integral_literal1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_integral_literal1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_integral_literal1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_32bit_literal1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_32bit_literal1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_literal1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_literal1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_literal1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_literal1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_literal1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_fixed_literal1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_literal1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_literal1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_array_literal1264 = new BitSet(new long[]{0x0018200C16600100L,0x10C1640000000000L,0x0000000000000113L});
    public static final BitSet FOLLOW_literal_in_array_literal1267 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_COMMA_in_array_literal1270 = new BitSet(new long[]{0x0018200C06600100L,0x10C1640000000000L,0x0000000000000113L});
    public static final BitSet FOLLOW_literal_in_array_literal1272 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_array_literal1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_annotation_element1289 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_element1291 = new BitSet(new long[]{0x0018200C06600100L,0x10C1640000000000L,0x0000000000000113L});
    public static final BitSet FOLLOW_literal_in_annotation_element1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_annotation1314 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_annotation1316 = new BitSet(new long[]{0x5C10001800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_annotation_element_in_annotation1320 = new BitSet(new long[]{0x5C10001800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1337 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_subannotation1339 = new BitSet(new long[]{0x5C10100800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_annotation_element_in_subannotation1341 = new BitSet(new long[]{0x5C10100800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_DIRECTIVE_in_enum_literal1353 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1355 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_in_enum_literal1357 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_simple_name_in_enum_literal1359 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_enum_literal1361 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal1372 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ARROW_in_type_field_method_literal1378 = new BitSet(new long[]{0x5C10000800200050L,0x22D070107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_simple_name_in_type_field_method_literal1385 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_type_field_method_literal1387 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_type_field_method_literal1396 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_type_field_method_literal1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_TYPE_in_type_field_method_literal1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_method1434 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_method1436 = new BitSet(new long[]{0x5C10000800200050L,0x22D070107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_method_name_in_fully_qualified_method1438 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_fully_qualified_method1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_field1449 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_field1451 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_simple_name_in_fully_qualified_field1453 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_fully_qualified_field1455 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label1466 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_simple_name_in_label1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label_ref_or_offset1477 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_simple_name_in_label_ref_or_offset1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFFSET_in_label_ref_or_offset1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGISTER_in_register_list1499 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_COMMA_in_register_list1502 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_list1504 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_REGISTER_in_register_range1518 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOTDOT_in_register_range1521 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_range1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_field_in_verification_error_reference1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_method_in_verification_error_reference1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_DIRECTIVE_in_catch_directive1553 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_catch_directive1555 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catch_directive1557 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1559 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOTDOT_in_catch_directive1561 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1563 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catch_directive1565 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1576 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catchall_directive1578 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1580 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOTDOT_in_catchall_directive1582 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1584 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catchall_directive1586 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1599 = new BitSet(new long[]{0x0000040000000022L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parameter_directive1601 = new BitSet(new long[]{0x0000040000000022L});
    public static final BitSet FOLLOW_annotation_in_parameter_directive1609 = new BitSet(new long[]{0x0000040000000022L});
    public static final BitSet FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_ordered_debug_directive1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_directive_in_ordered_debug_directive1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_end_local_directive_in_ordered_debug_directive1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_restart_local_directive_in_ordered_debug_directive1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_directive_in_ordered_debug_directive1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_epilogue_directive_in_ordered_debug_directive1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_directive_in_ordered_debug_directive1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_DIRECTIVE_in_line_directive1675 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_line_directive1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_DIRECTIVE_in_local_directive1686 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_local_directive1688 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_local_directive1690 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000118L});
    public static final BitSet FOLLOW_simple_name_in_local_directive1692 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_local_directive1694 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_local_directive1696 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_COMMA_in_local_directive1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1712 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_end_local_directive1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1723 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_restart_local_directive1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_directive1752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_directive1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_instruction1820 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_instruction1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_instruction1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11n_in_instruction1846 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1848 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1850 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_instruction1860 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format12x_in_instruction1870 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1872 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1874 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20bc_in_instruction1884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_instruction1886 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1888 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_verification_error_reference_in_instruction1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20t_in_instruction1898 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_instruction1908 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1910 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1912 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_instruction1922 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1924 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1926 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_instruction1936 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1938 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_instruction1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_instruction1950 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1952 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1954 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_instruction1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21h_in_instruction1964 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1966 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1968 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21s_in_instruction1978 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1980 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1982 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_instruction1992 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1994 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction1996 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22b_in_instruction2008 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2010 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2012 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2014 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2016 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_instruction2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_instruction2026 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2028 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2030 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2032 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2034 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_instruction2044 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2046 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2048 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2050 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2052 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_instruction2062 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2064 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2066 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2068 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2070 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_instruction2080 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2082 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2084 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2086 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2088 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_FIELD_OFFSET_in_instruction2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format22s_in_instruction2098 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2100 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2102 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2104 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2106 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_instruction2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_instruction2116 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2118 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2120 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2122 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2124 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22x_in_instruction2134 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2136 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2138 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_instruction2148 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2150 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2152 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2154 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2156 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT30t_in_instruction2166 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31c_in_instruction2176 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2178 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_instruction2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format31i_in_instruction2190 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2192 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2194 = new BitSet(new long[]{0x0018000002600000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_instruction2204 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2206 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2208 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT32x_in_instruction2218 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2220 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2222 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_instruction2232 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2234 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction2236 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2238 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2240 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_instruction2250 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2252 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction2254 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2256 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2258 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_instruction2268 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2270 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction2272 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2274 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2276 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_instruction2286 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2288 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction2290 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2292 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2294 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_INLINE_INDEX_in_instruction2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_instruction2304 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2306 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction2308 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2310 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_VTABLE_INDEX_in_instruction2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_instruction2322 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2324 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction2326 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2328 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2330 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_instruction2340 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2342 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_instruction2344 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2346 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2348 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_instruction2358 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2360 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction2362 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2364 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2366 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_instruction2376 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2378 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction2380 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2382 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2384 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_INLINE_INDEX_in_instruction2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_instruction2394 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2396 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction2398 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2400 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_VTABLE_INDEX_in_instruction2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_TYPE_in_instruction2412 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2414 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2416 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_instruction2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_FIELD_in_instruction2426 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2428 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2430 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_FIELD_ODEX_in_instruction2440 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2442 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2444 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_instruction2454 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2456 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2458 = new BitSet(new long[]{0x0018000C02600000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_fixed_literal_in_instruction2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_TYPE_in_instruction2468 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2470 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2472 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2474 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2476 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_FIELD_in_instruction2486 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2488 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2490 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2492 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2494 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_FIELD_ODEX_in_instruction2504 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2506 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2508 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2510 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2512 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_in_instruction2522 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2524 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction2526 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2528 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2530 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_ODEX_in_instruction2540 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2542 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction2544 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2546 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2548 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_TYPE_in_instruction2558 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2560 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_instruction2562 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2564 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_instruction2566 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DATA_DIRECTIVE_in_instruction2575 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_integral_literal_in_instruction2577 = new BitSet(new long[]{0x0018002C02600000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_fixed_literal_in_instruction2579 = new BitSet(new long[]{0x0018002C02600000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_instruction2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKED_SWITCH_DIRECTIVE_in_instruction2589 = new BitSet(new long[]{0x0018000002600000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2591 = new BitSet(new long[]{0x0000020040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2593 = new BitSet(new long[]{0x0000020040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_instruction2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_instruction2603 = new BitSet(new long[]{0x0018080002600000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2606 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_in_instruction2608 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2610 = new BitSet(new long[]{0x0018080002600000L,0x1040240000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_instruction2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_synpred1_smaliIdeaParser347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_synpred2_smaliIdeaParser357 = new BitSet(new long[]{0x0000000000000002L});

}