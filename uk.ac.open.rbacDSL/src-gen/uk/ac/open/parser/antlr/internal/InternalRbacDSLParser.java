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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'policy'", "'{'", "'}'", "'scenarios'", "'user'", "'role:'", "'role'", "'extends'", "'ssod:'", "'dsod:'", "'permission:'", "'permission'", "'resource'", "'grantedScenario'", "'user:'", "'resource:'", "'forbiddenScenario'", "'userRoleScenario'", "'resourceRoleScenario'", "'roleScenario'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
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
    public static final int T__30=30;
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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:238:1: ruleScenarios returns [EObject current=null] : (otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* ( (lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario ) )* ( (lv_roleScenarios_5_0= ruleResourceScenario ) )* otherlv_6= '}' ) ;
    public final EObject ruleScenarios() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_userScenarios_2_0 = null;

        EObject lv_userRoleScenarios_3_0 = null;

        EObject lv_resourceRoleScenarios_4_0 = null;

        EObject lv_roleScenarios_5_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:241:28: ( (otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* ( (lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario ) )* ( (lv_roleScenarios_5_0= ruleResourceScenario ) )* otherlv_6= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:242:1: (otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* ( (lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario ) )* ( (lv_roleScenarios_5_0= ruleResourceScenario ) )* otherlv_6= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:242:1: (otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* ( (lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario ) )* ( (lv_roleScenarios_5_0= ruleResourceScenario ) )* otherlv_6= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:242:3: otherlv_0= 'scenarios' otherlv_1= '{' ( (lv_userScenarios_2_0= ruleUserScenario ) )* ( (lv_userRoleScenarios_3_0= ruleUserRoleScenario ) )* ( (lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario ) )* ( (lv_roleScenarios_5_0= ruleResourceScenario ) )* otherlv_6= '}'
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

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:286:3: ( (lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:287:1: (lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:287:1: (lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:288:3: lv_resourceRoleScenarios_4_0= ruleResourceRoleScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenariosAccess().getResourceRoleScenariosResourceRoleScenarioParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceRoleScenario_in_ruleScenarios507);
            	    lv_resourceRoleScenarios_4_0=ruleResourceRoleScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenariosRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"resourceRoleScenarios",
            	            		lv_resourceRoleScenarios_4_0, 
            	            		"ResourceRoleScenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:304:3: ( (lv_roleScenarios_5_0= ruleResourceScenario ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==30) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:305:1: (lv_roleScenarios_5_0= ruleResourceScenario )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:305:1: (lv_roleScenarios_5_0= ruleResourceScenario )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:306:3: lv_roleScenarios_5_0= ruleResourceScenario
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScenariosAccess().getRoleScenariosResourceScenarioParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleResourceScenario_in_ruleScenarios529);
            	    lv_roleScenarios_5_0=ruleResourceScenario();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScenariosRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"roleScenarios",
            	            		lv_roleScenarios_5_0, 
            	            		"ResourceScenario");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleScenarios542); 

                	newLeafNode(otherlv_6, grammarAccess.getScenariosAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:334:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:335:2: (iv_ruleUser= ruleUser EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:336:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser578);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser588); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:343:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) ;
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
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:346:28: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:347:1: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:347:1: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:347:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleUser625); 

                	newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:351:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:352:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:352:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:353:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser642); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUser659); 

                	newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:373:1: (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:373:3: otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUser672); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getRoleKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:377:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:378:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:378:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:379:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUserRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser692); 

            	    		newLeafNode(otherlv_4, grammarAccess.getUserAccess().getRolesRoleCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleUser706); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:402:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:403:2: (iv_ruleRole= ruleRole EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:404:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole742);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole752); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:411:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) ;
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
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:414:28: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:415:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:415:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:415:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleRole789); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:419:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:420:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:420:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:421:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole806); 

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

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:437:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:437:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleRole824); 

                        	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getExtendsKeyword_2_0());
                        
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:441:1: ( (otherlv_3= RULE_ID ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:442:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:442:1: (otherlv_3= RULE_ID )
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:443:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoleRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole844); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getParentRoleCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRole859); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:458:1: (otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:458:3: otherlv_5= 'ssod:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRole872); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getSsodKeyword_4_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:462:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:463:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:463:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:464:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoleRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole892); 

            	    		newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getSsodRoleCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:475:4: (otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:475:6: otherlv_7= 'dsod:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleRole907); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getDsodKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:479:1: ( (otherlv_8= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:480:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:480:1: (otherlv_8= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:481:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoleRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole927); 

            	    		newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getDsodRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:492:4: (otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:492:6: otherlv_9= 'permission:' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleRole942); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getPermissionKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:496:1: ( (otherlv_10= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:497:1: (otherlv_10= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:497:1: (otherlv_10= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:498:3: otherlv_10= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoleRule());
            	    	        }
            	            
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole962); 

            	    		newLeafNode(otherlv_10, grammarAccess.getRoleAccess().getPermissionsPermissionCrossReference_6_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRole976); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:521:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:522:2: (iv_rulePermission= rulePermission EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:523:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission1012);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission1022); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:530:1: rulePermission returns [EObject current=null] : (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:533:28: ( (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:534:1: (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:534:1: (otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:534:3: otherlv_0= 'permission' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePermission1059); 

                	newLeafNode(otherlv_0, grammarAccess.getPermissionAccess().getPermissionKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:538:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:539:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:539:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:540:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission1076); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:564:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:565:2: (iv_ruleResource= ruleResource EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:566:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1117);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1127); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:573:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) ;
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
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:576:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:577:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:577:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:577:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleResource1164); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:581:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:582:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:582:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:583:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1181); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleResource1198); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:603:1: (otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:603:3: otherlv_3= 'permission:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleResource1211); 

            	        	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getPermissionKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:607:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:608:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:608:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:609:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getResourceRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource1231); 

            	    		newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getPermissionsPermissionCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleResource1245); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:632:1: entryRuleUserScenario returns [EObject current=null] : iv_ruleUserScenario= ruleUserScenario EOF ;
    public final EObject entryRuleUserScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:633:2: (iv_ruleUserScenario= ruleUserScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:634:2: iv_ruleUserScenario= ruleUserScenario EOF
            {
             newCompositeNode(grammarAccess.getUserScenarioRule()); 
            pushFollow(FOLLOW_ruleUserScenario_in_entryRuleUserScenario1281);
            iv_ruleUserScenario=ruleUserScenario();

            state._fsp--;

             current =iv_ruleUserScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserScenario1291); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:641:1: ruleUserScenario returns [EObject current=null] : (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario ) ;
    public final EObject ruleUserScenario() throws RecognitionException {
        EObject current = null;

        EObject this_GrantedScenario_0 = null;

        EObject this_ForbiddenScenario_1 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:644:28: ( (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:645:1: (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:645:1: (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:646:5: this_GrantedScenario_0= ruleGrantedScenario
                    {
                     
                            newCompositeNode(grammarAccess.getUserScenarioAccess().getGrantedScenarioParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGrantedScenario_in_ruleUserScenario1338);
                    this_GrantedScenario_0=ruleGrantedScenario();

                    state._fsp--;

                     
                            current = this_GrantedScenario_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:656:5: this_ForbiddenScenario_1= ruleForbiddenScenario
                    {
                     
                            newCompositeNode(grammarAccess.getUserScenarioAccess().getForbiddenScenarioParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForbiddenScenario_in_ruleUserScenario1365);
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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:672:1: entryRuleGrantedScenario returns [EObject current=null] : iv_ruleGrantedScenario= ruleGrantedScenario EOF ;
    public final EObject entryRuleGrantedScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrantedScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:673:2: (iv_ruleGrantedScenario= ruleGrantedScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:674:2: iv_ruleGrantedScenario= ruleGrantedScenario EOF
            {
             newCompositeNode(grammarAccess.getGrantedScenarioRule()); 
            pushFollow(FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario1400);
            iv_ruleGrantedScenario=ruleGrantedScenario();

            state._fsp--;

             current =iv_ruleGrantedScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrantedScenario1410); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:681:1: ruleGrantedScenario returns [EObject current=null] : (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) ;
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
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:684:28: ( (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:685:1: (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:685:1: (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:685:3: otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGrantedScenario1447); 

                	newLeafNode(otherlv_0, grammarAccess.getGrantedScenarioAccess().getGrantedScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:689:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:690:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:690:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:691:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1464); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGrantedScenario1481); 

                	newLeafNode(otherlv_2, grammarAccess.getGrantedScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleGrantedScenario1493); 

                	newLeafNode(otherlv_3, grammarAccess.getGrantedScenarioAccess().getUserKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:715:1: ( (otherlv_4= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:716:1: (otherlv_4= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:716:1: (otherlv_4= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:717:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGrantedScenarioRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1513); 

            		newLeafNode(otherlv_4, grammarAccess.getGrantedScenarioAccess().getUserUserCrossReference_4_0()); 
            	

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:728:2: (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:728:4: otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleGrantedScenario1526); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGrantedScenarioAccess().getRoleKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:732:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:733:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:733:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:734:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGrantedScenarioRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1546); 

            	    		newLeafNode(otherlv_6, grammarAccess.getGrantedScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:745:4: (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+
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
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:745:6: otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleGrantedScenario1561); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGrantedScenarioAccess().getResourceKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:749:1: ( (otherlv_8= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:750:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:750:1: (otherlv_8= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:751:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGrantedScenarioRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1581); 

            	    		newLeafNode(otherlv_8, grammarAccess.getGrantedScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 
            	    	

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

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleGrantedScenario1595); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:774:1: entryRuleForbiddenScenario returns [EObject current=null] : iv_ruleForbiddenScenario= ruleForbiddenScenario EOF ;
    public final EObject entryRuleForbiddenScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbiddenScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:775:2: (iv_ruleForbiddenScenario= ruleForbiddenScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:776:2: iv_ruleForbiddenScenario= ruleForbiddenScenario EOF
            {
             newCompositeNode(grammarAccess.getForbiddenScenarioRule()); 
            pushFollow(FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario1631);
            iv_ruleForbiddenScenario=ruleForbiddenScenario();

            state._fsp--;

             current =iv_ruleForbiddenScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForbiddenScenario1641); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:783:1: ruleForbiddenScenario returns [EObject current=null] : (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) ;
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
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:786:28: ( (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:787:1: (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:787:1: (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:787:3: otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleForbiddenScenario1678); 

                	newLeafNode(otherlv_0, grammarAccess.getForbiddenScenarioAccess().getForbiddenScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:791:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:792:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:792:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:793:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1695); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleForbiddenScenario1712); 

                	newLeafNode(otherlv_2, grammarAccess.getForbiddenScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleForbiddenScenario1724); 

                	newLeafNode(otherlv_3, grammarAccess.getForbiddenScenarioAccess().getUserKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:817:1: ( (otherlv_4= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:818:1: (otherlv_4= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:818:1: (otherlv_4= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:819:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1744); 

            		newLeafNode(otherlv_4, grammarAccess.getForbiddenScenarioAccess().getUserUserCrossReference_4_0()); 
            	

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:830:2: (otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:830:4: otherlv_5= 'role:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleForbiddenScenario1757); 

            	        	newLeafNode(otherlv_5, grammarAccess.getForbiddenScenarioAccess().getRoleKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:834:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:835:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:835:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:836:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1777); 

            	    		newLeafNode(otherlv_6, grammarAccess.getForbiddenScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:847:4: (otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:847:6: otherlv_7= 'resource:' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleForbiddenScenario1792); 

            	        	newLeafNode(otherlv_7, grammarAccess.getForbiddenScenarioAccess().getResourceKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:851:1: ( (otherlv_8= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:852:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:852:1: (otherlv_8= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:853:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1812); 

            	    		newLeafNode(otherlv_8, grammarAccess.getForbiddenScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleForbiddenScenario1826); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:876:1: entryRuleUserRoleScenario returns [EObject current=null] : iv_ruleUserRoleScenario= ruleUserRoleScenario EOF ;
    public final EObject entryRuleUserRoleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserRoleScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:877:2: (iv_ruleUserRoleScenario= ruleUserRoleScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:878:2: iv_ruleUserRoleScenario= ruleUserRoleScenario EOF
            {
             newCompositeNode(grammarAccess.getUserRoleScenarioRule()); 
            pushFollow(FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario1862);
            iv_ruleUserRoleScenario=ruleUserRoleScenario();

            state._fsp--;

             current =iv_ruleUserRoleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserRoleScenario1872); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:885:1: ruleUserRoleScenario returns [EObject current=null] : (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' ) ;
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
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:888:28: ( (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:889:1: (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:889:1: (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:889:3: otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleUserRoleScenario1909); 

                	newLeafNode(otherlv_0, grammarAccess.getUserRoleScenarioAccess().getUserRoleScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:893:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:894:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:894:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:895:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleScenario1926); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUserRoleScenario1943); 

                	newLeafNode(otherlv_2, grammarAccess.getUserRoleScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:915:1: (otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:915:3: otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUserRoleScenario1956); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUserRoleScenarioAccess().getRoleKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:919:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:920:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:920:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:921:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUserRoleScenarioRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleScenario1976); 

            	    		newLeafNode(otherlv_4, grammarAccess.getUserRoleScenarioAccess().getRolesRoleCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleUserRoleScenario1990); 

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


    // $ANTLR start "entryRuleResourceRoleScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:944:1: entryRuleResourceRoleScenario returns [EObject current=null] : iv_ruleResourceRoleScenario= ruleResourceRoleScenario EOF ;
    public final EObject entryRuleResourceRoleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceRoleScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:945:2: (iv_ruleResourceRoleScenario= ruleResourceRoleScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:946:2: iv_ruleResourceRoleScenario= ruleResourceRoleScenario EOF
            {
             newCompositeNode(grammarAccess.getResourceRoleScenarioRule()); 
            pushFollow(FOLLOW_ruleResourceRoleScenario_in_entryRuleResourceRoleScenario2026);
            iv_ruleResourceRoleScenario=ruleResourceRoleScenario();

            state._fsp--;

             current =iv_ruleResourceRoleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceRoleScenario2036); 

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
    // $ANTLR end "entryRuleResourceRoleScenario"


    // $ANTLR start "ruleResourceRoleScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:953:1: ruleResourceRoleScenario returns [EObject current=null] : (otherlv_0= 'resourceRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'resource:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' ) ;
    public final EObject ruleResourceRoleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:956:28: ( (otherlv_0= 'resourceRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'resource:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:957:1: (otherlv_0= 'resourceRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'resource:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:957:1: (otherlv_0= 'resourceRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'resource:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:957:3: otherlv_0= 'resourceRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role:' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'resource:' ( (otherlv_6= RULE_ID ) ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleResourceRoleScenario2073); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceRoleScenarioAccess().getResourceRoleScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:961:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:962:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:962:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:963:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceRoleScenario2090); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRoleScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleResourceRoleScenario2107); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceRoleScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleResourceRoleScenario2119); 

                	newLeafNode(otherlv_3, grammarAccess.getResourceRoleScenarioAccess().getRoleKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:987:1: ( (otherlv_4= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:988:1: (otherlv_4= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:988:1: (otherlv_4= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:989:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRoleScenarioRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceRoleScenario2139); 

            		newLeafNode(otherlv_4, grammarAccess.getResourceRoleScenarioAccess().getRoleRoleCrossReference_4_0()); 
            	

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1000:2: (otherlv_5= 'resource:' ( (otherlv_6= RULE_ID ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1000:4: otherlv_5= 'resource:' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleResourceRoleScenario2152); 

            	        	newLeafNode(otherlv_5, grammarAccess.getResourceRoleScenarioAccess().getResourceKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1004:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1005:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1005:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1006:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getResourceRoleScenarioRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceRoleScenario2172); 

            	    		newLeafNode(otherlv_6, grammarAccess.getResourceRoleScenarioAccess().getResourcesResourceCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleResourceRoleScenario2186); 

                	newLeafNode(otherlv_7, grammarAccess.getResourceRoleScenarioAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleResourceRoleScenario"


    // $ANTLR start "entryRuleResourceScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1029:1: entryRuleResourceScenario returns [EObject current=null] : iv_ruleResourceScenario= ruleResourceScenario EOF ;
    public final EObject entryRuleResourceScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1030:2: (iv_ruleResourceScenario= ruleResourceScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1031:2: iv_ruleResourceScenario= ruleResourceScenario EOF
            {
             newCompositeNode(grammarAccess.getResourceScenarioRule()); 
            pushFollow(FOLLOW_ruleResourceScenario_in_entryRuleResourceScenario2222);
            iv_ruleResourceScenario=ruleResourceScenario();

            state._fsp--;

             current =iv_ruleResourceScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceScenario2232); 

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
    // $ANTLR end "entryRuleResourceScenario"


    // $ANTLR start "ruleResourceScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1038:1: ruleResourceScenario returns [EObject current=null] : (otherlv_0= 'roleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'resource:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' ) ;
    public final EObject ruleResourceScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1041:28: ( (otherlv_0= 'roleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'resource:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1042:1: (otherlv_0= 'roleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'resource:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1042:1: (otherlv_0= 'roleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'resource:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1042:3: otherlv_0= 'roleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'resource:' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleResourceScenario2269); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceScenarioAccess().getRoleScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1046:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1047:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1047:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1048:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceScenario2286); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleResourceScenario2303); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1068:1: (otherlv_3= 'resource:' ( (otherlv_4= RULE_ID ) ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1068:3: otherlv_3= 'resource:' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleResourceScenario2316); 

            	        	newLeafNode(otherlv_3, grammarAccess.getResourceScenarioAccess().getResourceKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1072:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1073:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1073:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1074:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getResourceScenarioRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResourceScenario2336); 

            	    		newLeafNode(otherlv_4, grammarAccess.getResourceScenarioAccess().getResourcesResourceCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleResourceScenario2350); 

                	newLeafNode(otherlv_5, grammarAccess.getResourceScenarioAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleResourceScenario"

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
    public static final BitSet FOLLOW_12_in_ruleScenarios442 = new BitSet(new long[]{0x0000000079002000L});
    public static final BitSet FOLLOW_ruleUserScenario_in_ruleScenarios463 = new BitSet(new long[]{0x0000000079002000L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_ruleScenarios485 = new BitSet(new long[]{0x0000000070002000L});
    public static final BitSet FOLLOW_ruleResourceRoleScenario_in_ruleScenarios507 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_ruleResourceScenario_in_ruleScenarios529 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_13_in_ruleScenarios542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUser625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser642 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUser659 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleUser672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser692 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleUser706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRole789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole806 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_18_in_ruleRole824 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole844 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleRole859 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_19_in_ruleRole872 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole892 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_20_in_ruleRole907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole927 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_21_in_ruleRole942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole962 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleRole976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission1012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePermission1059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleResource1164 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1181 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleResource1198 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21_in_ruleResource1211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource1231 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleResource1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserScenario_in_entryRuleUserScenario1281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserScenario1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_ruleUserScenario1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_ruleUserScenario1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrantedScenario1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGrantedScenario1447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1464 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGrantedScenario1481 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGrantedScenario1493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1513 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleGrantedScenario1526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1546 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleGrantedScenario1561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1581 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_13_in_ruleGrantedScenario1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario1631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForbiddenScenario1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleForbiddenScenario1678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1695 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleForbiddenScenario1712 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleForbiddenScenario1724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1744 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_16_in_ruleForbiddenScenario1757 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1777 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_26_in_ruleForbiddenScenario1792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1812 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_13_in_ruleForbiddenScenario1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleScenario1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleUserRoleScenario1909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleScenario1926 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUserRoleScenario1943 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUserRoleScenario1956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleScenario1976 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleUserRoleScenario1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceRoleScenario_in_entryRuleResourceRoleScenario2026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceRoleScenario2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleResourceRoleScenario2073 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceRoleScenario2090 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleResourceRoleScenario2107 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleResourceRoleScenario2119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceRoleScenario2139 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResourceRoleScenario2152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceRoleScenario2172 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceRoleScenario2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceScenario_in_entryRuleResourceScenario2222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceScenario2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleResourceScenario2269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceScenario2286 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleResourceScenario2303 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleResourceScenario2316 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResourceScenario2336 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_13_in_ruleResourceScenario2350 = new BitSet(new long[]{0x0000000000000002L});

}