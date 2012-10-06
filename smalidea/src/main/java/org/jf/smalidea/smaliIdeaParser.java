// $ANTLR 3.4 smaliIdeaParser.g 2012-10-06 14:55:33

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACCESS_SPEC", "ANNOTATION_DIRECTIVE", "ANNOTATION_VISIBILITY", "ARRAY_DATA_DIRECTIVE", "ARRAY_DESCRIPTOR", "ARROW", "BASE_ARRAY_DESCRIPTOR", "BASE_CHAR_LITERAL", "BASE_CLASS_DESCRIPTOR", "BASE_FLOAT", "BASE_FLOAT_OR_ID", "BASE_INTEGER", "BASE_PRIMITIVE_TYPE", "BASE_SIMPLE_NAME", "BASE_STRING_LITERAL", "BASE_TYPE", "BINARY_EXPONENT", "BOOL_LITERAL", "BYTE_LITERAL", "CATCH_DIRECTIVE", "CATCHALL_DIRECTIVE", "CHAR_LITERAL", "CLASS_DESCRIPTOR", "CLASS_DIRECTIVE", "CLOSE_BRACE", "CLOSE_PAREN", "COLON", "COMMA", "DECIMAL_EXPONENT", "DOTDOT", "DOUBLE_LITERAL", "DOUBLE_LITERAL_OR_ID", "END_ANNOTATION_DIRECTIVE", "END_ARRAY_DATA_DIRECTIVE", "END_FIELD_DIRECTIVE", "END_LOCAL_DIRECTIVE", "END_METHOD_DIRECTIVE", "END_PACKED_SWITCH_DIRECTIVE", "END_PARAMETER_DIRECTIVE", "END_SPARSE_SWITCH_DIRECTIVE", "END_SUBANNOTATION_DIRECTIVE", "ENUM_DIRECTIVE", "EPILOGUE_DIRECTIVE", "EQUAL", "ESCAPE_SEQUENCE", "FIELD_DIRECTIVE", "FIELD_OFFSET", "FLOAT_LITERAL", "FLOAT_LITERAL_OR_ID", "HEX_DIGIT", "HEX_DIGITS", "HEX_PREFIX", "IMPLEMENTS_DIRECTIVE", "INLINE_INDEX", "INSTRUCTION_FORMAT10t", "INSTRUCTION_FORMAT10x", "INSTRUCTION_FORMAT10x_ODEX", "INSTRUCTION_FORMAT11n", "INSTRUCTION_FORMAT11x", "INSTRUCTION_FORMAT12x", "INSTRUCTION_FORMAT12x_OR_ID", "INSTRUCTION_FORMAT20bc", "INSTRUCTION_FORMAT20t", "INSTRUCTION_FORMAT21c_FIELD", "INSTRUCTION_FORMAT21c_FIELD_ODEX", "INSTRUCTION_FORMAT21c_STRING", "INSTRUCTION_FORMAT21c_TYPE", "INSTRUCTION_FORMAT21h", "INSTRUCTION_FORMAT21s", "INSTRUCTION_FORMAT21t", "INSTRUCTION_FORMAT22b", "INSTRUCTION_FORMAT22c_FIELD", "INSTRUCTION_FORMAT22c_FIELD_ODEX", "INSTRUCTION_FORMAT22c_TYPE", "INSTRUCTION_FORMAT22cs_FIELD", "INSTRUCTION_FORMAT22s", "INSTRUCTION_FORMAT22s_OR_ID", "INSTRUCTION_FORMAT22t", "INSTRUCTION_FORMAT22x", "INSTRUCTION_FORMAT23x", "INSTRUCTION_FORMAT30t", "INSTRUCTION_FORMAT31c", "INSTRUCTION_FORMAT31i", "INSTRUCTION_FORMAT31i_OR_ID", "INSTRUCTION_FORMAT31t", "INSTRUCTION_FORMAT32x", "INSTRUCTION_FORMAT35c_METHOD", "INSTRUCTION_FORMAT35c_METHOD_ODEX", "INSTRUCTION_FORMAT35c_TYPE", "INSTRUCTION_FORMAT35mi_METHOD", "INSTRUCTION_FORMAT35ms_METHOD", "INSTRUCTION_FORMAT3rc_METHOD", "INSTRUCTION_FORMAT3rc_METHOD_ODEX", "INSTRUCTION_FORMAT3rc_TYPE", "INSTRUCTION_FORMAT3rmi_METHOD", "INSTRUCTION_FORMAT3rms_METHOD", "INSTRUCTION_FORMAT51l", "INVALID_TOKEN", "LINE_COMMENT", "LINE_DIRECTIVE", "LOCAL_DIRECTIVE", "LOCALS_DIRECTIVE", "LONG_LITERAL", "METHOD_DIRECTIVE", "METHOD_NAME", "NEGATIVE_INTEGER_LITERAL", "NULL_LITERAL", "OFFSET", "OPEN_BRACE", "OPEN_PAREN", "PACKED_SWITCH_DIRECTIVE", "PARAM_LIST", "PARAM_LIST_OR_ID", "PARAMETER_DIRECTIVE", "POSITIVE_INTEGER_LITERAL", "PRIMITIVE_TYPE", "PROLOGUE_DIRECTIVE", "REGISTER", "REGISTERS_DIRECTIVE", "RESTART_LOCAL_DIRECTIVE", "SHORT_LITERAL", "SIMPLE_NAME", "SOURCE_DIRECTIVE", "SPARSE_SWITCH_DIRECTIVE", "STRING_LITERAL", "SUBANNOTATION_DIRECTIVE", "SUPER_DIRECTIVE", "VERIFICATION_ERROR_TYPE", "VOID_TYPE", "VTABLE_INDEX", "WHITE_SPACE", "LABEL", "INTEGER_LITERAL", "I_CLASS_DEF", "I_SUPER", "I_IMPLEMENTS", "I_SOURCE", "I_ACCESS_LIST", "I_METHODS", "I_FIELDS", "I_FIELD", "I_FIELD_TYPE", "I_FIELD_INITIAL_VALUE", "I_METHOD", "I_METHOD_PROTOTYPE", "I_METHOD_RETURN_TYPE", "I_REGISTERS", "I_LOCALS", "I_LABELS", "I_LABEL", "I_ANNOTATIONS", "I_ANNOTATION", "I_ANNOTATION_ELEMENT", "I_SUBANNOTATION", "I_ENCODED_FIELD", "I_ENCODED_METHOD", "I_ENCODED_ENUM", "I_ENCODED_ARRAY", "I_ARRAY_ELEMENT_SIZE", "I_ARRAY_ELEMENTS", "I_PACKED_SWITCH_START_KEY", "I_PACKED_SWITCH_TARGET_COUNT", "I_PACKED_SWITCH_TARGETS", "I_PACKED_SWITCH_DECLARATION", "I_PACKED_SWITCH_DECLARATIONS", "I_SPARSE_SWITCH_KEYS", "I_SPARSE_SWITCH_TARGET_COUNT", "I_SPARSE_SWITCH_TARGETS", "I_SPARSE_SWITCH_DECLARATION", "I_SPARSE_SWITCH_DECLARATIONS", "I_ADDRESS", "I_CATCH", "I_CATCHALL", "I_CATCHES", "I_PARAMETER", "I_PARAMETERS", "I_PARAMETER_NOT_SPECIFIED", "I_ORDERED_DEBUG_DIRECTIVES", "I_LINE", "I_LOCAL", "I_END_LOCAL", "I_RESTART_LOCAL", "I_PROLOGUE", "I_EPILOGUE", "I_STATEMENTS", "I_STATEMENT_FORMAT10t", "I_STATEMENT_FORMAT10x", "I_STATEMENT_FORMAT11n", "I_STATEMENT_FORMAT11x", "I_STATEMENT_FORMAT12x", "I_STATEMENT_FORMAT20bc", "I_STATEMENT_FORMAT20t", "I_STATEMENT_FORMAT21c_TYPE", "I_STATEMENT_FORMAT21c_FIELD", "I_STATEMENT_FORMAT21c_STRING", "I_STATEMENT_FORMAT21h", "I_STATEMENT_FORMAT21s", "I_STATEMENT_FORMAT21t", "I_STATEMENT_FORMAT22b", "I_STATEMENT_FORMAT22c_FIELD", "I_STATEMENT_FORMAT22c_TYPE", "I_STATEMENT_FORMAT22s", "I_STATEMENT_FORMAT22t", "I_STATEMENT_FORMAT22x", "I_STATEMENT_FORMAT23x", "I_STATEMENT_FORMAT30t", "I_STATEMENT_FORMAT31c", "I_STATEMENT_FORMAT31i", "I_STATEMENT_FORMAT31t", "I_STATEMENT_FORMAT32x", "I_STATEMENT_FORMAT35c_METHOD", "I_STATEMENT_FORMAT35c_TYPE", "I_STATEMENT_FORMAT3rc_METHOD", "I_STATEMENT_FORMAT3rc_TYPE", "I_STATEMENT_FORMAT51l", "I_STATEMENT_ARRAY_DATA", "I_STATEMENT_PACKED_SWITCH", "I_STATEMENT_SPARSE_SWITCH", "I_REGISTER_RANGE", "I_REGISTER_LIST"
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
        return ;
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
            do {
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
            	    if (state.failed) return ;

            	    pushFollow(FOLLOW_sync_in_smali_file64);
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


            match(input,EOF,FOLLOW_EOF_in_smali_file69); if (state.failed) return ;

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
                if (state.backtracking>0) {state.failed=true; return ;}
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
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:146:5: super_spec
                    {
                    pushFollow(FOLLOW_super_spec_in_class_element89);
                    super_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:147:5: implements_spec
                    {
                    pushFollow(FOLLOW_implements_spec_in_class_element95);
                    implements_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:148:5: source_spec
                    {
                    pushFollow(FOLLOW_source_spec_in_class_element101);
                    source_spec();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:149:5: method
                    {
                    pushFollow(FOLLOW_method_in_class_element107);
                    method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:150:5: field
                    {
                    pushFollow(FOLLOW_field_in_class_element113);
                    field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:151:5: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_class_element119);
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
    // smaliIdeaParser.g:153:1: class_spec : CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR ;
    public final void class_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:155:3: ( CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:155:5: CLASS_DIRECTIVE access_list CLASS_DESCRIPTOR
            {
            match(input,CLASS_DIRECTIVE,FOLLOW_CLASS_DIRECTIVE_in_class_spec137); if (state.failed) return ;

            pushFollow(FOLLOW_access_list_in_class_spec139);
            access_list();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_class_spec141); if (state.failed) return ;

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
    // smaliIdeaParser.g:158:1: super_spec : SUPER_DIRECTIVE CLASS_DESCRIPTOR ;
    public final void super_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:160:3: ( SUPER_DIRECTIVE CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:160:5: SUPER_DIRECTIVE CLASS_DESCRIPTOR
            {
            match(input,SUPER_DIRECTIVE,FOLLOW_SUPER_DIRECTIVE_in_super_spec164); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_super_spec166); if (state.failed) return ;

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
    // smaliIdeaParser.g:163:1: implements_spec : IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR ;
    public final void implements_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:165:3: ( IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR )
            // smaliIdeaParser.g:165:5: IMPLEMENTS_DIRECTIVE CLASS_DESCRIPTOR
            {
            match(input,IMPLEMENTS_DIRECTIVE,FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec189); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_implements_spec191); if (state.failed) return ;

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
    // smaliIdeaParser.g:168:1: source_spec : SOURCE_DIRECTIVE STRING_LITERAL ;
    public final void source_spec() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:170:3: ( SOURCE_DIRECTIVE STRING_LITERAL )
            // smaliIdeaParser.g:170:5: SOURCE_DIRECTIVE STRING_LITERAL
            {
            match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_spec214); if (state.failed) return ;

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_spec216); if (state.failed) return ;

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
    // smaliIdeaParser.g:173:1: access_list : ( ACCESS_SPEC )* ;
    public final void access_list() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:175:3: ( ( ACCESS_SPEC )* )
            // smaliIdeaParser.g:175:5: ( ACCESS_SPEC )*
            {
            // smaliIdeaParser.g:175:5: ( ACCESS_SPEC )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ACCESS_SPEC) ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==ACCESS_SPEC||LA3_2==ANNOTATION_VISIBILITY||LA3_2==BOOL_LITERAL||LA3_2==CLASS_DESCRIPTOR||LA3_2==DOUBLE_LITERAL_OR_ID||LA3_2==FLOAT_LITERAL_OR_ID||(LA3_2 >= INSTRUCTION_FORMAT10t && LA3_2 <= INSTRUCTION_FORMAT10x_ODEX)||LA3_2==INSTRUCTION_FORMAT11x||LA3_2==INSTRUCTION_FORMAT12x_OR_ID||(LA3_2 >= INSTRUCTION_FORMAT21c_FIELD && LA3_2 <= INSTRUCTION_FORMAT21c_TYPE)||LA3_2==INSTRUCTION_FORMAT21t||(LA3_2 >= INSTRUCTION_FORMAT22c_FIELD && LA3_2 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA3_2 >= INSTRUCTION_FORMAT22s_OR_ID && LA3_2 <= INSTRUCTION_FORMAT22t)||LA3_2==INSTRUCTION_FORMAT23x||(LA3_2 >= INSTRUCTION_FORMAT31i_OR_ID && LA3_2 <= INSTRUCTION_FORMAT31t)||(LA3_2 >= INSTRUCTION_FORMAT35c_METHOD && LA3_2 <= INSTRUCTION_FORMAT35ms_METHOD)||LA3_2==INSTRUCTION_FORMAT51l||(LA3_2 >= METHOD_NAME && LA3_2 <= NULL_LITERAL)||LA3_2==PARAM_LIST_OR_ID||(LA3_2 >= POSITIVE_INTEGER_LITERAL && LA3_2 <= PRIMITIVE_TYPE)||LA3_2==REGISTER||LA3_2==SIMPLE_NAME||(LA3_2 >= VERIFICATION_ERROR_TYPE && LA3_2 <= VOID_TYPE)) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // smaliIdeaParser.g:175:5: ACCESS_SPEC
            	    {
            	    match(input,ACCESS_SPEC,FOLLOW_ACCESS_SPEC_in_access_list239); if (state.failed) return ;

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
    // smaliIdeaParser.g:183:1: field : FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |) ;
    public final void field() throws RecognitionException {

            Marker marker = mark();
            Marker annotationsMarker = null;
            boolean classAnnotations = true;
          
        try {
            // smaliIdeaParser.g:189:3: ( FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |) )
            // smaliIdeaParser.g:189:5: FIELD_DIRECTIVE access_list simple_name COLON nonvoid_type_descriptor ( EQUAL literal )? ( END_FIELD_DIRECTIVE | ( ANNOTATION_DIRECTIVE )=> ( ( ( ANNOTATION_DIRECTIVE )=> annotation )+ ( END_FIELD_DIRECTIVE )? ) |)
            {
            match(input,FIELD_DIRECTIVE,FOLLOW_FIELD_DIRECTIVE_in_field266); if (state.failed) return ;

            pushFollow(FOLLOW_access_list_in_field268);
            access_list();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_field270);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_field272); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_field274);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

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
                    match(input,EQUAL,FOLLOW_EQUAL_in_field277); if (state.failed) return ;

                    pushFollow(FOLLOW_literal_in_field279);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

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
                    // smaliIdeaParser.g:190:7: END_FIELD_DIRECTIVE
                    {
                    match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field289); if (state.failed) return ;

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
                    	    // smaliIdeaParser.g:192:35: ( ANNOTATION_DIRECTIVE )=> annotation
                    	    {
                    	    pushFollow(FOLLOW_annotation_in_field345);
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
                            match(input,END_FIELD_DIRECTIVE,FOLLOW_END_FIELD_DIRECTIVE_in_field383); if (state.failed) return ;

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
        return ;
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
    // smaliIdeaParser.g:216:1: statements_and_directives : ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )* ;
    public final void statements_and_directives() throws RecognitionException {
        try {
            // smaliIdeaParser.g:217:3: ( ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )* )
            // smaliIdeaParser.g:217:5: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )*
            {
            // smaliIdeaParser.g:217:5: ( ( instruction | registers_directive | label | catch_directive | catchall_directive | parameter_directive | ordered_debug_directive | annotation ) sync[false] )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ANNOTATION_DIRECTIVE||LA9_0==ARRAY_DATA_DIRECTIVE||(LA9_0 >= CATCH_DIRECTIVE && LA9_0 <= CATCHALL_DIRECTIVE)||LA9_0==COLON||LA9_0==END_LOCAL_DIRECTIVE||LA9_0==EPILOGUE_DIRECTIVE||(LA9_0 >= INSTRUCTION_FORMAT10t && LA9_0 <= INSTRUCTION_FORMAT51l)||(LA9_0 >= LINE_DIRECTIVE && LA9_0 <= LOCALS_DIRECTIVE)||LA9_0==PACKED_SWITCH_DIRECTIVE||LA9_0==PARAMETER_DIRECTIVE||LA9_0==PROLOGUE_DIRECTIVE||(LA9_0 >= REGISTERS_DIRECTIVE && LA9_0 <= RESTART_LOCAL_DIRECTIVE)||(LA9_0 >= SOURCE_DIRECTIVE && LA9_0 <= SPARSE_SWITCH_DIRECTIVE)) ) {
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
            	            // smaliIdeaParser.g:218:8: instruction
            	            {
            	            pushFollow(FOLLOW_instruction_in_statements_and_directives492);
            	            instruction();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // smaliIdeaParser.g:219:9: registers_directive
            	            {
            	            pushFollow(FOLLOW_registers_directive_in_statements_and_directives502);
            	            registers_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // smaliIdeaParser.g:220:9: label
            	            {
            	            pushFollow(FOLLOW_label_in_statements_and_directives512);
            	            label();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // smaliIdeaParser.g:221:9: catch_directive
            	            {
            	            pushFollow(FOLLOW_catch_directive_in_statements_and_directives522);
            	            catch_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 5 :
            	            // smaliIdeaParser.g:222:9: catchall_directive
            	            {
            	            pushFollow(FOLLOW_catchall_directive_in_statements_and_directives532);
            	            catchall_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 6 :
            	            // smaliIdeaParser.g:223:9: parameter_directive
            	            {
            	            pushFollow(FOLLOW_parameter_directive_in_statements_and_directives542);
            	            parameter_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 7 :
            	            // smaliIdeaParser.g:224:9: ordered_debug_directive
            	            {
            	            pushFollow(FOLLOW_ordered_debug_directive_in_statements_and_directives552);
            	            ordered_debug_directive();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 8 :
            	            // smaliIdeaParser.g:225:9: annotation
            	            {
            	            pushFollow(FOLLOW_annotation_in_statements_and_directives562);
            	            annotation();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_sync_in_statements_and_directives576);
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
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // smaliIdeaParser.g:231:7: REGISTERS_DIRECTIVE integral_literal
                    {
                    match(input,REGISTERS_DIRECTIVE,FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive598); if (state.failed) return ;

                    pushFollow(FOLLOW_integral_literal_in_registers_directive600);
                    integral_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:232:7: LOCALS_DIRECTIVE integral_literal
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
    // smaliIdeaParser.g:238:1: simple_name : ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l );
    public final void simple_name() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:241:3: ( SIMPLE_NAME | ACCESS_SPEC | VERIFICATION_ERROR_TYPE | POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL | FLOAT_LITERAL_OR_ID | DOUBLE_LITERAL_OR_ID | BOOL_LITERAL | NULL_LITERAL | REGISTER | PARAM_LIST_OR_ID | PRIMITIVE_TYPE | VOID_TYPE | ANNOTATION_VISIBILITY | INSTRUCTION_FORMAT10t | INSTRUCTION_FORMAT10x | INSTRUCTION_FORMAT10x_ODEX | INSTRUCTION_FORMAT11x | INSTRUCTION_FORMAT12x_OR_ID | INSTRUCTION_FORMAT21c_FIELD | INSTRUCTION_FORMAT21c_FIELD_ODEX | INSTRUCTION_FORMAT21c_STRING | INSTRUCTION_FORMAT21c_TYPE | INSTRUCTION_FORMAT21t | INSTRUCTION_FORMAT22c_FIELD | INSTRUCTION_FORMAT22c_FIELD_ODEX | INSTRUCTION_FORMAT22c_TYPE | INSTRUCTION_FORMAT22cs_FIELD | INSTRUCTION_FORMAT22s_OR_ID | INSTRUCTION_FORMAT22t | INSTRUCTION_FORMAT23x | INSTRUCTION_FORMAT31i_OR_ID | INSTRUCTION_FORMAT31t | INSTRUCTION_FORMAT35c_METHOD | INSTRUCTION_FORMAT35c_METHOD_ODEX | INSTRUCTION_FORMAT35c_TYPE | INSTRUCTION_FORMAT35mi_METHOD | INSTRUCTION_FORMAT35ms_METHOD | INSTRUCTION_FORMAT51l )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==ACCESS_SPEC||input.LA(1)==ANNOTATION_VISIBILITY||input.LA(1)==BOOL_LITERAL||input.LA(1)==DOUBLE_LITERAL_OR_ID||input.LA(1)==FLOAT_LITERAL_OR_ID||(input.LA(1) >= INSTRUCTION_FORMAT10t && input.LA(1) <= INSTRUCTION_FORMAT10x_ODEX)||input.LA(1)==INSTRUCTION_FORMAT11x||input.LA(1)==INSTRUCTION_FORMAT12x_OR_ID||(input.LA(1) >= INSTRUCTION_FORMAT21c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT21c_TYPE)||input.LA(1)==INSTRUCTION_FORMAT21t||(input.LA(1) >= INSTRUCTION_FORMAT22c_FIELD && input.LA(1) <= INSTRUCTION_FORMAT22cs_FIELD)||(input.LA(1) >= INSTRUCTION_FORMAT22s_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT22t)||input.LA(1)==INSTRUCTION_FORMAT23x||(input.LA(1) >= INSTRUCTION_FORMAT31i_OR_ID && input.LA(1) <= INSTRUCTION_FORMAT31t)||(input.LA(1) >= INSTRUCTION_FORMAT35c_METHOD && input.LA(1) <= INSTRUCTION_FORMAT35ms_METHOD)||input.LA(1)==INSTRUCTION_FORMAT51l||(input.LA(1) >= NEGATIVE_INTEGER_LITERAL && input.LA(1) <= NULL_LITERAL)||input.LA(1)==PARAM_LIST_OR_ID||(input.LA(1) >= POSITIVE_INTEGER_LITERAL && input.LA(1) <= PRIMITIVE_TYPE)||input.LA(1)==REGISTER||input.LA(1)==SIMPLE_NAME||(input.LA(1) >= VERIFICATION_ERROR_TYPE && input.LA(1) <= VOID_TYPE) ) {
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
    // smaliIdeaParser.g:282:1: method_name : ( simple_name | METHOD_NAME );
    public final void method_name() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:284:3: ( simple_name | METHOD_NAME )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ACCESS_SPEC||LA11_0==ANNOTATION_VISIBILITY||LA11_0==BOOL_LITERAL||LA11_0==DOUBLE_LITERAL_OR_ID||LA11_0==FLOAT_LITERAL_OR_ID||(LA11_0 >= INSTRUCTION_FORMAT10t && LA11_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA11_0==INSTRUCTION_FORMAT11x||LA11_0==INSTRUCTION_FORMAT12x_OR_ID||(LA11_0 >= INSTRUCTION_FORMAT21c_FIELD && LA11_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA11_0==INSTRUCTION_FORMAT21t||(LA11_0 >= INSTRUCTION_FORMAT22c_FIELD && LA11_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA11_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA11_0 <= INSTRUCTION_FORMAT22t)||LA11_0==INSTRUCTION_FORMAT23x||(LA11_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA11_0 <= INSTRUCTION_FORMAT31t)||(LA11_0 >= INSTRUCTION_FORMAT35c_METHOD && LA11_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA11_0==INSTRUCTION_FORMAT51l||(LA11_0 >= NEGATIVE_INTEGER_LITERAL && LA11_0 <= NULL_LITERAL)||LA11_0==PARAM_LIST_OR_ID||(LA11_0 >= POSITIVE_INTEGER_LITERAL && LA11_0 <= PRIMITIVE_TYPE)||LA11_0==REGISTER||LA11_0==SIMPLE_NAME||(LA11_0 >= VERIFICATION_ERROR_TYPE && LA11_0 <= VOID_TYPE)) ) {
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
                    // smaliIdeaParser.g:284:5: simple_name
                    {
                    pushFollow(FOLLOW_simple_name_in_method_name901);
                    simple_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:285:5: METHOD_NAME
                    {
                    match(input,METHOD_NAME,FOLLOW_METHOD_NAME_in_method_name907); if (state.failed) return ;

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
    // smaliIdeaParser.g:288:1: method_prototype : OPEN_PAREN param_list CLOSE_PAREN type_descriptor ;
    public final void method_prototype() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:290:3: ( OPEN_PAREN param_list CLOSE_PAREN type_descriptor )
            // smaliIdeaParser.g:290:5: OPEN_PAREN param_list CLOSE_PAREN type_descriptor
            {
            match(input,OPEN_PAREN,FOLLOW_OPEN_PAREN_in_method_prototype930); if (state.failed) return ;

            pushFollow(FOLLOW_param_list_in_method_prototype932);
            param_list();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_PAREN,FOLLOW_CLOSE_PAREN_in_method_prototype934); if (state.failed) return ;

            pushFollow(FOLLOW_type_descriptor_in_method_prototype936);
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
    // smaliIdeaParser.g:293:1: param_list : ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* );
    public final void param_list() throws RecognitionException {
        try {
            // smaliIdeaParser.g:294:3: ( PARAM_LIST | PARAM_LIST_OR_ID | ( nonvoid_type_descriptor )* )
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
                    // smaliIdeaParser.g:294:5: PARAM_LIST
                    {
                    match(input,PARAM_LIST,FOLLOW_PARAM_LIST_in_param_list952); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:295:5: PARAM_LIST_OR_ID
                    {
                    match(input,PARAM_LIST_OR_ID,FOLLOW_PARAM_LIST_OR_ID_in_param_list958); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:296:5: ( nonvoid_type_descriptor )*
                    {
                    // smaliIdeaParser.g:296:5: ( nonvoid_type_descriptor )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==ARRAY_DESCRIPTOR||LA12_0==CLASS_DESCRIPTOR||LA12_0==PRIMITIVE_TYPE) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // smaliIdeaParser.g:296:5: nonvoid_type_descriptor
                    	    {
                    	    pushFollow(FOLLOW_nonvoid_type_descriptor_in_param_list964);
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
    // smaliIdeaParser.g:298:1: type_descriptor : ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:299:3: ( VOID_TYPE | PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
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
    // smaliIdeaParser.g:304:1: nonvoid_type_descriptor : ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void nonvoid_type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:305:3: ( PRIMITIVE_TYPE | CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
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
    // smaliIdeaParser.g:309:1: reference_type_descriptor : ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR );
    public final void reference_type_descriptor() throws RecognitionException {
        try {
            // smaliIdeaParser.g:310:3: ( CLASS_DESCRIPTOR | ARRAY_DESCRIPTOR )
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
    // smaliIdeaParser.g:313:1: integer_literal : ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL );
    public final void integer_literal() throws RecognitionException {
        try {
            // smaliIdeaParser.g:314:3: ( POSITIVE_INTEGER_LITERAL | NEGATIVE_INTEGER_LITERAL )
            // smaliIdeaParser.g:
            {
            if ( input.LA(1)==NEGATIVE_INTEGER_LITERAL||input.LA(1)==POSITIVE_INTEGER_LITERAL ) {
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
            // smaliIdeaParser.g:318:3: ( FLOAT_LITERAL_OR_ID | FLOAT_LITERAL )
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
            // smaliIdeaParser.g:322:3: ( DOUBLE_LITERAL_OR_ID | DOUBLE_LITERAL )
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
            // smaliIdeaParser.g:327:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | STRING_LITERAL | BOOL_LITERAL | NULL_LITERAL | array_literal | subannotation | type_field_method_literal | enum_literal )
            int alt14=14;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt14=1;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
            case POSITIVE_INTEGER_LITERAL:
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
                    // smaliIdeaParser.g:327:5: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_literal1096); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:328:5: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_literal1102);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:329:5: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_literal1108); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:330:5: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_literal1114); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:331:5: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_literal1120);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:332:5: double_literal
                    {
                    pushFollow(FOLLOW_double_literal_in_literal1126);
                    double_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:333:5: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal1132); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:334:5: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal1138); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // smaliIdeaParser.g:335:5: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_literal1144); if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // smaliIdeaParser.g:336:5: NULL_LITERAL
                    {
                    match(input,NULL_LITERAL,FOLLOW_NULL_LITERAL_in_literal1150); if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // smaliIdeaParser.g:337:5: array_literal
                    {
                    pushFollow(FOLLOW_array_literal_in_literal1156);
                    array_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // smaliIdeaParser.g:338:5: subannotation
                    {
                    pushFollow(FOLLOW_subannotation_in_literal1162);
                    subannotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // smaliIdeaParser.g:339:5: type_field_method_literal
                    {
                    pushFollow(FOLLOW_type_field_method_literal_in_literal1168);
                    type_field_method_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // smaliIdeaParser.g:340:5: enum_literal
                    {
                    pushFollow(FOLLOW_enum_literal_in_literal1174);
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
            // smaliIdeaParser.g:345:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | CHAR_LITERAL | BYTE_LITERAL )
            int alt15=5;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt15=1;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
            case POSITIVE_INTEGER_LITERAL:
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
                    // smaliIdeaParser.g:345:5: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_integral_literal1197); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:346:5: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_integral_literal1203);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:347:5: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_integral_literal1209); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:348:5: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_integral_literal1215); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:349:5: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_integral_literal1221); if (state.failed) return ;

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
            // smaliIdeaParser.g:353:3: ( LONG_LITERAL | integer_literal | SHORT_LITERAL | BYTE_LITERAL | float_literal | CHAR_LITERAL | BOOL_LITERAL )
            int alt16=7;
            switch ( input.LA(1) ) {
            case LONG_LITERAL:
                {
                alt16=1;
                }
                break;
            case NEGATIVE_INTEGER_LITERAL:
            case POSITIVE_INTEGER_LITERAL:
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
                    // smaliIdeaParser.g:353:5: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1237); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:354:5: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_fixed_32bit_literal1243);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:355:5: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1249); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:356:5: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1255); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:357:5: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_fixed_32bit_literal1261);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:358:5: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1267); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:359:5: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1273); if (state.failed) return ;

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
            // smaliIdeaParser.g:362:3: ( integer_literal | LONG_LITERAL | SHORT_LITERAL | BYTE_LITERAL | float_literal | double_literal | CHAR_LITERAL | BOOL_LITERAL )
            int alt17=8;
            switch ( input.LA(1) ) {
            case NEGATIVE_INTEGER_LITERAL:
            case POSITIVE_INTEGER_LITERAL:
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
                    // smaliIdeaParser.g:362:5: integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_fixed_literal1283);
                    integer_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:363:5: LONG_LITERAL
                    {
                    match(input,LONG_LITERAL,FOLLOW_LONG_LITERAL_in_fixed_literal1289); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:364:5: SHORT_LITERAL
                    {
                    match(input,SHORT_LITERAL,FOLLOW_SHORT_LITERAL_in_fixed_literal1295); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:365:5: BYTE_LITERAL
                    {
                    match(input,BYTE_LITERAL,FOLLOW_BYTE_LITERAL_in_fixed_literal1301); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:366:5: float_literal
                    {
                    pushFollow(FOLLOW_float_literal_in_fixed_literal1307);
                    float_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:367:5: double_literal
                    {
                    pushFollow(FOLLOW_double_literal_in_fixed_literal1313);
                    double_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:368:5: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_fixed_literal1319); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:369:5: BOOL_LITERAL
                    {
                    match(input,BOOL_LITERAL,FOLLOW_BOOL_LITERAL_in_fixed_literal1325); if (state.failed) return ;

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
            // smaliIdeaParser.g:372:3: ( OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE )
            // smaliIdeaParser.g:372:5: OPEN_BRACE ( literal ( COMMA literal )* |) CLOSE_BRACE
            {
            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_array_literal1335); if (state.failed) return ;

            // smaliIdeaParser.g:372:16: ( literal ( COMMA literal )* |)
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ARRAY_DESCRIPTOR||(LA19_0 >= BOOL_LITERAL && LA19_0 <= BYTE_LITERAL)||(LA19_0 >= CHAR_LITERAL && LA19_0 <= CLASS_DESCRIPTOR)||(LA19_0 >= DOUBLE_LITERAL && LA19_0 <= DOUBLE_LITERAL_OR_ID)||LA19_0==ENUM_DIRECTIVE||(LA19_0 >= FLOAT_LITERAL && LA19_0 <= FLOAT_LITERAL_OR_ID)||LA19_0==LONG_LITERAL||(LA19_0 >= NEGATIVE_INTEGER_LITERAL && LA19_0 <= NULL_LITERAL)||LA19_0==OPEN_BRACE||(LA19_0 >= POSITIVE_INTEGER_LITERAL && LA19_0 <= PRIMITIVE_TYPE)||LA19_0==SHORT_LITERAL||(LA19_0 >= STRING_LITERAL && LA19_0 <= SUBANNOTATION_DIRECTIVE)||LA19_0==VOID_TYPE) ) {
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
                    // smaliIdeaParser.g:372:17: literal ( COMMA literal )*
                    {
                    pushFollow(FOLLOW_literal_in_array_literal1338);
                    literal();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:372:25: ( COMMA literal )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // smaliIdeaParser.g:372:26: COMMA literal
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_array_literal1341); if (state.failed) return ;

                    	    pushFollow(FOLLOW_literal_in_array_literal1343);
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
                    // smaliIdeaParser.g:372:44: 
                    {
                    }
                    break;

            }


            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_array_literal1351); if (state.failed) return ;

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
            // smaliIdeaParser.g:375:3: ( simple_name EQUAL literal )
            // smaliIdeaParser.g:375:5: simple_name EQUAL literal
            {
            pushFollow(FOLLOW_simple_name_in_annotation_element1361);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,EQUAL,FOLLOW_EQUAL_in_annotation_element1363); if (state.failed) return ;

            pushFollow(FOLLOW_literal_in_annotation_element1365);
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
            // smaliIdeaParser.g:380:3: ( ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE )
            // smaliIdeaParser.g:380:5: ANNOTATION_DIRECTIVE ANNOTATION_VISIBILITY CLASS_DESCRIPTOR ( annotation_element )* END_ANNOTATION_DIRECTIVE
            {
            match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1383); if (state.failed) return ;

            match(input,ANNOTATION_VISIBILITY,FOLLOW_ANNOTATION_VISIBILITY_in_annotation1385); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_annotation1387); if (state.failed) return ;

            // smaliIdeaParser.g:381:5: ( annotation_element )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ACCESS_SPEC||LA20_0==ANNOTATION_VISIBILITY||LA20_0==BOOL_LITERAL||LA20_0==DOUBLE_LITERAL_OR_ID||LA20_0==FLOAT_LITERAL_OR_ID||(LA20_0 >= INSTRUCTION_FORMAT10t && LA20_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA20_0==INSTRUCTION_FORMAT11x||LA20_0==INSTRUCTION_FORMAT12x_OR_ID||(LA20_0 >= INSTRUCTION_FORMAT21c_FIELD && LA20_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA20_0==INSTRUCTION_FORMAT21t||(LA20_0 >= INSTRUCTION_FORMAT22c_FIELD && LA20_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA20_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA20_0 <= INSTRUCTION_FORMAT22t)||LA20_0==INSTRUCTION_FORMAT23x||(LA20_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA20_0 <= INSTRUCTION_FORMAT31t)||(LA20_0 >= INSTRUCTION_FORMAT35c_METHOD && LA20_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA20_0==INSTRUCTION_FORMAT51l||(LA20_0 >= NEGATIVE_INTEGER_LITERAL && LA20_0 <= NULL_LITERAL)||LA20_0==PARAM_LIST_OR_ID||(LA20_0 >= POSITIVE_INTEGER_LITERAL && LA20_0 <= PRIMITIVE_TYPE)||LA20_0==REGISTER||LA20_0==SIMPLE_NAME||(LA20_0 >= VERIFICATION_ERROR_TYPE && LA20_0 <= VOID_TYPE)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // smaliIdeaParser.g:381:5: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_annotation1393);
            	    annotation_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            match(input,END_ANNOTATION_DIRECTIVE,FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1396); if (state.failed) return ;

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
            // smaliIdeaParser.g:385:3: ( SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE )
            // smaliIdeaParser.g:385:5: SUBANNOTATION_DIRECTIVE CLASS_DESCRIPTOR ( annotation_element )* END_SUBANNOTATION_DIRECTIVE
            {
            match(input,SUBANNOTATION_DIRECTIVE,FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1412); if (state.failed) return ;

            match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_subannotation1414); if (state.failed) return ;

            // smaliIdeaParser.g:385:46: ( annotation_element )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ACCESS_SPEC||LA21_0==ANNOTATION_VISIBILITY||LA21_0==BOOL_LITERAL||LA21_0==DOUBLE_LITERAL_OR_ID||LA21_0==FLOAT_LITERAL_OR_ID||(LA21_0 >= INSTRUCTION_FORMAT10t && LA21_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA21_0==INSTRUCTION_FORMAT11x||LA21_0==INSTRUCTION_FORMAT12x_OR_ID||(LA21_0 >= INSTRUCTION_FORMAT21c_FIELD && LA21_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA21_0==INSTRUCTION_FORMAT21t||(LA21_0 >= INSTRUCTION_FORMAT22c_FIELD && LA21_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA21_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA21_0 <= INSTRUCTION_FORMAT22t)||LA21_0==INSTRUCTION_FORMAT23x||(LA21_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA21_0 <= INSTRUCTION_FORMAT31t)||(LA21_0 >= INSTRUCTION_FORMAT35c_METHOD && LA21_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA21_0==INSTRUCTION_FORMAT51l||(LA21_0 >= NEGATIVE_INTEGER_LITERAL && LA21_0 <= NULL_LITERAL)||LA21_0==PARAM_LIST_OR_ID||(LA21_0 >= POSITIVE_INTEGER_LITERAL && LA21_0 <= PRIMITIVE_TYPE)||LA21_0==REGISTER||LA21_0==SIMPLE_NAME||(LA21_0 >= VERIFICATION_ERROR_TYPE && LA21_0 <= VOID_TYPE)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // smaliIdeaParser.g:385:46: annotation_element
            	    {
            	    pushFollow(FOLLOW_annotation_element_in_subannotation1416);
            	    annotation_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            match(input,END_SUBANNOTATION_DIRECTIVE,FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1419); if (state.failed) return ;

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
            // smaliIdeaParser.g:388:3: ( ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor )
            // smaliIdeaParser.g:388:5: ENUM_DIRECTIVE reference_type_descriptor ARROW simple_name COLON reference_type_descriptor
            {
            match(input,ENUM_DIRECTIVE,FOLLOW_ENUM_DIRECTIVE_in_enum_literal1429); if (state.failed) return ;

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1431);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_enum_literal1433); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_enum_literal1435);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_enum_literal1437); if (state.failed) return ;

            pushFollow(FOLLOW_reference_type_descriptor_in_enum_literal1439);
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
            // smaliIdeaParser.g:391:3: ( reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |) | PRIMITIVE_TYPE | VOID_TYPE )
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
                    // smaliIdeaParser.g:391:5: reference_type_descriptor ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |)
                    {
                    pushFollow(FOLLOW_reference_type_descriptor_in_type_field_method_literal1449);
                    reference_type_descriptor();

                    state._fsp--;
                    if (state.failed) return ;

                    // smaliIdeaParser.g:392:5: ( ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype ) |)
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==ARROW) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==EOF||(LA23_0 >= ACCESS_SPEC && LA23_0 <= ARRAY_DATA_DIRECTIVE)||LA23_0==BOOL_LITERAL||(LA23_0 >= CATCH_DIRECTIVE && LA23_0 <= CATCHALL_DIRECTIVE)||(LA23_0 >= CLASS_DIRECTIVE && LA23_0 <= CLOSE_BRACE)||(LA23_0 >= COLON && LA23_0 <= COMMA)||(LA23_0 >= DOUBLE_LITERAL_OR_ID && LA23_0 <= END_ANNOTATION_DIRECTIVE)||(LA23_0 >= END_FIELD_DIRECTIVE && LA23_0 <= END_METHOD_DIRECTIVE)||LA23_0==END_SUBANNOTATION_DIRECTIVE||LA23_0==EPILOGUE_DIRECTIVE||LA23_0==FIELD_DIRECTIVE||LA23_0==FLOAT_LITERAL_OR_ID||LA23_0==IMPLEMENTS_DIRECTIVE||(LA23_0 >= INSTRUCTION_FORMAT10t && LA23_0 <= INSTRUCTION_FORMAT51l)||(LA23_0 >= LINE_DIRECTIVE && LA23_0 <= LOCALS_DIRECTIVE)||LA23_0==METHOD_DIRECTIVE||(LA23_0 >= NEGATIVE_INTEGER_LITERAL && LA23_0 <= NULL_LITERAL)||LA23_0==PACKED_SWITCH_DIRECTIVE||(LA23_0 >= PARAM_LIST_OR_ID && LA23_0 <= RESTART_LOCAL_DIRECTIVE)||(LA23_0 >= SIMPLE_NAME && LA23_0 <= SPARSE_SWITCH_DIRECTIVE)||(LA23_0 >= SUPER_DIRECTIVE && LA23_0 <= VOID_TYPE)) ) {
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
                            // smaliIdeaParser.g:392:7: ARROW ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
                            {
                            match(input,ARROW,FOLLOW_ARROW_in_type_field_method_literal1457); if (state.failed) return ;

                            // smaliIdeaParser.g:393:7: ( simple_name COLON nonvoid_type_descriptor | method_name method_prototype )
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==ACCESS_SPEC||LA22_0==ANNOTATION_VISIBILITY||LA22_0==BOOL_LITERAL||LA22_0==DOUBLE_LITERAL_OR_ID||LA22_0==FLOAT_LITERAL_OR_ID||(LA22_0 >= INSTRUCTION_FORMAT10t && LA22_0 <= INSTRUCTION_FORMAT10x_ODEX)||LA22_0==INSTRUCTION_FORMAT11x||LA22_0==INSTRUCTION_FORMAT12x_OR_ID||(LA22_0 >= INSTRUCTION_FORMAT21c_FIELD && LA22_0 <= INSTRUCTION_FORMAT21c_TYPE)||LA22_0==INSTRUCTION_FORMAT21t||(LA22_0 >= INSTRUCTION_FORMAT22c_FIELD && LA22_0 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA22_0 >= INSTRUCTION_FORMAT22s_OR_ID && LA22_0 <= INSTRUCTION_FORMAT22t)||LA22_0==INSTRUCTION_FORMAT23x||(LA22_0 >= INSTRUCTION_FORMAT31i_OR_ID && LA22_0 <= INSTRUCTION_FORMAT31t)||(LA22_0 >= INSTRUCTION_FORMAT35c_METHOD && LA22_0 <= INSTRUCTION_FORMAT35ms_METHOD)||LA22_0==INSTRUCTION_FORMAT51l||(LA22_0 >= NEGATIVE_INTEGER_LITERAL && LA22_0 <= NULL_LITERAL)||LA22_0==PARAM_LIST_OR_ID||(LA22_0 >= POSITIVE_INTEGER_LITERAL && LA22_0 <= PRIMITIVE_TYPE)||LA22_0==REGISTER||LA22_0==SIMPLE_NAME||(LA22_0 >= VERIFICATION_ERROR_TYPE && LA22_0 <= VOID_TYPE)) ) {
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
                                    // smaliIdeaParser.g:393:9: simple_name COLON nonvoid_type_descriptor
                                    {
                                    pushFollow(FOLLOW_simple_name_in_type_field_method_literal1467);
                                    simple_name();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    match(input,COLON,FOLLOW_COLON_in_type_field_method_literal1469); if (state.failed) return ;

                                    pushFollow(FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1471);
                                    nonvoid_type_descriptor();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;
                                case 2 :
                                    // smaliIdeaParser.g:394:9: method_name method_prototype
                                    {
                                    pushFollow(FOLLOW_method_name_in_type_field_method_literal1481);
                                    method_name();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    pushFollow(FOLLOW_method_prototype_in_type_field_method_literal1483);
                                    method_prototype();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // smaliIdeaParser.g:397:5: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:398:5: PRIMITIVE_TYPE
                    {
                    match(input,PRIMITIVE_TYPE,FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal1513); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:399:5: VOID_TYPE
                    {
                    match(input,VOID_TYPE,FOLLOW_VOID_TYPE_in_type_field_method_literal1519); if (state.failed) return ;

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
            // smaliIdeaParser.g:402:3: ( reference_type_descriptor ARROW method_name method_prototype )
            // smaliIdeaParser.g:402:5: reference_type_descriptor ARROW method_name method_prototype
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_method1529);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_method1531); if (state.failed) return ;

            pushFollow(FOLLOW_method_name_in_fully_qualified_method1533);
            method_name();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_method_prototype_in_fully_qualified_method1535);
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
            // smaliIdeaParser.g:405:3: ( reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor )
            // smaliIdeaParser.g:405:5: reference_type_descriptor ARROW simple_name COLON nonvoid_type_descriptor
            {
            pushFollow(FOLLOW_reference_type_descriptor_in_fully_qualified_field1545);
            reference_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,ARROW,FOLLOW_ARROW_in_fully_qualified_field1547); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_fully_qualified_field1549);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_fully_qualified_field1551); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1553);
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
            // smaliIdeaParser.g:408:3: ( COLON simple_name )
            // smaliIdeaParser.g:408:5: COLON simple_name
            {
            match(input,COLON,FOLLOW_COLON_in_label1563); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_label1565);
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
            // smaliIdeaParser.g:411:3: ( COLON simple_name | OFFSET | NEGATIVE_INTEGER_LITERAL )
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
                    // smaliIdeaParser.g:411:5: COLON simple_name
                    {
                    match(input,COLON,FOLLOW_COLON_in_label_ref_or_offset1575); if (state.failed) return ;

                    pushFollow(FOLLOW_simple_name_in_label_ref_or_offset1577);
                    simple_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:412:5: OFFSET
                    {
                    match(input,OFFSET,FOLLOW_OFFSET_in_label_ref_or_offset1583); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:413:5: NEGATIVE_INTEGER_LITERAL
                    {
                    match(input,NEGATIVE_INTEGER_LITERAL,FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1589); if (state.failed) return ;

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
            // smaliIdeaParser.g:416:3: ( ( REGISTER ( COMMA REGISTER )* )? )
            // smaliIdeaParser.g:416:5: ( REGISTER ( COMMA REGISTER )* )?
            {
            // smaliIdeaParser.g:416:5: ( REGISTER ( COMMA REGISTER )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==REGISTER) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // smaliIdeaParser.g:416:6: REGISTER ( COMMA REGISTER )*
                    {
                    match(input,REGISTER,FOLLOW_REGISTER_in_register_list1600); if (state.failed) return ;

                    // smaliIdeaParser.g:416:15: ( COMMA REGISTER )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==COMMA) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // smaliIdeaParser.g:416:16: COMMA REGISTER
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_register_list1603); if (state.failed) return ;

                    	    match(input,REGISTER,FOLLOW_REGISTER_in_register_list1605); if (state.failed) return ;

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
            // smaliIdeaParser.g:419:3: ( ( REGISTER ( DOTDOT REGISTER )? )? )
            // smaliIdeaParser.g:419:5: ( REGISTER ( DOTDOT REGISTER )? )?
            {
            // smaliIdeaParser.g:419:5: ( REGISTER ( DOTDOT REGISTER )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==REGISTER) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // smaliIdeaParser.g:419:6: REGISTER ( DOTDOT REGISTER )?
                    {
                    match(input,REGISTER,FOLLOW_REGISTER_in_register_range1620); if (state.failed) return ;

                    // smaliIdeaParser.g:419:15: ( DOTDOT REGISTER )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==DOTDOT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // smaliIdeaParser.g:419:16: DOTDOT REGISTER
                            {
                            match(input,DOTDOT,FOLLOW_DOTDOT_in_register_range1623); if (state.failed) return ;

                            match(input,REGISTER,FOLLOW_REGISTER_in_register_range1625); if (state.failed) return ;

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
            // smaliIdeaParser.g:422:3: ( CLASS_DESCRIPTOR | fully_qualified_field | fully_qualified_method )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==CLASS_DESCRIPTOR) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==ANNOTATION_DIRECTIVE||LA30_1==ARRAY_DATA_DIRECTIVE||(LA30_1 >= CATCH_DIRECTIVE && LA30_1 <= CATCHALL_DIRECTIVE)||LA30_1==COLON||(LA30_1 >= END_LOCAL_DIRECTIVE && LA30_1 <= END_METHOD_DIRECTIVE)||LA30_1==EPILOGUE_DIRECTIVE||(LA30_1 >= INSTRUCTION_FORMAT10t && LA30_1 <= INSTRUCTION_FORMAT51l)||(LA30_1 >= LINE_DIRECTIVE && LA30_1 <= LOCALS_DIRECTIVE)||LA30_1==PACKED_SWITCH_DIRECTIVE||LA30_1==PARAMETER_DIRECTIVE||LA30_1==PROLOGUE_DIRECTIVE||(LA30_1 >= REGISTERS_DIRECTIVE && LA30_1 <= RESTART_LOCAL_DIRECTIVE)||(LA30_1 >= SOURCE_DIRECTIVE && LA30_1 <= SPARSE_SWITCH_DIRECTIVE)) ) {
                    alt30=1;
                }
                else if ( (LA30_1==ARROW) ) {
                    int LA30_4 = input.LA(3);

                    if ( (LA30_4==ACCESS_SPEC||LA30_4==ANNOTATION_VISIBILITY||LA30_4==BOOL_LITERAL||LA30_4==DOUBLE_LITERAL_OR_ID||LA30_4==FLOAT_LITERAL_OR_ID||(LA30_4 >= INSTRUCTION_FORMAT10t && LA30_4 <= INSTRUCTION_FORMAT10x_ODEX)||LA30_4==INSTRUCTION_FORMAT11x||LA30_4==INSTRUCTION_FORMAT12x_OR_ID||(LA30_4 >= INSTRUCTION_FORMAT21c_FIELD && LA30_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA30_4==INSTRUCTION_FORMAT21t||(LA30_4 >= INSTRUCTION_FORMAT22c_FIELD && LA30_4 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA30_4 >= INSTRUCTION_FORMAT22s_OR_ID && LA30_4 <= INSTRUCTION_FORMAT22t)||LA30_4==INSTRUCTION_FORMAT23x||(LA30_4 >= INSTRUCTION_FORMAT31i_OR_ID && LA30_4 <= INSTRUCTION_FORMAT31t)||(LA30_4 >= INSTRUCTION_FORMAT35c_METHOD && LA30_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA30_4==INSTRUCTION_FORMAT51l||(LA30_4 >= NEGATIVE_INTEGER_LITERAL && LA30_4 <= NULL_LITERAL)||LA30_4==PARAM_LIST_OR_ID||(LA30_4 >= POSITIVE_INTEGER_LITERAL && LA30_4 <= PRIMITIVE_TYPE)||LA30_4==REGISTER||LA30_4==SIMPLE_NAME||(LA30_4 >= VERIFICATION_ERROR_TYPE && LA30_4 <= VOID_TYPE)) ) {
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

                    if ( (LA30_4==ACCESS_SPEC||LA30_4==ANNOTATION_VISIBILITY||LA30_4==BOOL_LITERAL||LA30_4==DOUBLE_LITERAL_OR_ID||LA30_4==FLOAT_LITERAL_OR_ID||(LA30_4 >= INSTRUCTION_FORMAT10t && LA30_4 <= INSTRUCTION_FORMAT10x_ODEX)||LA30_4==INSTRUCTION_FORMAT11x||LA30_4==INSTRUCTION_FORMAT12x_OR_ID||(LA30_4 >= INSTRUCTION_FORMAT21c_FIELD && LA30_4 <= INSTRUCTION_FORMAT21c_TYPE)||LA30_4==INSTRUCTION_FORMAT21t||(LA30_4 >= INSTRUCTION_FORMAT22c_FIELD && LA30_4 <= INSTRUCTION_FORMAT22cs_FIELD)||(LA30_4 >= INSTRUCTION_FORMAT22s_OR_ID && LA30_4 <= INSTRUCTION_FORMAT22t)||LA30_4==INSTRUCTION_FORMAT23x||(LA30_4 >= INSTRUCTION_FORMAT31i_OR_ID && LA30_4 <= INSTRUCTION_FORMAT31t)||(LA30_4 >= INSTRUCTION_FORMAT35c_METHOD && LA30_4 <= INSTRUCTION_FORMAT35ms_METHOD)||LA30_4==INSTRUCTION_FORMAT51l||(LA30_4 >= NEGATIVE_INTEGER_LITERAL && LA30_4 <= NULL_LITERAL)||LA30_4==PARAM_LIST_OR_ID||(LA30_4 >= POSITIVE_INTEGER_LITERAL && LA30_4 <= PRIMITIVE_TYPE)||LA30_4==REGISTER||LA30_4==SIMPLE_NAME||(LA30_4 >= VERIFICATION_ERROR_TYPE && LA30_4 <= VOID_TYPE)) ) {
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
                    // smaliIdeaParser.g:422:5: CLASS_DESCRIPTOR
                    {
                    match(input,CLASS_DESCRIPTOR,FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference1639); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:422:24: fully_qualified_field
                    {
                    pushFollow(FOLLOW_fully_qualified_field_in_verification_error_reference1643);
                    fully_qualified_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:422:48: fully_qualified_method
                    {
                    pushFollow(FOLLOW_fully_qualified_method_in_verification_error_reference1647);
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
            // smaliIdeaParser.g:425:3: ( CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
            // smaliIdeaParser.g:425:5: CATCH_DIRECTIVE nonvoid_type_descriptor OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
            {
            match(input,CATCH_DIRECTIVE,FOLLOW_CATCH_DIRECTIVE_in_catch_directive1657); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_catch_directive1659);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catch_directive1661); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1663);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_catch_directive1665); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1667);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catch_directive1669); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catch_directive1671);
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
            // smaliIdeaParser.g:428:3: ( CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset )
            // smaliIdeaParser.g:428:5: CATCHALL_DIRECTIVE OPEN_BRACE label_ref_or_offset DOTDOT label_ref_or_offset CLOSE_BRACE label_ref_or_offset
            {
            match(input,CATCHALL_DIRECTIVE,FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1681); if (state.failed) return ;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_catchall_directive1683); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1685);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_catchall_directive1687); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1689);
            label_ref_or_offset();

            state._fsp--;
            if (state.failed) return ;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_catchall_directive1691); if (state.failed) return ;

            pushFollow(FOLLOW_label_ref_or_offset_in_catchall_directive1693);
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
            // smaliIdeaParser.g:435:3: ( PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |) )
            // smaliIdeaParser.g:435:5: PARAMETER_DIRECTIVE ( STRING_LITERAL )? ({...}? annotation )* ( END_PARAMETER_DIRECTIVE |)
            {
            match(input,PARAMETER_DIRECTIVE,FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1705); if (state.failed) return ;

            // smaliIdeaParser.g:435:25: ( STRING_LITERAL )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==STRING_LITERAL) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // smaliIdeaParser.g:435:25: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_parameter_directive1707); if (state.failed) return ;

                    }
                    break;

            }


            // smaliIdeaParser.g:436:5: ({...}? annotation )*
            loop32:
            do {
                int alt32=2;
                alt32 = dfa32.predict(input);
                switch (alt32) {
            	case 1 :
            	    // smaliIdeaParser.g:436:6: {...}? annotation
            	    {
            	    if ( !((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "parameter_directive", "input.LA(1) == ANNOTATION_DIRECTIVE");
            	    }

            	    pushFollow(FOLLOW_annotation_in_parameter_directive1717);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            // smaliIdeaParser.g:437:5: ( END_PARAMETER_DIRECTIVE |)
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==END_PARAMETER_DIRECTIVE) ) {
                alt33=1;
            }
            else if ( (LA33_0==EOF||LA33_0==ANNOTATION_DIRECTIVE||LA33_0==ARRAY_DATA_DIRECTIVE||(LA33_0 >= CATCH_DIRECTIVE && LA33_0 <= CATCHALL_DIRECTIVE)||LA33_0==CLASS_DIRECTIVE||LA33_0==COLON||(LA33_0 >= END_LOCAL_DIRECTIVE && LA33_0 <= END_METHOD_DIRECTIVE)||LA33_0==EPILOGUE_DIRECTIVE||LA33_0==FIELD_DIRECTIVE||LA33_0==IMPLEMENTS_DIRECTIVE||(LA33_0 >= INSTRUCTION_FORMAT10t && LA33_0 <= INSTRUCTION_FORMAT51l)||(LA33_0 >= LINE_DIRECTIVE && LA33_0 <= LOCALS_DIRECTIVE)||LA33_0==METHOD_DIRECTIVE||LA33_0==PACKED_SWITCH_DIRECTIVE||LA33_0==PARAMETER_DIRECTIVE||LA33_0==PROLOGUE_DIRECTIVE||(LA33_0 >= REGISTERS_DIRECTIVE && LA33_0 <= RESTART_LOCAL_DIRECTIVE)||(LA33_0 >= SOURCE_DIRECTIVE && LA33_0 <= SPARSE_SWITCH_DIRECTIVE)||LA33_0==SUPER_DIRECTIVE) ) {
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
                    // smaliIdeaParser.g:437:7: END_PARAMETER_DIRECTIVE
                    {
                    match(input,END_PARAMETER_DIRECTIVE,FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1727); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:439:5: 
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
            // smaliIdeaParser.g:442:3: ( line_directive | local_directive | end_local_directive | restart_local_directive | prologue_directive | epilogue_directive | source_directive )
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
                    // smaliIdeaParser.g:442:5: line_directive
                    {
                    pushFollow(FOLLOW_line_directive_in_ordered_debug_directive1751);
                    line_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:443:5: local_directive
                    {
                    pushFollow(FOLLOW_local_directive_in_ordered_debug_directive1757);
                    local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:444:5: end_local_directive
                    {
                    pushFollow(FOLLOW_end_local_directive_in_ordered_debug_directive1763);
                    end_local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:445:5: restart_local_directive
                    {
                    pushFollow(FOLLOW_restart_local_directive_in_ordered_debug_directive1769);
                    restart_local_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:446:5: prologue_directive
                    {
                    pushFollow(FOLLOW_prologue_directive_in_ordered_debug_directive1775);
                    prologue_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:447:5: epilogue_directive
                    {
                    pushFollow(FOLLOW_epilogue_directive_in_ordered_debug_directive1781);
                    epilogue_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:448:5: source_directive
                    {
                    pushFollow(FOLLOW_source_directive_in_ordered_debug_directive1787);
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
            // smaliIdeaParser.g:451:3: ( LINE_DIRECTIVE integral_literal )
            // smaliIdeaParser.g:451:5: LINE_DIRECTIVE integral_literal
            {
            match(input,LINE_DIRECTIVE,FOLLOW_LINE_DIRECTIVE_in_line_directive1797); if (state.failed) return ;

            pushFollow(FOLLOW_integral_literal_in_line_directive1799);
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
            // smaliIdeaParser.g:454:3: ( LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )? )
            // smaliIdeaParser.g:454:5: LOCAL_DIRECTIVE REGISTER COMMA simple_name COLON nonvoid_type_descriptor ( COMMA STRING_LITERAL )?
            {
            match(input,LOCAL_DIRECTIVE,FOLLOW_LOCAL_DIRECTIVE_in_local_directive1809); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_local_directive1811); if (state.failed) return ;

            match(input,COMMA,FOLLOW_COMMA_in_local_directive1813); if (state.failed) return ;

            pushFollow(FOLLOW_simple_name_in_local_directive1815);
            simple_name();

            state._fsp--;
            if (state.failed) return ;

            match(input,COLON,FOLLOW_COLON_in_local_directive1817); if (state.failed) return ;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_local_directive1819);
            nonvoid_type_descriptor();

            state._fsp--;
            if (state.failed) return ;

            // smaliIdeaParser.g:454:78: ( COMMA STRING_LITERAL )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==COMMA) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // smaliIdeaParser.g:454:79: COMMA STRING_LITERAL
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_local_directive1822); if (state.failed) return ;

                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_local_directive1824); if (state.failed) return ;

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
            // smaliIdeaParser.g:457:3: ( END_LOCAL_DIRECTIVE REGISTER )
            // smaliIdeaParser.g:457:5: END_LOCAL_DIRECTIVE REGISTER
            {
            match(input,END_LOCAL_DIRECTIVE,FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1836); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_end_local_directive1838); if (state.failed) return ;

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
            // smaliIdeaParser.g:460:3: ( RESTART_LOCAL_DIRECTIVE REGISTER )
            // smaliIdeaParser.g:460:5: RESTART_LOCAL_DIRECTIVE REGISTER
            {
            match(input,RESTART_LOCAL_DIRECTIVE,FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1848); if (state.failed) return ;

            match(input,REGISTER,FOLLOW_REGISTER_in_restart_local_directive1850); if (state.failed) return ;

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
            // smaliIdeaParser.g:463:3: ( PROLOGUE_DIRECTIVE )
            // smaliIdeaParser.g:463:5: PROLOGUE_DIRECTIVE
            {
            match(input,PROLOGUE_DIRECTIVE,FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1860); if (state.failed) return ;

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
            // smaliIdeaParser.g:466:3: ( EPILOGUE_DIRECTIVE )
            // smaliIdeaParser.g:466:5: EPILOGUE_DIRECTIVE
            {
            match(input,EPILOGUE_DIRECTIVE,FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1870); if (state.failed) return ;

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
            // smaliIdeaParser.g:469:3: ( SOURCE_DIRECTIVE STRING_LITERAL )
            // smaliIdeaParser.g:469:5: SOURCE_DIRECTIVE STRING_LITERAL
            {
            match(input,SOURCE_DIRECTIVE,FOLLOW_SOURCE_DIRECTIVE_in_source_directive1880); if (state.failed) return ;

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_source_directive1882); if (state.failed) return ;

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
            // smaliIdeaParser.g:472:3: ( INSTRUCTION_FORMAT12x | INSTRUCTION_FORMAT12x_OR_ID )
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
            // smaliIdeaParser.g:476:3: ( INSTRUCTION_FORMAT22s | INSTRUCTION_FORMAT22s_OR_ID )
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
            // smaliIdeaParser.g:480:3: ( INSTRUCTION_FORMAT31i | INSTRUCTION_FORMAT31i_OR_ID )
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
    // smaliIdeaParser.g:483:1: instruction : ( insn_format10t | insn_format10x | insn_format10x_odex | insn_format11n | insn_format11x | insn_format12x | insn_format20bc | insn_format20t | insn_format21c_field | insn_format21c_field_odex | insn_format21c_string | insn_format21c_type | insn_format21h | insn_format21s | insn_format21t | insn_format22b | insn_format22c_field | insn_format22c_field_odex | insn_format22c_type | insn_format22cs_field | insn_format22s | insn_format22t | insn_format22x | insn_format23x | insn_format30t | insn_format31c | insn_format31i | insn_format31t | insn_format32x | insn_format35c_method | insn_format35c_type | insn_format35c_method_odex | insn_format35mi_method | insn_format35ms_method | insn_format3rc_method | insn_format3rc_method_odex | insn_format3rc_type | insn_format3rmi_method | insn_format3rms_method | insn_format51l | insn_array_data_directive | insn_packed_switch_directive | insn_sparse_switch_directive );
    public final void instruction() throws RecognitionException {
         Marker marker = mark(); 
        try {
            // smaliIdeaParser.g:485:3: ( insn_format10t | insn_format10x | insn_format10x_odex | insn_format11n | insn_format11x | insn_format12x | insn_format20bc | insn_format20t | insn_format21c_field | insn_format21c_field_odex | insn_format21c_string | insn_format21c_type | insn_format21h | insn_format21s | insn_format21t | insn_format22b | insn_format22c_field | insn_format22c_field_odex | insn_format22c_type | insn_format22cs_field | insn_format22s | insn_format22t | insn_format22x | insn_format23x | insn_format30t | insn_format31c | insn_format31i | insn_format31t | insn_format32x | insn_format35c_method | insn_format35c_type | insn_format35c_method_odex | insn_format35mi_method | insn_format35ms_method | insn_format3rc_method | insn_format3rc_method_odex | insn_format3rc_type | insn_format3rmi_method | insn_format3rms_method | insn_format51l | insn_array_data_directive | insn_packed_switch_directive | insn_sparse_switch_directive )
            int alt36=43;
            switch ( input.LA(1) ) {
            case INSTRUCTION_FORMAT10t:
                {
                alt36=1;
                }
                break;
            case INSTRUCTION_FORMAT10x:
                {
                alt36=2;
                }
                break;
            case INSTRUCTION_FORMAT10x_ODEX:
                {
                alt36=3;
                }
                break;
            case INSTRUCTION_FORMAT11n:
                {
                alt36=4;
                }
                break;
            case INSTRUCTION_FORMAT11x:
                {
                alt36=5;
                }
                break;
            case INSTRUCTION_FORMAT12x:
            case INSTRUCTION_FORMAT12x_OR_ID:
                {
                alt36=6;
                }
                break;
            case INSTRUCTION_FORMAT20bc:
                {
                alt36=7;
                }
                break;
            case INSTRUCTION_FORMAT20t:
                {
                alt36=8;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD:
                {
                alt36=9;
                }
                break;
            case INSTRUCTION_FORMAT21c_FIELD_ODEX:
                {
                alt36=10;
                }
                break;
            case INSTRUCTION_FORMAT21c_STRING:
                {
                alt36=11;
                }
                break;
            case INSTRUCTION_FORMAT21c_TYPE:
                {
                alt36=12;
                }
                break;
            case INSTRUCTION_FORMAT21h:
                {
                alt36=13;
                }
                break;
            case INSTRUCTION_FORMAT21s:
                {
                alt36=14;
                }
                break;
            case INSTRUCTION_FORMAT21t:
                {
                alt36=15;
                }
                break;
            case INSTRUCTION_FORMAT22b:
                {
                alt36=16;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD:
                {
                alt36=17;
                }
                break;
            case INSTRUCTION_FORMAT22c_FIELD_ODEX:
                {
                alt36=18;
                }
                break;
            case INSTRUCTION_FORMAT22c_TYPE:
                {
                alt36=19;
                }
                break;
            case INSTRUCTION_FORMAT22cs_FIELD:
                {
                alt36=20;
                }
                break;
            case INSTRUCTION_FORMAT22s:
            case INSTRUCTION_FORMAT22s_OR_ID:
                {
                alt36=21;
                }
                break;
            case INSTRUCTION_FORMAT22t:
                {
                alt36=22;
                }
                break;
            case INSTRUCTION_FORMAT22x:
                {
                alt36=23;
                }
                break;
            case INSTRUCTION_FORMAT23x:
                {
                alt36=24;
                }
                break;
            case INSTRUCTION_FORMAT30t:
                {
                alt36=25;
                }
                break;
            case INSTRUCTION_FORMAT31c:
                {
                alt36=26;
                }
                break;
            case INSTRUCTION_FORMAT31i:
            case INSTRUCTION_FORMAT31i_OR_ID:
                {
                alt36=27;
                }
                break;
            case INSTRUCTION_FORMAT31t:
                {
                alt36=28;
                }
                break;
            case INSTRUCTION_FORMAT32x:
                {
                alt36=29;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD:
                {
                alt36=30;
                }
                break;
            case INSTRUCTION_FORMAT35c_TYPE:
                {
                alt36=31;
                }
                break;
            case INSTRUCTION_FORMAT35c_METHOD_ODEX:
                {
                alt36=32;
                }
                break;
            case INSTRUCTION_FORMAT35mi_METHOD:
                {
                alt36=33;
                }
                break;
            case INSTRUCTION_FORMAT35ms_METHOD:
                {
                alt36=34;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD:
                {
                alt36=35;
                }
                break;
            case INSTRUCTION_FORMAT3rc_METHOD_ODEX:
                {
                alt36=36;
                }
                break;
            case INSTRUCTION_FORMAT3rc_TYPE:
                {
                alt36=37;
                }
                break;
            case INSTRUCTION_FORMAT3rmi_METHOD:
                {
                alt36=38;
                }
                break;
            case INSTRUCTION_FORMAT3rms_METHOD:
                {
                alt36=39;
                }
                break;
            case INSTRUCTION_FORMAT51l:
                {
                alt36=40;
                }
                break;
            case ARRAY_DATA_DIRECTIVE:
                {
                alt36=41;
                }
                break;
            case PACKED_SWITCH_DIRECTIVE:
                {
                alt36=42;
                }
                break;
            case SPARSE_SWITCH_DIRECTIVE:
                {
                alt36=43;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // smaliIdeaParser.g:485:5: insn_format10t
                    {
                    pushFollow(FOLLOW_insn_format10t_in_instruction1947);
                    insn_format10t();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // smaliIdeaParser.g:486:5: insn_format10x
                    {
                    pushFollow(FOLLOW_insn_format10x_in_instruction1953);
                    insn_format10x();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // smaliIdeaParser.g:487:5: insn_format10x_odex
                    {
                    pushFollow(FOLLOW_insn_format10x_odex_in_instruction1959);
                    insn_format10x_odex();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // smaliIdeaParser.g:488:5: insn_format11n
                    {
                    pushFollow(FOLLOW_insn_format11n_in_instruction1965);
                    insn_format11n();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // smaliIdeaParser.g:489:5: insn_format11x
                    {
                    pushFollow(FOLLOW_insn_format11x_in_instruction1971);
                    insn_format11x();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // smaliIdeaParser.g:490:5: insn_format12x
                    {
                    pushFollow(FOLLOW_insn_format12x_in_instruction1977);
                    insn_format12x();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // smaliIdeaParser.g:491:5: insn_format20bc
                    {
                    pushFollow(FOLLOW_insn_format20bc_in_instruction1983);
                    insn_format20bc();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // smaliIdeaParser.g:492:5: insn_format20t
                    {
                    pushFollow(FOLLOW_insn_format20t_in_instruction1989);
                    insn_format20t();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // smaliIdeaParser.g:493:5: insn_format21c_field
                    {
                    pushFollow(FOLLOW_insn_format21c_field_in_instruction1995);
                    insn_format21c_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // smaliIdeaParser.g:494:5: insn_format21c_field_odex
                    {
                    pushFollow(FOLLOW_insn_format21c_field_odex_in_instruction2001);
                    insn_format21c_field_odex();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // smaliIdeaParser.g:495:5: insn_format21c_string
                    {
                    pushFollow(FOLLOW_insn_format21c_string_in_instruction2007);
                    insn_format21c_string();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // smaliIdeaParser.g:496:5: insn_format21c_type
                    {
                    pushFollow(FOLLOW_insn_format21c_type_in_instruction2013);
                    insn_format21c_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // smaliIdeaParser.g:497:5: insn_format21h
                    {
                    pushFollow(FOLLOW_insn_format21h_in_instruction2019);
                    insn_format21h();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // smaliIdeaParser.g:498:5: insn_format21s
                    {
                    pushFollow(FOLLOW_insn_format21s_in_instruction2025);
                    insn_format21s();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // smaliIdeaParser.g:499:5: insn_format21t
                    {
                    pushFollow(FOLLOW_insn_format21t_in_instruction2031);
                    insn_format21t();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // smaliIdeaParser.g:500:5: insn_format22b
                    {
                    pushFollow(FOLLOW_insn_format22b_in_instruction2037);
                    insn_format22b();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // smaliIdeaParser.g:501:5: insn_format22c_field
                    {
                    pushFollow(FOLLOW_insn_format22c_field_in_instruction2043);
                    insn_format22c_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // smaliIdeaParser.g:502:5: insn_format22c_field_odex
                    {
                    pushFollow(FOLLOW_insn_format22c_field_odex_in_instruction2049);
                    insn_format22c_field_odex();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 19 :
                    // smaliIdeaParser.g:503:5: insn_format22c_type
                    {
                    pushFollow(FOLLOW_insn_format22c_type_in_instruction2055);
                    insn_format22c_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 20 :
                    // smaliIdeaParser.g:504:5: insn_format22cs_field
                    {
                    pushFollow(FOLLOW_insn_format22cs_field_in_instruction2061);
                    insn_format22cs_field();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 21 :
                    // smaliIdeaParser.g:505:5: insn_format22s
                    {
                    pushFollow(FOLLOW_insn_format22s_in_instruction2067);
                    insn_format22s();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 22 :
                    // smaliIdeaParser.g:506:5: insn_format22t
                    {
                    pushFollow(FOLLOW_insn_format22t_in_instruction2073);
                    insn_format22t();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 23 :
                    // smaliIdeaParser.g:507:5: insn_format22x
                    {
                    pushFollow(FOLLOW_insn_format22x_in_instruction2079);
                    insn_format22x();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 24 :
                    // smaliIdeaParser.g:508:5: insn_format23x
                    {
                    pushFollow(FOLLOW_insn_format23x_in_instruction2085);
                    insn_format23x();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 25 :
                    // smaliIdeaParser.g:509:5: insn_format30t
                    {
                    pushFollow(FOLLOW_insn_format30t_in_instruction2091);
                    insn_format30t();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 26 :
                    // smaliIdeaParser.g:510:5: insn_format31c
                    {
                    pushFollow(FOLLOW_insn_format31c_in_instruction2097);
                    insn_format31c();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 27 :
                    // smaliIdeaParser.g:511:5: insn_format31i
                    {
                    pushFollow(FOLLOW_insn_format31i_in_instruction2103);
                    insn_format31i();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 28 :
                    // smaliIdeaParser.g:512:5: insn_format31t
                    {
                    pushFollow(FOLLOW_insn_format31t_in_instruction2109);
                    insn_format31t();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 29 :
                    // smaliIdeaParser.g:513:5: insn_format32x
                    {
                    pushFollow(FOLLOW_insn_format32x_in_instruction2115);
                    insn_format32x();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 30 :
                    // smaliIdeaParser.g:514:5: insn_format35c_method
                    {
                    pushFollow(FOLLOW_insn_format35c_method_in_instruction2121);
                    insn_format35c_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 31 :
                    // smaliIdeaParser.g:515:5: insn_format35c_type
                    {
                    pushFollow(FOLLOW_insn_format35c_type_in_instruction2127);
                    insn_format35c_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 32 :
                    // smaliIdeaParser.g:516:5: insn_format35c_method_odex
                    {
                    pushFollow(FOLLOW_insn_format35c_method_odex_in_instruction2133);
                    insn_format35c_method_odex();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 33 :
                    // smaliIdeaParser.g:517:5: insn_format35mi_method
                    {
                    pushFollow(FOLLOW_insn_format35mi_method_in_instruction2139);
                    insn_format35mi_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 34 :
                    // smaliIdeaParser.g:518:5: insn_format35ms_method
                    {
                    pushFollow(FOLLOW_insn_format35ms_method_in_instruction2145);
                    insn_format35ms_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 35 :
                    // smaliIdeaParser.g:519:5: insn_format3rc_method
                    {
                    pushFollow(FOLLOW_insn_format3rc_method_in_instruction2151);
                    insn_format3rc_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 36 :
                    // smaliIdeaParser.g:520:5: insn_format3rc_method_odex
                    {
                    pushFollow(FOLLOW_insn_format3rc_method_odex_in_instruction2157);
                    insn_format3rc_method_odex();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 37 :
                    // smaliIdeaParser.g:521:5: insn_format3rc_type
                    {
                    pushFollow(FOLLOW_insn_format3rc_type_in_instruction2163);
                    insn_format3rc_type();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 38 :
                    // smaliIdeaParser.g:522:5: insn_format3rmi_method
                    {
                    pushFollow(FOLLOW_insn_format3rmi_method_in_instruction2169);
                    insn_format3rmi_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 39 :
                    // smaliIdeaParser.g:523:5: insn_format3rms_method
                    {
                    pushFollow(FOLLOW_insn_format3rms_method_in_instruction2175);
                    insn_format3rms_method();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 40 :
                    // smaliIdeaParser.g:524:5: insn_format51l
                    {
                    pushFollow(FOLLOW_insn_format51l_in_instruction2181);
                    insn_format51l();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 41 :
                    // smaliIdeaParser.g:525:5: insn_array_data_directive
                    {
                    pushFollow(FOLLOW_insn_array_data_directive_in_instruction2187);
                    insn_array_data_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 42 :
                    // smaliIdeaParser.g:526:5: insn_packed_switch_directive
                    {
                    pushFollow(FOLLOW_insn_packed_switch_directive_in_instruction2193);
                    insn_packed_switch_directive();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 43 :
                    // smaliIdeaParser.g:527:5: insn_sparse_switch_directive
                    {
                    pushFollow(FOLLOW_insn_sparse_switch_directive_in_instruction2199);
                    insn_sparse_switch_directive();

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
             marker.done(ElementTypes.INSTRUCTION); 
        }
        return ;
    }
    // $ANTLR end "instruction"



    // $ANTLR start "insn_format10t"
    // smaliIdeaParser.g:530:1: insn_format10t returns [int size] : INSTRUCTION_FORMAT10t label_ref_or_offset ;
    public final int insn_format10t() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:531:3: ( INSTRUCTION_FORMAT10t label_ref_or_offset )
            // smaliIdeaParser.g:533:5: INSTRUCTION_FORMAT10t label_ref_or_offset
            {
            match(input,INSTRUCTION_FORMAT10t,FOLLOW_INSTRUCTION_FORMAT10t_in_insn_format10t2229); if (state.failed) return size;

            pushFollow(FOLLOW_label_ref_or_offset_in_insn_format10t2231);
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
    // smaliIdeaParser.g:535:1: insn_format10x returns [int size] : INSTRUCTION_FORMAT10x ;
    public final int insn_format10x() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:536:3: ( INSTRUCTION_FORMAT10x )
            // smaliIdeaParser.g:537:5: INSTRUCTION_FORMAT10x
            {
            match(input,INSTRUCTION_FORMAT10x,FOLLOW_INSTRUCTION_FORMAT10x_in_insn_format10x2250); if (state.failed) return size;

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
    // smaliIdeaParser.g:539:1: insn_format10x_odex returns [int size] : INSTRUCTION_FORMAT10x_ODEX ;
    public final int insn_format10x_odex() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:540:3: ( INSTRUCTION_FORMAT10x_ODEX )
            // smaliIdeaParser.g:541:5: INSTRUCTION_FORMAT10x_ODEX
            {
            match(input,INSTRUCTION_FORMAT10x_ODEX,FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_insn_format10x_odex2269); if (state.failed) return size;

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
    // smaliIdeaParser.g:543:1: insn_format11n returns [int size] : INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal ;
    public final int insn_format11n() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:544:3: ( INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal )
            // smaliIdeaParser.g:545:5: INSTRUCTION_FORMAT11n REGISTER COMMA integral_literal
            {
            match(input,INSTRUCTION_FORMAT11n,FOLLOW_INSTRUCTION_FORMAT11n_in_insn_format11n2288); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format11n2290); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format11n2292); if (state.failed) return size;

            pushFollow(FOLLOW_integral_literal_in_insn_format11n2294);
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
    // smaliIdeaParser.g:547:1: insn_format11x returns [int size] : INSTRUCTION_FORMAT11x REGISTER ;
    public final int insn_format11x() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:548:3: ( INSTRUCTION_FORMAT11x REGISTER )
            // smaliIdeaParser.g:549:5: INSTRUCTION_FORMAT11x REGISTER
            {
            match(input,INSTRUCTION_FORMAT11x,FOLLOW_INSTRUCTION_FORMAT11x_in_insn_format11x2313); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format11x2315); if (state.failed) return size;

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
    // smaliIdeaParser.g:551:1: insn_format12x returns [int size] : instruction_format12x REGISTER COMMA REGISTER ;
    public final int insn_format12x() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:552:3: ( instruction_format12x REGISTER COMMA REGISTER )
            // smaliIdeaParser.g:553:5: instruction_format12x REGISTER COMMA REGISTER
            {
            pushFollow(FOLLOW_instruction_format12x_in_insn_format12x2334);
            instruction_format12x();

            state._fsp--;
            if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format12x2336); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format12x2338); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format12x2340); if (state.failed) return size;

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
    // smaliIdeaParser.g:555:1: insn_format20bc returns [int size] : INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference ;
    public final int insn_format20bc() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:556:3: ( INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference )
            // smaliIdeaParser.g:557:5: INSTRUCTION_FORMAT20bc VERIFICATION_ERROR_TYPE COMMA verification_error_reference
            {
            match(input,INSTRUCTION_FORMAT20bc,FOLLOW_INSTRUCTION_FORMAT20bc_in_insn_format20bc2359); if (state.failed) return size;

            match(input,VERIFICATION_ERROR_TYPE,FOLLOW_VERIFICATION_ERROR_TYPE_in_insn_format20bc2361); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format20bc2363); if (state.failed) return size;

            pushFollow(FOLLOW_verification_error_reference_in_insn_format20bc2365);
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
    // smaliIdeaParser.g:559:1: insn_format20t returns [int size] : INSTRUCTION_FORMAT20t label_ref_or_offset ;
    public final int insn_format20t() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:560:3: ( INSTRUCTION_FORMAT20t label_ref_or_offset )
            // smaliIdeaParser.g:561:5: INSTRUCTION_FORMAT20t label_ref_or_offset
            {
            match(input,INSTRUCTION_FORMAT20t,FOLLOW_INSTRUCTION_FORMAT20t_in_insn_format20t2384); if (state.failed) return size;

            pushFollow(FOLLOW_label_ref_or_offset_in_insn_format20t2386);
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
    // smaliIdeaParser.g:563:1: insn_format21c_field returns [int size] : INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field ;
    public final int insn_format21c_field() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:564:3: ( INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field )
            // smaliIdeaParser.g:565:5: INSTRUCTION_FORMAT21c_FIELD REGISTER COMMA fully_qualified_field
            {
            match(input,INSTRUCTION_FORMAT21c_FIELD,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_insn_format21c_field2405); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_field2407); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_field2409); if (state.failed) return size;

            pushFollow(FOLLOW_fully_qualified_field_in_insn_format21c_field2411);
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
    // smaliIdeaParser.g:567:1: insn_format21c_field_odex returns [int size] : INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field ;
    public final int insn_format21c_field_odex() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:568:3: ( INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field )
            // smaliIdeaParser.g:569:5: INSTRUCTION_FORMAT21c_FIELD_ODEX REGISTER COMMA fully_qualified_field
            {
            match(input,INSTRUCTION_FORMAT21c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_insn_format21c_field_odex2430); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_field_odex2432); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_field_odex2434); if (state.failed) return size;

            pushFollow(FOLLOW_fully_qualified_field_in_insn_format21c_field_odex2436);
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
    // smaliIdeaParser.g:571:1: insn_format21c_string returns [int size] : INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL ;
    public final int insn_format21c_string() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:572:3: ( INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL )
            // smaliIdeaParser.g:573:5: INSTRUCTION_FORMAT21c_STRING REGISTER COMMA STRING_LITERAL
            {
            match(input,INSTRUCTION_FORMAT21c_STRING,FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_insn_format21c_string2455); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_string2457); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_string2459); if (state.failed) return size;

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_insn_format21c_string2461); if (state.failed) return size;

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
    // smaliIdeaParser.g:575:1: insn_format21c_type returns [int size] : INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor ;
    public final int insn_format21c_type() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:576:3: ( INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor )
            // smaliIdeaParser.g:577:5: INSTRUCTION_FORMAT21c_TYPE REGISTER COMMA reference_type_descriptor
            {
            match(input,INSTRUCTION_FORMAT21c_TYPE,FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_insn_format21c_type2480); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21c_type2482); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format21c_type2484); if (state.failed) return size;

            pushFollow(FOLLOW_reference_type_descriptor_in_insn_format21c_type2486);
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



    // $ANTLR start "insn_format21h"
    // smaliIdeaParser.g:579:1: insn_format21h returns [int size] : INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal ;
    public final int insn_format21h() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:580:3: ( INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal )
            // smaliIdeaParser.g:581:5: INSTRUCTION_FORMAT21h REGISTER COMMA integral_literal
            {
            match(input,INSTRUCTION_FORMAT21h,FOLLOW_INSTRUCTION_FORMAT21h_in_insn_format21h2505); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21h2507); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format21h2509); if (state.failed) return size;

            pushFollow(FOLLOW_integral_literal_in_insn_format21h2511);
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
    // $ANTLR end "insn_format21h"



    // $ANTLR start "insn_format21s"
    // smaliIdeaParser.g:583:1: insn_format21s returns [int size] : INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal ;
    public final int insn_format21s() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:584:3: ( INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal )
            // smaliIdeaParser.g:585:5: INSTRUCTION_FORMAT21s REGISTER COMMA integral_literal
            {
            match(input,INSTRUCTION_FORMAT21s,FOLLOW_INSTRUCTION_FORMAT21s_in_insn_format21s2530); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21s2532); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format21s2534); if (state.failed) return size;

            pushFollow(FOLLOW_integral_literal_in_insn_format21s2536);
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
    // smaliIdeaParser.g:587:1: insn_format21t returns [int size] : INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) ;
    public final int insn_format21t() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:588:3: ( INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset ) )
            // smaliIdeaParser.g:589:5: INSTRUCTION_FORMAT21t REGISTER COMMA ( label_ref_or_offset )
            {
            match(input,INSTRUCTION_FORMAT21t,FOLLOW_INSTRUCTION_FORMAT21t_in_insn_format21t2555); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format21t2557); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format21t2559); if (state.failed) return size;

            // smaliIdeaParser.g:589:42: ( label_ref_or_offset )
            // smaliIdeaParser.g:589:43: label_ref_or_offset
            {
            pushFollow(FOLLOW_label_ref_or_offset_in_insn_format21t2562);
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
    // smaliIdeaParser.g:591:1: insn_format22b returns [int size] : INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal ;
    public final int insn_format22b() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:592:3: ( INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal )
            // smaliIdeaParser.g:593:5: INSTRUCTION_FORMAT22b REGISTER COMMA REGISTER COMMA integral_literal
            {
            match(input,INSTRUCTION_FORMAT22b,FOLLOW_INSTRUCTION_FORMAT22b_in_insn_format22b2582); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22b2584); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22b2586); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22b2588); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22b2590); if (state.failed) return size;

            pushFollow(FOLLOW_integral_literal_in_insn_format22b2592);
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
    // smaliIdeaParser.g:595:1: insn_format22c_field returns [int size] : INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field ;
    public final int insn_format22c_field() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:596:3: ( INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field )
            // smaliIdeaParser.g:597:5: INSTRUCTION_FORMAT22c_FIELD REGISTER COMMA REGISTER COMMA fully_qualified_field
            {
            match(input,INSTRUCTION_FORMAT22c_FIELD,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_insn_format22c_field2611); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field2613); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field2615); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field2617); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field2619); if (state.failed) return size;

            pushFollow(FOLLOW_fully_qualified_field_in_insn_format22c_field2621);
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
    // smaliIdeaParser.g:599:1: insn_format22c_field_odex returns [int size] : INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field ;
    public final int insn_format22c_field_odex() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:600:3: ( INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field )
            // smaliIdeaParser.g:601:5: INSTRUCTION_FORMAT22c_FIELD_ODEX REGISTER COMMA REGISTER COMMA fully_qualified_field
            {
            match(input,INSTRUCTION_FORMAT22c_FIELD_ODEX,FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_insn_format22c_field_odex2640); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field_odex2642); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field_odex2644); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_field_odex2646); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_field_odex2648); if (state.failed) return size;

            pushFollow(FOLLOW_fully_qualified_field_in_insn_format22c_field_odex2650);
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
    // smaliIdeaParser.g:603:1: insn_format22c_type returns [int size] : INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor ;
    public final int insn_format22c_type() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:604:3: ( INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor )
            // smaliIdeaParser.g:605:5: INSTRUCTION_FORMAT22c_TYPE REGISTER COMMA REGISTER COMMA nonvoid_type_descriptor
            {
            match(input,INSTRUCTION_FORMAT22c_TYPE,FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_insn_format22c_type2669); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_type2671); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_type2673); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22c_type2675); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22c_type2677); if (state.failed) return size;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format22c_type2679);
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
    // smaliIdeaParser.g:607:1: insn_format22cs_field returns [int size] : INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET ;
    public final int insn_format22cs_field() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:608:3: ( INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET )
            // smaliIdeaParser.g:609:5: INSTRUCTION_FORMAT22cs_FIELD REGISTER COMMA REGISTER COMMA FIELD_OFFSET
            {
            match(input,INSTRUCTION_FORMAT22cs_FIELD,FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_insn_format22cs_field2698); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22cs_field2700); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22cs_field2702); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22cs_field2704); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22cs_field2706); if (state.failed) return size;

            match(input,FIELD_OFFSET,FOLLOW_FIELD_OFFSET_in_insn_format22cs_field2708); if (state.failed) return size;

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
    // smaliIdeaParser.g:611:1: insn_format22s returns [int size] : instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal ;
    public final int insn_format22s() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:612:3: ( instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal )
            // smaliIdeaParser.g:613:5: instruction_format22s REGISTER COMMA REGISTER COMMA integral_literal
            {
            pushFollow(FOLLOW_instruction_format22s_in_insn_format22s2727);
            instruction_format22s();

            state._fsp--;
            if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22s2729); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22s2731); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22s2733); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22s2735); if (state.failed) return size;

            pushFollow(FOLLOW_integral_literal_in_insn_format22s2737);
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
    // smaliIdeaParser.g:615:1: insn_format22t returns [int size] : INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset ;
    public final int insn_format22t() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:616:3: ( INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset )
            // smaliIdeaParser.g:617:5: INSTRUCTION_FORMAT22t REGISTER COMMA REGISTER COMMA label_ref_or_offset
            {
            match(input,INSTRUCTION_FORMAT22t,FOLLOW_INSTRUCTION_FORMAT22t_in_insn_format22t2756); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22t2758); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22t2760); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22t2762); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22t2764); if (state.failed) return size;

            pushFollow(FOLLOW_label_ref_or_offset_in_insn_format22t2766);
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
    // smaliIdeaParser.g:619:1: insn_format22x returns [int size] : INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER ;
    public final int insn_format22x() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:620:3: ( INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER )
            // smaliIdeaParser.g:621:5: INSTRUCTION_FORMAT22x REGISTER COMMA REGISTER
            {
            match(input,INSTRUCTION_FORMAT22x,FOLLOW_INSTRUCTION_FORMAT22x_in_insn_format22x2785); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22x2787); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format22x2789); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format22x2791); if (state.failed) return size;

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
    // smaliIdeaParser.g:623:1: insn_format23x returns [int size] : INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER ;
    public final int insn_format23x() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:624:3: ( INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER )
            // smaliIdeaParser.g:625:5: INSTRUCTION_FORMAT23x REGISTER COMMA REGISTER COMMA REGISTER
            {
            match(input,INSTRUCTION_FORMAT23x,FOLLOW_INSTRUCTION_FORMAT23x_in_insn_format23x2810); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x2812); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format23x2814); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x2816); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format23x2818); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format23x2820); if (state.failed) return size;

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
    // smaliIdeaParser.g:627:1: insn_format30t returns [int size] : INSTRUCTION_FORMAT30t label_ref_or_offset ;
    public final int insn_format30t() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:628:3: ( INSTRUCTION_FORMAT30t label_ref_or_offset )
            // smaliIdeaParser.g:629:5: INSTRUCTION_FORMAT30t label_ref_or_offset
            {
            match(input,INSTRUCTION_FORMAT30t,FOLLOW_INSTRUCTION_FORMAT30t_in_insn_format30t2839); if (state.failed) return size;

            pushFollow(FOLLOW_label_ref_or_offset_in_insn_format30t2841);
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
    // smaliIdeaParser.g:631:1: insn_format31c returns [int size] : INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL ;
    public final int insn_format31c() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:632:3: ( INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL )
            // smaliIdeaParser.g:633:5: INSTRUCTION_FORMAT31c REGISTER COMMA STRING_LITERAL
            {
            match(input,INSTRUCTION_FORMAT31c,FOLLOW_INSTRUCTION_FORMAT31c_in_insn_format31c2860); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31c2862); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format31c2864); if (state.failed) return size;

            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_insn_format31c2866); if (state.failed) return size;

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
    // smaliIdeaParser.g:635:1: insn_format31i returns [int size] : instruction_format31i REGISTER COMMA fixed_32bit_literal ;
    public final int insn_format31i() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:636:3: ( instruction_format31i REGISTER COMMA fixed_32bit_literal )
            // smaliIdeaParser.g:637:5: instruction_format31i REGISTER COMMA fixed_32bit_literal
            {
            pushFollow(FOLLOW_instruction_format31i_in_insn_format31i2885);
            instruction_format31i();

            state._fsp--;
            if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31i2887); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format31i2889); if (state.failed) return size;

            pushFollow(FOLLOW_fixed_32bit_literal_in_insn_format31i2891);
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
    // smaliIdeaParser.g:639:1: insn_format31t returns [int size] : INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset ;
    public final int insn_format31t() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:640:3: ( INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset )
            // smaliIdeaParser.g:641:5: INSTRUCTION_FORMAT31t REGISTER COMMA label_ref_or_offset
            {
            match(input,INSTRUCTION_FORMAT31t,FOLLOW_INSTRUCTION_FORMAT31t_in_insn_format31t2910); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format31t2912); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format31t2914); if (state.failed) return size;

            pushFollow(FOLLOW_label_ref_or_offset_in_insn_format31t2916);
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
    // smaliIdeaParser.g:643:1: insn_format32x returns [int size] : INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER ;
    public final int insn_format32x() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:644:3: ( INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER )
            // smaliIdeaParser.g:645:5: INSTRUCTION_FORMAT32x REGISTER COMMA REGISTER
            {
            match(input,INSTRUCTION_FORMAT32x,FOLLOW_INSTRUCTION_FORMAT32x_in_insn_format32x2935); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format32x2937); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format32x2939); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format32x2941); if (state.failed) return size;

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
    // smaliIdeaParser.g:647:1: insn_format35c_method returns [int size] : INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method ;
    public final int insn_format35c_method() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:648:3: ( INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method )
            // smaliIdeaParser.g:649:5: INSTRUCTION_FORMAT35c_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
            {
            match(input,INSTRUCTION_FORMAT35c_METHOD,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_insn_format35c_method2960); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_method2962); if (state.failed) return size;

            pushFollow(FOLLOW_register_list_in_insn_format35c_method2964);
            register_list();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_method2966); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_method2968); if (state.failed) return size;

            pushFollow(FOLLOW_fully_qualified_method_in_insn_format35c_method2970);
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
    // smaliIdeaParser.g:651:1: insn_format35c_type returns [int size] : INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor ;
    public final int insn_format35c_type() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:652:3: ( INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor )
            // smaliIdeaParser.g:653:5: INSTRUCTION_FORMAT35c_TYPE OPEN_BRACE register_list CLOSE_BRACE COMMA nonvoid_type_descriptor
            {
            match(input,INSTRUCTION_FORMAT35c_TYPE,FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_insn_format35c_type2989); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_type2991); if (state.failed) return size;

            pushFollow(FOLLOW_register_list_in_insn_format35c_type2993);
            register_list();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_type2995); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_type2997); if (state.failed) return size;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format35c_type2999);
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
    // smaliIdeaParser.g:655:1: insn_format35c_method_odex returns [int size] : INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method ;
    public final int insn_format35c_method_odex() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:656:3: ( INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method )
            // smaliIdeaParser.g:657:5: INSTRUCTION_FORMAT35c_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
            {
            match(input,INSTRUCTION_FORMAT35c_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_insn_format35c_method_odex3018); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35c_method_odex3020); if (state.failed) return size;

            pushFollow(FOLLOW_register_list_in_insn_format35c_method_odex3022);
            register_list();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35c_method_odex3024); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format35c_method_odex3026); if (state.failed) return size;

            pushFollow(FOLLOW_fully_qualified_method_in_insn_format35c_method_odex3028);
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
    // smaliIdeaParser.g:659:1: insn_format35mi_method returns [int size] : INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX ;
    public final int insn_format35mi_method() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:660:3: ( INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX )
            // smaliIdeaParser.g:661:5: INSTRUCTION_FORMAT35mi_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA INLINE_INDEX
            {
            match(input,INSTRUCTION_FORMAT35mi_METHOD,FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_insn_format35mi_method3047); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35mi_method3049); if (state.failed) return size;

            pushFollow(FOLLOW_register_list_in_insn_format35mi_method3051);
            register_list();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35mi_method3053); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format35mi_method3055); if (state.failed) return size;

            match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_insn_format35mi_method3057); if (state.failed) return size;

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
    // smaliIdeaParser.g:663:1: insn_format35ms_method returns [int size] : INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX ;
    public final int insn_format35ms_method() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:664:3: ( INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX )
            // smaliIdeaParser.g:665:5: INSTRUCTION_FORMAT35ms_METHOD OPEN_BRACE register_list CLOSE_BRACE COMMA VTABLE_INDEX
            {
            match(input,INSTRUCTION_FORMAT35ms_METHOD,FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_insn_format35ms_method3076); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format35ms_method3078); if (state.failed) return size;

            pushFollow(FOLLOW_register_list_in_insn_format35ms_method3080);
            register_list();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format35ms_method3082); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format35ms_method3084); if (state.failed) return size;

            match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_insn_format35ms_method3086); if (state.failed) return size;

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
    // smaliIdeaParser.g:667:1: insn_format3rc_method returns [int size] : INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method ;
    public final int insn_format3rc_method() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:668:3: ( INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method )
            // smaliIdeaParser.g:669:5: INSTRUCTION_FORMAT3rc_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA fully_qualified_method
            {
            match(input,INSTRUCTION_FORMAT3rc_METHOD,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_insn_format3rc_method3105); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_method3107); if (state.failed) return size;

            pushFollow(FOLLOW_register_range_in_insn_format3rc_method3109);
            register_range();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_method3111); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_method3113); if (state.failed) return size;

            pushFollow(FOLLOW_fully_qualified_method_in_insn_format3rc_method3115);
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
    // smaliIdeaParser.g:671:1: insn_format3rc_method_odex returns [int size] : INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method ;
    public final int insn_format3rc_method_odex() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:672:3: ( INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method )
            // smaliIdeaParser.g:673:5: INSTRUCTION_FORMAT3rc_METHOD_ODEX OPEN_BRACE register_list CLOSE_BRACE COMMA fully_qualified_method
            {
            match(input,INSTRUCTION_FORMAT3rc_METHOD_ODEX,FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_insn_format3rc_method_odex3134); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_method_odex3136); if (state.failed) return size;

            pushFollow(FOLLOW_register_list_in_insn_format3rc_method_odex3138);
            register_list();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_method_odex3140); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_method_odex3142); if (state.failed) return size;

            pushFollow(FOLLOW_fully_qualified_method_in_insn_format3rc_method_odex3144);
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
    // smaliIdeaParser.g:675:1: insn_format3rc_type returns [int size] : INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor ;
    public final int insn_format3rc_type() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:676:3: ( INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor )
            // smaliIdeaParser.g:677:5: INSTRUCTION_FORMAT3rc_TYPE OPEN_BRACE register_range CLOSE_BRACE COMMA nonvoid_type_descriptor
            {
            match(input,INSTRUCTION_FORMAT3rc_TYPE,FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_insn_format3rc_type3163); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rc_type3165); if (state.failed) return size;

            pushFollow(FOLLOW_register_range_in_insn_format3rc_type3167);
            register_range();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rc_type3169); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format3rc_type3171); if (state.failed) return size;

            pushFollow(FOLLOW_nonvoid_type_descriptor_in_insn_format3rc_type3173);
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
    // smaliIdeaParser.g:679:1: insn_format3rmi_method returns [int size] : INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX ;
    public final int insn_format3rmi_method() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:680:3: ( INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX )
            // smaliIdeaParser.g:681:5: INSTRUCTION_FORMAT3rmi_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA INLINE_INDEX
            {
            match(input,INSTRUCTION_FORMAT3rmi_METHOD,FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_insn_format3rmi_method3192); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rmi_method3194); if (state.failed) return size;

            pushFollow(FOLLOW_register_range_in_insn_format3rmi_method3196);
            register_range();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rmi_method3198); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format3rmi_method3200); if (state.failed) return size;

            match(input,INLINE_INDEX,FOLLOW_INLINE_INDEX_in_insn_format3rmi_method3202); if (state.failed) return size;

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
    // smaliIdeaParser.g:683:1: insn_format3rms_method returns [int size] : INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX ;
    public final int insn_format3rms_method() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:684:3: ( INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX )
            // smaliIdeaParser.g:685:5: INSTRUCTION_FORMAT3rms_METHOD OPEN_BRACE register_range CLOSE_BRACE COMMA VTABLE_INDEX
            {
            match(input,INSTRUCTION_FORMAT3rms_METHOD,FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_insn_format3rms_method3221); if (state.failed) return size;

            match(input,OPEN_BRACE,FOLLOW_OPEN_BRACE_in_insn_format3rms_method3223); if (state.failed) return size;

            pushFollow(FOLLOW_register_range_in_insn_format3rms_method3225);
            register_range();

            state._fsp--;
            if (state.failed) return size;

            match(input,CLOSE_BRACE,FOLLOW_CLOSE_BRACE_in_insn_format3rms_method3227); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format3rms_method3229); if (state.failed) return size;

            match(input,VTABLE_INDEX,FOLLOW_VTABLE_INDEX_in_insn_format3rms_method3231); if (state.failed) return size;

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
    // smaliIdeaParser.g:687:1: insn_format51l returns [int size] : INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal ;
    public final int insn_format51l() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:688:3: ( INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal )
            // smaliIdeaParser.g:689:5: INSTRUCTION_FORMAT51l REGISTER COMMA fixed_literal
            {
            match(input,INSTRUCTION_FORMAT51l,FOLLOW_INSTRUCTION_FORMAT51l_in_insn_format51l3250); if (state.failed) return size;

            match(input,REGISTER,FOLLOW_REGISTER_in_insn_format51l3252); if (state.failed) return size;

            match(input,COMMA,FOLLOW_COMMA_in_insn_format51l3254); if (state.failed) return size;

            pushFollow(FOLLOW_fixed_literal_in_insn_format51l3256);
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
    // smaliIdeaParser.g:691:1: insn_array_data_directive returns [int size] : ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE ;
    public final int insn_array_data_directive() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:692:3: ( ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE )
            // smaliIdeaParser.g:692:5: ARRAY_DATA_DIRECTIVE integral_literal ( fixed_literal )* END_ARRAY_DATA_DIRECTIVE
            {
            match(input,ARRAY_DATA_DIRECTIVE,FOLLOW_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive3270); if (state.failed) return size;

            pushFollow(FOLLOW_integral_literal_in_insn_array_data_directive3272);
            integral_literal();

            state._fsp--;
            if (state.failed) return size;

            // smaliIdeaParser.g:692:43: ( fixed_literal )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0 >= BOOL_LITERAL && LA37_0 <= BYTE_LITERAL)||LA37_0==CHAR_LITERAL||(LA37_0 >= DOUBLE_LITERAL && LA37_0 <= DOUBLE_LITERAL_OR_ID)||(LA37_0 >= FLOAT_LITERAL && LA37_0 <= FLOAT_LITERAL_OR_ID)||LA37_0==LONG_LITERAL||LA37_0==NEGATIVE_INTEGER_LITERAL||LA37_0==POSITIVE_INTEGER_LITERAL||LA37_0==SHORT_LITERAL) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // smaliIdeaParser.g:692:43: fixed_literal
            	    {
            	    pushFollow(FOLLOW_fixed_literal_in_insn_array_data_directive3274);
            	    fixed_literal();

            	    state._fsp--;
            	    if (state.failed) return size;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            match(input,END_ARRAY_DATA_DIRECTIVE,FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive3277); if (state.failed) return size;

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
    // smaliIdeaParser.g:694:1: insn_packed_switch_directive returns [int size] : PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE ;
    public final int insn_packed_switch_directive() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:695:3: ( PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE )
            // smaliIdeaParser.g:695:5: PACKED_SWITCH_DIRECTIVE fixed_32bit_literal ( label_ref_or_offset )* END_PACKED_SWITCH_DIRECTIVE
            {
            match(input,PACKED_SWITCH_DIRECTIVE,FOLLOW_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive3291); if (state.failed) return size;

            pushFollow(FOLLOW_fixed_32bit_literal_in_insn_packed_switch_directive3293);
            fixed_32bit_literal();

            state._fsp--;
            if (state.failed) return size;

            // smaliIdeaParser.g:695:49: ( label_ref_or_offset )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==COLON||LA38_0==NEGATIVE_INTEGER_LITERAL||LA38_0==OFFSET) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // smaliIdeaParser.g:695:49: label_ref_or_offset
            	    {
            	    pushFollow(FOLLOW_label_ref_or_offset_in_insn_packed_switch_directive3295);
            	    label_ref_or_offset();

            	    state._fsp--;
            	    if (state.failed) return size;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            match(input,END_PACKED_SWITCH_DIRECTIVE,FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive3298); if (state.failed) return size;

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
    // smaliIdeaParser.g:697:1: insn_sparse_switch_directive returns [int size] : SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE ;
    public final int insn_sparse_switch_directive() throws RecognitionException {
        int size = 0;


        try {
            // smaliIdeaParser.g:698:3: ( SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE )
            // smaliIdeaParser.g:698:5: SPARSE_SWITCH_DIRECTIVE ( fixed_32bit_literal ARROW label_ref_or_offset )* END_SPARSE_SWITCH_DIRECTIVE
            {
            match(input,SPARSE_SWITCH_DIRECTIVE,FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive3312); if (state.failed) return size;

            // smaliIdeaParser.g:698:29: ( fixed_32bit_literal ARROW label_ref_or_offset )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0 >= BOOL_LITERAL && LA39_0 <= BYTE_LITERAL)||LA39_0==CHAR_LITERAL||(LA39_0 >= FLOAT_LITERAL && LA39_0 <= FLOAT_LITERAL_OR_ID)||LA39_0==LONG_LITERAL||LA39_0==NEGATIVE_INTEGER_LITERAL||LA39_0==POSITIVE_INTEGER_LITERAL||LA39_0==SHORT_LITERAL) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // smaliIdeaParser.g:698:30: fixed_32bit_literal ARROW label_ref_or_offset
            	    {
            	    pushFollow(FOLLOW_fixed_32bit_literal_in_insn_sparse_switch_directive3315);
            	    fixed_32bit_literal();

            	    state._fsp--;
            	    if (state.failed) return size;

            	    match(input,ARROW,FOLLOW_ARROW_in_insn_sparse_switch_directive3317); if (state.failed) return size;

            	    pushFollow(FOLLOW_label_ref_or_offset_in_insn_sparse_switch_directive3319);
            	    label_ref_or_offset();

            	    state._fsp--;
            	    if (state.failed) return size;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            match(input,END_SPARSE_SWITCH_DIRECTIVE,FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive3323); if (state.failed) return size;

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
        match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_synpred1_smaliIdeaParser298); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_smaliIdeaParser

    // $ANTLR start synpred2_smaliIdeaParser
    public final void synpred2_smaliIdeaParser_fragment() throws RecognitionException {
        // smaliIdeaParser.g:192:35: ( ANNOTATION_DIRECTIVE )
        // smaliIdeaParser.g:192:36: ANNOTATION_DIRECTIVE
        {
        match(input,ANNOTATION_DIRECTIVE,FOLLOW_ANNOTATION_DIRECTIVE_in_synpred2_smaliIdeaParser341); if (state.failed) return ;

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
        "\75\uffff";
    static final String DFA32_eofS =
        "\75\uffff";
    static final String DFA32_minS =
        "\1\5\72\uffff\1\0\1\uffff";
    static final String DFA32_maxS =
        "\1\177\72\uffff\1\0\1\uffff";
    static final String DFA32_acceptS =
        "\1\uffff\1\2\72\uffff\1\1";
    static final String DFA32_specialS =
        "\73\uffff\1\0\1\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\73\1\uffff\1\1\17\uffff\2\1\5\uffff\1\1\10\uffff\2\1\1\uffff"+
            "\1\1\3\uffff\1\1\13\uffff\53\1\2\uffff\3\1\10\uffff\1\1\2\uffff"+
            "\1\1\2\uffff\1\1\1\uffff\2\1\2\uffff\2\1",
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
            return "()* loopback of 436:5: ({...}? annotation )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_59 = input.LA(1);

                         
                        int index32_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( ((input.LA(1) == ANNOTATION_DIRECTIVE)) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index32_59);

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
 

    public static final BitSet FOLLOW_class_element_in_smali_file62 = new BitSet(new long[]{0x0102000008000020L,0x4000080000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_sync_in_smali_file64 = new BitSet(new long[]{0x0102000008000020L,0x4000080000000000L,0x0000000000000004L});
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
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_class_spec141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_DIRECTIVE_in_super_spec164 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_super_spec166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTS_DIRECTIVE_in_implements_spec189 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_implements_spec191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_spec214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_spec216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACCESS_SPEC_in_access_list239 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_FIELD_DIRECTIVE_in_field266 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_access_list_in_field268 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_simple_name_in_field270 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_field272 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_field274 = new BitSet(new long[]{0x0000804000000022L});
    public static final BitSet FOLLOW_EQUAL_in_field277 = new BitSet(new long[]{0x0018200C06600100L,0x10C1640000000000L,0x0000000000000013L});
    public static final BitSet FOLLOW_literal_in_field279 = new BitSet(new long[]{0x0000004000000022L});
    public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_field345 = new BitSet(new long[]{0x0000004000000022L});
    public static final BitSet FOLLOW_END_FIELD_DIRECTIVE_in_field383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DIRECTIVE_in_method457 = new BitSet(new long[]{0x5C10000800200050L,0x22D070107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_access_list_in_method459 = new BitSet(new long[]{0x5C10000800200050L,0x22D070107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_method_name_in_method461 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_method463 = new BitSet(new long[]{0xFC004180418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_statements_and_directives_in_method465 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_END_METHOD_DIRECTIVE_in_method467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_statements_and_directives492 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_registers_directive_in_statements_and_directives502 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_label_in_statements_and_directives512 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_catch_directive_in_statements_and_directives522 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_catchall_directive_in_statements_and_directives532 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_parameter_directive_in_statements_and_directives542 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_ordered_debug_directive_in_statements_and_directives552 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_annotation_in_statements_and_directives562 = new BitSet(new long[]{0xFC004080418000A0L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_sync_in_statements_and_directives576 = new BitSet(new long[]{0xFC004080418000A2L,0xCD24039FFFFFFFFFL});
    public static final BitSet FOLLOW_REGISTERS_DIRECTIVE_in_registers_directive598 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCALS_DIRECTIVE_in_registers_directive608 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_registers_directive610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_method_name901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_NAME_in_method_name907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_PAREN_in_method_prototype930 = new BitSet(new long[]{0x0000000024000100L,0x0098000000000000L});
    public static final BitSet FOLLOW_param_list_in_method_prototype932 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_CLOSE_PAREN_in_method_prototype934 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_type_descriptor_in_method_prototype936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_in_param_list952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAM_LIST_OR_ID_in_param_list958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_param_list964 = new BitSet(new long[]{0x0000000004000102L,0x0080000000000000L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_literal1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_literal1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_literal1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_literal1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_literal1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_literal1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_literal1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_literal1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_LITERAL_in_literal1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_literal_in_literal1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subannotation_in_literal1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_field_method_literal_in_literal1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_literal_in_literal1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_integral_literal1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_integral_literal1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_integral_literal1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_integral_literal1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_integral_literal1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_32bit_literal1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_32bit_literal1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_32bit_literal1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_32bit_literal1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_32bit_literal1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_32bit_literal1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_32bit_literal1273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_fixed_literal1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_LITERAL_in_fixed_literal1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_LITERAL_in_fixed_literal1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_LITERAL_in_fixed_literal1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_float_literal_in_fixed_literal1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_literal_in_fixed_literal1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_fixed_literal1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_LITERAL_in_fixed_literal1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_array_literal1335 = new BitSet(new long[]{0x0018200C16600100L,0x10C1640000000000L,0x0000000000000013L});
    public static final BitSet FOLLOW_literal_in_array_literal1338 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_COMMA_in_array_literal1341 = new BitSet(new long[]{0x0018200C06600100L,0x10C1640000000000L,0x0000000000000013L});
    public static final BitSet FOLLOW_literal_in_array_literal1343 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_array_literal1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_name_in_annotation_element1361 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_EQUAL_in_annotation_element1363 = new BitSet(new long[]{0x0018200C06600100L,0x10C1640000000000L,0x0000000000000013L});
    public static final BitSet FOLLOW_literal_in_annotation_element1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_annotation1383 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ANNOTATION_VISIBILITY_in_annotation1385 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_annotation1387 = new BitSet(new long[]{0x5C10001800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_annotation_element_in_annotation1393 = new BitSet(new long[]{0x5C10001800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_END_ANNOTATION_DIRECTIVE_in_annotation1396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBANNOTATION_DIRECTIVE_in_subannotation1412 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_subannotation1414 = new BitSet(new long[]{0x5C10100800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_annotation_element_in_subannotation1416 = new BitSet(new long[]{0x5C10100800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_END_SUBANNOTATION_DIRECTIVE_in_subannotation1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_DIRECTIVE_in_enum_literal1429 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1431 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_in_enum_literal1433 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_simple_name_in_enum_literal1435 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_enum_literal1437 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_enum_literal1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_type_field_method_literal1449 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ARROW_in_type_field_method_literal1457 = new BitSet(new long[]{0x5C10000800200050L,0x22D070107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_simple_name_in_type_field_method_literal1467 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_type_field_method_literal1469 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_type_field_method_literal1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_name_in_type_field_method_literal1481 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_type_field_method_literal1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIMITIVE_TYPE_in_type_field_method_literal1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_TYPE_in_type_field_method_literal1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_method1529 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_method1531 = new BitSet(new long[]{0x5C10000800200050L,0x22D070107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_method_name_in_fully_qualified_method1533 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_method_prototype_in_fully_qualified_method1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_fully_qualified_field1545 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_in_fully_qualified_field1547 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_simple_name_in_fully_qualified_field1549 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_fully_qualified_field1551 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_fully_qualified_field1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label1563 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_simple_name_in_label1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_label_ref_or_offset1575 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_simple_name_in_label_ref_or_offset1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFFSET_in_label_ref_or_offset1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_INTEGER_LITERAL_in_label_ref_or_offset1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REGISTER_in_register_list1600 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_COMMA_in_register_list1603 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_list1605 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_REGISTER_in_register_range1620 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_DOTDOT_in_register_range1623 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_register_range1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_DESCRIPTOR_in_verification_error_reference1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_field_in_verification_error_reference1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_method_in_verification_error_reference1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_DIRECTIVE_in_catch_directive1657 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_catch_directive1659 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catch_directive1661 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1663 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOTDOT_in_catch_directive1665 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1667 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catch_directive1669 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catch_directive1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCHALL_DIRECTIVE_in_catchall_directive1681 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_catchall_directive1683 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1685 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_DOTDOT_in_catchall_directive1687 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1689 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_catchall_directive1691 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_catchall_directive1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARAMETER_DIRECTIVE_in_parameter_directive1705 = new BitSet(new long[]{0x0000040000000022L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_parameter_directive1707 = new BitSet(new long[]{0x0000040000000022L});
    public static final BitSet FOLLOW_annotation_in_parameter_directive1717 = new BitSet(new long[]{0x0000040000000022L});
    public static final BitSet FOLLOW_END_PARAMETER_DIRECTIVE_in_parameter_directive1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_line_directive_in_ordered_debug_directive1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_local_directive_in_ordered_debug_directive1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_end_local_directive_in_ordered_debug_directive1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_restart_local_directive_in_ordered_debug_directive1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prologue_directive_in_ordered_debug_directive1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_epilogue_directive_in_ordered_debug_directive1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_source_directive_in_ordered_debug_directive1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LINE_DIRECTIVE_in_line_directive1797 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_line_directive1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_DIRECTIVE_in_local_directive1809 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_local_directive1811 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_local_directive1813 = new BitSet(new long[]{0x5C10000800200050L,0x22D060107D8B7A79L,0x0000000000000018L});
    public static final BitSet FOLLOW_simple_name_in_local_directive1815 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_COLON_in_local_directive1817 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_local_directive1819 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_COMMA_in_local_directive1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_local_directive1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_END_LOCAL_DIRECTIVE_in_end_local_directive1836 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_end_local_directive1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RESTART_LOCAL_DIRECTIVE_in_restart_local_directive1848 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_restart_local_directive1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROLOGUE_DIRECTIVE_in_prologue_directive1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EPILOGUE_DIRECTIVE_in_epilogue_directive1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOURCE_DIRECTIVE_in_source_directive1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_source_directive1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format10t_in_instruction1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format10x_in_instruction1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format10x_odex_in_instruction1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format11n_in_instruction1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format11x_in_instruction1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format12x_in_instruction1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format20bc_in_instruction1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format20t_in_instruction1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format21c_field_in_instruction1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format21c_field_odex_in_instruction2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format21c_string_in_instruction2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format21c_type_in_instruction2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format21h_in_instruction2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format21s_in_instruction2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format21t_in_instruction2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format22b_in_instruction2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format22c_field_in_instruction2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format22c_field_odex_in_instruction2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format22c_type_in_instruction2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format22cs_field_in_instruction2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format22s_in_instruction2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format22t_in_instruction2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format22x_in_instruction2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format23x_in_instruction2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format30t_in_instruction2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format31c_in_instruction2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format31i_in_instruction2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format31t_in_instruction2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format32x_in_instruction2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format35c_method_in_instruction2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format35c_type_in_instruction2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format35c_method_odex_in_instruction2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format35mi_method_in_instruction2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format35ms_method_in_instruction2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format3rc_method_in_instruction2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format3rc_method_odex_in_instruction2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format3rc_type_in_instruction2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format3rmi_method_in_instruction2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format3rms_method_in_instruction2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_format51l_in_instruction2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_array_data_directive_in_instruction2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_packed_switch_directive_in_instruction2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insn_sparse_switch_directive_in_instruction2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10t_in_insn_format10t2229 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format10t2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_in_insn_format10x2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT10x_ODEX_in_insn_format10x_odex2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11n_in_insn_format11n2288 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format11n2290 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format11n2292 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_insn_format11n2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT11x_in_insn_format11x2313 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format11x2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format12x_in_insn_format12x2334 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format12x2336 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format12x2338 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format12x2340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20bc_in_insn_format20bc2359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_VERIFICATION_ERROR_TYPE_in_insn_format20bc2361 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format20bc2363 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_verification_error_reference_in_insn_format20bc2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT20t_in_insn_format20t2384 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format20t2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_in_insn_format21c_field2405 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format21c_field2407 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format21c_field2409 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_insn_format21c_field2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_FIELD_ODEX_in_insn_format21c_field_odex2430 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format21c_field_odex2432 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format21c_field_odex2434 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_insn_format21c_field_odex2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_STRING_in_insn_format21c_string2455 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format21c_string2457 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format21c_string2459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_insn_format21c_string2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21c_TYPE_in_insn_format21c_type2480 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format21c_type2482 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format21c_type2484 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_reference_type_descriptor_in_insn_format21c_type2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21h_in_insn_format21h2505 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format21h2507 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format21h2509 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_insn_format21h2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21s_in_insn_format21s2530 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format21s2532 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format21s2534 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_insn_format21s2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT21t_in_insn_format21t2555 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format21t2557 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format21t2559 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format21t2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22b_in_insn_format22b2582 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22b2584 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22b2586 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22b2588 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22b2590 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_insn_format22b2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_in_insn_format22c_field2611 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field2613 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22c_field2615 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field2617 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22c_field2619 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_insn_format22c_field2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_FIELD_ODEX_in_insn_format22c_field_odex2640 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field_odex2642 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22c_field_odex2644 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22c_field_odex2646 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22c_field_odex2648 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_field_in_insn_format22c_field_odex2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22c_TYPE_in_insn_format22c_type2669 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22c_type2671 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22c_type2673 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22c_type2675 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22c_type2677 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format22c_type2679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22cs_FIELD_in_insn_format22cs_field2698 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22cs_field2700 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22cs_field2702 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22cs_field2704 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22cs_field2706 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_FIELD_OFFSET_in_insn_format22cs_field2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format22s_in_insn_format22s2727 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22s2729 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22s2731 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22s2733 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22s2735 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_insn_format22s2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22t_in_insn_format22t2756 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22t2758 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22t2760 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22t2762 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22t2764 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format22t2766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT22x_in_insn_format22x2785 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22x2787 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format22x2789 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format22x2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT23x_in_insn_format23x2810 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format23x2812 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format23x2814 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format23x2816 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format23x2818 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format23x2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT30t_in_insn_format30t2839 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format30t2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31c_in_insn_format31c2860 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format31c2862 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format31c2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_insn_format31c2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_format31i_in_insn_format31i2885 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format31i2887 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format31i2889 = new BitSet(new long[]{0x0018000002600000L,0x1040240000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_format31i2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT31t_in_insn_format31t2910 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format31t2912 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format31t2914 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_insn_format31t2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT32x_in_insn_format32x2935 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format32x2937 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format32x2939 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format32x2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_in_insn_format35c_method2960 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_method2962 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_insn_format35c_method2964 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_method2966 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format35c_method2968 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_insn_format35c_method2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_TYPE_in_insn_format35c_type2989 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_type2991 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_insn_format35c_type2993 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_type2995 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format35c_type2997 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format35c_type2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35c_METHOD_ODEX_in_insn_format35c_method_odex3018 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35c_method_odex3020 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_insn_format35c_method_odex3022 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35c_method_odex3024 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format35c_method_odex3026 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_insn_format35c_method_odex3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35mi_METHOD_in_insn_format35mi_method3047 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35mi_method3049 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_insn_format35mi_method3051 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35mi_method3053 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format35mi_method3055 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_INLINE_INDEX_in_insn_format35mi_method3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT35ms_METHOD_in_insn_format35ms_method3076 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format35ms_method3078 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_insn_format35ms_method3080 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format35ms_method3082 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format35ms_method3084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_VTABLE_INDEX_in_insn_format35ms_method3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_in_insn_format3rc_method3105 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_method3107 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_insn_format3rc_method3109 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_method3111 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format3rc_method3113 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_insn_format3rc_method3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_METHOD_ODEX_in_insn_format3rc_method_odex3134 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_method_odex3136 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_list_in_insn_format3rc_method_odex3138 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_method_odex3140 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format3rc_method_odex3142 = new BitSet(new long[]{0x0000000004000100L});
    public static final BitSet FOLLOW_fully_qualified_method_in_insn_format3rc_method_odex3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rc_TYPE_in_insn_format3rc_type3163 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rc_type3165 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_insn_format3rc_type3167 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rc_type3169 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format3rc_type3171 = new BitSet(new long[]{0x0000000004000100L,0x0080000000000000L});
    public static final BitSet FOLLOW_nonvoid_type_descriptor_in_insn_format3rc_type3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rmi_METHOD_in_insn_format3rmi_method3192 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rmi_method3194 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_insn_format3rmi_method3196 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rmi_method3198 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format3rmi_method3200 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_INLINE_INDEX_in_insn_format3rmi_method3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT3rms_METHOD_in_insn_format3rms_method3221 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_OPEN_BRACE_in_insn_format3rms_method3223 = new BitSet(new long[]{0x0000000010000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_register_range_in_insn_format3rms_method3225 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_CLOSE_BRACE_in_insn_format3rms_method3227 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format3rms_method3229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_VTABLE_INDEX_in_insn_format3rms_method3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTRUCTION_FORMAT51l_in_insn_format51l3250 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_REGISTER_in_insn_format51l3252 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_COMMA_in_insn_format51l3254 = new BitSet(new long[]{0x0018000C02600000L,0x1040240000000000L});
    public static final BitSet FOLLOW_fixed_literal_in_insn_format51l3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive3270 = new BitSet(new long[]{0x0000000002400000L,0x1040240000000000L});
    public static final BitSet FOLLOW_integral_literal_in_insn_array_data_directive3272 = new BitSet(new long[]{0x0018002C02600000L,0x1040240000000000L});
    public static final BitSet FOLLOW_fixed_literal_in_insn_array_data_directive3274 = new BitSet(new long[]{0x0018002C02600000L,0x1040240000000000L});
    public static final BitSet FOLLOW_END_ARRAY_DATA_DIRECTIVE_in_insn_array_data_directive3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive3291 = new BitSet(new long[]{0x0018000002600000L,0x1040240000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_packed_switch_directive3293 = new BitSet(new long[]{0x0000020040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_insn_packed_switch_directive3295 = new BitSet(new long[]{0x0000020040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_END_PACKED_SWITCH_DIRECTIVE_in_insn_packed_switch_directive3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive3312 = new BitSet(new long[]{0x0018080002600000L,0x1040240000000000L});
    public static final BitSet FOLLOW_fixed_32bit_literal_in_insn_sparse_switch_directive3315 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_in_insn_sparse_switch_directive3317 = new BitSet(new long[]{0x0000000040000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_label_ref_or_offset_in_insn_sparse_switch_directive3319 = new BitSet(new long[]{0x0018080002600000L,0x1040240000000000L});
    public static final BitSet FOLLOW_END_SPARSE_SWITCH_DIRECTIVE_in_insn_sparse_switch_directive3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_synpred1_smaliIdeaParser298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_DIRECTIVE_in_synpred2_smaliIdeaParser341 = new BitSet(new long[]{0x0000000000000002L});

}