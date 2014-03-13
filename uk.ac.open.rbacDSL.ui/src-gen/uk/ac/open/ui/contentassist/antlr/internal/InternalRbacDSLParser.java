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


    // $ANTLR start "entryRulePolicy"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:88:1: entryRulePolicy : rulePolicy EOF ;
    public final void entryRulePolicy() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:89:1: ( rulePolicy EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:90:1: rulePolicy EOF
            {
             before(grammarAccess.getPolicyRule()); 
            pushFollow(FOLLOW_rulePolicy_in_entryRulePolicy121);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getPolicyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePolicy128); 

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
    // $ANTLR end "entryRulePolicy"


    // $ANTLR start "rulePolicy"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:97:1: rulePolicy : ( ( rule__Policy__Group__0 ) ) ;
    public final void rulePolicy() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:101:2: ( ( ( rule__Policy__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:102:1: ( ( rule__Policy__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:102:1: ( ( rule__Policy__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:103:1: ( rule__Policy__Group__0 )
            {
             before(grammarAccess.getPolicyAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:104:1: ( rule__Policy__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:104:2: rule__Policy__Group__0
            {
            pushFollow(FOLLOW_rule__Policy__Group__0_in_rulePolicy154);
            rule__Policy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolicyAccess().getGroup()); 

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
    // $ANTLR end "rulePolicy"


    // $ANTLR start "entryRuleScenarios"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:116:1: entryRuleScenarios : ruleScenarios EOF ;
    public final void entryRuleScenarios() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:117:1: ( ruleScenarios EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:118:1: ruleScenarios EOF
            {
             before(grammarAccess.getScenariosRule()); 
            pushFollow(FOLLOW_ruleScenarios_in_entryRuleScenarios181);
            ruleScenarios();

            state._fsp--;

             after(grammarAccess.getScenariosRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScenarios188); 

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
    // $ANTLR end "entryRuleScenarios"


    // $ANTLR start "ruleScenarios"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:125:1: ruleScenarios : ( ( rule__Scenarios__Group__0 ) ) ;
    public final void ruleScenarios() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:129:2: ( ( ( rule__Scenarios__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:130:1: ( ( rule__Scenarios__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:130:1: ( ( rule__Scenarios__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:131:1: ( rule__Scenarios__Group__0 )
            {
             before(grammarAccess.getScenariosAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:132:1: ( rule__Scenarios__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:132:2: rule__Scenarios__Group__0
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__0_in_ruleScenarios214);
            rule__Scenarios__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenariosAccess().getGroup()); 

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
    // $ANTLR end "ruleScenarios"


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


    // $ANTLR start "entryRulePermission"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:200:1: entryRulePermission : rulePermission EOF ;
    public final void entryRulePermission() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:201:1: ( rulePermission EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:202:1: rulePermission EOF
            {
             before(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_rulePermission_in_entryRulePermission361);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPermissionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePermission368); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:209:1: rulePermission : ( ( rule__Permission__Group__0 ) ) ;
    public final void rulePermission() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:213:2: ( ( ( rule__Permission__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:214:1: ( ( rule__Permission__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:214:1: ( ( rule__Permission__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:215:1: ( rule__Permission__Group__0 )
            {
             before(grammarAccess.getPermissionAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:216:1: ( rule__Permission__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:216:2: rule__Permission__Group__0
            {
            pushFollow(FOLLOW_rule__Permission__Group__0_in_rulePermission394);
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


    // $ANTLR start "entryRuleResource"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:228:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:229:1: ( ruleResource EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:230:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource421);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource428); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:237:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:241:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:242:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:242:1: ( ( rule__Resource__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:243:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:244:1: ( rule__Resource__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:244:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource454);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleUserScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:256:1: entryRuleUserScenario : ruleUserScenario EOF ;
    public final void entryRuleUserScenario() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:257:1: ( ruleUserScenario EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:258:1: ruleUserScenario EOF
            {
             before(grammarAccess.getUserScenarioRule()); 
            pushFollow(FOLLOW_ruleUserScenario_in_entryRuleUserScenario481);
            ruleUserScenario();

            state._fsp--;

             after(grammarAccess.getUserScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUserScenario488); 

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
    // $ANTLR end "entryRuleUserScenario"


    // $ANTLR start "ruleUserScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:265:1: ruleUserScenario : ( ( rule__UserScenario__Alternatives ) ) ;
    public final void ruleUserScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:269:2: ( ( ( rule__UserScenario__Alternatives ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:270:1: ( ( rule__UserScenario__Alternatives ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:270:1: ( ( rule__UserScenario__Alternatives ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:271:1: ( rule__UserScenario__Alternatives )
            {
             before(grammarAccess.getUserScenarioAccess().getAlternatives()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:272:1: ( rule__UserScenario__Alternatives )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:272:2: rule__UserScenario__Alternatives
            {
            pushFollow(FOLLOW_rule__UserScenario__Alternatives_in_ruleUserScenario514);
            rule__UserScenario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUserScenarioAccess().getAlternatives()); 

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
    // $ANTLR end "ruleUserScenario"


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


    // $ANTLR start "entryRuleResourceRoleScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:368:1: entryRuleResourceRoleScenario : ruleResourceRoleScenario EOF ;
    public final void entryRuleResourceRoleScenario() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:369:1: ( ruleResourceRoleScenario EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:370:1: ruleResourceRoleScenario EOF
            {
             before(grammarAccess.getResourceRoleScenarioRule()); 
            pushFollow(FOLLOW_ruleResourceRoleScenario_in_entryRuleResourceRoleScenario721);
            ruleResourceRoleScenario();

            state._fsp--;

             after(grammarAccess.getResourceRoleScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceRoleScenario728); 

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
    // $ANTLR end "entryRuleResourceRoleScenario"


    // $ANTLR start "ruleResourceRoleScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:377:1: ruleResourceRoleScenario : ( ( rule__ResourceRoleScenario__Group__0 ) ) ;
    public final void ruleResourceRoleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:381:2: ( ( ( rule__ResourceRoleScenario__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:382:1: ( ( rule__ResourceRoleScenario__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:382:1: ( ( rule__ResourceRoleScenario__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:383:1: ( rule__ResourceRoleScenario__Group__0 )
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:384:1: ( rule__ResourceRoleScenario__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:384:2: rule__ResourceRoleScenario__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__0_in_ruleResourceRoleScenario754);
            rule__ResourceRoleScenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceRoleScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceRoleScenario"


    // $ANTLR start "entryRuleResourceScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:396:1: entryRuleResourceScenario : ruleResourceScenario EOF ;
    public final void entryRuleResourceScenario() throws RecognitionException {
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:397:1: ( ruleResourceScenario EOF )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:398:1: ruleResourceScenario EOF
            {
             before(grammarAccess.getResourceScenarioRule()); 
            pushFollow(FOLLOW_ruleResourceScenario_in_entryRuleResourceScenario781);
            ruleResourceScenario();

            state._fsp--;

             after(grammarAccess.getResourceScenarioRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResourceScenario788); 

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
    // $ANTLR end "entryRuleResourceScenario"


    // $ANTLR start "ruleResourceScenario"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:405:1: ruleResourceScenario : ( ( rule__ResourceScenario__Group__0 ) ) ;
    public final void ruleResourceScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:409:2: ( ( ( rule__ResourceScenario__Group__0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:410:1: ( ( rule__ResourceScenario__Group__0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:410:1: ( ( rule__ResourceScenario__Group__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:411:1: ( rule__ResourceScenario__Group__0 )
            {
             before(grammarAccess.getResourceScenarioAccess().getGroup()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:412:1: ( rule__ResourceScenario__Group__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:412:2: rule__ResourceScenario__Group__0
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group__0_in_ruleResourceScenario814);
            rule__ResourceScenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceScenarioAccess().getGroup()); 

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
    // $ANTLR end "ruleResourceScenario"


    // $ANTLR start "rule__UserScenario__Alternatives"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:424:1: rule__UserScenario__Alternatives : ( ( ruleGrantedScenario ) | ( ruleForbiddenScenario ) );
    public final void rule__UserScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:428:1: ( ( ruleGrantedScenario ) | ( ruleForbiddenScenario ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:429:1: ( ruleGrantedScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:429:1: ( ruleGrantedScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:430:1: ruleGrantedScenario
                    {
                     before(grammarAccess.getUserScenarioAccess().getGrantedScenarioParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGrantedScenario_in_rule__UserScenario__Alternatives850);
                    ruleGrantedScenario();

                    state._fsp--;

                     after(grammarAccess.getUserScenarioAccess().getGrantedScenarioParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:435:6: ( ruleForbiddenScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:435:6: ( ruleForbiddenScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:436:1: ruleForbiddenScenario
                    {
                     before(grammarAccess.getUserScenarioAccess().getForbiddenScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForbiddenScenario_in_rule__UserScenario__Alternatives867);
                    ruleForbiddenScenario();

                    state._fsp--;

                     after(grammarAccess.getUserScenarioAccess().getForbiddenScenarioParserRuleCall_1()); 

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
    // $ANTLR end "rule__UserScenario__Alternatives"


    // $ANTLR start "rule__Rbac__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:448:1: rule__Rbac__Group__0 : rule__Rbac__Group__0__Impl rule__Rbac__Group__1 ;
    public final void rule__Rbac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:452:1: ( rule__Rbac__Group__0__Impl rule__Rbac__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:453:2: rule__Rbac__Group__0__Impl rule__Rbac__Group__1
            {
            pushFollow(FOLLOW_rule__Rbac__Group__0__Impl_in_rule__Rbac__Group__0897);
            rule__Rbac__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__1_in_rule__Rbac__Group__0900);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:460:1: rule__Rbac__Group__0__Impl : ( ( rule__Rbac__PolicyAssignment_0 ) ) ;
    public final void rule__Rbac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:464:1: ( ( ( rule__Rbac__PolicyAssignment_0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:465:1: ( ( rule__Rbac__PolicyAssignment_0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:465:1: ( ( rule__Rbac__PolicyAssignment_0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:466:1: ( rule__Rbac__PolicyAssignment_0 )
            {
             before(grammarAccess.getRbacAccess().getPolicyAssignment_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:467:1: ( rule__Rbac__PolicyAssignment_0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:467:2: rule__Rbac__PolicyAssignment_0
            {
            pushFollow(FOLLOW_rule__Rbac__PolicyAssignment_0_in_rule__Rbac__Group__0__Impl927);
            rule__Rbac__PolicyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRbacAccess().getPolicyAssignment_0()); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:477:1: rule__Rbac__Group__1 : rule__Rbac__Group__1__Impl ;
    public final void rule__Rbac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:481:1: ( rule__Rbac__Group__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:482:2: rule__Rbac__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rbac__Group__1__Impl_in_rule__Rbac__Group__1957);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:488:1: rule__Rbac__Group__1__Impl : ( ( rule__Rbac__ScenariosAssignment_1 ) ) ;
    public final void rule__Rbac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:492:1: ( ( ( rule__Rbac__ScenariosAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:493:1: ( ( rule__Rbac__ScenariosAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:493:1: ( ( rule__Rbac__ScenariosAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:494:1: ( rule__Rbac__ScenariosAssignment_1 )
            {
             before(grammarAccess.getRbacAccess().getScenariosAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:495:1: ( rule__Rbac__ScenariosAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:495:2: rule__Rbac__ScenariosAssignment_1
            {
            pushFollow(FOLLOW_rule__Rbac__ScenariosAssignment_1_in_rule__Rbac__Group__1__Impl984);
            rule__Rbac__ScenariosAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRbacAccess().getScenariosAssignment_1()); 

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


    // $ANTLR start "rule__Policy__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:509:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:513:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:514:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__01018);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__01021);
            rule__Policy__Group__1();

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
    // $ANTLR end "rule__Policy__Group__0"


    // $ANTLR start "rule__Policy__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:521:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:525:1: ( ( 'policy' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:526:1: ( 'policy' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:526:1: ( 'policy' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:527:1: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Policy__Group__0__Impl1049); 
             after(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 

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
    // $ANTLR end "rule__Policy__Group__0__Impl"


    // $ANTLR start "rule__Policy__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:540:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:544:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:545:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__11080);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__11083);
            rule__Policy__Group__2();

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
    // $ANTLR end "rule__Policy__Group__1"


    // $ANTLR start "rule__Policy__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:552:1: rule__Policy__Group__1__Impl : ( '{' ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:556:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:557:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:557:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:558:1: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Policy__Group__1__Impl1111); 
             after(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Policy__Group__1__Impl"


    // $ANTLR start "rule__Policy__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:571:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:575:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:576:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__21142);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__3_in_rule__Policy__Group__21145);
            rule__Policy__Group__3();

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
    // $ANTLR end "rule__Policy__Group__2"


    // $ANTLR start "rule__Policy__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:583:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__UsersAssignment_2 )* ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:587:1: ( ( ( rule__Policy__UsersAssignment_2 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:588:1: ( ( rule__Policy__UsersAssignment_2 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:588:1: ( ( rule__Policy__UsersAssignment_2 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:589:1: ( rule__Policy__UsersAssignment_2 )*
            {
             before(grammarAccess.getPolicyAccess().getUsersAssignment_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:590:1: ( rule__Policy__UsersAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:590:2: rule__Policy__UsersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Policy__UsersAssignment_2_in_rule__Policy__Group__2__Impl1172);
            	    rule__Policy__UsersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getUsersAssignment_2()); 

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
    // $ANTLR end "rule__Policy__Group__2__Impl"


    // $ANTLR start "rule__Policy__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:600:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:604:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:605:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_rule__Policy__Group__3__Impl_in_rule__Policy__Group__31203);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__4_in_rule__Policy__Group__31206);
            rule__Policy__Group__4();

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
    // $ANTLR end "rule__Policy__Group__3"


    // $ANTLR start "rule__Policy__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:612:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__RolesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:616:1: ( ( ( rule__Policy__RolesAssignment_3 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:617:1: ( ( rule__Policy__RolesAssignment_3 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:617:1: ( ( rule__Policy__RolesAssignment_3 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:618:1: ( rule__Policy__RolesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getRolesAssignment_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:619:1: ( rule__Policy__RolesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:619:2: rule__Policy__RolesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Policy__RolesAssignment_3_in_rule__Policy__Group__3__Impl1233);
            	    rule__Policy__RolesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getRolesAssignment_3()); 

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
    // $ANTLR end "rule__Policy__Group__3__Impl"


    // $ANTLR start "rule__Policy__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:629:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:633:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:634:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_rule__Policy__Group__4__Impl_in_rule__Policy__Group__41264);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__5_in_rule__Policy__Group__41267);
            rule__Policy__Group__5();

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
    // $ANTLR end "rule__Policy__Group__4"


    // $ANTLR start "rule__Policy__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:641:1: rule__Policy__Group__4__Impl : ( ( rule__Policy__PermissionsAssignment_4 )* ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:645:1: ( ( ( rule__Policy__PermissionsAssignment_4 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:646:1: ( ( rule__Policy__PermissionsAssignment_4 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:646:1: ( ( rule__Policy__PermissionsAssignment_4 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:647:1: ( rule__Policy__PermissionsAssignment_4 )*
            {
             before(grammarAccess.getPolicyAccess().getPermissionsAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:648:1: ( rule__Policy__PermissionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:648:2: rule__Policy__PermissionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Policy__PermissionsAssignment_4_in_rule__Policy__Group__4__Impl1294);
            	    rule__Policy__PermissionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getPermissionsAssignment_4()); 

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
    // $ANTLR end "rule__Policy__Group__4__Impl"


    // $ANTLR start "rule__Policy__Group__5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:658:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:662:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:663:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_rule__Policy__Group__5__Impl_in_rule__Policy__Group__51325);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__6_in_rule__Policy__Group__51328);
            rule__Policy__Group__6();

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
    // $ANTLR end "rule__Policy__Group__5"


    // $ANTLR start "rule__Policy__Group__5__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:670:1: rule__Policy__Group__5__Impl : ( ( rule__Policy__ResourcesAssignment_5 )* ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:674:1: ( ( ( rule__Policy__ResourcesAssignment_5 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:675:1: ( ( rule__Policy__ResourcesAssignment_5 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:675:1: ( ( rule__Policy__ResourcesAssignment_5 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:676:1: ( rule__Policy__ResourcesAssignment_5 )*
            {
             before(grammarAccess.getPolicyAccess().getResourcesAssignment_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:677:1: ( rule__Policy__ResourcesAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:677:2: rule__Policy__ResourcesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Policy__ResourcesAssignment_5_in_rule__Policy__Group__5__Impl1355);
            	    rule__Policy__ResourcesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPolicyAccess().getResourcesAssignment_5()); 

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
    // $ANTLR end "rule__Policy__Group__5__Impl"


    // $ANTLR start "rule__Policy__Group__6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:687:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:691:1: ( rule__Policy__Group__6__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:692:2: rule__Policy__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group__6__Impl_in_rule__Policy__Group__61386);
            rule__Policy__Group__6__Impl();

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
    // $ANTLR end "rule__Policy__Group__6"


    // $ANTLR start "rule__Policy__Group__6__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:698:1: rule__Policy__Group__6__Impl : ( '}' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:702:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:703:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:703:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:704:1: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Policy__Group__6__Impl1414); 
             after(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Policy__Group__6__Impl"


    // $ANTLR start "rule__Scenarios__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:731:1: rule__Scenarios__Group__0 : rule__Scenarios__Group__0__Impl rule__Scenarios__Group__1 ;
    public final void rule__Scenarios__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:735:1: ( rule__Scenarios__Group__0__Impl rule__Scenarios__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:736:2: rule__Scenarios__Group__0__Impl rule__Scenarios__Group__1
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__0__Impl_in_rule__Scenarios__Group__01459);
            rule__Scenarios__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__1_in_rule__Scenarios__Group__01462);
            rule__Scenarios__Group__1();

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
    // $ANTLR end "rule__Scenarios__Group__0"


    // $ANTLR start "rule__Scenarios__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:743:1: rule__Scenarios__Group__0__Impl : ( 'scenarios' ) ;
    public final void rule__Scenarios__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:747:1: ( ( 'scenarios' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:748:1: ( 'scenarios' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:748:1: ( 'scenarios' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:749:1: 'scenarios'
            {
             before(grammarAccess.getScenariosAccess().getScenariosKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Scenarios__Group__0__Impl1490); 
             after(grammarAccess.getScenariosAccess().getScenariosKeyword_0()); 

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
    // $ANTLR end "rule__Scenarios__Group__0__Impl"


    // $ANTLR start "rule__Scenarios__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:762:1: rule__Scenarios__Group__1 : rule__Scenarios__Group__1__Impl rule__Scenarios__Group__2 ;
    public final void rule__Scenarios__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:766:1: ( rule__Scenarios__Group__1__Impl rule__Scenarios__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:767:2: rule__Scenarios__Group__1__Impl rule__Scenarios__Group__2
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__1__Impl_in_rule__Scenarios__Group__11521);
            rule__Scenarios__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__2_in_rule__Scenarios__Group__11524);
            rule__Scenarios__Group__2();

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
    // $ANTLR end "rule__Scenarios__Group__1"


    // $ANTLR start "rule__Scenarios__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:774:1: rule__Scenarios__Group__1__Impl : ( '{' ) ;
    public final void rule__Scenarios__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:778:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:779:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:779:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:780:1: '{'
            {
             before(grammarAccess.getScenariosAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Scenarios__Group__1__Impl1552); 
             after(grammarAccess.getScenariosAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Scenarios__Group__1__Impl"


    // $ANTLR start "rule__Scenarios__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:793:1: rule__Scenarios__Group__2 : rule__Scenarios__Group__2__Impl rule__Scenarios__Group__3 ;
    public final void rule__Scenarios__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:797:1: ( rule__Scenarios__Group__2__Impl rule__Scenarios__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:798:2: rule__Scenarios__Group__2__Impl rule__Scenarios__Group__3
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__2__Impl_in_rule__Scenarios__Group__21583);
            rule__Scenarios__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__3_in_rule__Scenarios__Group__21586);
            rule__Scenarios__Group__3();

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
    // $ANTLR end "rule__Scenarios__Group__2"


    // $ANTLR start "rule__Scenarios__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:805:1: rule__Scenarios__Group__2__Impl : ( ( rule__Scenarios__UserScenariosAssignment_2 )* ) ;
    public final void rule__Scenarios__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:809:1: ( ( ( rule__Scenarios__UserScenariosAssignment_2 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:810:1: ( ( rule__Scenarios__UserScenariosAssignment_2 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:810:1: ( ( rule__Scenarios__UserScenariosAssignment_2 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:811:1: ( rule__Scenarios__UserScenariosAssignment_2 )*
            {
             before(grammarAccess.getScenariosAccess().getUserScenariosAssignment_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:812:1: ( rule__Scenarios__UserScenariosAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:812:2: rule__Scenarios__UserScenariosAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Scenarios__UserScenariosAssignment_2_in_rule__Scenarios__Group__2__Impl1613);
            	    rule__Scenarios__UserScenariosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getScenariosAccess().getUserScenariosAssignment_2()); 

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
    // $ANTLR end "rule__Scenarios__Group__2__Impl"


    // $ANTLR start "rule__Scenarios__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:822:1: rule__Scenarios__Group__3 : rule__Scenarios__Group__3__Impl rule__Scenarios__Group__4 ;
    public final void rule__Scenarios__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:826:1: ( rule__Scenarios__Group__3__Impl rule__Scenarios__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:827:2: rule__Scenarios__Group__3__Impl rule__Scenarios__Group__4
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__3__Impl_in_rule__Scenarios__Group__31644);
            rule__Scenarios__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__4_in_rule__Scenarios__Group__31647);
            rule__Scenarios__Group__4();

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
    // $ANTLR end "rule__Scenarios__Group__3"


    // $ANTLR start "rule__Scenarios__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:834:1: rule__Scenarios__Group__3__Impl : ( ( rule__Scenarios__UserRoleScenariosAssignment_3 )* ) ;
    public final void rule__Scenarios__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:838:1: ( ( ( rule__Scenarios__UserRoleScenariosAssignment_3 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:839:1: ( ( rule__Scenarios__UserRoleScenariosAssignment_3 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:839:1: ( ( rule__Scenarios__UserRoleScenariosAssignment_3 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:840:1: ( rule__Scenarios__UserRoleScenariosAssignment_3 )*
            {
             before(grammarAccess.getScenariosAccess().getUserRoleScenariosAssignment_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:841:1: ( rule__Scenarios__UserRoleScenariosAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:841:2: rule__Scenarios__UserRoleScenariosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Scenarios__UserRoleScenariosAssignment_3_in_rule__Scenarios__Group__3__Impl1674);
            	    rule__Scenarios__UserRoleScenariosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getScenariosAccess().getUserRoleScenariosAssignment_3()); 

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
    // $ANTLR end "rule__Scenarios__Group__3__Impl"


    // $ANTLR start "rule__Scenarios__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:851:1: rule__Scenarios__Group__4 : rule__Scenarios__Group__4__Impl rule__Scenarios__Group__5 ;
    public final void rule__Scenarios__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:855:1: ( rule__Scenarios__Group__4__Impl rule__Scenarios__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:856:2: rule__Scenarios__Group__4__Impl rule__Scenarios__Group__5
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__4__Impl_in_rule__Scenarios__Group__41705);
            rule__Scenarios__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__5_in_rule__Scenarios__Group__41708);
            rule__Scenarios__Group__5();

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
    // $ANTLR end "rule__Scenarios__Group__4"


    // $ANTLR start "rule__Scenarios__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:863:1: rule__Scenarios__Group__4__Impl : ( ( rule__Scenarios__ResourceRoleScenariosAssignment_4 )* ) ;
    public final void rule__Scenarios__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:867:1: ( ( ( rule__Scenarios__ResourceRoleScenariosAssignment_4 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:868:1: ( ( rule__Scenarios__ResourceRoleScenariosAssignment_4 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:868:1: ( ( rule__Scenarios__ResourceRoleScenariosAssignment_4 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:869:1: ( rule__Scenarios__ResourceRoleScenariosAssignment_4 )*
            {
             before(grammarAccess.getScenariosAccess().getResourceRoleScenariosAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:870:1: ( rule__Scenarios__ResourceRoleScenariosAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:870:2: rule__Scenarios__ResourceRoleScenariosAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Scenarios__ResourceRoleScenariosAssignment_4_in_rule__Scenarios__Group__4__Impl1735);
            	    rule__Scenarios__ResourceRoleScenariosAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getScenariosAccess().getResourceRoleScenariosAssignment_4()); 

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
    // $ANTLR end "rule__Scenarios__Group__4__Impl"


    // $ANTLR start "rule__Scenarios__Group__5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:880:1: rule__Scenarios__Group__5 : rule__Scenarios__Group__5__Impl rule__Scenarios__Group__6 ;
    public final void rule__Scenarios__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:884:1: ( rule__Scenarios__Group__5__Impl rule__Scenarios__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:885:2: rule__Scenarios__Group__5__Impl rule__Scenarios__Group__6
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__5__Impl_in_rule__Scenarios__Group__51766);
            rule__Scenarios__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__6_in_rule__Scenarios__Group__51769);
            rule__Scenarios__Group__6();

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
    // $ANTLR end "rule__Scenarios__Group__5"


    // $ANTLR start "rule__Scenarios__Group__5__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:892:1: rule__Scenarios__Group__5__Impl : ( ( rule__Scenarios__RoleScenariosAssignment_5 )* ) ;
    public final void rule__Scenarios__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:896:1: ( ( ( rule__Scenarios__RoleScenariosAssignment_5 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:897:1: ( ( rule__Scenarios__RoleScenariosAssignment_5 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:897:1: ( ( rule__Scenarios__RoleScenariosAssignment_5 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:898:1: ( rule__Scenarios__RoleScenariosAssignment_5 )*
            {
             before(grammarAccess.getScenariosAccess().getRoleScenariosAssignment_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:899:1: ( rule__Scenarios__RoleScenariosAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:899:2: rule__Scenarios__RoleScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Scenarios__RoleScenariosAssignment_5_in_rule__Scenarios__Group__5__Impl1796);
            	    rule__Scenarios__RoleScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getScenariosAccess().getRoleScenariosAssignment_5()); 

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
    // $ANTLR end "rule__Scenarios__Group__5__Impl"


    // $ANTLR start "rule__Scenarios__Group__6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:909:1: rule__Scenarios__Group__6 : rule__Scenarios__Group__6__Impl ;
    public final void rule__Scenarios__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:913:1: ( rule__Scenarios__Group__6__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:914:2: rule__Scenarios__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__6__Impl_in_rule__Scenarios__Group__61827);
            rule__Scenarios__Group__6__Impl();

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
    // $ANTLR end "rule__Scenarios__Group__6"


    // $ANTLR start "rule__Scenarios__Group__6__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:920:1: rule__Scenarios__Group__6__Impl : ( '}' ) ;
    public final void rule__Scenarios__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:924:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:925:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:925:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:926:1: '}'
            {
             before(grammarAccess.getScenariosAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Scenarios__Group__6__Impl1855); 
             after(grammarAccess.getScenariosAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Scenarios__Group__6__Impl"


    // $ANTLR start "rule__User__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:953:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:957:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:958:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01900);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__01903);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:965:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:969:1: ( ( 'user' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:970:1: ( 'user' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:970:1: ( 'user' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:971:1: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__User__Group__0__Impl1931); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:984:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:988:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:989:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11962);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__2_in_rule__User__Group__11965);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:996:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1000:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1001:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1001:1: ( ( rule__User__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1002:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1003:1: ( rule__User__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1003:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1992);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1013:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1017:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1018:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__22022);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__3_in_rule__User__Group__22025);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1025:1: rule__User__Group__2__Impl : ( '{' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1029:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1030:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1030:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1031:1: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__User__Group__2__Impl2053); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1044:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1048:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1049:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__32084);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__4_in_rule__User__Group__32087);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1056:1: rule__User__Group__3__Impl : ( ( rule__User__Group_3__0 )* ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1060:1: ( ( ( rule__User__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1061:1: ( ( rule__User__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1061:1: ( ( rule__User__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1062:1: ( rule__User__Group_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1063:1: ( rule__User__Group_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1063:2: rule__User__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__User__Group_3__0_in_rule__User__Group__3__Impl2114);
            	    rule__User__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1073:1: rule__User__Group__4 : rule__User__Group__4__Impl ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1077:1: ( rule__User__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1078:2: rule__User__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__42145);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1084:1: rule__User__Group__4__Impl : ( '}' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1088:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1089:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1089:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1090:1: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__User__Group__4__Impl2173); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1113:1: rule__User__Group_3__0 : rule__User__Group_3__0__Impl rule__User__Group_3__1 ;
    public final void rule__User__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1117:1: ( rule__User__Group_3__0__Impl rule__User__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1118:2: rule__User__Group_3__0__Impl rule__User__Group_3__1
            {
            pushFollow(FOLLOW_rule__User__Group_3__0__Impl_in_rule__User__Group_3__02214);
            rule__User__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group_3__1_in_rule__User__Group_3__02217);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1125:1: rule__User__Group_3__0__Impl : ( 'role:' ) ;
    public final void rule__User__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1129:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1130:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1130:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1131:1: 'role:'
            {
             before(grammarAccess.getUserAccess().getRoleKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__User__Group_3__0__Impl2245); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1144:1: rule__User__Group_3__1 : rule__User__Group_3__1__Impl ;
    public final void rule__User__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1148:1: ( rule__User__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1149:2: rule__User__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__User__Group_3__1__Impl_in_rule__User__Group_3__12276);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1155:1: rule__User__Group_3__1__Impl : ( ( rule__User__RolesAssignment_3_1 ) ) ;
    public final void rule__User__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1159:1: ( ( ( rule__User__RolesAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1160:1: ( ( rule__User__RolesAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1160:1: ( ( rule__User__RolesAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1161:1: ( rule__User__RolesAssignment_3_1 )
            {
             before(grammarAccess.getUserAccess().getRolesAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1162:1: ( rule__User__RolesAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1162:2: rule__User__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__User__RolesAssignment_3_1_in_rule__User__Group_3__1__Impl2303);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1176:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1180:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1181:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__02337);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__02340);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1188:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1192:1: ( ( 'role' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1193:1: ( 'role' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1193:1: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1194:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Role__Group__0__Impl2368); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1207:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1211:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1212:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__12399);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__12402);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1219:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1223:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1224:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1224:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1225:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1226:1: ( rule__Role__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1226:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl2429);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1236:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1240:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1241:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__22459);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__22462);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1248:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1252:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1253:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1253:1: ( ( rule__Role__Group_2__0 )? )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1254:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1255:1: ( rule__Role__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1255:2: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl2489);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1265:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1269:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1270:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__32520);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__32523);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1277:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1281:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1282:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1282:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1283:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__3__Impl2551); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1296:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1300:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1301:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__42582);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__5_in_rule__Role__Group__42585);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1308:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )* ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1312:1: ( ( ( rule__Role__Group_4__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1313:1: ( ( rule__Role__Group_4__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1313:1: ( ( rule__Role__Group_4__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1314:1: ( rule__Role__Group_4__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1315:1: ( rule__Role__Group_4__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1315:2: rule__Role__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl2612);
            	    rule__Role__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1325:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1329:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1330:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__52643);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__6_in_rule__Role__Group__52646);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1337:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )* ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1341:1: ( ( ( rule__Role__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1342:1: ( ( rule__Role__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1342:1: ( ( rule__Role__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1343:1: ( rule__Role__Group_5__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1344:1: ( rule__Role__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1344:2: rule__Role__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_5__0_in_rule__Role__Group__5__Impl2673);
            	    rule__Role__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1354:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1358:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1359:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__62704);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__7_in_rule__Role__Group__62707);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1366:1: rule__Role__Group__6__Impl : ( ( rule__Role__Group_6__0 )* ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1370:1: ( ( ( rule__Role__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1371:1: ( ( rule__Role__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1371:1: ( ( rule__Role__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1372:1: ( rule__Role__Group_6__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1373:1: ( rule__Role__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1373:2: rule__Role__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_6__0_in_rule__Role__Group__6__Impl2734);
            	    rule__Role__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1383:1: rule__Role__Group__7 : rule__Role__Group__7__Impl ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1387:1: ( rule__Role__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1388:2: rule__Role__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__72765);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1394:1: rule__Role__Group__7__Impl : ( '}' ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1398:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1399:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1399:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1400:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Role__Group__7__Impl2793); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1429:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1433:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1434:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
            {
            pushFollow(FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__02840);
            rule__Role__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__02843);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1441:1: rule__Role__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1445:1: ( ( 'extends' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1446:1: ( 'extends' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1446:1: ( 'extends' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1447:1: 'extends'
            {
             before(grammarAccess.getRoleAccess().getExtendsKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Role__Group_2__0__Impl2871); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1460:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1464:1: ( rule__Role__Group_2__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1465:2: rule__Role__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__12902);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1471:1: rule__Role__Group_2__1__Impl : ( ( rule__Role__ParentAssignment_2_1 )* ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1475:1: ( ( ( rule__Role__ParentAssignment_2_1 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1476:1: ( ( rule__Role__ParentAssignment_2_1 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1476:1: ( ( rule__Role__ParentAssignment_2_1 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1477:1: ( rule__Role__ParentAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getParentAssignment_2_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1478:1: ( rule__Role__ParentAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1478:2: rule__Role__ParentAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Role__ParentAssignment_2_1_in_rule__Role__Group_2__1__Impl2929);
            	    rule__Role__ParentAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1492:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1496:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1497:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__02964);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__02967);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1504:1: rule__Role__Group_4__0__Impl : ( 'ssod:' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1508:1: ( ( 'ssod:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1509:1: ( 'ssod:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1509:1: ( 'ssod:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1510:1: 'ssod:'
            {
             before(grammarAccess.getRoleAccess().getSsodKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Role__Group_4__0__Impl2995); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1523:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1527:1: ( rule__Role__Group_4__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1528:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13026);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1534:1: rule__Role__Group_4__1__Impl : ( ( rule__Role__SsodAssignment_4_1 ) ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1538:1: ( ( ( rule__Role__SsodAssignment_4_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1539:1: ( ( rule__Role__SsodAssignment_4_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1539:1: ( ( rule__Role__SsodAssignment_4_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1540:1: ( rule__Role__SsodAssignment_4_1 )
            {
             before(grammarAccess.getRoleAccess().getSsodAssignment_4_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1541:1: ( rule__Role__SsodAssignment_4_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1541:2: rule__Role__SsodAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Role__SsodAssignment_4_1_in_rule__Role__Group_4__1__Impl3053);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1555:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1559:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1560:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
            {
            pushFollow(FOLLOW_rule__Role__Group_5__0__Impl_in_rule__Role__Group_5__03087);
            rule__Role__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_5__1_in_rule__Role__Group_5__03090);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1567:1: rule__Role__Group_5__0__Impl : ( 'dsod:' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1571:1: ( ( 'dsod:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1572:1: ( 'dsod:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1572:1: ( 'dsod:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1573:1: 'dsod:'
            {
             before(grammarAccess.getRoleAccess().getDsodKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Role__Group_5__0__Impl3118); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1586:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1590:1: ( rule__Role__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1591:2: rule__Role__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_5__1__Impl_in_rule__Role__Group_5__13149);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1597:1: rule__Role__Group_5__1__Impl : ( ( rule__Role__DsodAssignment_5_1 ) ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1601:1: ( ( ( rule__Role__DsodAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1602:1: ( ( rule__Role__DsodAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1602:1: ( ( rule__Role__DsodAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1603:1: ( rule__Role__DsodAssignment_5_1 )
            {
             before(grammarAccess.getRoleAccess().getDsodAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1604:1: ( rule__Role__DsodAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1604:2: rule__Role__DsodAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Role__DsodAssignment_5_1_in_rule__Role__Group_5__1__Impl3176);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1618:1: rule__Role__Group_6__0 : rule__Role__Group_6__0__Impl rule__Role__Group_6__1 ;
    public final void rule__Role__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1622:1: ( rule__Role__Group_6__0__Impl rule__Role__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1623:2: rule__Role__Group_6__0__Impl rule__Role__Group_6__1
            {
            pushFollow(FOLLOW_rule__Role__Group_6__0__Impl_in_rule__Role__Group_6__03210);
            rule__Role__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_6__1_in_rule__Role__Group_6__03213);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1630:1: rule__Role__Group_6__0__Impl : ( 'permission:' ) ;
    public final void rule__Role__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1634:1: ( ( 'permission:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1635:1: ( 'permission:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1635:1: ( 'permission:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1636:1: 'permission:'
            {
             before(grammarAccess.getRoleAccess().getPermissionKeyword_6_0()); 
            match(input,21,FOLLOW_21_in_rule__Role__Group_6__0__Impl3241); 
             after(grammarAccess.getRoleAccess().getPermissionKeyword_6_0()); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1649:1: rule__Role__Group_6__1 : rule__Role__Group_6__1__Impl ;
    public final void rule__Role__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1653:1: ( rule__Role__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1654:2: rule__Role__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_6__1__Impl_in_rule__Role__Group_6__13272);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1660:1: rule__Role__Group_6__1__Impl : ( ( rule__Role__PermissionsAssignment_6_1 ) ) ;
    public final void rule__Role__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1664:1: ( ( ( rule__Role__PermissionsAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1665:1: ( ( rule__Role__PermissionsAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1665:1: ( ( rule__Role__PermissionsAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1666:1: ( rule__Role__PermissionsAssignment_6_1 )
            {
             before(grammarAccess.getRoleAccess().getPermissionsAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1667:1: ( rule__Role__PermissionsAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1667:2: rule__Role__PermissionsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Role__PermissionsAssignment_6_1_in_rule__Role__Group_6__1__Impl3299);
            rule__Role__PermissionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getPermissionsAssignment_6_1()); 

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


    // $ANTLR start "rule__Permission__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1681:1: rule__Permission__Group__0 : rule__Permission__Group__0__Impl rule__Permission__Group__1 ;
    public final void rule__Permission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1685:1: ( rule__Permission__Group__0__Impl rule__Permission__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1686:2: rule__Permission__Group__0__Impl rule__Permission__Group__1
            {
            pushFollow(FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__03333);
            rule__Permission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__03336);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1693:1: rule__Permission__Group__0__Impl : ( 'permission' ) ;
    public final void rule__Permission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1697:1: ( ( 'permission' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1698:1: ( 'permission' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1698:1: ( 'permission' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1699:1: 'permission'
            {
             before(grammarAccess.getPermissionAccess().getPermissionKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Permission__Group__0__Impl3364); 
             after(grammarAccess.getPermissionAccess().getPermissionKeyword_0()); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1712:1: rule__Permission__Group__1 : rule__Permission__Group__1__Impl ;
    public final void rule__Permission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1716:1: ( rule__Permission__Group__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1717:2: rule__Permission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__13395);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1723:1: rule__Permission__Group__1__Impl : ( ( rule__Permission__NameAssignment_1 ) ) ;
    public final void rule__Permission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1727:1: ( ( ( rule__Permission__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1728:1: ( ( rule__Permission__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1728:1: ( ( rule__Permission__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1729:1: ( rule__Permission__NameAssignment_1 )
            {
             before(grammarAccess.getPermissionAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1730:1: ( rule__Permission__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1730:2: rule__Permission__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Permission__NameAssignment_1_in_rule__Permission__Group__1__Impl3422);
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


    // $ANTLR start "rule__Resource__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1744:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1748:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1749:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__03456);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03459);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1756:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1760:1: ( ( 'resource' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1761:1: ( 'resource' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1761:1: ( 'resource' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1762:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Resource__Group__0__Impl3487); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

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
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1775:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1779:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1780:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__13518);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__13521);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1787:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1791:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1792:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1792:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1793:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1794:1: ( rule__Resource__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1794:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl3548);
            rule__Resource__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1804:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1808:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1809:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__23578);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__23581);
            rule__Resource__Group__3();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1816:1: rule__Resource__Group__2__Impl : ( '{' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1820:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1821:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1821:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1822:1: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Resource__Group__2__Impl3609); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1835:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1839:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1840:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__33640);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__4_in_rule__Resource__Group__33643);
            rule__Resource__Group__4();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1847:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__Group_3__0 )* ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1851:1: ( ( ( rule__Resource__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1852:1: ( ( rule__Resource__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1852:1: ( ( rule__Resource__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1853:1: ( rule__Resource__Group_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1854:1: ( rule__Resource__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1854:2: rule__Resource__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl3670);
            	    rule__Resource__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1864:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1868:1: ( rule__Resource__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1869:2: rule__Resource__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__4__Impl_in_rule__Resource__Group__43701);
            rule__Resource__Group__4__Impl();

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
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1875:1: rule__Resource__Group__4__Impl : ( '}' ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1879:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1880:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1880:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1881:1: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Resource__Group__4__Impl3729); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group_3__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1904:1: rule__Resource__Group_3__0 : rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 ;
    public final void rule__Resource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1908:1: ( rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1909:2: rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__03770);
            rule__Resource__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__03773);
            rule__Resource__Group_3__1();

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
    // $ANTLR end "rule__Resource__Group_3__0"


    // $ANTLR start "rule__Resource__Group_3__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1916:1: rule__Resource__Group_3__0__Impl : ( 'permission:' ) ;
    public final void rule__Resource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1920:1: ( ( 'permission:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1921:1: ( 'permission:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1921:1: ( 'permission:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1922:1: 'permission:'
            {
             before(grammarAccess.getResourceAccess().getPermissionKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Resource__Group_3__0__Impl3801); 
             after(grammarAccess.getResourceAccess().getPermissionKeyword_3_0()); 

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
    // $ANTLR end "rule__Resource__Group_3__0__Impl"


    // $ANTLR start "rule__Resource__Group_3__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1935:1: rule__Resource__Group_3__1 : rule__Resource__Group_3__1__Impl ;
    public final void rule__Resource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1939:1: ( rule__Resource__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1940:2: rule__Resource__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__13832);
            rule__Resource__Group_3__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_3__1"


    // $ANTLR start "rule__Resource__Group_3__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1946:1: rule__Resource__Group_3__1__Impl : ( ( rule__Resource__PermissionsAssignment_3_1 ) ) ;
    public final void rule__Resource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1950:1: ( ( ( rule__Resource__PermissionsAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1951:1: ( ( rule__Resource__PermissionsAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1951:1: ( ( rule__Resource__PermissionsAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1952:1: ( rule__Resource__PermissionsAssignment_3_1 )
            {
             before(grammarAccess.getResourceAccess().getPermissionsAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1953:1: ( rule__Resource__PermissionsAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1953:2: rule__Resource__PermissionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Resource__PermissionsAssignment_3_1_in_rule__Resource__Group_3__1__Impl3859);
            rule__Resource__PermissionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getPermissionsAssignment_3_1()); 

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
    // $ANTLR end "rule__Resource__Group_3__1__Impl"


    // $ANTLR start "rule__GrantedScenario__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1967:1: rule__GrantedScenario__Group__0 : rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1 ;
    public final void rule__GrantedScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1971:1: ( rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1972:2: rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__0__Impl_in_rule__GrantedScenario__Group__03893);
            rule__GrantedScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__1_in_rule__GrantedScenario__Group__03896);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1979:1: rule__GrantedScenario__Group__0__Impl : ( 'grantedScenario' ) ;
    public final void rule__GrantedScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1983:1: ( ( 'grantedScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1984:1: ( 'grantedScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1984:1: ( 'grantedScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1985:1: 'grantedScenario'
            {
             before(grammarAccess.getGrantedScenarioAccess().getGrantedScenarioKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__GrantedScenario__Group__0__Impl3924); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1998:1: rule__GrantedScenario__Group__1 : rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2 ;
    public final void rule__GrantedScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2002:1: ( rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2003:2: rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__1__Impl_in_rule__GrantedScenario__Group__13955);
            rule__GrantedScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__2_in_rule__GrantedScenario__Group__13958);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2010:1: rule__GrantedScenario__Group__1__Impl : ( ( rule__GrantedScenario__NameAssignment_1 ) ) ;
    public final void rule__GrantedScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2014:1: ( ( ( rule__GrantedScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2015:1: ( ( rule__GrantedScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2015:1: ( ( rule__GrantedScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2016:1: ( rule__GrantedScenario__NameAssignment_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2017:1: ( rule__GrantedScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2017:2: rule__GrantedScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__NameAssignment_1_in_rule__GrantedScenario__Group__1__Impl3985);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2027:1: rule__GrantedScenario__Group__2 : rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3 ;
    public final void rule__GrantedScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2031:1: ( rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2032:2: rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__2__Impl_in_rule__GrantedScenario__Group__24015);
            rule__GrantedScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__3_in_rule__GrantedScenario__Group__24018);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2039:1: rule__GrantedScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__GrantedScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2043:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2044:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2044:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2045:1: '{'
            {
             before(grammarAccess.getGrantedScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__GrantedScenario__Group__2__Impl4046); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2058:1: rule__GrantedScenario__Group__3 : rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4 ;
    public final void rule__GrantedScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2062:1: ( rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2063:2: rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__3__Impl_in_rule__GrantedScenario__Group__34077);
            rule__GrantedScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__4_in_rule__GrantedScenario__Group__34080);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2070:1: rule__GrantedScenario__Group__3__Impl : ( 'user:' ) ;
    public final void rule__GrantedScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2074:1: ( ( 'user:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2075:1: ( 'user:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2075:1: ( 'user:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2076:1: 'user:'
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__GrantedScenario__Group__3__Impl4108); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2089:1: rule__GrantedScenario__Group__4 : rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5 ;
    public final void rule__GrantedScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2093:1: ( rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2094:2: rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__4__Impl_in_rule__GrantedScenario__Group__44139);
            rule__GrantedScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__5_in_rule__GrantedScenario__Group__44142);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2101:1: rule__GrantedScenario__Group__4__Impl : ( ( rule__GrantedScenario__UserAssignment_4 ) ) ;
    public final void rule__GrantedScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2105:1: ( ( ( rule__GrantedScenario__UserAssignment_4 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2106:1: ( ( rule__GrantedScenario__UserAssignment_4 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2106:1: ( ( rule__GrantedScenario__UserAssignment_4 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2107:1: ( rule__GrantedScenario__UserAssignment_4 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2108:1: ( rule__GrantedScenario__UserAssignment_4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2108:2: rule__GrantedScenario__UserAssignment_4
            {
            pushFollow(FOLLOW_rule__GrantedScenario__UserAssignment_4_in_rule__GrantedScenario__Group__4__Impl4169);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2118:1: rule__GrantedScenario__Group__5 : rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6 ;
    public final void rule__GrantedScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2122:1: ( rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2123:2: rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__5__Impl_in_rule__GrantedScenario__Group__54199);
            rule__GrantedScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__6_in_rule__GrantedScenario__Group__54202);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2130:1: rule__GrantedScenario__Group__5__Impl : ( ( rule__GrantedScenario__Group_5__0 )* ) ;
    public final void rule__GrantedScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2134:1: ( ( ( rule__GrantedScenario__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2135:1: ( ( rule__GrantedScenario__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2135:1: ( ( rule__GrantedScenario__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2136:1: ( rule__GrantedScenario__Group_5__0 )*
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2137:1: ( rule__GrantedScenario__Group_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2137:2: rule__GrantedScenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__GrantedScenario__Group_5__0_in_rule__GrantedScenario__Group__5__Impl4229);
            	    rule__GrantedScenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2147:1: rule__GrantedScenario__Group__6 : rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7 ;
    public final void rule__GrantedScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2151:1: ( rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2152:2: rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__6__Impl_in_rule__GrantedScenario__Group__64260);
            rule__GrantedScenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__7_in_rule__GrantedScenario__Group__64263);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2159:1: rule__GrantedScenario__Group__6__Impl : ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) ) ;
    public final void rule__GrantedScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2163:1: ( ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2164:1: ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2164:1: ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2165:1: ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2165:1: ( ( rule__GrantedScenario__Group_6__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2166:1: ( rule__GrantedScenario__Group_6__0 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2167:1: ( rule__GrantedScenario__Group_6__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2167:2: rule__GrantedScenario__Group_6__0
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4292);
            rule__GrantedScenario__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2170:1: ( ( rule__GrantedScenario__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2171:1: ( rule__GrantedScenario__Group_6__0 )*
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2172:1: ( rule__GrantedScenario__Group_6__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2172:2: rule__GrantedScenario__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4304);
            	    rule__GrantedScenario__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2183:1: rule__GrantedScenario__Group__7 : rule__GrantedScenario__Group__7__Impl ;
    public final void rule__GrantedScenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2187:1: ( rule__GrantedScenario__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2188:2: rule__GrantedScenario__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__7__Impl_in_rule__GrantedScenario__Group__74337);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2194:1: rule__GrantedScenario__Group__7__Impl : ( '}' ) ;
    public final void rule__GrantedScenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2198:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2199:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2199:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2200:1: '}'
            {
             before(grammarAccess.getGrantedScenarioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__GrantedScenario__Group__7__Impl4365); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2229:1: rule__GrantedScenario__Group_5__0 : rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1 ;
    public final void rule__GrantedScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2233:1: ( rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2234:2: rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__0__Impl_in_rule__GrantedScenario__Group_5__04412);
            rule__GrantedScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__1_in_rule__GrantedScenario__Group_5__04415);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2241:1: rule__GrantedScenario__Group_5__0__Impl : ( 'role:' ) ;
    public final void rule__GrantedScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2245:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2246:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2246:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2247:1: 'role:'
            {
             before(grammarAccess.getGrantedScenarioAccess().getRoleKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__GrantedScenario__Group_5__0__Impl4443); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2260:1: rule__GrantedScenario__Group_5__1 : rule__GrantedScenario__Group_5__1__Impl ;
    public final void rule__GrantedScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2264:1: ( rule__GrantedScenario__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2265:2: rule__GrantedScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__1__Impl_in_rule__GrantedScenario__Group_5__14474);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2271:1: rule__GrantedScenario__Group_5__1__Impl : ( ( rule__GrantedScenario__RolesAssignment_5_1 ) ) ;
    public final void rule__GrantedScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2275:1: ( ( ( rule__GrantedScenario__RolesAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2276:1: ( ( rule__GrantedScenario__RolesAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2276:1: ( ( rule__GrantedScenario__RolesAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2277:1: ( rule__GrantedScenario__RolesAssignment_5_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2278:1: ( rule__GrantedScenario__RolesAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2278:2: rule__GrantedScenario__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__RolesAssignment_5_1_in_rule__GrantedScenario__Group_5__1__Impl4501);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2292:1: rule__GrantedScenario__Group_6__0 : rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1 ;
    public final void rule__GrantedScenario__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2296:1: ( rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2297:2: rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0__Impl_in_rule__GrantedScenario__Group_6__04535);
            rule__GrantedScenario__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__1_in_rule__GrantedScenario__Group_6__04538);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2304:1: rule__GrantedScenario__Group_6__0__Impl : ( 'resource:' ) ;
    public final void rule__GrantedScenario__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2308:1: ( ( 'resource:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2309:1: ( 'resource:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2309:1: ( 'resource:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2310:1: 'resource:'
            {
             before(grammarAccess.getGrantedScenarioAccess().getResourceKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__GrantedScenario__Group_6__0__Impl4566); 
             after(grammarAccess.getGrantedScenarioAccess().getResourceKeyword_6_0()); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2323:1: rule__GrantedScenario__Group_6__1 : rule__GrantedScenario__Group_6__1__Impl ;
    public final void rule__GrantedScenario__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2327:1: ( rule__GrantedScenario__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2328:2: rule__GrantedScenario__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__1__Impl_in_rule__GrantedScenario__Group_6__14597);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2334:1: rule__GrantedScenario__Group_6__1__Impl : ( ( rule__GrantedScenario__ResourcesAssignment_6_1 ) ) ;
    public final void rule__GrantedScenario__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2338:1: ( ( ( rule__GrantedScenario__ResourcesAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2339:1: ( ( rule__GrantedScenario__ResourcesAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2339:1: ( ( rule__GrantedScenario__ResourcesAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2340:1: ( rule__GrantedScenario__ResourcesAssignment_6_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getResourcesAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2341:1: ( rule__GrantedScenario__ResourcesAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2341:2: rule__GrantedScenario__ResourcesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__ResourcesAssignment_6_1_in_rule__GrantedScenario__Group_6__1__Impl4624);
            rule__GrantedScenario__ResourcesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getResourcesAssignment_6_1()); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2355:1: rule__ForbiddenScenario__Group__0 : rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1 ;
    public final void rule__ForbiddenScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2359:1: ( rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2360:2: rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__0__Impl_in_rule__ForbiddenScenario__Group__04658);
            rule__ForbiddenScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__1_in_rule__ForbiddenScenario__Group__04661);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2367:1: rule__ForbiddenScenario__Group__0__Impl : ( 'forbiddenScenario' ) ;
    public final void rule__ForbiddenScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2371:1: ( ( 'forbiddenScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2372:1: ( 'forbiddenScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2372:1: ( 'forbiddenScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2373:1: 'forbiddenScenario'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getForbiddenScenarioKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ForbiddenScenario__Group__0__Impl4689); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2386:1: rule__ForbiddenScenario__Group__1 : rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2 ;
    public final void rule__ForbiddenScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2390:1: ( rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2391:2: rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__1__Impl_in_rule__ForbiddenScenario__Group__14720);
            rule__ForbiddenScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__2_in_rule__ForbiddenScenario__Group__14723);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2398:1: rule__ForbiddenScenario__Group__1__Impl : ( ( rule__ForbiddenScenario__NameAssignment_1 ) ) ;
    public final void rule__ForbiddenScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2402:1: ( ( ( rule__ForbiddenScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2403:1: ( ( rule__ForbiddenScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2403:1: ( ( rule__ForbiddenScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2404:1: ( rule__ForbiddenScenario__NameAssignment_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2405:1: ( rule__ForbiddenScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2405:2: rule__ForbiddenScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__NameAssignment_1_in_rule__ForbiddenScenario__Group__1__Impl4750);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2415:1: rule__ForbiddenScenario__Group__2 : rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3 ;
    public final void rule__ForbiddenScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2419:1: ( rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2420:2: rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__2__Impl_in_rule__ForbiddenScenario__Group__24780);
            rule__ForbiddenScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__3_in_rule__ForbiddenScenario__Group__24783);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2427:1: rule__ForbiddenScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__ForbiddenScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2431:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2432:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2432:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2433:1: '{'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ForbiddenScenario__Group__2__Impl4811); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2446:1: rule__ForbiddenScenario__Group__3 : rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4 ;
    public final void rule__ForbiddenScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2450:1: ( rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2451:2: rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__3__Impl_in_rule__ForbiddenScenario__Group__34842);
            rule__ForbiddenScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__4_in_rule__ForbiddenScenario__Group__34845);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2458:1: rule__ForbiddenScenario__Group__3__Impl : ( 'user:' ) ;
    public final void rule__ForbiddenScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2462:1: ( ( 'user:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2463:1: ( 'user:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2463:1: ( 'user:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2464:1: 'user:'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__ForbiddenScenario__Group__3__Impl4873); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2477:1: rule__ForbiddenScenario__Group__4 : rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5 ;
    public final void rule__ForbiddenScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2481:1: ( rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2482:2: rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__4__Impl_in_rule__ForbiddenScenario__Group__44904);
            rule__ForbiddenScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__5_in_rule__ForbiddenScenario__Group__44907);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2489:1: rule__ForbiddenScenario__Group__4__Impl : ( ( rule__ForbiddenScenario__UserAssignment_4 ) ) ;
    public final void rule__ForbiddenScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2493:1: ( ( ( rule__ForbiddenScenario__UserAssignment_4 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2494:1: ( ( rule__ForbiddenScenario__UserAssignment_4 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2494:1: ( ( rule__ForbiddenScenario__UserAssignment_4 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2495:1: ( rule__ForbiddenScenario__UserAssignment_4 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2496:1: ( rule__ForbiddenScenario__UserAssignment_4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2496:2: rule__ForbiddenScenario__UserAssignment_4
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__UserAssignment_4_in_rule__ForbiddenScenario__Group__4__Impl4934);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2506:1: rule__ForbiddenScenario__Group__5 : rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6 ;
    public final void rule__ForbiddenScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2510:1: ( rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2511:2: rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__5__Impl_in_rule__ForbiddenScenario__Group__54964);
            rule__ForbiddenScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__6_in_rule__ForbiddenScenario__Group__54967);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2518:1: rule__ForbiddenScenario__Group__5__Impl : ( ( rule__ForbiddenScenario__Group_5__0 )* ) ;
    public final void rule__ForbiddenScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2522:1: ( ( ( rule__ForbiddenScenario__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2523:1: ( ( rule__ForbiddenScenario__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2523:1: ( ( rule__ForbiddenScenario__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2524:1: ( rule__ForbiddenScenario__Group_5__0 )*
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2525:1: ( rule__ForbiddenScenario__Group_5__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2525:2: rule__ForbiddenScenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__0_in_rule__ForbiddenScenario__Group__5__Impl4994);
            	    rule__ForbiddenScenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2535:1: rule__ForbiddenScenario__Group__6 : rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7 ;
    public final void rule__ForbiddenScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2539:1: ( rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2540:2: rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__6__Impl_in_rule__ForbiddenScenario__Group__65025);
            rule__ForbiddenScenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__7_in_rule__ForbiddenScenario__Group__65028);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2547:1: rule__ForbiddenScenario__Group__6__Impl : ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) ) ;
    public final void rule__ForbiddenScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2551:1: ( ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2552:1: ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2552:1: ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2553:1: ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2553:1: ( ( rule__ForbiddenScenario__Group_6__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2554:1: ( rule__ForbiddenScenario__Group_6__0 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2555:1: ( rule__ForbiddenScenario__Group_6__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2555:2: rule__ForbiddenScenario__Group_6__0
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl5057);
            rule__ForbiddenScenario__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2558:1: ( ( rule__ForbiddenScenario__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2559:1: ( rule__ForbiddenScenario__Group_6__0 )*
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2560:1: ( rule__ForbiddenScenario__Group_6__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2560:2: rule__ForbiddenScenario__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl5069);
            	    rule__ForbiddenScenario__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2571:1: rule__ForbiddenScenario__Group__7 : rule__ForbiddenScenario__Group__7__Impl ;
    public final void rule__ForbiddenScenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2575:1: ( rule__ForbiddenScenario__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2576:2: rule__ForbiddenScenario__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__7__Impl_in_rule__ForbiddenScenario__Group__75102);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2582:1: rule__ForbiddenScenario__Group__7__Impl : ( '}' ) ;
    public final void rule__ForbiddenScenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2586:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2587:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2587:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2588:1: '}'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__ForbiddenScenario__Group__7__Impl5130); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2617:1: rule__ForbiddenScenario__Group_5__0 : rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1 ;
    public final void rule__ForbiddenScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2621:1: ( rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2622:2: rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__0__Impl_in_rule__ForbiddenScenario__Group_5__05177);
            rule__ForbiddenScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__1_in_rule__ForbiddenScenario__Group_5__05180);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2629:1: rule__ForbiddenScenario__Group_5__0__Impl : ( 'role:' ) ;
    public final void rule__ForbiddenScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2633:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2634:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2634:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2635:1: 'role:'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRoleKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__ForbiddenScenario__Group_5__0__Impl5208); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2648:1: rule__ForbiddenScenario__Group_5__1 : rule__ForbiddenScenario__Group_5__1__Impl ;
    public final void rule__ForbiddenScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2652:1: ( rule__ForbiddenScenario__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2653:2: rule__ForbiddenScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__1__Impl_in_rule__ForbiddenScenario__Group_5__15239);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2659:1: rule__ForbiddenScenario__Group_5__1__Impl : ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) ) ;
    public final void rule__ForbiddenScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2663:1: ( ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2664:1: ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2664:1: ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2665:1: ( rule__ForbiddenScenario__RolesAssignment_5_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2666:1: ( rule__ForbiddenScenario__RolesAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2666:2: rule__ForbiddenScenario__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__RolesAssignment_5_1_in_rule__ForbiddenScenario__Group_5__1__Impl5266);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2680:1: rule__ForbiddenScenario__Group_6__0 : rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1 ;
    public final void rule__ForbiddenScenario__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2684:1: ( rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2685:2: rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0__Impl_in_rule__ForbiddenScenario__Group_6__05300);
            rule__ForbiddenScenario__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__1_in_rule__ForbiddenScenario__Group_6__05303);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2692:1: rule__ForbiddenScenario__Group_6__0__Impl : ( 'resource:' ) ;
    public final void rule__ForbiddenScenario__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2696:1: ( ( 'resource:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2697:1: ( 'resource:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2697:1: ( 'resource:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2698:1: 'resource:'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getResourceKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__ForbiddenScenario__Group_6__0__Impl5331); 
             after(grammarAccess.getForbiddenScenarioAccess().getResourceKeyword_6_0()); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2711:1: rule__ForbiddenScenario__Group_6__1 : rule__ForbiddenScenario__Group_6__1__Impl ;
    public final void rule__ForbiddenScenario__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2715:1: ( rule__ForbiddenScenario__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2716:2: rule__ForbiddenScenario__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__1__Impl_in_rule__ForbiddenScenario__Group_6__15362);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2722:1: rule__ForbiddenScenario__Group_6__1__Impl : ( ( rule__ForbiddenScenario__ResourcesAssignment_6_1 ) ) ;
    public final void rule__ForbiddenScenario__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2726:1: ( ( ( rule__ForbiddenScenario__ResourcesAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2727:1: ( ( rule__ForbiddenScenario__ResourcesAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2727:1: ( ( rule__ForbiddenScenario__ResourcesAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2728:1: ( rule__ForbiddenScenario__ResourcesAssignment_6_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getResourcesAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2729:1: ( rule__ForbiddenScenario__ResourcesAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2729:2: rule__ForbiddenScenario__ResourcesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__ResourcesAssignment_6_1_in_rule__ForbiddenScenario__Group_6__1__Impl5389);
            rule__ForbiddenScenario__ResourcesAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getResourcesAssignment_6_1()); 

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2743:1: rule__UserRoleScenario__Group__0 : rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1 ;
    public final void rule__UserRoleScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2747:1: ( rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2748:2: rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__0__Impl_in_rule__UserRoleScenario__Group__05423);
            rule__UserRoleScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__1_in_rule__UserRoleScenario__Group__05426);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2755:1: rule__UserRoleScenario__Group__0__Impl : ( 'userRoleScenario' ) ;
    public final void rule__UserRoleScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2759:1: ( ( 'userRoleScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2760:1: ( 'userRoleScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2760:1: ( 'userRoleScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2761:1: 'userRoleScenario'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getUserRoleScenarioKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__UserRoleScenario__Group__0__Impl5454); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2774:1: rule__UserRoleScenario__Group__1 : rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2 ;
    public final void rule__UserRoleScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2778:1: ( rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2779:2: rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__1__Impl_in_rule__UserRoleScenario__Group__15485);
            rule__UserRoleScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__2_in_rule__UserRoleScenario__Group__15488);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2786:1: rule__UserRoleScenario__Group__1__Impl : ( ( rule__UserRoleScenario__NameAssignment_1 ) ) ;
    public final void rule__UserRoleScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2790:1: ( ( ( rule__UserRoleScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2791:1: ( ( rule__UserRoleScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2791:1: ( ( rule__UserRoleScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2792:1: ( rule__UserRoleScenario__NameAssignment_1 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2793:1: ( rule__UserRoleScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2793:2: rule__UserRoleScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__NameAssignment_1_in_rule__UserRoleScenario__Group__1__Impl5515);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2803:1: rule__UserRoleScenario__Group__2 : rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3 ;
    public final void rule__UserRoleScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2807:1: ( rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2808:2: rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__2__Impl_in_rule__UserRoleScenario__Group__25545);
            rule__UserRoleScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__3_in_rule__UserRoleScenario__Group__25548);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2815:1: rule__UserRoleScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__UserRoleScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2819:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2820:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2820:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2821:1: '{'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__UserRoleScenario__Group__2__Impl5576); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2834:1: rule__UserRoleScenario__Group__3 : rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4 ;
    public final void rule__UserRoleScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2838:1: ( rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2839:2: rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__3__Impl_in_rule__UserRoleScenario__Group__35607);
            rule__UserRoleScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__4_in_rule__UserRoleScenario__Group__35610);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2846:1: rule__UserRoleScenario__Group__3__Impl : ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) ) ;
    public final void rule__UserRoleScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2850:1: ( ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2851:1: ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2851:1: ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2852:1: ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2852:1: ( ( rule__UserRoleScenario__Group_3__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2853:1: ( rule__UserRoleScenario__Group_3__0 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2854:1: ( rule__UserRoleScenario__Group_3__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2854:2: rule__UserRoleScenario__Group_3__0
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5639);
            rule__UserRoleScenario__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2857:1: ( ( rule__UserRoleScenario__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2858:1: ( rule__UserRoleScenario__Group_3__0 )*
            {
             before(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2859:1: ( rule__UserRoleScenario__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2859:2: rule__UserRoleScenario__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5651);
            	    rule__UserRoleScenario__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2870:1: rule__UserRoleScenario__Group__4 : rule__UserRoleScenario__Group__4__Impl ;
    public final void rule__UserRoleScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2874:1: ( rule__UserRoleScenario__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2875:2: rule__UserRoleScenario__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__4__Impl_in_rule__UserRoleScenario__Group__45684);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2881:1: rule__UserRoleScenario__Group__4__Impl : ( '}' ) ;
    public final void rule__UserRoleScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2885:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2886:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2886:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2887:1: '}'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__UserRoleScenario__Group__4__Impl5712); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2910:1: rule__UserRoleScenario__Group_3__0 : rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1 ;
    public final void rule__UserRoleScenario__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2914:1: ( rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2915:2: rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0__Impl_in_rule__UserRoleScenario__Group_3__05753);
            rule__UserRoleScenario__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__1_in_rule__UserRoleScenario__Group_3__05756);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2922:1: rule__UserRoleScenario__Group_3__0__Impl : ( 'role:' ) ;
    public final void rule__UserRoleScenario__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2926:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2927:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2927:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2928:1: 'role:'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRoleKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__UserRoleScenario__Group_3__0__Impl5784); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2941:1: rule__UserRoleScenario__Group_3__1 : rule__UserRoleScenario__Group_3__1__Impl ;
    public final void rule__UserRoleScenario__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2945:1: ( rule__UserRoleScenario__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2946:2: rule__UserRoleScenario__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__1__Impl_in_rule__UserRoleScenario__Group_3__15815);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2952:1: rule__UserRoleScenario__Group_3__1__Impl : ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) ) ;
    public final void rule__UserRoleScenario__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2956:1: ( ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2957:1: ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2957:1: ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2958:1: ( rule__UserRoleScenario__RolesAssignment_3_1 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2959:1: ( rule__UserRoleScenario__RolesAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2959:2: rule__UserRoleScenario__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__RolesAssignment_3_1_in_rule__UserRoleScenario__Group_3__1__Impl5842);
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


    // $ANTLR start "rule__ResourceRoleScenario__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2973:1: rule__ResourceRoleScenario__Group__0 : rule__ResourceRoleScenario__Group__0__Impl rule__ResourceRoleScenario__Group__1 ;
    public final void rule__ResourceRoleScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2977:1: ( rule__ResourceRoleScenario__Group__0__Impl rule__ResourceRoleScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2978:2: rule__ResourceRoleScenario__Group__0__Impl rule__ResourceRoleScenario__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__0__Impl_in_rule__ResourceRoleScenario__Group__05876);
            rule__ResourceRoleScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__1_in_rule__ResourceRoleScenario__Group__05879);
            rule__ResourceRoleScenario__Group__1();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__0"


    // $ANTLR start "rule__ResourceRoleScenario__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2985:1: rule__ResourceRoleScenario__Group__0__Impl : ( 'resourceRoleScenario' ) ;
    public final void rule__ResourceRoleScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2989:1: ( ( 'resourceRoleScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2990:1: ( 'resourceRoleScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2990:1: ( 'resourceRoleScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2991:1: 'resourceRoleScenario'
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getResourceRoleScenarioKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ResourceRoleScenario__Group__0__Impl5907); 
             after(grammarAccess.getResourceRoleScenarioAccess().getResourceRoleScenarioKeyword_0()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__0__Impl"


    // $ANTLR start "rule__ResourceRoleScenario__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3004:1: rule__ResourceRoleScenario__Group__1 : rule__ResourceRoleScenario__Group__1__Impl rule__ResourceRoleScenario__Group__2 ;
    public final void rule__ResourceRoleScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3008:1: ( rule__ResourceRoleScenario__Group__1__Impl rule__ResourceRoleScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3009:2: rule__ResourceRoleScenario__Group__1__Impl rule__ResourceRoleScenario__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__1__Impl_in_rule__ResourceRoleScenario__Group__15938);
            rule__ResourceRoleScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__2_in_rule__ResourceRoleScenario__Group__15941);
            rule__ResourceRoleScenario__Group__2();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__1"


    // $ANTLR start "rule__ResourceRoleScenario__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3016:1: rule__ResourceRoleScenario__Group__1__Impl : ( ( rule__ResourceRoleScenario__NameAssignment_1 ) ) ;
    public final void rule__ResourceRoleScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3020:1: ( ( ( rule__ResourceRoleScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3021:1: ( ( rule__ResourceRoleScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3021:1: ( ( rule__ResourceRoleScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3022:1: ( rule__ResourceRoleScenario__NameAssignment_1 )
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3023:1: ( rule__ResourceRoleScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3023:2: rule__ResourceRoleScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__NameAssignment_1_in_rule__ResourceRoleScenario__Group__1__Impl5968);
            rule__ResourceRoleScenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceRoleScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__1__Impl"


    // $ANTLR start "rule__ResourceRoleScenario__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3033:1: rule__ResourceRoleScenario__Group__2 : rule__ResourceRoleScenario__Group__2__Impl rule__ResourceRoleScenario__Group__3 ;
    public final void rule__ResourceRoleScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3037:1: ( rule__ResourceRoleScenario__Group__2__Impl rule__ResourceRoleScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3038:2: rule__ResourceRoleScenario__Group__2__Impl rule__ResourceRoleScenario__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__2__Impl_in_rule__ResourceRoleScenario__Group__25998);
            rule__ResourceRoleScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__3_in_rule__ResourceRoleScenario__Group__26001);
            rule__ResourceRoleScenario__Group__3();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__2"


    // $ANTLR start "rule__ResourceRoleScenario__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3045:1: rule__ResourceRoleScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__ResourceRoleScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3049:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3050:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3050:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3051:1: '{'
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ResourceRoleScenario__Group__2__Impl6029); 
             after(grammarAccess.getResourceRoleScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__2__Impl"


    // $ANTLR start "rule__ResourceRoleScenario__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3064:1: rule__ResourceRoleScenario__Group__3 : rule__ResourceRoleScenario__Group__3__Impl rule__ResourceRoleScenario__Group__4 ;
    public final void rule__ResourceRoleScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3068:1: ( rule__ResourceRoleScenario__Group__3__Impl rule__ResourceRoleScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3069:2: rule__ResourceRoleScenario__Group__3__Impl rule__ResourceRoleScenario__Group__4
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__3__Impl_in_rule__ResourceRoleScenario__Group__36060);
            rule__ResourceRoleScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__4_in_rule__ResourceRoleScenario__Group__36063);
            rule__ResourceRoleScenario__Group__4();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__3"


    // $ANTLR start "rule__ResourceRoleScenario__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3076:1: rule__ResourceRoleScenario__Group__3__Impl : ( 'role:' ) ;
    public final void rule__ResourceRoleScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3080:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3081:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3081:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3082:1: 'role:'
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getRoleKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__ResourceRoleScenario__Group__3__Impl6091); 
             after(grammarAccess.getResourceRoleScenarioAccess().getRoleKeyword_3()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__3__Impl"


    // $ANTLR start "rule__ResourceRoleScenario__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3095:1: rule__ResourceRoleScenario__Group__4 : rule__ResourceRoleScenario__Group__4__Impl rule__ResourceRoleScenario__Group__5 ;
    public final void rule__ResourceRoleScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3099:1: ( rule__ResourceRoleScenario__Group__4__Impl rule__ResourceRoleScenario__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3100:2: rule__ResourceRoleScenario__Group__4__Impl rule__ResourceRoleScenario__Group__5
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__4__Impl_in_rule__ResourceRoleScenario__Group__46122);
            rule__ResourceRoleScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__5_in_rule__ResourceRoleScenario__Group__46125);
            rule__ResourceRoleScenario__Group__5();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__4"


    // $ANTLR start "rule__ResourceRoleScenario__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3107:1: rule__ResourceRoleScenario__Group__4__Impl : ( ( rule__ResourceRoleScenario__RoleAssignment_4 ) ) ;
    public final void rule__ResourceRoleScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3111:1: ( ( ( rule__ResourceRoleScenario__RoleAssignment_4 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3112:1: ( ( rule__ResourceRoleScenario__RoleAssignment_4 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3112:1: ( ( rule__ResourceRoleScenario__RoleAssignment_4 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3113:1: ( rule__ResourceRoleScenario__RoleAssignment_4 )
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getRoleAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3114:1: ( rule__ResourceRoleScenario__RoleAssignment_4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3114:2: rule__ResourceRoleScenario__RoleAssignment_4
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__RoleAssignment_4_in_rule__ResourceRoleScenario__Group__4__Impl6152);
            rule__ResourceRoleScenario__RoleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getResourceRoleScenarioAccess().getRoleAssignment_4()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__4__Impl"


    // $ANTLR start "rule__ResourceRoleScenario__Group__5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3124:1: rule__ResourceRoleScenario__Group__5 : rule__ResourceRoleScenario__Group__5__Impl rule__ResourceRoleScenario__Group__6 ;
    public final void rule__ResourceRoleScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3128:1: ( rule__ResourceRoleScenario__Group__5__Impl rule__ResourceRoleScenario__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3129:2: rule__ResourceRoleScenario__Group__5__Impl rule__ResourceRoleScenario__Group__6
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__5__Impl_in_rule__ResourceRoleScenario__Group__56182);
            rule__ResourceRoleScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__6_in_rule__ResourceRoleScenario__Group__56185);
            rule__ResourceRoleScenario__Group__6();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__5"


    // $ANTLR start "rule__ResourceRoleScenario__Group__5__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3136:1: rule__ResourceRoleScenario__Group__5__Impl : ( ( ( rule__ResourceRoleScenario__Group_5__0 ) ) ( ( rule__ResourceRoleScenario__Group_5__0 )* ) ) ;
    public final void rule__ResourceRoleScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3140:1: ( ( ( ( rule__ResourceRoleScenario__Group_5__0 ) ) ( ( rule__ResourceRoleScenario__Group_5__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3141:1: ( ( ( rule__ResourceRoleScenario__Group_5__0 ) ) ( ( rule__ResourceRoleScenario__Group_5__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3141:1: ( ( ( rule__ResourceRoleScenario__Group_5__0 ) ) ( ( rule__ResourceRoleScenario__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3142:1: ( ( rule__ResourceRoleScenario__Group_5__0 ) ) ( ( rule__ResourceRoleScenario__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3142:1: ( ( rule__ResourceRoleScenario__Group_5__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3143:1: ( rule__ResourceRoleScenario__Group_5__0 )
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3144:1: ( rule__ResourceRoleScenario__Group_5__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3144:2: rule__ResourceRoleScenario__Group_5__0
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group_5__0_in_rule__ResourceRoleScenario__Group__5__Impl6214);
            rule__ResourceRoleScenario__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceRoleScenarioAccess().getGroup_5()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3147:1: ( ( rule__ResourceRoleScenario__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3148:1: ( rule__ResourceRoleScenario__Group_5__0 )*
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3149:1: ( rule__ResourceRoleScenario__Group_5__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3149:2: rule__ResourceRoleScenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ResourceRoleScenario__Group_5__0_in_rule__ResourceRoleScenario__Group__5__Impl6226);
            	    rule__ResourceRoleScenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getResourceRoleScenarioAccess().getGroup_5()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__5__Impl"


    // $ANTLR start "rule__ResourceRoleScenario__Group__6"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3160:1: rule__ResourceRoleScenario__Group__6 : rule__ResourceRoleScenario__Group__6__Impl ;
    public final void rule__ResourceRoleScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3164:1: ( rule__ResourceRoleScenario__Group__6__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3165:2: rule__ResourceRoleScenario__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group__6__Impl_in_rule__ResourceRoleScenario__Group__66259);
            rule__ResourceRoleScenario__Group__6__Impl();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__6"


    // $ANTLR start "rule__ResourceRoleScenario__Group__6__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3171:1: rule__ResourceRoleScenario__Group__6__Impl : ( '}' ) ;
    public final void rule__ResourceRoleScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3175:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3176:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3176:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3177:1: '}'
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__ResourceRoleScenario__Group__6__Impl6287); 
             after(grammarAccess.getResourceRoleScenarioAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group__6__Impl"


    // $ANTLR start "rule__ResourceRoleScenario__Group_5__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3204:1: rule__ResourceRoleScenario__Group_5__0 : rule__ResourceRoleScenario__Group_5__0__Impl rule__ResourceRoleScenario__Group_5__1 ;
    public final void rule__ResourceRoleScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3208:1: ( rule__ResourceRoleScenario__Group_5__0__Impl rule__ResourceRoleScenario__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3209:2: rule__ResourceRoleScenario__Group_5__0__Impl rule__ResourceRoleScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group_5__0__Impl_in_rule__ResourceRoleScenario__Group_5__06332);
            rule__ResourceRoleScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group_5__1_in_rule__ResourceRoleScenario__Group_5__06335);
            rule__ResourceRoleScenario__Group_5__1();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group_5__0"


    // $ANTLR start "rule__ResourceRoleScenario__Group_5__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3216:1: rule__ResourceRoleScenario__Group_5__0__Impl : ( 'resource:' ) ;
    public final void rule__ResourceRoleScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3220:1: ( ( 'resource:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3221:1: ( 'resource:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3221:1: ( 'resource:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3222:1: 'resource:'
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getResourceKeyword_5_0()); 
            match(input,26,FOLLOW_26_in_rule__ResourceRoleScenario__Group_5__0__Impl6363); 
             after(grammarAccess.getResourceRoleScenarioAccess().getResourceKeyword_5_0()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group_5__0__Impl"


    // $ANTLR start "rule__ResourceRoleScenario__Group_5__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3235:1: rule__ResourceRoleScenario__Group_5__1 : rule__ResourceRoleScenario__Group_5__1__Impl ;
    public final void rule__ResourceRoleScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3239:1: ( rule__ResourceRoleScenario__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3240:2: rule__ResourceRoleScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__Group_5__1__Impl_in_rule__ResourceRoleScenario__Group_5__16394);
            rule__ResourceRoleScenario__Group_5__1__Impl();

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
    // $ANTLR end "rule__ResourceRoleScenario__Group_5__1"


    // $ANTLR start "rule__ResourceRoleScenario__Group_5__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3246:1: rule__ResourceRoleScenario__Group_5__1__Impl : ( ( rule__ResourceRoleScenario__ResourcesAssignment_5_1 ) ) ;
    public final void rule__ResourceRoleScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3250:1: ( ( ( rule__ResourceRoleScenario__ResourcesAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3251:1: ( ( rule__ResourceRoleScenario__ResourcesAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3251:1: ( ( rule__ResourceRoleScenario__ResourcesAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3252:1: ( rule__ResourceRoleScenario__ResourcesAssignment_5_1 )
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getResourcesAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3253:1: ( rule__ResourceRoleScenario__ResourcesAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3253:2: rule__ResourceRoleScenario__ResourcesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ResourceRoleScenario__ResourcesAssignment_5_1_in_rule__ResourceRoleScenario__Group_5__1__Impl6421);
            rule__ResourceRoleScenario__ResourcesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceRoleScenarioAccess().getResourcesAssignment_5_1()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__Group_5__1__Impl"


    // $ANTLR start "rule__ResourceScenario__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3267:1: rule__ResourceScenario__Group__0 : rule__ResourceScenario__Group__0__Impl rule__ResourceScenario__Group__1 ;
    public final void rule__ResourceScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3271:1: ( rule__ResourceScenario__Group__0__Impl rule__ResourceScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3272:2: rule__ResourceScenario__Group__0__Impl rule__ResourceScenario__Group__1
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group__0__Impl_in_rule__ResourceScenario__Group__06455);
            rule__ResourceScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceScenario__Group__1_in_rule__ResourceScenario__Group__06458);
            rule__ResourceScenario__Group__1();

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
    // $ANTLR end "rule__ResourceScenario__Group__0"


    // $ANTLR start "rule__ResourceScenario__Group__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3279:1: rule__ResourceScenario__Group__0__Impl : ( 'roleScenario' ) ;
    public final void rule__ResourceScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3283:1: ( ( 'roleScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3284:1: ( 'roleScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3284:1: ( 'roleScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3285:1: 'roleScenario'
            {
             before(grammarAccess.getResourceScenarioAccess().getRoleScenarioKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ResourceScenario__Group__0__Impl6486); 
             after(grammarAccess.getResourceScenarioAccess().getRoleScenarioKeyword_0()); 

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
    // $ANTLR end "rule__ResourceScenario__Group__0__Impl"


    // $ANTLR start "rule__ResourceScenario__Group__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3298:1: rule__ResourceScenario__Group__1 : rule__ResourceScenario__Group__1__Impl rule__ResourceScenario__Group__2 ;
    public final void rule__ResourceScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3302:1: ( rule__ResourceScenario__Group__1__Impl rule__ResourceScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3303:2: rule__ResourceScenario__Group__1__Impl rule__ResourceScenario__Group__2
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group__1__Impl_in_rule__ResourceScenario__Group__16517);
            rule__ResourceScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceScenario__Group__2_in_rule__ResourceScenario__Group__16520);
            rule__ResourceScenario__Group__2();

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
    // $ANTLR end "rule__ResourceScenario__Group__1"


    // $ANTLR start "rule__ResourceScenario__Group__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3310:1: rule__ResourceScenario__Group__1__Impl : ( ( rule__ResourceScenario__NameAssignment_1 ) ) ;
    public final void rule__ResourceScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3314:1: ( ( ( rule__ResourceScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3315:1: ( ( rule__ResourceScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3315:1: ( ( rule__ResourceScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3316:1: ( rule__ResourceScenario__NameAssignment_1 )
            {
             before(grammarAccess.getResourceScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3317:1: ( rule__ResourceScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3317:2: rule__ResourceScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ResourceScenario__NameAssignment_1_in_rule__ResourceScenario__Group__1__Impl6547);
            rule__ResourceScenario__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceScenarioAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ResourceScenario__Group__1__Impl"


    // $ANTLR start "rule__ResourceScenario__Group__2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3327:1: rule__ResourceScenario__Group__2 : rule__ResourceScenario__Group__2__Impl rule__ResourceScenario__Group__3 ;
    public final void rule__ResourceScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3331:1: ( rule__ResourceScenario__Group__2__Impl rule__ResourceScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3332:2: rule__ResourceScenario__Group__2__Impl rule__ResourceScenario__Group__3
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group__2__Impl_in_rule__ResourceScenario__Group__26577);
            rule__ResourceScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceScenario__Group__3_in_rule__ResourceScenario__Group__26580);
            rule__ResourceScenario__Group__3();

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
    // $ANTLR end "rule__ResourceScenario__Group__2"


    // $ANTLR start "rule__ResourceScenario__Group__2__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3339:1: rule__ResourceScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__ResourceScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3343:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3344:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3344:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3345:1: '{'
            {
             before(grammarAccess.getResourceScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ResourceScenario__Group__2__Impl6608); 
             after(grammarAccess.getResourceScenarioAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ResourceScenario__Group__2__Impl"


    // $ANTLR start "rule__ResourceScenario__Group__3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3358:1: rule__ResourceScenario__Group__3 : rule__ResourceScenario__Group__3__Impl rule__ResourceScenario__Group__4 ;
    public final void rule__ResourceScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3362:1: ( rule__ResourceScenario__Group__3__Impl rule__ResourceScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3363:2: rule__ResourceScenario__Group__3__Impl rule__ResourceScenario__Group__4
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group__3__Impl_in_rule__ResourceScenario__Group__36639);
            rule__ResourceScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceScenario__Group__4_in_rule__ResourceScenario__Group__36642);
            rule__ResourceScenario__Group__4();

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
    // $ANTLR end "rule__ResourceScenario__Group__3"


    // $ANTLR start "rule__ResourceScenario__Group__3__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3370:1: rule__ResourceScenario__Group__3__Impl : ( ( ( rule__ResourceScenario__Group_3__0 ) ) ( ( rule__ResourceScenario__Group_3__0 )* ) ) ;
    public final void rule__ResourceScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3374:1: ( ( ( ( rule__ResourceScenario__Group_3__0 ) ) ( ( rule__ResourceScenario__Group_3__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3375:1: ( ( ( rule__ResourceScenario__Group_3__0 ) ) ( ( rule__ResourceScenario__Group_3__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3375:1: ( ( ( rule__ResourceScenario__Group_3__0 ) ) ( ( rule__ResourceScenario__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3376:1: ( ( rule__ResourceScenario__Group_3__0 ) ) ( ( rule__ResourceScenario__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3376:1: ( ( rule__ResourceScenario__Group_3__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3377:1: ( rule__ResourceScenario__Group_3__0 )
            {
             before(grammarAccess.getResourceScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3378:1: ( rule__ResourceScenario__Group_3__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3378:2: rule__ResourceScenario__Group_3__0
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group_3__0_in_rule__ResourceScenario__Group__3__Impl6671);
            rule__ResourceScenario__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceScenarioAccess().getGroup_3()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3381:1: ( ( rule__ResourceScenario__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3382:1: ( rule__ResourceScenario__Group_3__0 )*
            {
             before(grammarAccess.getResourceScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3383:1: ( rule__ResourceScenario__Group_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3383:2: rule__ResourceScenario__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ResourceScenario__Group_3__0_in_rule__ResourceScenario__Group__3__Impl6683);
            	    rule__ResourceScenario__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getResourceScenarioAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ResourceScenario__Group__3__Impl"


    // $ANTLR start "rule__ResourceScenario__Group__4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3394:1: rule__ResourceScenario__Group__4 : rule__ResourceScenario__Group__4__Impl ;
    public final void rule__ResourceScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3398:1: ( rule__ResourceScenario__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3399:2: rule__ResourceScenario__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group__4__Impl_in_rule__ResourceScenario__Group__46716);
            rule__ResourceScenario__Group__4__Impl();

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
    // $ANTLR end "rule__ResourceScenario__Group__4"


    // $ANTLR start "rule__ResourceScenario__Group__4__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3405:1: rule__ResourceScenario__Group__4__Impl : ( '}' ) ;
    public final void rule__ResourceScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3409:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3410:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3410:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3411:1: '}'
            {
             before(grammarAccess.getResourceScenarioAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__ResourceScenario__Group__4__Impl6744); 
             after(grammarAccess.getResourceScenarioAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ResourceScenario__Group__4__Impl"


    // $ANTLR start "rule__ResourceScenario__Group_3__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3434:1: rule__ResourceScenario__Group_3__0 : rule__ResourceScenario__Group_3__0__Impl rule__ResourceScenario__Group_3__1 ;
    public final void rule__ResourceScenario__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3438:1: ( rule__ResourceScenario__Group_3__0__Impl rule__ResourceScenario__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3439:2: rule__ResourceScenario__Group_3__0__Impl rule__ResourceScenario__Group_3__1
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group_3__0__Impl_in_rule__ResourceScenario__Group_3__06785);
            rule__ResourceScenario__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ResourceScenario__Group_3__1_in_rule__ResourceScenario__Group_3__06788);
            rule__ResourceScenario__Group_3__1();

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
    // $ANTLR end "rule__ResourceScenario__Group_3__0"


    // $ANTLR start "rule__ResourceScenario__Group_3__0__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3446:1: rule__ResourceScenario__Group_3__0__Impl : ( 'resource:' ) ;
    public final void rule__ResourceScenario__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3450:1: ( ( 'resource:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3451:1: ( 'resource:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3451:1: ( 'resource:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3452:1: 'resource:'
            {
             before(grammarAccess.getResourceScenarioAccess().getResourceKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__ResourceScenario__Group_3__0__Impl6816); 
             after(grammarAccess.getResourceScenarioAccess().getResourceKeyword_3_0()); 

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
    // $ANTLR end "rule__ResourceScenario__Group_3__0__Impl"


    // $ANTLR start "rule__ResourceScenario__Group_3__1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3465:1: rule__ResourceScenario__Group_3__1 : rule__ResourceScenario__Group_3__1__Impl ;
    public final void rule__ResourceScenario__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3469:1: ( rule__ResourceScenario__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3470:2: rule__ResourceScenario__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ResourceScenario__Group_3__1__Impl_in_rule__ResourceScenario__Group_3__16847);
            rule__ResourceScenario__Group_3__1__Impl();

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
    // $ANTLR end "rule__ResourceScenario__Group_3__1"


    // $ANTLR start "rule__ResourceScenario__Group_3__1__Impl"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3476:1: rule__ResourceScenario__Group_3__1__Impl : ( ( rule__ResourceScenario__ResourcesAssignment_3_1 ) ) ;
    public final void rule__ResourceScenario__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3480:1: ( ( ( rule__ResourceScenario__ResourcesAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3481:1: ( ( rule__ResourceScenario__ResourcesAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3481:1: ( ( rule__ResourceScenario__ResourcesAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3482:1: ( rule__ResourceScenario__ResourcesAssignment_3_1 )
            {
             before(grammarAccess.getResourceScenarioAccess().getResourcesAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3483:1: ( rule__ResourceScenario__ResourcesAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3483:2: rule__ResourceScenario__ResourcesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ResourceScenario__ResourcesAssignment_3_1_in_rule__ResourceScenario__Group_3__1__Impl6874);
            rule__ResourceScenario__ResourcesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceScenarioAccess().getResourcesAssignment_3_1()); 

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
    // $ANTLR end "rule__ResourceScenario__Group_3__1__Impl"


    // $ANTLR start "rule__Rbac__PolicyAssignment_0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3498:1: rule__Rbac__PolicyAssignment_0 : ( rulePolicy ) ;
    public final void rule__Rbac__PolicyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3502:1: ( ( rulePolicy ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3503:1: ( rulePolicy )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3503:1: ( rulePolicy )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3504:1: rulePolicy
            {
             before(grammarAccess.getRbacAccess().getPolicyPolicyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePolicy_in_rule__Rbac__PolicyAssignment_06913);
            rulePolicy();

            state._fsp--;

             after(grammarAccess.getRbacAccess().getPolicyPolicyParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rbac__PolicyAssignment_0"


    // $ANTLR start "rule__Rbac__ScenariosAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3513:1: rule__Rbac__ScenariosAssignment_1 : ( ruleScenarios ) ;
    public final void rule__Rbac__ScenariosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3517:1: ( ( ruleScenarios ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3518:1: ( ruleScenarios )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3518:1: ( ruleScenarios )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3519:1: ruleScenarios
            {
             before(grammarAccess.getRbacAccess().getScenariosScenariosParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScenarios_in_rule__Rbac__ScenariosAssignment_16944);
            ruleScenarios();

            state._fsp--;

             after(grammarAccess.getRbacAccess().getScenariosScenariosParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rbac__ScenariosAssignment_1"


    // $ANTLR start "rule__Policy__UsersAssignment_2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3528:1: rule__Policy__UsersAssignment_2 : ( ruleUser ) ;
    public final void rule__Policy__UsersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3532:1: ( ( ruleUser ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3533:1: ( ruleUser )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3533:1: ( ruleUser )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3534:1: ruleUser
            {
             before(grammarAccess.getPolicyAccess().getUsersUserParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUser_in_rule__Policy__UsersAssignment_26975);
            ruleUser();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getUsersUserParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Policy__UsersAssignment_2"


    // $ANTLR start "rule__Policy__RolesAssignment_3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3543:1: rule__Policy__RolesAssignment_3 : ( ruleRole ) ;
    public final void rule__Policy__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3547:1: ( ( ruleRole ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3548:1: ( ruleRole )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3548:1: ( ruleRole )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3549:1: ruleRole
            {
             before(grammarAccess.getPolicyAccess().getRolesRoleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Policy__RolesAssignment_37006);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getRolesRoleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Policy__RolesAssignment_3"


    // $ANTLR start "rule__Policy__PermissionsAssignment_4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3558:1: rule__Policy__PermissionsAssignment_4 : ( rulePermission ) ;
    public final void rule__Policy__PermissionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3562:1: ( ( rulePermission ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3563:1: ( rulePermission )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3563:1: ( rulePermission )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3564:1: rulePermission
            {
             before(grammarAccess.getPolicyAccess().getPermissionsPermissionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__Policy__PermissionsAssignment_47037);
            rulePermission();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getPermissionsPermissionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Policy__PermissionsAssignment_4"


    // $ANTLR start "rule__Policy__ResourcesAssignment_5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3573:1: rule__Policy__ResourcesAssignment_5 : ( ruleResource ) ;
    public final void rule__Policy__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3577:1: ( ( ruleResource ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3578:1: ( ruleResource )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3578:1: ( ruleResource )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3579:1: ruleResource
            {
             before(grammarAccess.getPolicyAccess().getResourcesResourceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResource_in_rule__Policy__ResourcesAssignment_57068);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getPolicyAccess().getResourcesResourceParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Policy__ResourcesAssignment_5"


    // $ANTLR start "rule__Scenarios__UserScenariosAssignment_2"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3588:1: rule__Scenarios__UserScenariosAssignment_2 : ( ruleUserScenario ) ;
    public final void rule__Scenarios__UserScenariosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3592:1: ( ( ruleUserScenario ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3593:1: ( ruleUserScenario )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3593:1: ( ruleUserScenario )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3594:1: ruleUserScenario
            {
             before(grammarAccess.getScenariosAccess().getUserScenariosUserScenarioParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUserScenario_in_rule__Scenarios__UserScenariosAssignment_27099);
            ruleUserScenario();

            state._fsp--;

             after(grammarAccess.getScenariosAccess().getUserScenariosUserScenarioParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Scenarios__UserScenariosAssignment_2"


    // $ANTLR start "rule__Scenarios__UserRoleScenariosAssignment_3"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3603:1: rule__Scenarios__UserRoleScenariosAssignment_3 : ( ruleUserRoleScenario ) ;
    public final void rule__Scenarios__UserRoleScenariosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3607:1: ( ( ruleUserRoleScenario ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3608:1: ( ruleUserRoleScenario )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3608:1: ( ruleUserRoleScenario )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3609:1: ruleUserRoleScenario
            {
             before(grammarAccess.getScenariosAccess().getUserRoleScenariosUserRoleScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUserRoleScenario_in_rule__Scenarios__UserRoleScenariosAssignment_37130);
            ruleUserRoleScenario();

            state._fsp--;

             after(grammarAccess.getScenariosAccess().getUserRoleScenariosUserRoleScenarioParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Scenarios__UserRoleScenariosAssignment_3"


    // $ANTLR start "rule__Scenarios__ResourceRoleScenariosAssignment_4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3618:1: rule__Scenarios__ResourceRoleScenariosAssignment_4 : ( ruleResourceRoleScenario ) ;
    public final void rule__Scenarios__ResourceRoleScenariosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3622:1: ( ( ruleResourceRoleScenario ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3623:1: ( ruleResourceRoleScenario )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3623:1: ( ruleResourceRoleScenario )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3624:1: ruleResourceRoleScenario
            {
             before(grammarAccess.getScenariosAccess().getResourceRoleScenariosResourceRoleScenarioParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleResourceRoleScenario_in_rule__Scenarios__ResourceRoleScenariosAssignment_47161);
            ruleResourceRoleScenario();

            state._fsp--;

             after(grammarAccess.getScenariosAccess().getResourceRoleScenariosResourceRoleScenarioParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Scenarios__ResourceRoleScenariosAssignment_4"


    // $ANTLR start "rule__Scenarios__RoleScenariosAssignment_5"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3633:1: rule__Scenarios__RoleScenariosAssignment_5 : ( ruleResourceScenario ) ;
    public final void rule__Scenarios__RoleScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3637:1: ( ( ruleResourceScenario ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3638:1: ( ruleResourceScenario )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3638:1: ( ruleResourceScenario )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3639:1: ruleResourceScenario
            {
             before(grammarAccess.getScenariosAccess().getRoleScenariosResourceScenarioParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResourceScenario_in_rule__Scenarios__RoleScenariosAssignment_57192);
            ruleResourceScenario();

            state._fsp--;

             after(grammarAccess.getScenariosAccess().getRoleScenariosResourceScenarioParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Scenarios__RoleScenariosAssignment_5"


    // $ANTLR start "rule__User__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3648:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3652:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3653:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3653:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3654:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_17223); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3663:1: rule__User__RolesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__User__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3667:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3668:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3668:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3669:1: ( RULE_ID )
            {
             before(grammarAccess.getUserAccess().getRolesRoleCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3670:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3671:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__RolesAssignment_3_17258); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3682:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3686:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3687:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3687:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3688:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17293); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3697:1: rule__Role__ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3701:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3702:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3702:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3703:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getParentRoleCrossReference_2_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3704:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3705:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getParentRoleIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__ParentAssignment_2_17328); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3716:1: rule__Role__SsodAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__SsodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3720:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3721:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3721:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3722:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getSsodRoleCrossReference_4_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3723:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3724:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getSsodRoleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__SsodAssignment_4_17367); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3735:1: rule__Role__DsodAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__DsodAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3739:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3740:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3740:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3741:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getDsodRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3742:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3743:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getDsodRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__DsodAssignment_5_17406); 
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


    // $ANTLR start "rule__Role__PermissionsAssignment_6_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3754:1: rule__Role__PermissionsAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__PermissionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3758:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3759:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3759:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3760:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getPermissionsPermissionCrossReference_6_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3761:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3762:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getPermissionsPermissionIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__PermissionsAssignment_6_17445); 
             after(grammarAccess.getRoleAccess().getPermissionsPermissionIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getPermissionsPermissionCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Role__PermissionsAssignment_6_1"


    // $ANTLR start "rule__Permission__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3773:1: rule__Permission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Permission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3777:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3778:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3778:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3779:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__NameAssignment_17480); 
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


    // $ANTLR start "rule__Resource__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3788:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3792:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3793:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3793:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3794:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_17511); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_1"


    // $ANTLR start "rule__Resource__PermissionsAssignment_3_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3803:1: rule__Resource__PermissionsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Resource__PermissionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3807:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3808:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3808:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3809:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceAccess().getPermissionsPermissionCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3810:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3811:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getPermissionsPermissionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__PermissionsAssignment_3_17546); 
             after(grammarAccess.getResourceAccess().getPermissionsPermissionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getPermissionsPermissionCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Resource__PermissionsAssignment_3_1"


    // $ANTLR start "rule__GrantedScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3822:1: rule__GrantedScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GrantedScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3826:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3827:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3827:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3828:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__NameAssignment_17581); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3837:1: rule__GrantedScenario__UserAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__GrantedScenario__UserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3841:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3842:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3842:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3843:1: ( RULE_ID )
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserUserCrossReference_4_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3844:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3845:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserUserIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__UserAssignment_47616); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3856:1: rule__GrantedScenario__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__GrantedScenario__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3860:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3861:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3861:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3862:1: ( RULE_ID )
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3863:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3864:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__RolesAssignment_5_17655); 
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


    // $ANTLR start "rule__GrantedScenario__ResourcesAssignment_6_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3875:1: rule__GrantedScenario__ResourcesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__GrantedScenario__ResourcesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3879:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3880:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3880:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3881:1: ( RULE_ID )
            {
             before(grammarAccess.getGrantedScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3882:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3883:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getResourcesResourceIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__ResourcesAssignment_6_17694); 
             after(grammarAccess.getGrantedScenarioAccess().getResourcesResourceIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getGrantedScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__GrantedScenario__ResourcesAssignment_6_1"


    // $ANTLR start "rule__ForbiddenScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3894:1: rule__ForbiddenScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForbiddenScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3898:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3899:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3899:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3900:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__NameAssignment_17729); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3909:1: rule__ForbiddenScenario__UserAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForbiddenScenario__UserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3913:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3914:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3914:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3915:1: ( RULE_ID )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserUserCrossReference_4_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3916:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3917:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserUserIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__UserAssignment_47764); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3928:1: rule__ForbiddenScenario__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForbiddenScenario__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3932:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3933:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3933:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3934:1: ( RULE_ID )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3935:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3936:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__RolesAssignment_5_17803); 
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


    // $ANTLR start "rule__ForbiddenScenario__ResourcesAssignment_6_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3947:1: rule__ForbiddenScenario__ResourcesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForbiddenScenario__ResourcesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3951:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3952:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3952:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3953:1: ( RULE_ID )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3954:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3955:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getResourcesResourceIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__ResourcesAssignment_6_17842); 
             after(grammarAccess.getForbiddenScenarioAccess().getResourcesResourceIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getForbiddenScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__ForbiddenScenario__ResourcesAssignment_6_1"


    // $ANTLR start "rule__UserRoleScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3966:1: rule__UserRoleScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UserRoleScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3970:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3971:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3971:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3972:1: RULE_ID
            {
             before(grammarAccess.getUserRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleScenario__NameAssignment_17877); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3981:1: rule__UserRoleScenario__RolesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__UserRoleScenario__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3985:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3986:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3986:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3987:1: ( RULE_ID )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesRoleCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3988:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3989:1: RULE_ID
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleScenario__RolesAssignment_3_17912); 
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


    // $ANTLR start "rule__ResourceRoleScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4000:1: rule__ResourceRoleScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResourceRoleScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4004:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4005:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4005:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4006:1: RULE_ID
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceRoleScenario__NameAssignment_17947); 
             after(grammarAccess.getResourceRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__NameAssignment_1"


    // $ANTLR start "rule__ResourceRoleScenario__RoleAssignment_4"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4015:1: rule__ResourceRoleScenario__RoleAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceRoleScenario__RoleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4019:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4020:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4020:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4021:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getRoleRoleCrossReference_4_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4022:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4023:1: RULE_ID
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceRoleScenario__RoleAssignment_47982); 
             after(grammarAccess.getResourceRoleScenarioAccess().getRoleRoleIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getResourceRoleScenarioAccess().getRoleRoleCrossReference_4_0()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__RoleAssignment_4"


    // $ANTLR start "rule__ResourceRoleScenario__ResourcesAssignment_5_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4034:1: rule__ResourceRoleScenario__ResourcesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceRoleScenario__ResourcesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4038:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4039:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4039:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4040:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getResourcesResourceCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4041:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4042:1: RULE_ID
            {
             before(grammarAccess.getResourceRoleScenarioAccess().getResourcesResourceIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceRoleScenario__ResourcesAssignment_5_18021); 
             after(grammarAccess.getResourceRoleScenarioAccess().getResourcesResourceIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getResourceRoleScenarioAccess().getResourcesResourceCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__ResourceRoleScenario__ResourcesAssignment_5_1"


    // $ANTLR start "rule__ResourceScenario__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4053:1: rule__ResourceScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ResourceScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4057:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4058:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4058:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4059:1: RULE_ID
            {
             before(grammarAccess.getResourceScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceScenario__NameAssignment_18056); 
             after(grammarAccess.getResourceScenarioAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ResourceScenario__NameAssignment_1"


    // $ANTLR start "rule__ResourceScenario__ResourcesAssignment_3_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4068:1: rule__ResourceScenario__ResourcesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__ResourceScenario__ResourcesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4072:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4073:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4073:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4074:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceScenarioAccess().getResourcesResourceCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4075:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:4076:1: RULE_ID
            {
             before(grammarAccess.getResourceScenarioAccess().getResourcesResourceIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ResourceScenario__ResourcesAssignment_3_18091); 
             after(grammarAccess.getResourceScenarioAccess().getResourcesResourceIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getResourceScenarioAccess().getResourcesResourceCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__ResourceScenario__ResourcesAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRbac_in_entryRuleRbac61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRbac68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__0_in_ruleRbac94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_entryRulePolicy121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePolicy128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0_in_rulePolicy154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarios_in_entryRuleScenarios181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScenarios188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__0_in_ruleScenarios214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_entryRuleUser241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUser248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0_in_ruleUser274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_entryRulePermission361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePermission368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0_in_rulePermission394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserScenario_in_entryRuleUserScenario481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserScenario488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserScenario__Alternatives_in_ruleUserScenario514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_entryRuleGrantedScenario541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrantedScenario548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__0_in_ruleGrantedScenario574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_entryRuleForbiddenScenario601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForbiddenScenario608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__0_in_ruleForbiddenScenario634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_entryRuleUserRoleScenario661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUserRoleScenario668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__0_in_ruleUserRoleScenario694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceRoleScenario_in_entryRuleResourceRoleScenario721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceRoleScenario728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__0_in_ruleResourceRoleScenario754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceScenario_in_entryRuleResourceScenario781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResourceScenario788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__0_in_ruleResourceScenario814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrantedScenario_in_rule__UserScenario__Alternatives850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_rule__UserScenario__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__0__Impl_in_rule__Rbac__Group__0897 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__1_in_rule__Rbac__Group__0900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__PolicyAssignment_0_in_rule__Rbac__Group__0__Impl927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__1__Impl_in_rule__Rbac__Group__1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__ScenariosAssignment_1_in_rule__Rbac__Group__1__Impl984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__01018 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__01021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Policy__Group__0__Impl1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__11080 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__11083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Policy__Group__1__Impl1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__21142 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__3_in_rule__Policy__Group__21145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__UsersAssignment_2_in_rule__Policy__Group__2__Impl1172 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Policy__Group__3__Impl_in_rule__Policy__Group__31203 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__4_in_rule__Policy__Group__31206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__RolesAssignment_3_in_rule__Policy__Group__3__Impl1233 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Policy__Group__4__Impl_in_rule__Policy__Group__41264 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__5_in_rule__Policy__Group__41267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__PermissionsAssignment_4_in_rule__Policy__Group__4__Impl1294 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Policy__Group__5__Impl_in_rule__Policy__Group__51325 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__6_in_rule__Policy__Group__51328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__ResourcesAssignment_5_in_rule__Policy__Group__5__Impl1355 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Policy__Group__6__Impl_in_rule__Policy__Group__61386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Policy__Group__6__Impl1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__0__Impl_in_rule__Scenarios__Group__01459 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__1_in_rule__Scenarios__Group__01462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Scenarios__Group__0__Impl1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__1__Impl_in_rule__Scenarios__Group__11521 = new BitSet(new long[]{0x0000000079002000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__2_in_rule__Scenarios__Group__11524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Scenarios__Group__1__Impl1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__2__Impl_in_rule__Scenarios__Group__21583 = new BitSet(new long[]{0x0000000079002000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__3_in_rule__Scenarios__Group__21586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__UserScenariosAssignment_2_in_rule__Scenarios__Group__2__Impl1613 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__3__Impl_in_rule__Scenarios__Group__31644 = new BitSet(new long[]{0x0000000079002000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__4_in_rule__Scenarios__Group__31647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__UserRoleScenariosAssignment_3_in_rule__Scenarios__Group__3__Impl1674 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__4__Impl_in_rule__Scenarios__Group__41705 = new BitSet(new long[]{0x0000000079002000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__5_in_rule__Scenarios__Group__41708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__ResourceRoleScenariosAssignment_4_in_rule__Scenarios__Group__4__Impl1735 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__5__Impl_in_rule__Scenarios__Group__51766 = new BitSet(new long[]{0x0000000079002000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__6_in_rule__Scenarios__Group__51769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__RoleScenariosAssignment_5_in_rule__Scenarios__Group__5__Impl1796 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__6__Impl_in_rule__Scenarios__Group__61827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Scenarios__Group__6__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__01903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__User__Group__0__Impl1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11962 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__User__Group__2_in_rule__User__Group__11965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__22022 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__User__Group__3_in_rule__User__Group__22025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__User__Group__2__Impl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__32084 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__User__Group__4_in_rule__User__Group__32087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__0_in_rule__User__Group__3__Impl2114 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__42145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__User__Group__4__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__0__Impl_in_rule__User__Group_3__02214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group_3__1_in_rule__User__Group_3__02217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__User__Group_3__0__Impl2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__1__Impl_in_rule__User__Group_3__12276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__RolesAssignment_3_1_in_rule__User__Group_3__1__Impl2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__02337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__02340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Role__Group__0__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__12399 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__12402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__22459 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__22462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__32520 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__32523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__3__Impl2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__42582 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__42585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl2612 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__52643 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_rule__Role__Group__6_in_rule__Role__Group__52646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__0_in_rule__Role__Group__5__Impl2673 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__62704 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_rule__Role__Group__7_in_rule__Role__Group__62707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__0_in_rule__Role__Group__6__Impl2734 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__72765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Role__Group__7__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__02840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__02843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Role__Group_2__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__12902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__ParentAssignment_2_1_in_rule__Role__Group_2__1__Impl2929 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__02964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__02967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Role__Group_4__0__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__13026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__SsodAssignment_4_1_in_rule__Role__Group_4__1__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__0__Impl_in_rule__Role__Group_5__03087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_5__1_in_rule__Role__Group_5__03090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Role__Group_5__0__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__1__Impl_in_rule__Role__Group_5__13149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__DsodAssignment_5_1_in_rule__Role__Group_5__1__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__0__Impl_in_rule__Role__Group_6__03210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_6__1_in_rule__Role__Group_6__03213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Role__Group_6__0__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__1__Impl_in_rule__Role__Group_6__13272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__PermissionsAssignment_6_1_in_rule__Role__Group_6__1__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__03333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__03336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Permission__Group__0__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__13395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__NameAssignment_1_in_rule__Permission__Group__1__Impl3422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__03456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Resource__Group__0__Impl3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__13518 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__13521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__23578 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__23581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Resource__Group__2__Impl3609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__33640 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__Resource__Group__4_in_rule__Resource__Group__33643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl3670 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Resource__Group__4__Impl_in_rule__Resource__Group__43701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Resource__Group__4__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__03770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__03773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Resource__Group_3__0__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__13832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__PermissionsAssignment_3_1_in_rule__Resource__Group_3__1__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__0__Impl_in_rule__GrantedScenario__Group__03893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__1_in_rule__GrantedScenario__Group__03896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GrantedScenario__Group__0__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__1__Impl_in_rule__GrantedScenario__Group__13955 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__2_in_rule__GrantedScenario__Group__13958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__NameAssignment_1_in_rule__GrantedScenario__Group__1__Impl3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__2__Impl_in_rule__GrantedScenario__Group__24015 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__3_in_rule__GrantedScenario__Group__24018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GrantedScenario__Group__2__Impl4046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__3__Impl_in_rule__GrantedScenario__Group__34077 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__4_in_rule__GrantedScenario__Group__34080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GrantedScenario__Group__3__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__4__Impl_in_rule__GrantedScenario__Group__44139 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__5_in_rule__GrantedScenario__Group__44142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__UserAssignment_4_in_rule__GrantedScenario__Group__4__Impl4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__5__Impl_in_rule__GrantedScenario__Group__54199 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__6_in_rule__GrantedScenario__Group__54202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__0_in_rule__GrantedScenario__Group__5__Impl4229 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__6__Impl_in_rule__GrantedScenario__Group__64260 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__7_in_rule__GrantedScenario__Group__64263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4292 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4304 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__7__Impl_in_rule__GrantedScenario__Group__74337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__GrantedScenario__Group__7__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__0__Impl_in_rule__GrantedScenario__Group_5__04412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__1_in_rule__GrantedScenario__Group_5__04415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GrantedScenario__Group_5__0__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__1__Impl_in_rule__GrantedScenario__Group_5__14474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__RolesAssignment_5_1_in_rule__GrantedScenario__Group_5__1__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0__Impl_in_rule__GrantedScenario__Group_6__04535 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__1_in_rule__GrantedScenario__Group_6__04538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GrantedScenario__Group_6__0__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__1__Impl_in_rule__GrantedScenario__Group_6__14597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__ResourcesAssignment_6_1_in_rule__GrantedScenario__Group_6__1__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__0__Impl_in_rule__ForbiddenScenario__Group__04658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__1_in_rule__ForbiddenScenario__Group__04661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ForbiddenScenario__Group__0__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__1__Impl_in_rule__ForbiddenScenario__Group__14720 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__2_in_rule__ForbiddenScenario__Group__14723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__NameAssignment_1_in_rule__ForbiddenScenario__Group__1__Impl4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__2__Impl_in_rule__ForbiddenScenario__Group__24780 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__3_in_rule__ForbiddenScenario__Group__24783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ForbiddenScenario__Group__2__Impl4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__3__Impl_in_rule__ForbiddenScenario__Group__34842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__4_in_rule__ForbiddenScenario__Group__34845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ForbiddenScenario__Group__3__Impl4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__4__Impl_in_rule__ForbiddenScenario__Group__44904 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__5_in_rule__ForbiddenScenario__Group__44907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__UserAssignment_4_in_rule__ForbiddenScenario__Group__4__Impl4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__5__Impl_in_rule__ForbiddenScenario__Group__54964 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__6_in_rule__ForbiddenScenario__Group__54967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__0_in_rule__ForbiddenScenario__Group__5__Impl4994 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__6__Impl_in_rule__ForbiddenScenario__Group__65025 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__7_in_rule__ForbiddenScenario__Group__65028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl5057 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl5069 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__7__Impl_in_rule__ForbiddenScenario__Group__75102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ForbiddenScenario__Group__7__Impl5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__0__Impl_in_rule__ForbiddenScenario__Group_5__05177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__1_in_rule__ForbiddenScenario__Group_5__05180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ForbiddenScenario__Group_5__0__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__1__Impl_in_rule__ForbiddenScenario__Group_5__15239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__RolesAssignment_5_1_in_rule__ForbiddenScenario__Group_5__1__Impl5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0__Impl_in_rule__ForbiddenScenario__Group_6__05300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__1_in_rule__ForbiddenScenario__Group_6__05303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ForbiddenScenario__Group_6__0__Impl5331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__1__Impl_in_rule__ForbiddenScenario__Group_6__15362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__ResourcesAssignment_6_1_in_rule__ForbiddenScenario__Group_6__1__Impl5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__0__Impl_in_rule__UserRoleScenario__Group__05423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__1_in_rule__UserRoleScenario__Group__05426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UserRoleScenario__Group__0__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__1__Impl_in_rule__UserRoleScenario__Group__15485 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__2_in_rule__UserRoleScenario__Group__15488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__NameAssignment_1_in_rule__UserRoleScenario__Group__1__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__2__Impl_in_rule__UserRoleScenario__Group__25545 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__3_in_rule__UserRoleScenario__Group__25548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UserRoleScenario__Group__2__Impl5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__3__Impl_in_rule__UserRoleScenario__Group__35607 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__4_in_rule__UserRoleScenario__Group__35610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5639 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5651 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__4__Impl_in_rule__UserRoleScenario__Group__45684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UserRoleScenario__Group__4__Impl5712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0__Impl_in_rule__UserRoleScenario__Group_3__05753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__1_in_rule__UserRoleScenario__Group_3__05756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UserRoleScenario__Group_3__0__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__1__Impl_in_rule__UserRoleScenario__Group_3__15815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__RolesAssignment_3_1_in_rule__UserRoleScenario__Group_3__1__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__0__Impl_in_rule__ResourceRoleScenario__Group__05876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__1_in_rule__ResourceRoleScenario__Group__05879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ResourceRoleScenario__Group__0__Impl5907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__1__Impl_in_rule__ResourceRoleScenario__Group__15938 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__2_in_rule__ResourceRoleScenario__Group__15941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__NameAssignment_1_in_rule__ResourceRoleScenario__Group__1__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__2__Impl_in_rule__ResourceRoleScenario__Group__25998 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__3_in_rule__ResourceRoleScenario__Group__26001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ResourceRoleScenario__Group__2__Impl6029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__3__Impl_in_rule__ResourceRoleScenario__Group__36060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__4_in_rule__ResourceRoleScenario__Group__36063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ResourceRoleScenario__Group__3__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__4__Impl_in_rule__ResourceRoleScenario__Group__46122 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__5_in_rule__ResourceRoleScenario__Group__46125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__RoleAssignment_4_in_rule__ResourceRoleScenario__Group__4__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__5__Impl_in_rule__ResourceRoleScenario__Group__56182 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__6_in_rule__ResourceRoleScenario__Group__56185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group_5__0_in_rule__ResourceRoleScenario__Group__5__Impl6214 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group_5__0_in_rule__ResourceRoleScenario__Group__5__Impl6226 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group__6__Impl_in_rule__ResourceRoleScenario__Group__66259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ResourceRoleScenario__Group__6__Impl6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group_5__0__Impl_in_rule__ResourceRoleScenario__Group_5__06332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group_5__1_in_rule__ResourceRoleScenario__Group_5__06335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ResourceRoleScenario__Group_5__0__Impl6363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__Group_5__1__Impl_in_rule__ResourceRoleScenario__Group_5__16394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceRoleScenario__ResourcesAssignment_5_1_in_rule__ResourceRoleScenario__Group_5__1__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__0__Impl_in_rule__ResourceScenario__Group__06455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__1_in_rule__ResourceScenario__Group__06458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ResourceScenario__Group__0__Impl6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__1__Impl_in_rule__ResourceScenario__Group__16517 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__2_in_rule__ResourceScenario__Group__16520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__NameAssignment_1_in_rule__ResourceScenario__Group__1__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__2__Impl_in_rule__ResourceScenario__Group__26577 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__3_in_rule__ResourceScenario__Group__26580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ResourceScenario__Group__2__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__3__Impl_in_rule__ResourceScenario__Group__36639 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__4_in_rule__ResourceScenario__Group__36642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group_3__0_in_rule__ResourceScenario__Group__3__Impl6671 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group_3__0_in_rule__ResourceScenario__Group__3__Impl6683 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group__4__Impl_in_rule__ResourceScenario__Group__46716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ResourceScenario__Group__4__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group_3__0__Impl_in_rule__ResourceScenario__Group_3__06785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group_3__1_in_rule__ResourceScenario__Group_3__06788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ResourceScenario__Group_3__0__Impl6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__Group_3__1__Impl_in_rule__ResourceScenario__Group_3__16847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ResourceScenario__ResourcesAssignment_3_1_in_rule__ResourceScenario__Group_3__1__Impl6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_rule__Rbac__PolicyAssignment_06913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarios_in_rule__Rbac__ScenariosAssignment_16944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__Policy__UsersAssignment_26975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Policy__RolesAssignment_37006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__Policy__PermissionsAssignment_47037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Policy__ResourcesAssignment_57068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserScenario_in_rule__Scenarios__UserScenariosAssignment_27099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_rule__Scenarios__UserRoleScenariosAssignment_37130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceRoleScenario_in_rule__Scenarios__ResourceRoleScenariosAssignment_47161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResourceScenario_in_rule__Scenarios__RoleScenariosAssignment_57192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_17223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__RolesAssignment_3_17258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_17293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__ParentAssignment_2_17328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__SsodAssignment_4_17367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__DsodAssignment_5_17406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__PermissionsAssignment_6_17445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__NameAssignment_17480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_17511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__PermissionsAssignment_3_17546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__NameAssignment_17581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__UserAssignment_47616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__RolesAssignment_5_17655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__ResourcesAssignment_6_17694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__NameAssignment_17729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__UserAssignment_47764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__RolesAssignment_5_17803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__ResourcesAssignment_6_17842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleScenario__NameAssignment_17877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleScenario__RolesAssignment_3_17912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceRoleScenario__NameAssignment_17947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceRoleScenario__RoleAssignment_47982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceRoleScenario__ResourcesAssignment_5_18021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceScenario__NameAssignment_18056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ResourceScenario__ResourcesAssignment_3_18091 = new BitSet(new long[]{0x0000000000000002L});

}