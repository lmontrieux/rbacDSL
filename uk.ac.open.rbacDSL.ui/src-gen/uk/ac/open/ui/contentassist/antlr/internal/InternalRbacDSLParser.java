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


    // $ANTLR start "rule__UserScenario__Alternatives"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:368:1: rule__UserScenario__Alternatives : ( ( ruleGrantedScenario ) | ( ruleForbiddenScenario ) );
    public final void rule__UserScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:372:1: ( ( ruleGrantedScenario ) | ( ruleForbiddenScenario ) )
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
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:373:1: ( ruleGrantedScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:373:1: ( ruleGrantedScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:374:1: ruleGrantedScenario
                    {
                     before(grammarAccess.getUserScenarioAccess().getGrantedScenarioParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGrantedScenario_in_rule__UserScenario__Alternatives730);
                    ruleGrantedScenario();

                    state._fsp--;

                     after(grammarAccess.getUserScenarioAccess().getGrantedScenarioParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:379:6: ( ruleForbiddenScenario )
                    {
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:379:6: ( ruleForbiddenScenario )
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:380:1: ruleForbiddenScenario
                    {
                     before(grammarAccess.getUserScenarioAccess().getForbiddenScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForbiddenScenario_in_rule__UserScenario__Alternatives747);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:392:1: rule__Rbac__Group__0 : rule__Rbac__Group__0__Impl rule__Rbac__Group__1 ;
    public final void rule__Rbac__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:396:1: ( rule__Rbac__Group__0__Impl rule__Rbac__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:397:2: rule__Rbac__Group__0__Impl rule__Rbac__Group__1
            {
            pushFollow(FOLLOW_rule__Rbac__Group__0__Impl_in_rule__Rbac__Group__0777);
            rule__Rbac__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rbac__Group__1_in_rule__Rbac__Group__0780);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:404:1: rule__Rbac__Group__0__Impl : ( ( rule__Rbac__PolicyAssignment_0 ) ) ;
    public final void rule__Rbac__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:408:1: ( ( ( rule__Rbac__PolicyAssignment_0 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:409:1: ( ( rule__Rbac__PolicyAssignment_0 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:409:1: ( ( rule__Rbac__PolicyAssignment_0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:410:1: ( rule__Rbac__PolicyAssignment_0 )
            {
             before(grammarAccess.getRbacAccess().getPolicyAssignment_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:411:1: ( rule__Rbac__PolicyAssignment_0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:411:2: rule__Rbac__PolicyAssignment_0
            {
            pushFollow(FOLLOW_rule__Rbac__PolicyAssignment_0_in_rule__Rbac__Group__0__Impl807);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:421:1: rule__Rbac__Group__1 : rule__Rbac__Group__1__Impl ;
    public final void rule__Rbac__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:425:1: ( rule__Rbac__Group__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:426:2: rule__Rbac__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rbac__Group__1__Impl_in_rule__Rbac__Group__1837);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:432:1: rule__Rbac__Group__1__Impl : ( ( rule__Rbac__ScenariosAssignment_1 ) ) ;
    public final void rule__Rbac__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:436:1: ( ( ( rule__Rbac__ScenariosAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:437:1: ( ( rule__Rbac__ScenariosAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:437:1: ( ( rule__Rbac__ScenariosAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:438:1: ( rule__Rbac__ScenariosAssignment_1 )
            {
             before(grammarAccess.getRbacAccess().getScenariosAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:439:1: ( rule__Rbac__ScenariosAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:439:2: rule__Rbac__ScenariosAssignment_1
            {
            pushFollow(FOLLOW_rule__Rbac__ScenariosAssignment_1_in_rule__Rbac__Group__1__Impl864);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:453:1: rule__Policy__Group__0 : rule__Policy__Group__0__Impl rule__Policy__Group__1 ;
    public final void rule__Policy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:457:1: ( rule__Policy__Group__0__Impl rule__Policy__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:458:2: rule__Policy__Group__0__Impl rule__Policy__Group__1
            {
            pushFollow(FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__0898);
            rule__Policy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__0901);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:465:1: rule__Policy__Group__0__Impl : ( 'policy' ) ;
    public final void rule__Policy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:469:1: ( ( 'policy' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:470:1: ( 'policy' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:470:1: ( 'policy' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:471:1: 'policy'
            {
             before(grammarAccess.getPolicyAccess().getPolicyKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Policy__Group__0__Impl929); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:484:1: rule__Policy__Group__1 : rule__Policy__Group__1__Impl rule__Policy__Group__2 ;
    public final void rule__Policy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:488:1: ( rule__Policy__Group__1__Impl rule__Policy__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:489:2: rule__Policy__Group__1__Impl rule__Policy__Group__2
            {
            pushFollow(FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__1960);
            rule__Policy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__1963);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:496:1: rule__Policy__Group__1__Impl : ( '{' ) ;
    public final void rule__Policy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:500:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:501:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:501:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:502:1: '{'
            {
             before(grammarAccess.getPolicyAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Policy__Group__1__Impl991); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:515:1: rule__Policy__Group__2 : rule__Policy__Group__2__Impl rule__Policy__Group__3 ;
    public final void rule__Policy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:519:1: ( rule__Policy__Group__2__Impl rule__Policy__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:520:2: rule__Policy__Group__2__Impl rule__Policy__Group__3
            {
            pushFollow(FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__21022);
            rule__Policy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__3_in_rule__Policy__Group__21025);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:527:1: rule__Policy__Group__2__Impl : ( ( rule__Policy__UsersAssignment_2 )* ) ;
    public final void rule__Policy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:531:1: ( ( ( rule__Policy__UsersAssignment_2 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:532:1: ( ( rule__Policy__UsersAssignment_2 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:532:1: ( ( rule__Policy__UsersAssignment_2 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:533:1: ( rule__Policy__UsersAssignment_2 )*
            {
             before(grammarAccess.getPolicyAccess().getUsersAssignment_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:534:1: ( rule__Policy__UsersAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:534:2: rule__Policy__UsersAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Policy__UsersAssignment_2_in_rule__Policy__Group__2__Impl1052);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:544:1: rule__Policy__Group__3 : rule__Policy__Group__3__Impl rule__Policy__Group__4 ;
    public final void rule__Policy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:548:1: ( rule__Policy__Group__3__Impl rule__Policy__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:549:2: rule__Policy__Group__3__Impl rule__Policy__Group__4
            {
            pushFollow(FOLLOW_rule__Policy__Group__3__Impl_in_rule__Policy__Group__31083);
            rule__Policy__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__4_in_rule__Policy__Group__31086);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:556:1: rule__Policy__Group__3__Impl : ( ( rule__Policy__RolesAssignment_3 )* ) ;
    public final void rule__Policy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:560:1: ( ( ( rule__Policy__RolesAssignment_3 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:561:1: ( ( rule__Policy__RolesAssignment_3 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:561:1: ( ( rule__Policy__RolesAssignment_3 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:562:1: ( rule__Policy__RolesAssignment_3 )*
            {
             before(grammarAccess.getPolicyAccess().getRolesAssignment_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:563:1: ( rule__Policy__RolesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:563:2: rule__Policy__RolesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Policy__RolesAssignment_3_in_rule__Policy__Group__3__Impl1113);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:573:1: rule__Policy__Group__4 : rule__Policy__Group__4__Impl rule__Policy__Group__5 ;
    public final void rule__Policy__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:577:1: ( rule__Policy__Group__4__Impl rule__Policy__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:578:2: rule__Policy__Group__4__Impl rule__Policy__Group__5
            {
            pushFollow(FOLLOW_rule__Policy__Group__4__Impl_in_rule__Policy__Group__41144);
            rule__Policy__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__5_in_rule__Policy__Group__41147);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:585:1: rule__Policy__Group__4__Impl : ( ( rule__Policy__PermissionsAssignment_4 )* ) ;
    public final void rule__Policy__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:589:1: ( ( ( rule__Policy__PermissionsAssignment_4 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:590:1: ( ( rule__Policy__PermissionsAssignment_4 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:590:1: ( ( rule__Policy__PermissionsAssignment_4 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:591:1: ( rule__Policy__PermissionsAssignment_4 )*
            {
             before(grammarAccess.getPolicyAccess().getPermissionsAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:592:1: ( rule__Policy__PermissionsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:592:2: rule__Policy__PermissionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Policy__PermissionsAssignment_4_in_rule__Policy__Group__4__Impl1174);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:602:1: rule__Policy__Group__5 : rule__Policy__Group__5__Impl rule__Policy__Group__6 ;
    public final void rule__Policy__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:606:1: ( rule__Policy__Group__5__Impl rule__Policy__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:607:2: rule__Policy__Group__5__Impl rule__Policy__Group__6
            {
            pushFollow(FOLLOW_rule__Policy__Group__5__Impl_in_rule__Policy__Group__51205);
            rule__Policy__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Policy__Group__6_in_rule__Policy__Group__51208);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:614:1: rule__Policy__Group__5__Impl : ( ( rule__Policy__ResourcesAssignment_5 )* ) ;
    public final void rule__Policy__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:618:1: ( ( ( rule__Policy__ResourcesAssignment_5 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:619:1: ( ( rule__Policy__ResourcesAssignment_5 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:619:1: ( ( rule__Policy__ResourcesAssignment_5 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:620:1: ( rule__Policy__ResourcesAssignment_5 )*
            {
             before(grammarAccess.getPolicyAccess().getResourcesAssignment_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:621:1: ( rule__Policy__ResourcesAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:621:2: rule__Policy__ResourcesAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Policy__ResourcesAssignment_5_in_rule__Policy__Group__5__Impl1235);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:631:1: rule__Policy__Group__6 : rule__Policy__Group__6__Impl ;
    public final void rule__Policy__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:635:1: ( rule__Policy__Group__6__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:636:2: rule__Policy__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Policy__Group__6__Impl_in_rule__Policy__Group__61266);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:642:1: rule__Policy__Group__6__Impl : ( '}' ) ;
    public final void rule__Policy__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:646:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:647:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:647:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:648:1: '}'
            {
             before(grammarAccess.getPolicyAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Policy__Group__6__Impl1294); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:675:1: rule__Scenarios__Group__0 : rule__Scenarios__Group__0__Impl rule__Scenarios__Group__1 ;
    public final void rule__Scenarios__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:679:1: ( rule__Scenarios__Group__0__Impl rule__Scenarios__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:680:2: rule__Scenarios__Group__0__Impl rule__Scenarios__Group__1
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__0__Impl_in_rule__Scenarios__Group__01339);
            rule__Scenarios__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__1_in_rule__Scenarios__Group__01342);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:687:1: rule__Scenarios__Group__0__Impl : ( 'scenarios' ) ;
    public final void rule__Scenarios__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:691:1: ( ( 'scenarios' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:692:1: ( 'scenarios' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:692:1: ( 'scenarios' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:693:1: 'scenarios'
            {
             before(grammarAccess.getScenariosAccess().getScenariosKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Scenarios__Group__0__Impl1370); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:706:1: rule__Scenarios__Group__1 : rule__Scenarios__Group__1__Impl rule__Scenarios__Group__2 ;
    public final void rule__Scenarios__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:710:1: ( rule__Scenarios__Group__1__Impl rule__Scenarios__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:711:2: rule__Scenarios__Group__1__Impl rule__Scenarios__Group__2
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__1__Impl_in_rule__Scenarios__Group__11401);
            rule__Scenarios__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__2_in_rule__Scenarios__Group__11404);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:718:1: rule__Scenarios__Group__1__Impl : ( '{' ) ;
    public final void rule__Scenarios__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:722:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:723:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:723:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:724:1: '{'
            {
             before(grammarAccess.getScenariosAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_12_in_rule__Scenarios__Group__1__Impl1432); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:737:1: rule__Scenarios__Group__2 : rule__Scenarios__Group__2__Impl rule__Scenarios__Group__3 ;
    public final void rule__Scenarios__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:741:1: ( rule__Scenarios__Group__2__Impl rule__Scenarios__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:742:2: rule__Scenarios__Group__2__Impl rule__Scenarios__Group__3
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__2__Impl_in_rule__Scenarios__Group__21463);
            rule__Scenarios__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__3_in_rule__Scenarios__Group__21466);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:749:1: rule__Scenarios__Group__2__Impl : ( ( rule__Scenarios__UserScenariosAssignment_2 )* ) ;
    public final void rule__Scenarios__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:753:1: ( ( ( rule__Scenarios__UserScenariosAssignment_2 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:754:1: ( ( rule__Scenarios__UserScenariosAssignment_2 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:754:1: ( ( rule__Scenarios__UserScenariosAssignment_2 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:755:1: ( rule__Scenarios__UserScenariosAssignment_2 )*
            {
             before(grammarAccess.getScenariosAccess().getUserScenariosAssignment_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:756:1: ( rule__Scenarios__UserScenariosAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:756:2: rule__Scenarios__UserScenariosAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Scenarios__UserScenariosAssignment_2_in_rule__Scenarios__Group__2__Impl1493);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:766:1: rule__Scenarios__Group__3 : rule__Scenarios__Group__3__Impl rule__Scenarios__Group__4 ;
    public final void rule__Scenarios__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:770:1: ( rule__Scenarios__Group__3__Impl rule__Scenarios__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:771:2: rule__Scenarios__Group__3__Impl rule__Scenarios__Group__4
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__3__Impl_in_rule__Scenarios__Group__31524);
            rule__Scenarios__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Scenarios__Group__4_in_rule__Scenarios__Group__31527);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:778:1: rule__Scenarios__Group__3__Impl : ( ( rule__Scenarios__UserRoleScenariosAssignment_3 )* ) ;
    public final void rule__Scenarios__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:782:1: ( ( ( rule__Scenarios__UserRoleScenariosAssignment_3 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:783:1: ( ( rule__Scenarios__UserRoleScenariosAssignment_3 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:783:1: ( ( rule__Scenarios__UserRoleScenariosAssignment_3 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:784:1: ( rule__Scenarios__UserRoleScenariosAssignment_3 )*
            {
             before(grammarAccess.getScenariosAccess().getUserRoleScenariosAssignment_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:785:1: ( rule__Scenarios__UserRoleScenariosAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:785:2: rule__Scenarios__UserRoleScenariosAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Scenarios__UserRoleScenariosAssignment_3_in_rule__Scenarios__Group__3__Impl1554);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:795:1: rule__Scenarios__Group__4 : rule__Scenarios__Group__4__Impl ;
    public final void rule__Scenarios__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:799:1: ( rule__Scenarios__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:800:2: rule__Scenarios__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Scenarios__Group__4__Impl_in_rule__Scenarios__Group__41585);
            rule__Scenarios__Group__4__Impl();

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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:806:1: rule__Scenarios__Group__4__Impl : ( '}' ) ;
    public final void rule__Scenarios__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:810:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:811:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:811:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:812:1: '}'
            {
             before(grammarAccess.getScenariosAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Scenarios__Group__4__Impl1613); 
             after(grammarAccess.getScenariosAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__User__Group__0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:835:1: rule__User__Group__0 : rule__User__Group__0__Impl rule__User__Group__1 ;
    public final void rule__User__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:839:1: ( rule__User__Group__0__Impl rule__User__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:840:2: rule__User__Group__0__Impl rule__User__Group__1
            {
            pushFollow(FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01654);
            rule__User__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__1_in_rule__User__Group__01657);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:847:1: rule__User__Group__0__Impl : ( 'user' ) ;
    public final void rule__User__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:851:1: ( ( 'user' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:852:1: ( 'user' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:852:1: ( 'user' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:853:1: 'user'
            {
             before(grammarAccess.getUserAccess().getUserKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__User__Group__0__Impl1685); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:866:1: rule__User__Group__1 : rule__User__Group__1__Impl rule__User__Group__2 ;
    public final void rule__User__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:870:1: ( rule__User__Group__1__Impl rule__User__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:871:2: rule__User__Group__1__Impl rule__User__Group__2
            {
            pushFollow(FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11716);
            rule__User__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__2_in_rule__User__Group__11719);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:878:1: rule__User__Group__1__Impl : ( ( rule__User__NameAssignment_1 ) ) ;
    public final void rule__User__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:882:1: ( ( ( rule__User__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:883:1: ( ( rule__User__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:883:1: ( ( rule__User__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:884:1: ( rule__User__NameAssignment_1 )
            {
             before(grammarAccess.getUserAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:885:1: ( rule__User__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:885:2: rule__User__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1746);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:895:1: rule__User__Group__2 : rule__User__Group__2__Impl rule__User__Group__3 ;
    public final void rule__User__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:899:1: ( rule__User__Group__2__Impl rule__User__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:900:2: rule__User__Group__2__Impl rule__User__Group__3
            {
            pushFollow(FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__21776);
            rule__User__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__3_in_rule__User__Group__21779);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:907:1: rule__User__Group__2__Impl : ( '{' ) ;
    public final void rule__User__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:911:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:912:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:912:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:913:1: '{'
            {
             before(grammarAccess.getUserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__User__Group__2__Impl1807); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:926:1: rule__User__Group__3 : rule__User__Group__3__Impl rule__User__Group__4 ;
    public final void rule__User__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:930:1: ( rule__User__Group__3__Impl rule__User__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:931:2: rule__User__Group__3__Impl rule__User__Group__4
            {
            pushFollow(FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__31838);
            rule__User__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group__4_in_rule__User__Group__31841);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:938:1: rule__User__Group__3__Impl : ( ( rule__User__Group_3__0 )* ) ;
    public final void rule__User__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:942:1: ( ( ( rule__User__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:943:1: ( ( rule__User__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:943:1: ( ( rule__User__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:944:1: ( rule__User__Group_3__0 )*
            {
             before(grammarAccess.getUserAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:945:1: ( rule__User__Group_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:945:2: rule__User__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__User__Group_3__0_in_rule__User__Group__3__Impl1868);
            	    rule__User__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:955:1: rule__User__Group__4 : rule__User__Group__4__Impl ;
    public final void rule__User__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:959:1: ( rule__User__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:960:2: rule__User__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__41899);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:966:1: rule__User__Group__4__Impl : ( '}' ) ;
    public final void rule__User__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:970:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:971:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:971:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:972:1: '}'
            {
             before(grammarAccess.getUserAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__User__Group__4__Impl1927); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:995:1: rule__User__Group_3__0 : rule__User__Group_3__0__Impl rule__User__Group_3__1 ;
    public final void rule__User__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:999:1: ( rule__User__Group_3__0__Impl rule__User__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1000:2: rule__User__Group_3__0__Impl rule__User__Group_3__1
            {
            pushFollow(FOLLOW_rule__User__Group_3__0__Impl_in_rule__User__Group_3__01968);
            rule__User__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__User__Group_3__1_in_rule__User__Group_3__01971);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1007:1: rule__User__Group_3__0__Impl : ( 'role:' ) ;
    public final void rule__User__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1011:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1012:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1012:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1013:1: 'role:'
            {
             before(grammarAccess.getUserAccess().getRoleKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__User__Group_3__0__Impl1999); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1026:1: rule__User__Group_3__1 : rule__User__Group_3__1__Impl ;
    public final void rule__User__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1030:1: ( rule__User__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1031:2: rule__User__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__User__Group_3__1__Impl_in_rule__User__Group_3__12030);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1037:1: rule__User__Group_3__1__Impl : ( ( rule__User__RolesAssignment_3_1 ) ) ;
    public final void rule__User__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1041:1: ( ( ( rule__User__RolesAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1042:1: ( ( rule__User__RolesAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1042:1: ( ( rule__User__RolesAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1043:1: ( rule__User__RolesAssignment_3_1 )
            {
             before(grammarAccess.getUserAccess().getRolesAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1044:1: ( rule__User__RolesAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1044:2: rule__User__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__User__RolesAssignment_3_1_in_rule__User__Group_3__1__Impl2057);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1058:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1062:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1063:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__02091);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__02094);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1070:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1074:1: ( ( 'role' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1075:1: ( 'role' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1075:1: ( 'role' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1076:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Role__Group__0__Impl2122); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1089:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1093:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1094:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__12153);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__12156);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1101:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1105:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1106:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1106:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1107:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1108:1: ( rule__Role__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1108:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl2183);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1118:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1122:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1123:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__22213);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__3_in_rule__Role__Group__22216);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1130:1: rule__Role__Group__2__Impl : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1134:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1135:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1135:1: ( ( rule__Role__Group_2__0 )? )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1136:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1137:1: ( rule__Role__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1137:2: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl2243);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1147:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1151:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1152:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__32274);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__4_in_rule__Role__Group__32277);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1159:1: rule__Role__Group__3__Impl : ( '{' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1163:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1164:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1164:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1165:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Role__Group__3__Impl2305); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1178:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1182:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1183:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__42336);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__5_in_rule__Role__Group__42339);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1190:1: rule__Role__Group__4__Impl : ( ( rule__Role__Group_4__0 )* ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1194:1: ( ( ( rule__Role__Group_4__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1195:1: ( ( rule__Role__Group_4__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1195:1: ( ( rule__Role__Group_4__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1196:1: ( rule__Role__Group_4__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1197:1: ( rule__Role__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1197:2: rule__Role__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl2366);
            	    rule__Role__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1207:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1211:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1212:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__52397);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__6_in_rule__Role__Group__52400);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1219:1: rule__Role__Group__5__Impl : ( ( rule__Role__Group_5__0 )* ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1223:1: ( ( ( rule__Role__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1224:1: ( ( rule__Role__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1224:1: ( ( rule__Role__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1225:1: ( rule__Role__Group_5__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1226:1: ( rule__Role__Group_5__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1226:2: rule__Role__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_5__0_in_rule__Role__Group__5__Impl2427);
            	    rule__Role__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1236:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1240:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1241:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__62458);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group__7_in_rule__Role__Group__62461);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1248:1: rule__Role__Group__6__Impl : ( ( rule__Role__Group_6__0 )* ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1252:1: ( ( ( rule__Role__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1253:1: ( ( rule__Role__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1253:1: ( ( rule__Role__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1254:1: ( rule__Role__Group_6__0 )*
            {
             before(grammarAccess.getRoleAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1255:1: ( rule__Role__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1255:2: rule__Role__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Role__Group_6__0_in_rule__Role__Group__6__Impl2488);
            	    rule__Role__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1265:1: rule__Role__Group__7 : rule__Role__Group__7__Impl ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1269:1: ( rule__Role__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1270:2: rule__Role__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__72519);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1276:1: rule__Role__Group__7__Impl : ( '}' ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1280:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1281:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1281:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1282:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Role__Group__7__Impl2547); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1311:1: rule__Role__Group_2__0 : rule__Role__Group_2__0__Impl rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1315:1: ( rule__Role__Group_2__0__Impl rule__Role__Group_2__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1316:2: rule__Role__Group_2__0__Impl rule__Role__Group_2__1
            {
            pushFollow(FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__02594);
            rule__Role__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__02597);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1323:1: rule__Role__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Role__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1327:1: ( ( 'extends' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1328:1: ( 'extends' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1328:1: ( 'extends' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1329:1: 'extends'
            {
             before(grammarAccess.getRoleAccess().getExtendsKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__Role__Group_2__0__Impl2625); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1342:1: rule__Role__Group_2__1 : rule__Role__Group_2__1__Impl ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1346:1: ( rule__Role__Group_2__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1347:2: rule__Role__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__12656);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1353:1: rule__Role__Group_2__1__Impl : ( ( rule__Role__ParentAssignment_2_1 )* ) ;
    public final void rule__Role__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1357:1: ( ( ( rule__Role__ParentAssignment_2_1 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1358:1: ( ( rule__Role__ParentAssignment_2_1 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1358:1: ( ( rule__Role__ParentAssignment_2_1 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1359:1: ( rule__Role__ParentAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getParentAssignment_2_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1360:1: ( rule__Role__ParentAssignment_2_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1360:2: rule__Role__ParentAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Role__ParentAssignment_2_1_in_rule__Role__Group_2__1__Impl2683);
            	    rule__Role__ParentAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1374:1: rule__Role__Group_4__0 : rule__Role__Group_4__0__Impl rule__Role__Group_4__1 ;
    public final void rule__Role__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1378:1: ( rule__Role__Group_4__0__Impl rule__Role__Group_4__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1379:2: rule__Role__Group_4__0__Impl rule__Role__Group_4__1
            {
            pushFollow(FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__02718);
            rule__Role__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__02721);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1386:1: rule__Role__Group_4__0__Impl : ( 'ssod:' ) ;
    public final void rule__Role__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1390:1: ( ( 'ssod:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1391:1: ( 'ssod:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1391:1: ( 'ssod:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1392:1: 'ssod:'
            {
             before(grammarAccess.getRoleAccess().getSsodKeyword_4_0()); 
            match(input,19,FOLLOW_19_in_rule__Role__Group_4__0__Impl2749); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1405:1: rule__Role__Group_4__1 : rule__Role__Group_4__1__Impl ;
    public final void rule__Role__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1409:1: ( rule__Role__Group_4__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1410:2: rule__Role__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__12780);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1416:1: rule__Role__Group_4__1__Impl : ( ( rule__Role__SsodAssignment_4_1 ) ) ;
    public final void rule__Role__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1420:1: ( ( ( rule__Role__SsodAssignment_4_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1421:1: ( ( rule__Role__SsodAssignment_4_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1421:1: ( ( rule__Role__SsodAssignment_4_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1422:1: ( rule__Role__SsodAssignment_4_1 )
            {
             before(grammarAccess.getRoleAccess().getSsodAssignment_4_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1423:1: ( rule__Role__SsodAssignment_4_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1423:2: rule__Role__SsodAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Role__SsodAssignment_4_1_in_rule__Role__Group_4__1__Impl2807);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1437:1: rule__Role__Group_5__0 : rule__Role__Group_5__0__Impl rule__Role__Group_5__1 ;
    public final void rule__Role__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1441:1: ( rule__Role__Group_5__0__Impl rule__Role__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1442:2: rule__Role__Group_5__0__Impl rule__Role__Group_5__1
            {
            pushFollow(FOLLOW_rule__Role__Group_5__0__Impl_in_rule__Role__Group_5__02841);
            rule__Role__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_5__1_in_rule__Role__Group_5__02844);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1449:1: rule__Role__Group_5__0__Impl : ( 'dsod:' ) ;
    public final void rule__Role__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1453:1: ( ( 'dsod:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1454:1: ( 'dsod:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1454:1: ( 'dsod:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1455:1: 'dsod:'
            {
             before(grammarAccess.getRoleAccess().getDsodKeyword_5_0()); 
            match(input,20,FOLLOW_20_in_rule__Role__Group_5__0__Impl2872); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1468:1: rule__Role__Group_5__1 : rule__Role__Group_5__1__Impl ;
    public final void rule__Role__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1472:1: ( rule__Role__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1473:2: rule__Role__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_5__1__Impl_in_rule__Role__Group_5__12903);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1479:1: rule__Role__Group_5__1__Impl : ( ( rule__Role__DsodAssignment_5_1 ) ) ;
    public final void rule__Role__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1483:1: ( ( ( rule__Role__DsodAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1484:1: ( ( rule__Role__DsodAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1484:1: ( ( rule__Role__DsodAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1485:1: ( rule__Role__DsodAssignment_5_1 )
            {
             before(grammarAccess.getRoleAccess().getDsodAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1486:1: ( rule__Role__DsodAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1486:2: rule__Role__DsodAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Role__DsodAssignment_5_1_in_rule__Role__Group_5__1__Impl2930);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1500:1: rule__Role__Group_6__0 : rule__Role__Group_6__0__Impl rule__Role__Group_6__1 ;
    public final void rule__Role__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1504:1: ( rule__Role__Group_6__0__Impl rule__Role__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1505:2: rule__Role__Group_6__0__Impl rule__Role__Group_6__1
            {
            pushFollow(FOLLOW_rule__Role__Group_6__0__Impl_in_rule__Role__Group_6__02964);
            rule__Role__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Role__Group_6__1_in_rule__Role__Group_6__02967);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1512:1: rule__Role__Group_6__0__Impl : ( 'permission:' ) ;
    public final void rule__Role__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1516:1: ( ( 'permission:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1517:1: ( 'permission:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1517:1: ( 'permission:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1518:1: 'permission:'
            {
             before(grammarAccess.getRoleAccess().getPermissionKeyword_6_0()); 
            match(input,21,FOLLOW_21_in_rule__Role__Group_6__0__Impl2995); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1531:1: rule__Role__Group_6__1 : rule__Role__Group_6__1__Impl ;
    public final void rule__Role__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1535:1: ( rule__Role__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1536:2: rule__Role__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Role__Group_6__1__Impl_in_rule__Role__Group_6__13026);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1542:1: rule__Role__Group_6__1__Impl : ( ( rule__Role__PermissionsAssignment_6_1 ) ) ;
    public final void rule__Role__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1546:1: ( ( ( rule__Role__PermissionsAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1547:1: ( ( rule__Role__PermissionsAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1547:1: ( ( rule__Role__PermissionsAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1548:1: ( rule__Role__PermissionsAssignment_6_1 )
            {
             before(grammarAccess.getRoleAccess().getPermissionsAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1549:1: ( rule__Role__PermissionsAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1549:2: rule__Role__PermissionsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Role__PermissionsAssignment_6_1_in_rule__Role__Group_6__1__Impl3053);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1563:1: rule__Permission__Group__0 : rule__Permission__Group__0__Impl rule__Permission__Group__1 ;
    public final void rule__Permission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1567:1: ( rule__Permission__Group__0__Impl rule__Permission__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1568:2: rule__Permission__Group__0__Impl rule__Permission__Group__1
            {
            pushFollow(FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__03087);
            rule__Permission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__03090);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1575:1: rule__Permission__Group__0__Impl : ( 'permission' ) ;
    public final void rule__Permission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1579:1: ( ( 'permission' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1580:1: ( 'permission' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1580:1: ( 'permission' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1581:1: 'permission'
            {
             before(grammarAccess.getPermissionAccess().getPermissionKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Permission__Group__0__Impl3118); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1594:1: rule__Permission__Group__1 : rule__Permission__Group__1__Impl ;
    public final void rule__Permission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1598:1: ( rule__Permission__Group__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1599:2: rule__Permission__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__13149);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1605:1: rule__Permission__Group__1__Impl : ( ( rule__Permission__NameAssignment_1 ) ) ;
    public final void rule__Permission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1609:1: ( ( ( rule__Permission__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1610:1: ( ( rule__Permission__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1610:1: ( ( rule__Permission__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1611:1: ( rule__Permission__NameAssignment_1 )
            {
             before(grammarAccess.getPermissionAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1612:1: ( rule__Permission__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1612:2: rule__Permission__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Permission__NameAssignment_1_in_rule__Permission__Group__1__Impl3176);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1626:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1630:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1631:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__03210);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03213);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1638:1: rule__Resource__Group__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1642:1: ( ( 'resource' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1643:1: ( 'resource' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1643:1: ( 'resource' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1644:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Resource__Group__0__Impl3241); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1657:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1661:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1662:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__13272);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__13275);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1669:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1673:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1674:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1674:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1675:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1676:1: ( rule__Resource__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1676:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl3302);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1686:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1690:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1691:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__23332);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__23335);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1698:1: rule__Resource__Group__2__Impl : ( '{' ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1702:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1703:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1703:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1704:1: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Resource__Group__2__Impl3363); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1717:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1721:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1722:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__33394);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__4_in_rule__Resource__Group__33397);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1729:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__Group_3__0 )* ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1733:1: ( ( ( rule__Resource__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1734:1: ( ( rule__Resource__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1734:1: ( ( rule__Resource__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1735:1: ( rule__Resource__Group_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1736:1: ( rule__Resource__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1736:2: rule__Resource__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl3424);
            	    rule__Resource__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1746:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1750:1: ( rule__Resource__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1751:2: rule__Resource__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__4__Impl_in_rule__Resource__Group__43455);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1757:1: rule__Resource__Group__4__Impl : ( '}' ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1761:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1762:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1762:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1763:1: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Resource__Group__4__Impl3483); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1786:1: rule__Resource__Group_3__0 : rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 ;
    public final void rule__Resource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1790:1: ( rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1791:2: rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__03524);
            rule__Resource__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__03527);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1798:1: rule__Resource__Group_3__0__Impl : ( 'permission:' ) ;
    public final void rule__Resource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1802:1: ( ( 'permission:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1803:1: ( 'permission:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1803:1: ( 'permission:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1804:1: 'permission:'
            {
             before(grammarAccess.getResourceAccess().getPermissionKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Resource__Group_3__0__Impl3555); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1817:1: rule__Resource__Group_3__1 : rule__Resource__Group_3__1__Impl ;
    public final void rule__Resource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1821:1: ( rule__Resource__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1822:2: rule__Resource__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__13586);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1828:1: rule__Resource__Group_3__1__Impl : ( ( rule__Resource__PermissionsAssignment_3_1 ) ) ;
    public final void rule__Resource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1832:1: ( ( ( rule__Resource__PermissionsAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1833:1: ( ( rule__Resource__PermissionsAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1833:1: ( ( rule__Resource__PermissionsAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1834:1: ( rule__Resource__PermissionsAssignment_3_1 )
            {
             before(grammarAccess.getResourceAccess().getPermissionsAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1835:1: ( rule__Resource__PermissionsAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1835:2: rule__Resource__PermissionsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Resource__PermissionsAssignment_3_1_in_rule__Resource__Group_3__1__Impl3613);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1849:1: rule__GrantedScenario__Group__0 : rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1 ;
    public final void rule__GrantedScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1853:1: ( rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1854:2: rule__GrantedScenario__Group__0__Impl rule__GrantedScenario__Group__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__0__Impl_in_rule__GrantedScenario__Group__03647);
            rule__GrantedScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__1_in_rule__GrantedScenario__Group__03650);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1861:1: rule__GrantedScenario__Group__0__Impl : ( 'grantedScenario' ) ;
    public final void rule__GrantedScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1865:1: ( ( 'grantedScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1866:1: ( 'grantedScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1866:1: ( 'grantedScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1867:1: 'grantedScenario'
            {
             before(grammarAccess.getGrantedScenarioAccess().getGrantedScenarioKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__GrantedScenario__Group__0__Impl3678); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1880:1: rule__GrantedScenario__Group__1 : rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2 ;
    public final void rule__GrantedScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1884:1: ( rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1885:2: rule__GrantedScenario__Group__1__Impl rule__GrantedScenario__Group__2
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__1__Impl_in_rule__GrantedScenario__Group__13709);
            rule__GrantedScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__2_in_rule__GrantedScenario__Group__13712);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1892:1: rule__GrantedScenario__Group__1__Impl : ( ( rule__GrantedScenario__NameAssignment_1 ) ) ;
    public final void rule__GrantedScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1896:1: ( ( ( rule__GrantedScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1897:1: ( ( rule__GrantedScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1897:1: ( ( rule__GrantedScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1898:1: ( rule__GrantedScenario__NameAssignment_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1899:1: ( rule__GrantedScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1899:2: rule__GrantedScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__NameAssignment_1_in_rule__GrantedScenario__Group__1__Impl3739);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1909:1: rule__GrantedScenario__Group__2 : rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3 ;
    public final void rule__GrantedScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1913:1: ( rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1914:2: rule__GrantedScenario__Group__2__Impl rule__GrantedScenario__Group__3
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__2__Impl_in_rule__GrantedScenario__Group__23769);
            rule__GrantedScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__3_in_rule__GrantedScenario__Group__23772);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1921:1: rule__GrantedScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__GrantedScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1925:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1926:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1926:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1927:1: '{'
            {
             before(grammarAccess.getGrantedScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__GrantedScenario__Group__2__Impl3800); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1940:1: rule__GrantedScenario__Group__3 : rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4 ;
    public final void rule__GrantedScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1944:1: ( rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1945:2: rule__GrantedScenario__Group__3__Impl rule__GrantedScenario__Group__4
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__3__Impl_in_rule__GrantedScenario__Group__33831);
            rule__GrantedScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__4_in_rule__GrantedScenario__Group__33834);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1952:1: rule__GrantedScenario__Group__3__Impl : ( 'user:' ) ;
    public final void rule__GrantedScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1956:1: ( ( 'user:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1957:1: ( 'user:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1957:1: ( 'user:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1958:1: 'user:'
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__GrantedScenario__Group__3__Impl3862); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1971:1: rule__GrantedScenario__Group__4 : rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5 ;
    public final void rule__GrantedScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1975:1: ( rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1976:2: rule__GrantedScenario__Group__4__Impl rule__GrantedScenario__Group__5
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__4__Impl_in_rule__GrantedScenario__Group__43893);
            rule__GrantedScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__5_in_rule__GrantedScenario__Group__43896);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1983:1: rule__GrantedScenario__Group__4__Impl : ( ( rule__GrantedScenario__UserAssignment_4 ) ) ;
    public final void rule__GrantedScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1987:1: ( ( ( rule__GrantedScenario__UserAssignment_4 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1988:1: ( ( rule__GrantedScenario__UserAssignment_4 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1988:1: ( ( rule__GrantedScenario__UserAssignment_4 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1989:1: ( rule__GrantedScenario__UserAssignment_4 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1990:1: ( rule__GrantedScenario__UserAssignment_4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:1990:2: rule__GrantedScenario__UserAssignment_4
            {
            pushFollow(FOLLOW_rule__GrantedScenario__UserAssignment_4_in_rule__GrantedScenario__Group__4__Impl3923);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2000:1: rule__GrantedScenario__Group__5 : rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6 ;
    public final void rule__GrantedScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2004:1: ( rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2005:2: rule__GrantedScenario__Group__5__Impl rule__GrantedScenario__Group__6
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__5__Impl_in_rule__GrantedScenario__Group__53953);
            rule__GrantedScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__6_in_rule__GrantedScenario__Group__53956);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2012:1: rule__GrantedScenario__Group__5__Impl : ( ( rule__GrantedScenario__Group_5__0 )* ) ;
    public final void rule__GrantedScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2016:1: ( ( ( rule__GrantedScenario__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2017:1: ( ( rule__GrantedScenario__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2017:1: ( ( rule__GrantedScenario__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2018:1: ( rule__GrantedScenario__Group_5__0 )*
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2019:1: ( rule__GrantedScenario__Group_5__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2019:2: rule__GrantedScenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__GrantedScenario__Group_5__0_in_rule__GrantedScenario__Group__5__Impl3983);
            	    rule__GrantedScenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2029:1: rule__GrantedScenario__Group__6 : rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7 ;
    public final void rule__GrantedScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2033:1: ( rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2034:2: rule__GrantedScenario__Group__6__Impl rule__GrantedScenario__Group__7
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__6__Impl_in_rule__GrantedScenario__Group__64014);
            rule__GrantedScenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group__7_in_rule__GrantedScenario__Group__64017);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2041:1: rule__GrantedScenario__Group__6__Impl : ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) ) ;
    public final void rule__GrantedScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2045:1: ( ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2046:1: ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2046:1: ( ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2047:1: ( ( rule__GrantedScenario__Group_6__0 ) ) ( ( rule__GrantedScenario__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2047:1: ( ( rule__GrantedScenario__Group_6__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2048:1: ( rule__GrantedScenario__Group_6__0 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2049:1: ( rule__GrantedScenario__Group_6__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2049:2: rule__GrantedScenario__Group_6__0
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4046);
            rule__GrantedScenario__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2052:1: ( ( rule__GrantedScenario__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2053:1: ( rule__GrantedScenario__Group_6__0 )*
            {
             before(grammarAccess.getGrantedScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2054:1: ( rule__GrantedScenario__Group_6__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2054:2: rule__GrantedScenario__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4058);
            	    rule__GrantedScenario__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2065:1: rule__GrantedScenario__Group__7 : rule__GrantedScenario__Group__7__Impl ;
    public final void rule__GrantedScenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2069:1: ( rule__GrantedScenario__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2070:2: rule__GrantedScenario__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group__7__Impl_in_rule__GrantedScenario__Group__74091);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2076:1: rule__GrantedScenario__Group__7__Impl : ( '}' ) ;
    public final void rule__GrantedScenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2080:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2081:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2081:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2082:1: '}'
            {
             before(grammarAccess.getGrantedScenarioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__GrantedScenario__Group__7__Impl4119); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2111:1: rule__GrantedScenario__Group_5__0 : rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1 ;
    public final void rule__GrantedScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2115:1: ( rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2116:2: rule__GrantedScenario__Group_5__0__Impl rule__GrantedScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__0__Impl_in_rule__GrantedScenario__Group_5__04166);
            rule__GrantedScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__1_in_rule__GrantedScenario__Group_5__04169);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2123:1: rule__GrantedScenario__Group_5__0__Impl : ( 'role:' ) ;
    public final void rule__GrantedScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2127:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2128:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2128:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2129:1: 'role:'
            {
             before(grammarAccess.getGrantedScenarioAccess().getRoleKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__GrantedScenario__Group_5__0__Impl4197); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2142:1: rule__GrantedScenario__Group_5__1 : rule__GrantedScenario__Group_5__1__Impl ;
    public final void rule__GrantedScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2146:1: ( rule__GrantedScenario__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2147:2: rule__GrantedScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_5__1__Impl_in_rule__GrantedScenario__Group_5__14228);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2153:1: rule__GrantedScenario__Group_5__1__Impl : ( ( rule__GrantedScenario__RolesAssignment_5_1 ) ) ;
    public final void rule__GrantedScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2157:1: ( ( ( rule__GrantedScenario__RolesAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2158:1: ( ( rule__GrantedScenario__RolesAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2158:1: ( ( rule__GrantedScenario__RolesAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2159:1: ( rule__GrantedScenario__RolesAssignment_5_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2160:1: ( rule__GrantedScenario__RolesAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2160:2: rule__GrantedScenario__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__RolesAssignment_5_1_in_rule__GrantedScenario__Group_5__1__Impl4255);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2174:1: rule__GrantedScenario__Group_6__0 : rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1 ;
    public final void rule__GrantedScenario__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2178:1: ( rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2179:2: rule__GrantedScenario__Group_6__0__Impl rule__GrantedScenario__Group_6__1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__0__Impl_in_rule__GrantedScenario__Group_6__04289);
            rule__GrantedScenario__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__1_in_rule__GrantedScenario__Group_6__04292);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2186:1: rule__GrantedScenario__Group_6__0__Impl : ( 'resource:' ) ;
    public final void rule__GrantedScenario__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2190:1: ( ( 'resource:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2191:1: ( 'resource:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2191:1: ( 'resource:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2192:1: 'resource:'
            {
             before(grammarAccess.getGrantedScenarioAccess().getResourceKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__GrantedScenario__Group_6__0__Impl4320); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2205:1: rule__GrantedScenario__Group_6__1 : rule__GrantedScenario__Group_6__1__Impl ;
    public final void rule__GrantedScenario__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2209:1: ( rule__GrantedScenario__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2210:2: rule__GrantedScenario__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__GrantedScenario__Group_6__1__Impl_in_rule__GrantedScenario__Group_6__14351);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2216:1: rule__GrantedScenario__Group_6__1__Impl : ( ( rule__GrantedScenario__ResourcesAssignment_6_1 ) ) ;
    public final void rule__GrantedScenario__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2220:1: ( ( ( rule__GrantedScenario__ResourcesAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2221:1: ( ( rule__GrantedScenario__ResourcesAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2221:1: ( ( rule__GrantedScenario__ResourcesAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2222:1: ( rule__GrantedScenario__ResourcesAssignment_6_1 )
            {
             before(grammarAccess.getGrantedScenarioAccess().getResourcesAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2223:1: ( rule__GrantedScenario__ResourcesAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2223:2: rule__GrantedScenario__ResourcesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__GrantedScenario__ResourcesAssignment_6_1_in_rule__GrantedScenario__Group_6__1__Impl4378);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2237:1: rule__ForbiddenScenario__Group__0 : rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1 ;
    public final void rule__ForbiddenScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2241:1: ( rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2242:2: rule__ForbiddenScenario__Group__0__Impl rule__ForbiddenScenario__Group__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__0__Impl_in_rule__ForbiddenScenario__Group__04412);
            rule__ForbiddenScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__1_in_rule__ForbiddenScenario__Group__04415);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2249:1: rule__ForbiddenScenario__Group__0__Impl : ( 'forbiddenScenario' ) ;
    public final void rule__ForbiddenScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2253:1: ( ( 'forbiddenScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2254:1: ( 'forbiddenScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2254:1: ( 'forbiddenScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2255:1: 'forbiddenScenario'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getForbiddenScenarioKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ForbiddenScenario__Group__0__Impl4443); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2268:1: rule__ForbiddenScenario__Group__1 : rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2 ;
    public final void rule__ForbiddenScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2272:1: ( rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2273:2: rule__ForbiddenScenario__Group__1__Impl rule__ForbiddenScenario__Group__2
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__1__Impl_in_rule__ForbiddenScenario__Group__14474);
            rule__ForbiddenScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__2_in_rule__ForbiddenScenario__Group__14477);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2280:1: rule__ForbiddenScenario__Group__1__Impl : ( ( rule__ForbiddenScenario__NameAssignment_1 ) ) ;
    public final void rule__ForbiddenScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2284:1: ( ( ( rule__ForbiddenScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2285:1: ( ( rule__ForbiddenScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2285:1: ( ( rule__ForbiddenScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2286:1: ( rule__ForbiddenScenario__NameAssignment_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2287:1: ( rule__ForbiddenScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2287:2: rule__ForbiddenScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__NameAssignment_1_in_rule__ForbiddenScenario__Group__1__Impl4504);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2297:1: rule__ForbiddenScenario__Group__2 : rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3 ;
    public final void rule__ForbiddenScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2301:1: ( rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2302:2: rule__ForbiddenScenario__Group__2__Impl rule__ForbiddenScenario__Group__3
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__2__Impl_in_rule__ForbiddenScenario__Group__24534);
            rule__ForbiddenScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__3_in_rule__ForbiddenScenario__Group__24537);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2309:1: rule__ForbiddenScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__ForbiddenScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2313:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2314:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2314:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2315:1: '{'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__ForbiddenScenario__Group__2__Impl4565); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2328:1: rule__ForbiddenScenario__Group__3 : rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4 ;
    public final void rule__ForbiddenScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2332:1: ( rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2333:2: rule__ForbiddenScenario__Group__3__Impl rule__ForbiddenScenario__Group__4
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__3__Impl_in_rule__ForbiddenScenario__Group__34596);
            rule__ForbiddenScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__4_in_rule__ForbiddenScenario__Group__34599);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2340:1: rule__ForbiddenScenario__Group__3__Impl : ( 'user:' ) ;
    public final void rule__ForbiddenScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2344:1: ( ( 'user:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2345:1: ( 'user:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2345:1: ( 'user:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2346:1: 'user:'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__ForbiddenScenario__Group__3__Impl4627); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2359:1: rule__ForbiddenScenario__Group__4 : rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5 ;
    public final void rule__ForbiddenScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2363:1: ( rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2364:2: rule__ForbiddenScenario__Group__4__Impl rule__ForbiddenScenario__Group__5
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__4__Impl_in_rule__ForbiddenScenario__Group__44658);
            rule__ForbiddenScenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__5_in_rule__ForbiddenScenario__Group__44661);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2371:1: rule__ForbiddenScenario__Group__4__Impl : ( ( rule__ForbiddenScenario__UserAssignment_4 ) ) ;
    public final void rule__ForbiddenScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2375:1: ( ( ( rule__ForbiddenScenario__UserAssignment_4 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2376:1: ( ( rule__ForbiddenScenario__UserAssignment_4 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2376:1: ( ( rule__ForbiddenScenario__UserAssignment_4 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2377:1: ( rule__ForbiddenScenario__UserAssignment_4 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserAssignment_4()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2378:1: ( rule__ForbiddenScenario__UserAssignment_4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2378:2: rule__ForbiddenScenario__UserAssignment_4
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__UserAssignment_4_in_rule__ForbiddenScenario__Group__4__Impl4688);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2388:1: rule__ForbiddenScenario__Group__5 : rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6 ;
    public final void rule__ForbiddenScenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2392:1: ( rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2393:2: rule__ForbiddenScenario__Group__5__Impl rule__ForbiddenScenario__Group__6
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__5__Impl_in_rule__ForbiddenScenario__Group__54718);
            rule__ForbiddenScenario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__6_in_rule__ForbiddenScenario__Group__54721);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2400:1: rule__ForbiddenScenario__Group__5__Impl : ( ( rule__ForbiddenScenario__Group_5__0 )* ) ;
    public final void rule__ForbiddenScenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2404:1: ( ( ( rule__ForbiddenScenario__Group_5__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2405:1: ( ( rule__ForbiddenScenario__Group_5__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2405:1: ( ( rule__ForbiddenScenario__Group_5__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2406:1: ( rule__ForbiddenScenario__Group_5__0 )*
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_5()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2407:1: ( rule__ForbiddenScenario__Group_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2407:2: rule__ForbiddenScenario__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__0_in_rule__ForbiddenScenario__Group__5__Impl4748);
            	    rule__ForbiddenScenario__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2417:1: rule__ForbiddenScenario__Group__6 : rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7 ;
    public final void rule__ForbiddenScenario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2421:1: ( rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2422:2: rule__ForbiddenScenario__Group__6__Impl rule__ForbiddenScenario__Group__7
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__6__Impl_in_rule__ForbiddenScenario__Group__64779);
            rule__ForbiddenScenario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__7_in_rule__ForbiddenScenario__Group__64782);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2429:1: rule__ForbiddenScenario__Group__6__Impl : ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) ) ;
    public final void rule__ForbiddenScenario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2433:1: ( ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2434:1: ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2434:1: ( ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2435:1: ( ( rule__ForbiddenScenario__Group_6__0 ) ) ( ( rule__ForbiddenScenario__Group_6__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2435:1: ( ( rule__ForbiddenScenario__Group_6__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2436:1: ( rule__ForbiddenScenario__Group_6__0 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2437:1: ( rule__ForbiddenScenario__Group_6__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2437:2: rule__ForbiddenScenario__Group_6__0
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl4811);
            rule__ForbiddenScenario__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2440:1: ( ( rule__ForbiddenScenario__Group_6__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2441:1: ( rule__ForbiddenScenario__Group_6__0 )*
            {
             before(grammarAccess.getForbiddenScenarioAccess().getGroup_6()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2442:1: ( rule__ForbiddenScenario__Group_6__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2442:2: rule__ForbiddenScenario__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl4823);
            	    rule__ForbiddenScenario__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2453:1: rule__ForbiddenScenario__Group__7 : rule__ForbiddenScenario__Group__7__Impl ;
    public final void rule__ForbiddenScenario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2457:1: ( rule__ForbiddenScenario__Group__7__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2458:2: rule__ForbiddenScenario__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group__7__Impl_in_rule__ForbiddenScenario__Group__74856);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2464:1: rule__ForbiddenScenario__Group__7__Impl : ( '}' ) ;
    public final void rule__ForbiddenScenario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2468:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2469:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2469:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2470:1: '}'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__ForbiddenScenario__Group__7__Impl4884); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2499:1: rule__ForbiddenScenario__Group_5__0 : rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1 ;
    public final void rule__ForbiddenScenario__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2503:1: ( rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2504:2: rule__ForbiddenScenario__Group_5__0__Impl rule__ForbiddenScenario__Group_5__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__0__Impl_in_rule__ForbiddenScenario__Group_5__04931);
            rule__ForbiddenScenario__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__1_in_rule__ForbiddenScenario__Group_5__04934);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2511:1: rule__ForbiddenScenario__Group_5__0__Impl : ( 'role:' ) ;
    public final void rule__ForbiddenScenario__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2515:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2516:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2516:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2517:1: 'role:'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRoleKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__ForbiddenScenario__Group_5__0__Impl4962); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2530:1: rule__ForbiddenScenario__Group_5__1 : rule__ForbiddenScenario__Group_5__1__Impl ;
    public final void rule__ForbiddenScenario__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2534:1: ( rule__ForbiddenScenario__Group_5__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2535:2: rule__ForbiddenScenario__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_5__1__Impl_in_rule__ForbiddenScenario__Group_5__14993);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2541:1: rule__ForbiddenScenario__Group_5__1__Impl : ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) ) ;
    public final void rule__ForbiddenScenario__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2545:1: ( ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2546:1: ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2546:1: ( ( rule__ForbiddenScenario__RolesAssignment_5_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2547:1: ( rule__ForbiddenScenario__RolesAssignment_5_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesAssignment_5_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2548:1: ( rule__ForbiddenScenario__RolesAssignment_5_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2548:2: rule__ForbiddenScenario__RolesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__RolesAssignment_5_1_in_rule__ForbiddenScenario__Group_5__1__Impl5020);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2562:1: rule__ForbiddenScenario__Group_6__0 : rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1 ;
    public final void rule__ForbiddenScenario__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2566:1: ( rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2567:2: rule__ForbiddenScenario__Group_6__0__Impl rule__ForbiddenScenario__Group_6__1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__0__Impl_in_rule__ForbiddenScenario__Group_6__05054);
            rule__ForbiddenScenario__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__1_in_rule__ForbiddenScenario__Group_6__05057);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2574:1: rule__ForbiddenScenario__Group_6__0__Impl : ( 'resource:' ) ;
    public final void rule__ForbiddenScenario__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2578:1: ( ( 'resource:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2579:1: ( 'resource:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2579:1: ( 'resource:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2580:1: 'resource:'
            {
             before(grammarAccess.getForbiddenScenarioAccess().getResourceKeyword_6_0()); 
            match(input,26,FOLLOW_26_in_rule__ForbiddenScenario__Group_6__0__Impl5085); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2593:1: rule__ForbiddenScenario__Group_6__1 : rule__ForbiddenScenario__Group_6__1__Impl ;
    public final void rule__ForbiddenScenario__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2597:1: ( rule__ForbiddenScenario__Group_6__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2598:2: rule__ForbiddenScenario__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__Group_6__1__Impl_in_rule__ForbiddenScenario__Group_6__15116);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2604:1: rule__ForbiddenScenario__Group_6__1__Impl : ( ( rule__ForbiddenScenario__ResourcesAssignment_6_1 ) ) ;
    public final void rule__ForbiddenScenario__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2608:1: ( ( ( rule__ForbiddenScenario__ResourcesAssignment_6_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2609:1: ( ( rule__ForbiddenScenario__ResourcesAssignment_6_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2609:1: ( ( rule__ForbiddenScenario__ResourcesAssignment_6_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2610:1: ( rule__ForbiddenScenario__ResourcesAssignment_6_1 )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getResourcesAssignment_6_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2611:1: ( rule__ForbiddenScenario__ResourcesAssignment_6_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2611:2: rule__ForbiddenScenario__ResourcesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__ForbiddenScenario__ResourcesAssignment_6_1_in_rule__ForbiddenScenario__Group_6__1__Impl5143);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2625:1: rule__UserRoleScenario__Group__0 : rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1 ;
    public final void rule__UserRoleScenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2629:1: ( rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2630:2: rule__UserRoleScenario__Group__0__Impl rule__UserRoleScenario__Group__1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__0__Impl_in_rule__UserRoleScenario__Group__05177);
            rule__UserRoleScenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__1_in_rule__UserRoleScenario__Group__05180);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2637:1: rule__UserRoleScenario__Group__0__Impl : ( 'userRoleScenario' ) ;
    public final void rule__UserRoleScenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2641:1: ( ( 'userRoleScenario' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2642:1: ( 'userRoleScenario' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2642:1: ( 'userRoleScenario' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2643:1: 'userRoleScenario'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getUserRoleScenarioKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__UserRoleScenario__Group__0__Impl5208); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2656:1: rule__UserRoleScenario__Group__1 : rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2 ;
    public final void rule__UserRoleScenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2660:1: ( rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2661:2: rule__UserRoleScenario__Group__1__Impl rule__UserRoleScenario__Group__2
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__1__Impl_in_rule__UserRoleScenario__Group__15239);
            rule__UserRoleScenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__2_in_rule__UserRoleScenario__Group__15242);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2668:1: rule__UserRoleScenario__Group__1__Impl : ( ( rule__UserRoleScenario__NameAssignment_1 ) ) ;
    public final void rule__UserRoleScenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2672:1: ( ( ( rule__UserRoleScenario__NameAssignment_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2673:1: ( ( rule__UserRoleScenario__NameAssignment_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2673:1: ( ( rule__UserRoleScenario__NameAssignment_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2674:1: ( rule__UserRoleScenario__NameAssignment_1 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getNameAssignment_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2675:1: ( rule__UserRoleScenario__NameAssignment_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2675:2: rule__UserRoleScenario__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__NameAssignment_1_in_rule__UserRoleScenario__Group__1__Impl5269);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2685:1: rule__UserRoleScenario__Group__2 : rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3 ;
    public final void rule__UserRoleScenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2689:1: ( rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2690:2: rule__UserRoleScenario__Group__2__Impl rule__UserRoleScenario__Group__3
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__2__Impl_in_rule__UserRoleScenario__Group__25299);
            rule__UserRoleScenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__3_in_rule__UserRoleScenario__Group__25302);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2697:1: rule__UserRoleScenario__Group__2__Impl : ( '{' ) ;
    public final void rule__UserRoleScenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2701:1: ( ( '{' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2702:1: ( '{' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2702:1: ( '{' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2703:1: '{'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__UserRoleScenario__Group__2__Impl5330); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2716:1: rule__UserRoleScenario__Group__3 : rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4 ;
    public final void rule__UserRoleScenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2720:1: ( rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2721:2: rule__UserRoleScenario__Group__3__Impl rule__UserRoleScenario__Group__4
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__3__Impl_in_rule__UserRoleScenario__Group__35361);
            rule__UserRoleScenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group__4_in_rule__UserRoleScenario__Group__35364);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2728:1: rule__UserRoleScenario__Group__3__Impl : ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) ) ;
    public final void rule__UserRoleScenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2732:1: ( ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2733:1: ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2733:1: ( ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2734:1: ( ( rule__UserRoleScenario__Group_3__0 ) ) ( ( rule__UserRoleScenario__Group_3__0 )* )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2734:1: ( ( rule__UserRoleScenario__Group_3__0 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2735:1: ( rule__UserRoleScenario__Group_3__0 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2736:1: ( rule__UserRoleScenario__Group_3__0 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2736:2: rule__UserRoleScenario__Group_3__0
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5393);
            rule__UserRoleScenario__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 

            }

            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2739:1: ( ( rule__UserRoleScenario__Group_3__0 )* )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2740:1: ( rule__UserRoleScenario__Group_3__0 )*
            {
             before(grammarAccess.getUserRoleScenarioAccess().getGroup_3()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2741:1: ( rule__UserRoleScenario__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2741:2: rule__UserRoleScenario__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5405);
            	    rule__UserRoleScenario__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2752:1: rule__UserRoleScenario__Group__4 : rule__UserRoleScenario__Group__4__Impl ;
    public final void rule__UserRoleScenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2756:1: ( rule__UserRoleScenario__Group__4__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2757:2: rule__UserRoleScenario__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group__4__Impl_in_rule__UserRoleScenario__Group__45438);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2763:1: rule__UserRoleScenario__Group__4__Impl : ( '}' ) ;
    public final void rule__UserRoleScenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2767:1: ( ( '}' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2768:1: ( '}' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2768:1: ( '}' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2769:1: '}'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__UserRoleScenario__Group__4__Impl5466); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2792:1: rule__UserRoleScenario__Group_3__0 : rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1 ;
    public final void rule__UserRoleScenario__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2796:1: ( rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2797:2: rule__UserRoleScenario__Group_3__0__Impl rule__UserRoleScenario__Group_3__1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__0__Impl_in_rule__UserRoleScenario__Group_3__05507);
            rule__UserRoleScenario__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__1_in_rule__UserRoleScenario__Group_3__05510);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2804:1: rule__UserRoleScenario__Group_3__0__Impl : ( 'role:' ) ;
    public final void rule__UserRoleScenario__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2808:1: ( ( 'role:' ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2809:1: ( 'role:' )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2809:1: ( 'role:' )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2810:1: 'role:'
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRoleKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__UserRoleScenario__Group_3__0__Impl5538); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2823:1: rule__UserRoleScenario__Group_3__1 : rule__UserRoleScenario__Group_3__1__Impl ;
    public final void rule__UserRoleScenario__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2827:1: ( rule__UserRoleScenario__Group_3__1__Impl )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2828:2: rule__UserRoleScenario__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__Group_3__1__Impl_in_rule__UserRoleScenario__Group_3__15569);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2834:1: rule__UserRoleScenario__Group_3__1__Impl : ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) ) ;
    public final void rule__UserRoleScenario__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2838:1: ( ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2839:1: ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2839:1: ( ( rule__UserRoleScenario__RolesAssignment_3_1 ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2840:1: ( rule__UserRoleScenario__RolesAssignment_3_1 )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesAssignment_3_1()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2841:1: ( rule__UserRoleScenario__RolesAssignment_3_1 )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2841:2: rule__UserRoleScenario__RolesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__UserRoleScenario__RolesAssignment_3_1_in_rule__UserRoleScenario__Group_3__1__Impl5596);
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


    // $ANTLR start "rule__Rbac__PolicyAssignment_0"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2856:1: rule__Rbac__PolicyAssignment_0 : ( rulePolicy ) ;
    public final void rule__Rbac__PolicyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2860:1: ( ( rulePolicy ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2861:1: ( rulePolicy )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2861:1: ( rulePolicy )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2862:1: rulePolicy
            {
             before(grammarAccess.getRbacAccess().getPolicyPolicyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePolicy_in_rule__Rbac__PolicyAssignment_05635);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2871:1: rule__Rbac__ScenariosAssignment_1 : ( ruleScenarios ) ;
    public final void rule__Rbac__ScenariosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2875:1: ( ( ruleScenarios ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2876:1: ( ruleScenarios )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2876:1: ( ruleScenarios )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2877:1: ruleScenarios
            {
             before(grammarAccess.getRbacAccess().getScenariosScenariosParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleScenarios_in_rule__Rbac__ScenariosAssignment_15666);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2886:1: rule__Policy__UsersAssignment_2 : ( ruleUser ) ;
    public final void rule__Policy__UsersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2890:1: ( ( ruleUser ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2891:1: ( ruleUser )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2891:1: ( ruleUser )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2892:1: ruleUser
            {
             before(grammarAccess.getPolicyAccess().getUsersUserParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUser_in_rule__Policy__UsersAssignment_25697);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2901:1: rule__Policy__RolesAssignment_3 : ( ruleRole ) ;
    public final void rule__Policy__RolesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2905:1: ( ( ruleRole ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2906:1: ( ruleRole )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2906:1: ( ruleRole )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2907:1: ruleRole
            {
             before(grammarAccess.getPolicyAccess().getRolesRoleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRole_in_rule__Policy__RolesAssignment_35728);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2916:1: rule__Policy__PermissionsAssignment_4 : ( rulePermission ) ;
    public final void rule__Policy__PermissionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2920:1: ( ( rulePermission ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2921:1: ( rulePermission )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2921:1: ( rulePermission )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2922:1: rulePermission
            {
             before(grammarAccess.getPolicyAccess().getPermissionsPermissionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulePermission_in_rule__Policy__PermissionsAssignment_45759);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2931:1: rule__Policy__ResourcesAssignment_5 : ( ruleResource ) ;
    public final void rule__Policy__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2935:1: ( ( ruleResource ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2936:1: ( ruleResource )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2936:1: ( ruleResource )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2937:1: ruleResource
            {
             before(grammarAccess.getPolicyAccess().getResourcesResourceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResource_in_rule__Policy__ResourcesAssignment_55790);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2946:1: rule__Scenarios__UserScenariosAssignment_2 : ( ruleUserScenario ) ;
    public final void rule__Scenarios__UserScenariosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2950:1: ( ( ruleUserScenario ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2951:1: ( ruleUserScenario )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2951:1: ( ruleUserScenario )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2952:1: ruleUserScenario
            {
             before(grammarAccess.getScenariosAccess().getUserScenariosUserScenarioParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleUserScenario_in_rule__Scenarios__UserScenariosAssignment_25821);
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2961:1: rule__Scenarios__UserRoleScenariosAssignment_3 : ( ruleUserRoleScenario ) ;
    public final void rule__Scenarios__UserRoleScenariosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2965:1: ( ( ruleUserRoleScenario ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2966:1: ( ruleUserRoleScenario )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2966:1: ( ruleUserRoleScenario )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2967:1: ruleUserRoleScenario
            {
             before(grammarAccess.getScenariosAccess().getUserRoleScenariosUserRoleScenarioParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUserRoleScenario_in_rule__Scenarios__UserRoleScenariosAssignment_35852);
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


    // $ANTLR start "rule__User__NameAssignment_1"
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2976:1: rule__User__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__User__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2980:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2981:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2981:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2982:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__NameAssignment_15883); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2991:1: rule__User__RolesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__User__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2995:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2996:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2996:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2997:1: ( RULE_ID )
            {
             before(grammarAccess.getUserAccess().getRolesRoleCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2998:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:2999:1: RULE_ID
            {
             before(grammarAccess.getUserAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__User__RolesAssignment_3_15918); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3010:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3014:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3015:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3015:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3016:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_15953); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3025:1: rule__Role__ParentAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__ParentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3029:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3030:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3030:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3031:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getParentRoleCrossReference_2_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3032:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3033:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getParentRoleIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__ParentAssignment_2_15988); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3044:1: rule__Role__SsodAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__SsodAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3048:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3049:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3049:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3050:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getSsodRoleCrossReference_4_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3051:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3052:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getSsodRoleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__SsodAssignment_4_16027); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3063:1: rule__Role__DsodAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__DsodAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3067:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3068:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3068:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3069:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getDsodRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3070:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3071:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getDsodRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__DsodAssignment_5_16066); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3082:1: rule__Role__PermissionsAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Role__PermissionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3086:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3087:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3087:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3088:1: ( RULE_ID )
            {
             before(grammarAccess.getRoleAccess().getPermissionsPermissionCrossReference_6_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3089:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3090:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getPermissionsPermissionIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__PermissionsAssignment_6_16105); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3101:1: rule__Permission__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Permission__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3105:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3106:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3106:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3107:1: RULE_ID
            {
             before(grammarAccess.getPermissionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Permission__NameAssignment_16140); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3116:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3120:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3121:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3121:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3122:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_16171); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3131:1: rule__Resource__PermissionsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Resource__PermissionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3135:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3136:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3136:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3137:1: ( RULE_ID )
            {
             before(grammarAccess.getResourceAccess().getPermissionsPermissionCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3138:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3139:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getPermissionsPermissionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__PermissionsAssignment_3_16206); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3150:1: rule__GrantedScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GrantedScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3154:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3155:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3155:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3156:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__NameAssignment_16241); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3165:1: rule__GrantedScenario__UserAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__GrantedScenario__UserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3169:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3170:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3170:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3171:1: ( RULE_ID )
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserUserCrossReference_4_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3172:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3173:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getUserUserIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__UserAssignment_46276); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3184:1: rule__GrantedScenario__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__GrantedScenario__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3188:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3189:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3189:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3190:1: ( RULE_ID )
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3191:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3192:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__RolesAssignment_5_16315); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3203:1: rule__GrantedScenario__ResourcesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__GrantedScenario__ResourcesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3207:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3208:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3208:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3209:1: ( RULE_ID )
            {
             before(grammarAccess.getGrantedScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3210:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3211:1: RULE_ID
            {
             before(grammarAccess.getGrantedScenarioAccess().getResourcesResourceIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GrantedScenario__ResourcesAssignment_6_16354); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3222:1: rule__ForbiddenScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForbiddenScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3226:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3227:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3227:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3228:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__NameAssignment_16389); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3237:1: rule__ForbiddenScenario__UserAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForbiddenScenario__UserAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3241:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3242:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3242:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3243:1: ( RULE_ID )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserUserCrossReference_4_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3244:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3245:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getUserUserIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__UserAssignment_46424); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3256:1: rule__ForbiddenScenario__RolesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForbiddenScenario__RolesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3260:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3261:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3261:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3262:1: ( RULE_ID )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesRoleCrossReference_5_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3263:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3264:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getRolesRoleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__RolesAssignment_5_16463); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3275:1: rule__ForbiddenScenario__ResourcesAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForbiddenScenario__ResourcesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3279:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3280:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3280:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3281:1: ( RULE_ID )
            {
             before(grammarAccess.getForbiddenScenarioAccess().getResourcesResourceCrossReference_6_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3282:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3283:1: RULE_ID
            {
             before(grammarAccess.getForbiddenScenarioAccess().getResourcesResourceIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForbiddenScenario__ResourcesAssignment_6_16502); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3294:1: rule__UserRoleScenario__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UserRoleScenario__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3298:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3299:1: ( RULE_ID )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3299:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3300:1: RULE_ID
            {
             before(grammarAccess.getUserRoleScenarioAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleScenario__NameAssignment_16537); 
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
    // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3309:1: rule__UserRoleScenario__RolesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__UserRoleScenario__RolesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3313:1: ( ( ( RULE_ID ) ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3314:1: ( ( RULE_ID ) )
            {
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3314:1: ( ( RULE_ID ) )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3315:1: ( RULE_ID )
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesRoleCrossReference_3_1_0()); 
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3316:1: ( RULE_ID )
            // ../uk.ac.open.rbacDSL.ui/src-gen/uk/ac/open/ui/contentassist/antlr/internal/InternalRbacDSL.g:3317:1: RULE_ID
            {
             before(grammarAccess.getUserRoleScenarioAccess().getRolesRoleIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UserRoleScenario__RolesAssignment_3_16572); 
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
    public static final BitSet FOLLOW_ruleGrantedScenario_in_rule__UserScenario__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForbiddenScenario_in_rule__UserScenario__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__0__Impl_in_rule__Rbac__Group__0777 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Rbac__Group__1_in_rule__Rbac__Group__0780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__PolicyAssignment_0_in_rule__Rbac__Group__0__Impl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__Group__1__Impl_in_rule__Rbac__Group__1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rbac__ScenariosAssignment_1_in_rule__Rbac__Group__1__Impl864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__0__Impl_in_rule__Policy__Group__0898 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Policy__Group__1_in_rule__Policy__Group__0901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Policy__Group__0__Impl929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__1__Impl_in_rule__Policy__Group__1960 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__2_in_rule__Policy__Group__1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Policy__Group__1__Impl991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__Group__2__Impl_in_rule__Policy__Group__21022 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__3_in_rule__Policy__Group__21025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__UsersAssignment_2_in_rule__Policy__Group__2__Impl1052 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Policy__Group__3__Impl_in_rule__Policy__Group__31083 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__4_in_rule__Policy__Group__31086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__RolesAssignment_3_in_rule__Policy__Group__3__Impl1113 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Policy__Group__4__Impl_in_rule__Policy__Group__41144 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__5_in_rule__Policy__Group__41147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__PermissionsAssignment_4_in_rule__Policy__Group__4__Impl1174 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Policy__Group__5__Impl_in_rule__Policy__Group__51205 = new BitSet(new long[]{0x0000000000C2A000L});
    public static final BitSet FOLLOW_rule__Policy__Group__6_in_rule__Policy__Group__51208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Policy__ResourcesAssignment_5_in_rule__Policy__Group__5__Impl1235 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Policy__Group__6__Impl_in_rule__Policy__Group__61266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Policy__Group__6__Impl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__0__Impl_in_rule__Scenarios__Group__01339 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__1_in_rule__Scenarios__Group__01342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Scenarios__Group__0__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__1__Impl_in_rule__Scenarios__Group__11401 = new BitSet(new long[]{0x0000000019002000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__2_in_rule__Scenarios__Group__11404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Scenarios__Group__1__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__2__Impl_in_rule__Scenarios__Group__21463 = new BitSet(new long[]{0x0000000019002000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__3_in_rule__Scenarios__Group__21466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__UserScenariosAssignment_2_in_rule__Scenarios__Group__2__Impl1493 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__3__Impl_in_rule__Scenarios__Group__31524 = new BitSet(new long[]{0x0000000019002000L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__4_in_rule__Scenarios__Group__31527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scenarios__UserRoleScenariosAssignment_3_in_rule__Scenarios__Group__3__Impl1554 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Scenarios__Group__4__Impl_in_rule__Scenarios__Group__41585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Scenarios__Group__4__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__0__Impl_in_rule__User__Group__01654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group__1_in_rule__User__Group__01657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__User__Group__0__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__1__Impl_in_rule__User__Group__11716 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__User__Group__2_in_rule__User__Group__11719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__NameAssignment_1_in_rule__User__Group__1__Impl1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__2__Impl_in_rule__User__Group__21776 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__User__Group__3_in_rule__User__Group__21779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__User__Group__2__Impl1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group__3__Impl_in_rule__User__Group__31838 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__User__Group__4_in_rule__User__Group__31841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__0_in_rule__User__Group__3__Impl1868 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__User__Group__4__Impl_in_rule__User__Group__41899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__User__Group__4__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__0__Impl_in_rule__User__Group_3__01968 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__User__Group_3__1_in_rule__User__Group_3__01971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__User__Group_3__0__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__Group_3__1__Impl_in_rule__User__Group_3__12030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__User__RolesAssignment_3_1_in_rule__User__Group_3__1__Impl2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0__Impl_in_rule__Role__Group__02091 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__02094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Role__Group__0__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__1__Impl_in_rule__Role__Group__12153 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__12156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__1__Impl2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2__Impl_in_rule__Role__Group__22213 = new BitSet(new long[]{0x0000000000041000L});
    public static final BitSet FOLLOW_rule__Role__Group__3_in_rule__Role__Group__22216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__2__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__3__Impl_in_rule__Role__Group__32274 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_rule__Role__Group__4_in_rule__Role__Group__32277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Role__Group__3__Impl2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__4__Impl_in_rule__Role__Group__42336 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_rule__Role__Group__5_in_rule__Role__Group__42339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0_in_rule__Role__Group__4__Impl2366 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Role__Group__5__Impl_in_rule__Role__Group__52397 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_rule__Role__Group__6_in_rule__Role__Group__52400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__0_in_rule__Role__Group__5__Impl2427 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Role__Group__6__Impl_in_rule__Role__Group__62458 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_rule__Role__Group__7_in_rule__Role__Group__62461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__0_in_rule__Role__Group__6__Impl2488 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Role__Group__7__Impl_in_rule__Role__Group__72519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Role__Group__7__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0__Impl_in_rule__Role__Group_2__02594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__02597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Role__Group_2__0__Impl2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1__Impl_in_rule__Role__Group_2__12656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__ParentAssignment_2_1_in_rule__Role__Group_2__1__Impl2683 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Role__Group_4__0__Impl_in_rule__Role__Group_4__02718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1_in_rule__Role__Group_4__02721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Role__Group_4__0__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_4__1__Impl_in_rule__Role__Group_4__12780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__SsodAssignment_4_1_in_rule__Role__Group_4__1__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__0__Impl_in_rule__Role__Group_5__02841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_5__1_in_rule__Role__Group_5__02844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Role__Group_5__0__Impl2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_5__1__Impl_in_rule__Role__Group_5__12903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__DsodAssignment_5_1_in_rule__Role__Group_5__1__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__0__Impl_in_rule__Role__Group_6__02964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group_6__1_in_rule__Role__Group_6__02967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Role__Group_6__0__Impl2995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_6__1__Impl_in_rule__Role__Group_6__13026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__PermissionsAssignment_6_1_in_rule__Role__Group_6__1__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__0__Impl_in_rule__Permission__Group__03087 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Permission__Group__1_in_rule__Permission__Group__03090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Permission__Group__0__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__Group__1__Impl_in_rule__Permission__Group__13149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Permission__NameAssignment_1_in_rule__Permission__Group__1__Impl3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__03210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Resource__Group__0__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__13272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__13275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__1__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__23332 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__23335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Resource__Group__2__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__33394 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_rule__Resource__Group__4_in_rule__Resource__Group__33397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl3424 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Resource__Group__4__Impl_in_rule__Resource__Group__43455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Resource__Group__4__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__03524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__03527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Resource__Group_3__0__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__PermissionsAssignment_3_1_in_rule__Resource__Group_3__1__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__0__Impl_in_rule__GrantedScenario__Group__03647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__1_in_rule__GrantedScenario__Group__03650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__GrantedScenario__Group__0__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__1__Impl_in_rule__GrantedScenario__Group__13709 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__2_in_rule__GrantedScenario__Group__13712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__NameAssignment_1_in_rule__GrantedScenario__Group__1__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__2__Impl_in_rule__GrantedScenario__Group__23769 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__3_in_rule__GrantedScenario__Group__23772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__GrantedScenario__Group__2__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__3__Impl_in_rule__GrantedScenario__Group__33831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__4_in_rule__GrantedScenario__Group__33834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__GrantedScenario__Group__3__Impl3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__4__Impl_in_rule__GrantedScenario__Group__43893 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__5_in_rule__GrantedScenario__Group__43896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__UserAssignment_4_in_rule__GrantedScenario__Group__4__Impl3923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__5__Impl_in_rule__GrantedScenario__Group__53953 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__6_in_rule__GrantedScenario__Group__53956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__0_in_rule__GrantedScenario__Group__5__Impl3983 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__6__Impl_in_rule__GrantedScenario__Group__64014 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__7_in_rule__GrantedScenario__Group__64017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4046 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0_in_rule__GrantedScenario__Group__6__Impl4058 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group__7__Impl_in_rule__GrantedScenario__Group__74091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__GrantedScenario__Group__7__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__0__Impl_in_rule__GrantedScenario__Group_5__04166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__1_in_rule__GrantedScenario__Group_5__04169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__GrantedScenario__Group_5__0__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_5__1__Impl_in_rule__GrantedScenario__Group_5__14228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__RolesAssignment_5_1_in_rule__GrantedScenario__Group_5__1__Impl4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__0__Impl_in_rule__GrantedScenario__Group_6__04289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__1_in_rule__GrantedScenario__Group_6__04292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__GrantedScenario__Group_6__0__Impl4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__Group_6__1__Impl_in_rule__GrantedScenario__Group_6__14351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GrantedScenario__ResourcesAssignment_6_1_in_rule__GrantedScenario__Group_6__1__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__0__Impl_in_rule__ForbiddenScenario__Group__04412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__1_in_rule__ForbiddenScenario__Group__04415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ForbiddenScenario__Group__0__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__1__Impl_in_rule__ForbiddenScenario__Group__14474 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__2_in_rule__ForbiddenScenario__Group__14477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__NameAssignment_1_in_rule__ForbiddenScenario__Group__1__Impl4504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__2__Impl_in_rule__ForbiddenScenario__Group__24534 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__3_in_rule__ForbiddenScenario__Group__24537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ForbiddenScenario__Group__2__Impl4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__3__Impl_in_rule__ForbiddenScenario__Group__34596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__4_in_rule__ForbiddenScenario__Group__34599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ForbiddenScenario__Group__3__Impl4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__4__Impl_in_rule__ForbiddenScenario__Group__44658 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__5_in_rule__ForbiddenScenario__Group__44661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__UserAssignment_4_in_rule__ForbiddenScenario__Group__4__Impl4688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__5__Impl_in_rule__ForbiddenScenario__Group__54718 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__6_in_rule__ForbiddenScenario__Group__54721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__0_in_rule__ForbiddenScenario__Group__5__Impl4748 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__6__Impl_in_rule__ForbiddenScenario__Group__64779 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__7_in_rule__ForbiddenScenario__Group__64782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl4811 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0_in_rule__ForbiddenScenario__Group__6__Impl4823 = new BitSet(new long[]{0x0000000004010002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group__7__Impl_in_rule__ForbiddenScenario__Group__74856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ForbiddenScenario__Group__7__Impl4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__0__Impl_in_rule__ForbiddenScenario__Group_5__04931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__1_in_rule__ForbiddenScenario__Group_5__04934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ForbiddenScenario__Group_5__0__Impl4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_5__1__Impl_in_rule__ForbiddenScenario__Group_5__14993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__RolesAssignment_5_1_in_rule__ForbiddenScenario__Group_5__1__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__0__Impl_in_rule__ForbiddenScenario__Group_6__05054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__1_in_rule__ForbiddenScenario__Group_6__05057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ForbiddenScenario__Group_6__0__Impl5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__Group_6__1__Impl_in_rule__ForbiddenScenario__Group_6__15116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForbiddenScenario__ResourcesAssignment_6_1_in_rule__ForbiddenScenario__Group_6__1__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__0__Impl_in_rule__UserRoleScenario__Group__05177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__1_in_rule__UserRoleScenario__Group__05180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__UserRoleScenario__Group__0__Impl5208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__1__Impl_in_rule__UserRoleScenario__Group__15239 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__2_in_rule__UserRoleScenario__Group__15242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__NameAssignment_1_in_rule__UserRoleScenario__Group__1__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__2__Impl_in_rule__UserRoleScenario__Group__25299 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__3_in_rule__UserRoleScenario__Group__25302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__UserRoleScenario__Group__2__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__3__Impl_in_rule__UserRoleScenario__Group__35361 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__4_in_rule__UserRoleScenario__Group__35364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5393 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0_in_rule__UserRoleScenario__Group__3__Impl5405 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group__4__Impl_in_rule__UserRoleScenario__Group__45438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__UserRoleScenario__Group__4__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__0__Impl_in_rule__UserRoleScenario__Group_3__05507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__1_in_rule__UserRoleScenario__Group_3__05510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__UserRoleScenario__Group_3__0__Impl5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__Group_3__1__Impl_in_rule__UserRoleScenario__Group_3__15569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UserRoleScenario__RolesAssignment_3_1_in_rule__UserRoleScenario__Group_3__1__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePolicy_in_rule__Rbac__PolicyAssignment_05635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarios_in_rule__Rbac__ScenariosAssignment_15666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUser_in_rule__Policy__UsersAssignment_25697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Policy__RolesAssignment_35728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePermission_in_rule__Policy__PermissionsAssignment_45759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Policy__ResourcesAssignment_55790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserScenario_in_rule__Scenarios__UserScenariosAssignment_25821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUserRoleScenario_in_rule__Scenarios__UserRoleScenariosAssignment_35852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__NameAssignment_15883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__User__RolesAssignment_3_15918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_15953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__ParentAssignment_2_15988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__SsodAssignment_4_16027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__DsodAssignment_5_16066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__PermissionsAssignment_6_16105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Permission__NameAssignment_16140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_16171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__PermissionsAssignment_3_16206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__NameAssignment_16241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__UserAssignment_46276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__RolesAssignment_5_16315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GrantedScenario__ResourcesAssignment_6_16354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__NameAssignment_16389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__UserAssignment_46424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__RolesAssignment_5_16463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForbiddenScenario__ResourcesAssignment_6_16502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleScenario__NameAssignment_16537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UserRoleScenario__RolesAssignment_3_16572 = new BitSet(new long[]{0x0000000000000002L});

}