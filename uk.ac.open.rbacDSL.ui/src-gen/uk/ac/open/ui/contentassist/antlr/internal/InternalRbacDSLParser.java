package uk.ac.open.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import uk.ac.open.services.RbacDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRbacDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hell'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRbacDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRbacDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRbacDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g"; }


     
     	private RbacDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RbacDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleRbac"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:60:1: entryRuleRbac : ruleRbac EOF ;
    public final void entryRuleRbac() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:61:1: ( ruleRbac EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:62:1: ruleRbac EOF
            {
             before(grammarAccess.getRbacRule()); 
            pushFollow(FOLLOW_ruleRbac_in_entryRuleRbac61);
            ruleRbac();

            state._fsp--;

             after(grammarAccess.getRbacRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRbac68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRbac"


    // $ANTLR start "ruleRbac"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:69:1: ruleRbac : ( ( rule__Rbac__Group__0 ) ) ;
    public final void ruleRbac() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:73:2: ( ( ( rule__Rbac__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:74:1: ( ( rule__Rbac__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:74:1: ( ( rule__Rbac__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:75:1: ( rule__Rbac__Group__0 )
            {
             before(grammarAccess.getRbacAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:76:1: ( rule__Rbac__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:76:2: rule__Rbac__Group__0
            {
            pushFollow(FOLLOW_rule__Rbac__Group__0_in_ruleRbac94);
            rule__Rbac__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRbacAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRbac"


    // $ANTLR start "rule__Rbac__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:90:1: rule__Rbac__Group__0 : rule__Rbac__Group__0__Impl rule__Rbac__Group__1 ;
    public final void rule__Rbac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:94:1: ( rule__Rbac__Group__0__Impl rule__Rbac__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:95:2: rule__Rbac__Group__0__Impl rule__Rbac__Group__1
            {
            pushFollow(FOLLOW_rule__Rbac__Group__0__Impl_in_rule__Rbac__Group__0128);
            rule__Rbac__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__1_in_rule__Rbac__Group__0131);
            rule__Rbac__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rbac__Group__0"


    // $ANTLR start "rule__Rbac__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:102:1: rule__Rbac__Group__0__Impl : ( 'Hell' ) ;
    public final void rule__Rbac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:106:1: ( ( 'Hell' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:107:1: ( 'Hell' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:107:1: ( 'Hell' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:108:1: 'Hell'
            {
             before(grammarAccess.getRbacAccess().getHellKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Rbac__Group__0__Impl159); 
             after(grammarAccess.getRbacAccess().getHellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rbac__Group__0__Impl"


    // $ANTLR start "rule__Rbac__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:121:1: rule__Rbac__Group__1 : rule__Rbac__Group__1__Impl ;
    public final void rule__Rbac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:125:1: ( rule__Rbac__Group__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:126:2: rule__Rbac__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rbac__Group__1__Impl_in_rule__Rbac__Group__1190);
            rule__Rbac__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rbac__Group__1"


    // $ANTLR start "rule__Rbac__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:132:1: rule__Rbac__Group__1__Impl : ( ( rule__Rbac__NameAssignment_1 ) ) ;
    public final void rule__Rbac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:136:1: ( ( ( rule__Rbac__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:137:1: ( ( rule__Rbac__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:137:1: ( ( rule__Rbac__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:138:1: ( rule__Rbac__NameAssignment_1 )
            {
             before(grammarAccess.getRbacAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:139:1: ( rule__Rbac__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:139:2: rule__Rbac__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rbac__NameAssignment_1_in_rule__Rbac__Group__1__Impl217);
            rule__Rbac__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRbacAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rbac__Group__1__Impl"


    // $ANTLR start "rule__Rbac__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:154:1: rule__Rbac__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rbac__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:158:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:159:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:159:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:160:1: RULE_ID
            {
             before(grammarAccess.getRbacAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rbac__NameAssignment_1256); 
             after(grammarAccess.getRbacAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rbac__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRbac_in_entryRuleRbac61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRbac68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__0_in_ruleRbac94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__0__Impl_in_rule__Rbac__Group__0128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rbac__Group__1_in_rule__Rbac__Group__0131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Rbac__Group__0__Impl159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__1__Impl_in_rule__Rbac__Group__1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__NameAssignment_1_in_rule__Rbac__Group__1__Impl217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rbac__NameAssignment_1256 = new BitSet(new long[]{0x0000000000000002L});

}