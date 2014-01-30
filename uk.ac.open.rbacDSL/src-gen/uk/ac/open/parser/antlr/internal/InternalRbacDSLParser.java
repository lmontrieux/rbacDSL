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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'policy'", "'{'", "'}'", "'scenarios'", "'user'", "'role:'", "'role'", "'extends'", "'ssod:'", "'dsod:'", "'permission:'", "'permission'", "'resource'", "'grantedScenario'", "'user:'", "'resource:'", "'forbiddenScenario'", "'userRoleScenario'"
    };
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:76:1: ruleRbac returns [EObject current=null] : ( ( (lv_policy_0_0= rulePolicy ) ) ( (lv_scenarios_1_0= ruleScenarios ) ) ) ;
    public final EObject ruleRbac() throws RecognitionException {
        EObject current = null;

        EObject lv_policy_0_0 = null;

        EObject lv_scenarios_1_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:79:28: ( ( ( (lv_policy_0_0= rulePolicy ) ) ( (lv_scenarios_1_0= ruleScenarios ) ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:1: ( ( (lv_policy_0_0= rulePolicy ) ) ( (lv_scenarios_1_0= ruleScenarios ) ) )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:1: ( ( (lv_policy_0_0= rulePolicy ) ) ( (lv_scenarios_1_0= ruleScenarios ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:2: ( (lv_policy_0_0= rulePolicy ) ) ( (lv_scenarios_1_0= ruleScenarios ) )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:2: ( (lv_policy_0_0= rulePolicy ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:81:1: (lv_policy_0_0= rulePolicy )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:81:1: (lv_policy_0_0= rulePolicy )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:82:3: lv_policy_0_0= rulePolicy
            {
             
            	        newCompositeNode(grammarAccess.getRbacAccess().getPolicyPolicyParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePolicy_in_ruleRbac131);
            lv_policy_0_0=rulePolicy();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRbacRule());
            	        }
                   		set(
                   			current, 
                   			"policy",
                    		lv_policy_0_0, 
                    		"Policy");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:98:2: ( (lv_scenarios_1_0= ruleScenarios ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:99:1: (lv_scenarios_1_0= ruleScenarios )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:99:1: (lv_scenarios_1_0= ruleScenarios )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:100:3: lv_scenarios_1_0= ruleScenarios
            {
             
            	        newCompositeNode(grammarAccess.getRbacAccess().getScenariosScenariosParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleScenarios_in_ruleRbac152);
            lv_scenarios_1_0=ruleScenarios();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRbacRule());
            	        }
                   		set(
                   			current, 
                   			"scenarios",
                    		lv_scenarios_1_0, 
                    		"Scenarios");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRulePolicy"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:124:1: entryRulePolicy returns [EObject current=null] : iv_rulePolicy= rulePolicy EOF ;
    public final EObject entryRulePolicy() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicy = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:125:2: (iv_rulePolicy= rulePolicy EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:126:2: iv_rulePolicy= rulePolicy EOF
            {
             newCompositeNode(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy188);
            iv_rulePolicy=rulePolicy();

            state._fsp--;

             current =iv_rulePolicy; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy198); 

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
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:133:1: rulePolicy returns [EObject current=null] : (otherlv_0= 'policy' otherlv_1= '{' ( (lv_users_2_0= ruleUser ) )* ( (lv_roles_3_0= ruleRole ) )* ( (lv_permissions_4_0= rulePermission ) )* ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' ) ;
    public final EObject rulePolicy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_users_2_0 = null;

        EObject lv_roles_3_0 = null;

        EObject lv_permissions_4_0 = null;

        EObject lv_resources_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:136:28: ( (otherlv_0= 'policy' otherlv_1= '{' ( (lv_users_2_0= ruleUser ) )* ( (lv_roles_3_0= ruleRole ) )* ( (lv_permissions_4_0= rulePermission ) )* ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:137:1: (otherlv_0= 'policy' otherlv_1= '{' ( (lv_users_2_0= ruleUser ) )* ( (lv_roles_3_0= ruleRole ) )* ( (lv_permissions_4_0= rulePermission ) )* ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:137:1: (otherlv_0= 'policy' otherlv_1= '{' ( (lv_users_2_0= ruleUser ) )* ( (lv_roles_3_0= ruleRole ) )* ( (lv_permissions_4_0= rulePermission ) )* ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:137:3: otherlv_0= 'policy' otherlv_1= '{' ( (lv_users_2_0= ruleUser ) )* ( (lv_roles_3_0= ruleRole ) )* ( (lv_permissions_4_0= rulePermission ) )* ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePolicy235); 

                	newLeafNode(otherlv_0, grammarAccess.getPolicyAccess().getPolicyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePolicy247); 

                	newLeafNode(otherlv_1, grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:145:1: ( (lv_users_2_0= ruleUser ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:146:1: (lv_users_2_0= ruleUser )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:146:1: (lv_users_2_0= ruleUser )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:147:3: lv_users_2_0= ruleUser
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getUsersUserParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUser_in_rulePolicy268);
            	    lv_users_2_0=ruleUser();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"users",
            	            		lv_users_2_0, 
            	            		"User");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:163:3: ( (lv_roles_3_0= ruleRole ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:164:1: (lv_roles_3_0= ruleRole )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:164:1: (lv_roles_3_0= ruleRole )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:165:3: lv_roles_3_0= ruleRole
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getRolesRoleParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRole_in_rulePolicy290);
            	    lv_roles_3_0=ruleRole();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roles",
            	            		lv_roles_3_0, 
            	            		"Role");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:181:3: ( (lv_permissions_4_0= rulePermission ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:182:1: (lv_permissions_4_0= rulePermission )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:182:1: (lv_permissions_4_0= rulePermission )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:183:3: lv_permissions_4_0= rulePermission
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getPermissionsPermissionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePermission_in_rulePolicy312);
            	    lv_permissions_4_0=rulePermission();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"permissions",
            	            		lv_permissions_4_0, 
            	            		"Permission");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:199:3: ( (lv_resources_5_0= ruleResource ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:200:1: (lv_resources_5_0= ruleResource )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:200:1: (lv_resources_5_0= ruleResource )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:201:3: lv_resources_5_0= ruleResource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPolicyAccess().getResourcesResourceParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResource_in_rulePolicy334);
            	    lv_resources_5_0=ruleResource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPolicyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resources",
            	            		lv_resources_5_0, 
            	            		"Resource");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePolicy347); 

                	newLeafNode(otherlv_6, grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleScenarios"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:229:1: entryRuleScenarios returns [EObject current=null] : iv_ruleScenarios= ruleScenarios EOF ;
    public final EObject entryRuleScenarios() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarios = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:230:2: (iv_ruleScenarios= ruleScenarios EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:231:2: iv_ruleScenarios= ruleScenarios EOF
            {
             newCompositeNode(grammarAccess.getScenariosRule()); 
            pushFollow(FOLLOW_ruleScenarios_in_entryRuleScenarios383);
            iv_ruleScenarios=ruleScenarios();

            state._fsp--;

             current =iv_ruleScenarios; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarios393); 

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
    // $ANTLR end "entryRuleScenarios"


    // $ANTLR start "ruleScenarios"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:238:1: ruleScenarios returns [EObject current=null] : (otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* otherlv_4= '}' ) ;
    public final EObject ruleScenarios() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_userScenarios_2_0 = null;

        EObject lv_userRoleScenarios_3_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:241:28: ( (otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* otherlv_4= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:242:1: (otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* otherlv_4= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:242:1: (otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* otherlv_4= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:242:3: otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleScenarios430); 

                	newLeafNode(otherlv_0, grammarAccess.getScenariosAccess().getScenariosKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleScenarios442); 

                	newLeafNode(otherlv_1, grammarAccess.getScenariosAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:250:1: ( (lv_userScenarios_2_0= ruleUserScenario ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:251:1: (lv_userScenarios_2_0= ruleUserScenario )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:251:1: (lv_userScenarios_2_0= ruleUserScenario )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:252:3: lv_userScenarios_2_0= ruleUserScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenariosAccess().getUserScenariosUserScenarioParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUserScenario_in_ruleScenarios463);
            	    lv_userScenarios_2_0=ruleUserScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenariosRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"userScenarios",
            	            		lv_userScenarios_2_0, 
            	            		"UserScenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:268:3: ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:269:1: (lv_userRoleScenarios_3_0= ruleUserRoleScenario )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:269:1: (lv_userRoleScenarios_3_0= ruleUserRoleScenario )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:270:3: lv_userRoleScenarios_3_0= ruleUserRoleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenariosAccess().getUserRoleScenariosUserRoleScenarioParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUserRoleScenario_in_ruleScenarios485);
            	    lv_userRoleScenarios_3_0=ruleUserRoleScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenariosRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"userRoleScenarios",
            	            		lv_userRoleScenarios_3_0, 
            	            		"UserRoleScenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleScenarios498); 

                	newLeafNode(otherlv_4, grammarAccess.getScenariosAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleScenarios"


    // $ANTLR start "entryRuleUser"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:298:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:299:2: (iv_ruleUser= ruleUser EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:300:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser534);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser544); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:307:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleUser() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:310:28: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:311:1: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:311:1: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:311:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleUser581); 

                	newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:315:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:316:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:316:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:317:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser598); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUser615); 

                	newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:337:1: (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:337:3: otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUser628); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getRoleKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:341:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:342:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:342:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:343:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUserRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser648); 

            	    		newLeafNode(otherlv_4, grammarAccess.getUserAccess().getRolesRoleCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleUser662); 

                	newLeafNode(otherlv_5, grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleRole"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:366:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:367:2: (iv_ruleRole= ruleRole EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:368:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole698);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole708); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:375:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:378:28: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:379:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:379:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:379:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRole745); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:383:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:384:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:384:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:385:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole762); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:401:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:401:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRole780); 

                        	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getExtendsKeyword_2_0());
                        
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:405:1: ( (otherlv_3= RULE_ID ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:406:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:406:1: (otherlv_3= RULE_ID )
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:407:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoleRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole800); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getParentRoleCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRole815); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:422:1: (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:422:3: otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRole828); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getSsodKeyword_4_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:426:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:427:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:427:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:428:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoleRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole848); 

            	    		newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getSsodRoleCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:439:4: (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:439:6: otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleRole863); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getDsodKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:443:1: ( (otherlv_8= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:444:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:444:1: (otherlv_8= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:445:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoleRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole883); 

            	    		newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getDsodRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:456:4: (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:456:6: otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleRole898); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getPermissionKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:460:1: ( (otherlv_10= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:461:1: (otherlv_10= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:461:1: (otherlv_10= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:462:3: otherlv_10= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoleRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole918); 

            	    		newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getPermissionsPermissionCrossReference_6_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRole932); 

                	newLeafNode(otherlv_11, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRulePermission"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:485:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:486:2: (iv_rulePermission= rulePermission EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:487:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission968);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission978); 

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
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:494:1: rulePermission returns [EObject current=null] : (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:497:28: ( (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:498:1: (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:498:1: (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:498:3: otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePermission1015); 

                	newLeafNode(otherlv_0, grammarAccess.getPermissionAccess().getPermissionKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:502:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:503:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:503:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:504:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission1032); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPermissionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPermissionRule());
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
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleResource"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:528:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:529:2: (iv_ruleResource= ruleResource EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:530:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1073);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1083); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:537:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:540:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:541:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:541:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:541:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleResource1120); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:545:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:546:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:546:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:547:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1137); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleResource1154); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:567:1: (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:567:3: otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleResource1167); 

            	        	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getPermissionKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:571:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:572:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:572:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:573:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getResourceRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1187); 

            	    		newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getPermissionsPermissionCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleResource1201); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleUserScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:596:1: entryRuleUserScenario returns [EObject current=null] : iv_ruleUserScenario= ruleUserScenario EOF ;
    public final EObject entryRuleUserScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:597:2: (iv_ruleUserScenario= ruleUserScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:598:2: iv_ruleUserScenario= ruleUserScenario EOF
            {
             newCompositeNode(grammarAccess.getUserScenarioRule()); 
            pushFollow(FOLLOW_ruleUserScenario_in_entryRuleUserScenario1237);
            iv_ruleUserScenario=ruleUserScenario();

            state._fsp--;

             current =iv_ruleUserScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserScenario1247); 

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
    // $ANTLR end "entryRuleUserScenario"


    // $ANTLR start "ruleUserScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:605:1: ruleUserScenario returns [EObject current=null] : (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario ) ;
    public final EObject ruleUserScenario() throws RecognitionException {
        EObject current = null;

        EObject this_GrantedScenario_0 = null;

        EObject this_ForbiddenScenario_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:608:28: ( (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:609:1: (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:609:1: (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:610:5: this_GrantedScenario_0= ruleGrantedScenario
                    {
                     
                            newCompositeNode(grammarAccess.getUserScenarioAccess().getGrantedScenarioParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGrantedScenario_in_ruleUserScenario1294);
                    this_GrantedScenario_0=ruleGrantedScenario();

                    state._fsp--;

                     
                            current = this_GrantedScenario_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:620:5: this_ForbiddenScenario_1= ruleForbiddenScenario
                    {
                     
                            newCompositeNode(grammarAccess.getUserScenarioAccess().getForbiddenScenarioParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForbiddenScenario_in_ruleUserScenario1321);
                    this_ForbiddenScenario_1=ruleForbiddenScenario();

                    state._fsp--;

                     
                            current = this_ForbiddenScenario_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleUserScenario"


    // $ANTLR start "entryRuleGrantedScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:636:1: entryRuleGrantedScenario returns [EObject current=null] : iv_ruleGrantedScenario= ruleGrantedScenario EOF ;
    public final EObject entryRuleGrantedScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrantedScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:637:2: (iv_ruleGrantedScenario= ruleGrantedScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:638:2: iv_ruleGrantedScenario= ruleGrantedScenario EOF
            {
             newCompositeNode(grammarAccess.getGrantedScenarioRule()); 
            pushFollow(FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario1356);
            iv_ruleGrantedScenario=ruleGrantedScenario();

            state._fsp--;

             current =iv_ruleGrantedScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrantedScenario1366); 

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
    // $ANTLR end "entryRuleGrantedScenario"


    // $ANTLR start "ruleGrantedScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:645:1: ruleGrantedScenario returns [EObject current=null] : (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) ;
    public final EObject ruleGrantedScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:648:28: ( (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:649:1: (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:649:1: (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:649:3: otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGrantedScenario1403); 

                	newLeafNode(otherlv_0, grammarAccess.getGrantedScenarioAccess().getGrantedScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:653:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:654:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:654:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:655:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1420); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGrantedScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGrantedScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGrantedScenario1437); 

                	newLeafNode(otherlv_2, grammarAccess.getGrantedScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleGrantedScenario1449); 

                	newLeafNode(otherlv_3, grammarAccess.getGrantedScenarioAccess().getUserKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:679:1: ( (otherlv_4= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:680:1: (otherlv_4= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:680:1: (otherlv_4= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:681:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGrantedScenarioRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1469); 

            		newLeafNode(otherlv_4, grammarAccess.getGrantedScenarioAccess().getUserUserCrossReference_4_0()); 
            	

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:692:2: (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:692:4: otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleGrantedScenario1482); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGrantedScenarioAccess().getRoleKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:696:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:697:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:697:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:698:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGrantedScenarioRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1502); 

            	    		newLeafNode(otherlv_6, grammarAccess.getGrantedScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:709:4: (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:709:6: otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleGrantedScenario1517); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGrantedScenarioAccess().getResourceKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:713:1: ( (otherlv_8= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:714:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:714:1: (otherlv_8= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:715:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGrantedScenarioRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1537); 

            	    		newLeafNode(otherlv_8, grammarAccess.getGrantedScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleGrantedScenario1551); 

                	newLeafNode(otherlv_9, grammarAccess.getGrantedScenarioAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleGrantedScenario"


    // $ANTLR start "entryRuleForbiddenScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:738:1: entryRuleForbiddenScenario returns [EObject current=null] : iv_ruleForbiddenScenario= ruleForbiddenScenario EOF ;
    public final EObject entryRuleForbiddenScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbiddenScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:739:2: (iv_ruleForbiddenScenario= ruleForbiddenScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:740:2: iv_ruleForbiddenScenario= ruleForbiddenScenario EOF
            {
             newCompositeNode(grammarAccess.getForbiddenScenarioRule()); 
            pushFollow(FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario1587);
            iv_ruleForbiddenScenario=ruleForbiddenScenario();

            state._fsp--;

             current =iv_ruleForbiddenScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForbiddenScenario1597); 

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
    // $ANTLR end "entryRuleForbiddenScenario"


    // $ANTLR start "ruleForbiddenScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:747:1: ruleForbiddenScenario returns [EObject current=null] : (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) ;
    public final EObject ruleForbiddenScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:750:28: ( (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:751:1: (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:751:1: (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:751:3: otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleForbiddenScenario1634); 

                	newLeafNode(otherlv_0, grammarAccess.getForbiddenScenarioAccess().getForbiddenScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:755:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:756:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:756:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:757:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1651); 

            			newLeafNode(lv_name_1_0, grammarAccess.getForbiddenScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleForbiddenScenario1668); 

                	newLeafNode(otherlv_2, grammarAccess.getForbiddenScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleForbiddenScenario1680); 

                	newLeafNode(otherlv_3, grammarAccess.getForbiddenScenarioAccess().getUserKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:781:1: ( (otherlv_4= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:782:1: (otherlv_4= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:782:1: (otherlv_4= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:783:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1700); 

            		newLeafNode(otherlv_4, grammarAccess.getForbiddenScenarioAccess().getUserUserCrossReference_4_0()); 
            	

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:794:2: (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:794:4: otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleForbiddenScenario1713); 

            	        	newLeafNode(otherlv_5, grammarAccess.getForbiddenScenarioAccess().getRoleKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:798:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:799:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:799:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:800:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1733); 

            	    		newLeafNode(otherlv_6, grammarAccess.getForbiddenScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:811:4: (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:811:6: otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleForbiddenScenario1748); 

            	        	newLeafNode(otherlv_7, grammarAccess.getForbiddenScenarioAccess().getResourceKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:815:1: ( (otherlv_8= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:816:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:816:1: (otherlv_8= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:817:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1768); 

            	    		newLeafNode(otherlv_8, grammarAccess.getForbiddenScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleForbiddenScenario1782); 

                	newLeafNode(otherlv_9, grammarAccess.getForbiddenScenarioAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleForbiddenScenario"


    // $ANTLR start "entryRuleUserRoleScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:840:1: entryRuleUserRoleScenario returns [EObject current=null] : iv_ruleUserRoleScenario= ruleUserRoleScenario EOF ;
    public final EObject entryRuleUserRoleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserRoleScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:841:2: (iv_ruleUserRoleScenario= ruleUserRoleScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:842:2: iv_ruleUserRoleScenario= ruleUserRoleScenario EOF
            {
             newCompositeNode(grammarAccess.getUserRoleScenarioRule()); 
            pushFollow(FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario1818);
            iv_ruleUserRoleScenario=ruleUserRoleScenario();

            state._fsp--;

             current =iv_ruleUserRoleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserRoleScenario1828); 

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
    // $ANTLR end "entryRuleUserRoleScenario"


    // $ANTLR start "ruleUserRoleScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:849:1: ruleUserRoleScenario returns [EObject current=null] : (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' ) ;
    public final EObject ruleUserRoleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:852:28: ( (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:853:1: (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:853:1: (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:853:3: otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleUserRoleScenario1865); 

                	newLeafNode(otherlv_0, grammarAccess.getUserRoleScenarioAccess().getUserRoleScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:857:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:858:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:858:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:859:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleScenario1882); 

            			newLeafNode(lv_name_1_0, grammarAccess.getUserRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUserRoleScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUserRoleScenario1899); 

                	newLeafNode(otherlv_2, grammarAccess.getUserRoleScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:879:1: (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:879:3: otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUserRoleScenario1912); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUserRoleScenarioAccess().getRoleKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:883:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:884:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:884:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:885:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUserRoleScenarioRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleScenario1932); 

            	    		newLeafNode(otherlv_4, grammarAccess.getUserRoleScenarioAccess().getRolesRoleCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleUserRoleScenario1946); 

                	newLeafNode(otherlv_5, grammarAccess.getUserRoleScenarioAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleUserRoleScenario"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRbac_in_entryRuleRbac75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRbac85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_ruleRbac131 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleScenarios_in_ruleRbac152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePolicy235 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePolicy247 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_ruleUser_in_rulePolicy268 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_ruleRole_in_rulePolicy290 = new BitSet(new long[]{0x0000000000C22000L});
    public static final BitSet FOLLOW_rulePermission_in_rulePolicy312 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_ruleResource_in_rulePolicy334 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_rulePolicy347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarios_in_entryRuleScenarios383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarios393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleScenarios430 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleScenarios442 = new BitSet(new long[]{0x0000000019002000L});
    public static final BitSet FOLLOW_ruleUserScenario_in_ruleScenarios463 = new BitSet(new long[]{0x0000000019002000L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_ruleScenarios485 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_ruleScenarios498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUser581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser598 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUser615 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleUser628 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser648 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleUser662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRole745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole762 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_18_in_ruleRole780 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole800 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleRole815 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_19_in_ruleRole828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole848 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_20_in_ruleRole863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole883 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_21_in_ruleRole898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole918 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleRole932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePermission1015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleResource1120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleResource1154 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21_in_ruleResource1167 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1187 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleResource1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserScenario_in_entryRuleUserScenario1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserScenario1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_ruleUserScenario1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_ruleUserScenario1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario1356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrantedScenario1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGrantedScenario1403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1420 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGrantedScenario1437 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGrantedScenario1449 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1469 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleGrantedScenario1482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1502 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleGrantedScenario1517 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1537 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_13_in_ruleGrantedScenario1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForbiddenScenario1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleForbiddenScenario1634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1651 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleForbiddenScenario1668 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleForbiddenScenario1680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1700 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleForbiddenScenario1713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1733 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleForbiddenScenario1748 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1768 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_13_in_ruleForbiddenScenario1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario1818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleScenario1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUserRoleScenario1865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleScenario1882 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUserRoleScenario1899 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUserRoleScenario1912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleScenario1932 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleUserRoleScenario1946 = new BitSet(new long[]{0x0000000000000002L});

}