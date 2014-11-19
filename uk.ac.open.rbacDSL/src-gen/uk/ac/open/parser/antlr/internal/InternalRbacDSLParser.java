package uk.ac.open.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.open.services.RbacDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRbacDSLParser extends AbstractInternalAntlrParser {
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
    public String getGrammarFileName() { return "../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g"; }



     	private RbacDSLGrammarAccess grammarAccess;
     	
        public InternalRbacDSLParser(TokenStream input, RbacDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Rbac";	
       	}
       	
       	@Override
       	protected RbacDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRbac"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:67:1: entryRuleRbac returns [EObject current=null] : iv_ruleRbac= ruleRbac EOF ;
    public final EObject entryRuleRbac() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRbac = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:68:2: (iv_ruleRbac= ruleRbac EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:69:2: iv_ruleRbac= ruleRbac EOF
            {
             newCompositeNode(grammarAccess.getRbacRule()); 
            pushFollow(FOLLOW_ruleRbac_in_entryRuleRbac75);
            iv_ruleRbac=ruleRbac();

            state._fsp--;

             current =iv_ruleRbac; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRbac85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRbac"


    // $ANTLR start "ruleRbac"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:76:1: ruleRbac returns [EObject current=null] : (otherlv_0= 'Hell' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRbac() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:79:28: ( (otherlv_0= 'Hell' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:1: (otherlv_0= 'Hell' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:1: (otherlv_0= 'Hell' ( (lv_name_1_0= RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:3: otherlv_0= 'Hell' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRbac122); 

                	newLeafNode(otherlv_0, grammarAccess.getRbacAccess().getHellKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:85:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRbac139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRbacAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRbacRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRbac"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRbac_in_entryRuleRbac75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRbac85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRbac122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRbac139 = new BitSet(new long[]{0x0000000000000002L});

}