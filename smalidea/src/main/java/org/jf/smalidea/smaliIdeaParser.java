// $ANTLR 3.4 smaliIdeaParser.g 2012-09-08 18:17:39

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

                if ( ((LA1_0 >= CLASS_DIRECTIVE && LA1_0 <= FIELD_DIRECTIVE)||LA1_0==ANNOTATION_DIRECTIVE||LA1_0==METHOD_DIRECTIVE) ) {
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

                    if ( ((LA3_2 >= POSITIVE_INTEGER_LITERAL && LA3_2 <= NEGATIVE_INTEGER_LITERAL)||(LA3_2 >= FLOAT_LITERAL_OR_ID && LA3_2 <= DOUBLE_LITERAL_OR_ID)||(LA3_2 >= BOOL_LITERAL && LA3_2 <= NULL_LITERAL)||(LA3_2 >= REGISTER && LA3_2 <= VERIFICATION_ERROR_TYPE)||(LA3_2 >= INSTRUCTION_FORMAT10t && LA3_2 <= INSTRUCTION_FORMAT10x_ODEX)||(LA3_2 >= INSTRUCTION_FORMAT11x && LA3_2 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA3_2 >= INSTRUCTION_FORMAT21c_FIELD && LA3_2 <= INSTRUCTION_FORMAT21c_TYPE)||LA3_2==INSTRUCTION_FORMAT21t||(LA3_2 >= INSTRUCTION_FORMAT22c_FIELD && LA3_2 <= INSTRUCTION_FORMAT22s_OR_ID)||LA3_2==INSTRUCTION_FORMAT22t||LA3_2==INSTRUCTION_FORMAT23x||LA3_2==INSTRUCTION_FORMAT31i_OR_ID||LA3_2==INSTRUCTION_FORMAT31t||(LA3_2 >= INSTRUCTION_FORMAT35c_METHOD && LA3_2 <= INSTRUCTION_FORMAT35ms_METHOD)||LA3_2==INSTRUCTION_FORMAT51l||(LA3_2 >= PRIMITIVE_TYPE && LA3_2 <= CLASS_DESCRIPTOR)||LA3_2==PARAM_LIST_OR_ID||(LA3_2 >= SIMPLE_NAME && LA3_2 <= METHOD_NAME)||LA3_2==INTEGER_LITERAL) ) {
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
    // smaliIdeaParser.g:182:1: field : FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ( ( ANNOTATION_DIRECTIVE )=>)? ( ( ANNOTATION_DIRECTIVE )=> annotation )* ( ({...}? =>) ( END_FIELD_DIRECTIVE )? ) ) ;
    public final void field() throws RecognitionException {

        	    boolean markerDone = false;
        	    Marker marker = mark();
        	    boolean annotationsDone = false;
        	    Marker annotationsMarker = null;
            
        try {
            // smaliIdeaParser.g:189:2: ( FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ( ( ANNOTATION_DIRECTIVE )=>)? ( ( ANNOTATION_DIRECTIVE )=> annotation )* ( ({...}? =>) ( END_FIELD_DIRECTIVE )? ) ) )
            // smaliIdeaParser.g:189:4: FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( ( ( ANNOTATION_DIRECTIVE )=>)? ( ( ANNOTATION_DIRECTIVE )=> annotation )* ( ({...}? =>) ( END_FIELD_DIRECTIVE )? ) )
            {
            match(input,FIELD_DIRECTIVE,FOLLOW_FIELD_DIRECTIVE_in_field295); if (state.failed) return ;

            pushFollow(FOLLOW_access_list_in_field297);
            access_list();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_field299);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_field301); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_field303);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            // smaliIdeaParser.g:189:74: ( EQUAL literal )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==EQUAL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // smaliIdeaParser.g:189:75: EQUAL literal
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_field306); if (state.failed) return ;

                    pushFollow(FOLLOW_literal_in_field308);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // smaliIdeaParser.g:190:3: ( ( ( ANNOTATION_DIRECTIVE )=>)? ( ( ANNOTATION_DIRECTIVE )=> annotation )* ( ({...}? =>) ( END_FIELD_DIRECTIVE )? ) )
            // smaliIdeaParser.g:190:7: ( ( ANNOTATION_DIRECTIVE )=>)? ( ( ANNOTATION_DIRECTIVE )=> annotation )* ( ({...}? =>) ( END_FIELD_DIRECTIVE )? )
            {
            // smaliIdeaParser.g:190:7: ( ( ANNOTATION_DIRECTIVE )=>)?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ANNOTATION_DIRECTIVE) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==END_FIELD_DIRECTIVE) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                int LA5_2 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==EOF) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                int LA5_3 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==CLASS_DIRECTIVE) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                int LA5_4 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==SUPER_DIRECTIVE) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                int LA5_5 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==IMPLEMENTS_DIRECTIVE) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                int LA5_6 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==SOURCE_DIRECTIVE) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                int LA5_7 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==METHOD_DIRECTIVE) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                int LA5_8 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            else if ( (LA5_0==FIELD_DIRECTIVE) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                int LA5_9 = input.LA(2);

                if ( (synpred1_smaliIdeaParser()) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // smaliIdeaParser.g:190:8: ( ANNOTATION_DIRECTIVE )=>
                    {
                    if ( state.backtracking==0 ) {annotationsMarker = mark();}

                    }
                    break;

            }


            // smaliIdeaParser.g:191:7: ( ( ANNOTATION_DIRECTIVE )=> annotation )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ANNOTATION_DIRECTIVE) && ((input.LA(1) != END_FIELD_DIRECTIVE))) {
                    int LA6_9 = input.LA(2);

                    if ( (synpred2_smaliIdeaParser()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // smaliIdeaParser.g:191:8: ( ANNOTATION_DIRECTIVE )=> annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_field341);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // smaliIdeaParser.g:193:7: ( ({...}? =>) ( END_FIELD_DIRECTIVE )? )
            // smaliIdeaParser.g:194:11: ({...}? =>) ( END_FIELD_DIRECTIVE )?
            {
            // smaliIdeaParser.g:194:11: ({...}? =>)
            // smaliIdeaParser.g:194:12: {...}? =>
            {
            if ( !((input.LA(1) != END_FIELD_DIRECTIVE)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "field", "input.LA(1) != END_FIELD_DIRECTIVE");
            }

            if ( state.backtracking==0 ) { marker.doneBefore(ElementTypes.FIELD, annotationsMarker); markerDone = true;
            		           annotationsMarker.done(ElementTypes.CLASS_ANNOTATIONS); annotationsDone = true; }

            }


            // smaliIdeaParser.g:198:11: ( END_FIELD_DIRECTIVE )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==END_FIELD_DIRECTIVE) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // smaliIdeaParser.g:198:12: END_FIELD_DIRECTIVE
                    {
                    if ( state.backtracking==0 ) { annotationsMarker.done(ElementTypes.FIELD_ANNOTATIONS); annotationsDone = true; }

                    match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field407); if (state.failed) return ;

                    if ( state.backtracking==0 ) { marker.done(ElementTypes.FIELD); markerDone = true;}

                    }
                    break;

            }


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

            	        if (annotationsMarker != null && !annotationsDone) {
                            annotationsMarker.done(ElementTypes.FIELD_ANNOTATIONS);
                        }
            	        if (!markerDone) {
            	            marker.done(ElementTypes.FIELD);
            	        }
            	
        }
        return ;
    }
    // $ANTLR end "field"



    // $ANTLR start "method"
    // smaliIdeaParser.g:212:1: method : METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE ;
    public final void method() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:214:2: ( METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE )
            // smaliIdeaParser.g:214:4: METHOD_DIRECTIVE access_list method_name method_prototype statements_and_directives END_METHOD_DIRECTIVE
            {
            match(input,METHOD_DIRECTIVE,FOLLOW_METHOD_DIRECTIVE_in_method457); if (state.failed) return ;

            pushFollow(FOLLOW_access_list_in_method459);
            access_list();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_method_name_in_method461);
            method_name();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_method_prototype_in_method463);
            method_prototype();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_statements_and_directives_in_method465);
            statements_and_directives();

            state._fsp--;
            if (state.failed) return ;

            match(input,END_METHOD_DIRECTIVE,FOLLOW_END_METHOD_DIRECTIVE_in_method467); if (state.failed) return ;

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
    // smaliIdeaParser.g:217:1: statements_and_directives : ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )* ;
    public final void statements_and_directives() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:219:2: ( ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )* )
            // smaliIdeaParser.g:219:4: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )*
            {
            // smaliIdeaParser.g:219:4: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==SOURCE_DIRECTIVE||LA9_0==ANNOTATION_DIRECTIVE||(LA9_0 >= REGISTERS_DIRECTIVE && LA9_0 <= ARRAY_DATA_DIRECTIVE)||LA9_0==PACKED_SWITCH_DIRECTIVE||LA9_0==SPARSE_SWITCH_DIRECTIVE||(LA9_0 >= CATCH_DIRECTIVE && LA9_0 <= PARAMETER_DIRECTIVE)||(LA9_0 >= LOCAL_DIRECTIVE && LA9_0 <= EPILOGUE_DIRECTIVE)||(LA9_0 >= INSTRUCTION_FORMAT10t && LA9_0 <= INSTRUCTION_FORMAT5rc_TYPE)||LA9_0==COLON) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // smaliIdeaParser.g:219:5: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false]
            	    {
            	    // smaliIdeaParser.g:219:5: ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation )
            	    int alt8=8;
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
            	        alt8=1;
            	        }
            	        break;
            	    case REGISTERS_DIRECTIVE:
            	    case LOCALS_DIRECTIVE:
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
            	    case SOURCE_DIRECTIVE:
            	    case LINE_DIRECTIVE:
            	    case LOCAL_DIRECTIVE:
            	    case END_LOCAL_DIRECTIVE:
            	    case RESTART_LOCAL_DIRECTIVE:
            	    case PROLOGUE_DIRECTIVE:
            	    case EPILOGUE_DIRECTIVE:
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
            	            // smaliIdeaParser.g:219:7: instruction
            	            {
            	            pushFollow(FOLLOW_instruction_in_statements_and_directives493);
            	            instruction();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // smaliIdeaParser.g:220:5: registers_directive
            	            {
            	            pushFollow(FOLLOW_registers_directive_in_statements_and_directives499);
            	            registers_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // smaliIdeaParser.g:221:5: label
            	            {
            	            pushFollow(FOLLOW_label_in_statements_and_directives505);
            	            label();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // smaliIdeaParser.g:222:5: catch_directive
            	            {
            	            pushFollow(FOLLOW_catch_directive_in_statements_and_directives511);
            	            catch_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 5 :
            	            // smaliIdeaParser.g:223:5: catchall_directive
            	            {
            	            pushFollow(FOLLOW_catchall_directive_in_statements_and_directives517);
            	            catchall_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 6 :
            	            // smaliIdeaParser.g:224:5: parameter_directive
            	            {
            	            pushFollow(FOLLOW_parameter_directive_in_statements_and_directives523);
            	            parameter_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 7 :
            	            // smaliIdeaParser.g:225:5: ordered_debug_directive
            	            {
            	            pushFollow(FOLLOW_ordered_debug_directive_in_statements_and_directives529);
            	            ordered_debug_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 8 :
            	            // smaliIdeaParser.g:226:5: annotation
            	            {
            	            pushFollow(FOLLOW_annotation_in_statements_and_directives535);
            	            annotation();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_sync_in_statements_and_directives541);
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
             marker.done(ElementTypes.METHOD_BODY); 
        }
        return ;
    }
    // $ANTLR end "statements_and_directives"



    // $ANTLR start "registers_directive"
    // smaliIdeaParser.g:230:1: registers_directive : ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal ) ;
    public final void registers_directive() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:232:2: ( ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal ) )
            // smaliIdeaParser.g:232:4: ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal )
            {
            // smaliIdeaParser.g:232:4: ( REGISTERS_DIRECTIVE integral_literal | LOCALS_DIRECTIVE integral_literal )
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
                    // smaliIdeaParser.g:233:4: REGISTERS_DIRECTIVE integral_literal
                    {
                    match(input,REGISTERS_DIRECTIVE,FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive572); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_registers_directive574);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:234:5: LOCALS_DIRECTIVE integral_literal
                    {
                    match(input,LOCALS_DIRECTIVE,FOLLOW_LOCALS_DIRECTIVE_in_registers_directive580); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_registers_directive582);
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
    // smaliIdeaParser.g:240:1: simple_name : ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l );
    public final void simple_name() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:243:2: ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= POSITIVE_INTEGER_LITERAL && input.LA(1) <= NEGATIVE_INTEGER_LITERAL)||(input.LA(1) >= FLOAT_LITERAL_OR_ID && input.LA(1) <= DOUBLE_LITERAL_OR_ID)||(input.LA(1) >= BOOL_LITERAL && input.LA(1) <= NULL_LITERAL)||(input.LA(1) >= REGISTER && input.LA(1) <= VERIFICATION_ERROR_TYPE)||(input.LA(1) >= INSTRUCTION_FORMAT10t && input.LA(1) <= INSTRUCTION_FORMAT10x_ODEX)||(input.LA(1) >= INSTRUCTION_FORMAT11x && input.LA(1) <= INSTRUCTION_FORMAT12x_OR_ID)||(input.LA(1) >= INSTRUCTION_FORMAT21c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT21c_TYPE)||input.LA(1)==INSTRUCTION_FORMAT21t||(input.LA(1) >= INSTRUCTION_FORMAT22c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT22s_OR_ID)||input.LA(1)==INSTRUCTION_FORMAT22t||input.LA(1)==INSTRUCTION_FORMAT23x||input.LA(1)==INSTRUCTION_FORMAT31i_OR_ID||input.LA(1)==INSTRUCTION_FORMAT31t||(input.LA(1) >= INSTRUCTION_FORMAT35c_METHOD && input.LA(1) <= INSTRUCTION_FORMAT35ms_METHOD)||input.LA(1)==INSTRUCTION_FORMAT51l||(input.LA(1) >= PRIMITIVE_TYPE && input.LA(1) <= VOID_TYPE)||input.LA(1)==PARAM_LIST_OR_ID||input.LA(1)==SIMPLE_NAME||input.LA(1)==INTEGER_LITERAL ) {
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
    // smaliIdeaParser.g:285:1: method_name : ( simple_name | METHOD_NAME );
    public final void method_name() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:287:2: ( simple_name | METHOD_NAME )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0 >= POSITIVE_INTEGER_LITERAL && LA11_0 <= NEGATIVE_INTEGER_LITERAL)||(LA11_0 >= FLOAT_LITERAL_OR_ID && LA11_0 <= DOUBLE_LITERAL_OR_ID)||(LA11_0 >= BOOL_LITERAL && LA11_0 <= NULL_LITERAL)||(LA11_0 >= REGISTER && LA11_0 <= VERIFICATION_ERROR_TYPE)||(LA11_0 >= INSTRUCTION_FORMAT10t && LA11_0 <= INSTRUCTION_FORMAT10x_ODEX)||(LA11_0 >= INSTRUCTION_FORMAT11x && LA11_0 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA11_0 >= INSTRUCTION_FORMAT21c_FIELD && LA11_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA11_0==INSTRUCTION_FORMAT21t||(LA11_0 >= INSTRUCTION_FORMAT22c_FIELD && LA11_0 <= INSTRUCTION_FORMAT22s_OR_ID)||LA11_0==INSTRUCTION_FORMAT22t||LA11_0==INSTRUCTION_FORMAT23x||LA11_0==INSTRUCTION_FORMAT31i_OR_ID||LA11_0==INSTRUCTION_FORMAT31t||(LA11_0 >= INSTRUCTION_FORMAT35c_METHOD && LA11_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA11_0==INSTRUCTION_FORMAT51l||(LA11_0 >= PRIMITIVE_TYPE && LA11_0 <= VOID_TYPE)||LA11_0==PARAM_LIST_OR_ID||LA11_0==SIMPLE_NAME||LA11_0==INTEGER_LITERAL) ) {
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
                    // smaliIdeaParser.g:287:4: simple_name
                    {
                    pushFollow(FOLLOW_simple_name_in_method_name845);
                    simple_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:288:4: METHOD_NAME
                    {
                    match(input,METHOD_NAME,FOLLOW_METHOD_NAME_in_method_name850); if (state.failed) return ;

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
    // smaliIdeaParser.g:291:1: method_prototype : OPEN_PAREN param_list CLOSE_PAREN type_descriptor ;
    public final void method_prototype() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:293:2: ( OPEN_PAREN param_list CLOSE_PAREN type_descriptor )
            // smaliIdeaParser.g:293:4: OPEN_PAREN param_list CLOSE_PAREN type_descriptor
            {
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_method_prototype876); if (state.failed) return ;

            pushFollow(FOLLOW_param_list_in_method_prototype878);
            param_list();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_method_prototype880); if (state.failed) return ;

            pushFollow(FOLLOW_type_descriptor_in_method_prototype882);
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
    // smaliIdeaParser.g:296:1: param_list : ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* );
    public final void param_list() throws RecognitionException {
        try {
            // smaliIdeaParser.g:297:2: ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* )
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
            case PRIMITIVE_TYPE:
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
            case CLOSE_PAREN:
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
                    // smaliIdeaParser.g:297:4: PARAM_LIST
                    {
                    match(input,PARAM_LIST,FOLLOW_PARAM_LIST_in_param_list896); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:298:4: PARAM_LIST_OR_ID
                    {
                    match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_param_list901); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:299:4: ( nonvoid_type_descriptor )*
                    {
                    // smaliIdeaParser.g:299:4: ( nonvoid_type_descriptor )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==PRIMITIVE_TYPE||(LA12_0 >= CLASS_DESCRIPTOR && LA12_0 <= ARRAY_DESCRIPTOR)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // smaliIdeaParser.g:299:4: nonvoid_type_descriptor
                    	    {
                    	    pushFollow(FOLLOW_nonvoid_type_descriptor_in_param_list906);
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
    // smaliIdeaParser.g:301:1: type_descriptor : ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:302:2: ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= PRIMITIVE_TYPE && input.LA(1) <= ARRAY_DESCRIPTOR) ) {
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
    // smaliIdeaParser.g:307:1: nonvoid_type_descriptor : ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void nonvoid_type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:308:2: ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==PRIMITIVE_TYPE||(input.LA(1) >= CLASS_DESCRIPTOR && input.LA(1) <= ARRAY_DESCRIPTOR) ) {
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
    // smaliIdeaParser.g:312:1: reference_type_descriptor : ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void reference_type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:313:2: ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= CLASS_DESCRIPTOR && input.LA(1) <= ARRAY_DESCRIPTOR) ) {
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
    // smaliIdeaParser.g:316:1: integer_literal : ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL );
    public final void integer_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:317:2: ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | INTEGER_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= POSITIVE_INTEGER_LITERAL && input.LA(1) <= NEGATIVE_INTEGER_LITERAL)||input.LA(1)==INTEGER_LITERAL ) {
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
    // smaliIdeaParser.g:321:1: float_literal : ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL );
    public final void float_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:322:2: ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==FLOAT_LITERAL_OR_ID||input.LA(1)==FLOAT_LITERAL ) {
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
    // smaliIdeaParser.g:325:1: double_literal : ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL );
    public final void double_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:326:2: ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==DOUBLE_LITERAL_OR_ID||input.LA(1)==DOUBLE_LITERAL ) {
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
    // smaliIdeaParser.g:329:1: literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal );
    public final void literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:330:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal )
            int alt14=14;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt14=1;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
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
            case PRIMITIVE_TYPE:
            case VOID_TYPE:
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
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
                    // smaliIdeaParser.g:330:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_literal1022); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:331:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_literal1027);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:332:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_literal1032); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:333:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_literal1037); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:334:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_literal1042);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:335:4: double_literal
                    {
                    pushFollow(FOLLOW_double_literal_in_literal1047);
                    double_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:336:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal1052); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:337:4: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal1057); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // smaliIdeaParser.g:338:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_literal1062); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // smaliIdeaParser.g:339:4: NULL_LITERAL
                    {
                    match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_literal1067); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // smaliIdeaParser.g:340:4: array_literal
                    {
                    pushFollow(FOLLOW_array_literal_in_literal1072);
                    array_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // smaliIdeaParser.g:341:4: subannotation
                    {
                    pushFollow(FOLLOW_subannotation_in_literal1077);
                    subannotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // smaliIdeaParser.g:342:4: type_field_method_literal
                    {
                    pushFollow(FOLLOW_type_field_method_literal_in_literal1082);
                    type_field_method_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // smaliIdeaParser.g:343:4: enum_literal
                    {
                    pushFollow(FOLLOW_enum_literal_in_literal1087);
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
        }
        return ;
    }
    // $ANTLR end "literal"



    // $ANTLR start "integral_literal"
    // smaliIdeaParser.g:345:1: integral_literal : ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL );
    public final void integral_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:346:2: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL )
            int alt15=5;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt15=1;
                }
                break;
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
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
                    // smaliIdeaParser.g:346:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_integral_literal1096); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:347:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_integral_literal1101);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:348:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_integral_literal1106); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:349:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_integral_literal1111); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:350:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_integral_literal1116); if (state.failed) return ;

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
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
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
            case FLOAT_LITERAL_OR_ID:
            case FLOAT_LITERAL:
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
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1125); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:354:4: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_fixed_32bit_literal1130);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:355:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1135); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:356:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1140); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:357:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_fixed_32bit_literal1145);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:358:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1150); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:359:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1155); if (state.failed) return ;

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
            case POSITIVE_INTEGER_LITERAL:
            case NEGATIVE_INTEGER_LITERAL:
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
            case FLOAT_LITERAL_OR_ID:
            case FLOAT_LITERAL:
                {
                alt17=5;
                }
                break;
            case DOUBLE_LITERAL_OR_ID:
            case DOUBLE_LITERAL:
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
                    pushFollow(FOLLOW_integer_literal_in_fixed_literal1164);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:363:4: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_literal1169); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:364:4: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_literal1174); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:365:4: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_literal1179); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:366:4: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_fixed_literal1184);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:367:4: double_literal
                    {
                    pushFollow(FOLLOW_double_literal_in_fixed_literal1189);
                    double_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:368:4: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_literal1194); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:369:4: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_literal1199); if (state.failed) return ;

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
            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_array_literal1208); if (state.failed) return ;

            // smaliIdeaParser.g:372:15: ( literal ( COMMA literal )* |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==SUBANNOTATION_DIRECTIVE||LA19_0==ENUM_DIRECTIVE||(LA19_0 >= POSITIVE_INTEGER_LITERAL && LA19_0 <= NULL_LITERAL)||LA19_0==STRING_LITERAL||LA19_0==CHAR_LITERAL||(LA19_0 >= PRIMITIVE_TYPE && LA19_0 <= ARRAY_DESCRIPTOR)||LA19_0==OPEN_BRACE||LA19_0==INTEGER_LITERAL) ) {
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
                    pushFollow(FOLLOW_literal_in_array_literal1211);
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
                    	    match(input,COMMA,FOLLOW_COMMA_in_array_literal1214); if (state.failed) return ;

                    	    pushFollow(FOLLOW_literal_in_array_literal1216);
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


            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_array_literal1224); if (state.failed) return ;

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
            pushFollow(FOLLOW_simple_name_in_annotation_element1233);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,EQUAL,FOLLOW_EQUAL_in_annotation_element1235); if (state.failed) return ;

            pushFollow(FOLLOW_literal_in_annotation_element1237);
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
            match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1256); if (state.failed) return ;

            match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_annotation1258); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_annotation1260); if (state.failed) return ;

            // smaliIdeaParser.g:381:3: ( annotation_element )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= POSITIVE_INTEGER_LITERAL && LA20_0 <= NEGATIVE_INTEGER_LITERAL)||(LA20_0 >= FLOAT_LITERAL_OR_ID && LA20_0 <= DOUBLE_LITERAL_OR_ID)||(LA20_0 >= BOOL_LITERAL && LA20_0 <= NULL_LITERAL)||(LA20_0 >= REGISTER && LA20_0 <= VERIFICATION_ERROR_TYPE)||(LA20_0 >= INSTRUCTION_FORMAT10t && LA20_0 <= INSTRUCTION_FORMAT10x_ODEX)||(LA20_0 >= INSTRUCTION_FORMAT11x && LA20_0 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA20_0 >= INSTRUCTION_FORMAT21c_FIELD && LA20_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA20_0==INSTRUCTION_FORMAT21t||(LA20_0 >= INSTRUCTION_FORMAT22c_FIELD && LA20_0 <= INSTRUCTION_FORMAT22s_OR_ID)||LA20_0==INSTRUCTION_FORMAT22t||LA20_0==INSTRUCTION_FORMAT23x||LA20_0==INSTRUCTION_FORMAT31i_OR_ID||LA20_0==INSTRUCTION_FORMAT31t||(LA20_0 >= INSTRUCTION_FORMAT35c_METHOD && LA20_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA20_0==INSTRUCTION_FORMAT51l||(LA20_0 >= PRIMITIVE_TYPE && LA20_0 <= VOID_TYPE)||LA20_0==PARAM_LIST_OR_ID||LA20_0==SIMPLE_NAME||LA20_0==INTEGER_LITERAL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // smaliIdeaParser.g:381:3: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_annotation1264);
            	    annotation_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(input,END_ANNOTATION_DIRECTIVE,FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1267); if (state.failed) return ;

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
            match(input,SUBANNOTATION_DIRECTIVE,FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1281); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_subannotation1283); if (state.failed) return ;

            // smaliIdeaParser.g:385:45: ( annotation_element )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= POSITIVE_INTEGER_LITERAL && LA21_0 <= NEGATIVE_INTEGER_LITERAL)||(LA21_0 >= FLOAT_LITERAL_OR_ID && LA21_0 <= DOUBLE_LITERAL_OR_ID)||(LA21_0 >= BOOL_LITERAL && LA21_0 <= NULL_LITERAL)||(LA21_0 >= REGISTER && LA21_0 <= VERIFICATION_ERROR_TYPE)||(LA21_0 >= INSTRUCTION_FORMAT10t && LA21_0 <= INSTRUCTION_FORMAT10x_ODEX)||(LA21_0 >= INSTRUCTION_FORMAT11x && LA21_0 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA21_0 >= INSTRUCTION_FORMAT21c_FIELD && LA21_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_0==INSTRUCTION_FORMAT21t||(LA21_0 >= INSTRUCTION_FORMAT22c_FIELD && LA21_0 <= INSTRUCTION_FORMAT22s_OR_ID)||LA21_0==INSTRUCTION_FORMAT22t||LA21_0==INSTRUCTION_FORMAT23x||LA21_0==INSTRUCTION_FORMAT31i_OR_ID||LA21_0==INSTRUCTION_FORMAT31t||(LA21_0 >= INSTRUCTION_FORMAT35c_METHOD && LA21_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA21_0==INSTRUCTION_FORMAT51l||(LA21_0 >= PRIMITIVE_TYPE && LA21_0 <= VOID_TYPE)||LA21_0==PARAM_LIST_OR_ID||LA21_0==SIMPLE_NAME||LA21_0==INTEGER_LITERAL) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // smaliIdeaParser.g:385:45: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_subannotation1285);
            	    annotation_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,END_SUBANNOTATION_DIRECTIVE,FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1288); if (state.failed) return ;

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
            match(input,ENUM_DIRECTIVE,FOLLOW_ENUM_DIRECTIVE_in_enum_literal1297); if (state.failed) return ;

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1299);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_enum_literal1301); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_enum_literal1303);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_enum_literal1305); if (state.failed) return ;

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1307);
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
    // smaliIdeaParser.g:390:1: type_field_method_literal : ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) ) | PRIMITIVE_TYPE | VOID_TYPE );
    public final void type_field_method_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:391:2: ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) ) | PRIMITIVE_TYPE | VOID_TYPE )
            int alt23=3;
            switch ( input.LA(1) ) {
            case CLASS_DESCRIPTOR:
            case ARRAY_DESCRIPTOR:
                {
                alt23=1;
                }
                break;
            case PRIMITIVE_TYPE:
                {
                alt23=2;
                }
                break;
            case VOID_TYPE:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // smaliIdeaParser.g:391:4: reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) )
                    {
                    pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal1316);
                    reference_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:392:3: ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) )
                    // smaliIdeaParser.g:392:5: ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
                    {
                    match(input,ARROW,FOLLOW_ARROW_in_type_field_method_literal1322); if (state.failed) return ;

                    // smaliIdeaParser.g:393:4: ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0 >= POSITIVE_INTEGER_LITERAL && LA22_0 <= NEGATIVE_INTEGER_LITERAL)||(LA22_0 >= FLOAT_LITERAL_OR_ID && LA22_0 <= DOUBLE_LITERAL_OR_ID)||(LA22_0 >= BOOL_LITERAL && LA22_0 <= NULL_LITERAL)||(LA22_0 >= REGISTER && LA22_0 <= VERIFICATION_ERROR_TYPE)||(LA22_0 >= INSTRUCTION_FORMAT10t && LA22_0 <= INSTRUCTION_FORMAT10x_ODEX)||(LA22_0 >= INSTRUCTION_FORMAT11x && LA22_0 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA22_0 >= INSTRUCTION_FORMAT21c_FIELD && LA22_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA22_0==INSTRUCTION_FORMAT21t||(LA22_0 >= INSTRUCTION_FORMAT22c_FIELD && LA22_0 <= INSTRUCTION_FORMAT22s_OR_ID)||LA22_0==INSTRUCTION_FORMAT22t||LA22_0==INSTRUCTION_FORMAT23x||LA22_0==INSTRUCTION_FORMAT31i_OR_ID||LA22_0==INSTRUCTION_FORMAT31t||(LA22_0 >= INSTRUCTION_FORMAT35c_METHOD && LA22_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA22_0==INSTRUCTION_FORMAT51l||(LA22_0 >= PRIMITIVE_TYPE && LA22_0 <= VOID_TYPE)||LA22_0==PARAM_LIST_OR_ID||LA22_0==SIMPLE_NAME||LA22_0==INTEGER_LITERAL) ) {
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
                            pushFollow(FOLLOW_simple_name_in_type_field_method_literal1329);
                            simple_name();

                            state._fsp--;
                            if (state.failed) return ;

                            match(input,COLON,FOLLOW_COLON_in_type_field_method_literal1331); if (state.failed) return ;

                            pushFollow(FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1333);
                            nonvoid_type_descriptor();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // smaliIdeaParser.g:394:6: method_name method_prototype
                            {
                            pushFollow(FOLLOW_method_name_in_type_field_method_literal1340);
                            method_name();

                            state._fsp--;
                            if (state.failed) return ;

                            pushFollow(FOLLOW_method_prototype_in_type_field_method_literal1342);
                            method_prototype();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:397:4: PRIMITIVE_TYPE
                    {
                    match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal1356); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:398:4: VOID_TYPE
                    {
                    match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type_field_method_literal1361); if (state.failed) return ;

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
    // smaliIdeaParser.g:400:1: fully_qualified_method : reference_type_descriptor ARROW method_name method_prototype ;
    public final void fully_qualified_method() throws RecognitionException {
        try {
            // smaliIdeaParser.g:401:2: ( reference_type_descriptor ARROW method_name method_prototype )
            // smaliIdeaParser.g:401:4: reference_type_descriptor ARROW method_name method_prototype
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_method1370);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_method1372); if (state.failed) return ;

            pushFollow(FOLLOW_method_name_in_fully_qualified_method1374);
            method_name();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_method_prototype_in_fully_qualified_method1376);
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
    // smaliIdeaParser.g:403:1: fully_qualified_field : reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor ;
    public final void fully_qualified_field() throws RecognitionException {
        try {
            // smaliIdeaParser.g:404:2: ( reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor )
            // smaliIdeaParser.g:404:4: reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_field1385);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_field1387); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_fully_qualified_field1389);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_fully_qualified_field1391); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1393);
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
    // smaliIdeaParser.g:406:1: label : COLON simple_name ;
    public final void label() throws RecognitionException {
        try {
            // smaliIdeaParser.g:407:2: ( COLON simple_name )
            // smaliIdeaParser.g:407:4: COLON simple_name
            {
            match(input,COLON,FOLLOW_COLON_in_label1402); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_label1404);
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
    // smaliIdeaParser.g:409:1: label_ref_or_offset : ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL );
    public final void label_ref_or_offset() throws RecognitionException {
        try {
            // smaliIdeaParser.g:410:2: ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL )
            int alt24=3;
            switch ( input.LA(1) ) {
            case COLON:
                {
                alt24=1;
                }
                break;
            case OFFSET:
                {
                alt24=2;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
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
                    // smaliIdeaParser.g:410:4: COLON simple_name
                    {
                    match(input,COLON,FOLLOW_COLON_in_label_ref_or_offset1413); if (state.failed) return ;

                    pushFollow(FOLLOW_simple_name_in_label_ref_or_offset1415);
                    simple_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:411:4: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_label_ref_or_offset1420); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:412:4: NEGATIVE_INTEGER_LITERAL
                    {
                    match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1425); if (state.failed) return ;

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
    // smaliIdeaParser.g:414:1: register_list : ( REGISTER ( COMMA REGISTER )* )? ;
    public final void register_list() throws RecognitionException {
        try {
            // smaliIdeaParser.g:415:2: ( ( REGISTER ( COMMA REGISTER )* )? )
            // smaliIdeaParser.g:415:4: ( REGISTER ( COMMA REGISTER )* )?
            {
            // smaliIdeaParser.g:415:4: ( REGISTER ( COMMA REGISTER )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==REGISTER) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // smaliIdeaParser.g:415:5: REGISTER ( COMMA REGISTER )*
                    {
                    match(input,REGISTER,FOLLOW_REGISTER_in_register_list1435); if (state.failed) return ;

                    // smaliIdeaParser.g:415:14: ( COMMA REGISTER )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==COMMA) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // smaliIdeaParser.g:415:15: COMMA REGISTER
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_register_list1438); if (state.failed) return ;

                    	    match(input,REGISTER,FOLLOW_REGISTER_in_register_list1440); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
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
    // smaliIdeaParser.g:417:1: register_range : ( REGISTER ( DOTDOT REGISTER )? )? ;
    public final void register_range() throws RecognitionException {
        try {
            // smaliIdeaParser.g:418:2: ( ( REGISTER ( DOTDOT REGISTER )? )? )
            // smaliIdeaParser.g:418:4: ( REGISTER ( DOTDOT REGISTER )? )?
            {
            // smaliIdeaParser.g:418:4: ( REGISTER ( DOTDOT REGISTER )? )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==REGISTER) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // smaliIdeaParser.g:418:5: REGISTER ( DOTDOT REGISTER )?
                    {
                    match(input,REGISTER,FOLLOW_REGISTER_in_register_range1454); if (state.failed) return ;

                    // smaliIdeaParser.g:418:14: ( DOTDOT REGISTER )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==DOTDOT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // smaliIdeaParser.g:418:15: DOTDOT REGISTER
                            {
                            match(input,DOTDOT,FOLLOW_DOTDOT_in_register_range1457); if (state.failed) return ;

                            match(input,REGISTER,FOLLOW_REGISTER_in_register_range1459); if (state.failed) return ;

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
    // smaliIdeaParser.g:420:1: verification_error_reference : ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method );
    public final void verification_error_reference() throws RecognitionException {
        try {
            // smaliIdeaParser.g:421:2: ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==CLASS_DESCRIPTOR) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==SOURCE_DIRECTIVE||LA29_1==ANNOTATION_DIRECTIVE||(LA29_1 >= END_METHOD_DIRECTIVE && LA29_1 <= ARRAY_DATA_DIRECTIVE)||LA29_1==PACKED_SWITCH_DIRECTIVE||LA29_1==SPARSE_SWITCH_DIRECTIVE||(LA29_1 >= CATCH_DIRECTIVE && LA29_1 <= PARAMETER_DIRECTIVE)||(LA29_1 >= LOCAL_DIRECTIVE && LA29_1 <= EPILOGUE_DIRECTIVE)||(LA29_1 >= INSTRUCTION_FORMAT10t && LA29_1 <= INSTRUCTION_FORMAT5rc_TYPE)||LA29_1==COLON) ) {
                    alt29=1;
                }
                else if ( (LA29_1==ARROW) ) {
                    int LA29_4 = input.LA(3);

                    if ( ((LA29_4 >= POSITIVE_INTEGER_LITERAL && LA29_4 <= NEGATIVE_INTEGER_LITERAL)||(LA29_4 >= FLOAT_LITERAL_OR_ID && LA29_4 <= DOUBLE_LITERAL_OR_ID)||(LA29_4 >= BOOL_LITERAL && LA29_4 <= NULL_LITERAL)||(LA29_4 >= REGISTER && LA29_4 <= VERIFICATION_ERROR_TYPE)||(LA29_4 >= INSTRUCTION_FORMAT10t && LA29_4 <= INSTRUCTION_FORMAT10x_ODEX)||(LA29_4 >= INSTRUCTION_FORMAT11x && LA29_4 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA29_4 >= INSTRUCTION_FORMAT21c_FIELD && LA29_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA29_4==INSTRUCTION_FORMAT21t||(LA29_4 >= INSTRUCTION_FORMAT22c_FIELD && LA29_4 <= INSTRUCTION_FORMAT22s_OR_ID)||LA29_4==INSTRUCTION_FORMAT22t||LA29_4==INSTRUCTION_FORMAT23x||LA29_4==INSTRUCTION_FORMAT31i_OR_ID||LA29_4==INSTRUCTION_FORMAT31t||(LA29_4 >= INSTRUCTION_FORMAT35c_METHOD && LA29_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA29_4==INSTRUCTION_FORMAT51l||(LA29_4 >= PRIMITIVE_TYPE && LA29_4 <= VOID_TYPE)||LA29_4==PARAM_LIST_OR_ID||LA29_4==SIMPLE_NAME||LA29_4==INTEGER_LITERAL) ) {
                        int LA29_5 = input.LA(4);

                        if ( (LA29_5==COLON) ) {
                            alt29=2;
                        }
                        else if ( (LA29_5==OPEN_PAREN) ) {
                            alt29=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA29_4==METHOD_NAME) ) {
                        alt29=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA29_0==ARRAY_DESCRIPTOR) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==ARROW) ) {
                    int LA29_4 = input.LA(3);

                    if ( ((LA29_4 >= POSITIVE_INTEGER_LITERAL && LA29_4 <= NEGATIVE_INTEGER_LITERAL)||(LA29_4 >= FLOAT_LITERAL_OR_ID && LA29_4 <= DOUBLE_LITERAL_OR_ID)||(LA29_4 >= BOOL_LITERAL && LA29_4 <= NULL_LITERAL)||(LA29_4 >= REGISTER && LA29_4 <= VERIFICATION_ERROR_TYPE)||(LA29_4 >= INSTRUCTION_FORMAT10t && LA29_4 <= INSTRUCTION_FORMAT10x_ODEX)||(LA29_4 >= INSTRUCTION_FORMAT11x && LA29_4 <= INSTRUCTION_FORMAT12x_OR_ID)||(LA29_4 >= INSTRUCTION_FORMAT21c_FIELD && LA29_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA29_4==INSTRUCTION_FORMAT21t||(LA29_4 >= INSTRUCTION_FORMAT22c_FIELD && LA29_4 <= INSTRUCTION_FORMAT22s_OR_ID)||LA29_4==INSTRUCTION_FORMAT22t||LA29_4==INSTRUCTION_FORMAT23x||LA29_4==INSTRUCTION_FORMAT31i_OR_ID||LA29_4==INSTRUCTION_FORMAT31t||(LA29_4 >= INSTRUCTION_FORMAT35c_METHOD && LA29_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA29_4==INSTRUCTION_FORMAT51l||(LA29_4 >= PRIMITIVE_TYPE && LA29_4 <= VOID_TYPE)||LA29_4==PARAM_LIST_OR_ID||LA29_4==SIMPLE_NAME||LA29_4==INTEGER_LITERAL) ) {
                        int LA29_5 = input.LA(4);

                        if ( (LA29_5==COLON) ) {
                            alt29=2;
                        }
                        else if ( (LA29_5==OPEN_PAREN) ) {
                            alt29=3;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 29, 5, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA29_4==METHOD_NAME) ) {
                        alt29=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // smaliIdeaParser.g:421:4: CLASS_DESCRIPTOR
                    {
                    match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference1472); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:421:23: fully_qualified_field
                    {
                    pushFollow(FOLLOW_fully_qualified_field_in_verification_error_reference1476);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:421:47: fully_qualified_method
                    {
                    pushFollow(FOLLOW_fully_qualified_method_in_verification_error_reference1480);
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
    // smaliIdeaParser.g:423:1: catch_directive : CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset ;
    public final void catch_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:424:2: ( CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
            // smaliIdeaParser.g:424:4: CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
            {
            match(input,CATCH_DIRECTIVE,FOLLOW_CATCH_DIRECTIVE_in_catch_directive1489); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_catch_directive1491);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catch_directive1493); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1495);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_catch_directive1497); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1499);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catch_directive1501); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1503);
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
    // smaliIdeaParser.g:426:1: catchall_directive : CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset ;
    public final void catchall_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:427:2: ( CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
            // smaliIdeaParser.g:427:4: CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
            {
            match(input,CATCHALL_DIRECTIVE,FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1512); if (state.failed) return ;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catchall_directive1514); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1516);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_catchall_directive1518); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1520);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catchall_directive1522); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1524);
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
    // smaliIdeaParser.g:433:1: parameter_directive : PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) ;
    public final void parameter_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:434:2: ( PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) )
            // smaliIdeaParser.g:434:4: PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |)
            {
            match(input,PARAMETER_DIRECTIVE,FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1535); if (state.failed) return ;

            // smaliIdeaParser.g:434:24: ( STRING_LITERAL )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==STRING_LITERAL) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // smaliIdeaParser.g:434:24: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parameter_directive1537); if (state.failed) return ;

                    }
                    break;

            }


            // smaliIdeaParser.g:435:3: ({...}? annotation )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // smaliIdeaParser.g:435:4: {...}? annotation
            	    {
            	    if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "parameter_directive", "input.LA(1) == ANNOTATION_DIRECTIVE");
            	    }

            	    pushFollow(FOLLOW_annotation_in_parameter_directive1545);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // smaliIdeaParser.g:436:3: ( END_PARAMETER_DIRECTIVE |)
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==END_PARAMETER_DIRECTIVE) ) {
                alt32=1;
            }
            else if ( (LA32_0==EOF||(LA32_0 >= CLASS_DIRECTIVE && LA32_0 <= FIELD_DIRECTIVE)||LA32_0==ANNOTATION_DIRECTIVE||(LA32_0 >= METHOD_DIRECTIVE && LA32_0 <= ARRAY_DATA_DIRECTIVE)||LA32_0==PACKED_SWITCH_DIRECTIVE||LA32_0==SPARSE_SWITCH_DIRECTIVE||(LA32_0 >= CATCH_DIRECTIVE && LA32_0 <= PARAMETER_DIRECTIVE)||(LA32_0 >= LOCAL_DIRECTIVE && LA32_0 <= EPILOGUE_DIRECTIVE)||(LA32_0 >= INSTRUCTION_FORMAT10t && LA32_0 <= INSTRUCTION_FORMAT5rc_TYPE)||LA32_0==COLON) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // smaliIdeaParser.g:436:5: END_PARAMETER_DIRECTIVE
                    {
                    match(input,END_PARAMETER_DIRECTIVE,FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1553); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:438:3: 
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
    // smaliIdeaParser.g:440:1: ordered_debug_directive : ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive );
    public final void ordered_debug_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:441:2: ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive )
            int alt33=7;
            switch ( input.LA(1) ) {
            case LINE_DIRECTIVE:
                {
                alt33=1;
                }
                break;
            case LOCAL_DIRECTIVE:
                {
                alt33=2;
                }
                break;
            case END_LOCAL_DIRECTIVE:
                {
                alt33=3;
                }
                break;
            case RESTART_LOCAL_DIRECTIVE:
                {
                alt33=4;
                }
                break;
            case PROLOGUE_DIRECTIVE:
                {
                alt33=5;
                }
                break;
            case EPILOGUE_DIRECTIVE:
                {
                alt33=6;
                }
                break;
            case SOURCE_DIRECTIVE:
                {
                alt33=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // smaliIdeaParser.g:441:4: line_directive
                    {
                    pushFollow(FOLLOW_line_directive_in_ordered_debug_directive1572);
                    line_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:442:4: local_directive
                    {
                    pushFollow(FOLLOW_local_directive_in_ordered_debug_directive1577);
                    local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:443:4: end_local_directive
                    {
                    pushFollow(FOLLOW_end_local_directive_in_ordered_debug_directive1582);
                    end_local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:444:4: restart_local_directive
                    {
                    pushFollow(FOLLOW_restart_local_directive_in_ordered_debug_directive1587);
                    restart_local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:445:4: prologue_directive
                    {
                    pushFollow(FOLLOW_prologue_directive_in_ordered_debug_directive1592);
                    prologue_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:446:4: epilogue_directive
                    {
                    pushFollow(FOLLOW_epilogue_directive_in_ordered_debug_directive1597);
                    epilogue_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:447:4: source_directive
                    {
                    pushFollow(FOLLOW_source_directive_in_ordered_debug_directive1602);
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
    // smaliIdeaParser.g:449:1: line_directive : LINE_DIRECTIVE integral_literal ;
    public final void line_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:450:2: ( LINE_DIRECTIVE integral_literal )
            // smaliIdeaParser.g:450:4: LINE_DIRECTIVE integral_literal
            {
            match(input,LINE_DIRECTIVE,FOLLOW_LINE_DIRECTIVE_in_line_directive1611); if (state.failed) return ;

            pushFollow(FOLLOW_integral_literal_in_line_directive1613);
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
    // smaliIdeaParser.g:452:1: local_directive : LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? ;
    public final void local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:453:2: ( LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? )
            // smaliIdeaParser.g:453:4: LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )?
            {
            match(input,LOCAL_DIRECTIVE,FOLLOW_LOCAL_DIRECTIVE_in_local_directive1622); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_local_directive1624); if (state.failed) return ;

            match(input,COMMA,FOLLOW_COMMA_in_local_directive1626); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_local_directive1628);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_local_directive1630); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_local_directive1632);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            // smaliIdeaParser.g:453:77: ( COMMA STRING_LITERAL )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==COMMA) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // smaliIdeaParser.g:453:78: COMMA STRING_LITERAL
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_local_directive1635); if (state.failed) return ;

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive1637); if (state.failed) return ;

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
    // smaliIdeaParser.g:455:1: end_local_directive : END_LOCAL_DIRECTIVE REGISTER ;
    public final void end_local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:456:2: ( END_LOCAL_DIRECTIVE REGISTER )
            // smaliIdeaParser.g:456:4: END_LOCAL_DIRECTIVE REGISTER
            {
            match(input,END_LOCAL_DIRECTIVE,FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1648); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_end_local_directive1650); if (state.failed) return ;

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
    // smaliIdeaParser.g:458:1: restart_local_directive : RESTART_LOCAL_DIRECTIVE REGISTER ;
    public final void restart_local_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:459:2: ( RESTART_LOCAL_DIRECTIVE REGISTER )
            // smaliIdeaParser.g:459:4: RESTART_LOCAL_DIRECTIVE REGISTER
            {
            match(input,RESTART_LOCAL_DIRECTIVE,FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1659); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_restart_local_directive1661); if (state.failed) return ;

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
    // smaliIdeaParser.g:461:1: prologue_directive : PROLOGUE_DIRECTIVE ;
    public final void prologue_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:462:2: ( PROLOGUE_DIRECTIVE )
            // smaliIdeaParser.g:462:4: PROLOGUE_DIRECTIVE
            {
            match(input,PROLOGUE_DIRECTIVE,FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1670); if (state.failed) return ;

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
    // smaliIdeaParser.g:464:1: epilogue_directive : EPILOGUE_DIRECTIVE ;
    public final void epilogue_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:465:2: ( EPILOGUE_DIRECTIVE )
            // smaliIdeaParser.g:465:4: EPILOGUE_DIRECTIVE
            {
            match(input,EPILOGUE_DIRECTIVE,FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1679); if (state.failed) return ;

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
    // smaliIdeaParser.g:467:1: source_directive : SOURCE_DIRECTIVE STRING_LITERAL ;
    public final void source_directive() throws RecognitionException {
        try {
            // smaliIdeaParser.g:468:2: ( SOURCE_DIRECTIVE STRING_LITERAL )
            // smaliIdeaParser.g:468:4: SOURCE_DIRECTIVE STRING_LITERAL
            {
            match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_directive1688); if (state.failed) return ;

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_directive1690); if (state.failed) return ;

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
    // smaliIdeaParser.g:470:1: instruction_format12x : ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID );
    public final void instruction_format12x() throws RecognitionException {
        try {
            // smaliIdeaParser.g:471:2: ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT12x_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT12x) ) {
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
    // smaliIdeaParser.g:474:1: instruction_format22s : ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID );
    public final void instruction_format22s() throws RecognitionException {
        try {
            // smaliIdeaParser.g:475:2: ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT22s_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT22s) ) {
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
    // smaliIdeaParser.g:478:1: instruction_format31i : ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID );
    public final void instruction_format31i() throws RecognitionException {
        try {
            // smaliIdeaParser.g:479:2: ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID )
            // smaliIdeaParser.g:
            {
            if ( (input.LA(1) >= INSTRUCTION_FORMAT31i_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT31i) ) {
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
    // smaliIdeaParser.g:482:1: instruction : ( INSTRUCTION_FORMAT10t label_ref_or_offset | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal | INSTRUCTION_FORMAT11x REGISTER | instruction_format12x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference | INSTRUCTION_FORMAT20t label_ref_or_offset | INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL | INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) | INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET | instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER | INSTRUCTION_FORMAT30t label_ref_or_offset | INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL | instruction_format31i REGISTER COMMA fixed_32bit_literal | INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal | INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE | PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE | SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE );
    public final void instruction() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:484:2: ( INSTRUCTION_FORMAT10t label_ref_or_offset | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal | INSTRUCTION_FORMAT11x REGISTER | instruction_format12x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference | INSTRUCTION_FORMAT20t label_ref_or_offset | INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL | INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal | INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) | INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET | instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal | INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER | INSTRUCTION_FORMAT30t label_ref_or_offset | INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL | instruction_format31i REGISTER COMMA fixed_32bit_literal | INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset | INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER | INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX | INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX | INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor | INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal | INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor | INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field | INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method | INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor | ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE | PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE | SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE )
            int alt38=52;
            switch ( input.LA(1) ) {
            case INSTRUCTION_FORMAT10t:
                {
                alt38=1;
                }
                break;
            case INSTRUCTION_FORMAT10x:
                {
                alt38=2;
                }
                break;
            case INSTRUCTION_FORMAT10x_ODEX:
                {
                alt38=3;
                }
                break;
            case INSTRUCTION_FORMAT11n:
                {
                alt38=4;
                }
                break;
            case INSTRUCTION_FORMAT11x:
                {
                alt38=5;
                }
                break;
            case INSTRUCTION_FORMAT12x_OR_ID:
            case INSTRUCTION_FORMAT12x:
                {
                alt38=6;
                }
                break;
            case INSTRUCTION_FORMAT20bc:
                {
                alt38=7;
                }
                break;
            case INSTRUCTION_FORMAT20t:
                {
                alt38=8;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD:
                {
                alt38=9;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                {
                alt38=10;
                }
                break;
            case INSTRUCTION_FORMAT21c_STRING:
                {
                alt38=11;
                }
                break;
            case INSTRUCTION_FORMAT21c_TYPE:
                {
                alt38=12;
                }
                break;
            case INSTRUCTION_FORMAT21h:
                {
                alt38=13;
                }
                break;
            case INSTRUCTION_FORMAT21s:
                {
                alt38=14;
                }
                break;
            case INSTRUCTION_FORMAT21t:
                {
                alt38=15;
                }
                break;
            case INSTRUCTION_FORMAT22b:
                {
                alt38=16;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD:
                {
                alt38=17;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                {
                alt38=18;
                }
                break;
            case INSTRUCTION_FORMAT22c_TYPE:
                {
                alt38=19;
                }
                break;
            case INSTRUCTION_FORMAT22cs_FIELD:
                {
                alt38=20;
                }
                break;
            case INSTRUCTION_FORMAT22s_OR_ID:
            case INSTRUCTION_FORMAT22s:
                {
                alt38=21;
                }
                break;
            case INSTRUCTION_FORMAT22t:
                {
                alt38=22;
                }
                break;
            case INSTRUCTION_FORMAT22x:
                {
                alt38=23;
                }
                break;
            case INSTRUCTION_FORMAT23x:
                {
                alt38=24;
                }
                break;
            case INSTRUCTION_FORMAT30t:
                {
                alt38=25;
                }
                break;
            case INSTRUCTION_FORMAT31c:
                {
                alt38=26;
                }
                break;
            case INSTRUCTION_FORMAT31i_OR_ID:
            case INSTRUCTION_FORMAT31i:
                {
                alt38=27;
                }
                break;
            case INSTRUCTION_FORMAT31t:
                {
                alt38=28;
                }
                break;
            case INSTRUCTION_FORMAT32x:
                {
                alt38=29;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD:
                {
                alt38=30;
                }
                break;
            case INSTRUCTION_FORMAT35c_TYPE:
                {
                alt38=31;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD_ODEX:
                {
                alt38=32;
                }
                break;
            case INSTRUCTION_FORMAT35mi_METHOD:
                {
                alt38=33;
                }
                break;
            case INSTRUCTION_FORMAT35ms_METHOD:
                {
                alt38=34;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD:
                {
                alt38=35;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
                {
                alt38=36;
                }
                break;
            case INSTRUCTION_FORMAT3rc_TYPE:
                {
                alt38=37;
                }
                break;
            case INSTRUCTION_FORMAT3rmi_METHOD:
                {
                alt38=38;
                }
                break;
            case INSTRUCTION_FORMAT3rms_METHOD:
                {
                alt38=39;
                }
                break;
            case INSTRUCTION_FORMAT41c_TYPE:
                {
                alt38=40;
                }
                break;
            case INSTRUCTION_FORMAT41c_FIELD:
                {
                alt38=41;
                }
                break;
            case INSTRUCTION_FORMAT41c_FIELD_ODEX:
                {
                alt38=42;
                }
                break;
            case INSTRUCTION_FORMAT51l:
                {
                alt38=43;
                }
                break;
            case INSTRUCTION_FORMAT52c_TYPE:
                {
                alt38=44;
                }
                break;
            case INSTRUCTION_FORMAT52c_FIELD:
                {
                alt38=45;
                }
                break;
            case INSTRUCTION_FORMAT52c_FIELD_ODEX:
                {
                alt38=46;
                }
                break;
            case INSTRUCTION_FORMAT5rc_METHOD:
                {
                alt38=47;
                }
                break;
            case INSTRUCTION_FORMAT5rc_METHOD_ODEX:
                {
                alt38=48;
                }
                break;
            case INSTRUCTION_FORMAT5rc_TYPE:
                {
                alt38=49;
                }
                break;
            case ARRAY_DATA_DIRECTIVE:
                {
                alt38=50;
                }
                break;
            case PACKED_SWITCH_DIRECTIVE:
                {
                alt38=51;
                }
                break;
            case SPARSE_SWITCH_DIRECTIVE:
                {
                alt38=52;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // smaliIdeaParser.g:486:3: INSTRUCTION_FORMAT10t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_instruction1756); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1758);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:488:3: INSTRUCTION_FORMAT10x
                    {
                    match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_instruction1766); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:490:3: INSTRUCTION_FORMAT10x_ODEX
                    {
                    match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_instruction1774); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:492:3: INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT11n,FOLLOW_INSTRUCTION_FORMAT11n_in_instruction1782); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1784); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1786); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction1788);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:494:3: INSTRUCTION_FORMAT11x REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_instruction1796); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1798); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:496:3: instruction_format12x REGISTER COMMA REGISTER
                    {
                    pushFollow(FOLLOW_instruction_format12x_in_instruction1806);
                    instruction_format12x();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1808); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1810); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1812); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:498:3: INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference
                    {
                    match(input,INSTRUCTION_FORMAT20bc,FOLLOW_INSTRUCTION_FORMAT20bc_in_instruction1820); if (state.failed) return ;

                    match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_instruction1822); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1824); if (state.failed) return ;

                    pushFollow(FOLLOW_verification_error_reference_in_instruction1826);
                    verification_error_reference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:500:3: INSTRUCTION_FORMAT20t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT20t,FOLLOW_INSTRUCTION_FORMAT20t_in_instruction1834); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1836);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // smaliIdeaParser.g:502:3: INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_instruction1844); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1846); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1848); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction1850);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // smaliIdeaParser.g:504:3: INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_instruction1858); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1860); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1862); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction1864);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // smaliIdeaParser.g:506:3: INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
                    {
                    match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_instruction1872); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1874); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1876); if (state.failed) return ;

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_instruction1878); if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // smaliIdeaParser.g:508:3: INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_instruction1886); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1888); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1890); if (state.failed) return ;

                    pushFollow(FOLLOW_reference_type_descriptor_in_instruction1892);
                    reference_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // smaliIdeaParser.g:510:3: INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT21h,FOLLOW_INSTRUCTION_FORMAT21h_in_instruction1900); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1902); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1904); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction1906);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // smaliIdeaParser.g:512:3: INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT21s,FOLLOW_INSTRUCTION_FORMAT21s_in_instruction1914); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1916); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1918); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction1920);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // smaliIdeaParser.g:514:3: INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset )
                    {
                    match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_instruction1928); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1930); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1932); if (state.failed) return ;

                    // smaliIdeaParser.g:514:40: ( label_ref_or_offset )
                    // smaliIdeaParser.g:514:41: label_ref_or_offset
                    {
                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction1935);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }


                    }
                    break;
                case 16 :
                    // smaliIdeaParser.g:516:3: INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
                    {
                    match(input,INSTRUCTION_FORMAT22b,FOLLOW_INSTRUCTION_FORMAT22b_in_instruction1944); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1946); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1948); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1950); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1952); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction1954);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // smaliIdeaParser.g:518:3: INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_instruction1962); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1964); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1966); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1968); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1970); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction1972);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // smaliIdeaParser.g:520:3: INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_instruction1980); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1982); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1984); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction1986); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction1988); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction1990);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 19 :
                    // smaliIdeaParser.g:522:3: INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_instruction1998); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2000); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2002); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2004); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2006); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2008);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 20 :
                    // smaliIdeaParser.g:524:3: INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
                    {
                    match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_instruction2016); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2018); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2020); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2022); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2024); if (state.failed) return ;

                    match(input,FIELD_OFFSET,FOLLOW_FIELD_OFFSET_in_instruction2026); if (state.failed) return ;

                    }
                    break;
                case 21 :
                    // smaliIdeaParser.g:526:3: instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
                    {
                    pushFollow(FOLLOW_instruction_format22s_in_instruction2034);
                    instruction_format22s();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2036); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2038); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2040); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2042); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction2044);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 22 :
                    // smaliIdeaParser.g:528:3: INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_instruction2052); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2054); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2056); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2058); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2060); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2062);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 23 :
                    // smaliIdeaParser.g:530:3: INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT22x,FOLLOW_INSTRUCTION_FORMAT22x_in_instruction2070); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2072); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2074); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2076); if (state.failed) return ;

                    }
                    break;
                case 24 :
                    // smaliIdeaParser.g:532:3: INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_instruction2084); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2086); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2088); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2090); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2092); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2094); if (state.failed) return ;

                    }
                    break;
                case 25 :
                    // smaliIdeaParser.g:534:3: INSTRUCTION_FORMAT30t label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT30t,FOLLOW_INSTRUCTION_FORMAT30t_in_instruction2102); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2104);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 26 :
                    // smaliIdeaParser.g:536:3: INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
                    {
                    match(input,INSTRUCTION_FORMAT31c,FOLLOW_INSTRUCTION_FORMAT31c_in_instruction2112); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2114); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2116); if (state.failed) return ;

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_instruction2118); if (state.failed) return ;

                    }
                    break;
                case 27 :
                    // smaliIdeaParser.g:538:3: instruction_format31i REGISTER COMMA fixed_32bit_literal
                    {
                    pushFollow(FOLLOW_instruction_format31i_in_instruction2126);
                    instruction_format31i();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2128); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2130); if (state.failed) return ;

                    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2132);
                    fixed_32bit_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 28 :
                    // smaliIdeaParser.g:540:3: INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset
                    {
                    match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_instruction2140); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2142); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2144); if (state.failed) return ;

                    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2146);
                    label_ref_or_offset();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 29 :
                    // smaliIdeaParser.g:542:3: INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
                    {
                    match(input,INSTRUCTION_FORMAT32x,FOLLOW_INSTRUCTION_FORMAT32x_in_instruction2154); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2156); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2158); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2160); if (state.failed) return ;

                    }
                    break;
                case 30 :
                    // smaliIdeaParser.g:544:3: INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_instruction2168); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2170); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2172);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2174); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2176); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2178);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 31 :
                    // smaliIdeaParser.g:546:3: INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_instruction2186); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2188); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2190);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2192); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2194); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2196);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 32 :
                    // smaliIdeaParser.g:548:3: INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_instruction2204); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2206); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2208);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2210); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2212); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2214);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 33 :
                    // smaliIdeaParser.g:550:3: INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_instruction2222); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2224); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2226);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2228); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2230); if (state.failed) return ;

                    match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_instruction2232); if (state.failed) return ;

                    }
                    break;
                case 34 :
                    // smaliIdeaParser.g:552:3: INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_instruction2240); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2242); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2244);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2246); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2248); if (state.failed) return ;

                    match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_instruction2250); if (state.failed) return ;

                    }
                    break;
                case 35 :
                    // smaliIdeaParser.g:554:3: INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT3rc_METHOD,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_instruction2258); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2260); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2262);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2264); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2266); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2268);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 36 :
                    // smaliIdeaParser.g:556:3: INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT3rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_instruction2276); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2278); if (state.failed) return ;

                    pushFollow(FOLLOW_register_list_in_instruction2280);
                    register_list();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2282); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2284); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2286);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 37 :
                    // smaliIdeaParser.g:558:3: INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT3rc_TYPE,FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_instruction2294); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2296); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2298);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2300); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2302); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2304);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 38 :
                    // smaliIdeaParser.g:560:3: INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT3rmi_METHOD,FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_instruction2312); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2314); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2316);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2318); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2320); if (state.failed) return ;

                    match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_instruction2322); if (state.failed) return ;

                    }
                    break;
                case 39 :
                    // smaliIdeaParser.g:562:3: INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX
                    {
                    match(input,INSTRUCTION_FORMAT3rms_METHOD,FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_instruction2330); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2332); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2334);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2336); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2338); if (state.failed) return ;

                    match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_instruction2340); if (state.failed) return ;

                    }
                    break;
                case 40 :
                    // smaliIdeaParser.g:564:3: INSTRUCTION_FORMAT41c_TYPE REGISTER COMMA reference_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT41c_TYPE,FOLLOW_INSTRUCTION_FORMAT41c_TYPE_in_instruction2348); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2350); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2352); if (state.failed) return ;

                    pushFollow(FOLLOW_reference_type_descriptor_in_instruction2354);
                    reference_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 41 :
                    // smaliIdeaParser.g:566:3: INSTRUCTION_FORMAT41c_FIELD REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT41c_FIELD,FOLLOW_INSTRUCTION_FORMAT41c_FIELD_in_instruction2362); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2364); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2366); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2368);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 42 :
                    // smaliIdeaParser.g:568:3: INSTRUCTION_FORMAT41c_FIELD_ODEX REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT41c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT41c_FIELD_ODEX_in_instruction2376); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2378); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2380); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2382);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 43 :
                    // smaliIdeaParser.g:570:3: INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
                    {
                    match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_instruction2390); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2392); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2394); if (state.failed) return ;

                    pushFollow(FOLLOW_fixed_literal_in_instruction2396);
                    fixed_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 44 :
                    // smaliIdeaParser.g:572:3: INSTRUCTION_FORMAT52c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT52c_TYPE,FOLLOW_INSTRUCTION_FORMAT52c_TYPE_in_instruction2404); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2406); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2408); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2410); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2412); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2414);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 45 :
                    // smaliIdeaParser.g:574:3: INSTRUCTION_FORMAT52c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT52c_FIELD,FOLLOW_INSTRUCTION_FORMAT52c_FIELD_in_instruction2422); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2424); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2426); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2428); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2430); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2432);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 46 :
                    // smaliIdeaParser.g:576:3: INSTRUCTION_FORMAT52c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
                    {
                    match(input,INSTRUCTION_FORMAT52c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT52c_FIELD_ODEX_in_instruction2440); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2442); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2444); if (state.failed) return ;

                    match(input,REGISTER,FOLLOW_REGISTER_in_instruction2446); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2448); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_field_in_instruction2450);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 47 :
                    // smaliIdeaParser.g:578:3: INSTRUCTION_FORMAT5rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT5rc_METHOD,FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_in_instruction2458); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2460); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2462);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2464); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2466); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2468);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 48 :
                    // smaliIdeaParser.g:580:3: INSTRUCTION_FORMAT5rc_METHOD_ODEX OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
                    {
                    match(input,INSTRUCTION_FORMAT5rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_ODEX_in_instruction2476); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2478); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2480);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2482); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2484); if (state.failed) return ;

                    pushFollow(FOLLOW_fully_qualified_method_in_instruction2486);
                    fully_qualified_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 49 :
                    // smaliIdeaParser.g:582:3: INSTRUCTION_FORMAT5rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
                    {
                    match(input,INSTRUCTION_FORMAT5rc_TYPE,FOLLOW_INSTRUCTION_FORMAT5rc_TYPE_in_instruction2494); if (state.failed) return ;

                    match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_instruction2496); if (state.failed) return ;

                    pushFollow(FOLLOW_register_range_in_instruction2498);
                    register_range();

                    state._fsp--;
                    if (state.failed) return ;

                    match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_instruction2500); if (state.failed) return ;

                    match(input,COMMA,FOLLOW_COMMA_in_instruction2502); if (state.failed) return ;

                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_instruction2504);
                    nonvoid_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 50 :
                    // smaliIdeaParser.g:583:6: ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE
                    {
                    match(input,ARRAY_DATA_DIRECTIVE,FOLLOW_ARRAY_DATA_DIRECTIVE_in_instruction2511); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_instruction2513);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:583:44: ( fixed_literal )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0 >= POSITIVE_INTEGER_LITERAL && LA35_0 <= BOOL_LITERAL)||LA35_0==CHAR_LITERAL||LA35_0==INTEGER_LITERAL) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // smaliIdeaParser.g:583:44: fixed_literal
                    	    {
                    	    pushFollow(FOLLOW_fixed_literal_in_instruction2515);
                    	    fixed_literal();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    match(input,END_ARRAY_DATA_DIRECTIVE,FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_instruction2518); if (state.failed) return ;

                    }
                    break;
                case 51 :
                    // smaliIdeaParser.g:584:6: PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE
                    {
                    match(input,PACKED_SWITCH_DIRECTIVE,FOLLOW_PACKED_SWITCH_DIRECTIVE_in_instruction2525); if (state.failed) return ;

                    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2527);
                    fixed_32bit_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:584:50: ( label_ref_or_offset )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==NEGATIVE_INTEGER_LITERAL||LA36_0==OFFSET||LA36_0==COLON) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // smaliIdeaParser.g:584:50: label_ref_or_offset
                    	    {
                    	    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2529);
                    	    label_ref_or_offset();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    match(input,END_PACKED_SWITCH_DIRECTIVE,FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_instruction2532); if (state.failed) return ;

                    }
                    break;
                case 52 :
                    // smaliIdeaParser.g:585:6: SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE
                    {
                    match(input,SPARSE_SWITCH_DIRECTIVE,FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_instruction2539); if (state.failed) return ;

                    // smaliIdeaParser.g:585:30: ( fixed_32bit_literal ARROW label_ref_or_offset )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0 >= POSITIVE_INTEGER_LITERAL && LA37_0 <= FLOAT_LITERAL_OR_ID)||LA37_0==FLOAT_LITERAL||LA37_0==BOOL_LITERAL||LA37_0==CHAR_LITERAL||LA37_0==INTEGER_LITERAL) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // smaliIdeaParser.g:585:31: fixed_32bit_literal ARROW label_ref_or_offset
                    	    {
                    	    pushFollow(FOLLOW_fixed_32bit_literal_in_instruction2542);
                    	    fixed_32bit_literal();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    match(input,ARROW,FOLLOW_ARROW_in_instruction2544); if (state.failed) return ;

                    	    pushFollow(FOLLOW_label_ref_or_offset_in_instruction2546);
                    	    label_ref_or_offset();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    match(input,END_SPARSE_SWITCH_DIRECTIVE,FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_instruction2550); if (state.failed) return ;

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
        // smaliIdeaParser.g:190:8: ( ANNOTATION_DIRECTIVE )
        // smaliIdeaParser.g:190:9: ANNOTATION_DIRECTIVE
        {
        match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_synpred1_smaliIdeaParser320); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_smaliIdeaParser

    // $ANTLR start synpred2_smaliIdeaParser
    public final void synpred2_smaliIdeaParser_fragment() throws RecognitionException {
        // smaliIdeaParser.g:191:8: ( ANNOTATION_DIRECTIVE )
        // smaliIdeaParser.g:191:9: ANNOTATION_DIRECTIVE
        {
        match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_synpred2_smaliIdeaParser337); if (state.failed) return ;

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


    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA31_eotS =
        "\106\uffff";
    static final String DFA31_eofS =
        "\106\uffff";
    static final String DFA31_minS =
        "\1\7\103\uffff\1\0\1\uffff";
    static final String DFA31_maxS =
        "\1\u0088\103\uffff\1\0\1\uffff";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\103\uffff\1\1";
    static final String DFA31_specialS =
        "\104\uffff\1\0\1\uffff}>";
    static final String[] DFA31_transitionS = {
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

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 435:3: ({...}? annotation )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_68 = input.LA(1);

                         
                        int index31_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 69;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index31_68);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_class_element_in_smali_file65 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_sync_in_smali_file67 = new BitSet(new long[]{0x00000000000091F0L});
    public static final BitSet FOLLOW_EOF_in_smali_file73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_spec_in_class_element93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_super_spec_in_class_element101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implements_spec_in_class_element109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_spec_in_class_element117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_class_element125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_field_in_class_element133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_class_element141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_DIRECTIVE_in_class_spec160 = new BitSet(new long[]{0x2000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_access_list_in_class_spec162 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_class_spec164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_DIRECTIVE_in_super_spec187 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_super_spec189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec215 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_implements_spec217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_spec243 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_spec245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_SPEC_in_access_list268 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_FIELD_DIRECTIVE_in_field295 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_access_list_in_field297 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_field299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_field301 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field303 = new BitSet(new long[]{0x0000000000001202L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_EQUAL_in_field306 = new BitSet(new long[]{0x057FF00000004400L,0xE000000000000000L,0x0000000000000401L,0x0000200000000000L});
    public static final BitSet FOLLOW_literal_in_field308 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_annotation_in_field341 = new BitSet(new long[]{0x0000000000001202L});
    public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DIRECTIVE_in_method457 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000001AL,0x0000200000000000L});
    public static final BitSet FOLLOW_access_list_in_method459 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000001AL,0x0000200000000000L});
    public static final BitSet FOLLOW_method_name_in_method461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_method_prototype_in_method463 = new BitSet(new long[]{0x00000007DEAF1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_statements_and_directives_in_method465 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_METHOD_DIRECTIVE_in_method467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_statements_and_directives493 = new BitSet(new long[]{0x00000007DEAE1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_registers_directive_in_statements_and_directives499 = new BitSet(new long[]{0x00000007DEAE1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_in_statements_and_directives505 = new BitSet(new long[]{0x00000007DEAE1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_catch_directive_in_statements_and_directives511 = new BitSet(new long[]{0x00000007DEAE1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_catchall_directive_in_statements_and_directives517 = new BitSet(new long[]{0x00000007DEAE1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_parameter_directive_in_statements_and_directives523 = new BitSet(new long[]{0x00000007DEAE1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_ordered_debug_directive_in_statements_and_directives529 = new BitSet(new long[]{0x00000007DEAE1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_annotation_in_statements_and_directives535 = new BitSet(new long[]{0x00000007DEAE1080L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_sync_in_statements_and_directives541 = new BitSet(new long[]{0x00000007DEAE1082L,0x00FFFFFFFFFFFFF0L,0x0000000000000100L});
    public static final BitSet FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive572 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCALS_DIRECTIVE_in_registers_directive580 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_method_name845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_NAME_in_method_name850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_method_prototype876 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000002007L});
    public static final BitSet FOLLOW_param_list_in_method_prototype878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_method_prototype880 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_type_descriptor_in_method_prototype882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_in_param_list896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_param_list901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_param_list906 = new BitSet(new long[]{0x0000000000000002L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_literal1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_literal1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_literal1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_literal1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_literal1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_literal1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_literal1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_literal1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LITERAL_in_literal1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_literal_in_literal1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subannotation_in_literal1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_field_method_literal_in_literal1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_literal_in_literal1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_integral_literal1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_integral_literal1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_integral_literal1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_integral_literal1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_integral_literal1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_32bit_literal1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_32bit_literal1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_literal1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_literal1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_literal1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_literal1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_literal1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_fixed_literal1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_literal1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_literal1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_array_literal1208 = new BitSet(new long[]{0x057FF00000004400L,0xE000000000000000L,0x0000000000000C01L,0x0000200000000000L});
    public static final BitSet FOLLOW_literal_in_array_literal1211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_COMMA_in_array_literal1214 = new BitSet(new long[]{0x057FF00000004400L,0xE000000000000000L,0x0000000000000401L,0x0000200000000000L});
    public static final BitSet FOLLOW_literal_in_array_literal1216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_array_literal1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_annotation_element1233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_element1235 = new BitSet(new long[]{0x057FF00000004400L,0xE000000000000000L,0x0000000000000401L,0x0000200000000000L});
    public static final BitSet FOLLOW_literal_in_annotation_element1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1256 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_annotation1258 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_annotation1260 = new BitSet(new long[]{0x7866300000002000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_annotation_element_in_annotation1264 = new BitSet(new long[]{0x7866300000002000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1281 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_subannotation1283 = new BitSet(new long[]{0x7866300000000800L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_annotation_element_in_subannotation1285 = new BitSet(new long[]{0x7866300000000800L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_DIRECTIVE_in_enum_literal1297 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_enum_literal1301 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_enum_literal1303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_enum_literal1305 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal1316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_type_field_method_literal1322 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000001AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_type_field_method_literal1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_type_field_method_literal1331 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_type_field_method_literal1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_method_prototype_in_type_field_method_literal1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_TYPE_in_type_field_method_literal1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_method1370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_method1372 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000001AL,0x0000200000000000L});
    public static final BitSet FOLLOW_method_name_in_fully_qualified_method1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_method_prototype_in_fully_qualified_method1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_field1385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_field1387 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_fully_qualified_field1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_fully_qualified_field1391 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label1402 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_label1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label_ref_or_offset1413 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_label_ref_or_offset1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFFSET_in_label_ref_or_offset1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGISTER_in_register_list1435 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_register_list1438 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_list1440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_REGISTER_in_register_range1454 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOTDOT_in_register_range1457 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_range1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_field_in_verification_error_reference1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_method_in_verification_error_reference1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_DIRECTIVE_in_catch_directive1489 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_catch_directive1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catch_directive1493 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOTDOT_in_catch_directive1497 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catch_directive1501 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catchall_directive1514 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOTDOT_in_catchall_directive1518 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catchall_directive1522 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1535 = new BitSet(new long[]{0x0100000020001002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parameter_directive1537 = new BitSet(new long[]{0x0000000020001002L});
    public static final BitSet FOLLOW_annotation_in_parameter_directive1545 = new BitSet(new long[]{0x0000000020001002L});
    public static final BitSet FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_ordered_debug_directive1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_directive_in_ordered_debug_directive1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_end_local_directive_in_ordered_debug_directive1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_restart_local_directive_in_ordered_debug_directive1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_directive_in_ordered_debug_directive1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_epilogue_directive_in_ordered_debug_directive1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_directive_in_ordered_debug_directive1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_DIRECTIVE_in_line_directive1611 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_line_directive1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_DIRECTIVE_in_local_directive1622 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_local_directive1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_local_directive1626 = new BitSet(new long[]{0x7866300000000000L,0x600201F52BE9E370L,0x000000000000000AL,0x0000200000000000L});
    public static final BitSet FOLLOW_simple_name_in_local_directive1628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_COLON_in_local_directive1630 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_local_directive1632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_local_directive1635 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1648 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_end_local_directive1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1659 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_restart_local_directive1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_directive1688 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_directive1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_instruction1756 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_instruction1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_instruction1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11n_in_instruction1782 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1786 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_instruction1796 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format12x_in_instruction1806 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1810 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20bc_in_instruction1820 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_instruction1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1824 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_verification_error_reference_in_instruction1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20t_in_instruction1834 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_instruction1844 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1848 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_instruction1858 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1862 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_instruction1872 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1876 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_instruction1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_instruction1886 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1890 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_instruction1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21h_in_instruction1900 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1904 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21s_in_instruction1914 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1918 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_instruction1928 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1932 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22b_in_instruction1944 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1948 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1952 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_instruction1962 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1966 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1970 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_instruction1980 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1984 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction1986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction1988 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_instruction1998 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2002 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2006 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_instruction2016 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2020 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_FIELD_OFFSET_in_instruction2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format22s_in_instruction2034 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2038 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2042 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_instruction2052 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2054 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2056 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2060 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22x_in_instruction2070 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2074 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_instruction2084 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2088 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2092 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT30t_in_instruction2102 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31c_in_instruction2112 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2116 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_instruction2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format31i_in_instruction2126 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2130 = new BitSet(new long[]{0x042BF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_instruction2140 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2144 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT32x_in_instruction2154 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2158 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_instruction2168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2170 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2176 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_instruction2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2188 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2194 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_instruction2204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2206 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2212 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_instruction2222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2224 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2230 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_INLINE_INDEX_in_instruction2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_instruction2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2242 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VTABLE_INDEX_in_instruction2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_instruction2258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2260 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2266 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_instruction2276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2278 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_list_in_instruction2280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2284 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_instruction2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2296 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2302 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_instruction2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2314 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2320 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_INLINE_INDEX_in_instruction2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_instruction2330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2332 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VTABLE_INDEX_in_instruction2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_TYPE_in_instruction2348 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2352 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_instruction2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_FIELD_in_instruction2362 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2366 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT41c_FIELD_ODEX_in_instruction2376 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2380 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_instruction2390 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2394 = new BitSet(new long[]{0x043FF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_literal_in_instruction2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_TYPE_in_instruction2404 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2408 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2412 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_FIELD_in_instruction2422 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2424 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2426 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2430 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT52c_FIELD_ODEX_in_instruction2440 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2444 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_instruction2446 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2448 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_field_in_instruction2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_in_instruction2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2460 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2466 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_METHOD_ODEX_in_instruction2476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2478 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2484 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_fully_qualified_method_in_instruction2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT5rc_TYPE_in_instruction2494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_instruction2496 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_register_range_in_instruction2498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_instruction2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_instruction2502 = new BitSet(new long[]{0x0000000000000000L,0xA000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_instruction2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DATA_DIRECTIVE_in_instruction2511 = new BitSet(new long[]{0x0401F00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_integral_literal_in_instruction2513 = new BitSet(new long[]{0x043FF00000100000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_literal_in_instruction2515 = new BitSet(new long[]{0x043FF00000100000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_instruction2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKED_SWITCH_DIRECTIVE_in_instruction2525 = new BitSet(new long[]{0x042BF00000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2527 = new BitSet(new long[]{0x0000200000400000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2529 = new BitSet(new long[]{0x0000200000400000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_instruction2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_instruction2539 = new BitSet(new long[]{0x042BF00001000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_instruction2542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ARROW_in_instruction2544 = new BitSet(new long[]{0x0000200000000000L,0x0000000000000004L,0x0000000000000100L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_instruction2546 = new BitSet(new long[]{0x042BF00001000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_instruction2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_synpred1_smaliIdeaParser320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_synpred2_smaliIdeaParser337 = new BitSet(new long[]{0x0000000000000002L});

}