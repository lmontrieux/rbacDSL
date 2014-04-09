package uk.ac.open.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRbacDSLLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalRbacDSLLexer() {;} 
    public InternalRbacDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRbacDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:11:7: ( 'policy' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:11:9: 'policy'
            {
            match("policy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:12:7: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:13:7: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:14:7: ( 'scenarios' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:14:9: 'scenarios'
            {
            match("scenarios"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:15:7: ( 'user' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:15:9: 'user'
            {
            match("user"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:16:7: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:16:9: 'role'
            {
            match("role"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:17:7: ( 'extends' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:17:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:18:7: ( 'ssod' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:18:9: 'ssod'
            {
            match("ssod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:19:7: ( 'dsod' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:19:9: 'dsod'
            {
            match("dsod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:20:7: ( 'object' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:20:9: 'object'
            {
            match("object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:21:7: ( '[' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:21:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:22:7: ( ']' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:22:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:23:7: ( 'action' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:23:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:24:7: ( 'grantedScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:24:9: 'grantedScenario'
            {
            match("grantedScenario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:25:7: ( 'forbiddenScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:25:9: 'forbiddenScenario'
            {
            match("forbiddenScenario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:26:7: ( 'userRoleScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:26:9: 'userRoleScenario'
            {
            match("userRoleScenario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:27:7: ( 'objectRoleScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:27:9: 'objectRoleScenario'
            {
            match("objectRoleScenario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:28:7: ( 'objectScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:28:9: 'objectScenario'
            {
            match("objectScenario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3919:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3919:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3919:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3919:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3919:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3921:10: ( ( '0' .. '9' )+ )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3921:12: ( '0' .. '9' )+
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3921:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3921:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3923:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3925:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3925:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3925:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3925:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3927:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3927:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3927:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3927:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3927:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3927:41: ( '\\r' )? '\\n'
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3927:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3927:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3929:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3929:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3929:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3931:16: ( . )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3931:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=25;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:118: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:126: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:135: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:147: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:163: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:179: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1:187: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\30\2\uffff\6\30\2\uffff\3\30\1\26\2\uffff\3\26\2\uffff"+
        "\1\30\3\uffff\7\30\2\uffff\3\30\5\uffff\15\30\1\104\1\106\1\107"+
        "\1\30\1\111\6\30\1\uffff\1\30\2\uffff\1\30\1\uffff\4\30\1\126\3"+
        "\30\1\134\1\135\2\30\1\uffff\2\30\1\142\2\30\2\uffff\4\30\1\uffff"+
        "\4\30\1\155\5\30\1\uffff\26\30\1\u0089\4\30\1\uffff\1\u008e\1\30"+
        "\1\u0090\1\30\1\uffff\1\30\1\uffff\1\30\1\u0094\1\u0095\2\uffff";
    static final String DFA12_eofS =
        "\u0096\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\2\uffff\1\143\1\163\1\157\1\170\1\163\1\142\2\uffff\1"+
        "\143\1\162\1\157\1\101\2\uffff\2\0\1\52\2\uffff\1\154\3\uffff\1"+
        "\145\1\157\1\145\1\154\1\164\1\157\1\152\2\uffff\1\164\1\141\1\162"+
        "\5\uffff\1\151\1\156\1\144\1\162\2\145\1\144\1\145\1\151\1\156\1"+
        "\142\1\143\1\141\3\60\1\156\1\60\1\143\1\157\1\164\1\151\1\171\1"+
        "\162\1\uffff\1\157\2\uffff\1\144\1\uffff\1\164\1\156\1\145\1\144"+
        "\1\60\1\151\1\154\1\163\2\60\2\144\1\uffff\1\157\1\145\1\60\1\157"+
        "\1\143\2\uffff\1\123\1\145\1\163\1\123\1\uffff\1\154\1\145\1\143"+
        "\1\156\1\60\1\143\1\145\1\156\1\145\1\123\1\uffff\1\145\1\123\1"+
        "\141\1\156\1\143\1\156\1\143\1\162\1\141\1\145\1\141\1\145\1\151"+
        "\1\162\1\156\1\162\1\156\1\157\1\151\1\141\1\151\1\141\1\60\1\157"+
        "\1\162\1\157\1\162\1\uffff\1\60\1\151\1\60\1\151\1\uffff\1\157\1"+
        "\uffff\1\157\2\60\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\2\uffff\2\163\1\157\1\170\1\163\1\142\2\uffff\1\143"+
        "\1\162\1\157\1\172\2\uffff\2\uffff\1\57\2\uffff\1\154\3\uffff\1"+
        "\145\1\157\1\145\1\154\1\164\1\157\1\152\2\uffff\1\164\1\141\1\162"+
        "\5\uffff\1\151\1\156\1\144\1\162\2\145\1\144\1\145\1\151\1\156\1"+
        "\142\1\143\1\141\3\172\1\156\1\172\1\143\1\157\1\164\1\151\1\171"+
        "\1\162\1\uffff\1\157\2\uffff\1\144\1\uffff\1\164\1\156\1\145\1\144"+
        "\1\172\1\151\1\154\1\163\2\172\2\144\1\uffff\1\157\1\145\1\172\1"+
        "\157\1\143\2\uffff\1\123\1\145\1\163\1\123\1\uffff\1\154\1\145\1"+
        "\143\1\156\1\172\1\143\1\145\1\156\1\145\1\123\1\uffff\1\145\1\123"+
        "\1\141\1\156\1\143\1\156\1\143\1\162\1\141\1\145\1\141\1\145\1\151"+
        "\1\162\1\156\1\162\1\156\1\157\1\151\1\141\1\151\1\141\1\172\1\157"+
        "\1\162\1\157\1\162\1\uffff\1\172\1\151\1\172\1\151\1\uffff\1\157"+
        "\1\uffff\1\157\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\6\uffff\1\13\1\14\4\uffff\1\23\1\24\3\uffff\1\30"+
        "\1\31\1\uffff\1\23\1\2\1\3\7\uffff\1\13\1\14\3\uffff\1\24\1\25\1"+
        "\26\1\27\1\30\30\uffff\1\10\1\uffff\1\5\1\6\1\uffff\1\11\14\uffff"+
        "\1\1\5\uffff\1\12\1\15\4\uffff\1\7\12\uffff\1\4\33\uffff\1\22\4"+
        "\uffff\1\16\1\uffff\1\20\3\uffff\1\17\1\21";
    static final String DFA12_specialS =
        "\1\2\21\uffff\1\0\1\1\u0082\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\26\2\25\2\26\1\25\22\26\1\25\1\26\1\22\4\26\1\23\7\26\1"+
            "\24\12\21\7\26\32\20\1\12\1\26\1\13\1\17\1\20\1\26\1\14\2\20"+
            "\1\10\1\7\1\16\1\15\7\20\1\11\1\1\1\20\1\6\1\4\1\20\1\5\5\20"+
            "\1\2\1\26\1\3\uff82\26",
            "\1\27",
            "",
            "",
            "\1\33\17\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "",
            "\1\44",
            "\1\45",
            "\1\46",
            "\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\0\50",
            "\0\50",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "\1\54",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\21\30\1\105\10\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\110",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "",
            "",
            "\1\121",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\127",
            "\1\130",
            "\1\131",
            "\12\30\7\uffff\21\30\1\132\1\133\7\30\4\uffff\1\30\1\uffff"+
            "\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\143",
            "\1\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u008f",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0091",
            "",
            "\1\u0092",
            "",
            "\1\u0093",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_18 = input.LA(1);

                        s = -1;
                        if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFF')) ) {s = 40;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 40;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='p') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='s') ) {s = 4;}

                        else if ( (LA12_0=='u') ) {s = 5;}

                        else if ( (LA12_0=='r') ) {s = 6;}

                        else if ( (LA12_0=='e') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='o') ) {s = 9;}

                        else if ( (LA12_0=='[') ) {s = 10;}

                        else if ( (LA12_0==']') ) {s = 11;}

                        else if ( (LA12_0=='a') ) {s = 12;}

                        else if ( (LA12_0=='g') ) {s = 13;}

                        else if ( (LA12_0=='f') ) {s = 14;}

                        else if ( (LA12_0=='^') ) {s = 15;}

                        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='c')||(LA12_0>='h' && LA12_0<='n')||LA12_0=='q'||LA12_0=='t'||(LA12_0>='v' && LA12_0<='z')) ) {s = 16;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 17;}

                        else if ( (LA12_0=='\"') ) {s = 18;}

                        else if ( (LA12_0=='\'') ) {s = 19;}

                        else if ( (LA12_0=='/') ) {s = 20;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 21;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}