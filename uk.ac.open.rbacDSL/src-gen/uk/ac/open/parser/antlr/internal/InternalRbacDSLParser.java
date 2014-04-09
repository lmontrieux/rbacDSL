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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'policy'", "'{'", "'}'", "'scenarios'", "'user'", "'role'", "'extends'", "'ssod'", "'dsod'", "'object'", "'['", "']'", "'action'", "'grantedScenario'", "'forbiddenScenario'", "'userRoleScenario'", "'objectRoleScenario'", "'objectScenario'"
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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:76:1: ruleRbac returns [EObject current=null] : (otherlv_0= 'policy' otherlv_1= '{' ( (lv_policyElements_2_0= rulePolicyElement ) )* otherlv_3= '}' otherlv_4= 'scenarios' otherlv_5= '{' ( (lv_scenarioElements_6_0= ruleScenarioElement ) )* otherlv_7= '}' ) ;
    public final EObject ruleRbac() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_policyElements_2_0 = null;

        EObject lv_scenarioElements_6_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:79:28: ( (otherlv_0= 'policy' otherlv_1= '{' ( (lv_policyElements_2_0= rulePolicyElement ) )* otherlv_3= '}' otherlv_4= 'scenarios' otherlv_5= '{' ( (lv_scenarioElements_6_0= ruleScenarioElement ) )* otherlv_7= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:1: (otherlv_0= 'policy' otherlv_1= '{' ( (lv_policyElements_2_0= rulePolicyElement ) )* otherlv_3= '}' otherlv_4= 'scenarios' otherlv_5= '{' ( (lv_scenarioElements_6_0= ruleScenarioElement ) )* otherlv_7= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:1: (otherlv_0= 'policy' otherlv_1= '{' ( (lv_policyElements_2_0= rulePolicyElement ) )* otherlv_3= '}' otherlv_4= 'scenarios' otherlv_5= '{' ( (lv_scenarioElements_6_0= ruleScenarioElement ) )* otherlv_7= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:80:3: otherlv_0= 'policy' otherlv_1= '{' ( (lv_policyElements_2_0= rulePolicyElement ) )* otherlv_3= '}' otherlv_4= 'scenarios' otherlv_5= '{' ( (lv_scenarioElements_6_0= ruleScenarioElement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRbac122); 

                	newLeafNode(otherlv_0, grammarAccess.getRbacAccess().getPolicyKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleRbac134); 

                	newLeafNode(otherlv_1, grammarAccess.getRbacAccess().getLeftCurlyBracketKeyword_1());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:88:1: ( (lv_policyElements_2_0= rulePolicyElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=15 && LA1_0<=16)||LA1_0==20||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:89:1: (lv_policyElements_2_0= rulePolicyElement )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:89:1: (lv_policyElements_2_0= rulePolicyElement )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:90:3: lv_policyElements_2_0= rulePolicyElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRbacAccess().getPolicyElementsPolicyElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePolicyElement_in_ruleRbac155);
            	    lv_policyElements_2_0=rulePolicyElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRbacRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"policyElements",
            	            		lv_policyElements_2_0, 
            	            		"PolicyElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRbac168); 

                	newLeafNode(otherlv_3, grammarAccess.getRbacAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleRbac180); 

                	newLeafNode(otherlv_4, grammarAccess.getRbacAccess().getScenariosKeyword_4());
                
            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleRbac192); 

                	newLeafNode(otherlv_5, grammarAccess.getRbacAccess().getLeftCurlyBracketKeyword_5());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:118:1: ( (lv_scenarioElements_6_0= ruleScenarioElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=24 && LA2_0<=28)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:119:1: (lv_scenarioElements_6_0= ruleScenarioElement )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:119:1: (lv_scenarioElements_6_0= ruleScenarioElement )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:120:3: lv_scenarioElements_6_0= ruleScenarioElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRbacAccess().getScenarioElementsScenarioElementParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScenarioElement_in_ruleRbac213);
            	    lv_scenarioElements_6_0=ruleScenarioElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRbacRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scenarioElements",
            	            		lv_scenarioElements_6_0, 
            	            		"ScenarioElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleRbac226); 

                	newLeafNode(otherlv_7, grammarAccess.getRbacAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRulePolicyElement"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:148:1: entryRulePolicyElement returns [EObject current=null] : iv_rulePolicyElement= rulePolicyElement EOF ;
    public final EObject entryRulePolicyElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolicyElement = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:149:2: (iv_rulePolicyElement= rulePolicyElement EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:150:2: iv_rulePolicyElement= rulePolicyElement EOF
            {
             newCompositeNode(grammarAccess.getPolicyElementRule()); 
            pushFollow(FOLLOW_rulePolicyElement_in_entryRulePolicyElement262);
            iv_rulePolicyElement=rulePolicyElement();

            state._fsp--;

             current =iv_rulePolicyElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicyElement272); 

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
    // $ANTLR end "entryRulePolicyElement"


    // $ANTLR start "rulePolicyElement"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:157:1: rulePolicyElement returns [EObject current=null] : (this_User_0= ruleUser | this_Role_1= ruleRole | this_Permission_2= rulePermission | this_RBACObject_3= ruleRBACObject ) ;
    public final EObject rulePolicyElement() throws RecognitionException {
        EObject current = null;

        EObject this_User_0 = null;

        EObject this_Role_1 = null;

        EObject this_Permission_2 = null;

        EObject this_RBACObject_3 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:160:28: ( (this_User_0= ruleUser | this_Role_1= ruleRole | this_Permission_2= rulePermission | this_RBACObject_3= ruleRBACObject ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:161:1: (this_User_0= ruleUser | this_Role_1= ruleRole | this_Permission_2= rulePermission | this_RBACObject_3= ruleRBACObject )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:161:1: (this_User_0= ruleUser | this_Role_1= ruleRole | this_Permission_2= rulePermission | this_RBACObject_3= ruleRBACObject )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 20:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:162:5: this_User_0= ruleUser
                    {
                     
                            newCompositeNode(grammarAccess.getPolicyElementAccess().getUserParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleUser_in_rulePolicyElement319);
                    this_User_0=ruleUser();

                    state._fsp--;

                     
                            current = this_User_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:172:5: this_Role_1= ruleRole
                    {
                     
                            newCompositeNode(grammarAccess.getPolicyElementAccess().getRoleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRole_in_rulePolicyElement346);
                    this_Role_1=ruleRole();

                    state._fsp--;

                     
                            current = this_Role_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:182:5: this_Permission_2= rulePermission
                    {
                     
                            newCompositeNode(grammarAccess.getPolicyElementAccess().getPermissionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePermission_in_rulePolicyElement373);
                    this_Permission_2=rulePermission();

                    state._fsp--;

                     
                            current = this_Permission_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:192:5: this_RBACObject_3= ruleRBACObject
                    {
                     
                            newCompositeNode(grammarAccess.getPolicyElementAccess().getRBACObjectParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRBACObject_in_rulePolicyElement400);
                    this_RBACObject_3=ruleRBACObject();

                    state._fsp--;

                     
                            current = this_RBACObject_3; 
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
    // $ANTLR end "rulePolicyElement"


    // $ANTLR start "entryRuleScenarioElement"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:208:1: entryRuleScenarioElement returns [EObject current=null] : iv_ruleScenarioElement= ruleScenarioElement EOF ;
    public final EObject entryRuleScenarioElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenarioElement = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:209:2: (iv_ruleScenarioElement= ruleScenarioElement EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:210:2: iv_ruleScenarioElement= ruleScenarioElement EOF
            {
             newCompositeNode(grammarAccess.getScenarioElementRule()); 
            pushFollow(FOLLOW_ruleScenarioElement_in_entryRuleScenarioElement435);
            iv_ruleScenarioElement=ruleScenarioElement();

            state._fsp--;

             current =iv_ruleScenarioElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarioElement445); 

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
    // $ANTLR end "entryRuleScenarioElement"


    // $ANTLR start "ruleScenarioElement"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:217:1: ruleScenarioElement returns [EObject current=null] : (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario | this_UserRoleScenario_2= ruleUserRoleScenario | this_ObjectRoleScenario_3= ruleObjectRoleScenario | this_ObjectScenario_4= ruleObjectScenario ) ;
    public final EObject ruleScenarioElement() throws RecognitionException {
        EObject current = null;

        EObject this_GrantedScenario_0 = null;

        EObject this_ForbiddenScenario_1 = null;

        EObject this_UserRoleScenario_2 = null;

        EObject this_ObjectRoleScenario_3 = null;

        EObject this_ObjectScenario_4 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:220:28: ( (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario | this_UserRoleScenario_2= ruleUserRoleScenario | this_ObjectRoleScenario_3= ruleObjectRoleScenario | this_ObjectScenario_4= ruleObjectScenario ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:221:1: (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario | this_UserRoleScenario_2= ruleUserRoleScenario | this_ObjectRoleScenario_3= ruleObjectRoleScenario | this_ObjectScenario_4= ruleObjectScenario )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:221:1: (this_GrantedScenario_0= ruleGrantedScenario | this_ForbiddenScenario_1= ruleForbiddenScenario | this_UserRoleScenario_2= ruleUserRoleScenario | this_ObjectRoleScenario_3= ruleObjectRoleScenario | this_ObjectScenario_4= ruleObjectScenario )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            case 28:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:222:5: this_GrantedScenario_0= ruleGrantedScenario
                    {
                     
                            newCompositeNode(grammarAccess.getScenarioElementAccess().getGrantedScenarioParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGrantedScenario_in_ruleScenarioElement492);
                    this_GrantedScenario_0=ruleGrantedScenario();

                    state._fsp--;

                     
                            current = this_GrantedScenario_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:232:5: this_ForbiddenScenario_1= ruleForbiddenScenario
                    {
                     
                            newCompositeNode(grammarAccess.getScenarioElementAccess().getForbiddenScenarioParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForbiddenScenario_in_ruleScenarioElement519);
                    this_ForbiddenScenario_1=ruleForbiddenScenario();

                    state._fsp--;

                     
                            current = this_ForbiddenScenario_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:242:5: this_UserRoleScenario_2= ruleUserRoleScenario
                    {
                     
                            newCompositeNode(grammarAccess.getScenarioElementAccess().getUserRoleScenarioParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUserRoleScenario_in_ruleScenarioElement546);
                    this_UserRoleScenario_2=ruleUserRoleScenario();

                    state._fsp--;

                     
                            current = this_UserRoleScenario_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:252:5: this_ObjectRoleScenario_3= ruleObjectRoleScenario
                    {
                     
                            newCompositeNode(grammarAccess.getScenarioElementAccess().getObjectRoleScenarioParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleObjectRoleScenario_in_ruleScenarioElement573);
                    this_ObjectRoleScenario_3=ruleObjectRoleScenario();

                    state._fsp--;

                     
                            current = this_ObjectRoleScenario_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:262:5: this_ObjectScenario_4= ruleObjectScenario
                    {
                     
                            newCompositeNode(grammarAccess.getScenarioElementAccess().getObjectScenarioParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleObjectScenario_in_ruleScenarioElement600);
                    this_ObjectScenario_4=ruleObjectScenario();

                    state._fsp--;

                     
                            current = this_ObjectScenario_4; 
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
    // $ANTLR end "ruleScenarioElement"


    // $ANTLR start "entryRuleUser"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:278:1: entryRuleUser returns [EObject current=null] : iv_ruleUser= ruleUser EOF ;
    public final EObject entryRuleUser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUser = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:279:2: (iv_ruleUser= ruleUser EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:280:2: iv_ruleUser= ruleUser EOF
            {
             newCompositeNode(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser635);
            iv_ruleUser=ruleUser();

            state._fsp--;

             current =iv_ruleUser; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser645); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:287:1: ruleUser returns [EObject current=null] : (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) ;
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
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:290:28: ( (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:291:1: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:291:1: (otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:291:3: otherlv_0= 'user' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleUser682); 

                	newLeafNode(otherlv_0, grammarAccess.getUserAccess().getUserKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:295:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:296:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:296:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:297:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser699); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUser716); 

                	newLeafNode(otherlv_2, grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:317:1: (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:317:3: otherlv_3= 'role' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUser729); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUserAccess().getRoleKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:321:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:322:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:322:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:323:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUserRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUser749); 

            	    		newLeafNode(otherlv_4, grammarAccess.getUserAccess().getRolesRoleCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleUser763); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:346:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:347:2: (iv_ruleRole= ruleRole EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:348:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole799);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole809); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:355:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'object' ( (lv_assignments_10_0= ruleAssignment ) ) )* otherlv_11= '}' ) ;
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
        Token otherlv_11=null;
        EObject lv_assignments_10_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:358:28: ( (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'object' ( (lv_assignments_10_0= ruleAssignment ) ) )* otherlv_11= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:359:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'object' ( (lv_assignments_10_0= ruleAssignment ) ) )* otherlv_11= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:359:1: (otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'object' ( (lv_assignments_10_0= ruleAssignment ) ) )* otherlv_11= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:359:3: otherlv_0= 'role' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )? otherlv_4= '{' (otherlv_5= 'ssod' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'dsod' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'object' ( (lv_assignments_10_0= ruleAssignment ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleRole846); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:363:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:364:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:364:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:365:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole863); 

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

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:381:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:381:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )*
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleRole881); 

                        	newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getExtendsKeyword_2_0());
                        
                    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:385:1: ( (otherlv_3= RULE_ID ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:386:1: (otherlv_3= RULE_ID )
                    	    {
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:386:1: (otherlv_3= RULE_ID )
                    	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:387:3: otherlv_3= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRoleRule());
                    	    	        }
                    	            
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole901); 

                    	    		newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getParentRoleCrossReference_2_1_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRole916); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:402:1: (otherlv_5= 'ssod' ( (otherlv_6= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:402:3: otherlv_5= 'ssod' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleRole929); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getSsodKeyword_4_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:406:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:407:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:407:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:408:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoleRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole949); 

            	    		newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getSsodRoleCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:419:4: (otherlv_7= 'dsod' ( (otherlv_8= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:419:6: otherlv_7= 'dsod' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleRole964); 

            	        	newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getDsodKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:423:1: ( (otherlv_8= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:424:1: (otherlv_8= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:424:1: (otherlv_8= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:425:3: otherlv_8= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRoleRule());
            	    	        }
            	            
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRole984); 

            	    		newLeafNode(otherlv_8, grammarAccess.getRoleAccess().getDsodRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:436:4: (otherlv_9= 'object' ( (lv_assignments_10_0= ruleAssignment ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:436:6: otherlv_9= 'object' ( (lv_assignments_10_0= ruleAssignment ) )
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleRole999); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getObjectKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:440:1: ( (lv_assignments_10_0= ruleAssignment ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:441:1: (lv_assignments_10_0= ruleAssignment )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:441:1: (lv_assignments_10_0= ruleAssignment )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:442:3: lv_assignments_10_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRoleAccess().getAssignmentsAssignmentParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleRole1020);
            	    lv_assignments_10_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRoleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignments",
            	            		lv_assignments_10_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleRole1034); 

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


    // $ANTLR start "entryRuleAssignment"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:470:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:471:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:472:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment1070);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment1080); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:479:1: ruleAssignment returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )* otherlv_3= ']' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:482:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )* otherlv_3= ']' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:483:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )* otherlv_3= ']' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:483:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )* otherlv_3= ']' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:483:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '[' ( (otherlv_2= RULE_ID ) )* otherlv_3= ']'
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:483:2: ( (otherlv_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:484:1: (otherlv_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:484:1: (otherlv_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:485:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1125); 

            		newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getObjectRBACObjectCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAssignment1137); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:500:1: ( (otherlv_2= RULE_ID ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:501:1: (otherlv_2= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:501:1: (otherlv_2= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:502:3: otherlv_2= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAssignmentRule());
            	    	        }
            	            
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssignment1157); 

            	    		newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getActionsPermissionCrossReference_2_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAssignment1170); 

                	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_3());
                

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePermission"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:525:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:526:2: (iv_rulePermission= rulePermission EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:527:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission1206);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission1216); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:534:1: rulePermission returns [EObject current=null] : (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:537:28: ( (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:538:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:538:1: (otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:538:3: otherlv_0= 'action' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_rulePermission1253); 

                	newLeafNode(otherlv_0, grammarAccess.getPermissionAccess().getActionKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:542:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:543:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:543:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:544:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePermission1270); 

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


    // $ANTLR start "entryRuleRBACObject"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:568:1: entryRuleRBACObject returns [EObject current=null] : iv_ruleRBACObject= ruleRBACObject EOF ;
    public final EObject entryRuleRBACObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRBACObject = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:569:2: (iv_ruleRBACObject= ruleRBACObject EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:570:2: iv_ruleRBACObject= ruleRBACObject EOF
            {
             newCompositeNode(grammarAccess.getRBACObjectRule()); 
            pushFollow(FOLLOW_ruleRBACObject_in_entryRuleRBACObject1311);
            iv_ruleRBACObject=ruleRBACObject();

            state._fsp--;

             current =iv_ruleRBACObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRBACObject1321); 

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
    // $ANTLR end "entryRuleRBACObject"


    // $ANTLR start "ruleRBACObject"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:577:1: ruleRBACObject returns [EObject current=null] : (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleRBACObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:580:28: ( (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:581:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:581:1: (otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:581:3: otherlv_0= 'object' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRBACObject1358); 

                	newLeafNode(otherlv_0, grammarAccess.getRBACObjectAccess().getObjectKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:585:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:586:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:586:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:587:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRBACObject1375); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRBACObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRBACObjectRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRBACObject1392); 

                	newLeafNode(otherlv_2, grammarAccess.getRBACObjectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:607:1: (otherlv_3= 'action' ( (otherlv_4= RULE_ID ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:607:3: otherlv_3= 'action' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleRBACObject1405); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRBACObjectAccess().getActionKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:611:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:612:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:612:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:613:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRBACObjectRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRBACObject1425); 

            	    		newLeafNode(otherlv_4, grammarAccess.getRBACObjectAccess().getPermissionsPermissionCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleRBACObject1439); 

                	newLeafNode(otherlv_5, grammarAccess.getRBACObjectAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleRBACObject"


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
            pushFollow(FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario1475);
            iv_ruleGrantedScenario=ruleGrantedScenario();

            state._fsp--;

             current =iv_ruleGrantedScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrantedScenario1485); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:645:1: ruleGrantedScenario returns [EObject current=null] : (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}' ) ;
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
        Token otherlv_9=null;
        EObject lv_object_8_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:648:28: ( (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:649:1: (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:649:1: (otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:649:3: otherlv_0= 'grantedScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGrantedScenario1522); 

                	newLeafNode(otherlv_0, grammarAccess.getGrantedScenarioAccess().getGrantedScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:653:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:654:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:654:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:655:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1539); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGrantedScenario1556); 

                	newLeafNode(otherlv_2, grammarAccess.getGrantedScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleGrantedScenario1568); 

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
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1588); 

            		newLeafNode(otherlv_4, grammarAccess.getGrantedScenarioAccess().getUserUserCrossReference_4_0()); 
            	

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:692:2: (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:692:4: otherlv_5= 'role' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleGrantedScenario1601); 

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
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrantedScenario1621); 

            	    		newLeafNode(otherlv_6, grammarAccess.getGrantedScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:709:4: (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:709:6: otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleGrantedScenario1636); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGrantedScenarioAccess().getObjectKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:713:1: ( (lv_object_8_0= ruleAssignment ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:714:1: (lv_object_8_0= ruleAssignment )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:714:1: (lv_object_8_0= ruleAssignment )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:715:3: lv_object_8_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGrantedScenarioAccess().getObjectAssignmentParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleGrantedScenario1657);
            	    lv_object_8_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGrantedScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"object",
            	            		lv_object_8_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleGrantedScenario1671); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:743:1: entryRuleForbiddenScenario returns [EObject current=null] : iv_ruleForbiddenScenario= ruleForbiddenScenario EOF ;
    public final EObject entryRuleForbiddenScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForbiddenScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:744:2: (iv_ruleForbiddenScenario= ruleForbiddenScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:745:2: iv_ruleForbiddenScenario= ruleForbiddenScenario EOF
            {
             newCompositeNode(grammarAccess.getForbiddenScenarioRule()); 
            pushFollow(FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario1707);
            iv_ruleForbiddenScenario=ruleForbiddenScenario();

            state._fsp--;

             current =iv_ruleForbiddenScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForbiddenScenario1717); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:752:1: ruleForbiddenScenario returns [EObject current=null] : (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}' ) ;
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
        Token otherlv_9=null;
        EObject lv_object_8_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:755:28: ( (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:756:1: (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:756:1: (otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:756:3: otherlv_0= 'forbiddenScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'user' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )* (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+ otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleForbiddenScenario1754); 

                	newLeafNode(otherlv_0, grammarAccess.getForbiddenScenarioAccess().getForbiddenScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:760:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:761:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:761:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:762:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1771); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleForbiddenScenario1788); 

                	newLeafNode(otherlv_2, grammarAccess.getForbiddenScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleForbiddenScenario1800); 

                	newLeafNode(otherlv_3, grammarAccess.getForbiddenScenarioAccess().getUserKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:786:1: ( (otherlv_4= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:787:1: (otherlv_4= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:787:1: (otherlv_4= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:788:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1820); 

            		newLeafNode(otherlv_4, grammarAccess.getForbiddenScenarioAccess().getUserUserCrossReference_4_0()); 
            	

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:799:2: (otherlv_5= 'role' ( (otherlv_6= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:799:4: otherlv_5= 'role' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleForbiddenScenario1833); 

            	        	newLeafNode(otherlv_5, grammarAccess.getForbiddenScenarioAccess().getRoleKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:803:1: ( (otherlv_6= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:804:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:804:1: (otherlv_6= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:805:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getForbiddenScenarioRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleForbiddenScenario1853); 

            	    		newLeafNode(otherlv_6, grammarAccess.getForbiddenScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:816:4: (otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:816:6: otherlv_7= 'object' ( (lv_object_8_0= ruleAssignment ) )
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleForbiddenScenario1868); 

            	        	newLeafNode(otherlv_7, grammarAccess.getForbiddenScenarioAccess().getObjectKeyword_6_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:820:1: ( (lv_object_8_0= ruleAssignment ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:821:1: (lv_object_8_0= ruleAssignment )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:821:1: (lv_object_8_0= ruleAssignment )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:822:3: lv_object_8_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getForbiddenScenarioAccess().getObjectAssignmentParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleForbiddenScenario1889);
            	    lv_object_8_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getForbiddenScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"object",
            	            		lv_object_8_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleForbiddenScenario1903); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:850:1: entryRuleUserRoleScenario returns [EObject current=null] : iv_ruleUserRoleScenario= ruleUserRoleScenario EOF ;
    public final EObject entryRuleUserRoleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserRoleScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:851:2: (iv_ruleUserRoleScenario= ruleUserRoleScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:852:2: iv_ruleUserRoleScenario= ruleUserRoleScenario EOF
            {
             newCompositeNode(grammarAccess.getUserRoleScenarioRule()); 
            pushFollow(FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario1939);
            iv_ruleUserRoleScenario=ruleUserRoleScenario();

            state._fsp--;

             current =iv_ruleUserRoleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserRoleScenario1949); 

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
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:859:1: ruleUserRoleScenario returns [EObject current=null] : (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' ) ;
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
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:862:28: ( (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:863:1: (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:863:1: (otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:863:3: otherlv_0= 'userRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleUserRoleScenario1986); 

                	newLeafNode(otherlv_0, grammarAccess.getUserRoleScenarioAccess().getUserRoleScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:867:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:868:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:868:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:869:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleScenario2003); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleUserRoleScenario2020); 

                	newLeafNode(otherlv_2, grammarAccess.getUserRoleScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:889:1: (otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:889:3: otherlv_3= 'role' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleUserRoleScenario2033); 

            	        	newLeafNode(otherlv_3, grammarAccess.getUserRoleScenarioAccess().getRoleKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:893:1: ( (otherlv_4= RULE_ID ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:894:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:894:1: (otherlv_4= RULE_ID )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:895:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUserRoleScenarioRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUserRoleScenario2053); 

            	    		newLeafNode(otherlv_4, grammarAccess.getUserRoleScenarioAccess().getRolesRoleCrossReference_3_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleUserRoleScenario2067); 

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


    // $ANTLR start "entryRuleObjectRoleScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:918:1: entryRuleObjectRoleScenario returns [EObject current=null] : iv_ruleObjectRoleScenario= ruleObjectRoleScenario EOF ;
    public final EObject entryRuleObjectRoleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectRoleScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:919:2: (iv_ruleObjectRoleScenario= ruleObjectRoleScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:920:2: iv_ruleObjectRoleScenario= ruleObjectRoleScenario EOF
            {
             newCompositeNode(grammarAccess.getObjectRoleScenarioRule()); 
            pushFollow(FOLLOW_ruleObjectRoleScenario_in_entryRuleObjectRoleScenario2103);
            iv_ruleObjectRoleScenario=ruleObjectRoleScenario();

            state._fsp--;

             current =iv_ruleObjectRoleScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectRoleScenario2113); 

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
    // $ANTLR end "entryRuleObjectRoleScenario"


    // $ANTLR start "ruleObjectRoleScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:927:1: ruleObjectRoleScenario returns [EObject current=null] : (otherlv_0= 'objectRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'object' ( (lv_assignment_6_0= ruleAssignment ) ) )+ otherlv_7= '}' ) ;
    public final EObject ruleObjectRoleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_assignment_6_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:930:28: ( (otherlv_0= 'objectRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'object' ( (lv_assignment_6_0= ruleAssignment ) ) )+ otherlv_7= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:931:1: (otherlv_0= 'objectRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'object' ( (lv_assignment_6_0= ruleAssignment ) ) )+ otherlv_7= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:931:1: (otherlv_0= 'objectRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'object' ( (lv_assignment_6_0= ruleAssignment ) ) )+ otherlv_7= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:931:3: otherlv_0= 'objectRoleScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'role' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'object' ( (lv_assignment_6_0= ruleAssignment ) ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleObjectRoleScenario2150); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectRoleScenarioAccess().getObjectRoleScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:935:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:936:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:936:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:937:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectRoleScenario2167); 

            			newLeafNode(lv_name_1_0, grammarAccess.getObjectRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectRoleScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleObjectRoleScenario2184); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectRoleScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleObjectRoleScenario2196); 

                	newLeafNode(otherlv_3, grammarAccess.getObjectRoleScenarioAccess().getRoleKeyword_3());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:961:1: ( (otherlv_4= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:962:1: (otherlv_4= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:962:1: (otherlv_4= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:963:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectRoleScenarioRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectRoleScenario2216); 

            		newLeafNode(otherlv_4, grammarAccess.getObjectRoleScenarioAccess().getRoleRoleCrossReference_4_0()); 
            	

            }


            }

            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:974:2: (otherlv_5= 'object' ( (lv_assignment_6_0= ruleAssignment ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:974:4: otherlv_5= 'object' ( (lv_assignment_6_0= ruleAssignment ) )
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleObjectRoleScenario2229); 

            	        	newLeafNode(otherlv_5, grammarAccess.getObjectRoleScenarioAccess().getObjectKeyword_5_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:978:1: ( (lv_assignment_6_0= ruleAssignment ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:979:1: (lv_assignment_6_0= ruleAssignment )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:979:1: (lv_assignment_6_0= ruleAssignment )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:980:3: lv_assignment_6_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectRoleScenarioAccess().getAssignmentAssignmentParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleObjectRoleScenario2250);
            	    lv_assignment_6_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectRoleScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignment",
            	            		lv_assignment_6_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleObjectRoleScenario2264); 

                	newLeafNode(otherlv_7, grammarAccess.getObjectRoleScenarioAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleObjectRoleScenario"


    // $ANTLR start "entryRuleObjectScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1008:1: entryRuleObjectScenario returns [EObject current=null] : iv_ruleObjectScenario= ruleObjectScenario EOF ;
    public final EObject entryRuleObjectScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectScenario = null;


        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1009:2: (iv_ruleObjectScenario= ruleObjectScenario EOF )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1010:2: iv_ruleObjectScenario= ruleObjectScenario EOF
            {
             newCompositeNode(grammarAccess.getObjectScenarioRule()); 
            pushFollow(FOLLOW_ruleObjectScenario_in_entryRuleObjectScenario2300);
            iv_ruleObjectScenario=ruleObjectScenario();

            state._fsp--;

             current =iv_ruleObjectScenario; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectScenario2310); 

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
    // $ANTLR end "entryRuleObjectScenario"


    // $ANTLR start "ruleObjectScenario"
    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1017:1: ruleObjectScenario returns [EObject current=null] : (otherlv_0= 'objectScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'object' ( (lv_assignment_4_0= ruleAssignment ) ) )+ otherlv_5= '}' ) ;
    public final EObject ruleObjectScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_assignment_4_0 = null;


         enterRule(); 
            
        try {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1020:28: ( (otherlv_0= 'objectScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'object' ( (lv_assignment_4_0= ruleAssignment ) ) )+ otherlv_5= '}' ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1021:1: (otherlv_0= 'objectScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'object' ( (lv_assignment_4_0= ruleAssignment ) ) )+ otherlv_5= '}' )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1021:1: (otherlv_0= 'objectScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'object' ( (lv_assignment_4_0= ruleAssignment ) ) )+ otherlv_5= '}' )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1021:3: otherlv_0= 'objectScenario' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'object' ( (lv_assignment_4_0= ruleAssignment ) ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleObjectScenario2347); 

                	newLeafNode(otherlv_0, grammarAccess.getObjectScenarioAccess().getObjectScenarioKeyword_0());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1025:1: ( (lv_name_1_0= RULE_ID ) )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1026:1: (lv_name_1_0= RULE_ID )
            {
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1026:1: (lv_name_1_0= RULE_ID )
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1027:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjectScenario2364); 

            			newLeafNode(lv_name_1_0, grammarAccess.getObjectScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjectScenarioRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleObjectScenario2381); 

                	newLeafNode(otherlv_2, grammarAccess.getObjectScenarioAccess().getLeftCurlyBracketKeyword_2());
                
            // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1047:1: (otherlv_3= 'object' ( (lv_assignment_4_0= ruleAssignment ) ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1047:3: otherlv_3= 'object' ( (lv_assignment_4_0= ruleAssignment ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleObjectScenario2394); 

            	        	newLeafNode(otherlv_3, grammarAccess.getObjectScenarioAccess().getObjectKeyword_3_0());
            	        
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1051:1: ( (lv_assignment_4_0= ruleAssignment ) )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1052:1: (lv_assignment_4_0= ruleAssignment )
            	    {
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1052:1: (lv_assignment_4_0= ruleAssignment )
            	    // ../uk.ac.open.rbacDSL/src-gen/uk/ac/open/parser/antlr/internal/InternalRbacDSL.g:1053:3: lv_assignment_4_0= ruleAssignment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getObjectScenarioAccess().getAssignmentAssignmentParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAssignment_in_ruleObjectScenario2415);
            	    lv_assignment_4_0=ruleAssignment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getObjectScenarioRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assignment",
            	            		lv_assignment_4_0, 
            	            		"Assignment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleObjectScenario2429); 

                	newLeafNode(otherlv_5, grammarAccess.getObjectScenarioAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleObjectScenario"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRbac_in_entryRuleRbac75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRbac85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRbac122 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRbac134 = new BitSet(new long[]{0x000000000091A000L});
    public static final BitSet FOLLOW_rulePolicyElement_in_ruleRbac155 = new BitSet(new long[]{0x000000000091A000L});
    public static final BitSet FOLLOW_13_in_ruleRbac168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRbac180 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRbac192 = new BitSet(new long[]{0x000000001F002000L});
    public static final BitSet FOLLOW_ruleScenarioElement_in_ruleRbac213 = new BitSet(new long[]{0x000000001F002000L});
    public static final BitSet FOLLOW_13_in_ruleRbac226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicyElement_in_entryRulePolicyElement262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicyElement272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rulePolicyElement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rulePolicyElement346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rulePolicyElement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRBACObject_in_rulePolicyElement400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioElement_in_entryRuleScenarioElement435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarioElement445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_ruleScenarioElement492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_ruleScenarioElement519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_ruleScenarioElement546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectRoleScenario_in_ruleScenarioElement573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectScenario_in_ruleScenarioElement600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleUser682 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser699 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUser716 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleUser729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUser749 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleUser763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleRole846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole863 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_17_in_ruleRole881 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole901 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleRole916 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_18_in_ruleRole929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole949 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_19_in_ruleRole964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRole984 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_20_in_ruleRole999 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleRole1020 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleRole1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1125 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAssignment1137 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssignment1157 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_22_in_ruleAssignment1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePermission1253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePermission1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRBACObject_in_entryRuleRBACObject1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRBACObject1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRBACObject1358 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRBACObject1375 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRBACObject1392 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_23_in_ruleRBACObject1405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRBACObject1425 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_13_in_ruleRBACObject1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario1475 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrantedScenario1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGrantedScenario1522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1539 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGrantedScenario1556 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleGrantedScenario1568 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1588 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleGrantedScenario1601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrantedScenario1621 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleGrantedScenario1636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleGrantedScenario1657 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleGrantedScenario1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario1707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForbiddenScenario1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleForbiddenScenario1754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1771 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleForbiddenScenario1788 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleForbiddenScenario1800 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1820 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_16_in_ruleForbiddenScenario1833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleForbiddenScenario1853 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleForbiddenScenario1868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleForbiddenScenario1889 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleForbiddenScenario1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario1939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleScenario1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUserRoleScenario1986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleScenario2003 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleUserRoleScenario2020 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleUserRoleScenario2033 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUserRoleScenario2053 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_ruleUserRoleScenario2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectRoleScenario_in_entryRuleObjectRoleScenario2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectRoleScenario2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleObjectRoleScenario2150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectRoleScenario2167 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObjectRoleScenario2184 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleObjectRoleScenario2196 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectRoleScenario2216 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleObjectRoleScenario2229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleObjectRoleScenario2250 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleObjectRoleScenario2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectScenario_in_entryRuleObjectScenario2300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectScenario2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleObjectScenario2347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjectScenario2364 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleObjectScenario2381 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleObjectScenario2394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleObjectScenario2415 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleObjectScenario2429 = new BitSet(new long[]{0x0000000000000002L});

}