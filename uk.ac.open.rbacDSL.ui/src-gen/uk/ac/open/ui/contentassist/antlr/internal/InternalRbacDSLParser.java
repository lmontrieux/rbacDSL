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


    // $ANTLR start "entryRulePolicyElement"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:88:1: entryRulePolicyElement : rulePolicyElement EOF ;
    public final void entryRulePolicyElement() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:89:1: ( rulePolicyElement EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:90:1: rulePolicyElement EOF
            {
             before(grammarAccess.getPolicyElementRule()); 
            pushFollow(FOLLOW_rulePolicyElement_in_entryRulePolicyElement121);
            rulePolicyElement();

            state._fsp--;

             after(grammarAccess.getPolicyElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicyElement128); 

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
    // $ANTLR end "entryRulePolicyElement"


    // $ANTLR start "rulePolicyElement"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:97:1: rulePolicyElement : ( ( rule__PolicyElement__Alternatives ) ) ;
    public final void rulePolicyElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:101:2: ( ( ( rule__PolicyElement__Alternatives ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:102:1: ( ( rule__PolicyElement__Alternatives ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:102:1: ( ( rule__PolicyElement__Alternatives ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:103:1: ( rule__PolicyElement__Alternatives )
            {
             before(grammarAccess.getPolicyElementAccess().getAlternatives()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:104:1: ( rule__PolicyElement__Alternatives )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:104:2: rule__PolicyElement__Alternatives
            {
            pushFollow(FOLLOW_rule__PolicyElement__Alternatives_in_rulePolicyElement154);
            rule__PolicyElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPolicyElementAccess().getAlternatives()); 

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
    // $ANTLR end "rulePolicyElement"


    // $ANTLR start "entryRuleScenarioElement"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:116:1: entryRuleScenarioElement : ruleScenarioElement EOF ;
    public final void entryRuleScenarioElement() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:117:1: ( ruleScenarioElement EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:118:1: ruleScenarioElement EOF
            {
             before(grammarAccess.getScenarioElementRule()); 
            pushFollow(FOLLOW_ruleScenarioElement_in_entryRuleScenarioElement181);
            ruleScenarioElement();

            state._fsp--;

             after(grammarAccess.getScenarioElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarioElement188); 

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
    // $ANTLR end "entryRuleScenarioElement"


    // $ANTLR start "ruleScenarioElement"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:125:1: ruleScenarioElement : ( ( rule__ScenarioElement__Alternatives ) ) ;
    public final void ruleScenarioElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:129:2: ( ( ( rule__ScenarioElement__Alternatives ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:130:1: ( ( rule__ScenarioElement__Alternatives ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:130:1: ( ( rule__ScenarioElement__Alternatives ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:131:1: ( rule__ScenarioElement__Alternatives )
            {
             before(grammarAccess.getScenarioElementAccess().getAlternatives()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:132:1: ( rule__ScenarioElement__Alternatives )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:132:2: rule__ScenarioElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ScenarioElement__Alternatives_in_ruleScenarioElement214);
            rule__ScenarioElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScenarioElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleScenarioElement"


    // $ANTLR start "entryRuleUser"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:144:1: entryRuleUser : ruleUser EOF ;
    public final void entryRuleUser() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:145:1: ( ruleUser EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:146:1: ruleUser EOF
            {
             before(grammarAccess.getUserRule()); 
            pushFollow(FOLLOW_ruleUser_in_entryRuleUser241);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getUserRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUser248); 

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
    // $ANTLR end "entryRuleUser"


    // $ANTLR start "ruleUser"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:153:1: ruleUser : ( ( rule__User__Group__0 ) ) ;
    public final void ruleUser() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:157:2: ( ( ( rule__User__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:158:1: ( ( rule__User__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:158:1: ( ( rule__User__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:159:1: ( rule__User__Group__0 )
            {
             before(grammarAccess.getUserAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:160:1: ( rule__User__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:160:2: rule__User__Group__0
            {
            pushFollow(FOLLOW_rule__User__Group__0_in_ruleUser274);
            rule__User__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getGroup()); 

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
    // $ANTLR end "ruleUser"


    // $ANTLR start "entryRuleRole"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:172:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:173:1: ( ruleRole EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:174:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole301);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole308); 

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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:181:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:185:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:186:1: ( ( rule__Role__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:186:1: ( ( rule__Role__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:187:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:188:1: ( rule__Role__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:188:2: rule__Role__Group__0
            {
            pushFollow(FOLLOW_rule__Role__Group__0_in_ruleRole334);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleAssignment"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:200:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:201:1: ( ruleAssignment EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:202:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment361);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment368); 

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:209:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:213:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:214:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:214:1: ( ( rule__Assignment__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:215:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:216:1: ( rule__Assignment__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:216:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment394);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulePermission"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:228:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:229:1: ( rulePermission EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:230:1: rulePermission EOF
            {
             before(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission421);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPermissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission428); 

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
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:237:1: rulePermission : ( ( rule__Permission__Group__0 ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:241:2: ( ( ( rule__Permission__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:242:1: ( ( rule__Permission__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:242:1: ( ( rule__Permission__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:243:1: ( rule__Permission__Group__0 )
            {
             before(grammarAccess.getPermissionAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:244:1: ( rule__Permission__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:244:2: rule__Permission__Group__0
            {
            pushFollow(FOLLOW_rule__Permission__Group__0_in_rulePermission454);
            rule__Permission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getGroup()); 

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
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRuleRBACObject"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:256:1: entryRuleRBACObject : ruleRBACObject EOF ;
    public final void entryRuleRBACObject() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:257:1: ( ruleRBACObject EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:258:1: ruleRBACObject EOF
            {
             before(grammarAccess.getRBACObjectRule()); 
            pushFollow(FOLLOW_ruleRBACObject_in_entryRuleRBACObject481);
            ruleRBACObject();

            state._fsp--;

             after(grammarAccess.getRBACObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRBACObject488); 

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
    // $ANTLR end "entryRuleRBACObject"


    // $ANTLR start "ruleRBACObject"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:265:1: ruleRBACObject : ( ( rule__RBACObject__Group__0 ) ) ;
    public final void ruleRBACObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:269:2: ( ( ( rule__RBACObject__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:270:1: ( ( rule__RBACObject__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:270:1: ( ( rule__RBACObject__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:271:1: ( rule__RBACObject__Group__0 )
            {
             before(grammarAccess.getRBACObjectAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:272:1: ( rule__RBACObject__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:272:2: rule__RBACObject__Group__0
            {
            pushFollow(FOLLOW_rule__RBACObject__Group__0_in_ruleRBACObject514);
            rule__RBACObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRBACObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleRBACObject"


    // $ANTLR start "entryRuleGrantedScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:284:1: entryRuleGrantedScenario : ruleGrantedScenario EOF ;
    public final void entryRuleGrantedScenario() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:285:1: ( ruleGrantedScenario EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:286:1: ruleGrantedScenario EOF
            {
             before(grammarAccess.getGrantedScenarioRule()); 
            pushFollow(FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario541);
            ruleGrantedScenario();

            state._fsp--;

             after(grammarAccess.getGrantedScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrantedScenario548); 

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
    // $ANTLR end "entryRuleGrantedScenario"


    // $ANTLR start "ruleGrantedScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:293:1: ruleGrantedScenario : ( ( rule__GrantedScenario__Group__0 ) ) ;
    public final void ruleGrantedScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:297:2: ( ( ( rule__GrantedScenario__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:298:1: ( ( rule__GrantedScenario__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:298:1: ( ( rule__GrantedScenario__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:299:1: ( rule__GrantedScenario__Group__0 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:300:1: ( rule__GrantedScenario__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:300:2: rule__GrantedScenario__Group__0
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__0_in_ruleGrantedScenario574);
            rule__GrantedScenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleGrantedScenario"


    // $ANTLR start "entryRuleForbiddenScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:312:1: entryRuleForbiddenScenario : ruleForbiddenScenario EOF ;
    public final void entryRuleForbiddenScenario() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:313:1: ( ruleForbiddenScenario EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:314:1: ruleForbiddenScenario EOF
            {
             before(grammarAccess.getForbiddenScenarioRule()); 
            pushFollow(FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario601);
            ruleForbiddenScenario();

            state._fsp--;

             after(grammarAccess.getForbiddenScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForbiddenScenario608); 

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
    // $ANTLR end "entryRuleForbiddenScenario"


    // $ANTLR start "ruleForbiddenScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:321:1: ruleForbiddenScenario : ( ( rule__ForbiddenScenario__Group__0 ) ) ;
    public final void ruleForbiddenScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:325:2: ( ( ( rule__ForbiddenScenario__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:326:1: ( ( rule__ForbiddenScenario__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:326:1: ( ( rule__ForbiddenScenario__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:327:1: ( rule__ForbiddenScenario__Group__0 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:328:1: ( rule__ForbiddenScenario__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:328:2: rule__ForbiddenScenario__Group__0
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__0_in_ruleForbiddenScenario634);
            rule__ForbiddenScenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleForbiddenScenario"


    // $ANTLR start "entryRuleUserRoleScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:340:1: entryRuleUserRoleScenario : ruleUserRoleScenario EOF ;
    public final void entryRuleUserRoleScenario() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:341:1: ( ruleUserRoleScenario EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:342:1: ruleUserRoleScenario EOF
            {
             before(grammarAccess.getUserRoleScenarioRule()); 
            pushFollow(FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario661);
            ruleUserRoleScenario();

            state._fsp--;

             after(grammarAccess.getUserRoleScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserRoleScenario668); 

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
    // $ANTLR end "entryRuleUserRoleScenario"


    // $ANTLR start "ruleUserRoleScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:349:1: ruleUserRoleScenario : ( ( rule__UserRoleScenario__Group__0 ) ) ;
    public final void ruleUserRoleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:353:2: ( ( ( rule__UserRoleScenario__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:354:1: ( ( rule__UserRoleScenario__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:354:1: ( ( rule__UserRoleScenario__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:355:1: ( rule__UserRoleScenario__Group__0 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:356:1: ( rule__UserRoleScenario__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:356:2: rule__UserRoleScenario__Group__0
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__0_in_ruleUserRoleScenario694);
            rule__UserRoleScenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserRoleScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleUserRoleScenario"


    // $ANTLR start "entryRuleObjectRoleScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:368:1: entryRuleObjectRoleScenario : ruleObjectRoleScenario EOF ;
    public final void entryRuleObjectRoleScenario() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:369:1: ( ruleObjectRoleScenario EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:370:1: ruleObjectRoleScenario EOF
            {
             before(grammarAccess.getObjectRoleScenarioRule()); 
            pushFollow(FOLLOW_ruleObjectRoleScenario_in_entryRuleObjectRoleScenario721);
            ruleObjectRoleScenario();

            state._fsp--;

             after(grammarAccess.getObjectRoleScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectRoleScenario728); 

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
    // $ANTLR end "entryRuleObjectRoleScenario"


    // $ANTLR start "ruleObjectRoleScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:377:1: ruleObjectRoleScenario : ( ( rule__ObjectRoleScenario__Group__0 ) ) ;
    public final void ruleObjectRoleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:381:2: ( ( ( rule__ObjectRoleScenario__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:382:1: ( ( rule__ObjectRoleScenario__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:382:1: ( ( rule__ObjectRoleScenario__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:383:1: ( rule__ObjectRoleScenario__Group__0 )
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:384:1: ( rule__ObjectRoleScenario__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:384:2: rule__ObjectRoleScenario__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__0_in_ruleObjectRoleScenario754);
            rule__ObjectRoleScenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectRoleScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectRoleScenario"


    // $ANTLR start "entryRuleObjectScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:396:1: entryRuleObjectScenario : ruleObjectScenario EOF ;
    public final void entryRuleObjectScenario() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:397:1: ( ruleObjectScenario EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:398:1: ruleObjectScenario EOF
            {
             before(grammarAccess.getObjectScenarioRule()); 
            pushFollow(FOLLOW_ruleObjectScenario_in_entryRuleObjectScenario781);
            ruleObjectScenario();

            state._fsp--;

             after(grammarAccess.getObjectScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectScenario788); 

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
    // $ANTLR end "entryRuleObjectScenario"


    // $ANTLR start "ruleObjectScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:405:1: ruleObjectScenario : ( ( rule__ObjectScenario__Group__0 ) ) ;
    public final void ruleObjectScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:409:2: ( ( ( rule__ObjectScenario__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:410:1: ( ( rule__ObjectScenario__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:410:1: ( ( rule__ObjectScenario__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:411:1: ( rule__ObjectScenario__Group__0 )
            {
             before(grammarAccess.getObjectScenarioAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:412:1: ( rule__ObjectScenario__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:412:2: rule__ObjectScenario__Group__0
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group__0_in_ruleObjectScenario814);
            rule__ObjectScenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectScenario"


    // $ANTLR start "rule__PolicyElement__Alternatives"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:424:1: rule__PolicyElement__Alternatives : ( ( ruleUser ) | ( ruleRole ) | ( rulePermission ) | ( ruleRBACObject ) );
    public final void rule__PolicyElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:428:1: ( ( ruleUser ) | ( ruleRole ) | ( rulePermission ) | ( ruleRBACObject ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:429:1: ( ruleUser )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:429:1: ( ruleUser )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:430:1: ruleUser
                    {
                     before(grammarAccess.getPolicyElementAccess().getUserParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleUser_in_rule__PolicyElement__Alternatives850);
                    ruleUser();

                    state._fsp--;

                     after(grammarAccess.getPolicyElementAccess().getUserParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:435:6: ( ruleRole )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:435:6: ( ruleRole )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:436:1: ruleRole
                    {
                     before(grammarAccess.getPolicyElementAccess().getRoleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRole_in_rule__PolicyElement__Alternatives867);
                    ruleRole();

                    state._fsp--;

                     after(grammarAccess.getPolicyElementAccess().getRoleParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:441:6: ( rulePermission )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:441:6: ( rulePermission )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:442:1: rulePermission
                    {
                     before(grammarAccess.getPolicyElementAccess().getPermissionParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulePermission_in_rule__PolicyElement__Alternatives884);
                    rulePermission();

                    state._fsp--;

                     after(grammarAccess.getPolicyElementAccess().getPermissionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:447:6: ( ruleRBACObject )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:447:6: ( ruleRBACObject )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:448:1: ruleRBACObject
                    {
                     before(grammarAccess.getPolicyElementAccess().getRBACObjectParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleRBACObject_in_rule__PolicyElement__Alternatives901);
                    ruleRBACObject();

                    state._fsp--;

                     after(grammarAccess.getPolicyElementAccess().getRBACObjectParserRuleCall_3()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__PolicyElement__Alternatives"


    // $ANTLR start "rule__ScenarioElement__Alternatives"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:458:1: rule__ScenarioElement__Alternatives : ( ( ruleGrantedScenario ) | ( ruleForbiddenScenario ) | ( ruleUserRoleScenario ) | ( ruleObjectRoleScenario ) | ( ruleObjectScenario ) );
    public final void rule__ScenarioElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:462:1: ( ( ruleGrantedScenario ) | ( ruleForbiddenScenario ) | ( ruleUserRoleScenario ) | ( ruleObjectRoleScenario ) | ( ruleObjectScenario ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 28:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:463:1: ( ruleGrantedScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:463:1: ( ruleGrantedScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:464:1: ruleGrantedScenario
                    {
                     before(grammarAccess.getScenarioElementAccess().getGrantedScenarioParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGrantedScenario_in_rule__ScenarioElement__Alternatives933);
                    ruleGrantedScenario();

                    state._fsp--;

                     after(grammarAccess.getScenarioElementAccess().getGrantedScenarioParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:469:6: ( ruleForbiddenScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:469:6: ( ruleForbiddenScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:470:1: ruleForbiddenScenario
                    {
                     before(grammarAccess.getScenarioElementAccess().getForbiddenScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForbiddenScenario_in_rule__ScenarioElement__Alternatives950);
                    ruleForbiddenScenario();

                    state._fsp--;

                     after(grammarAccess.getScenarioElementAccess().getForbiddenScenarioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:475:6: ( ruleUserRoleScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:475:6: ( ruleUserRoleScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:476:1: ruleUserRoleScenario
                    {
                     before(grammarAccess.getScenarioElementAccess().getUserRoleScenarioParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUserRoleScenario_in_rule__ScenarioElement__Alternatives967);
                    ruleUserRoleScenario();

                    state._fsp--;

                     after(grammarAccess.getScenarioElementAccess().getUserRoleScenarioParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:481:6: ( ruleObjectRoleScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:481:6: ( ruleObjectRoleScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:482:1: ruleObjectRoleScenario
                    {
                     before(grammarAccess.getScenarioElementAccess().getObjectRoleScenarioParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleObjectRoleScenario_in_rule__ScenarioElement__Alternatives984);
                    ruleObjectRoleScenario();

                    state._fsp--;

                     after(grammarAccess.getScenarioElementAccess().getObjectRoleScenarioParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:487:6: ( ruleObjectScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:487:6: ( ruleObjectScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:488:1: ruleObjectScenario
                    {
                     before(grammarAccess.getScenarioElementAccess().getObjectScenarioParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleObjectScenario_in_rule__ScenarioElement__Alternatives1001);
                    ruleObjectScenario();

                    state._fsp--;

                     after(grammarAccess.getScenarioElementAccess().getObjectScenarioParserRuleCall_4()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__ScenarioElement__Alternatives"


    // $ANTLR start "rule__Rbac__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:500:1: rule__Rbac__Group__0 : rule__Rbac__Group__0__Impl rule__Rbac__Group__1 ;
    public final void rule__Rbac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:504:1: ( rule__Rbac__Group__0__Impl rule__Rbac__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:505:2: rule__Rbac__Group__0__Impl rule__Rbac__Group__1
            {
            pushFollow(FOLLOW_rule__Rbac__Group__0__Impl_in_rule__Rbac__Group__01031);
            rule__Rbac__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__1_in_rule__Rbac__Group__01034);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:512:1: rule__Rbac__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Rbac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:516:1: ( ( 'policy' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:517:1: ( 'policy' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:517:1: ( 'policy' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:518:1: 'policy'
            {
             before(grammarAccess.getRbacAccess().getPolicyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Rbac__Group__0__Impl1062); 
             after(grammarAccess.getRbacAccess().getPolicyKeyword_0()); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:531:1: rule__Rbac__Group__1 : rule__Rbac__Group__1__Impl rule__Rbac__Group__2 ;
    public final void rule__Rbac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:535:1: ( rule__Rbac__Group__1__Impl rule__Rbac__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:536:2: rule__Rbac__Group__1__Impl rule__Rbac__Group__2
            {
            pushFollow(FOLLOW_rule__Rbac__Group__1__Impl_in_rule__Rbac__Group__11093);
            rule__Rbac__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__2_in_rule__Rbac__Group__11096);
            rule__Rbac__Group__2();

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:543:1: rule__Rbac__Group__1__Impl : ( '{' ) ;
    public final void rule__Rbac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:547:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:548:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:548:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:549:1: '{'
            {
             before(grammarAccess.getRbacAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Rbac__Group__1__Impl1124); 
             after(grammarAccess.getRbacAccess().getLeftCurlyBracketKeyword_1()); 

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


    // $ANTLR start "rule__Rbac__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:562:1: rule__Rbac__Group__2 : rule__Rbac__Group__2__Impl rule__Rbac__Group__3 ;
    public final void rule__Rbac__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:566:1: ( rule__Rbac__Group__2__Impl rule__Rbac__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:567:2: rule__Rbac__Group__2__Impl rule__Rbac__Group__3
            {
            pushFollow(FOLLOW_rule__Rbac__Group__2__Impl_in_rule__Rbac__Group__21155);
            rule__Rbac__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__3_in_rule__Rbac__Group__21158);
            rule__Rbac__Group__3();

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
    // $ANTLR end "rule__Rbac__Group__2"


    // $ANTLR start "rule__Rbac__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:574:1: rule__Rbac__Group__2__Impl : ( ( rule__Rbac__PolicyElementsAssignment_2 )* ) ;
    public final void rule__Rbac__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:578:1: ( ( ( rule__Rbac__PolicyElementsAssignment_2 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:579:1: ( ( rule__Rbac__PolicyElementsAssignment_2 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:579:1: ( ( rule__Rbac__PolicyElementsAssignment_2 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:580:1: ( rule__Rbac__PolicyElementsAssignment_2 )*
            {
             before(grammarAccess.getRbacAccess().getPolicyElementsAssignment_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:581:1: ( rule__Rbac__PolicyElementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)||LA3_0==20||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:581:2: rule__Rbac__PolicyElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Rbac__PolicyElementsAssignment_2_in_rule__Rbac__Group__2__Impl1185);
            	    rule__Rbac__PolicyElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getRbacAccess().getPolicyElementsAssignment_2()); 

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
    // $ANTLR end "rule__Rbac__Group__2__Impl"


    // $ANTLR start "rule__Rbac__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:591:1: rule__Rbac__Group__3 : rule__Rbac__Group__3__Impl rule__Rbac__Group__4 ;
    public final void rule__Rbac__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:595:1: ( rule__Rbac__Group__3__Impl rule__Rbac__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:596:2: rule__Rbac__Group__3__Impl rule__Rbac__Group__4
            {
            pushFollow(FOLLOW_rule__Rbac__Group__3__Impl_in_rule__Rbac__Group__31216);
            rule__Rbac__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__4_in_rule__Rbac__Group__31219);
            rule__Rbac__Group__4();

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
    // $ANTLR end "rule__Rbac__Group__3"


    // $ANTLR start "rule__Rbac__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:603:1: rule__Rbac__Group__3__Impl : ( '}' ) ;
    public final void rule__Rbac__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:607:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:608:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:608:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:609:1: '}'
            {
             before(grammarAccess.getRbacAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Rbac__Group__3__Impl1247); 
             after(grammarAccess.getRbacAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Rbac__Group__3__Impl"


    // $ANTLR start "rule__Rbac__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:622:1: rule__Rbac__Group__4 : rule__Rbac__Group__4__Impl rule__Rbac__Group__5 ;
    public final void rule__Rbac__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:626:1: ( rule__Rbac__Group__4__Impl rule__Rbac__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:627:2: rule__Rbac__Group__4__Impl rule__Rbac__Group__5
            {
            pushFollow(FOLLOW_rule__Rbac__Group__4__Impl_in_rule__Rbac__Group__41278);
            rule__Rbac__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__5_in_rule__Rbac__Group__41281);
            rule__Rbac__Group__5();

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
    // $ANTLR end "rule__Rbac__Group__4"


    // $ANTLR start "rule__Rbac__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:634:1: rule__Rbac__Group__4__Impl : ( 'scenarios' ) ;
    public final void rule__Rbac__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:638:1: ( ( 'scenarios' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:639:1: ( 'scenarios' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:639:1: ( 'scenarios' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:640:1: 'scenarios'
            {
             before(grammarAccess.getRbacAccess().getScenariosKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Rbac__Group__4__Impl1309); 
             after(grammarAccess.getRbacAccess().getScenariosKeyword_4()); 

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
    // $ANTLR end "rule__Rbac__Group__4__Impl"


    // $ANTLR start "rule__Rbac__Group__5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:653:1: rule__Rbac__Group__5 : rule__Rbac__Group__5__Impl rule__Rbac__Group__6 ;
    public final void rule__Rbac__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:657:1: ( rule__Rbac__Group__5__Impl rule__Rbac__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:658:2: rule__Rbac__Group__5__Impl rule__Rbac__Group__6
            {
            pushFollow(FOLLOW_rule__Rbac__Group__5__Impl_in_rule__Rbac__Group__51340);
            rule__Rbac__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__6_in_rule__Rbac__Group__51343);
            rule__Rbac__Group__6();

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
    // $ANTLR end "rule__Rbac__Group__5"


    // $ANTLR start "rule__Rbac__Group__5__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:665:1: rule__Rbac__Group__5__Impl : ( '{' ) ;
    public final void rule__Rbac__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:669:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:670:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:670:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:671:1: '{'
            {
             before(grammarAccess.getRbacAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Rbac__Group__5__Impl1371); 
             after(grammarAccess.getRbacAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Rbac__Group__5__Impl"


    // $ANTLR start "rule__Rbac__Group__6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:684:1: rule__Rbac__Group__6 : rule__Rbac__Group__6__Impl rule__Rbac__Group__7 ;
    public final void rule__Rbac__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:688:1: ( rule__Rbac__Group__6__Impl rule__Rbac__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:689:2: rule__Rbac__Group__6__Impl rule__Rbac__Group__7
            {
            pushFollow(FOLLOW_rule__Rbac__Group__6__Impl_in_rule__Rbac__Group__61402);
            rule__Rbac__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__7_in_rule__Rbac__Group__61405);
            rule__Rbac__Group__7();

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
    // $ANTLR end "rule__Rbac__Group__6"


    // $ANTLR start "rule__Rbac__Group__6__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:696:1: rule__Rbac__Group__6__Impl : ( ( rule__Rbac__ScenarioElementsAssignment_6 )* ) ;
    public final void rule__Rbac__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:700:1: ( ( ( rule__Rbac__ScenarioElementsAssignment_6 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:701:1: ( ( rule__Rbac__ScenarioElementsAssignment_6 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:701:1: ( ( rule__Rbac__ScenarioElementsAssignment_6 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:702:1: ( rule__Rbac__ScenarioElementsAssignment_6 )*
            {
             before(grammarAccess.getRbacAccess().getScenarioElementsAssignment_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:703:1: ( rule__Rbac__ScenarioElementsAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=24 && LA4_0<=28)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:703:2: rule__Rbac__ScenarioElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Rbac__ScenarioElementsAssignment_6_in_rule__Rbac__Group__6__Impl1432);
            	    rule__Rbac__ScenarioElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRbacAccess().getScenarioElementsAssignment_6()); 

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
    // $ANTLR end "rule__Rbac__Group__6__Impl"


    // $ANTLR start "rule__Rbac__Group__7"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:713:1: rule__Rbac__Group__7 : rule__Rbac__Group__7__Impl ;
    public final void rule__Rbac__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:717:1: ( rule__Rbac__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:718:2: rule__Rbac__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Rbac__Group__7__Impl_in_rule__Rbac__Group__71463);
            rule__Rbac__Group__7__Impl();

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
    // $ANTLR end "rule__Rbac__Group__7"


    // $ANTLR start "rule__Rbac__Group__7__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:724:1: rule__Rbac__Group__7__Impl : ( '}' ) ;
    public final void rule__Rbac__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:728:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:729:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:729:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:730:1: '}'
            {
             before(grammarAccess.getRbacAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Rbac__Group__7__Impl1491); 
             after(grammarAccess.getRbacAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Rbac__Group__7__Impl"


    // $ANTLR start "rule__User__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:759:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:763:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:764:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01538);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__01541);
            rule__User__Group__1();

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
    // $ANTLR end "rule__User__Group__0"


    // $ANTLR start "rule__User__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:771:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:775:1: ( ( 'user' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:776:1: ( 'user' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:776:1: ( 'user' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:777:1: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__User__Group__0__Impl1569); 
             after(grammarAccess.getUserAccess().getUserKeyword_0()); 

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
    // $ANTLR end "rule__User__Group__0__Impl"


    // $ANTLR start "rule__User__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:790:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:794:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:795:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11600);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__2_in_rule__User__Group__11603);
            rule__User__Group__2();

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
    // $ANTLR end "rule__User__Group__1"


    // $ANTLR start "rule__User__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:802:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:806:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:807:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:807:1: ( ( rule__User__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:808:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:809:1: ( rule__User__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:809:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1630);
            rule__User__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__User__Group__1__Impl"


    // $ANTLR start "rule__User__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:819:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:823:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:824:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__21660);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__3_in_rule__User__Group__21663);
            rule__User__Group__3();

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
    // $ANTLR end "rule__User__Group__2"


    // $ANTLR start "rule__User__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:831:1: rule__User__Group__2__Impl : ( '{' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:835:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:836:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:836:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:837:1: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__User__Group__2__Impl1691); 
             after(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__User__Group__2__Impl"


    // $ANTLR start "rule__User__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:850:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:854:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:855:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__31722);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__4_in_rule__User__Group__31725);
            rule__User__Group__4();

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
    // $ANTLR end "rule__User__Group__3"


    // $ANTLR start "rule__User__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:862:1: rule__User__Group__3__Impl : ( ( rule__User__Group_3__0 )* ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:866:1: ( ( ( rule__User__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:867:1: ( ( rule__User__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:867:1: ( ( rule__User__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:868:1: ( rule__User__Group_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:869:1: ( rule__User__Group_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:869:2: rule__User__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__User__Group_3__0_in_rule__User__Group__3__Impl1752);
            	    rule__User__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getUserAccess().getGroup_3()); 

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
    // $ANTLR end "rule__User__Group__3__Impl"


    // $ANTLR start "rule__User__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:879:1: rule__User__Group__4 : rule__User__Group__4__Impl ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:883:1: ( rule__User__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:884:2: rule__User__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__41783);
            rule__User__Group__4__Impl();

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
    // $ANTLR end "rule__User__Group__4"


    // $ANTLR start "rule__User__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:890:1: rule__User__Group__4__Impl : ( '}' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:894:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:895:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:895:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:896:1: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__User__Group__4__Impl1811); 
             after(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__User__Group__4__Impl"


    // $ANTLR start "rule__User__Group_3__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:919:1: rule__User__Group_3__0 : rule__User__Group_3__0__Impl rule__User__Group_3__1 ;
    public final void rule__User__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:923:1: ( rule__User__Group_3__0__Impl rule__User__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:924:2: rule__User__Group_3__0__Impl rule__User__Group_3__1
            {
            pushFollow(FOLLOW_rule__User__Group_3__0__Impl_in_rule__User__Group_3__01852);
            rule__User__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group_3__1_in_rule__User__Group_3__01855);
            rule__User__Group_3__1();

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
    // $ANTLR end "rule__User__Group_3__0"


    // $ANTLR start "rule__User__Group_3__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:931:1: rule__User__Group_3__0__Impl : ( 'role' ) ;
    public final void rule__User__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:935:1: ( ( 'role' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:936:1: ( 'role' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:936:1: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:937:1: 'role'
            {
             before(grammarAccess.getUserAccess().getRoleKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__User__Group_3__0__Impl1883); 
             after(grammarAccess.getUserAccess().getRoleKeyword_3_0()); 

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
    // $ANTLR end "rule__User__Group_3__0__Impl"


    // $ANTLR start "rule__User__Group_3__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:950:1: rule__User__Group_3__1 : rule__User__Group_3__1__Impl ;
    public final void rule__User__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:954:1: ( rule__User__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:955:2: rule__User__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__User__Group_3__1__Impl_in_rule__User__Group_3__11914);
            rule__User__Group_3__1__Impl();

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
    // $ANTLR end "rule__User__Group_3__1"


    // $ANTLR start "rule__User__Group_3__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:961:1: rule__User__Group_3__1__Impl : ( ( rule__User__RolesAssignment_3_1 ) ) ;
    public final void rule__User__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:965:1: ( ( ( rule__User__RolesAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:966:1: ( ( rule__User__RolesAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:966:1: ( ( rule__User__RolesAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:967:1: ( rule__User__RolesAssignment_3_1 )
            {
             before(grammarAccess.getUserAccess().getRolesAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:968:1: ( rule__User__RolesAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:968:2: rule__User__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__User__RolesAssignment_3_1_in_rule__User__Group_3__1__Impl1941);
            rule__User__RolesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserAccess().getRolesAssignment_3_1()); 

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
    // $ANTLR end "rule__User__Group_3__1__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:982:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:986:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:987:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01975);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01978);
            rule__Role__Group__1();

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
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:994:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:998:1: ( ( 'role' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:999:1: ( 'role' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:999:1: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1000:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Role__Group__0__Impl2006); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

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
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1013:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1017:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1018:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__12037);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__12040);
            rule__Role__Group__2();

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
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1025:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1029:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1030:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1030:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1031:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1032:1: ( rule__Role__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1032:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl2067);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1042:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1046:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1047:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__22097);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__22100);
            rule__Role__Group__3();

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
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1054:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1058:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1059:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1059:1: ( ( rule__Role__Group_2__0 )? )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1060:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1061:1: ( rule__Role__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1061:2: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl2127);
                    rule__Role__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1071:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1075:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1076:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__32158);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__32161);
            rule__Role__Group__4();

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
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1083:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1087:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1088:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1088:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1089:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__3__Impl2189); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1102:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1106:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1107:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__42220);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__5_in_rule__Role__Group__42223);
            rule__Role__Group__5();

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
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1114:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )* ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1118:1: ( ( ( rule__Role__Group_4__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1119:1: ( ( rule__Role__Group_4__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1119:1: ( ( rule__Role__Group_4__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1120:1: ( rule__Role__Group_4__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1121:1: ( rule__Role__Group_4__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1121:2: rule__Role__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl2250);
            	    rule__Role__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1131:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1135:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1136:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__52281);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__6_in_rule__Role__Group__52284);
            rule__Role__Group__6();

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
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1143:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )* ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1147:1: ( ( ( rule__Role__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1148:1: ( ( rule__Role__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1148:1: ( ( rule__Role__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1149:1: ( rule__Role__Group_5__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1150:1: ( rule__Role__Group_5__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1150:2: rule__Role__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_5__0_in_rule__Role__Group__5__Impl2311);
            	    rule__Role__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group__6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1160:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1164:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1165:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__62342);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__7_in_rule__Role__Group__62345);
            rule__Role__Group__7();

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
    // $ANTLR end "rule__Role__Group__6"


    // $ANTLR start "rule__Role__Group__6__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1172:1: rule__Role__Group__6__Impl : ( ( rule__Role__Group_6__0 )* ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1176:1: ( ( ( rule__Role__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1177:1: ( ( rule__Role__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1177:1: ( ( rule__Role__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1178:1: ( rule__Role__Group_6__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1179:1: ( rule__Role__Group_6__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1179:2: rule__Role__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_6__0_in_rule__Role__Group__6__Impl2372);
            	    rule__Role__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Role__Group__6__Impl"


    // $ANTLR start "rule__Role__Group__7"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1189:1: rule__Role__Group__7 : rule__Role__Group__7__Impl ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1193:1: ( rule__Role__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1194:2: rule__Role__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__72403);
            rule__Role__Group__7__Impl();

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
    // $ANTLR end "rule__Role__Group__7"


    // $ANTLR start "rule__Role__Group__7__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1200:1: rule__Role__Group__7__Impl : ( '}' ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1204:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1205:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1205:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1206:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Role__Group__7__Impl2431); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Role__Group__7__Impl"


    // $ANTLR start "rule__Role__Group_2__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1235:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1239:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1240:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
            {
            pushFollow(FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__02478);
            rule__Role__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__02481);
            rule__Role__Group_2__1();

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
    // $ANTLR end "rule__Role__Group_2__0"


    // $ANTLR start "rule__Role__Group_2__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1247:1: rule__Role__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1251:1: ( ( 'extends' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1252:1: ( 'extends' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1252:1: ( 'extends' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1253:1: 'extends'
            {
             before(grammarAccess.getRoleAccess().getExtendsKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Role__Group_2__0__Impl2509); 
             after(grammarAccess.getRoleAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Role__Group_2__0__Impl"


    // $ANTLR start "rule__Role__Group_2__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1266:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1270:1: ( rule__Role__Group_2__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1271:2: rule__Role__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__12540);
            rule__Role__Group_2__1__Impl();

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
    // $ANTLR end "rule__Role__Group_2__1"


    // $ANTLR start "rule__Role__Group_2__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1277:1: rule__Role__Group_2__1__Impl : ( ( rule__Role__ParentAssignment_2_1 )* ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1281:1: ( ( ( rule__Role__ParentAssignment_2_1 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1282:1: ( ( rule__Role__ParentAssignment_2_1 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1282:1: ( ( rule__Role__ParentAssignment_2_1 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1283:1: ( rule__Role__ParentAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getParentAssignment_2_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1284:1: ( rule__Role__ParentAssignment_2_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1284:2: rule__Role__ParentAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Role__ParentAssignment_2_1_in_rule__Role__Group_2__1__Impl2567);
            	    rule__Role__ParentAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getParentAssignment_2_1()); 

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
    // $ANTLR end "rule__Role__Group_2__1__Impl"


    // $ANTLR start "rule__Role__Group_4__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1298:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1302:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1303:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__02602);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__02605);
            rule__Role__Group_4__1();

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
    // $ANTLR end "rule__Role__Group_4__0"


    // $ANTLR start "rule__Role__Group_4__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1310:1: rule__Role__Group_4__0__Impl : ( 'ssod' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1314:1: ( ( 'ssod' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1315:1: ( 'ssod' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1315:1: ( 'ssod' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1316:1: 'ssod'
            {
             before(grammarAccess.getRoleAccess().getSsodKeyword_4_0()); 
            match(input,18,FOLLOW_18_in_rule__Role__Group_4__0__Impl2633); 
             after(grammarAccess.getRoleAccess().getSsodKeyword_4_0()); 

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
    // $ANTLR end "rule__Role__Group_4__0__Impl"


    // $ANTLR start "rule__Role__Group_4__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1329:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1333:1: ( rule__Role__Group_4__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1334:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__12664);
            rule__Role__Group_4__1__Impl();

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
    // $ANTLR end "rule__Role__Group_4__1"


    // $ANTLR start "rule__Role__Group_4__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1340:1: rule__Role__Group_4__1__Impl : ( ( rule__Role__SsodAssignment_4_1 ) ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1344:1: ( ( ( rule__Role__SsodAssignment_4_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1345:1: ( ( rule__Role__SsodAssignment_4_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1345:1: ( ( rule__Role__SsodAssignment_4_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1346:1: ( rule__Role__SsodAssignment_4_1 )
            {
             before(grammarAccess.getRoleAccess().getSsodAssignment_4_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1347:1: ( rule__Role__SsodAssignment_4_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1347:2: rule__Role__SsodAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Role__SsodAssignment_4_1_in_rule__Role__Group_4__1__Impl2691);
            rule__Role__SsodAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getSsodAssignment_4_1()); 

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
    // $ANTLR end "rule__Role__Group_4__1__Impl"


    // $ANTLR start "rule__Role__Group_5__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1361:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1365:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1366:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
            {
            pushFollow(FOLLOW_rule__Role__Group_5__0__Impl_in_rule__Role__Group_5__02725);
            rule__Role__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_5__1_in_rule__Role__Group_5__02728);
            rule__Role__Group_5__1();

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
    // $ANTLR end "rule__Role__Group_5__0"


    // $ANTLR start "rule__Role__Group_5__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1373:1: rule__Role__Group_5__0__Impl : ( 'dsod' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1377:1: ( ( 'dsod' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1378:1: ( 'dsod' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1378:1: ( 'dsod' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1379:1: 'dsod'
            {
             before(grammarAccess.getRoleAccess().getDsodKeyword_5_0()); 
            match(input,19,FOLLOW_19_in_rule__Role__Group_5__0__Impl2756); 
             after(grammarAccess.getRoleAccess().getDsodKeyword_5_0()); 

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
    // $ANTLR end "rule__Role__Group_5__0__Impl"


    // $ANTLR start "rule__Role__Group_5__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1392:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1396:1: ( rule__Role__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1397:2: rule__Role__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_5__1__Impl_in_rule__Role__Group_5__12787);
            rule__Role__Group_5__1__Impl();

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
    // $ANTLR end "rule__Role__Group_5__1"


    // $ANTLR start "rule__Role__Group_5__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1403:1: rule__Role__Group_5__1__Impl : ( ( rule__Role__DsodAssignment_5_1 ) ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1407:1: ( ( ( rule__Role__DsodAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1408:1: ( ( rule__Role__DsodAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1408:1: ( ( rule__Role__DsodAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1409:1: ( rule__Role__DsodAssignment_5_1 )
            {
             before(grammarAccess.getRoleAccess().getDsodAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1410:1: ( rule__Role__DsodAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1410:2: rule__Role__DsodAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Role__DsodAssignment_5_1_in_rule__Role__Group_5__1__Impl2814);
            rule__Role__DsodAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getDsodAssignment_5_1()); 

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
    // $ANTLR end "rule__Role__Group_5__1__Impl"


    // $ANTLR start "rule__Role__Group_6__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1424:1: rule__Role__Group_6__0 : rule__Role__Group_6__0__Impl rule__Role__Group_6__1 ;
    public final void rule__Role__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1428:1: ( rule__Role__Group_6__0__Impl rule__Role__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1429:2: rule__Role__Group_6__0__Impl rule__Role__Group_6__1
            {
            pushFollow(FOLLOW_rule__Role__Group_6__0__Impl_in_rule__Role__Group_6__02848);
            rule__Role__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_6__1_in_rule__Role__Group_6__02851);
            rule__Role__Group_6__1();

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
    // $ANTLR end "rule__Role__Group_6__0"


    // $ANTLR start "rule__Role__Group_6__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1436:1: rule__Role__Group_6__0__Impl : ( 'object' ) ;
    public final void rule__Role__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1440:1: ( ( 'object' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1441:1: ( 'object' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1441:1: ( 'object' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1442:1: 'object'
            {
             before(grammarAccess.getRoleAccess().getObjectKeyword_6_0()); 
            match(input,20,FOLLOW_20_in_rule__Role__Group_6__0__Impl2879); 
             after(grammarAccess.getRoleAccess().getObjectKeyword_6_0()); 

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
    // $ANTLR end "rule__Role__Group_6__0__Impl"


    // $ANTLR start "rule__Role__Group_6__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1455:1: rule__Role__Group_6__1 : rule__Role__Group_6__1__Impl ;
    public final void rule__Role__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1459:1: ( rule__Role__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1460:2: rule__Role__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_6__1__Impl_in_rule__Role__Group_6__12910);
            rule__Role__Group_6__1__Impl();

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
    // $ANTLR end "rule__Role__Group_6__1"


    // $ANTLR start "rule__Role__Group_6__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1466:1: rule__Role__Group_6__1__Impl : ( ( rule__Role__AssignmentsAssignment_6_1 ) ) ;
    public final void rule__Role__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1470:1: ( ( ( rule__Role__AssignmentsAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1471:1: ( ( rule__Role__AssignmentsAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1471:1: ( ( rule__Role__AssignmentsAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1472:1: ( rule__Role__AssignmentsAssignment_6_1 )
            {
             before(grammarAccess.getRoleAccess().getAssignmentsAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1473:1: ( rule__Role__AssignmentsAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1473:2: rule__Role__AssignmentsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Role__AssignmentsAssignment_6_1_in_rule__Role__Group_6__1__Impl2937);
            rule__Role__AssignmentsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getAssignmentsAssignment_6_1()); 

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
    // $ANTLR end "rule__Role__Group_6__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1487:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1491:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1492:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02971);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02974);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1499:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__ObjectAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1503:1: ( ( ( rule__Assignment__ObjectAssignment_0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1504:1: ( ( rule__Assignment__ObjectAssignment_0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1504:1: ( ( rule__Assignment__ObjectAssignment_0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1505:1: ( rule__Assignment__ObjectAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getObjectAssignment_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1506:1: ( rule__Assignment__ObjectAssignment_0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1506:2: rule__Assignment__ObjectAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__ObjectAssignment_0_in_rule__Assignment__Group__0__Impl3001);
            rule__Assignment__ObjectAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getObjectAssignment_0()); 

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
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1516:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1520:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1521:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13031);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13034);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1528:1: rule__Assignment__Group__1__Impl : ( '[' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1532:1: ( ( '[' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1533:1: ( '[' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1533:1: ( '[' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1534:1: '['
            {
             before(grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Assignment__Group__1__Impl3062); 
             after(grammarAccess.getAssignmentAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1547:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1551:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1552:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__23093);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__23096);
            rule__Assignment__Group__3();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1559:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ActionsAssignment_2 )* ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1563:1: ( ( ( rule__Assignment__ActionsAssignment_2 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1564:1: ( ( rule__Assignment__ActionsAssignment_2 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1564:1: ( ( rule__Assignment__ActionsAssignment_2 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1565:1: ( rule__Assignment__ActionsAssignment_2 )*
            {
             before(grammarAccess.getAssignmentAccess().getActionsAssignment_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1566:1: ( rule__Assignment__ActionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1566:2: rule__Assignment__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Assignment__ActionsAssignment_2_in_rule__Assignment__Group__2__Impl3123);
            	    rule__Assignment__ActionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAssignmentAccess().getActionsAssignment_2()); 

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
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1576:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1580:1: ( rule__Assignment__Group__3__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1581:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__33154);
            rule__Assignment__Group__3__Impl();

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
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1587:1: rule__Assignment__Group__3__Impl : ( ']' ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1591:1: ( ( ']' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1592:1: ( ']' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1592:1: ( ']' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1593:1: ']'
            {
             before(grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__Assignment__Group__3__Impl3182); 
             after(grammarAccess.getAssignmentAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Permission__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1614:1: rule__Permission__Group__0 : rule__Permission__Group__0__Impl rule__Permission__Group__1 ;
    public final void rule__Permission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1618:1: ( rule__Permission__Group__0__Impl rule__Permission__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1619:2: rule__Permission__Group__0__Impl rule__Permission__Group__1
            {
            pushFollow(FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__03221);
            rule__Permission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__03224);
            rule__Permission__Group__1();

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
    // $ANTLR end "rule__Permission__Group__0"


    // $ANTLR start "rule__Permission__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1626:1: rule__Permission__Group__0__Impl : ( 'action' ) ;
    public final void rule__Permission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1630:1: ( ( 'action' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1631:1: ( 'action' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1631:1: ( 'action' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1632:1: 'action'
            {
             before(grammarAccess.getPermissionAccess().getActionKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Permission__Group__0__Impl3252); 
             after(grammarAccess.getPermissionAccess().getActionKeyword_0()); 

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
    // $ANTLR end "rule__Permission__Group__0__Impl"


    // $ANTLR start "rule__Permission__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1645:1: rule__Permission__Group__1 : rule__Permission__Group__1__Impl ;
    public final void rule__Permission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1649:1: ( rule__Permission__Group__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1650:2: rule__Permission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__13283);
            rule__Permission__Group__1__Impl();

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
    // $ANTLR end "rule__Permission__Group__1"


    // $ANTLR start "rule__Permission__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1656:1: rule__Permission__Group__1__Impl : ( ( rule__Permission__NameAssignment_1 ) ) ;
    public final void rule__Permission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1660:1: ( ( ( rule__Permission__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1661:1: ( ( rule__Permission__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1661:1: ( ( rule__Permission__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1662:1: ( rule__Permission__NameAssignment_1 )
            {
             before(grammarAccess.getPermissionAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1663:1: ( rule__Permission__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1663:2: rule__Permission__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Permission__NameAssignment_1_in_rule__Permission__Group__1__Impl3310);
            rule__Permission__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPermissionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Permission__Group__1__Impl"


    // $ANTLR start "rule__RBACObject__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1677:1: rule__RBACObject__Group__0 : rule__RBACObject__Group__0__Impl rule__RBACObject__Group__1 ;
    public final void rule__RBACObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1681:1: ( rule__RBACObject__Group__0__Impl rule__RBACObject__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1682:2: rule__RBACObject__Group__0__Impl rule__RBACObject__Group__1
            {
            pushFollow(FOLLOW_rule__RBACObject__Group__0__Impl_in_rule__RBACObject__Group__03344);
            rule__RBACObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RBACObject__Group__1_in_rule__RBACObject__Group__03347);
            rule__RBACObject__Group__1();

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
    // $ANTLR end "rule__RBACObject__Group__0"


    // $ANTLR start "rule__RBACObject__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1689:1: rule__RBACObject__Group__0__Impl : ( 'object' ) ;
    public final void rule__RBACObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1693:1: ( ( 'object' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1694:1: ( 'object' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1694:1: ( 'object' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1695:1: 'object'
            {
             before(grammarAccess.getRBACObjectAccess().getObjectKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__RBACObject__Group__0__Impl3375); 
             after(grammarAccess.getRBACObjectAccess().getObjectKeyword_0()); 

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
    // $ANTLR end "rule__RBACObject__Group__0__Impl"


    // $ANTLR start "rule__RBACObject__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1708:1: rule__RBACObject__Group__1 : rule__RBACObject__Group__1__Impl rule__RBACObject__Group__2 ;
    public final void rule__RBACObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1712:1: ( rule__RBACObject__Group__1__Impl rule__RBACObject__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1713:2: rule__RBACObject__Group__1__Impl rule__RBACObject__Group__2
            {
            pushFollow(FOLLOW_rule__RBACObject__Group__1__Impl_in_rule__RBACObject__Group__13406);
            rule__RBACObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RBACObject__Group__2_in_rule__RBACObject__Group__13409);
            rule__RBACObject__Group__2();

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
    // $ANTLR end "rule__RBACObject__Group__1"


    // $ANTLR start "rule__RBACObject__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1720:1: rule__RBACObject__Group__1__Impl : ( ( rule__RBACObject__NameAssignment_1 ) ) ;
    public final void rule__RBACObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1724:1: ( ( ( rule__RBACObject__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1725:1: ( ( rule__RBACObject__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1725:1: ( ( rule__RBACObject__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1726:1: ( rule__RBACObject__NameAssignment_1 )
            {
             before(grammarAccess.getRBACObjectAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1727:1: ( rule__RBACObject__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1727:2: rule__RBACObject__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RBACObject__NameAssignment_1_in_rule__RBACObject__Group__1__Impl3436);
            rule__RBACObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRBACObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RBACObject__Group__1__Impl"


    // $ANTLR start "rule__RBACObject__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1737:1: rule__RBACObject__Group__2 : rule__RBACObject__Group__2__Impl rule__RBACObject__Group__3 ;
    public final void rule__RBACObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1741:1: ( rule__RBACObject__Group__2__Impl rule__RBACObject__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1742:2: rule__RBACObject__Group__2__Impl rule__RBACObject__Group__3
            {
            pushFollow(FOLLOW_rule__RBACObject__Group__2__Impl_in_rule__RBACObject__Group__23466);
            rule__RBACObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RBACObject__Group__3_in_rule__RBACObject__Group__23469);
            rule__RBACObject__Group__3();

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
    // $ANTLR end "rule__RBACObject__Group__2"


    // $ANTLR start "rule__RBACObject__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1749:1: rule__RBACObject__Group__2__Impl : ( '{' ) ;
    public final void rule__RBACObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1753:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1754:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1754:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1755:1: '{'
            {
             before(grammarAccess.getRBACObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__RBACObject__Group__2__Impl3497); 
             after(grammarAccess.getRBACObjectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RBACObject__Group__2__Impl"


    // $ANTLR start "rule__RBACObject__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1768:1: rule__RBACObject__Group__3 : rule__RBACObject__Group__3__Impl rule__RBACObject__Group__4 ;
    public final void rule__RBACObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1772:1: ( rule__RBACObject__Group__3__Impl rule__RBACObject__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1773:2: rule__RBACObject__Group__3__Impl rule__RBACObject__Group__4
            {
            pushFollow(FOLLOW_rule__RBACObject__Group__3__Impl_in_rule__RBACObject__Group__33528);
            rule__RBACObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RBACObject__Group__4_in_rule__RBACObject__Group__33531);
            rule__RBACObject__Group__4();

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
    // $ANTLR end "rule__RBACObject__Group__3"


    // $ANTLR start "rule__RBACObject__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1780:1: rule__RBACObject__Group__3__Impl : ( ( rule__RBACObject__Group_3__0 )* ) ;
    public final void rule__RBACObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1784:1: ( ( ( rule__RBACObject__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1785:1: ( ( rule__RBACObject__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1785:1: ( ( rule__RBACObject__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1786:1: ( rule__RBACObject__Group_3__0 )*
            {
             before(grammarAccess.getRBACObjectAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1787:1: ( rule__RBACObject__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1787:2: rule__RBACObject__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__RBACObject__Group_3__0_in_rule__RBACObject__Group__3__Impl3558);
            	    rule__RBACObject__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRBACObjectAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RBACObject__Group__3__Impl"


    // $ANTLR start "rule__RBACObject__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1797:1: rule__RBACObject__Group__4 : rule__RBACObject__Group__4__Impl ;
    public final void rule__RBACObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1801:1: ( rule__RBACObject__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1802:2: rule__RBACObject__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RBACObject__Group__4__Impl_in_rule__RBACObject__Group__43589);
            rule__RBACObject__Group__4__Impl();

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
    // $ANTLR end "rule__RBACObject__Group__4"


    // $ANTLR start "rule__RBACObject__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1808:1: rule__RBACObject__Group__4__Impl : ( '}' ) ;
    public final void rule__RBACObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1812:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1813:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1813:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1814:1: '}'
            {
             before(grammarAccess.getRBACObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__RBACObject__Group__4__Impl3617); 
             after(grammarAccess.getRBACObjectAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__RBACObject__Group__4__Impl"


    // $ANTLR start "rule__RBACObject__Group_3__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1837:1: rule__RBACObject__Group_3__0 : rule__RBACObject__Group_3__0__Impl rule__RBACObject__Group_3__1 ;
    public final void rule__RBACObject__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1841:1: ( rule__RBACObject__Group_3__0__Impl rule__RBACObject__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1842:2: rule__RBACObject__Group_3__0__Impl rule__RBACObject__Group_3__1
            {
            pushFollow(FOLLOW_rule__RBACObject__Group_3__0__Impl_in_rule__RBACObject__Group_3__03658);
            rule__RBACObject__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RBACObject__Group_3__1_in_rule__RBACObject__Group_3__03661);
            rule__RBACObject__Group_3__1();

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
    // $ANTLR end "rule__RBACObject__Group_3__0"


    // $ANTLR start "rule__RBACObject__Group_3__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1849:1: rule__RBACObject__Group_3__0__Impl : ( 'action' ) ;
    public final void rule__RBACObject__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1853:1: ( ( 'action' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1854:1: ( 'action' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1854:1: ( 'action' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1855:1: 'action'
            {
             before(grammarAccess.getRBACObjectAccess().getActionKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__RBACObject__Group_3__0__Impl3689); 
             after(grammarAccess.getRBACObjectAccess().getActionKeyword_3_0()); 

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
    // $ANTLR end "rule__RBACObject__Group_3__0__Impl"


    // $ANTLR start "rule__RBACObject__Group_3__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1868:1: rule__RBACObject__Group_3__1 : rule__RBACObject__Group_3__1__Impl ;
    public final void rule__RBACObject__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1872:1: ( rule__RBACObject__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1873:2: rule__RBACObject__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RBACObject__Group_3__1__Impl_in_rule__RBACObject__Group_3__13720);
            rule__RBACObject__Group_3__1__Impl();

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
    // $ANTLR end "rule__RBACObject__Group_3__1"


    // $ANTLR start "rule__RBACObject__Group_3__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1879:1: rule__RBACObject__Group_3__1__Impl : ( ( rule__RBACObject__PermissionsAssignment_3_1 ) ) ;
    public final void rule__RBACObject__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1883:1: ( ( ( rule__RBACObject__PermissionsAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1884:1: ( ( rule__RBACObject__PermissionsAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1884:1: ( ( rule__RBACObject__PermissionsAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1885:1: ( rule__RBACObject__PermissionsAssignment_3_1 )
            {
             before(grammarAccess.getRBACObjectAccess().getPermissionsAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1886:1: ( rule__RBACObject__PermissionsAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1886:2: rule__RBACObject__PermissionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RBACObject__PermissionsAssignment_3_1_in_rule__RBACObject__Group_3__1__Impl3747);
            rule__RBACObject__PermissionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRBACObjectAccess().getPermissionsAssignment_3_1()); 

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
    // $ANTLR end "rule__RBACObject__Group_3__1__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1900:1: rule__GrantedScenario__Group__0 : rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1 ;
    public final void rule__GrantedScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1904:1: ( rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1905:2: rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__0__Impl_in_rule__GrantedScenario__Group__03781);
            rule__GrantedScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__1_in_rule__GrantedScenario__Group__03784);
            rule__GrantedScenario__Group__1();

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
    // $ANTLR end "rule__GrantedScenario__Group__0"


    // $ANTLR start "rule__GrantedScenario__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1912:1: rule__GrantedScenario__Group__0__Impl : ( 'grantedScenario' ) ;
    public final void rule__GrantedScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1916:1: ( ( 'grantedScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1917:1: ( 'grantedScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1917:1: ( 'grantedScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1918:1: 'grantedScenario'
            {
             before(grammarAccess.getGrantedScenarioAccess().getGrantedScenarioKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__GrantedScenario__Group__0__Impl3812); 
             after(grammarAccess.getGrantedScenarioAccess().getGrantedScenarioKeyword_0()); 

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
    // $ANTLR end "rule__GrantedScenario__Group__0__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1931:1: rule__GrantedScenario__Group__1 : rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2 ;
    public final void rule__GrantedScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1935:1: ( rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1936:2: rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__1__Impl_in_rule__GrantedScenario__Group__13843);
            rule__GrantedScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__2_in_rule__GrantedScenario__Group__13846);
            rule__GrantedScenario__Group__2();

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
    // $ANTLR end "rule__GrantedScenario__Group__1"


    // $ANTLR start "rule__GrantedScenario__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1943:1: rule__GrantedScenario__Group__1__Impl : ( ( rule__GrantedScenario__NameAssignment_1 ) ) ;
    public final void rule__GrantedScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1947:1: ( ( ( rule__GrantedScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1948:1: ( ( rule__GrantedScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1948:1: ( ( rule__GrantedScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1949:1: ( rule__GrantedScenario__NameAssignment_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1950:1: ( rule__GrantedScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1950:2: rule__GrantedScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__NameAssignment_1_in_rule__GrantedScenario__Group__1__Impl3873);
            rule__GrantedScenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__GrantedScenario__Group__1__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1960:1: rule__GrantedScenario__Group__2 : rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3 ;
    public final void rule__GrantedScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1964:1: ( rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1965:2: rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__2__Impl_in_rule__GrantedScenario__Group__23903);
            rule__GrantedScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__3_in_rule__GrantedScenario__Group__23906);
            rule__GrantedScenario__Group__3();

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
    // $ANTLR end "rule__GrantedScenario__Group__2"


    // $ANTLR start "rule__GrantedScenario__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1972:1: rule__GrantedScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__GrantedScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1976:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1977:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1977:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1978:1: '{'
            {
             before(grammarAccess.getGrantedScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__GrantedScenario__Group__2__Impl3934); 
             after(grammarAccess.getGrantedScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__GrantedScenario__Group__2__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1991:1: rule__GrantedScenario__Group__3 : rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4 ;
    public final void rule__GrantedScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1995:1: ( rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1996:2: rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__3__Impl_in_rule__GrantedScenario__Group__33965);
            rule__GrantedScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__4_in_rule__GrantedScenario__Group__33968);
            rule__GrantedScenario__Group__4();

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
    // $ANTLR end "rule__GrantedScenario__Group__3"


    // $ANTLR start "rule__GrantedScenario__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2003:1: rule__GrantedScenario__Group__3__Impl : ( 'user' ) ;
    public final void rule__GrantedScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2007:1: ( ( 'user' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2008:1: ( 'user' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2008:1: ( 'user' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2009:1: 'user'
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__GrantedScenario__Group__3__Impl3996); 
             after(grammarAccess.getGrantedScenarioAccess().getUserKeyword_3()); 

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
    // $ANTLR end "rule__GrantedScenario__Group__3__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2022:1: rule__GrantedScenario__Group__4 : rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5 ;
    public final void rule__GrantedScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2026:1: ( rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2027:2: rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__4__Impl_in_rule__GrantedScenario__Group__44027);
            rule__GrantedScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__5_in_rule__GrantedScenario__Group__44030);
            rule__GrantedScenario__Group__5();

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
    // $ANTLR end "rule__GrantedScenario__Group__4"


    // $ANTLR start "rule__GrantedScenario__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2034:1: rule__GrantedScenario__Group__4__Impl : ( ( rule__GrantedScenario__UserAssignment_4 ) ) ;
    public final void rule__GrantedScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2038:1: ( ( ( rule__GrantedScenario__UserAssignment_4 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2039:1: ( ( rule__GrantedScenario__UserAssignment_4 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2039:1: ( ( rule__GrantedScenario__UserAssignment_4 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2040:1: ( rule__GrantedScenario__UserAssignment_4 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2041:1: ( rule__GrantedScenario__UserAssignment_4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2041:2: rule__GrantedScenario__UserAssignment_4
            {
            pushFollow(FOLLOW_rule__GrantedScenario__UserAssignment_4_in_rule__GrantedScenario__Group__4__Impl4057);
            rule__GrantedScenario__UserAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getUserAssignment_4()); 

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
    // $ANTLR end "rule__GrantedScenario__Group__4__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2051:1: rule__GrantedScenario__Group__5 : rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6 ;
    public final void rule__GrantedScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2055:1: ( rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2056:2: rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__5__Impl_in_rule__GrantedScenario__Group__54087);
            rule__GrantedScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__6_in_rule__GrantedScenario__Group__54090);
            rule__GrantedScenario__Group__6();

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
    // $ANTLR end "rule__GrantedScenario__Group__5"


    // $ANTLR start "rule__GrantedScenario__Group__5__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2063:1: rule__GrantedScenario__Group__5__Impl : ( ( rule__GrantedScenario__Group_5__0 )* ) ;
    public final void rule__GrantedScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2067:1: ( ( ( rule__GrantedScenario__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2068:1: ( ( rule__GrantedScenario__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2068:1: ( ( rule__GrantedScenario__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2069:1: ( rule__GrantedScenario__Group_5__0 )*
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2070:1: ( rule__GrantedScenario__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2070:2: rule__GrantedScenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__GrantedScenario__Group_5__0_in_rule__GrantedScenario__Group__5__Impl4117);
            	    rule__GrantedScenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getGrantedScenarioAccess().getGroup_5()); 

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
    // $ANTLR end "rule__GrantedScenario__Group__5__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2080:1: rule__GrantedScenario__Group__6 : rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7 ;
    public final void rule__GrantedScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2084:1: ( rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2085:2: rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__6__Impl_in_rule__GrantedScenario__Group__64148);
            rule__GrantedScenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__7_in_rule__GrantedScenario__Group__64151);
            rule__GrantedScenario__Group__7();

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
    // $ANTLR end "rule__GrantedScenario__Group__6"


    // $ANTLR start "rule__GrantedScenario__Group__6__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2092:1: rule__GrantedScenario__Group__6__Impl : ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) ) ;
    public final void rule__GrantedScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2096:1: ( ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2097:1: ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2097:1: ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2098:1: ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2098:1: ( ( rule__GrantedScenario__Group_6__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2099:1: ( rule__GrantedScenario__Group_6__0 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2100:1: ( rule__GrantedScenario__Group_6__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2100:2: rule__GrantedScenario__Group_6__0
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4180);
            rule__GrantedScenario__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2103:1: ( ( rule__GrantedScenario__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2104:1: ( rule__GrantedScenario__Group_6__0 )*
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2105:1: ( rule__GrantedScenario__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2105:2: rule__GrantedScenario__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4192);
            	    rule__GrantedScenario__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 

            }


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
    // $ANTLR end "rule__GrantedScenario__Group__6__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__7"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2116:1: rule__GrantedScenario__Group__7 : rule__GrantedScenario__Group__7__Impl ;
    public final void rule__GrantedScenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2120:1: ( rule__GrantedScenario__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2121:2: rule__GrantedScenario__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__7__Impl_in_rule__GrantedScenario__Group__74225);
            rule__GrantedScenario__Group__7__Impl();

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
    // $ANTLR end "rule__GrantedScenario__Group__7"


    // $ANTLR start "rule__GrantedScenario__Group__7__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2127:1: rule__GrantedScenario__Group__7__Impl : ( '}' ) ;
    public final void rule__GrantedScenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2131:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2132:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2132:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2133:1: '}'
            {
             before(grammarAccess.getGrantedScenarioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__GrantedScenario__Group__7__Impl4253); 
             after(grammarAccess.getGrantedScenarioAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__GrantedScenario__Group__7__Impl"


    // $ANTLR start "rule__GrantedScenario__Group_5__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2162:1: rule__GrantedScenario__Group_5__0 : rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1 ;
    public final void rule__GrantedScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2166:1: ( rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2167:2: rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__0__Impl_in_rule__GrantedScenario__Group_5__04300);
            rule__GrantedScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__1_in_rule__GrantedScenario__Group_5__04303);
            rule__GrantedScenario__Group_5__1();

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
    // $ANTLR end "rule__GrantedScenario__Group_5__0"


    // $ANTLR start "rule__GrantedScenario__Group_5__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2174:1: rule__GrantedScenario__Group_5__0__Impl : ( 'role' ) ;
    public final void rule__GrantedScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2178:1: ( ( 'role' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2179:1: ( 'role' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2179:1: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2180:1: 'role'
            {
             before(grammarAccess.getGrantedScenarioAccess().getRoleKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__GrantedScenario__Group_5__0__Impl4331); 
             after(grammarAccess.getGrantedScenarioAccess().getRoleKeyword_5_0()); 

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
    // $ANTLR end "rule__GrantedScenario__Group_5__0__Impl"


    // $ANTLR start "rule__GrantedScenario__Group_5__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2193:1: rule__GrantedScenario__Group_5__1 : rule__GrantedScenario__Group_5__1__Impl ;
    public final void rule__GrantedScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2197:1: ( rule__GrantedScenario__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2198:2: rule__GrantedScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__1__Impl_in_rule__GrantedScenario__Group_5__14362);
            rule__GrantedScenario__Group_5__1__Impl();

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
    // $ANTLR end "rule__GrantedScenario__Group_5__1"


    // $ANTLR start "rule__GrantedScenario__Group_5__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2204:1: rule__GrantedScenario__Group_5__1__Impl : ( ( rule__GrantedScenario__RolesAssignment_5_1 ) ) ;
    public final void rule__GrantedScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2208:1: ( ( ( rule__GrantedScenario__RolesAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2209:1: ( ( rule__GrantedScenario__RolesAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2209:1: ( ( rule__GrantedScenario__RolesAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2210:1: ( rule__GrantedScenario__RolesAssignment_5_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2211:1: ( rule__GrantedScenario__RolesAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2211:2: rule__GrantedScenario__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__RolesAssignment_5_1_in_rule__GrantedScenario__Group_5__1__Impl4389);
            rule__GrantedScenario__RolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getRolesAssignment_5_1()); 

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
    // $ANTLR end "rule__GrantedScenario__Group_5__1__Impl"


    // $ANTLR start "rule__GrantedScenario__Group_6__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2225:1: rule__GrantedScenario__Group_6__0 : rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1 ;
    public final void rule__GrantedScenario__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2229:1: ( rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2230:2: rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0__Impl_in_rule__GrantedScenario__Group_6__04423);
            rule__GrantedScenario__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__1_in_rule__GrantedScenario__Group_6__04426);
            rule__GrantedScenario__Group_6__1();

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
    // $ANTLR end "rule__GrantedScenario__Group_6__0"


    // $ANTLR start "rule__GrantedScenario__Group_6__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2237:1: rule__GrantedScenario__Group_6__0__Impl : ( 'object' ) ;
    public final void rule__GrantedScenario__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2241:1: ( ( 'object' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2242:1: ( 'object' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2242:1: ( 'object' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2243:1: 'object'
            {
             before(grammarAccess.getGrantedScenarioAccess().getObjectKeyword_6_0()); 
            match(input,20,FOLLOW_20_in_rule__GrantedScenario__Group_6__0__Impl4454); 
             after(grammarAccess.getGrantedScenarioAccess().getObjectKeyword_6_0()); 

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
    // $ANTLR end "rule__GrantedScenario__Group_6__0__Impl"


    // $ANTLR start "rule__GrantedScenario__Group_6__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2256:1: rule__GrantedScenario__Group_6__1 : rule__GrantedScenario__Group_6__1__Impl ;
    public final void rule__GrantedScenario__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2260:1: ( rule__GrantedScenario__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2261:2: rule__GrantedScenario__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__1__Impl_in_rule__GrantedScenario__Group_6__14485);
            rule__GrantedScenario__Group_6__1__Impl();

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
    // $ANTLR end "rule__GrantedScenario__Group_6__1"


    // $ANTLR start "rule__GrantedScenario__Group_6__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2267:1: rule__GrantedScenario__Group_6__1__Impl : ( ( rule__GrantedScenario__ObjectAssignment_6_1 ) ) ;
    public final void rule__GrantedScenario__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2271:1: ( ( ( rule__GrantedScenario__ObjectAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2272:1: ( ( rule__GrantedScenario__ObjectAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2272:1: ( ( rule__GrantedScenario__ObjectAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2273:1: ( rule__GrantedScenario__ObjectAssignment_6_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getObjectAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2274:1: ( rule__GrantedScenario__ObjectAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2274:2: rule__GrantedScenario__ObjectAssignment_6_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__ObjectAssignment_6_1_in_rule__GrantedScenario__Group_6__1__Impl4512);
            rule__GrantedScenario__ObjectAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getObjectAssignment_6_1()); 

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
    // $ANTLR end "rule__GrantedScenario__Group_6__1__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2288:1: rule__ForbiddenScenario__Group__0 : rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1 ;
    public final void rule__ForbiddenScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2292:1: ( rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2293:2: rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__0__Impl_in_rule__ForbiddenScenario__Group__04546);
            rule__ForbiddenScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__1_in_rule__ForbiddenScenario__Group__04549);
            rule__ForbiddenScenario__Group__1();

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
    // $ANTLR end "rule__ForbiddenScenario__Group__0"


    // $ANTLR start "rule__ForbiddenScenario__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2300:1: rule__ForbiddenScenario__Group__0__Impl : ( 'forbiddenScenario' ) ;
    public final void rule__ForbiddenScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2304:1: ( ( 'forbiddenScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2305:1: ( 'forbiddenScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2305:1: ( 'forbiddenScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2306:1: 'forbiddenScenario'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getForbiddenScenarioKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__ForbiddenScenario__Group__0__Impl4577); 
             after(grammarAccess.getForbiddenScenarioAccess().getForbiddenScenarioKeyword_0()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group__0__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2319:1: rule__ForbiddenScenario__Group__1 : rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2 ;
    public final void rule__ForbiddenScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2323:1: ( rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2324:2: rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__1__Impl_in_rule__ForbiddenScenario__Group__14608);
            rule__ForbiddenScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__2_in_rule__ForbiddenScenario__Group__14611);
            rule__ForbiddenScenario__Group__2();

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
    // $ANTLR end "rule__ForbiddenScenario__Group__1"


    // $ANTLR start "rule__ForbiddenScenario__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2331:1: rule__ForbiddenScenario__Group__1__Impl : ( ( rule__ForbiddenScenario__NameAssignment_1 ) ) ;
    public final void rule__ForbiddenScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2335:1: ( ( ( rule__ForbiddenScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2336:1: ( ( rule__ForbiddenScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2336:1: ( ( rule__ForbiddenScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2337:1: ( rule__ForbiddenScenario__NameAssignment_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2338:1: ( rule__ForbiddenScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2338:2: rule__ForbiddenScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__NameAssignment_1_in_rule__ForbiddenScenario__Group__1__Impl4638);
            rule__ForbiddenScenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group__1__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2348:1: rule__ForbiddenScenario__Group__2 : rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3 ;
    public final void rule__ForbiddenScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2352:1: ( rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2353:2: rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__2__Impl_in_rule__ForbiddenScenario__Group__24668);
            rule__ForbiddenScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__3_in_rule__ForbiddenScenario__Group__24671);
            rule__ForbiddenScenario__Group__3();

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
    // $ANTLR end "rule__ForbiddenScenario__Group__2"


    // $ANTLR start "rule__ForbiddenScenario__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2360:1: rule__ForbiddenScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__ForbiddenScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2364:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2365:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2365:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2366:1: '{'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ForbiddenScenario__Group__2__Impl4699); 
             after(grammarAccess.getForbiddenScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group__2__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2379:1: rule__ForbiddenScenario__Group__3 : rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4 ;
    public final void rule__ForbiddenScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2383:1: ( rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2384:2: rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__3__Impl_in_rule__ForbiddenScenario__Group__34730);
            rule__ForbiddenScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__4_in_rule__ForbiddenScenario__Group__34733);
            rule__ForbiddenScenario__Group__4();

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
    // $ANTLR end "rule__ForbiddenScenario__Group__3"


    // $ANTLR start "rule__ForbiddenScenario__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2391:1: rule__ForbiddenScenario__Group__3__Impl : ( 'user' ) ;
    public final void rule__ForbiddenScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2395:1: ( ( 'user' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2396:1: ( 'user' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2396:1: ( 'user' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2397:1: 'user'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__ForbiddenScenario__Group__3__Impl4761); 
             after(grammarAccess.getForbiddenScenarioAccess().getUserKeyword_3()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group__3__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2410:1: rule__ForbiddenScenario__Group__4 : rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5 ;
    public final void rule__ForbiddenScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2414:1: ( rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2415:2: rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__4__Impl_in_rule__ForbiddenScenario__Group__44792);
            rule__ForbiddenScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__5_in_rule__ForbiddenScenario__Group__44795);
            rule__ForbiddenScenario__Group__5();

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
    // $ANTLR end "rule__ForbiddenScenario__Group__4"


    // $ANTLR start "rule__ForbiddenScenario__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2422:1: rule__ForbiddenScenario__Group__4__Impl : ( ( rule__ForbiddenScenario__UserAssignment_4 ) ) ;
    public final void rule__ForbiddenScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2426:1: ( ( ( rule__ForbiddenScenario__UserAssignment_4 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2427:1: ( ( rule__ForbiddenScenario__UserAssignment_4 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2427:1: ( ( rule__ForbiddenScenario__UserAssignment_4 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2428:1: ( rule__ForbiddenScenario__UserAssignment_4 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2429:1: ( rule__ForbiddenScenario__UserAssignment_4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2429:2: rule__ForbiddenScenario__UserAssignment_4
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__UserAssignment_4_in_rule__ForbiddenScenario__Group__4__Impl4822);
            rule__ForbiddenScenario__UserAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getUserAssignment_4()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group__4__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group__5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2439:1: rule__ForbiddenScenario__Group__5 : rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6 ;
    public final void rule__ForbiddenScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2443:1: ( rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2444:2: rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__5__Impl_in_rule__ForbiddenScenario__Group__54852);
            rule__ForbiddenScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__6_in_rule__ForbiddenScenario__Group__54855);
            rule__ForbiddenScenario__Group__6();

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
    // $ANTLR end "rule__ForbiddenScenario__Group__5"


    // $ANTLR start "rule__ForbiddenScenario__Group__5__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2451:1: rule__ForbiddenScenario__Group__5__Impl : ( ( rule__ForbiddenScenario__Group_5__0 )* ) ;
    public final void rule__ForbiddenScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2455:1: ( ( ( rule__ForbiddenScenario__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2456:1: ( ( rule__ForbiddenScenario__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2456:1: ( ( rule__ForbiddenScenario__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2457:1: ( rule__ForbiddenScenario__Group_5__0 )*
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2458:1: ( rule__ForbiddenScenario__Group_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2458:2: rule__ForbiddenScenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__0_in_rule__ForbiddenScenario__Group__5__Impl4882);
            	    rule__ForbiddenScenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getForbiddenScenarioAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group__5__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group__6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2468:1: rule__ForbiddenScenario__Group__6 : rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7 ;
    public final void rule__ForbiddenScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2472:1: ( rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2473:2: rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__6__Impl_in_rule__ForbiddenScenario__Group__64913);
            rule__ForbiddenScenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__7_in_rule__ForbiddenScenario__Group__64916);
            rule__ForbiddenScenario__Group__7();

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
    // $ANTLR end "rule__ForbiddenScenario__Group__6"


    // $ANTLR start "rule__ForbiddenScenario__Group__6__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2480:1: rule__ForbiddenScenario__Group__6__Impl : ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) ) ;
    public final void rule__ForbiddenScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2484:1: ( ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2485:1: ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2485:1: ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2486:1: ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2486:1: ( ( rule__ForbiddenScenario__Group_6__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2487:1: ( rule__ForbiddenScenario__Group_6__0 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2488:1: ( rule__ForbiddenScenario__Group_6__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2488:2: rule__ForbiddenScenario__Group_6__0
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl4945);
            rule__ForbiddenScenario__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2491:1: ( ( rule__ForbiddenScenario__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2492:1: ( rule__ForbiddenScenario__Group_6__0 )*
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2493:1: ( rule__ForbiddenScenario__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2493:2: rule__ForbiddenScenario__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl4957);
            	    rule__ForbiddenScenario__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 

            }


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
    // $ANTLR end "rule__ForbiddenScenario__Group__6__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group__7"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2504:1: rule__ForbiddenScenario__Group__7 : rule__ForbiddenScenario__Group__7__Impl ;
    public final void rule__ForbiddenScenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2508:1: ( rule__ForbiddenScenario__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2509:2: rule__ForbiddenScenario__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__7__Impl_in_rule__ForbiddenScenario__Group__74990);
            rule__ForbiddenScenario__Group__7__Impl();

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
    // $ANTLR end "rule__ForbiddenScenario__Group__7"


    // $ANTLR start "rule__ForbiddenScenario__Group__7__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2515:1: rule__ForbiddenScenario__Group__7__Impl : ( '}' ) ;
    public final void rule__ForbiddenScenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2519:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2520:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2520:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2521:1: '}'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__ForbiddenScenario__Group__7__Impl5018); 
             after(grammarAccess.getForbiddenScenarioAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group__7__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group_5__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2550:1: rule__ForbiddenScenario__Group_5__0 : rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1 ;
    public final void rule__ForbiddenScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2554:1: ( rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2555:2: rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__0__Impl_in_rule__ForbiddenScenario__Group_5__05065);
            rule__ForbiddenScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__1_in_rule__ForbiddenScenario__Group_5__05068);
            rule__ForbiddenScenario__Group_5__1();

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
    // $ANTLR end "rule__ForbiddenScenario__Group_5__0"


    // $ANTLR start "rule__ForbiddenScenario__Group_5__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2562:1: rule__ForbiddenScenario__Group_5__0__Impl : ( 'role' ) ;
    public final void rule__ForbiddenScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2566:1: ( ( 'role' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2567:1: ( 'role' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2567:1: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2568:1: 'role'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRoleKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__ForbiddenScenario__Group_5__0__Impl5096); 
             after(grammarAccess.getForbiddenScenarioAccess().getRoleKeyword_5_0()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group_5__0__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group_5__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2581:1: rule__ForbiddenScenario__Group_5__1 : rule__ForbiddenScenario__Group_5__1__Impl ;
    public final void rule__ForbiddenScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2585:1: ( rule__ForbiddenScenario__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2586:2: rule__ForbiddenScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__1__Impl_in_rule__ForbiddenScenario__Group_5__15127);
            rule__ForbiddenScenario__Group_5__1__Impl();

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
    // $ANTLR end "rule__ForbiddenScenario__Group_5__1"


    // $ANTLR start "rule__ForbiddenScenario__Group_5__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2592:1: rule__ForbiddenScenario__Group_5__1__Impl : ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) ) ;
    public final void rule__ForbiddenScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2596:1: ( ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2597:1: ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2597:1: ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2598:1: ( rule__ForbiddenScenario__RolesAssignment_5_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2599:1: ( rule__ForbiddenScenario__RolesAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2599:2: rule__ForbiddenScenario__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__RolesAssignment_5_1_in_rule__ForbiddenScenario__Group_5__1__Impl5154);
            rule__ForbiddenScenario__RolesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getRolesAssignment_5_1()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group_5__1__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group_6__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2613:1: rule__ForbiddenScenario__Group_6__0 : rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1 ;
    public final void rule__ForbiddenScenario__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2617:1: ( rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2618:2: rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0__Impl_in_rule__ForbiddenScenario__Group_6__05188);
            rule__ForbiddenScenario__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__1_in_rule__ForbiddenScenario__Group_6__05191);
            rule__ForbiddenScenario__Group_6__1();

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
    // $ANTLR end "rule__ForbiddenScenario__Group_6__0"


    // $ANTLR start "rule__ForbiddenScenario__Group_6__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2625:1: rule__ForbiddenScenario__Group_6__0__Impl : ( 'object' ) ;
    public final void rule__ForbiddenScenario__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2629:1: ( ( 'object' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2630:1: ( 'object' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2630:1: ( 'object' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2631:1: 'object'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getObjectKeyword_6_0()); 
            match(input,20,FOLLOW_20_in_rule__ForbiddenScenario__Group_6__0__Impl5219); 
             after(grammarAccess.getForbiddenScenarioAccess().getObjectKeyword_6_0()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group_6__0__Impl"


    // $ANTLR start "rule__ForbiddenScenario__Group_6__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2644:1: rule__ForbiddenScenario__Group_6__1 : rule__ForbiddenScenario__Group_6__1__Impl ;
    public final void rule__ForbiddenScenario__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2648:1: ( rule__ForbiddenScenario__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2649:2: rule__ForbiddenScenario__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__1__Impl_in_rule__ForbiddenScenario__Group_6__15250);
            rule__ForbiddenScenario__Group_6__1__Impl();

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
    // $ANTLR end "rule__ForbiddenScenario__Group_6__1"


    // $ANTLR start "rule__ForbiddenScenario__Group_6__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2655:1: rule__ForbiddenScenario__Group_6__1__Impl : ( ( rule__ForbiddenScenario__ObjectAssignment_6_1 ) ) ;
    public final void rule__ForbiddenScenario__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2659:1: ( ( ( rule__ForbiddenScenario__ObjectAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2660:1: ( ( rule__ForbiddenScenario__ObjectAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2660:1: ( ( rule__ForbiddenScenario__ObjectAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2661:1: ( rule__ForbiddenScenario__ObjectAssignment_6_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getObjectAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2662:1: ( rule__ForbiddenScenario__ObjectAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2662:2: rule__ForbiddenScenario__ObjectAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__ObjectAssignment_6_1_in_rule__ForbiddenScenario__Group_6__1__Impl5277);
            rule__ForbiddenScenario__ObjectAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getObjectAssignment_6_1()); 

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
    // $ANTLR end "rule__ForbiddenScenario__Group_6__1__Impl"


    // $ANTLR start "rule__UserRoleScenario__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2676:1: rule__UserRoleScenario__Group__0 : rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1 ;
    public final void rule__UserRoleScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2680:1: ( rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2681:2: rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__0__Impl_in_rule__UserRoleScenario__Group__05311);
            rule__UserRoleScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__1_in_rule__UserRoleScenario__Group__05314);
            rule__UserRoleScenario__Group__1();

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
    // $ANTLR end "rule__UserRoleScenario__Group__0"


    // $ANTLR start "rule__UserRoleScenario__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2688:1: rule__UserRoleScenario__Group__0__Impl : ( 'userRoleScenario' ) ;
    public final void rule__UserRoleScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2692:1: ( ( 'userRoleScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2693:1: ( 'userRoleScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2693:1: ( 'userRoleScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2694:1: 'userRoleScenario'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getUserRoleScenarioKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__UserRoleScenario__Group__0__Impl5342); 
             after(grammarAccess.getUserRoleScenarioAccess().getUserRoleScenarioKeyword_0()); 

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
    // $ANTLR end "rule__UserRoleScenario__Group__0__Impl"


    // $ANTLR start "rule__UserRoleScenario__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2707:1: rule__UserRoleScenario__Group__1 : rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2 ;
    public final void rule__UserRoleScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2711:1: ( rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2712:2: rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__1__Impl_in_rule__UserRoleScenario__Group__15373);
            rule__UserRoleScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__2_in_rule__UserRoleScenario__Group__15376);
            rule__UserRoleScenario__Group__2();

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
    // $ANTLR end "rule__UserRoleScenario__Group__1"


    // $ANTLR start "rule__UserRoleScenario__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2719:1: rule__UserRoleScenario__Group__1__Impl : ( ( rule__UserRoleScenario__NameAssignment_1 ) ) ;
    public final void rule__UserRoleScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2723:1: ( ( ( rule__UserRoleScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2724:1: ( ( rule__UserRoleScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2724:1: ( ( rule__UserRoleScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2725:1: ( rule__UserRoleScenario__NameAssignment_1 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2726:1: ( rule__UserRoleScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2726:2: rule__UserRoleScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__NameAssignment_1_in_rule__UserRoleScenario__Group__1__Impl5403);
            rule__UserRoleScenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUserRoleScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UserRoleScenario__Group__1__Impl"


    // $ANTLR start "rule__UserRoleScenario__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2736:1: rule__UserRoleScenario__Group__2 : rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3 ;
    public final void rule__UserRoleScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2740:1: ( rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2741:2: rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__2__Impl_in_rule__UserRoleScenario__Group__25433);
            rule__UserRoleScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__3_in_rule__UserRoleScenario__Group__25436);
            rule__UserRoleScenario__Group__3();

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
    // $ANTLR end "rule__UserRoleScenario__Group__2"


    // $ANTLR start "rule__UserRoleScenario__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2748:1: rule__UserRoleScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__UserRoleScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2752:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2753:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2753:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2754:1: '{'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__UserRoleScenario__Group__2__Impl5464); 
             after(grammarAccess.getUserRoleScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__UserRoleScenario__Group__2__Impl"


    // $ANTLR start "rule__UserRoleScenario__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2767:1: rule__UserRoleScenario__Group__3 : rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4 ;
    public final void rule__UserRoleScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2771:1: ( rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2772:2: rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__3__Impl_in_rule__UserRoleScenario__Group__35495);
            rule__UserRoleScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__4_in_rule__UserRoleScenario__Group__35498);
            rule__UserRoleScenario__Group__4();

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
    // $ANTLR end "rule__UserRoleScenario__Group__3"


    // $ANTLR start "rule__UserRoleScenario__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2779:1: rule__UserRoleScenario__Group__3__Impl : ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) ) ;
    public final void rule__UserRoleScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2783:1: ( ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2784:1: ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2784:1: ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2785:1: ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2785:1: ( ( rule__UserRoleScenario__Group_3__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2786:1: ( rule__UserRoleScenario__Group_3__0 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2787:1: ( rule__UserRoleScenario__Group_3__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2787:2: rule__UserRoleScenario__Group_3__0
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5527);
            rule__UserRoleScenario__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2790:1: ( ( rule__UserRoleScenario__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2791:1: ( rule__UserRoleScenario__Group_3__0 )*
            {
             before(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2792:1: ( rule__UserRoleScenario__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2792:2: rule__UserRoleScenario__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5539);
            	    rule__UserRoleScenario__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 

            }


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
    // $ANTLR end "rule__UserRoleScenario__Group__3__Impl"


    // $ANTLR start "rule__UserRoleScenario__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2803:1: rule__UserRoleScenario__Group__4 : rule__UserRoleScenario__Group__4__Impl ;
    public final void rule__UserRoleScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2807:1: ( rule__UserRoleScenario__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2808:2: rule__UserRoleScenario__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__4__Impl_in_rule__UserRoleScenario__Group__45572);
            rule__UserRoleScenario__Group__4__Impl();

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
    // $ANTLR end "rule__UserRoleScenario__Group__4"


    // $ANTLR start "rule__UserRoleScenario__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2814:1: rule__UserRoleScenario__Group__4__Impl : ( '}' ) ;
    public final void rule__UserRoleScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2818:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2819:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2819:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2820:1: '}'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__UserRoleScenario__Group__4__Impl5600); 
             after(grammarAccess.getUserRoleScenarioAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__UserRoleScenario__Group__4__Impl"


    // $ANTLR start "rule__UserRoleScenario__Group_3__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2843:1: rule__UserRoleScenario__Group_3__0 : rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1 ;
    public final void rule__UserRoleScenario__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2847:1: ( rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2848:2: rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0__Impl_in_rule__UserRoleScenario__Group_3__05641);
            rule__UserRoleScenario__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__1_in_rule__UserRoleScenario__Group_3__05644);
            rule__UserRoleScenario__Group_3__1();

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
    // $ANTLR end "rule__UserRoleScenario__Group_3__0"


    // $ANTLR start "rule__UserRoleScenario__Group_3__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2855:1: rule__UserRoleScenario__Group_3__0__Impl : ( 'role' ) ;
    public final void rule__UserRoleScenario__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2859:1: ( ( 'role' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2860:1: ( 'role' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2860:1: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2861:1: 'role'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRoleKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__UserRoleScenario__Group_3__0__Impl5672); 
             after(grammarAccess.getUserRoleScenarioAccess().getRoleKeyword_3_0()); 

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
    // $ANTLR end "rule__UserRoleScenario__Group_3__0__Impl"


    // $ANTLR start "rule__UserRoleScenario__Group_3__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2874:1: rule__UserRoleScenario__Group_3__1 : rule__UserRoleScenario__Group_3__1__Impl ;
    public final void rule__UserRoleScenario__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2878:1: ( rule__UserRoleScenario__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2879:2: rule__UserRoleScenario__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__1__Impl_in_rule__UserRoleScenario__Group_3__15703);
            rule__UserRoleScenario__Group_3__1__Impl();

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
    // $ANTLR end "rule__UserRoleScenario__Group_3__1"


    // $ANTLR start "rule__UserRoleScenario__Group_3__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2885:1: rule__UserRoleScenario__Group_3__1__Impl : ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) ) ;
    public final void rule__UserRoleScenario__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2889:1: ( ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2890:1: ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2890:1: ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2891:1: ( rule__UserRoleScenario__RolesAssignment_3_1 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2892:1: ( rule__UserRoleScenario__RolesAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2892:2: rule__UserRoleScenario__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__RolesAssignment_3_1_in_rule__UserRoleScenario__Group_3__1__Impl5730);
            rule__UserRoleScenario__RolesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUserRoleScenarioAccess().getRolesAssignment_3_1()); 

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
    // $ANTLR end "rule__UserRoleScenario__Group_3__1__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2906:1: rule__ObjectRoleScenario__Group__0 : rule__ObjectRoleScenario__Group__0__Impl rule__ObjectRoleScenario__Group__1 ;
    public final void rule__ObjectRoleScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2910:1: ( rule__ObjectRoleScenario__Group__0__Impl rule__ObjectRoleScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2911:2: rule__ObjectRoleScenario__Group__0__Impl rule__ObjectRoleScenario__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__0__Impl_in_rule__ObjectRoleScenario__Group__05764);
            rule__ObjectRoleScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__1_in_rule__ObjectRoleScenario__Group__05767);
            rule__ObjectRoleScenario__Group__1();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__0"


    // $ANTLR start "rule__ObjectRoleScenario__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2918:1: rule__ObjectRoleScenario__Group__0__Impl : ( 'objectRoleScenario' ) ;
    public final void rule__ObjectRoleScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2922:1: ( ( 'objectRoleScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2923:1: ( 'objectRoleScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2923:1: ( 'objectRoleScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2924:1: 'objectRoleScenario'
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getObjectRoleScenarioKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ObjectRoleScenario__Group__0__Impl5795); 
             after(grammarAccess.getObjectRoleScenarioAccess().getObjectRoleScenarioKeyword_0()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__0__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2937:1: rule__ObjectRoleScenario__Group__1 : rule__ObjectRoleScenario__Group__1__Impl rule__ObjectRoleScenario__Group__2 ;
    public final void rule__ObjectRoleScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2941:1: ( rule__ObjectRoleScenario__Group__1__Impl rule__ObjectRoleScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2942:2: rule__ObjectRoleScenario__Group__1__Impl rule__ObjectRoleScenario__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__1__Impl_in_rule__ObjectRoleScenario__Group__15826);
            rule__ObjectRoleScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__2_in_rule__ObjectRoleScenario__Group__15829);
            rule__ObjectRoleScenario__Group__2();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__1"


    // $ANTLR start "rule__ObjectRoleScenario__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2949:1: rule__ObjectRoleScenario__Group__1__Impl : ( ( rule__ObjectRoleScenario__NameAssignment_1 ) ) ;
    public final void rule__ObjectRoleScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2953:1: ( ( ( rule__ObjectRoleScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2954:1: ( ( rule__ObjectRoleScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2954:1: ( ( rule__ObjectRoleScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2955:1: ( rule__ObjectRoleScenario__NameAssignment_1 )
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2956:1: ( rule__ObjectRoleScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2956:2: rule__ObjectRoleScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__NameAssignment_1_in_rule__ObjectRoleScenario__Group__1__Impl5856);
            rule__ObjectRoleScenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectRoleScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__1__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2966:1: rule__ObjectRoleScenario__Group__2 : rule__ObjectRoleScenario__Group__2__Impl rule__ObjectRoleScenario__Group__3 ;
    public final void rule__ObjectRoleScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2970:1: ( rule__ObjectRoleScenario__Group__2__Impl rule__ObjectRoleScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2971:2: rule__ObjectRoleScenario__Group__2__Impl rule__ObjectRoleScenario__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__2__Impl_in_rule__ObjectRoleScenario__Group__25886);
            rule__ObjectRoleScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__3_in_rule__ObjectRoleScenario__Group__25889);
            rule__ObjectRoleScenario__Group__3();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__2"


    // $ANTLR start "rule__ObjectRoleScenario__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2978:1: rule__ObjectRoleScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__ObjectRoleScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2982:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2983:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2983:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2984:1: '{'
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ObjectRoleScenario__Group__2__Impl5917); 
             after(grammarAccess.getObjectRoleScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__2__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2997:1: rule__ObjectRoleScenario__Group__3 : rule__ObjectRoleScenario__Group__3__Impl rule__ObjectRoleScenario__Group__4 ;
    public final void rule__ObjectRoleScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3001:1: ( rule__ObjectRoleScenario__Group__3__Impl rule__ObjectRoleScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3002:2: rule__ObjectRoleScenario__Group__3__Impl rule__ObjectRoleScenario__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__3__Impl_in_rule__ObjectRoleScenario__Group__35948);
            rule__ObjectRoleScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__4_in_rule__ObjectRoleScenario__Group__35951);
            rule__ObjectRoleScenario__Group__4();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__3"


    // $ANTLR start "rule__ObjectRoleScenario__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3009:1: rule__ObjectRoleScenario__Group__3__Impl : ( 'role' ) ;
    public final void rule__ObjectRoleScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3013:1: ( ( 'role' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3014:1: ( 'role' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3014:1: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3015:1: 'role'
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getRoleKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__ObjectRoleScenario__Group__3__Impl5979); 
             after(grammarAccess.getObjectRoleScenarioAccess().getRoleKeyword_3()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__3__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3028:1: rule__ObjectRoleScenario__Group__4 : rule__ObjectRoleScenario__Group__4__Impl rule__ObjectRoleScenario__Group__5 ;
    public final void rule__ObjectRoleScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3032:1: ( rule__ObjectRoleScenario__Group__4__Impl rule__ObjectRoleScenario__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3033:2: rule__ObjectRoleScenario__Group__4__Impl rule__ObjectRoleScenario__Group__5
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__4__Impl_in_rule__ObjectRoleScenario__Group__46010);
            rule__ObjectRoleScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__5_in_rule__ObjectRoleScenario__Group__46013);
            rule__ObjectRoleScenario__Group__5();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__4"


    // $ANTLR start "rule__ObjectRoleScenario__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3040:1: rule__ObjectRoleScenario__Group__4__Impl : ( ( rule__ObjectRoleScenario__RoleAssignment_4 ) ) ;
    public final void rule__ObjectRoleScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3044:1: ( ( ( rule__ObjectRoleScenario__RoleAssignment_4 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3045:1: ( ( rule__ObjectRoleScenario__RoleAssignment_4 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3045:1: ( ( rule__ObjectRoleScenario__RoleAssignment_4 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3046:1: ( rule__ObjectRoleScenario__RoleAssignment_4 )
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getRoleAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3047:1: ( rule__ObjectRoleScenario__RoleAssignment_4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3047:2: rule__ObjectRoleScenario__RoleAssignment_4
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__RoleAssignment_4_in_rule__ObjectRoleScenario__Group__4__Impl6040);
            rule__ObjectRoleScenario__RoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getObjectRoleScenarioAccess().getRoleAssignment_4()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__4__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group__5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3057:1: rule__ObjectRoleScenario__Group__5 : rule__ObjectRoleScenario__Group__5__Impl rule__ObjectRoleScenario__Group__6 ;
    public final void rule__ObjectRoleScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3061:1: ( rule__ObjectRoleScenario__Group__5__Impl rule__ObjectRoleScenario__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3062:2: rule__ObjectRoleScenario__Group__5__Impl rule__ObjectRoleScenario__Group__6
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__5__Impl_in_rule__ObjectRoleScenario__Group__56070);
            rule__ObjectRoleScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__6_in_rule__ObjectRoleScenario__Group__56073);
            rule__ObjectRoleScenario__Group__6();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__5"


    // $ANTLR start "rule__ObjectRoleScenario__Group__5__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3069:1: rule__ObjectRoleScenario__Group__5__Impl : ( ( ( rule__ObjectRoleScenario__Group_5__0 ) ) ( ( rule__ObjectRoleScenario__Group_5__0 )* ) ) ;
    public final void rule__ObjectRoleScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3073:1: ( ( ( ( rule__ObjectRoleScenario__Group_5__0 ) ) ( ( rule__ObjectRoleScenario__Group_5__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3074:1: ( ( ( rule__ObjectRoleScenario__Group_5__0 ) ) ( ( rule__ObjectRoleScenario__Group_5__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3074:1: ( ( ( rule__ObjectRoleScenario__Group_5__0 ) ) ( ( rule__ObjectRoleScenario__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3075:1: ( ( rule__ObjectRoleScenario__Group_5__0 ) ) ( ( rule__ObjectRoleScenario__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3075:1: ( ( rule__ObjectRoleScenario__Group_5__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3076:1: ( rule__ObjectRoleScenario__Group_5__0 )
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3077:1: ( rule__ObjectRoleScenario__Group_5__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3077:2: rule__ObjectRoleScenario__Group_5__0
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group_5__0_in_rule__ObjectRoleScenario__Group__5__Impl6102);
            rule__ObjectRoleScenario__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectRoleScenarioAccess().getGroup_5()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3080:1: ( ( rule__ObjectRoleScenario__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3081:1: ( rule__ObjectRoleScenario__Group_5__0 )*
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3082:1: ( rule__ObjectRoleScenario__Group_5__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3082:2: rule__ObjectRoleScenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ObjectRoleScenario__Group_5__0_in_rule__ObjectRoleScenario__Group__5__Impl6114);
            	    rule__ObjectRoleScenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getObjectRoleScenarioAccess().getGroup_5()); 

            }


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
    // $ANTLR end "rule__ObjectRoleScenario__Group__5__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group__6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3093:1: rule__ObjectRoleScenario__Group__6 : rule__ObjectRoleScenario__Group__6__Impl ;
    public final void rule__ObjectRoleScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3097:1: ( rule__ObjectRoleScenario__Group__6__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3098:2: rule__ObjectRoleScenario__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group__6__Impl_in_rule__ObjectRoleScenario__Group__66147);
            rule__ObjectRoleScenario__Group__6__Impl();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__6"


    // $ANTLR start "rule__ObjectRoleScenario__Group__6__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3104:1: rule__ObjectRoleScenario__Group__6__Impl : ( '}' ) ;
    public final void rule__ObjectRoleScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3108:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3109:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3109:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3110:1: '}'
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__ObjectRoleScenario__Group__6__Impl6175); 
             after(grammarAccess.getObjectRoleScenarioAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__Group__6__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group_5__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3137:1: rule__ObjectRoleScenario__Group_5__0 : rule__ObjectRoleScenario__Group_5__0__Impl rule__ObjectRoleScenario__Group_5__1 ;
    public final void rule__ObjectRoleScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3141:1: ( rule__ObjectRoleScenario__Group_5__0__Impl rule__ObjectRoleScenario__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3142:2: rule__ObjectRoleScenario__Group_5__0__Impl rule__ObjectRoleScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group_5__0__Impl_in_rule__ObjectRoleScenario__Group_5__06220);
            rule__ObjectRoleScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group_5__1_in_rule__ObjectRoleScenario__Group_5__06223);
            rule__ObjectRoleScenario__Group_5__1();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group_5__0"


    // $ANTLR start "rule__ObjectRoleScenario__Group_5__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3149:1: rule__ObjectRoleScenario__Group_5__0__Impl : ( 'object' ) ;
    public final void rule__ObjectRoleScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3153:1: ( ( 'object' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3154:1: ( 'object' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3154:1: ( 'object' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3155:1: 'object'
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getObjectKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__ObjectRoleScenario__Group_5__0__Impl6251); 
             after(grammarAccess.getObjectRoleScenarioAccess().getObjectKeyword_5_0()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__Group_5__0__Impl"


    // $ANTLR start "rule__ObjectRoleScenario__Group_5__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3168:1: rule__ObjectRoleScenario__Group_5__1 : rule__ObjectRoleScenario__Group_5__1__Impl ;
    public final void rule__ObjectRoleScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3172:1: ( rule__ObjectRoleScenario__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3173:2: rule__ObjectRoleScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__Group_5__1__Impl_in_rule__ObjectRoleScenario__Group_5__16282);
            rule__ObjectRoleScenario__Group_5__1__Impl();

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
    // $ANTLR end "rule__ObjectRoleScenario__Group_5__1"


    // $ANTLR start "rule__ObjectRoleScenario__Group_5__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3179:1: rule__ObjectRoleScenario__Group_5__1__Impl : ( ( rule__ObjectRoleScenario__AssignmentAssignment_5_1 ) ) ;
    public final void rule__ObjectRoleScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3183:1: ( ( ( rule__ObjectRoleScenario__AssignmentAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3184:1: ( ( rule__ObjectRoleScenario__AssignmentAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3184:1: ( ( rule__ObjectRoleScenario__AssignmentAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3185:1: ( rule__ObjectRoleScenario__AssignmentAssignment_5_1 )
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getAssignmentAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3186:1: ( rule__ObjectRoleScenario__AssignmentAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3186:2: rule__ObjectRoleScenario__AssignmentAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ObjectRoleScenario__AssignmentAssignment_5_1_in_rule__ObjectRoleScenario__Group_5__1__Impl6309);
            rule__ObjectRoleScenario__AssignmentAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectRoleScenarioAccess().getAssignmentAssignment_5_1()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__Group_5__1__Impl"


    // $ANTLR start "rule__ObjectScenario__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3200:1: rule__ObjectScenario__Group__0 : rule__ObjectScenario__Group__0__Impl rule__ObjectScenario__Group__1 ;
    public final void rule__ObjectScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3204:1: ( rule__ObjectScenario__Group__0__Impl rule__ObjectScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3205:2: rule__ObjectScenario__Group__0__Impl rule__ObjectScenario__Group__1
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group__0__Impl_in_rule__ObjectScenario__Group__06343);
            rule__ObjectScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectScenario__Group__1_in_rule__ObjectScenario__Group__06346);
            rule__ObjectScenario__Group__1();

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
    // $ANTLR end "rule__ObjectScenario__Group__0"


    // $ANTLR start "rule__ObjectScenario__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3212:1: rule__ObjectScenario__Group__0__Impl : ( 'objectScenario' ) ;
    public final void rule__ObjectScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3216:1: ( ( 'objectScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3217:1: ( 'objectScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3217:1: ( 'objectScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3218:1: 'objectScenario'
            {
             before(grammarAccess.getObjectScenarioAccess().getObjectScenarioKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ObjectScenario__Group__0__Impl6374); 
             after(grammarAccess.getObjectScenarioAccess().getObjectScenarioKeyword_0()); 

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
    // $ANTLR end "rule__ObjectScenario__Group__0__Impl"


    // $ANTLR start "rule__ObjectScenario__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3231:1: rule__ObjectScenario__Group__1 : rule__ObjectScenario__Group__1__Impl rule__ObjectScenario__Group__2 ;
    public final void rule__ObjectScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3235:1: ( rule__ObjectScenario__Group__1__Impl rule__ObjectScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3236:2: rule__ObjectScenario__Group__1__Impl rule__ObjectScenario__Group__2
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group__1__Impl_in_rule__ObjectScenario__Group__16405);
            rule__ObjectScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectScenario__Group__2_in_rule__ObjectScenario__Group__16408);
            rule__ObjectScenario__Group__2();

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
    // $ANTLR end "rule__ObjectScenario__Group__1"


    // $ANTLR start "rule__ObjectScenario__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3243:1: rule__ObjectScenario__Group__1__Impl : ( ( rule__ObjectScenario__NameAssignment_1 ) ) ;
    public final void rule__ObjectScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3247:1: ( ( ( rule__ObjectScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3248:1: ( ( rule__ObjectScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3248:1: ( ( rule__ObjectScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3249:1: ( rule__ObjectScenario__NameAssignment_1 )
            {
             before(grammarAccess.getObjectScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3250:1: ( rule__ObjectScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3250:2: rule__ObjectScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjectScenario__NameAssignment_1_in_rule__ObjectScenario__Group__1__Impl6435);
            rule__ObjectScenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ObjectScenario__Group__1__Impl"


    // $ANTLR start "rule__ObjectScenario__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3260:1: rule__ObjectScenario__Group__2 : rule__ObjectScenario__Group__2__Impl rule__ObjectScenario__Group__3 ;
    public final void rule__ObjectScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3264:1: ( rule__ObjectScenario__Group__2__Impl rule__ObjectScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3265:2: rule__ObjectScenario__Group__2__Impl rule__ObjectScenario__Group__3
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group__2__Impl_in_rule__ObjectScenario__Group__26465);
            rule__ObjectScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectScenario__Group__3_in_rule__ObjectScenario__Group__26468);
            rule__ObjectScenario__Group__3();

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
    // $ANTLR end "rule__ObjectScenario__Group__2"


    // $ANTLR start "rule__ObjectScenario__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3272:1: rule__ObjectScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__ObjectScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3276:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3277:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3277:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3278:1: '{'
            {
             before(grammarAccess.getObjectScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ObjectScenario__Group__2__Impl6496); 
             after(grammarAccess.getObjectScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ObjectScenario__Group__2__Impl"


    // $ANTLR start "rule__ObjectScenario__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3291:1: rule__ObjectScenario__Group__3 : rule__ObjectScenario__Group__3__Impl rule__ObjectScenario__Group__4 ;
    public final void rule__ObjectScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3295:1: ( rule__ObjectScenario__Group__3__Impl rule__ObjectScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3296:2: rule__ObjectScenario__Group__3__Impl rule__ObjectScenario__Group__4
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group__3__Impl_in_rule__ObjectScenario__Group__36527);
            rule__ObjectScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectScenario__Group__4_in_rule__ObjectScenario__Group__36530);
            rule__ObjectScenario__Group__4();

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
    // $ANTLR end "rule__ObjectScenario__Group__3"


    // $ANTLR start "rule__ObjectScenario__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3303:1: rule__ObjectScenario__Group__3__Impl : ( ( ( rule__ObjectScenario__Group_3__0 ) ) ( ( rule__ObjectScenario__Group_3__0 )* ) ) ;
    public final void rule__ObjectScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3307:1: ( ( ( ( rule__ObjectScenario__Group_3__0 ) ) ( ( rule__ObjectScenario__Group_3__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3308:1: ( ( ( rule__ObjectScenario__Group_3__0 ) ) ( ( rule__ObjectScenario__Group_3__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3308:1: ( ( ( rule__ObjectScenario__Group_3__0 ) ) ( ( rule__ObjectScenario__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3309:1: ( ( rule__ObjectScenario__Group_3__0 ) ) ( ( rule__ObjectScenario__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3309:1: ( ( rule__ObjectScenario__Group_3__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3310:1: ( rule__ObjectScenario__Group_3__0 )
            {
             before(grammarAccess.getObjectScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3311:1: ( rule__ObjectScenario__Group_3__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3311:2: rule__ObjectScenario__Group_3__0
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group_3__0_in_rule__ObjectScenario__Group__3__Impl6559);
            rule__ObjectScenario__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectScenarioAccess().getGroup_3()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3314:1: ( ( rule__ObjectScenario__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3315:1: ( rule__ObjectScenario__Group_3__0 )*
            {
             before(grammarAccess.getObjectScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3316:1: ( rule__ObjectScenario__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3316:2: rule__ObjectScenario__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ObjectScenario__Group_3__0_in_rule__ObjectScenario__Group__3__Impl6571);
            	    rule__ObjectScenario__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getObjectScenarioAccess().getGroup_3()); 

            }


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
    // $ANTLR end "rule__ObjectScenario__Group__3__Impl"


    // $ANTLR start "rule__ObjectScenario__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3327:1: rule__ObjectScenario__Group__4 : rule__ObjectScenario__Group__4__Impl ;
    public final void rule__ObjectScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3331:1: ( rule__ObjectScenario__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3332:2: rule__ObjectScenario__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group__4__Impl_in_rule__ObjectScenario__Group__46604);
            rule__ObjectScenario__Group__4__Impl();

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
    // $ANTLR end "rule__ObjectScenario__Group__4"


    // $ANTLR start "rule__ObjectScenario__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3338:1: rule__ObjectScenario__Group__4__Impl : ( '}' ) ;
    public final void rule__ObjectScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3342:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3343:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3343:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3344:1: '}'
            {
             before(grammarAccess.getObjectScenarioAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ObjectScenario__Group__4__Impl6632); 
             after(grammarAccess.getObjectScenarioAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ObjectScenario__Group__4__Impl"


    // $ANTLR start "rule__ObjectScenario__Group_3__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3367:1: rule__ObjectScenario__Group_3__0 : rule__ObjectScenario__Group_3__0__Impl rule__ObjectScenario__Group_3__1 ;
    public final void rule__ObjectScenario__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3371:1: ( rule__ObjectScenario__Group_3__0__Impl rule__ObjectScenario__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3372:2: rule__ObjectScenario__Group_3__0__Impl rule__ObjectScenario__Group_3__1
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group_3__0__Impl_in_rule__ObjectScenario__Group_3__06673);
            rule__ObjectScenario__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjectScenario__Group_3__1_in_rule__ObjectScenario__Group_3__06676);
            rule__ObjectScenario__Group_3__1();

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
    // $ANTLR end "rule__ObjectScenario__Group_3__0"


    // $ANTLR start "rule__ObjectScenario__Group_3__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3379:1: rule__ObjectScenario__Group_3__0__Impl : ( 'object' ) ;
    public final void rule__ObjectScenario__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3383:1: ( ( 'object' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3384:1: ( 'object' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3384:1: ( 'object' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3385:1: 'object'
            {
             before(grammarAccess.getObjectScenarioAccess().getObjectKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__ObjectScenario__Group_3__0__Impl6704); 
             after(grammarAccess.getObjectScenarioAccess().getObjectKeyword_3_0()); 

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
    // $ANTLR end "rule__ObjectScenario__Group_3__0__Impl"


    // $ANTLR start "rule__ObjectScenario__Group_3__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3398:1: rule__ObjectScenario__Group_3__1 : rule__ObjectScenario__Group_3__1__Impl ;
    public final void rule__ObjectScenario__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3402:1: ( rule__ObjectScenario__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3403:2: rule__ObjectScenario__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ObjectScenario__Group_3__1__Impl_in_rule__ObjectScenario__Group_3__16735);
            rule__ObjectScenario__Group_3__1__Impl();

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
    // $ANTLR end "rule__ObjectScenario__Group_3__1"


    // $ANTLR start "rule__ObjectScenario__Group_3__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3409:1: rule__ObjectScenario__Group_3__1__Impl : ( ( rule__ObjectScenario__AssignmentAssignment_3_1 ) ) ;
    public final void rule__ObjectScenario__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3413:1: ( ( ( rule__ObjectScenario__AssignmentAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3414:1: ( ( rule__ObjectScenario__AssignmentAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3414:1: ( ( rule__ObjectScenario__AssignmentAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3415:1: ( rule__ObjectScenario__AssignmentAssignment_3_1 )
            {
             before(grammarAccess.getObjectScenarioAccess().getAssignmentAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3416:1: ( rule__ObjectScenario__AssignmentAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3416:2: rule__ObjectScenario__AssignmentAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ObjectScenario__AssignmentAssignment_3_1_in_rule__ObjectScenario__Group_3__1__Impl6762);
            rule__ObjectScenario__AssignmentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectScenarioAccess().getAssignmentAssignment_3_1()); 

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
    // $ANTLR end "rule__ObjectScenario__Group_3__1__Impl"


    // $ANTLR start "rule__Rbac__PolicyElementsAssignment_2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3431:1: rule__Rbac__PolicyElementsAssignment_2 : ( rulePolicyElement ) ;
    public final void rule__Rbac__PolicyElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3435:1: ( ( rulePolicyElement ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3436:1: ( rulePolicyElement )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3436:1: ( rulePolicyElement )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3437:1: rulePolicyElement
            {
             before(grammarAccess.getRbacAccess().getPolicyElementsPolicyElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePolicyElement_in_rule__Rbac__PolicyElementsAssignment_26801);
            rulePolicyElement();

            state._fsp--;

             after(grammarAccess.getRbacAccess().getPolicyElementsPolicyElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Rbac__PolicyElementsAssignment_2"


    // $ANTLR start "rule__Rbac__ScenarioElementsAssignment_6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3446:1: rule__Rbac__ScenarioElementsAssignment_6 : ( ruleScenarioElement ) ;
    public final void rule__Rbac__ScenarioElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3450:1: ( ( ruleScenarioElement ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3451:1: ( ruleScenarioElement )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3451:1: ( ruleScenarioElement )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3452:1: ruleScenarioElement
            {
             before(grammarAccess.getRbacAccess().getScenarioElementsScenarioElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleScenarioElement_in_rule__Rbac__ScenarioElementsAssignment_66832);
            ruleScenarioElement();

            state._fsp--;

             after(grammarAccess.getRbacAccess().getScenarioElementsScenarioElementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Rbac__ScenarioElementsAssignment_6"


    // $ANTLR start "rule__User__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3461:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3465:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3466:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3466:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3467:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_16863); 
             after(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__User__NameAssignment_1"


    // $ANTLR start "rule__User__RolesAssignment_3_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3476:1: rule__User__RolesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__User__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3480:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3481:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3481:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3482:1: ( RULE_ID )
            {
             before(grammarAccess.getUserAccess().getRolesRoleCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3483:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3484:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__RolesAssignment_3_16898); 
             after(grammarAccess.getUserAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getUserAccess().getRolesRoleCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__User__RolesAssignment_3_1"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3495:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3499:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3500:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3500:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3501:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_16933); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__ParentAssignment_2_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3510:1: rule__Role__ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3514:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3515:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3515:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3516:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getParentRoleCrossReference_2_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3517:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3518:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getParentRoleIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__ParentAssignment_2_16968); 
             after(grammarAccess.getRoleAccess().getParentRoleIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getParentRoleCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Role__ParentAssignment_2_1"


    // $ANTLR start "rule__Role__SsodAssignment_4_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3529:1: rule__Role__SsodAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__SsodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3533:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3534:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3534:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3535:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getSsodRoleCrossReference_4_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3536:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3537:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getSsodRoleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__SsodAssignment_4_17007); 
             after(grammarAccess.getRoleAccess().getSsodRoleIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getSsodRoleCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Role__SsodAssignment_4_1"


    // $ANTLR start "rule__Role__DsodAssignment_5_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3548:1: rule__Role__DsodAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__DsodAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3552:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3553:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3553:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3554:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getDsodRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3555:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3556:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getDsodRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__DsodAssignment_5_17046); 
             after(grammarAccess.getRoleAccess().getDsodRoleIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getDsodRoleCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Role__DsodAssignment_5_1"


    // $ANTLR start "rule__Role__AssignmentsAssignment_6_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3567:1: rule__Role__AssignmentsAssignment_6_1 : ( ruleAssignment ) ;
    public final void rule__Role__AssignmentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3571:1: ( ( ruleAssignment ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3572:1: ( ruleAssignment )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3572:1: ( ruleAssignment )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3573:1: ruleAssignment
            {
             before(grammarAccess.getRoleAccess().getAssignmentsAssignmentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__Role__AssignmentsAssignment_6_17081);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getAssignmentsAssignmentParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Role__AssignmentsAssignment_6_1"


    // $ANTLR start "rule__Assignment__ObjectAssignment_0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3582:1: rule__Assignment__ObjectAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__ObjectAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3586:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3587:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3587:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3588:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getObjectRBACObjectCrossReference_0_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3589:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3590:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getObjectRBACObjectIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__ObjectAssignment_07116); 
             after(grammarAccess.getAssignmentAccess().getObjectRBACObjectIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getObjectRBACObjectCrossReference_0_0()); 

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
    // $ANTLR end "rule__Assignment__ObjectAssignment_0"


    // $ANTLR start "rule__Assignment__ActionsAssignment_2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3601:1: rule__Assignment__ActionsAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3605:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3606:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3606:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3607:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getActionsPermissionCrossReference_2_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3608:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3609:1: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getActionsPermissionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__ActionsAssignment_27155); 
             after(grammarAccess.getAssignmentAccess().getActionsPermissionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getActionsPermissionCrossReference_2_0()); 

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
    // $ANTLR end "rule__Assignment__ActionsAssignment_2"


    // $ANTLR start "rule__Permission__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3620:1: rule__Permission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Permission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3624:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3625:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3625:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3626:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__NameAssignment_17190); 
             after(grammarAccess.getPermissionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Permission__NameAssignment_1"


    // $ANTLR start "rule__RBACObject__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3635:1: rule__RBACObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RBACObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3639:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3640:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3640:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3641:1: RULE_ID
            {
             before(grammarAccess.getRBACObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RBACObject__NameAssignment_17221); 
             after(grammarAccess.getRBACObjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RBACObject__NameAssignment_1"


    // $ANTLR start "rule__RBACObject__PermissionsAssignment_3_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3650:1: rule__RBACObject__PermissionsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__RBACObject__PermissionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3654:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3655:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3655:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3656:1: ( RULE_ID )
            {
             before(grammarAccess.getRBACObjectAccess().getPermissionsPermissionCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3657:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3658:1: RULE_ID
            {
             before(grammarAccess.getRBACObjectAccess().getPermissionsPermissionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RBACObject__PermissionsAssignment_3_17256); 
             after(grammarAccess.getRBACObjectAccess().getPermissionsPermissionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getRBACObjectAccess().getPermissionsPermissionCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__RBACObject__PermissionsAssignment_3_1"


    // $ANTLR start "rule__GrantedScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3669:1: rule__GrantedScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GrantedScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3673:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3674:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3674:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3675:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__NameAssignment_17291); 
             after(grammarAccess.getGrantedScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GrantedScenario__NameAssignment_1"


    // $ANTLR start "rule__GrantedScenario__UserAssignment_4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3684:1: rule__GrantedScenario__UserAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__GrantedScenario__UserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3688:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3689:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3689:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3690:1: ( RULE_ID )
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserUserCrossReference_4_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3691:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3692:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserUserIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__UserAssignment_47326); 
             after(grammarAccess.getGrantedScenarioAccess().getUserUserIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getGrantedScenarioAccess().getUserUserCrossReference_4_0()); 

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
    // $ANTLR end "rule__GrantedScenario__UserAssignment_4"


    // $ANTLR start "rule__GrantedScenario__RolesAssignment_5_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3703:1: rule__GrantedScenario__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__GrantedScenario__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3707:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3708:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3708:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3709:1: ( RULE_ID )
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3710:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3711:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__RolesAssignment_5_17365); 
             after(grammarAccess.getGrantedScenarioAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getGrantedScenarioAccess().getRolesRoleCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__GrantedScenario__RolesAssignment_5_1"


    // $ANTLR start "rule__GrantedScenario__ObjectAssignment_6_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3722:1: rule__GrantedScenario__ObjectAssignment_6_1 : ( ruleAssignment ) ;
    public final void rule__GrantedScenario__ObjectAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3726:1: ( ( ruleAssignment ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3727:1: ( ruleAssignment )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3727:1: ( ruleAssignment )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3728:1: ruleAssignment
            {
             before(grammarAccess.getGrantedScenarioAccess().getObjectAssignmentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__GrantedScenario__ObjectAssignment_6_17400);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getGrantedScenarioAccess().getObjectAssignmentParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__GrantedScenario__ObjectAssignment_6_1"


    // $ANTLR start "rule__ForbiddenScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3737:1: rule__ForbiddenScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForbiddenScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3741:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3742:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3742:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3743:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__NameAssignment_17431); 
             after(grammarAccess.getForbiddenScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ForbiddenScenario__NameAssignment_1"


    // $ANTLR start "rule__ForbiddenScenario__UserAssignment_4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3752:1: rule__ForbiddenScenario__UserAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForbiddenScenario__UserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3756:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3757:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3757:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3758:1: ( RULE_ID )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserUserCrossReference_4_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3759:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3760:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserUserIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__UserAssignment_47466); 
             after(grammarAccess.getForbiddenScenarioAccess().getUserUserIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getForbiddenScenarioAccess().getUserUserCrossReference_4_0()); 

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
    // $ANTLR end "rule__ForbiddenScenario__UserAssignment_4"


    // $ANTLR start "rule__ForbiddenScenario__RolesAssignment_5_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3771:1: rule__ForbiddenScenario__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForbiddenScenario__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3775:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3776:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3776:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3777:1: ( RULE_ID )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3778:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3779:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__RolesAssignment_5_17505); 
             after(grammarAccess.getForbiddenScenarioAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getForbiddenScenarioAccess().getRolesRoleCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ForbiddenScenario__RolesAssignment_5_1"


    // $ANTLR start "rule__ForbiddenScenario__ObjectAssignment_6_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3790:1: rule__ForbiddenScenario__ObjectAssignment_6_1 : ( ruleAssignment ) ;
    public final void rule__ForbiddenScenario__ObjectAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3794:1: ( ( ruleAssignment ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3795:1: ( ruleAssignment )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3795:1: ( ruleAssignment )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3796:1: ruleAssignment
            {
             before(grammarAccess.getForbiddenScenarioAccess().getObjectAssignmentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__ForbiddenScenario__ObjectAssignment_6_17540);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getForbiddenScenarioAccess().getObjectAssignmentParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__ForbiddenScenario__ObjectAssignment_6_1"


    // $ANTLR start "rule__UserRoleScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3805:1: rule__UserRoleScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UserRoleScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3809:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3810:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3810:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3811:1: RULE_ID
            {
             before(grammarAccess.getUserRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleScenario__NameAssignment_17571); 
             after(grammarAccess.getUserRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UserRoleScenario__NameAssignment_1"


    // $ANTLR start "rule__UserRoleScenario__RolesAssignment_3_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3820:1: rule__UserRoleScenario__RolesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__UserRoleScenario__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3824:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3825:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3825:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3826:1: ( RULE_ID )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesRoleCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3827:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3828:1: RULE_ID
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleScenario__RolesAssignment_3_17606); 
             after(grammarAccess.getUserRoleScenarioAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getUserRoleScenarioAccess().getRolesRoleCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__UserRoleScenario__RolesAssignment_3_1"


    // $ANTLR start "rule__ObjectRoleScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3839:1: rule__ObjectRoleScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectRoleScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3843:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3844:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3844:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3845:1: RULE_ID
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectRoleScenario__NameAssignment_17641); 
             after(grammarAccess.getObjectRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__NameAssignment_1"


    // $ANTLR start "rule__ObjectRoleScenario__RoleAssignment_4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3854:1: rule__ObjectRoleScenario__RoleAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ObjectRoleScenario__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3858:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3859:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3859:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3860:1: ( RULE_ID )
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getRoleRoleCrossReference_4_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3861:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3862:1: RULE_ID
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectRoleScenario__RoleAssignment_47676); 
             after(grammarAccess.getObjectRoleScenarioAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getObjectRoleScenarioAccess().getRoleRoleCrossReference_4_0()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__RoleAssignment_4"


    // $ANTLR start "rule__ObjectRoleScenario__AssignmentAssignment_5_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3873:1: rule__ObjectRoleScenario__AssignmentAssignment_5_1 : ( ruleAssignment ) ;
    public final void rule__ObjectRoleScenario__AssignmentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3877:1: ( ( ruleAssignment ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3878:1: ( ruleAssignment )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3878:1: ( ruleAssignment )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3879:1: ruleAssignment
            {
             before(grammarAccess.getObjectRoleScenarioAccess().getAssignmentAssignmentParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__ObjectRoleScenario__AssignmentAssignment_5_17711);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getObjectRoleScenarioAccess().getAssignmentAssignmentParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__ObjectRoleScenario__AssignmentAssignment_5_1"


    // $ANTLR start "rule__ObjectScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3888:1: rule__ObjectScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3892:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3893:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3893:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3894:1: RULE_ID
            {
             before(grammarAccess.getObjectScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjectScenario__NameAssignment_17742); 
             after(grammarAccess.getObjectScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectScenario__NameAssignment_1"


    // $ANTLR start "rule__ObjectScenario__AssignmentAssignment_3_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3903:1: rule__ObjectScenario__AssignmentAssignment_3_1 : ( ruleAssignment ) ;
    public final void rule__ObjectScenario__AssignmentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3907:1: ( ( ruleAssignment ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3908:1: ( ruleAssignment )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3908:1: ( ruleAssignment )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3909:1: ruleAssignment
            {
             before(grammarAccess.getObjectScenarioAccess().getAssignmentAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAssignment_in_rule__ObjectScenario__AssignmentAssignment_3_17773);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getObjectScenarioAccess().getAssignmentAssignmentParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ObjectScenario__AssignmentAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRbac_in_entryRuleRbac61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRbac68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__0_in_ruleRbac94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicyElement_in_entryRulePolicyElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicyElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PolicyElement__Alternatives_in_rulePolicyElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioElement_in_entryRuleScenarioElement181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarioElement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScenarioElement__Alternatives_in_ruleScenarioElement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0_in_rulePermission454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRBACObject_in_entryRuleRBACObject481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRBACObject488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__0_in_ruleRBACObject514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrantedScenario548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__0_in_ruleGrantedScenario574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForbiddenScenario608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__0_in_ruleForbiddenScenario634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleScenario668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__0_in_ruleUserRoleScenario694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectRoleScenario_in_entryRuleObjectRoleScenario721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectRoleScenario728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__0_in_ruleObjectRoleScenario754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectScenario_in_entryRuleObjectScenario781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectScenario788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__0_in_ruleObjectScenario814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__PolicyElement__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__PolicyElement__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__PolicyElement__Alternatives884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRBACObject_in_rule__PolicyElement__Alternatives901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_rule__ScenarioElement__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_rule__ScenarioElement__Alternatives950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_rule__ScenarioElement__Alternatives967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectRoleScenario_in_rule__ScenarioElement__Alternatives984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectScenario_in_rule__ScenarioElement__Alternatives1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__0__Impl_in_rule__Rbac__Group__01031 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__1_in_rule__Rbac__Group__01034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Rbac__Group__0__Impl1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__1__Impl_in_rule__Rbac__Group__11093 = new BitSet(new long[]{0x000000000091A000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__2_in_rule__Rbac__Group__11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rbac__Group__1__Impl1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__2__Impl_in_rule__Rbac__Group__21155 = new BitSet(new long[]{0x000000000091A000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__3_in_rule__Rbac__Group__21158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__PolicyElementsAssignment_2_in_rule__Rbac__Group__2__Impl1185 = new BitSet(new long[]{0x0000000000918002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__3__Impl_in_rule__Rbac__Group__31216 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__4_in_rule__Rbac__Group__31219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Rbac__Group__3__Impl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__4__Impl_in_rule__Rbac__Group__41278 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__5_in_rule__Rbac__Group__41281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Rbac__Group__4__Impl1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__5__Impl_in_rule__Rbac__Group__51340 = new BitSet(new long[]{0x000000001F002000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__6_in_rule__Rbac__Group__51343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rbac__Group__5__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__6__Impl_in_rule__Rbac__Group__61402 = new BitSet(new long[]{0x000000001F002000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__7_in_rule__Rbac__Group__61405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__ScenarioElementsAssignment_6_in_rule__Rbac__Group__6__Impl1432 = new BitSet(new long[]{0x000000001F000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__7__Impl_in_rule__Rbac__Group__71463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Rbac__Group__7__Impl1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__01541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__User__Group__0__Impl1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__User__Group__2_in_rule__User__Group__11603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__21660 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__User__Group__3_in_rule__User__Group__21663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__User__Group__2__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__31722 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__User__Group__4_in_rule__User__Group__31725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__0_in_rule__User__Group__3__Impl1752 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__41783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__User__Group__4__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__0__Impl_in_rule__User__Group_3__01852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group_3__1_in_rule__User__Group_3__01855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__User__Group_3__0__Impl1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__1__Impl_in_rule__User__Group_3__11914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__RolesAssignment_3_1_in_rule__User__Group_3__1__Impl1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__01975 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__01978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Role__Group__0__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__12037 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__22097 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__22100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__32158 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__32161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__3__Impl2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__42220 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__42223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl2250 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__52281 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_rule__Role__Group__6_in_rule__Role__Group__52284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__0_in_rule__Role__Group__5__Impl2311 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__62342 = new BitSet(new long[]{0x00000000001C2000L});
    public static final BitSet FOLLOW_rule__Role__Group__7_in_rule__Role__Group__62345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__0_in_rule__Role__Group__6__Impl2372 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__72403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Role__Group__7__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__02478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__02481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Role__Group_2__0__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__12540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__ParentAssignment_2_1_in_rule__Role__Group_2__1__Impl2567 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__02602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Role__Group_4__0__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__SsodAssignment_4_1_in_rule__Role__Group_4__1__Impl2691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__0__Impl_in_rule__Role__Group_5__02725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_5__1_in_rule__Role__Group_5__02728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Role__Group_5__0__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__1__Impl_in_rule__Role__Group_5__12787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__DsodAssignment_5_1_in_rule__Role__Group_5__1__Impl2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__0__Impl_in_rule__Role__Group_6__02848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_6__1_in_rule__Role__Group_6__02851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Role__Group_6__0__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__1__Impl_in_rule__Role__Group_6__12910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__AssignmentsAssignment_6_1_in_rule__Role__Group_6__1__Impl2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__02971 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__02974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ObjectAssignment_0_in_rule__Assignment__Group__0__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__13031 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__13034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Assignment__Group__1__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__23093 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__23096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ActionsAssignment_2_in_rule__Assignment__Group__2__Impl3123 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__33154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Assignment__Group__3__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__03221 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__03224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Permission__Group__0__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__13283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__NameAssignment_1_in_rule__Permission__Group__1__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__0__Impl_in_rule__RBACObject__Group__03344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__1_in_rule__RBACObject__Group__03347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RBACObject__Group__0__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__1__Impl_in_rule__RBACObject__Group__13406 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__2_in_rule__RBACObject__Group__13409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__NameAssignment_1_in_rule__RBACObject__Group__1__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__2__Impl_in_rule__RBACObject__Group__23466 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__3_in_rule__RBACObject__Group__23469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RBACObject__Group__2__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__3__Impl_in_rule__RBACObject__Group__33528 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__4_in_rule__RBACObject__Group__33531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group_3__0_in_rule__RBACObject__Group__3__Impl3558 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group__4__Impl_in_rule__RBACObject__Group__43589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RBACObject__Group__4__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group_3__0__Impl_in_rule__RBACObject__Group_3__03658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RBACObject__Group_3__1_in_rule__RBACObject__Group_3__03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RBACObject__Group_3__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__Group_3__1__Impl_in_rule__RBACObject__Group_3__13720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RBACObject__PermissionsAssignment_3_1_in_rule__RBACObject__Group_3__1__Impl3747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__0__Impl_in_rule__GrantedScenario__Group__03781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__1_in_rule__GrantedScenario__Group__03784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GrantedScenario__Group__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__1__Impl_in_rule__GrantedScenario__Group__13843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__2_in_rule__GrantedScenario__Group__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__NameAssignment_1_in_rule__GrantedScenario__Group__1__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__2__Impl_in_rule__GrantedScenario__Group__23903 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__3_in_rule__GrantedScenario__Group__23906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GrantedScenario__Group__2__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__3__Impl_in_rule__GrantedScenario__Group__33965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__4_in_rule__GrantedScenario__Group__33968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__GrantedScenario__Group__3__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__4__Impl_in_rule__GrantedScenario__Group__44027 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__5_in_rule__GrantedScenario__Group__44030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__UserAssignment_4_in_rule__GrantedScenario__Group__4__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__5__Impl_in_rule__GrantedScenario__Group__54087 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__6_in_rule__GrantedScenario__Group__54090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__0_in_rule__GrantedScenario__Group__5__Impl4117 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__6__Impl_in_rule__GrantedScenario__Group__64148 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__7_in_rule__GrantedScenario__Group__64151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4180 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4192 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__7__Impl_in_rule__GrantedScenario__Group__74225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__GrantedScenario__Group__7__Impl4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__0__Impl_in_rule__GrantedScenario__Group_5__04300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__1_in_rule__GrantedScenario__Group_5__04303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GrantedScenario__Group_5__0__Impl4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__1__Impl_in_rule__GrantedScenario__Group_5__14362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__RolesAssignment_5_1_in_rule__GrantedScenario__Group_5__1__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0__Impl_in_rule__GrantedScenario__Group_6__04423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__1_in_rule__GrantedScenario__Group_6__04426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__GrantedScenario__Group_6__0__Impl4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__1__Impl_in_rule__GrantedScenario__Group_6__14485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__ObjectAssignment_6_1_in_rule__GrantedScenario__Group_6__1__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__0__Impl_in_rule__ForbiddenScenario__Group__04546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__1_in_rule__ForbiddenScenario__Group__04549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ForbiddenScenario__Group__0__Impl4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__1__Impl_in_rule__ForbiddenScenario__Group__14608 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__2_in_rule__ForbiddenScenario__Group__14611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__NameAssignment_1_in_rule__ForbiddenScenario__Group__1__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__2__Impl_in_rule__ForbiddenScenario__Group__24668 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__3_in_rule__ForbiddenScenario__Group__24671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ForbiddenScenario__Group__2__Impl4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__3__Impl_in_rule__ForbiddenScenario__Group__34730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__4_in_rule__ForbiddenScenario__Group__34733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ForbiddenScenario__Group__3__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__4__Impl_in_rule__ForbiddenScenario__Group__44792 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__5_in_rule__ForbiddenScenario__Group__44795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__UserAssignment_4_in_rule__ForbiddenScenario__Group__4__Impl4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__5__Impl_in_rule__ForbiddenScenario__Group__54852 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__6_in_rule__ForbiddenScenario__Group__54855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__0_in_rule__ForbiddenScenario__Group__5__Impl4882 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__6__Impl_in_rule__ForbiddenScenario__Group__64913 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__7_in_rule__ForbiddenScenario__Group__64916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl4945 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl4957 = new BitSet(new long[]{0x0000000000110002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__7__Impl_in_rule__ForbiddenScenario__Group__74990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ForbiddenScenario__Group__7__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__0__Impl_in_rule__ForbiddenScenario__Group_5__05065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__1_in_rule__ForbiddenScenario__Group_5__05068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ForbiddenScenario__Group_5__0__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__1__Impl_in_rule__ForbiddenScenario__Group_5__15127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__RolesAssignment_5_1_in_rule__ForbiddenScenario__Group_5__1__Impl5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0__Impl_in_rule__ForbiddenScenario__Group_6__05188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__1_in_rule__ForbiddenScenario__Group_6__05191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ForbiddenScenario__Group_6__0__Impl5219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__1__Impl_in_rule__ForbiddenScenario__Group_6__15250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__ObjectAssignment_6_1_in_rule__ForbiddenScenario__Group_6__1__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__0__Impl_in_rule__UserRoleScenario__Group__05311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__1_in_rule__UserRoleScenario__Group__05314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UserRoleScenario__Group__0__Impl5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__1__Impl_in_rule__UserRoleScenario__Group__15373 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__2_in_rule__UserRoleScenario__Group__15376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__NameAssignment_1_in_rule__UserRoleScenario__Group__1__Impl5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__2__Impl_in_rule__UserRoleScenario__Group__25433 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__3_in_rule__UserRoleScenario__Group__25436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UserRoleScenario__Group__2__Impl5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__3__Impl_in_rule__UserRoleScenario__Group__35495 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__4_in_rule__UserRoleScenario__Group__35498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5527 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5539 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__4__Impl_in_rule__UserRoleScenario__Group__45572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UserRoleScenario__Group__4__Impl5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0__Impl_in_rule__UserRoleScenario__Group_3__05641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__1_in_rule__UserRoleScenario__Group_3__05644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UserRoleScenario__Group_3__0__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__1__Impl_in_rule__UserRoleScenario__Group_3__15703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__RolesAssignment_3_1_in_rule__UserRoleScenario__Group_3__1__Impl5730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__0__Impl_in_rule__ObjectRoleScenario__Group__05764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__1_in_rule__ObjectRoleScenario__Group__05767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ObjectRoleScenario__Group__0__Impl5795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__1__Impl_in_rule__ObjectRoleScenario__Group__15826 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__2_in_rule__ObjectRoleScenario__Group__15829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__NameAssignment_1_in_rule__ObjectRoleScenario__Group__1__Impl5856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__2__Impl_in_rule__ObjectRoleScenario__Group__25886 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__3_in_rule__ObjectRoleScenario__Group__25889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ObjectRoleScenario__Group__2__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__3__Impl_in_rule__ObjectRoleScenario__Group__35948 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__4_in_rule__ObjectRoleScenario__Group__35951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ObjectRoleScenario__Group__3__Impl5979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__4__Impl_in_rule__ObjectRoleScenario__Group__46010 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__5_in_rule__ObjectRoleScenario__Group__46013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__RoleAssignment_4_in_rule__ObjectRoleScenario__Group__4__Impl6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__5__Impl_in_rule__ObjectRoleScenario__Group__56070 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__6_in_rule__ObjectRoleScenario__Group__56073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group_5__0_in_rule__ObjectRoleScenario__Group__5__Impl6102 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group_5__0_in_rule__ObjectRoleScenario__Group__5__Impl6114 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group__6__Impl_in_rule__ObjectRoleScenario__Group__66147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ObjectRoleScenario__Group__6__Impl6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group_5__0__Impl_in_rule__ObjectRoleScenario__Group_5__06220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group_5__1_in_rule__ObjectRoleScenario__Group_5__06223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ObjectRoleScenario__Group_5__0__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__Group_5__1__Impl_in_rule__ObjectRoleScenario__Group_5__16282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectRoleScenario__AssignmentAssignment_5_1_in_rule__ObjectRoleScenario__Group_5__1__Impl6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__0__Impl_in_rule__ObjectScenario__Group__06343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__1_in_rule__ObjectScenario__Group__06346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ObjectScenario__Group__0__Impl6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__1__Impl_in_rule__ObjectScenario__Group__16405 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__2_in_rule__ObjectScenario__Group__16408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__NameAssignment_1_in_rule__ObjectScenario__Group__1__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__2__Impl_in_rule__ObjectScenario__Group__26465 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__3_in_rule__ObjectScenario__Group__26468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ObjectScenario__Group__2__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__3__Impl_in_rule__ObjectScenario__Group__36527 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__4_in_rule__ObjectScenario__Group__36530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group_3__0_in_rule__ObjectScenario__Group__3__Impl6559 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group_3__0_in_rule__ObjectScenario__Group__3__Impl6571 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group__4__Impl_in_rule__ObjectScenario__Group__46604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ObjectScenario__Group__4__Impl6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group_3__0__Impl_in_rule__ObjectScenario__Group_3__06673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group_3__1_in_rule__ObjectScenario__Group_3__06676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ObjectScenario__Group_3__0__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__Group_3__1__Impl_in_rule__ObjectScenario__Group_3__16735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjectScenario__AssignmentAssignment_3_1_in_rule__ObjectScenario__Group_3__1__Impl6762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicyElement_in_rule__Rbac__PolicyElementsAssignment_26801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioElement_in_rule__Rbac__ScenarioElementsAssignment_66832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_16863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__RolesAssignment_3_16898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_16933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__ParentAssignment_2_16968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__SsodAssignment_4_17007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__DsodAssignment_5_17046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__Role__AssignmentsAssignment_6_17081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__ObjectAssignment_07116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__ActionsAssignment_27155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__NameAssignment_17190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RBACObject__NameAssignment_17221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RBACObject__PermissionsAssignment_3_17256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__NameAssignment_17291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__UserAssignment_47326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__RolesAssignment_5_17365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__GrantedScenario__ObjectAssignment_6_17400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__NameAssignment_17431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__UserAssignment_47466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__RolesAssignment_5_17505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__ForbiddenScenario__ObjectAssignment_6_17540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleScenario__NameAssignment_17571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleScenario__RolesAssignment_3_17606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectRoleScenario__NameAssignment_17641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectRoleScenario__RoleAssignment_47676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__ObjectRoleScenario__AssignmentAssignment_5_17711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjectScenario__NameAssignment_17742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__ObjectScenario__AssignmentAssignment_3_17773 = new BitSet(new long[]{0x0000000000000002L});

}