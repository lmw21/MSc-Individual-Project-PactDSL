package imperialmsc.lmw21.pactdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import imperialmsc.lmw21.pactdsl.services.PactDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPactDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'owns'", "'willReturn'", "'mayUse'", "'mayNotUse'", "'ContractName:'", "'.'", "'Entities:'", "'Formalities:'", "'Actions:'", "'StateOnSignature:'", "'PrimaryObligations:'", "'StateAfterObligationsDischarged:'", "'Termination:'", "'StateAfterTermination:'", "'Boilerplate:'", "'EffectiveDate:'", "'Party:'", "'ThirdParty:'", "'SubjectMatter:'", "'definedAs'", "'withAddress'", "'withCompanyNumber'", "'withFeature'", "'inWriting'", "'byEmail'", "'to'", "'givingNoticeTo'", "'withDuration'", "'days'", "'ContractFormality'", "'gaveConsent'", "'gaveWrittenConsent'", "'PaymentObligation:'", "'must'", "'pay'", "'by'", "'date'", "'DeliveryObligation:'", "'deliver'", "'TransferObligation:'", "'transfer'", "'LicenceObligation:'", "'grant'", "'Licence'", "'in'", "'ConstraintParty:'", "'mustNot'", "'ConstraintThirdParty:'", "'unless'", "'withWrittenConsent'", "'of'", "'TerminationForConvenience:'", "'may'", "'terminate'", "'TerminationOnReasonableNotice:'", "'TerminationForBreach:'", "'forBreachOf'", "'TerminationUponInsolvency:'", "'upon'", "'ApplicableLaw:'", "'Jurisdiction:'", "'Notices:'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPactDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPactDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPactDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPactDSL.g"; }


    	private PactDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(PactDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalPactDSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPactDSL.g:54:1: ( ruleModel EOF )
            // InternalPactDSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPactDSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalPactDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalPactDSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalPactDSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalPactDSL.g:69:3: ( rule__Model__Group__0 )
            // InternalPactDSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntityType"
    // InternalPactDSL.g:78:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // InternalPactDSL.g:79:1: ( ruleEntityType EOF )
            // InternalPactDSL.g:80:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // InternalPactDSL.g:87:1: ruleEntityType : ( ( rule__EntityType__Alternatives ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:91:2: ( ( ( rule__EntityType__Alternatives ) ) )
            // InternalPactDSL.g:92:2: ( ( rule__EntityType__Alternatives ) )
            {
            // InternalPactDSL.g:92:2: ( ( rule__EntityType__Alternatives ) )
            // InternalPactDSL.g:93:3: ( rule__EntityType__Alternatives )
            {
             before(grammarAccess.getEntityTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:94:3: ( rule__EntityType__Alternatives )
            // InternalPactDSL.g:94:4: rule__EntityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EntityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "entryRuleEffectiveDate"
    // InternalPactDSL.g:103:1: entryRuleEffectiveDate : ruleEffectiveDate EOF ;
    public final void entryRuleEffectiveDate() throws RecognitionException {
        try {
            // InternalPactDSL.g:104:1: ( ruleEffectiveDate EOF )
            // InternalPactDSL.g:105:1: ruleEffectiveDate EOF
            {
             before(grammarAccess.getEffectiveDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEffectiveDate();

            state._fsp--;

             after(grammarAccess.getEffectiveDateRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEffectiveDate"


    // $ANTLR start "ruleEffectiveDate"
    // InternalPactDSL.g:112:1: ruleEffectiveDate : ( ( rule__EffectiveDate__Group__0 ) ) ;
    public final void ruleEffectiveDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:116:2: ( ( ( rule__EffectiveDate__Group__0 ) ) )
            // InternalPactDSL.g:117:2: ( ( rule__EffectiveDate__Group__0 ) )
            {
            // InternalPactDSL.g:117:2: ( ( rule__EffectiveDate__Group__0 ) )
            // InternalPactDSL.g:118:3: ( rule__EffectiveDate__Group__0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup()); 
            // InternalPactDSL.g:119:3: ( rule__EffectiveDate__Group__0 )
            // InternalPactDSL.g:119:4: rule__EffectiveDate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEffectiveDate"


    // $ANTLR start "entryRuleParty"
    // InternalPactDSL.g:128:1: entryRuleParty : ruleParty EOF ;
    public final void entryRuleParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:129:1: ( ruleParty EOF )
            // InternalPactDSL.g:130:1: ruleParty EOF
            {
             before(grammarAccess.getPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleParty();

            state._fsp--;

             after(grammarAccess.getPartyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParty"


    // $ANTLR start "ruleParty"
    // InternalPactDSL.g:137:1: ruleParty : ( ( rule__Party__Group__0 ) ) ;
    public final void ruleParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:141:2: ( ( ( rule__Party__Group__0 ) ) )
            // InternalPactDSL.g:142:2: ( ( rule__Party__Group__0 ) )
            {
            // InternalPactDSL.g:142:2: ( ( rule__Party__Group__0 ) )
            // InternalPactDSL.g:143:3: ( rule__Party__Group__0 )
            {
             before(grammarAccess.getPartyAccess().getGroup()); 
            // InternalPactDSL.g:144:3: ( rule__Party__Group__0 )
            // InternalPactDSL.g:144:4: rule__Party__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Party__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParty"


    // $ANTLR start "entryRuleThirdParty"
    // InternalPactDSL.g:153:1: entryRuleThirdParty : ruleThirdParty EOF ;
    public final void entryRuleThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:154:1: ( ruleThirdParty EOF )
            // InternalPactDSL.g:155:1: ruleThirdParty EOF
            {
             before(grammarAccess.getThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleThirdParty();

            state._fsp--;

             after(grammarAccess.getThirdPartyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleThirdParty"


    // $ANTLR start "ruleThirdParty"
    // InternalPactDSL.g:162:1: ruleThirdParty : ( ( rule__ThirdParty__Group__0 ) ) ;
    public final void ruleThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:166:2: ( ( ( rule__ThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:167:2: ( ( rule__ThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:167:2: ( ( rule__ThirdParty__Group__0 ) )
            // InternalPactDSL.g:168:3: ( rule__ThirdParty__Group__0 )
            {
             before(grammarAccess.getThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:169:3: ( rule__ThirdParty__Group__0 )
            // InternalPactDSL.g:169:4: rule__ThirdParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThirdParty"


    // $ANTLR start "entryRuleSubjectMatter"
    // InternalPactDSL.g:178:1: entryRuleSubjectMatter : ruleSubjectMatter EOF ;
    public final void entryRuleSubjectMatter() throws RecognitionException {
        try {
            // InternalPactDSL.g:179:1: ( ruleSubjectMatter EOF )
            // InternalPactDSL.g:180:1: ruleSubjectMatter EOF
            {
             before(grammarAccess.getSubjectMatterRule()); 
            pushFollow(FOLLOW_1);
            ruleSubjectMatter();

            state._fsp--;

             after(grammarAccess.getSubjectMatterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSubjectMatter"


    // $ANTLR start "ruleSubjectMatter"
    // InternalPactDSL.g:187:1: ruleSubjectMatter : ( ( rule__SubjectMatter__Group__0 ) ) ;
    public final void ruleSubjectMatter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:191:2: ( ( ( rule__SubjectMatter__Group__0 ) ) )
            // InternalPactDSL.g:192:2: ( ( rule__SubjectMatter__Group__0 ) )
            {
            // InternalPactDSL.g:192:2: ( ( rule__SubjectMatter__Group__0 ) )
            // InternalPactDSL.g:193:3: ( rule__SubjectMatter__Group__0 )
            {
             before(grammarAccess.getSubjectMatterAccess().getGroup()); 
            // InternalPactDSL.g:194:3: ( rule__SubjectMatter__Group__0 )
            // InternalPactDSL.g:194:4: rule__SubjectMatter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubjectMatter"


    // $ANTLR start "entryRuleDefinedTerm"
    // InternalPactDSL.g:203:1: entryRuleDefinedTerm : ruleDefinedTerm EOF ;
    public final void entryRuleDefinedTerm() throws RecognitionException {
        try {
            // InternalPactDSL.g:204:1: ( ruleDefinedTerm EOF )
            // InternalPactDSL.g:205:1: ruleDefinedTerm EOF
            {
             before(grammarAccess.getDefinedTermRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getDefinedTermRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefinedTerm"


    // $ANTLR start "ruleDefinedTerm"
    // InternalPactDSL.g:212:1: ruleDefinedTerm : ( ( rule__DefinedTerm__Group__0 ) ) ;
    public final void ruleDefinedTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:216:2: ( ( ( rule__DefinedTerm__Group__0 ) ) )
            // InternalPactDSL.g:217:2: ( ( rule__DefinedTerm__Group__0 ) )
            {
            // InternalPactDSL.g:217:2: ( ( rule__DefinedTerm__Group__0 ) )
            // InternalPactDSL.g:218:3: ( rule__DefinedTerm__Group__0 )
            {
             before(grammarAccess.getDefinedTermAccess().getGroup()); 
            // InternalPactDSL.g:219:3: ( rule__DefinedTerm__Group__0 )
            // InternalPactDSL.g:219:4: rule__DefinedTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinedTerm"


    // $ANTLR start "entryRuleAddress"
    // InternalPactDSL.g:228:1: entryRuleAddress : ruleAddress EOF ;
    public final void entryRuleAddress() throws RecognitionException {
        try {
            // InternalPactDSL.g:229:1: ( ruleAddress EOF )
            // InternalPactDSL.g:230:1: ruleAddress EOF
            {
             before(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_1);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getAddressRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // InternalPactDSL.g:237:1: ruleAddress : ( ( rule__Address__Group__0 ) ) ;
    public final void ruleAddress() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:241:2: ( ( ( rule__Address__Group__0 ) ) )
            // InternalPactDSL.g:242:2: ( ( rule__Address__Group__0 ) )
            {
            // InternalPactDSL.g:242:2: ( ( rule__Address__Group__0 ) )
            // InternalPactDSL.g:243:3: ( rule__Address__Group__0 )
            {
             before(grammarAccess.getAddressAccess().getGroup()); 
            // InternalPactDSL.g:244:3: ( rule__Address__Group__0 )
            // InternalPactDSL.g:244:4: rule__Address__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleCompanyNumber"
    // InternalPactDSL.g:253:1: entryRuleCompanyNumber : ruleCompanyNumber EOF ;
    public final void entryRuleCompanyNumber() throws RecognitionException {
        try {
            // InternalPactDSL.g:254:1: ( ruleCompanyNumber EOF )
            // InternalPactDSL.g:255:1: ruleCompanyNumber EOF
            {
             before(grammarAccess.getCompanyNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleCompanyNumber();

            state._fsp--;

             after(grammarAccess.getCompanyNumberRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompanyNumber"


    // $ANTLR start "ruleCompanyNumber"
    // InternalPactDSL.g:262:1: ruleCompanyNumber : ( ( rule__CompanyNumber__Group__0 ) ) ;
    public final void ruleCompanyNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:266:2: ( ( ( rule__CompanyNumber__Group__0 ) ) )
            // InternalPactDSL.g:267:2: ( ( rule__CompanyNumber__Group__0 ) )
            {
            // InternalPactDSL.g:267:2: ( ( rule__CompanyNumber__Group__0 ) )
            // InternalPactDSL.g:268:3: ( rule__CompanyNumber__Group__0 )
            {
             before(grammarAccess.getCompanyNumberAccess().getGroup()); 
            // InternalPactDSL.g:269:3: ( rule__CompanyNumber__Group__0 )
            // InternalPactDSL.g:269:4: rule__CompanyNumber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompanyNumber"


    // $ANTLR start "entryRuleFeature"
    // InternalPactDSL.g:278:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalPactDSL.g:279:1: ( ruleFeature EOF )
            // InternalPactDSL.g:280:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalPactDSL.g:287:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:291:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalPactDSL.g:292:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalPactDSL.g:292:2: ( ( rule__Feature__Group__0 ) )
            // InternalPactDSL.g:293:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalPactDSL.g:294:3: ( rule__Feature__Group__0 )
            // InternalPactDSL.g:294:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleFormalityType"
    // InternalPactDSL.g:303:1: entryRuleFormalityType : ruleFormalityType EOF ;
    public final void entryRuleFormalityType() throws RecognitionException {
        try {
            // InternalPactDSL.g:304:1: ( ruleFormalityType EOF )
            // InternalPactDSL.g:305:1: ruleFormalityType EOF
            {
             before(grammarAccess.getFormalityTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFormalityType();

            state._fsp--;

             after(grammarAccess.getFormalityTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFormalityType"


    // $ANTLR start "ruleFormalityType"
    // InternalPactDSL.g:312:1: ruleFormalityType : ( ( rule__FormalityType__Alternatives ) ) ;
    public final void ruleFormalityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:316:2: ( ( ( rule__FormalityType__Alternatives ) ) )
            // InternalPactDSL.g:317:2: ( ( rule__FormalityType__Alternatives ) )
            {
            // InternalPactDSL.g:317:2: ( ( rule__FormalityType__Alternatives ) )
            // InternalPactDSL.g:318:3: ( rule__FormalityType__Alternatives )
            {
             before(grammarAccess.getFormalityTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:319:3: ( rule__FormalityType__Alternatives )
            // InternalPactDSL.g:319:4: rule__FormalityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormalityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormalityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormalityType"


    // $ANTLR start "entryRuleInWriting"
    // InternalPactDSL.g:328:1: entryRuleInWriting : ruleInWriting EOF ;
    public final void entryRuleInWriting() throws RecognitionException {
        try {
            // InternalPactDSL.g:329:1: ( ruleInWriting EOF )
            // InternalPactDSL.g:330:1: ruleInWriting EOF
            {
             before(grammarAccess.getInWritingRule()); 
            pushFollow(FOLLOW_1);
            ruleInWriting();

            state._fsp--;

             after(grammarAccess.getInWritingRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInWriting"


    // $ANTLR start "ruleInWriting"
    // InternalPactDSL.g:337:1: ruleInWriting : ( ( rule__InWriting__Group__0 ) ) ;
    public final void ruleInWriting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:341:2: ( ( ( rule__InWriting__Group__0 ) ) )
            // InternalPactDSL.g:342:2: ( ( rule__InWriting__Group__0 ) )
            {
            // InternalPactDSL.g:342:2: ( ( rule__InWriting__Group__0 ) )
            // InternalPactDSL.g:343:3: ( rule__InWriting__Group__0 )
            {
             before(grammarAccess.getInWritingAccess().getGroup()); 
            // InternalPactDSL.g:344:3: ( rule__InWriting__Group__0 )
            // InternalPactDSL.g:344:4: rule__InWriting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInWritingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInWriting"


    // $ANTLR start "entryRuleByEmail"
    // InternalPactDSL.g:353:1: entryRuleByEmail : ruleByEmail EOF ;
    public final void entryRuleByEmail() throws RecognitionException {
        try {
            // InternalPactDSL.g:354:1: ( ruleByEmail EOF )
            // InternalPactDSL.g:355:1: ruleByEmail EOF
            {
             before(grammarAccess.getByEmailRule()); 
            pushFollow(FOLLOW_1);
            ruleByEmail();

            state._fsp--;

             after(grammarAccess.getByEmailRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleByEmail"


    // $ANTLR start "ruleByEmail"
    // InternalPactDSL.g:362:1: ruleByEmail : ( ( rule__ByEmail__Group__0 ) ) ;
    public final void ruleByEmail() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:366:2: ( ( ( rule__ByEmail__Group__0 ) ) )
            // InternalPactDSL.g:367:2: ( ( rule__ByEmail__Group__0 ) )
            {
            // InternalPactDSL.g:367:2: ( ( rule__ByEmail__Group__0 ) )
            // InternalPactDSL.g:368:3: ( rule__ByEmail__Group__0 )
            {
             before(grammarAccess.getByEmailAccess().getGroup()); 
            // InternalPactDSL.g:369:3: ( rule__ByEmail__Group__0 )
            // InternalPactDSL.g:369:4: rule__ByEmail__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getByEmailAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleByEmail"


    // $ANTLR start "entryRuleGivingNotice"
    // InternalPactDSL.g:378:1: entryRuleGivingNotice : ruleGivingNotice EOF ;
    public final void entryRuleGivingNotice() throws RecognitionException {
        try {
            // InternalPactDSL.g:379:1: ( ruleGivingNotice EOF )
            // InternalPactDSL.g:380:1: ruleGivingNotice EOF
            {
             before(grammarAccess.getGivingNoticeRule()); 
            pushFollow(FOLLOW_1);
            ruleGivingNotice();

            state._fsp--;

             after(grammarAccess.getGivingNoticeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGivingNotice"


    // $ANTLR start "ruleGivingNotice"
    // InternalPactDSL.g:387:1: ruleGivingNotice : ( ( rule__GivingNotice__Group__0 ) ) ;
    public final void ruleGivingNotice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:391:2: ( ( ( rule__GivingNotice__Group__0 ) ) )
            // InternalPactDSL.g:392:2: ( ( rule__GivingNotice__Group__0 ) )
            {
            // InternalPactDSL.g:392:2: ( ( rule__GivingNotice__Group__0 ) )
            // InternalPactDSL.g:393:3: ( rule__GivingNotice__Group__0 )
            {
             before(grammarAccess.getGivingNoticeAccess().getGroup()); 
            // InternalPactDSL.g:394:3: ( rule__GivingNotice__Group__0 )
            // InternalPactDSL.g:394:4: rule__GivingNotice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivingNotice"


    // $ANTLR start "entryRuleCustomFormality"
    // InternalPactDSL.g:403:1: entryRuleCustomFormality : ruleCustomFormality EOF ;
    public final void entryRuleCustomFormality() throws RecognitionException {
        try {
            // InternalPactDSL.g:404:1: ( ruleCustomFormality EOF )
            // InternalPactDSL.g:405:1: ruleCustomFormality EOF
            {
             before(grammarAccess.getCustomFormalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomFormality();

            state._fsp--;

             after(grammarAccess.getCustomFormalityRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCustomFormality"


    // $ANTLR start "ruleCustomFormality"
    // InternalPactDSL.g:412:1: ruleCustomFormality : ( ( rule__CustomFormality__Group__0 ) ) ;
    public final void ruleCustomFormality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:416:2: ( ( ( rule__CustomFormality__Group__0 ) ) )
            // InternalPactDSL.g:417:2: ( ( rule__CustomFormality__Group__0 ) )
            {
            // InternalPactDSL.g:417:2: ( ( rule__CustomFormality__Group__0 ) )
            // InternalPactDSL.g:418:3: ( rule__CustomFormality__Group__0 )
            {
             before(grammarAccess.getCustomFormalityAccess().getGroup()); 
            // InternalPactDSL.g:419:3: ( rule__CustomFormality__Group__0 )
            // InternalPactDSL.g:419:4: rule__CustomFormality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomFormalityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomFormality"


    // $ANTLR start "entryRuleActionType"
    // InternalPactDSL.g:428:1: entryRuleActionType : ruleActionType EOF ;
    public final void entryRuleActionType() throws RecognitionException {
        try {
            // InternalPactDSL.g:429:1: ( ruleActionType EOF )
            // InternalPactDSL.g:430:1: ruleActionType EOF
            {
             before(grammarAccess.getActionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getActionTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleActionType"


    // $ANTLR start "ruleActionType"
    // InternalPactDSL.g:437:1: ruleActionType : ( ( rule__ActionType__Alternatives ) ) ;
    public final void ruleActionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:441:2: ( ( ( rule__ActionType__Alternatives ) ) )
            // InternalPactDSL.g:442:2: ( ( rule__ActionType__Alternatives ) )
            {
            // InternalPactDSL.g:442:2: ( ( rule__ActionType__Alternatives ) )
            // InternalPactDSL.g:443:3: ( rule__ActionType__Alternatives )
            {
             before(grammarAccess.getActionTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:444:3: ( rule__ActionType__Alternatives )
            // InternalPactDSL.g:444:4: rule__ActionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionType"


    // $ANTLR start "entryRuleGivenConsent"
    // InternalPactDSL.g:453:1: entryRuleGivenConsent : ruleGivenConsent EOF ;
    public final void entryRuleGivenConsent() throws RecognitionException {
        try {
            // InternalPactDSL.g:454:1: ( ruleGivenConsent EOF )
            // InternalPactDSL.g:455:1: ruleGivenConsent EOF
            {
             before(grammarAccess.getGivenConsentRule()); 
            pushFollow(FOLLOW_1);
            ruleGivenConsent();

            state._fsp--;

             after(grammarAccess.getGivenConsentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGivenConsent"


    // $ANTLR start "ruleGivenConsent"
    // InternalPactDSL.g:462:1: ruleGivenConsent : ( ( rule__GivenConsent__Group__0 ) ) ;
    public final void ruleGivenConsent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:466:2: ( ( ( rule__GivenConsent__Group__0 ) ) )
            // InternalPactDSL.g:467:2: ( ( rule__GivenConsent__Group__0 ) )
            {
            // InternalPactDSL.g:467:2: ( ( rule__GivenConsent__Group__0 ) )
            // InternalPactDSL.g:468:3: ( rule__GivenConsent__Group__0 )
            {
             before(grammarAccess.getGivenConsentAccess().getGroup()); 
            // InternalPactDSL.g:469:3: ( rule__GivenConsent__Group__0 )
            // InternalPactDSL.g:469:4: rule__GivenConsent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenConsentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivenConsent"


    // $ANTLR start "entryRuleGivenWrittenConsent"
    // InternalPactDSL.g:478:1: entryRuleGivenWrittenConsent : ruleGivenWrittenConsent EOF ;
    public final void entryRuleGivenWrittenConsent() throws RecognitionException {
        try {
            // InternalPactDSL.g:479:1: ( ruleGivenWrittenConsent EOF )
            // InternalPactDSL.g:480:1: ruleGivenWrittenConsent EOF
            {
             before(grammarAccess.getGivenWrittenConsentRule()); 
            pushFollow(FOLLOW_1);
            ruleGivenWrittenConsent();

            state._fsp--;

             after(grammarAccess.getGivenWrittenConsentRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGivenWrittenConsent"


    // $ANTLR start "ruleGivenWrittenConsent"
    // InternalPactDSL.g:487:1: ruleGivenWrittenConsent : ( ( rule__GivenWrittenConsent__Group__0 ) ) ;
    public final void ruleGivenWrittenConsent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:491:2: ( ( ( rule__GivenWrittenConsent__Group__0 ) ) )
            // InternalPactDSL.g:492:2: ( ( rule__GivenWrittenConsent__Group__0 ) )
            {
            // InternalPactDSL.g:492:2: ( ( rule__GivenWrittenConsent__Group__0 ) )
            // InternalPactDSL.g:493:3: ( rule__GivenWrittenConsent__Group__0 )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getGroup()); 
            // InternalPactDSL.g:494:3: ( rule__GivenWrittenConsent__Group__0 )
            // InternalPactDSL.g:494:4: rule__GivenWrittenConsent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenWrittenConsentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGivenWrittenConsent"


    // $ANTLR start "entryRuleStateType"
    // InternalPactDSL.g:503:1: entryRuleStateType : ruleStateType EOF ;
    public final void entryRuleStateType() throws RecognitionException {
        try {
            // InternalPactDSL.g:504:1: ( ruleStateType EOF )
            // InternalPactDSL.g:505:1: ruleStateType EOF
            {
             before(grammarAccess.getStateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getStateTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStateType"


    // $ANTLR start "ruleStateType"
    // InternalPactDSL.g:512:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:516:2: ( ( ( rule__StateType__Alternatives ) ) )
            // InternalPactDSL.g:517:2: ( ( rule__StateType__Alternatives ) )
            {
            // InternalPactDSL.g:517:2: ( ( rule__StateType__Alternatives ) )
            // InternalPactDSL.g:518:3: ( rule__StateType__Alternatives )
            {
             before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:519:3: ( rule__StateType__Alternatives )
            // InternalPactDSL.g:519:4: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateType"


    // $ANTLR start "entryRuleOwnership"
    // InternalPactDSL.g:528:1: entryRuleOwnership : ruleOwnership EOF ;
    public final void entryRuleOwnership() throws RecognitionException {
        try {
            // InternalPactDSL.g:529:1: ( ruleOwnership EOF )
            // InternalPactDSL.g:530:1: ruleOwnership EOF
            {
             before(grammarAccess.getOwnershipRule()); 
            pushFollow(FOLLOW_1);
            ruleOwnership();

            state._fsp--;

             after(grammarAccess.getOwnershipRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOwnership"


    // $ANTLR start "ruleOwnership"
    // InternalPactDSL.g:537:1: ruleOwnership : ( ( rule__Ownership__Group__0 ) ) ;
    public final void ruleOwnership() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:541:2: ( ( ( rule__Ownership__Group__0 ) ) )
            // InternalPactDSL.g:542:2: ( ( rule__Ownership__Group__0 ) )
            {
            // InternalPactDSL.g:542:2: ( ( rule__Ownership__Group__0 ) )
            // InternalPactDSL.g:543:3: ( rule__Ownership__Group__0 )
            {
             before(grammarAccess.getOwnershipAccess().getGroup()); 
            // InternalPactDSL.g:544:3: ( rule__Ownership__Group__0 )
            // InternalPactDSL.g:544:4: rule__Ownership__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOwnership"


    // $ANTLR start "entryRuleRightToUse"
    // InternalPactDSL.g:553:1: entryRuleRightToUse : ruleRightToUse EOF ;
    public final void entryRuleRightToUse() throws RecognitionException {
        try {
            // InternalPactDSL.g:554:1: ( ruleRightToUse EOF )
            // InternalPactDSL.g:555:1: ruleRightToUse EOF
            {
             before(grammarAccess.getRightToUseRule()); 
            pushFollow(FOLLOW_1);
            ruleRightToUse();

            state._fsp--;

             after(grammarAccess.getRightToUseRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRightToUse"


    // $ANTLR start "ruleRightToUse"
    // InternalPactDSL.g:562:1: ruleRightToUse : ( ( rule__RightToUse__Group__0 ) ) ;
    public final void ruleRightToUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:566:2: ( ( ( rule__RightToUse__Group__0 ) ) )
            // InternalPactDSL.g:567:2: ( ( rule__RightToUse__Group__0 ) )
            {
            // InternalPactDSL.g:567:2: ( ( rule__RightToUse__Group__0 ) )
            // InternalPactDSL.g:568:3: ( rule__RightToUse__Group__0 )
            {
             before(grammarAccess.getRightToUseAccess().getGroup()); 
            // InternalPactDSL.g:569:3: ( rule__RightToUse__Group__0 )
            // InternalPactDSL.g:569:4: rule__RightToUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightToUse"


    // $ANTLR start "entryRulePrimaryObligationType"
    // InternalPactDSL.g:578:1: entryRulePrimaryObligationType : rulePrimaryObligationType EOF ;
    public final void entryRulePrimaryObligationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:579:1: ( rulePrimaryObligationType EOF )
            // InternalPactDSL.g:580:1: rulePrimaryObligationType EOF
            {
             before(grammarAccess.getPrimaryObligationTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryObligationType();

            state._fsp--;

             after(grammarAccess.getPrimaryObligationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimaryObligationType"


    // $ANTLR start "rulePrimaryObligationType"
    // InternalPactDSL.g:587:1: rulePrimaryObligationType : ( ( rule__PrimaryObligationType__Alternatives ) ) ;
    public final void rulePrimaryObligationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:591:2: ( ( ( rule__PrimaryObligationType__Alternatives ) ) )
            // InternalPactDSL.g:592:2: ( ( rule__PrimaryObligationType__Alternatives ) )
            {
            // InternalPactDSL.g:592:2: ( ( rule__PrimaryObligationType__Alternatives ) )
            // InternalPactDSL.g:593:3: ( rule__PrimaryObligationType__Alternatives )
            {
             before(grammarAccess.getPrimaryObligationTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:594:3: ( rule__PrimaryObligationType__Alternatives )
            // InternalPactDSL.g:594:4: rule__PrimaryObligationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryObligationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryObligationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryObligationType"


    // $ANTLR start "entryRulePaymentObligation"
    // InternalPactDSL.g:603:1: entryRulePaymentObligation : rulePaymentObligation EOF ;
    public final void entryRulePaymentObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:604:1: ( rulePaymentObligation EOF )
            // InternalPactDSL.g:605:1: rulePaymentObligation EOF
            {
             before(grammarAccess.getPaymentObligationRule()); 
            pushFollow(FOLLOW_1);
            rulePaymentObligation();

            state._fsp--;

             after(grammarAccess.getPaymentObligationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePaymentObligation"


    // $ANTLR start "rulePaymentObligation"
    // InternalPactDSL.g:612:1: rulePaymentObligation : ( ( rule__PaymentObligation__Group__0 ) ) ;
    public final void rulePaymentObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:616:2: ( ( ( rule__PaymentObligation__Group__0 ) ) )
            // InternalPactDSL.g:617:2: ( ( rule__PaymentObligation__Group__0 ) )
            {
            // InternalPactDSL.g:617:2: ( ( rule__PaymentObligation__Group__0 ) )
            // InternalPactDSL.g:618:3: ( rule__PaymentObligation__Group__0 )
            {
             before(grammarAccess.getPaymentObligationAccess().getGroup()); 
            // InternalPactDSL.g:619:3: ( rule__PaymentObligation__Group__0 )
            // InternalPactDSL.g:619:4: rule__PaymentObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaymentObligation"


    // $ANTLR start "entryRuleDeliveryObligation"
    // InternalPactDSL.g:628:1: entryRuleDeliveryObligation : ruleDeliveryObligation EOF ;
    public final void entryRuleDeliveryObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:629:1: ( ruleDeliveryObligation EOF )
            // InternalPactDSL.g:630:1: ruleDeliveryObligation EOF
            {
             before(grammarAccess.getDeliveryObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeliveryObligation();

            state._fsp--;

             after(grammarAccess.getDeliveryObligationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeliveryObligation"


    // $ANTLR start "ruleDeliveryObligation"
    // InternalPactDSL.g:637:1: ruleDeliveryObligation : ( ( rule__DeliveryObligation__Group__0 ) ) ;
    public final void ruleDeliveryObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:641:2: ( ( ( rule__DeliveryObligation__Group__0 ) ) )
            // InternalPactDSL.g:642:2: ( ( rule__DeliveryObligation__Group__0 ) )
            {
            // InternalPactDSL.g:642:2: ( ( rule__DeliveryObligation__Group__0 ) )
            // InternalPactDSL.g:643:3: ( rule__DeliveryObligation__Group__0 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getGroup()); 
            // InternalPactDSL.g:644:3: ( rule__DeliveryObligation__Group__0 )
            // InternalPactDSL.g:644:4: rule__DeliveryObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeliveryObligation"


    // $ANTLR start "entryRuleTransferObligation"
    // InternalPactDSL.g:653:1: entryRuleTransferObligation : ruleTransferObligation EOF ;
    public final void entryRuleTransferObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:654:1: ( ruleTransferObligation EOF )
            // InternalPactDSL.g:655:1: ruleTransferObligation EOF
            {
             before(grammarAccess.getTransferObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleTransferObligation();

            state._fsp--;

             after(grammarAccess.getTransferObligationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTransferObligation"


    // $ANTLR start "ruleTransferObligation"
    // InternalPactDSL.g:662:1: ruleTransferObligation : ( ( rule__TransferObligation__Group__0 ) ) ;
    public final void ruleTransferObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:666:2: ( ( ( rule__TransferObligation__Group__0 ) ) )
            // InternalPactDSL.g:667:2: ( ( rule__TransferObligation__Group__0 ) )
            {
            // InternalPactDSL.g:667:2: ( ( rule__TransferObligation__Group__0 ) )
            // InternalPactDSL.g:668:3: ( rule__TransferObligation__Group__0 )
            {
             before(grammarAccess.getTransferObligationAccess().getGroup()); 
            // InternalPactDSL.g:669:3: ( rule__TransferObligation__Group__0 )
            // InternalPactDSL.g:669:4: rule__TransferObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransferObligation"


    // $ANTLR start "entryRuleLicenceObligation"
    // InternalPactDSL.g:678:1: entryRuleLicenceObligation : ruleLicenceObligation EOF ;
    public final void entryRuleLicenceObligation() throws RecognitionException {
        try {
            // InternalPactDSL.g:679:1: ( ruleLicenceObligation EOF )
            // InternalPactDSL.g:680:1: ruleLicenceObligation EOF
            {
             before(grammarAccess.getLicenceObligationRule()); 
            pushFollow(FOLLOW_1);
            ruleLicenceObligation();

            state._fsp--;

             after(grammarAccess.getLicenceObligationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLicenceObligation"


    // $ANTLR start "ruleLicenceObligation"
    // InternalPactDSL.g:687:1: ruleLicenceObligation : ( ( rule__LicenceObligation__Group__0 ) ) ;
    public final void ruleLicenceObligation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:691:2: ( ( ( rule__LicenceObligation__Group__0 ) ) )
            // InternalPactDSL.g:692:2: ( ( rule__LicenceObligation__Group__0 ) )
            {
            // InternalPactDSL.g:692:2: ( ( rule__LicenceObligation__Group__0 ) )
            // InternalPactDSL.g:693:3: ( rule__LicenceObligation__Group__0 )
            {
             before(grammarAccess.getLicenceObligationAccess().getGroup()); 
            // InternalPactDSL.g:694:3: ( rule__LicenceObligation__Group__0 )
            // InternalPactDSL.g:694:4: rule__LicenceObligation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLicenceObligation"


    // $ANTLR start "entryRuleConstraintParty"
    // InternalPactDSL.g:703:1: entryRuleConstraintParty : ruleConstraintParty EOF ;
    public final void entryRuleConstraintParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:704:1: ( ruleConstraintParty EOF )
            // InternalPactDSL.g:705:1: ruleConstraintParty EOF
            {
             before(grammarAccess.getConstraintPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintParty();

            state._fsp--;

             after(grammarAccess.getConstraintPartyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraintParty"


    // $ANTLR start "ruleConstraintParty"
    // InternalPactDSL.g:712:1: ruleConstraintParty : ( ( rule__ConstraintParty__Group__0 ) ) ;
    public final void ruleConstraintParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:716:2: ( ( ( rule__ConstraintParty__Group__0 ) ) )
            // InternalPactDSL.g:717:2: ( ( rule__ConstraintParty__Group__0 ) )
            {
            // InternalPactDSL.g:717:2: ( ( rule__ConstraintParty__Group__0 ) )
            // InternalPactDSL.g:718:3: ( rule__ConstraintParty__Group__0 )
            {
             before(grammarAccess.getConstraintPartyAccess().getGroup()); 
            // InternalPactDSL.g:719:3: ( rule__ConstraintParty__Group__0 )
            // InternalPactDSL.g:719:4: rule__ConstraintParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintParty"


    // $ANTLR start "entryRuleConstraintThirdParty"
    // InternalPactDSL.g:728:1: entryRuleConstraintThirdParty : ruleConstraintThirdParty EOF ;
    public final void entryRuleConstraintThirdParty() throws RecognitionException {
        try {
            // InternalPactDSL.g:729:1: ( ruleConstraintThirdParty EOF )
            // InternalPactDSL.g:730:1: ruleConstraintThirdParty EOF
            {
             before(grammarAccess.getConstraintThirdPartyRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraintThirdParty();

            state._fsp--;

             after(grammarAccess.getConstraintThirdPartyRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConstraintThirdParty"


    // $ANTLR start "ruleConstraintThirdParty"
    // InternalPactDSL.g:737:1: ruleConstraintThirdParty : ( ( rule__ConstraintThirdParty__Group__0 ) ) ;
    public final void ruleConstraintThirdParty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:741:2: ( ( ( rule__ConstraintThirdParty__Group__0 ) ) )
            // InternalPactDSL.g:742:2: ( ( rule__ConstraintThirdParty__Group__0 ) )
            {
            // InternalPactDSL.g:742:2: ( ( rule__ConstraintThirdParty__Group__0 ) )
            // InternalPactDSL.g:743:3: ( rule__ConstraintThirdParty__Group__0 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup()); 
            // InternalPactDSL.g:744:3: ( rule__ConstraintThirdParty__Group__0 )
            // InternalPactDSL.g:744:4: rule__ConstraintThirdParty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintThirdParty"


    // $ANTLR start "entryRuleTerminationType"
    // InternalPactDSL.g:753:1: entryRuleTerminationType : ruleTerminationType EOF ;
    public final void entryRuleTerminationType() throws RecognitionException {
        try {
            // InternalPactDSL.g:754:1: ( ruleTerminationType EOF )
            // InternalPactDSL.g:755:1: ruleTerminationType EOF
            {
             before(grammarAccess.getTerminationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminationType();

            state._fsp--;

             after(grammarAccess.getTerminationTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminationType"


    // $ANTLR start "ruleTerminationType"
    // InternalPactDSL.g:762:1: ruleTerminationType : ( ( rule__TerminationType__Alternatives ) ) ;
    public final void ruleTerminationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:766:2: ( ( ( rule__TerminationType__Alternatives ) ) )
            // InternalPactDSL.g:767:2: ( ( rule__TerminationType__Alternatives ) )
            {
            // InternalPactDSL.g:767:2: ( ( rule__TerminationType__Alternatives ) )
            // InternalPactDSL.g:768:3: ( rule__TerminationType__Alternatives )
            {
             before(grammarAccess.getTerminationTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:769:3: ( rule__TerminationType__Alternatives )
            // InternalPactDSL.g:769:4: rule__TerminationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTerminationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerminationType"


    // $ANTLR start "entryRuleForConvenience"
    // InternalPactDSL.g:778:1: entryRuleForConvenience : ruleForConvenience EOF ;
    public final void entryRuleForConvenience() throws RecognitionException {
        try {
            // InternalPactDSL.g:779:1: ( ruleForConvenience EOF )
            // InternalPactDSL.g:780:1: ruleForConvenience EOF
            {
             before(grammarAccess.getForConvenienceRule()); 
            pushFollow(FOLLOW_1);
            ruleForConvenience();

            state._fsp--;

             after(grammarAccess.getForConvenienceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForConvenience"


    // $ANTLR start "ruleForConvenience"
    // InternalPactDSL.g:787:1: ruleForConvenience : ( ( rule__ForConvenience__Group__0 ) ) ;
    public final void ruleForConvenience() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:791:2: ( ( ( rule__ForConvenience__Group__0 ) ) )
            // InternalPactDSL.g:792:2: ( ( rule__ForConvenience__Group__0 ) )
            {
            // InternalPactDSL.g:792:2: ( ( rule__ForConvenience__Group__0 ) )
            // InternalPactDSL.g:793:3: ( rule__ForConvenience__Group__0 )
            {
             before(grammarAccess.getForConvenienceAccess().getGroup()); 
            // InternalPactDSL.g:794:3: ( rule__ForConvenience__Group__0 )
            // InternalPactDSL.g:794:4: rule__ForConvenience__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForConvenience"


    // $ANTLR start "entryRuleOnReasonableNotice"
    // InternalPactDSL.g:803:1: entryRuleOnReasonableNotice : ruleOnReasonableNotice EOF ;
    public final void entryRuleOnReasonableNotice() throws RecognitionException {
        try {
            // InternalPactDSL.g:804:1: ( ruleOnReasonableNotice EOF )
            // InternalPactDSL.g:805:1: ruleOnReasonableNotice EOF
            {
             before(grammarAccess.getOnReasonableNoticeRule()); 
            pushFollow(FOLLOW_1);
            ruleOnReasonableNotice();

            state._fsp--;

             after(grammarAccess.getOnReasonableNoticeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOnReasonableNotice"


    // $ANTLR start "ruleOnReasonableNotice"
    // InternalPactDSL.g:812:1: ruleOnReasonableNotice : ( ( rule__OnReasonableNotice__Group__0 ) ) ;
    public final void ruleOnReasonableNotice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:816:2: ( ( ( rule__OnReasonableNotice__Group__0 ) ) )
            // InternalPactDSL.g:817:2: ( ( rule__OnReasonableNotice__Group__0 ) )
            {
            // InternalPactDSL.g:817:2: ( ( rule__OnReasonableNotice__Group__0 ) )
            // InternalPactDSL.g:818:3: ( rule__OnReasonableNotice__Group__0 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getGroup()); 
            // InternalPactDSL.g:819:3: ( rule__OnReasonableNotice__Group__0 )
            // InternalPactDSL.g:819:4: rule__OnReasonableNotice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnReasonableNotice"


    // $ANTLR start "entryRuleForBreach"
    // InternalPactDSL.g:828:1: entryRuleForBreach : ruleForBreach EOF ;
    public final void entryRuleForBreach() throws RecognitionException {
        try {
            // InternalPactDSL.g:829:1: ( ruleForBreach EOF )
            // InternalPactDSL.g:830:1: ruleForBreach EOF
            {
             before(grammarAccess.getForBreachRule()); 
            pushFollow(FOLLOW_1);
            ruleForBreach();

            state._fsp--;

             after(grammarAccess.getForBreachRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForBreach"


    // $ANTLR start "ruleForBreach"
    // InternalPactDSL.g:837:1: ruleForBreach : ( ( rule__ForBreach__Group__0 ) ) ;
    public final void ruleForBreach() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:841:2: ( ( ( rule__ForBreach__Group__0 ) ) )
            // InternalPactDSL.g:842:2: ( ( rule__ForBreach__Group__0 ) )
            {
            // InternalPactDSL.g:842:2: ( ( rule__ForBreach__Group__0 ) )
            // InternalPactDSL.g:843:3: ( rule__ForBreach__Group__0 )
            {
             before(grammarAccess.getForBreachAccess().getGroup()); 
            // InternalPactDSL.g:844:3: ( rule__ForBreach__Group__0 )
            // InternalPactDSL.g:844:4: rule__ForBreach__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForBreach"


    // $ANTLR start "entryRuleOnInsolvencyEvent"
    // InternalPactDSL.g:853:1: entryRuleOnInsolvencyEvent : ruleOnInsolvencyEvent EOF ;
    public final void entryRuleOnInsolvencyEvent() throws RecognitionException {
        try {
            // InternalPactDSL.g:854:1: ( ruleOnInsolvencyEvent EOF )
            // InternalPactDSL.g:855:1: ruleOnInsolvencyEvent EOF
            {
             before(grammarAccess.getOnInsolvencyEventRule()); 
            pushFollow(FOLLOW_1);
            ruleOnInsolvencyEvent();

            state._fsp--;

             after(grammarAccess.getOnInsolvencyEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOnInsolvencyEvent"


    // $ANTLR start "ruleOnInsolvencyEvent"
    // InternalPactDSL.g:862:1: ruleOnInsolvencyEvent : ( ( rule__OnInsolvencyEvent__Group__0 ) ) ;
    public final void ruleOnInsolvencyEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:866:2: ( ( ( rule__OnInsolvencyEvent__Group__0 ) ) )
            // InternalPactDSL.g:867:2: ( ( rule__OnInsolvencyEvent__Group__0 ) )
            {
            // InternalPactDSL.g:867:2: ( ( rule__OnInsolvencyEvent__Group__0 ) )
            // InternalPactDSL.g:868:3: ( rule__OnInsolvencyEvent__Group__0 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getGroup()); 
            // InternalPactDSL.g:869:3: ( rule__OnInsolvencyEvent__Group__0 )
            // InternalPactDSL.g:869:4: rule__OnInsolvencyEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnInsolvencyEvent"


    // $ANTLR start "entryRuleCustomTermination"
    // InternalPactDSL.g:878:1: entryRuleCustomTermination : ruleCustomTermination EOF ;
    public final void entryRuleCustomTermination() throws RecognitionException {
        try {
            // InternalPactDSL.g:879:1: ( ruleCustomTermination EOF )
            // InternalPactDSL.g:880:1: ruleCustomTermination EOF
            {
             before(grammarAccess.getCustomTerminationRule()); 
            pushFollow(FOLLOW_1);
            ruleCustomTermination();

            state._fsp--;

             after(grammarAccess.getCustomTerminationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCustomTermination"


    // $ANTLR start "ruleCustomTermination"
    // InternalPactDSL.g:887:1: ruleCustomTermination : ( ( rule__CustomTermination__Group__0 ) ) ;
    public final void ruleCustomTermination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:891:2: ( ( ( rule__CustomTermination__Group__0 ) ) )
            // InternalPactDSL.g:892:2: ( ( rule__CustomTermination__Group__0 ) )
            {
            // InternalPactDSL.g:892:2: ( ( rule__CustomTermination__Group__0 ) )
            // InternalPactDSL.g:893:3: ( rule__CustomTermination__Group__0 )
            {
             before(grammarAccess.getCustomTerminationAccess().getGroup()); 
            // InternalPactDSL.g:894:3: ( rule__CustomTermination__Group__0 )
            // InternalPactDSL.g:894:4: rule__CustomTermination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCustomTermination"


    // $ANTLR start "entryRuleBoilerplateType"
    // InternalPactDSL.g:903:1: entryRuleBoilerplateType : ruleBoilerplateType EOF ;
    public final void entryRuleBoilerplateType() throws RecognitionException {
        try {
            // InternalPactDSL.g:904:1: ( ruleBoilerplateType EOF )
            // InternalPactDSL.g:905:1: ruleBoilerplateType EOF
            {
             before(grammarAccess.getBoilerplateTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBoilerplateType();

            state._fsp--;

             after(grammarAccess.getBoilerplateTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoilerplateType"


    // $ANTLR start "ruleBoilerplateType"
    // InternalPactDSL.g:912:1: ruleBoilerplateType : ( ( rule__BoilerplateType__Alternatives ) ) ;
    public final void ruleBoilerplateType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:916:2: ( ( ( rule__BoilerplateType__Alternatives ) ) )
            // InternalPactDSL.g:917:2: ( ( rule__BoilerplateType__Alternatives ) )
            {
            // InternalPactDSL.g:917:2: ( ( rule__BoilerplateType__Alternatives ) )
            // InternalPactDSL.g:918:3: ( rule__BoilerplateType__Alternatives )
            {
             before(grammarAccess.getBoilerplateTypeAccess().getAlternatives()); 
            // InternalPactDSL.g:919:3: ( rule__BoilerplateType__Alternatives )
            // InternalPactDSL.g:919:4: rule__BoilerplateType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoilerplateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoilerplateTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoilerplateType"


    // $ANTLR start "entryRuleApplicableLaw"
    // InternalPactDSL.g:928:1: entryRuleApplicableLaw : ruleApplicableLaw EOF ;
    public final void entryRuleApplicableLaw() throws RecognitionException {
        try {
            // InternalPactDSL.g:929:1: ( ruleApplicableLaw EOF )
            // InternalPactDSL.g:930:1: ruleApplicableLaw EOF
            {
             before(grammarAccess.getApplicableLawRule()); 
            pushFollow(FOLLOW_1);
            ruleApplicableLaw();

            state._fsp--;

             after(grammarAccess.getApplicableLawRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleApplicableLaw"


    // $ANTLR start "ruleApplicableLaw"
    // InternalPactDSL.g:937:1: ruleApplicableLaw : ( ( rule__ApplicableLaw__Group__0 ) ) ;
    public final void ruleApplicableLaw() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:941:2: ( ( ( rule__ApplicableLaw__Group__0 ) ) )
            // InternalPactDSL.g:942:2: ( ( rule__ApplicableLaw__Group__0 ) )
            {
            // InternalPactDSL.g:942:2: ( ( rule__ApplicableLaw__Group__0 ) )
            // InternalPactDSL.g:943:3: ( rule__ApplicableLaw__Group__0 )
            {
             before(grammarAccess.getApplicableLawAccess().getGroup()); 
            // InternalPactDSL.g:944:3: ( rule__ApplicableLaw__Group__0 )
            // InternalPactDSL.g:944:4: rule__ApplicableLaw__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicableLawAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApplicableLaw"


    // $ANTLR start "entryRuleJurisdiction"
    // InternalPactDSL.g:953:1: entryRuleJurisdiction : ruleJurisdiction EOF ;
    public final void entryRuleJurisdiction() throws RecognitionException {
        try {
            // InternalPactDSL.g:954:1: ( ruleJurisdiction EOF )
            // InternalPactDSL.g:955:1: ruleJurisdiction EOF
            {
             before(grammarAccess.getJurisdictionRule()); 
            pushFollow(FOLLOW_1);
            ruleJurisdiction();

            state._fsp--;

             after(grammarAccess.getJurisdictionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleJurisdiction"


    // $ANTLR start "ruleJurisdiction"
    // InternalPactDSL.g:962:1: ruleJurisdiction : ( ( rule__Jurisdiction__Group__0 ) ) ;
    public final void ruleJurisdiction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:966:2: ( ( ( rule__Jurisdiction__Group__0 ) ) )
            // InternalPactDSL.g:967:2: ( ( rule__Jurisdiction__Group__0 ) )
            {
            // InternalPactDSL.g:967:2: ( ( rule__Jurisdiction__Group__0 ) )
            // InternalPactDSL.g:968:3: ( rule__Jurisdiction__Group__0 )
            {
             before(grammarAccess.getJurisdictionAccess().getGroup()); 
            // InternalPactDSL.g:969:3: ( rule__Jurisdiction__Group__0 )
            // InternalPactDSL.g:969:4: rule__Jurisdiction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJurisdictionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJurisdiction"


    // $ANTLR start "entryRuleNotices"
    // InternalPactDSL.g:978:1: entryRuleNotices : ruleNotices EOF ;
    public final void entryRuleNotices() throws RecognitionException {
        try {
            // InternalPactDSL.g:979:1: ( ruleNotices EOF )
            // InternalPactDSL.g:980:1: ruleNotices EOF
            {
             before(grammarAccess.getNoticesRule()); 
            pushFollow(FOLLOW_1);
            ruleNotices();

            state._fsp--;

             after(grammarAccess.getNoticesRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNotices"


    // $ANTLR start "ruleNotices"
    // InternalPactDSL.g:987:1: ruleNotices : ( ( rule__Notices__Group__0 ) ) ;
    public final void ruleNotices() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:991:2: ( ( ( rule__Notices__Group__0 ) ) )
            // InternalPactDSL.g:992:2: ( ( rule__Notices__Group__0 ) )
            {
            // InternalPactDSL.g:992:2: ( ( rule__Notices__Group__0 ) )
            // InternalPactDSL.g:993:3: ( rule__Notices__Group__0 )
            {
             before(grammarAccess.getNoticesAccess().getGroup()); 
            // InternalPactDSL.g:994:3: ( rule__Notices__Group__0 )
            // InternalPactDSL.g:994:4: rule__Notices__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Notices__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoticesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotices"


    // $ANTLR start "rule__EntityType__Alternatives"
    // InternalPactDSL.g:1002:1: rule__EntityType__Alternatives : ( ( ruleEffectiveDate ) | ( ruleParty ) | ( ruleThirdParty ) | ( ruleSubjectMatter ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1006:1: ( ( ruleEffectiveDate ) | ( ruleParty ) | ( ruleThirdParty ) | ( ruleSubjectMatter ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
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
                    // InternalPactDSL.g:1007:2: ( ruleEffectiveDate )
                    {
                    // InternalPactDSL.g:1007:2: ( ruleEffectiveDate )
                    // InternalPactDSL.g:1008:3: ruleEffectiveDate
                    {
                     before(grammarAccess.getEntityTypeAccess().getEffectiveDateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEffectiveDate();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getEffectiveDateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1013:2: ( ruleParty )
                    {
                    // InternalPactDSL.g:1013:2: ( ruleParty )
                    // InternalPactDSL.g:1014:3: ruleParty
                    {
                     before(grammarAccess.getEntityTypeAccess().getPartyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParty();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getPartyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1019:2: ( ruleThirdParty )
                    {
                    // InternalPactDSL.g:1019:2: ( ruleThirdParty )
                    // InternalPactDSL.g:1020:3: ruleThirdParty
                    {
                     before(grammarAccess.getEntityTypeAccess().getThirdPartyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleThirdParty();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getThirdPartyParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1025:2: ( ruleSubjectMatter )
                    {
                    // InternalPactDSL.g:1025:2: ( ruleSubjectMatter )
                    // InternalPactDSL.g:1026:3: ruleSubjectMatter
                    {
                     before(grammarAccess.getEntityTypeAccess().getSubjectMatterParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSubjectMatter();

                    state._fsp--;

                     after(grammarAccess.getEntityTypeAccess().getSubjectMatterParserRuleCall_3()); 

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
    // $ANTLR end "rule__EntityType__Alternatives"


    // $ANTLR start "rule__FormalityType__Alternatives"
    // InternalPactDSL.g:1035:1: rule__FormalityType__Alternatives : ( ( ruleInWriting ) | ( ruleByEmail ) | ( ruleGivingNotice ) | ( ruleCustomFormality ) );
    public final void rule__FormalityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1039:1: ( ( ruleInWriting ) | ( ruleByEmail ) | ( ruleGivingNotice ) | ( ruleCustomFormality ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 40:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPactDSL.g:1040:2: ( ruleInWriting )
                    {
                    // InternalPactDSL.g:1040:2: ( ruleInWriting )
                    // InternalPactDSL.g:1041:3: ruleInWriting
                    {
                     before(grammarAccess.getFormalityTypeAccess().getInWritingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInWriting();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getInWritingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1046:2: ( ruleByEmail )
                    {
                    // InternalPactDSL.g:1046:2: ( ruleByEmail )
                    // InternalPactDSL.g:1047:3: ruleByEmail
                    {
                     before(grammarAccess.getFormalityTypeAccess().getByEmailParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleByEmail();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getByEmailParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1052:2: ( ruleGivingNotice )
                    {
                    // InternalPactDSL.g:1052:2: ( ruleGivingNotice )
                    // InternalPactDSL.g:1053:3: ruleGivingNotice
                    {
                     before(grammarAccess.getFormalityTypeAccess().getGivingNoticeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleGivingNotice();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getGivingNoticeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1058:2: ( ruleCustomFormality )
                    {
                    // InternalPactDSL.g:1058:2: ( ruleCustomFormality )
                    // InternalPactDSL.g:1059:3: ruleCustomFormality
                    {
                     before(grammarAccess.getFormalityTypeAccess().getCustomFormalityParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomFormality();

                    state._fsp--;

                     after(grammarAccess.getFormalityTypeAccess().getCustomFormalityParserRuleCall_3()); 

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
    // $ANTLR end "rule__FormalityType__Alternatives"


    // $ANTLR start "rule__ActionType__Alternatives"
    // InternalPactDSL.g:1068:1: rule__ActionType__Alternatives : ( ( ruleGivenConsent ) | ( ruleGivenWrittenConsent ) );
    public final void rule__ActionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1072:1: ( ( ruleGivenConsent ) | ( ruleGivenWrittenConsent ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==41) ) {
                    alt3=1;
                }
                else if ( (LA3_1==42) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPactDSL.g:1073:2: ( ruleGivenConsent )
                    {
                    // InternalPactDSL.g:1073:2: ( ruleGivenConsent )
                    // InternalPactDSL.g:1074:3: ruleGivenConsent
                    {
                     before(grammarAccess.getActionTypeAccess().getGivenConsentParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGivenConsent();

                    state._fsp--;

                     after(grammarAccess.getActionTypeAccess().getGivenConsentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1079:2: ( ruleGivenWrittenConsent )
                    {
                    // InternalPactDSL.g:1079:2: ( ruleGivenWrittenConsent )
                    // InternalPactDSL.g:1080:3: ruleGivenWrittenConsent
                    {
                     before(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGivenWrittenConsent();

                    state._fsp--;

                     after(grammarAccess.getActionTypeAccess().getGivenWrittenConsentParserRuleCall_1()); 

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
    // $ANTLR end "rule__ActionType__Alternatives"


    // $ANTLR start "rule__StateType__Alternatives"
    // InternalPactDSL.g:1089:1: rule__StateType__Alternatives : ( ( ruleOwnership ) | ( ruleRightToUse ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1093:1: ( ( ruleOwnership ) | ( ruleRightToUse ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=13 && LA4_1<=14)) ) {
                    alt4=2;
                }
                else if ( ((LA4_1>=11 && LA4_1<=12)) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPactDSL.g:1094:2: ( ruleOwnership )
                    {
                    // InternalPactDSL.g:1094:2: ( ruleOwnership )
                    // InternalPactDSL.g:1095:3: ruleOwnership
                    {
                     before(grammarAccess.getStateTypeAccess().getOwnershipParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOwnership();

                    state._fsp--;

                     after(grammarAccess.getStateTypeAccess().getOwnershipParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1100:2: ( ruleRightToUse )
                    {
                    // InternalPactDSL.g:1100:2: ( ruleRightToUse )
                    // InternalPactDSL.g:1101:3: ruleRightToUse
                    {
                     before(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightToUse();

                    state._fsp--;

                     after(grammarAccess.getStateTypeAccess().getRightToUseParserRuleCall_1()); 

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
    // $ANTLR end "rule__StateType__Alternatives"


    // $ANTLR start "rule__Ownership__Alternatives_1"
    // InternalPactDSL.g:1110:1: rule__Ownership__Alternatives_1 : ( ( 'owns' ) | ( 'willReturn' ) );
    public final void rule__Ownership__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1114:1: ( ( 'owns' ) | ( 'willReturn' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPactDSL.g:1115:2: ( 'owns' )
                    {
                    // InternalPactDSL.g:1115:2: ( 'owns' )
                    // InternalPactDSL.g:1116:3: 'owns'
                    {
                     before(grammarAccess.getOwnershipAccess().getOwnsKeyword_1_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOwnershipAccess().getOwnsKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1121:2: ( 'willReturn' )
                    {
                    // InternalPactDSL.g:1121:2: ( 'willReturn' )
                    // InternalPactDSL.g:1122:3: 'willReturn'
                    {
                     before(grammarAccess.getOwnershipAccess().getWillReturnKeyword_1_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOwnershipAccess().getWillReturnKeyword_1_1()); 

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
    // $ANTLR end "rule__Ownership__Alternatives_1"


    // $ANTLR start "rule__RightToUse__Alternatives_1"
    // InternalPactDSL.g:1131:1: rule__RightToUse__Alternatives_1 : ( ( 'mayUse' ) | ( 'mayNotUse' ) );
    public final void rule__RightToUse__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1135:1: ( ( 'mayUse' ) | ( 'mayNotUse' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPactDSL.g:1136:2: ( 'mayUse' )
                    {
                    // InternalPactDSL.g:1136:2: ( 'mayUse' )
                    // InternalPactDSL.g:1137:3: 'mayUse'
                    {
                     before(grammarAccess.getRightToUseAccess().getMayUseKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRightToUseAccess().getMayUseKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1142:2: ( 'mayNotUse' )
                    {
                    // InternalPactDSL.g:1142:2: ( 'mayNotUse' )
                    // InternalPactDSL.g:1143:3: 'mayNotUse'
                    {
                     before(grammarAccess.getRightToUseAccess().getMayNotUseKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRightToUseAccess().getMayNotUseKeyword_1_1()); 

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
    // $ANTLR end "rule__RightToUse__Alternatives_1"


    // $ANTLR start "rule__PrimaryObligationType__Alternatives"
    // InternalPactDSL.g:1152:1: rule__PrimaryObligationType__Alternatives : ( ( rulePaymentObligation ) | ( ruleDeliveryObligation ) | ( ruleTransferObligation ) | ( ruleLicenceObligation ) | ( ruleConstraintParty ) | ( ruleConstraintThirdParty ) | ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) ) );
    public final void rule__PrimaryObligationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1156:1: ( ( rulePaymentObligation ) | ( ruleDeliveryObligation ) | ( ruleTransferObligation ) | ( ruleLicenceObligation ) | ( ruleConstraintParty ) | ( ruleConstraintThirdParty ) | ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt7=1;
                }
                break;
            case 48:
                {
                alt7=2;
                }
                break;
            case 50:
                {
                alt7=3;
                }
                break;
            case 52:
                {
                alt7=4;
                }
                break;
            case 56:
                {
                alt7=5;
                }
                break;
            case 58:
                {
                alt7=6;
                }
                break;
            case RULE_STRING:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalPactDSL.g:1157:2: ( rulePaymentObligation )
                    {
                    // InternalPactDSL.g:1157:2: ( rulePaymentObligation )
                    // InternalPactDSL.g:1158:3: rulePaymentObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getPaymentObligationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePaymentObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getPaymentObligationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1163:2: ( ruleDeliveryObligation )
                    {
                    // InternalPactDSL.g:1163:2: ( ruleDeliveryObligation )
                    // InternalPactDSL.g:1164:3: ruleDeliveryObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getDeliveryObligationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeliveryObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getDeliveryObligationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1169:2: ( ruleTransferObligation )
                    {
                    // InternalPactDSL.g:1169:2: ( ruleTransferObligation )
                    // InternalPactDSL.g:1170:3: ruleTransferObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getTransferObligationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTransferObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getTransferObligationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1175:2: ( ruleLicenceObligation )
                    {
                    // InternalPactDSL.g:1175:2: ( ruleLicenceObligation )
                    // InternalPactDSL.g:1176:3: ruleLicenceObligation
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getLicenceObligationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleLicenceObligation();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getLicenceObligationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:1181:2: ( ruleConstraintParty )
                    {
                    // InternalPactDSL.g:1181:2: ( ruleConstraintParty )
                    // InternalPactDSL.g:1182:3: ruleConstraintParty
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getConstraintPartyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraintParty();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getConstraintPartyParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalPactDSL.g:1187:2: ( ruleConstraintThirdParty )
                    {
                    // InternalPactDSL.g:1187:2: ( ruleConstraintThirdParty )
                    // InternalPactDSL.g:1188:3: ruleConstraintThirdParty
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getConstraintThirdPartyParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraintThirdParty();

                    state._fsp--;

                     after(grammarAccess.getPrimaryObligationTypeAccess().getConstraintThirdPartyParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalPactDSL.g:1193:2: ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) )
                    {
                    // InternalPactDSL.g:1193:2: ( ( rule__PrimaryObligationType__CustomObligationAssignment_6 ) )
                    // InternalPactDSL.g:1194:3: ( rule__PrimaryObligationType__CustomObligationAssignment_6 )
                    {
                     before(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationAssignment_6()); 
                    // InternalPactDSL.g:1195:3: ( rule__PrimaryObligationType__CustomObligationAssignment_6 )
                    // InternalPactDSL.g:1195:4: rule__PrimaryObligationType__CustomObligationAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryObligationType__CustomObligationAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationAssignment_6()); 

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
    // $ANTLR end "rule__PrimaryObligationType__Alternatives"


    // $ANTLR start "rule__TerminationType__Alternatives"
    // InternalPactDSL.g:1203:1: rule__TerminationType__Alternatives : ( ( ruleForConvenience ) | ( ruleOnReasonableNotice ) | ( ruleForBreach ) | ( ruleOnInsolvencyEvent ) | ( ruleCustomTermination ) );
    public final void rule__TerminationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1207:1: ( ( ruleForConvenience ) | ( ruleOnReasonableNotice ) | ( ruleForBreach ) | ( ruleOnInsolvencyEvent ) | ( ruleCustomTermination ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt8=1;
                }
                break;
            case 65:
                {
                alt8=2;
                }
                break;
            case 66:
                {
                alt8=3;
                }
                break;
            case 68:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPactDSL.g:1208:2: ( ruleForConvenience )
                    {
                    // InternalPactDSL.g:1208:2: ( ruleForConvenience )
                    // InternalPactDSL.g:1209:3: ruleForConvenience
                    {
                     before(grammarAccess.getTerminationTypeAccess().getForConvenienceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForConvenience();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getForConvenienceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1214:2: ( ruleOnReasonableNotice )
                    {
                    // InternalPactDSL.g:1214:2: ( ruleOnReasonableNotice )
                    // InternalPactDSL.g:1215:3: ruleOnReasonableNotice
                    {
                     before(grammarAccess.getTerminationTypeAccess().getOnReasonableNoticeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOnReasonableNotice();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getOnReasonableNoticeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1220:2: ( ruleForBreach )
                    {
                    // InternalPactDSL.g:1220:2: ( ruleForBreach )
                    // InternalPactDSL.g:1221:3: ruleForBreach
                    {
                     before(grammarAccess.getTerminationTypeAccess().getForBreachParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleForBreach();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getForBreachParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPactDSL.g:1226:2: ( ruleOnInsolvencyEvent )
                    {
                    // InternalPactDSL.g:1226:2: ( ruleOnInsolvencyEvent )
                    // InternalPactDSL.g:1227:3: ruleOnInsolvencyEvent
                    {
                     before(grammarAccess.getTerminationTypeAccess().getOnInsolvencyEventParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOnInsolvencyEvent();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getOnInsolvencyEventParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalPactDSL.g:1232:2: ( ruleCustomTermination )
                    {
                    // InternalPactDSL.g:1232:2: ( ruleCustomTermination )
                    // InternalPactDSL.g:1233:3: ruleCustomTermination
                    {
                     before(grammarAccess.getTerminationTypeAccess().getCustomTerminationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleCustomTermination();

                    state._fsp--;

                     after(grammarAccess.getTerminationTypeAccess().getCustomTerminationParserRuleCall_4()); 

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
    // $ANTLR end "rule__TerminationType__Alternatives"


    // $ANTLR start "rule__BoilerplateType__Alternatives"
    // InternalPactDSL.g:1242:1: rule__BoilerplateType__Alternatives : ( ( ruleApplicableLaw ) | ( ruleJurisdiction ) | ( ruleNotices ) );
    public final void rule__BoilerplateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1246:1: ( ( ruleApplicableLaw ) | ( ruleJurisdiction ) | ( ruleNotices ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt9=1;
                }
                break;
            case 71:
                {
                alt9=2;
                }
                break;
            case 72:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalPactDSL.g:1247:2: ( ruleApplicableLaw )
                    {
                    // InternalPactDSL.g:1247:2: ( ruleApplicableLaw )
                    // InternalPactDSL.g:1248:3: ruleApplicableLaw
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getApplicableLawParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleApplicableLaw();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getApplicableLawParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPactDSL.g:1253:2: ( ruleJurisdiction )
                    {
                    // InternalPactDSL.g:1253:2: ( ruleJurisdiction )
                    // InternalPactDSL.g:1254:3: ruleJurisdiction
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getJurisdictionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJurisdiction();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getJurisdictionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPactDSL.g:1259:2: ( ruleNotices )
                    {
                    // InternalPactDSL.g:1259:2: ( ruleNotices )
                    // InternalPactDSL.g:1260:3: ruleNotices
                    {
                     before(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNotices();

                    state._fsp--;

                     after(grammarAccess.getBoilerplateTypeAccess().getNoticesParserRuleCall_2()); 

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
    // $ANTLR end "rule__BoilerplateType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalPactDSL.g:1269:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1273:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalPactDSL.g:1274:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalPactDSL.g:1281:1: rule__Model__Group__0__Impl : ( 'ContractName:' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1285:1: ( ( 'ContractName:' ) )
            // InternalPactDSL.g:1286:1: ( 'ContractName:' )
            {
            // InternalPactDSL.g:1286:1: ( 'ContractName:' )
            // InternalPactDSL.g:1287:2: 'ContractName:'
            {
             before(grammarAccess.getModelAccess().getContractNameKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getContractNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalPactDSL.g:1296:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1300:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalPactDSL.g:1301:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalPactDSL.g:1308:1: rule__Model__Group__1__Impl : ( ( rule__Model__TitleAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1312:1: ( ( ( rule__Model__TitleAssignment_1 ) ) )
            // InternalPactDSL.g:1313:1: ( ( rule__Model__TitleAssignment_1 ) )
            {
            // InternalPactDSL.g:1313:1: ( ( rule__Model__TitleAssignment_1 ) )
            // InternalPactDSL.g:1314:2: ( rule__Model__TitleAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getTitleAssignment_1()); 
            // InternalPactDSL.g:1315:2: ( rule__Model__TitleAssignment_1 )
            // InternalPactDSL.g:1315:3: rule__Model__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalPactDSL.g:1323:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1327:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalPactDSL.g:1328:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalPactDSL.g:1335:1: rule__Model__Group__2__Impl : ( ( ( '.' ) ) ( ( '.' )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1339:1: ( ( ( ( '.' ) ) ( ( '.' )* ) ) )
            // InternalPactDSL.g:1340:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            {
            // InternalPactDSL.g:1340:1: ( ( ( '.' ) ) ( ( '.' )* ) )
            // InternalPactDSL.g:1341:2: ( ( '.' ) ) ( ( '.' )* )
            {
            // InternalPactDSL.g:1341:2: ( ( '.' ) )
            // InternalPactDSL.g:1342:3: ( '.' )
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2()); 
            // InternalPactDSL.g:1343:3: ( '.' )
            // InternalPactDSL.g:1343:4: '.'
            {
            match(input,16,FOLLOW_6); 

            }

             after(grammarAccess.getModelAccess().getFullStopKeyword_2()); 

            }

            // InternalPactDSL.g:1346:2: ( ( '.' )* )
            // InternalPactDSL.g:1347:3: ( '.' )*
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_2()); 
            // InternalPactDSL.g:1348:3: ( '.' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalPactDSL.g:1348:4: '.'
            	    {
            	    match(input,16,FOLLOW_6); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalPactDSL.g:1357:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1361:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalPactDSL.g:1362:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalPactDSL.g:1369:1: rule__Model__Group__3__Impl : ( 'Entities:' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1373:1: ( ( 'Entities:' ) )
            // InternalPactDSL.g:1374:1: ( 'Entities:' )
            {
            // InternalPactDSL.g:1374:1: ( 'Entities:' )
            // InternalPactDSL.g:1375:2: 'Entities:'
            {
             before(grammarAccess.getModelAccess().getEntitiesKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getEntitiesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalPactDSL.g:1384:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1388:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalPactDSL.g:1389:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalPactDSL.g:1396:1: rule__Model__Group__4__Impl : ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1400:1: ( ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) ) )
            // InternalPactDSL.g:1401:1: ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) )
            {
            // InternalPactDSL.g:1401:1: ( ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* ) )
            // InternalPactDSL.g:1402:2: ( ( rule__Model__Group_4__0 ) ) ( ( rule__Model__Group_4__0 )* )
            {
            // InternalPactDSL.g:1402:2: ( ( rule__Model__Group_4__0 ) )
            // InternalPactDSL.g:1403:3: ( rule__Model__Group_4__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalPactDSL.g:1404:3: ( rule__Model__Group_4__0 )
            // InternalPactDSL.g:1404:4: rule__Model__Group_4__0
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }

            // InternalPactDSL.g:1407:2: ( ( rule__Model__Group_4__0 )* )
            // InternalPactDSL.g:1408:3: ( rule__Model__Group_4__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalPactDSL.g:1409:3: ( rule__Model__Group_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=26 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalPactDSL.g:1409:4: rule__Model__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Model__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalPactDSL.g:1418:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1422:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalPactDSL.g:1423:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalPactDSL.g:1430:1: rule__Model__Group__5__Impl : ( ( 'Formalities:' )? ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1434:1: ( ( ( 'Formalities:' )? ) )
            // InternalPactDSL.g:1435:1: ( ( 'Formalities:' )? )
            {
            // InternalPactDSL.g:1435:1: ( ( 'Formalities:' )? )
            // InternalPactDSL.g:1436:2: ( 'Formalities:' )?
            {
             before(grammarAccess.getModelAccess().getFormalitiesKeyword_5()); 
            // InternalPactDSL.g:1437:2: ( 'Formalities:' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPactDSL.g:1437:3: 'Formalities:'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getFormalitiesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalPactDSL.g:1445:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1449:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalPactDSL.g:1450:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalPactDSL.g:1457:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1461:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // InternalPactDSL.g:1462:1: ( ( rule__Model__Group_6__0 )* )
            {
            // InternalPactDSL.g:1462:1: ( ( rule__Model__Group_6__0 )* )
            // InternalPactDSL.g:1463:2: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // InternalPactDSL.g:1464:2: ( rule__Model__Group_6__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=34 && LA13_0<=35)||LA13_0==37||LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPactDSL.g:1464:3: rule__Model__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalPactDSL.g:1472:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1476:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalPactDSL.g:1477:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalPactDSL.g:1484:1: rule__Model__Group__7__Impl : ( ( 'Actions:' )? ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1488:1: ( ( ( 'Actions:' )? ) )
            // InternalPactDSL.g:1489:1: ( ( 'Actions:' )? )
            {
            // InternalPactDSL.g:1489:1: ( ( 'Actions:' )? )
            // InternalPactDSL.g:1490:2: ( 'Actions:' )?
            {
             before(grammarAccess.getModelAccess().getActionsKeyword_7()); 
            // InternalPactDSL.g:1491:2: ( 'Actions:' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalPactDSL.g:1491:3: 'Actions:'
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getActionsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalPactDSL.g:1499:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1503:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // InternalPactDSL.g:1504:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalPactDSL.g:1511:1: rule__Model__Group__8__Impl : ( ( rule__Model__Group_8__0 )* ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1515:1: ( ( ( rule__Model__Group_8__0 )* ) )
            // InternalPactDSL.g:1516:1: ( ( rule__Model__Group_8__0 )* )
            {
            // InternalPactDSL.g:1516:1: ( ( rule__Model__Group_8__0 )* )
            // InternalPactDSL.g:1517:2: ( rule__Model__Group_8__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_8()); 
            // InternalPactDSL.g:1518:2: ( rule__Model__Group_8__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=41 && LA15_2<=42)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalPactDSL.g:1518:3: rule__Model__Group_8__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // InternalPactDSL.g:1526:1: rule__Model__Group__9 : rule__Model__Group__9__Impl rule__Model__Group__10 ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1530:1: ( rule__Model__Group__9__Impl rule__Model__Group__10 )
            // InternalPactDSL.g:1531:2: rule__Model__Group__9__Impl rule__Model__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // InternalPactDSL.g:1538:1: rule__Model__Group__9__Impl : ( ( 'StateOnSignature:' )? ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1542:1: ( ( ( 'StateOnSignature:' )? ) )
            // InternalPactDSL.g:1543:1: ( ( 'StateOnSignature:' )? )
            {
            // InternalPactDSL.g:1543:1: ( ( 'StateOnSignature:' )? )
            // InternalPactDSL.g:1544:2: ( 'StateOnSignature:' )?
            {
             before(grammarAccess.getModelAccess().getStateOnSignatureKeyword_9()); 
            // InternalPactDSL.g:1545:2: ( 'StateOnSignature:' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalPactDSL.g:1545:3: 'StateOnSignature:'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getStateOnSignatureKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group__10"
    // InternalPactDSL.g:1553:1: rule__Model__Group__10 : rule__Model__Group__10__Impl rule__Model__Group__11 ;
    public final void rule__Model__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1557:1: ( rule__Model__Group__10__Impl rule__Model__Group__11 )
            // InternalPactDSL.g:1558:2: rule__Model__Group__10__Impl rule__Model__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10"


    // $ANTLR start "rule__Model__Group__10__Impl"
    // InternalPactDSL.g:1565:1: rule__Model__Group__10__Impl : ( ( rule__Model__Group_10__0 )* ) ;
    public final void rule__Model__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1569:1: ( ( ( rule__Model__Group_10__0 )* ) )
            // InternalPactDSL.g:1570:1: ( ( rule__Model__Group_10__0 )* )
            {
            // InternalPactDSL.g:1570:1: ( ( rule__Model__Group_10__0 )* )
            // InternalPactDSL.g:1571:2: ( rule__Model__Group_10__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_10()); 
            // InternalPactDSL.g:1572:2: ( rule__Model__Group_10__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPactDSL.g:1572:3: rule__Model__Group_10__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__10__Impl"


    // $ANTLR start "rule__Model__Group__11"
    // InternalPactDSL.g:1580:1: rule__Model__Group__11 : rule__Model__Group__11__Impl rule__Model__Group__12 ;
    public final void rule__Model__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1584:1: ( rule__Model__Group__11__Impl rule__Model__Group__12 )
            // InternalPactDSL.g:1585:2: rule__Model__Group__11__Impl rule__Model__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11"


    // $ANTLR start "rule__Model__Group__11__Impl"
    // InternalPactDSL.g:1592:1: rule__Model__Group__11__Impl : ( 'PrimaryObligations:' ) ;
    public final void rule__Model__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1596:1: ( ( 'PrimaryObligations:' ) )
            // InternalPactDSL.g:1597:1: ( 'PrimaryObligations:' )
            {
            // InternalPactDSL.g:1597:1: ( 'PrimaryObligations:' )
            // InternalPactDSL.g:1598:2: 'PrimaryObligations:'
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getPrimaryObligationsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__11__Impl"


    // $ANTLR start "rule__Model__Group__12"
    // InternalPactDSL.g:1607:1: rule__Model__Group__12 : rule__Model__Group__12__Impl rule__Model__Group__13 ;
    public final void rule__Model__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1611:1: ( rule__Model__Group__12__Impl rule__Model__Group__13 )
            // InternalPactDSL.g:1612:2: rule__Model__Group__12__Impl rule__Model__Group__13
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__12"


    // $ANTLR start "rule__Model__Group__12__Impl"
    // InternalPactDSL.g:1619:1: rule__Model__Group__12__Impl : ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) ) ;
    public final void rule__Model__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1623:1: ( ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) ) )
            // InternalPactDSL.g:1624:1: ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) )
            {
            // InternalPactDSL.g:1624:1: ( ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* ) )
            // InternalPactDSL.g:1625:2: ( ( rule__Model__Group_12__0 ) ) ( ( rule__Model__Group_12__0 )* )
            {
            // InternalPactDSL.g:1625:2: ( ( rule__Model__Group_12__0 ) )
            // InternalPactDSL.g:1626:3: ( rule__Model__Group_12__0 )
            {
             before(grammarAccess.getModelAccess().getGroup_12()); 
            // InternalPactDSL.g:1627:3: ( rule__Model__Group_12__0 )
            // InternalPactDSL.g:1627:4: rule__Model__Group_12__0
            {
            pushFollow(FOLLOW_14);
            rule__Model__Group_12__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup_12()); 

            }

            // InternalPactDSL.g:1630:2: ( ( rule__Model__Group_12__0 )* )
            // InternalPactDSL.g:1631:3: ( rule__Model__Group_12__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_12()); 
            // InternalPactDSL.g:1632:3: ( rule__Model__Group_12__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||LA18_0==43||LA18_0==48||LA18_0==50||LA18_0==52||LA18_0==56||LA18_0==58) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPactDSL.g:1632:4: rule__Model__Group_12__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Model__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Model__Group__12__Impl"


    // $ANTLR start "rule__Model__Group__13"
    // InternalPactDSL.g:1641:1: rule__Model__Group__13 : rule__Model__Group__13__Impl rule__Model__Group__14 ;
    public final void rule__Model__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1645:1: ( rule__Model__Group__13__Impl rule__Model__Group__14 )
            // InternalPactDSL.g:1646:2: rule__Model__Group__13__Impl rule__Model__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13"


    // $ANTLR start "rule__Model__Group__13__Impl"
    // InternalPactDSL.g:1653:1: rule__Model__Group__13__Impl : ( ( 'StateAfterObligationsDischarged:' )? ) ;
    public final void rule__Model__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1657:1: ( ( ( 'StateAfterObligationsDischarged:' )? ) )
            // InternalPactDSL.g:1658:1: ( ( 'StateAfterObligationsDischarged:' )? )
            {
            // InternalPactDSL.g:1658:1: ( ( 'StateAfterObligationsDischarged:' )? )
            // InternalPactDSL.g:1659:2: ( 'StateAfterObligationsDischarged:' )?
            {
             before(grammarAccess.getModelAccess().getStateAfterObligationsDischargedKeyword_13()); 
            // InternalPactDSL.g:1660:2: ( 'StateAfterObligationsDischarged:' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPactDSL.g:1660:3: 'StateAfterObligationsDischarged:'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getStateAfterObligationsDischargedKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__13__Impl"


    // $ANTLR start "rule__Model__Group__14"
    // InternalPactDSL.g:1668:1: rule__Model__Group__14 : rule__Model__Group__14__Impl rule__Model__Group__15 ;
    public final void rule__Model__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1672:1: ( rule__Model__Group__14__Impl rule__Model__Group__15 )
            // InternalPactDSL.g:1673:2: rule__Model__Group__14__Impl rule__Model__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__Model__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__14"


    // $ANTLR start "rule__Model__Group__14__Impl"
    // InternalPactDSL.g:1680:1: rule__Model__Group__14__Impl : ( ( rule__Model__Group_14__0 )* ) ;
    public final void rule__Model__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1684:1: ( ( ( rule__Model__Group_14__0 )* ) )
            // InternalPactDSL.g:1685:1: ( ( rule__Model__Group_14__0 )* )
            {
            // InternalPactDSL.g:1685:1: ( ( rule__Model__Group_14__0 )* )
            // InternalPactDSL.g:1686:2: ( rule__Model__Group_14__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_14()); 
            // InternalPactDSL.g:1687:2: ( rule__Model__Group_14__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalPactDSL.g:1687:3: rule__Model__Group_14__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__14__Impl"


    // $ANTLR start "rule__Model__Group__15"
    // InternalPactDSL.g:1695:1: rule__Model__Group__15 : rule__Model__Group__15__Impl rule__Model__Group__16 ;
    public final void rule__Model__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1699:1: ( rule__Model__Group__15__Impl rule__Model__Group__16 )
            // InternalPactDSL.g:1700:2: rule__Model__Group__15__Impl rule__Model__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__15"


    // $ANTLR start "rule__Model__Group__15__Impl"
    // InternalPactDSL.g:1707:1: rule__Model__Group__15__Impl : ( 'Termination:' ) ;
    public final void rule__Model__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1711:1: ( ( 'Termination:' ) )
            // InternalPactDSL.g:1712:1: ( 'Termination:' )
            {
            // InternalPactDSL.g:1712:1: ( 'Termination:' )
            // InternalPactDSL.g:1713:2: 'Termination:'
            {
             before(grammarAccess.getModelAccess().getTerminationKeyword_15()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getTerminationKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__15__Impl"


    // $ANTLR start "rule__Model__Group__16"
    // InternalPactDSL.g:1722:1: rule__Model__Group__16 : rule__Model__Group__16__Impl rule__Model__Group__17 ;
    public final void rule__Model__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1726:1: ( rule__Model__Group__16__Impl rule__Model__Group__17 )
            // InternalPactDSL.g:1727:2: rule__Model__Group__16__Impl rule__Model__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__16"


    // $ANTLR start "rule__Model__Group__16__Impl"
    // InternalPactDSL.g:1734:1: rule__Model__Group__16__Impl : ( ( rule__Model__Group_16__0 )* ) ;
    public final void rule__Model__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1738:1: ( ( ( rule__Model__Group_16__0 )* ) )
            // InternalPactDSL.g:1739:1: ( ( rule__Model__Group_16__0 )* )
            {
            // InternalPactDSL.g:1739:1: ( ( rule__Model__Group_16__0 )* )
            // InternalPactDSL.g:1740:2: ( rule__Model__Group_16__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_16()); 
            // InternalPactDSL.g:1741:2: ( rule__Model__Group_16__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23||LA21_0==62||(LA21_0>=65 && LA21_0<=66)||LA21_0==68) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalPactDSL.g:1741:3: rule__Model__Group_16__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Model__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__16__Impl"


    // $ANTLR start "rule__Model__Group__17"
    // InternalPactDSL.g:1749:1: rule__Model__Group__17 : rule__Model__Group__17__Impl rule__Model__Group__18 ;
    public final void rule__Model__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1753:1: ( rule__Model__Group__17__Impl rule__Model__Group__18 )
            // InternalPactDSL.g:1754:2: rule__Model__Group__17__Impl rule__Model__Group__18
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__17"


    // $ANTLR start "rule__Model__Group__17__Impl"
    // InternalPactDSL.g:1761:1: rule__Model__Group__17__Impl : ( ( 'StateAfterTermination:' )? ) ;
    public final void rule__Model__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1765:1: ( ( ( 'StateAfterTermination:' )? ) )
            // InternalPactDSL.g:1766:1: ( ( 'StateAfterTermination:' )? )
            {
            // InternalPactDSL.g:1766:1: ( ( 'StateAfterTermination:' )? )
            // InternalPactDSL.g:1767:2: ( 'StateAfterTermination:' )?
            {
             before(grammarAccess.getModelAccess().getStateAfterTerminationKeyword_17()); 
            // InternalPactDSL.g:1768:2: ( 'StateAfterTermination:' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPactDSL.g:1768:3: 'StateAfterTermination:'
                    {
                    match(input,24,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getStateAfterTerminationKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__17__Impl"


    // $ANTLR start "rule__Model__Group__18"
    // InternalPactDSL.g:1776:1: rule__Model__Group__18 : rule__Model__Group__18__Impl rule__Model__Group__19 ;
    public final void rule__Model__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1780:1: ( rule__Model__Group__18__Impl rule__Model__Group__19 )
            // InternalPactDSL.g:1781:2: rule__Model__Group__18__Impl rule__Model__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__18"


    // $ANTLR start "rule__Model__Group__18__Impl"
    // InternalPactDSL.g:1788:1: rule__Model__Group__18__Impl : ( ( rule__Model__Group_18__0 )* ) ;
    public final void rule__Model__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1792:1: ( ( ( rule__Model__Group_18__0 )* ) )
            // InternalPactDSL.g:1793:1: ( ( rule__Model__Group_18__0 )* )
            {
            // InternalPactDSL.g:1793:1: ( ( rule__Model__Group_18__0 )* )
            // InternalPactDSL.g:1794:2: ( rule__Model__Group_18__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_18()); 
            // InternalPactDSL.g:1795:2: ( rule__Model__Group_18__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalPactDSL.g:1795:3: rule__Model__Group_18__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Model__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__18__Impl"


    // $ANTLR start "rule__Model__Group__19"
    // InternalPactDSL.g:1803:1: rule__Model__Group__19 : rule__Model__Group__19__Impl rule__Model__Group__20 ;
    public final void rule__Model__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1807:1: ( rule__Model__Group__19__Impl rule__Model__Group__20 )
            // InternalPactDSL.g:1808:2: rule__Model__Group__19__Impl rule__Model__Group__20
            {
            pushFollow(FOLLOW_17);
            rule__Model__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__19"


    // $ANTLR start "rule__Model__Group__19__Impl"
    // InternalPactDSL.g:1815:1: rule__Model__Group__19__Impl : ( 'Boilerplate:' ) ;
    public final void rule__Model__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1819:1: ( ( 'Boilerplate:' ) )
            // InternalPactDSL.g:1820:1: ( 'Boilerplate:' )
            {
            // InternalPactDSL.g:1820:1: ( 'Boilerplate:' )
            // InternalPactDSL.g:1821:2: 'Boilerplate:'
            {
             before(grammarAccess.getModelAccess().getBoilerplateKeyword_19()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getBoilerplateKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__19__Impl"


    // $ANTLR start "rule__Model__Group__20"
    // InternalPactDSL.g:1830:1: rule__Model__Group__20 : rule__Model__Group__20__Impl ;
    public final void rule__Model__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1834:1: ( rule__Model__Group__20__Impl )
            // InternalPactDSL.g:1835:2: rule__Model__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__20"


    // $ANTLR start "rule__Model__Group__20__Impl"
    // InternalPactDSL.g:1841:1: rule__Model__Group__20__Impl : ( ( rule__Model__Group_20__0 )* ) ;
    public final void rule__Model__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1845:1: ( ( ( rule__Model__Group_20__0 )* ) )
            // InternalPactDSL.g:1846:1: ( ( rule__Model__Group_20__0 )* )
            {
            // InternalPactDSL.g:1846:1: ( ( rule__Model__Group_20__0 )* )
            // InternalPactDSL.g:1847:2: ( rule__Model__Group_20__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_20()); 
            // InternalPactDSL.g:1848:2: ( rule__Model__Group_20__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=70 && LA24_0<=72)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPactDSL.g:1848:3: rule__Model__Group_20__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Model__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__20__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // InternalPactDSL.g:1857:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1861:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalPactDSL.g:1862:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // InternalPactDSL.g:1869:1: rule__Model__Group_4__0__Impl : ( ( rule__Model__EntityTypesAssignment_4_0 ) ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1873:1: ( ( ( rule__Model__EntityTypesAssignment_4_0 ) ) )
            // InternalPactDSL.g:1874:1: ( ( rule__Model__EntityTypesAssignment_4_0 ) )
            {
            // InternalPactDSL.g:1874:1: ( ( rule__Model__EntityTypesAssignment_4_0 ) )
            // InternalPactDSL.g:1875:2: ( rule__Model__EntityTypesAssignment_4_0 )
            {
             before(grammarAccess.getModelAccess().getEntityTypesAssignment_4_0()); 
            // InternalPactDSL.g:1876:2: ( rule__Model__EntityTypesAssignment_4_0 )
            // InternalPactDSL.g:1876:3: rule__Model__EntityTypesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__EntityTypesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEntityTypesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // InternalPactDSL.g:1884:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1888:1: ( rule__Model__Group_4__1__Impl )
            // InternalPactDSL.g:1889:2: rule__Model__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // InternalPactDSL.g:1895:1: rule__Model__Group_4__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1899:1: ( ( '.' ) )
            // InternalPactDSL.g:1900:1: ( '.' )
            {
            // InternalPactDSL.g:1900:1: ( '.' )
            // InternalPactDSL.g:1901:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Model__Group_6__0"
    // InternalPactDSL.g:1911:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1915:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // InternalPactDSL.g:1916:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__0"


    // $ANTLR start "rule__Model__Group_6__0__Impl"
    // InternalPactDSL.g:1923:1: rule__Model__Group_6__0__Impl : ( ( rule__Model__FormalityTypesAssignment_6_0 ) ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1927:1: ( ( ( rule__Model__FormalityTypesAssignment_6_0 ) ) )
            // InternalPactDSL.g:1928:1: ( ( rule__Model__FormalityTypesAssignment_6_0 ) )
            {
            // InternalPactDSL.g:1928:1: ( ( rule__Model__FormalityTypesAssignment_6_0 ) )
            // InternalPactDSL.g:1929:2: ( rule__Model__FormalityTypesAssignment_6_0 )
            {
             before(grammarAccess.getModelAccess().getFormalityTypesAssignment_6_0()); 
            // InternalPactDSL.g:1930:2: ( rule__Model__FormalityTypesAssignment_6_0 )
            // InternalPactDSL.g:1930:3: rule__Model__FormalityTypesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__FormalityTypesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFormalityTypesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__0__Impl"


    // $ANTLR start "rule__Model__Group_6__1"
    // InternalPactDSL.g:1938:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1942:1: ( rule__Model__Group_6__1__Impl )
            // InternalPactDSL.g:1943:2: rule__Model__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__1"


    // $ANTLR start "rule__Model__Group_6__1__Impl"
    // InternalPactDSL.g:1949:1: rule__Model__Group_6__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1953:1: ( ( '.' ) )
            // InternalPactDSL.g:1954:1: ( '.' )
            {
            // InternalPactDSL.g:1954:1: ( '.' )
            // InternalPactDSL.g:1955:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_6_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_6__1__Impl"


    // $ANTLR start "rule__Model__Group_8__0"
    // InternalPactDSL.g:1965:1: rule__Model__Group_8__0 : rule__Model__Group_8__0__Impl rule__Model__Group_8__1 ;
    public final void rule__Model__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1969:1: ( rule__Model__Group_8__0__Impl rule__Model__Group_8__1 )
            // InternalPactDSL.g:1970:2: rule__Model__Group_8__0__Impl rule__Model__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__0"


    // $ANTLR start "rule__Model__Group_8__0__Impl"
    // InternalPactDSL.g:1977:1: rule__Model__Group_8__0__Impl : ( ( rule__Model__ActionTypesAssignment_8_0 ) ) ;
    public final void rule__Model__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1981:1: ( ( ( rule__Model__ActionTypesAssignment_8_0 ) ) )
            // InternalPactDSL.g:1982:1: ( ( rule__Model__ActionTypesAssignment_8_0 ) )
            {
            // InternalPactDSL.g:1982:1: ( ( rule__Model__ActionTypesAssignment_8_0 ) )
            // InternalPactDSL.g:1983:2: ( rule__Model__ActionTypesAssignment_8_0 )
            {
             before(grammarAccess.getModelAccess().getActionTypesAssignment_8_0()); 
            // InternalPactDSL.g:1984:2: ( rule__Model__ActionTypesAssignment_8_0 )
            // InternalPactDSL.g:1984:3: rule__Model__ActionTypesAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__ActionTypesAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getActionTypesAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__0__Impl"


    // $ANTLR start "rule__Model__Group_8__1"
    // InternalPactDSL.g:1992:1: rule__Model__Group_8__1 : rule__Model__Group_8__1__Impl ;
    public final void rule__Model__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:1996:1: ( rule__Model__Group_8__1__Impl )
            // InternalPactDSL.g:1997:2: rule__Model__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__1"


    // $ANTLR start "rule__Model__Group_8__1__Impl"
    // InternalPactDSL.g:2003:1: rule__Model__Group_8__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2007:1: ( ( '.' ) )
            // InternalPactDSL.g:2008:1: ( '.' )
            {
            // InternalPactDSL.g:2008:1: ( '.' )
            // InternalPactDSL.g:2009:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_8__1__Impl"


    // $ANTLR start "rule__Model__Group_10__0"
    // InternalPactDSL.g:2019:1: rule__Model__Group_10__0 : rule__Model__Group_10__0__Impl rule__Model__Group_10__1 ;
    public final void rule__Model__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2023:1: ( rule__Model__Group_10__0__Impl rule__Model__Group_10__1 )
            // InternalPactDSL.g:2024:2: rule__Model__Group_10__0__Impl rule__Model__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__0"


    // $ANTLR start "rule__Model__Group_10__0__Impl"
    // InternalPactDSL.g:2031:1: rule__Model__Group_10__0__Impl : ( ( rule__Model__StateTypesAssignment_10_0 ) ) ;
    public final void rule__Model__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2035:1: ( ( ( rule__Model__StateTypesAssignment_10_0 ) ) )
            // InternalPactDSL.g:2036:1: ( ( rule__Model__StateTypesAssignment_10_0 ) )
            {
            // InternalPactDSL.g:2036:1: ( ( rule__Model__StateTypesAssignment_10_0 ) )
            // InternalPactDSL.g:2037:2: ( rule__Model__StateTypesAssignment_10_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_10_0()); 
            // InternalPactDSL.g:2038:2: ( rule__Model__StateTypesAssignment_10_0 )
            // InternalPactDSL.g:2038:3: rule__Model__StateTypesAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StateTypesAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStateTypesAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__0__Impl"


    // $ANTLR start "rule__Model__Group_10__1"
    // InternalPactDSL.g:2046:1: rule__Model__Group_10__1 : rule__Model__Group_10__1__Impl ;
    public final void rule__Model__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2050:1: ( rule__Model__Group_10__1__Impl )
            // InternalPactDSL.g:2051:2: rule__Model__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__1"


    // $ANTLR start "rule__Model__Group_10__1__Impl"
    // InternalPactDSL.g:2057:1: rule__Model__Group_10__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2061:1: ( ( '.' ) )
            // InternalPactDSL.g:2062:1: ( '.' )
            {
            // InternalPactDSL.g:2062:1: ( '.' )
            // InternalPactDSL.g:2063:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_10_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_10__1__Impl"


    // $ANTLR start "rule__Model__Group_12__0"
    // InternalPactDSL.g:2073:1: rule__Model__Group_12__0 : rule__Model__Group_12__0__Impl rule__Model__Group_12__1 ;
    public final void rule__Model__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2077:1: ( rule__Model__Group_12__0__Impl rule__Model__Group_12__1 )
            // InternalPactDSL.g:2078:2: rule__Model__Group_12__0__Impl rule__Model__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__0"


    // $ANTLR start "rule__Model__Group_12__0__Impl"
    // InternalPactDSL.g:2085:1: rule__Model__Group_12__0__Impl : ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) ) ;
    public final void rule__Model__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2089:1: ( ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) ) )
            // InternalPactDSL.g:2090:1: ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) )
            {
            // InternalPactDSL.g:2090:1: ( ( rule__Model__PrimaryObligationTypesAssignment_12_0 ) )
            // InternalPactDSL.g:2091:2: ( rule__Model__PrimaryObligationTypesAssignment_12_0 )
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationTypesAssignment_12_0()); 
            // InternalPactDSL.g:2092:2: ( rule__Model__PrimaryObligationTypesAssignment_12_0 )
            // InternalPactDSL.g:2092:3: rule__Model__PrimaryObligationTypesAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__PrimaryObligationTypesAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getPrimaryObligationTypesAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__0__Impl"


    // $ANTLR start "rule__Model__Group_12__1"
    // InternalPactDSL.g:2100:1: rule__Model__Group_12__1 : rule__Model__Group_12__1__Impl ;
    public final void rule__Model__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2104:1: ( rule__Model__Group_12__1__Impl )
            // InternalPactDSL.g:2105:2: rule__Model__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__1"


    // $ANTLR start "rule__Model__Group_12__1__Impl"
    // InternalPactDSL.g:2111:1: rule__Model__Group_12__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2115:1: ( ( '.' ) )
            // InternalPactDSL.g:2116:1: ( '.' )
            {
            // InternalPactDSL.g:2116:1: ( '.' )
            // InternalPactDSL.g:2117:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_12_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_12__1__Impl"


    // $ANTLR start "rule__Model__Group_14__0"
    // InternalPactDSL.g:2127:1: rule__Model__Group_14__0 : rule__Model__Group_14__0__Impl rule__Model__Group_14__1 ;
    public final void rule__Model__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2131:1: ( rule__Model__Group_14__0__Impl rule__Model__Group_14__1 )
            // InternalPactDSL.g:2132:2: rule__Model__Group_14__0__Impl rule__Model__Group_14__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__0"


    // $ANTLR start "rule__Model__Group_14__0__Impl"
    // InternalPactDSL.g:2139:1: rule__Model__Group_14__0__Impl : ( ( rule__Model__StateTypesAssignment_14_0 ) ) ;
    public final void rule__Model__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2143:1: ( ( ( rule__Model__StateTypesAssignment_14_0 ) ) )
            // InternalPactDSL.g:2144:1: ( ( rule__Model__StateTypesAssignment_14_0 ) )
            {
            // InternalPactDSL.g:2144:1: ( ( rule__Model__StateTypesAssignment_14_0 ) )
            // InternalPactDSL.g:2145:2: ( rule__Model__StateTypesAssignment_14_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_14_0()); 
            // InternalPactDSL.g:2146:2: ( rule__Model__StateTypesAssignment_14_0 )
            // InternalPactDSL.g:2146:3: rule__Model__StateTypesAssignment_14_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StateTypesAssignment_14_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStateTypesAssignment_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__0__Impl"


    // $ANTLR start "rule__Model__Group_14__1"
    // InternalPactDSL.g:2154:1: rule__Model__Group_14__1 : rule__Model__Group_14__1__Impl ;
    public final void rule__Model__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2158:1: ( rule__Model__Group_14__1__Impl )
            // InternalPactDSL.g:2159:2: rule__Model__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__1"


    // $ANTLR start "rule__Model__Group_14__1__Impl"
    // InternalPactDSL.g:2165:1: rule__Model__Group_14__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2169:1: ( ( '.' ) )
            // InternalPactDSL.g:2170:1: ( '.' )
            {
            // InternalPactDSL.g:2170:1: ( '.' )
            // InternalPactDSL.g:2171:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_14_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_14__1__Impl"


    // $ANTLR start "rule__Model__Group_16__0"
    // InternalPactDSL.g:2181:1: rule__Model__Group_16__0 : rule__Model__Group_16__0__Impl rule__Model__Group_16__1 ;
    public final void rule__Model__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2185:1: ( rule__Model__Group_16__0__Impl rule__Model__Group_16__1 )
            // InternalPactDSL.g:2186:2: rule__Model__Group_16__0__Impl rule__Model__Group_16__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__0"


    // $ANTLR start "rule__Model__Group_16__0__Impl"
    // InternalPactDSL.g:2193:1: rule__Model__Group_16__0__Impl : ( ( rule__Model__TerminationTypesAssignment_16_0 ) ) ;
    public final void rule__Model__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2197:1: ( ( ( rule__Model__TerminationTypesAssignment_16_0 ) ) )
            // InternalPactDSL.g:2198:1: ( ( rule__Model__TerminationTypesAssignment_16_0 ) )
            {
            // InternalPactDSL.g:2198:1: ( ( rule__Model__TerminationTypesAssignment_16_0 ) )
            // InternalPactDSL.g:2199:2: ( rule__Model__TerminationTypesAssignment_16_0 )
            {
             before(grammarAccess.getModelAccess().getTerminationTypesAssignment_16_0()); 
            // InternalPactDSL.g:2200:2: ( rule__Model__TerminationTypesAssignment_16_0 )
            // InternalPactDSL.g:2200:3: rule__Model__TerminationTypesAssignment_16_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__TerminationTypesAssignment_16_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTerminationTypesAssignment_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__0__Impl"


    // $ANTLR start "rule__Model__Group_16__1"
    // InternalPactDSL.g:2208:1: rule__Model__Group_16__1 : rule__Model__Group_16__1__Impl ;
    public final void rule__Model__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2212:1: ( rule__Model__Group_16__1__Impl )
            // InternalPactDSL.g:2213:2: rule__Model__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__1"


    // $ANTLR start "rule__Model__Group_16__1__Impl"
    // InternalPactDSL.g:2219:1: rule__Model__Group_16__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2223:1: ( ( '.' ) )
            // InternalPactDSL.g:2224:1: ( '.' )
            {
            // InternalPactDSL.g:2224:1: ( '.' )
            // InternalPactDSL.g:2225:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_16_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_16__1__Impl"


    // $ANTLR start "rule__Model__Group_18__0"
    // InternalPactDSL.g:2235:1: rule__Model__Group_18__0 : rule__Model__Group_18__0__Impl rule__Model__Group_18__1 ;
    public final void rule__Model__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2239:1: ( rule__Model__Group_18__0__Impl rule__Model__Group_18__1 )
            // InternalPactDSL.g:2240:2: rule__Model__Group_18__0__Impl rule__Model__Group_18__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_18__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__0"


    // $ANTLR start "rule__Model__Group_18__0__Impl"
    // InternalPactDSL.g:2247:1: rule__Model__Group_18__0__Impl : ( ( rule__Model__StateTypesAssignment_18_0 ) ) ;
    public final void rule__Model__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2251:1: ( ( ( rule__Model__StateTypesAssignment_18_0 ) ) )
            // InternalPactDSL.g:2252:1: ( ( rule__Model__StateTypesAssignment_18_0 ) )
            {
            // InternalPactDSL.g:2252:1: ( ( rule__Model__StateTypesAssignment_18_0 ) )
            // InternalPactDSL.g:2253:2: ( rule__Model__StateTypesAssignment_18_0 )
            {
             before(grammarAccess.getModelAccess().getStateTypesAssignment_18_0()); 
            // InternalPactDSL.g:2254:2: ( rule__Model__StateTypesAssignment_18_0 )
            // InternalPactDSL.g:2254:3: rule__Model__StateTypesAssignment_18_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__StateTypesAssignment_18_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStateTypesAssignment_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__0__Impl"


    // $ANTLR start "rule__Model__Group_18__1"
    // InternalPactDSL.g:2262:1: rule__Model__Group_18__1 : rule__Model__Group_18__1__Impl ;
    public final void rule__Model__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2266:1: ( rule__Model__Group_18__1__Impl )
            // InternalPactDSL.g:2267:2: rule__Model__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_18__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__1"


    // $ANTLR start "rule__Model__Group_18__1__Impl"
    // InternalPactDSL.g:2273:1: rule__Model__Group_18__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2277:1: ( ( '.' ) )
            // InternalPactDSL.g:2278:1: ( '.' )
            {
            // InternalPactDSL.g:2278:1: ( '.' )
            // InternalPactDSL.g:2279:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_18_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_18__1__Impl"


    // $ANTLR start "rule__Model__Group_20__0"
    // InternalPactDSL.g:2289:1: rule__Model__Group_20__0 : rule__Model__Group_20__0__Impl rule__Model__Group_20__1 ;
    public final void rule__Model__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2293:1: ( rule__Model__Group_20__0__Impl rule__Model__Group_20__1 )
            // InternalPactDSL.g:2294:2: rule__Model__Group_20__0__Impl rule__Model__Group_20__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__0"


    // $ANTLR start "rule__Model__Group_20__0__Impl"
    // InternalPactDSL.g:2301:1: rule__Model__Group_20__0__Impl : ( ( rule__Model__BoilerplateTypesAssignment_20_0 ) ) ;
    public final void rule__Model__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2305:1: ( ( ( rule__Model__BoilerplateTypesAssignment_20_0 ) ) )
            // InternalPactDSL.g:2306:1: ( ( rule__Model__BoilerplateTypesAssignment_20_0 ) )
            {
            // InternalPactDSL.g:2306:1: ( ( rule__Model__BoilerplateTypesAssignment_20_0 ) )
            // InternalPactDSL.g:2307:2: ( rule__Model__BoilerplateTypesAssignment_20_0 )
            {
             before(grammarAccess.getModelAccess().getBoilerplateTypesAssignment_20_0()); 
            // InternalPactDSL.g:2308:2: ( rule__Model__BoilerplateTypesAssignment_20_0 )
            // InternalPactDSL.g:2308:3: rule__Model__BoilerplateTypesAssignment_20_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__BoilerplateTypesAssignment_20_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getBoilerplateTypesAssignment_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__0__Impl"


    // $ANTLR start "rule__Model__Group_20__1"
    // InternalPactDSL.g:2316:1: rule__Model__Group_20__1 : rule__Model__Group_20__1__Impl ;
    public final void rule__Model__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2320:1: ( rule__Model__Group_20__1__Impl )
            // InternalPactDSL.g:2321:2: rule__Model__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__1"


    // $ANTLR start "rule__Model__Group_20__1__Impl"
    // InternalPactDSL.g:2327:1: rule__Model__Group_20__1__Impl : ( '.' ) ;
    public final void rule__Model__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2331:1: ( ( '.' ) )
            // InternalPactDSL.g:2332:1: ( '.' )
            {
            // InternalPactDSL.g:2332:1: ( '.' )
            // InternalPactDSL.g:2333:2: '.'
            {
             before(grammarAccess.getModelAccess().getFullStopKeyword_20_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFullStopKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_20__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group__0"
    // InternalPactDSL.g:2343:1: rule__EffectiveDate__Group__0 : rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1 ;
    public final void rule__EffectiveDate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2347:1: ( rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1 )
            // InternalPactDSL.g:2348:2: rule__EffectiveDate__Group__0__Impl rule__EffectiveDate__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EffectiveDate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__0"


    // $ANTLR start "rule__EffectiveDate__Group__0__Impl"
    // InternalPactDSL.g:2355:1: rule__EffectiveDate__Group__0__Impl : ( 'EffectiveDate:' ) ;
    public final void rule__EffectiveDate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2359:1: ( ( 'EffectiveDate:' ) )
            // InternalPactDSL.g:2360:1: ( 'EffectiveDate:' )
            {
            // InternalPactDSL.g:2360:1: ( 'EffectiveDate:' )
            // InternalPactDSL.g:2361:2: 'EffectiveDate:'
            {
             before(grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getEffectiveDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__0__Impl"


    // $ANTLR start "rule__EffectiveDate__Group__1"
    // InternalPactDSL.g:2370:1: rule__EffectiveDate__Group__1 : rule__EffectiveDate__Group__1__Impl ;
    public final void rule__EffectiveDate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2374:1: ( rule__EffectiveDate__Group__1__Impl )
            // InternalPactDSL.g:2375:2: rule__EffectiveDate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group__1"


    // $ANTLR start "rule__EffectiveDate__Group__1__Impl"
    // InternalPactDSL.g:2381:1: rule__EffectiveDate__Group__1__Impl : ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) ) ;
    public final void rule__EffectiveDate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2385:1: ( ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) ) )
            // InternalPactDSL.g:2386:1: ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) )
            {
            // InternalPactDSL.g:2386:1: ( ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* ) )
            // InternalPactDSL.g:2387:2: ( ( rule__EffectiveDate__Group_1__0 ) ) ( ( rule__EffectiveDate__Group_1__0 )* )
            {
            // InternalPactDSL.g:2387:2: ( ( rule__EffectiveDate__Group_1__0 ) )
            // InternalPactDSL.g:2388:3: ( rule__EffectiveDate__Group_1__0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup_1()); 
            // InternalPactDSL.g:2389:3: ( rule__EffectiveDate__Group_1__0 )
            // InternalPactDSL.g:2389:4: rule__EffectiveDate__Group_1__0
            {
            pushFollow(FOLLOW_20);
            rule__EffectiveDate__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getGroup_1()); 

            }

            // InternalPactDSL.g:2392:2: ( ( rule__EffectiveDate__Group_1__0 )* )
            // InternalPactDSL.g:2393:3: ( rule__EffectiveDate__Group_1__0 )*
            {
             before(grammarAccess.getEffectiveDateAccess().getGroup_1()); 
            // InternalPactDSL.g:2394:3: ( rule__EffectiveDate__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_INT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPactDSL.g:2394:4: rule__EffectiveDate__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EffectiveDate__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getEffectiveDateAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EffectiveDate__Group__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__0"
    // InternalPactDSL.g:2404:1: rule__EffectiveDate__Group_1__0 : rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1 ;
    public final void rule__EffectiveDate__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2408:1: ( rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1 )
            // InternalPactDSL.g:2409:2: rule__EffectiveDate__Group_1__0__Impl rule__EffectiveDate__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__EffectiveDate__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__0"


    // $ANTLR start "rule__EffectiveDate__Group_1__0__Impl"
    // InternalPactDSL.g:2416:1: rule__EffectiveDate__Group_1__0__Impl : ( ( rule__EffectiveDate__DayAssignment_1_0 ) ) ;
    public final void rule__EffectiveDate__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2420:1: ( ( ( rule__EffectiveDate__DayAssignment_1_0 ) ) )
            // InternalPactDSL.g:2421:1: ( ( rule__EffectiveDate__DayAssignment_1_0 ) )
            {
            // InternalPactDSL.g:2421:1: ( ( rule__EffectiveDate__DayAssignment_1_0 ) )
            // InternalPactDSL.g:2422:2: ( rule__EffectiveDate__DayAssignment_1_0 )
            {
             before(grammarAccess.getEffectiveDateAccess().getDayAssignment_1_0()); 
            // InternalPactDSL.g:2423:2: ( rule__EffectiveDate__DayAssignment_1_0 )
            // InternalPactDSL.g:2423:3: rule__EffectiveDate__DayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__DayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getDayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__0__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__1"
    // InternalPactDSL.g:2431:1: rule__EffectiveDate__Group_1__1 : rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2 ;
    public final void rule__EffectiveDate__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2435:1: ( rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2 )
            // InternalPactDSL.g:2436:2: rule__EffectiveDate__Group_1__1__Impl rule__EffectiveDate__Group_1__2
            {
            pushFollow(FOLLOW_19);
            rule__EffectiveDate__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__1"


    // $ANTLR start "rule__EffectiveDate__Group_1__1__Impl"
    // InternalPactDSL.g:2443:1: rule__EffectiveDate__Group_1__1__Impl : ( ( rule__EffectiveDate__MonthAssignment_1_1 ) ) ;
    public final void rule__EffectiveDate__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2447:1: ( ( ( rule__EffectiveDate__MonthAssignment_1_1 ) ) )
            // InternalPactDSL.g:2448:1: ( ( rule__EffectiveDate__MonthAssignment_1_1 ) )
            {
            // InternalPactDSL.g:2448:1: ( ( rule__EffectiveDate__MonthAssignment_1_1 ) )
            // InternalPactDSL.g:2449:2: ( rule__EffectiveDate__MonthAssignment_1_1 )
            {
             before(grammarAccess.getEffectiveDateAccess().getMonthAssignment_1_1()); 
            // InternalPactDSL.g:2450:2: ( rule__EffectiveDate__MonthAssignment_1_1 )
            // InternalPactDSL.g:2450:3: rule__EffectiveDate__MonthAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__MonthAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getMonthAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__1__Impl"


    // $ANTLR start "rule__EffectiveDate__Group_1__2"
    // InternalPactDSL.g:2458:1: rule__EffectiveDate__Group_1__2 : rule__EffectiveDate__Group_1__2__Impl ;
    public final void rule__EffectiveDate__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2462:1: ( rule__EffectiveDate__Group_1__2__Impl )
            // InternalPactDSL.g:2463:2: rule__EffectiveDate__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__2"


    // $ANTLR start "rule__EffectiveDate__Group_1__2__Impl"
    // InternalPactDSL.g:2469:1: rule__EffectiveDate__Group_1__2__Impl : ( ( rule__EffectiveDate__YearAssignment_1_2 ) ) ;
    public final void rule__EffectiveDate__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2473:1: ( ( ( rule__EffectiveDate__YearAssignment_1_2 ) ) )
            // InternalPactDSL.g:2474:1: ( ( rule__EffectiveDate__YearAssignment_1_2 ) )
            {
            // InternalPactDSL.g:2474:1: ( ( rule__EffectiveDate__YearAssignment_1_2 ) )
            // InternalPactDSL.g:2475:2: ( rule__EffectiveDate__YearAssignment_1_2 )
            {
             before(grammarAccess.getEffectiveDateAccess().getYearAssignment_1_2()); 
            // InternalPactDSL.g:2476:2: ( rule__EffectiveDate__YearAssignment_1_2 )
            // InternalPactDSL.g:2476:3: rule__EffectiveDate__YearAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EffectiveDate__YearAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEffectiveDateAccess().getYearAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__Group_1__2__Impl"


    // $ANTLR start "rule__Party__Group__0"
    // InternalPactDSL.g:2485:1: rule__Party__Group__0 : rule__Party__Group__0__Impl rule__Party__Group__1 ;
    public final void rule__Party__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2489:1: ( rule__Party__Group__0__Impl rule__Party__Group__1 )
            // InternalPactDSL.g:2490:2: rule__Party__Group__0__Impl rule__Party__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Party__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__0"


    // $ANTLR start "rule__Party__Group__0__Impl"
    // InternalPactDSL.g:2497:1: rule__Party__Group__0__Impl : ( 'Party:' ) ;
    public final void rule__Party__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2501:1: ( ( 'Party:' ) )
            // InternalPactDSL.g:2502:1: ( 'Party:' )
            {
            // InternalPactDSL.g:2502:1: ( 'Party:' )
            // InternalPactDSL.g:2503:2: 'Party:'
            {
             before(grammarAccess.getPartyAccess().getPartyKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__0__Impl"


    // $ANTLR start "rule__Party__Group__1"
    // InternalPactDSL.g:2512:1: rule__Party__Group__1 : rule__Party__Group__1__Impl rule__Party__Group__2 ;
    public final void rule__Party__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2516:1: ( rule__Party__Group__1__Impl rule__Party__Group__2 )
            // InternalPactDSL.g:2517:2: rule__Party__Group__1__Impl rule__Party__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Party__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__1"


    // $ANTLR start "rule__Party__Group__1__Impl"
    // InternalPactDSL.g:2524:1: rule__Party__Group__1__Impl : ( ( rule__Party__NameAssignment_1 ) ) ;
    public final void rule__Party__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2528:1: ( ( ( rule__Party__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2529:1: ( ( rule__Party__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2529:1: ( ( rule__Party__NameAssignment_1 ) )
            // InternalPactDSL.g:2530:2: ( rule__Party__NameAssignment_1 )
            {
             before(grammarAccess.getPartyAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2531:2: ( rule__Party__NameAssignment_1 )
            // InternalPactDSL.g:2531:3: rule__Party__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Party__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__1__Impl"


    // $ANTLR start "rule__Party__Group__2"
    // InternalPactDSL.g:2539:1: rule__Party__Group__2 : rule__Party__Group__2__Impl rule__Party__Group__3 ;
    public final void rule__Party__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2543:1: ( rule__Party__Group__2__Impl rule__Party__Group__3 )
            // InternalPactDSL.g:2544:2: rule__Party__Group__2__Impl rule__Party__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Party__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__2"


    // $ANTLR start "rule__Party__Group__2__Impl"
    // InternalPactDSL.g:2551:1: rule__Party__Group__2__Impl : ( ( rule__Party__FullnameAssignment_2 ) ) ;
    public final void rule__Party__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2555:1: ( ( ( rule__Party__FullnameAssignment_2 ) ) )
            // InternalPactDSL.g:2556:1: ( ( rule__Party__FullnameAssignment_2 ) )
            {
            // InternalPactDSL.g:2556:1: ( ( rule__Party__FullnameAssignment_2 ) )
            // InternalPactDSL.g:2557:2: ( rule__Party__FullnameAssignment_2 )
            {
             before(grammarAccess.getPartyAccess().getFullnameAssignment_2()); 
            // InternalPactDSL.g:2558:2: ( rule__Party__FullnameAssignment_2 )
            // InternalPactDSL.g:2558:3: rule__Party__FullnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Party__FullnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartyAccess().getFullnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__2__Impl"


    // $ANTLR start "rule__Party__Group__3"
    // InternalPactDSL.g:2566:1: rule__Party__Group__3 : rule__Party__Group__3__Impl rule__Party__Group__4 ;
    public final void rule__Party__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2570:1: ( rule__Party__Group__3__Impl rule__Party__Group__4 )
            // InternalPactDSL.g:2571:2: rule__Party__Group__3__Impl rule__Party__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Party__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__3"


    // $ANTLR start "rule__Party__Group__3__Impl"
    // InternalPactDSL.g:2578:1: rule__Party__Group__3__Impl : ( ( rule__Party__DefinitionAssignment_3 )? ) ;
    public final void rule__Party__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2582:1: ( ( ( rule__Party__DefinitionAssignment_3 )? ) )
            // InternalPactDSL.g:2583:1: ( ( rule__Party__DefinitionAssignment_3 )? )
            {
            // InternalPactDSL.g:2583:1: ( ( rule__Party__DefinitionAssignment_3 )? )
            // InternalPactDSL.g:2584:2: ( rule__Party__DefinitionAssignment_3 )?
            {
             before(grammarAccess.getPartyAccess().getDefinitionAssignment_3()); 
            // InternalPactDSL.g:2585:2: ( rule__Party__DefinitionAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPactDSL.g:2585:3: rule__Party__DefinitionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Party__DefinitionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartyAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__3__Impl"


    // $ANTLR start "rule__Party__Group__4"
    // InternalPactDSL.g:2593:1: rule__Party__Group__4 : rule__Party__Group__4__Impl rule__Party__Group__5 ;
    public final void rule__Party__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2597:1: ( rule__Party__Group__4__Impl rule__Party__Group__5 )
            // InternalPactDSL.g:2598:2: rule__Party__Group__4__Impl rule__Party__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Party__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__4"


    // $ANTLR start "rule__Party__Group__4__Impl"
    // InternalPactDSL.g:2605:1: rule__Party__Group__4__Impl : ( ( rule__Party__AddressAssignment_4 )? ) ;
    public final void rule__Party__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2609:1: ( ( ( rule__Party__AddressAssignment_4 )? ) )
            // InternalPactDSL.g:2610:1: ( ( rule__Party__AddressAssignment_4 )? )
            {
            // InternalPactDSL.g:2610:1: ( ( rule__Party__AddressAssignment_4 )? )
            // InternalPactDSL.g:2611:2: ( rule__Party__AddressAssignment_4 )?
            {
             before(grammarAccess.getPartyAccess().getAddressAssignment_4()); 
            // InternalPactDSL.g:2612:2: ( rule__Party__AddressAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalPactDSL.g:2612:3: rule__Party__AddressAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Party__AddressAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartyAccess().getAddressAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__4__Impl"


    // $ANTLR start "rule__Party__Group__5"
    // InternalPactDSL.g:2620:1: rule__Party__Group__5 : rule__Party__Group__5__Impl rule__Party__Group__6 ;
    public final void rule__Party__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2624:1: ( rule__Party__Group__5__Impl rule__Party__Group__6 )
            // InternalPactDSL.g:2625:2: rule__Party__Group__5__Impl rule__Party__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Party__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Party__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__5"


    // $ANTLR start "rule__Party__Group__5__Impl"
    // InternalPactDSL.g:2632:1: rule__Party__Group__5__Impl : ( ( rule__Party__CompanyNumberAssignment_5 )? ) ;
    public final void rule__Party__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2636:1: ( ( ( rule__Party__CompanyNumberAssignment_5 )? ) )
            // InternalPactDSL.g:2637:1: ( ( rule__Party__CompanyNumberAssignment_5 )? )
            {
            // InternalPactDSL.g:2637:1: ( ( rule__Party__CompanyNumberAssignment_5 )? )
            // InternalPactDSL.g:2638:2: ( rule__Party__CompanyNumberAssignment_5 )?
            {
             before(grammarAccess.getPartyAccess().getCompanyNumberAssignment_5()); 
            // InternalPactDSL.g:2639:2: ( rule__Party__CompanyNumberAssignment_5 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalPactDSL.g:2639:3: rule__Party__CompanyNumberAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Party__CompanyNumberAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPartyAccess().getCompanyNumberAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__5__Impl"


    // $ANTLR start "rule__Party__Group__6"
    // InternalPactDSL.g:2647:1: rule__Party__Group__6 : rule__Party__Group__6__Impl ;
    public final void rule__Party__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2651:1: ( rule__Party__Group__6__Impl )
            // InternalPactDSL.g:2652:2: rule__Party__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Party__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__6"


    // $ANTLR start "rule__Party__Group__6__Impl"
    // InternalPactDSL.g:2658:1: rule__Party__Group__6__Impl : ( ( rule__Party__FeaturesAssignment_6 )* ) ;
    public final void rule__Party__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2662:1: ( ( ( rule__Party__FeaturesAssignment_6 )* ) )
            // InternalPactDSL.g:2663:1: ( ( rule__Party__FeaturesAssignment_6 )* )
            {
            // InternalPactDSL.g:2663:1: ( ( rule__Party__FeaturesAssignment_6 )* )
            // InternalPactDSL.g:2664:2: ( rule__Party__FeaturesAssignment_6 )*
            {
             before(grammarAccess.getPartyAccess().getFeaturesAssignment_6()); 
            // InternalPactDSL.g:2665:2: ( rule__Party__FeaturesAssignment_6 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPactDSL.g:2665:3: rule__Party__FeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Party__FeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPartyAccess().getFeaturesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__Group__6__Impl"


    // $ANTLR start "rule__ThirdParty__Group__0"
    // InternalPactDSL.g:2674:1: rule__ThirdParty__Group__0 : rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1 ;
    public final void rule__ThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2678:1: ( rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1 )
            // InternalPactDSL.g:2679:2: rule__ThirdParty__Group__0__Impl rule__ThirdParty__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ThirdParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__0"


    // $ANTLR start "rule__ThirdParty__Group__0__Impl"
    // InternalPactDSL.g:2686:1: rule__ThirdParty__Group__0__Impl : ( 'ThirdParty:' ) ;
    public final void rule__ThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2690:1: ( ( 'ThirdParty:' ) )
            // InternalPactDSL.g:2691:1: ( 'ThirdParty:' )
            {
            // InternalPactDSL.g:2691:1: ( 'ThirdParty:' )
            // InternalPactDSL.g:2692:2: 'ThirdParty:'
            {
             before(grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getThirdPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__0__Impl"


    // $ANTLR start "rule__ThirdParty__Group__1"
    // InternalPactDSL.g:2701:1: rule__ThirdParty__Group__1 : rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2 ;
    public final void rule__ThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2705:1: ( rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2 )
            // InternalPactDSL.g:2706:2: rule__ThirdParty__Group__1__Impl rule__ThirdParty__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ThirdParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__1"


    // $ANTLR start "rule__ThirdParty__Group__1__Impl"
    // InternalPactDSL.g:2713:1: rule__ThirdParty__Group__1__Impl : ( ( rule__ThirdParty__NameAssignment_1 ) ) ;
    public final void rule__ThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2717:1: ( ( ( rule__ThirdParty__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2718:1: ( ( rule__ThirdParty__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2718:1: ( ( rule__ThirdParty__NameAssignment_1 ) )
            // InternalPactDSL.g:2719:2: ( rule__ThirdParty__NameAssignment_1 )
            {
             before(grammarAccess.getThirdPartyAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2720:2: ( rule__ThirdParty__NameAssignment_1 )
            // InternalPactDSL.g:2720:3: rule__ThirdParty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__1__Impl"


    // $ANTLR start "rule__ThirdParty__Group__2"
    // InternalPactDSL.g:2728:1: rule__ThirdParty__Group__2 : rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3 ;
    public final void rule__ThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2732:1: ( rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3 )
            // InternalPactDSL.g:2733:2: rule__ThirdParty__Group__2__Impl rule__ThirdParty__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ThirdParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__2"


    // $ANTLR start "rule__ThirdParty__Group__2__Impl"
    // InternalPactDSL.g:2740:1: rule__ThirdParty__Group__2__Impl : ( ( rule__ThirdParty__FullnameAssignment_2 ) ) ;
    public final void rule__ThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2744:1: ( ( ( rule__ThirdParty__FullnameAssignment_2 ) ) )
            // InternalPactDSL.g:2745:1: ( ( rule__ThirdParty__FullnameAssignment_2 ) )
            {
            // InternalPactDSL.g:2745:1: ( ( rule__ThirdParty__FullnameAssignment_2 ) )
            // InternalPactDSL.g:2746:2: ( rule__ThirdParty__FullnameAssignment_2 )
            {
             before(grammarAccess.getThirdPartyAccess().getFullnameAssignment_2()); 
            // InternalPactDSL.g:2747:2: ( rule__ThirdParty__FullnameAssignment_2 )
            // InternalPactDSL.g:2747:3: rule__ThirdParty__FullnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__FullnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThirdPartyAccess().getFullnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__2__Impl"


    // $ANTLR start "rule__ThirdParty__Group__3"
    // InternalPactDSL.g:2755:1: rule__ThirdParty__Group__3 : rule__ThirdParty__Group__3__Impl rule__ThirdParty__Group__4 ;
    public final void rule__ThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2759:1: ( rule__ThirdParty__Group__3__Impl rule__ThirdParty__Group__4 )
            // InternalPactDSL.g:2760:2: rule__ThirdParty__Group__3__Impl rule__ThirdParty__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ThirdParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__3"


    // $ANTLR start "rule__ThirdParty__Group__3__Impl"
    // InternalPactDSL.g:2767:1: rule__ThirdParty__Group__3__Impl : ( ( rule__ThirdParty__DefinitionAssignment_3 )? ) ;
    public final void rule__ThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2771:1: ( ( ( rule__ThirdParty__DefinitionAssignment_3 )? ) )
            // InternalPactDSL.g:2772:1: ( ( rule__ThirdParty__DefinitionAssignment_3 )? )
            {
            // InternalPactDSL.g:2772:1: ( ( rule__ThirdParty__DefinitionAssignment_3 )? )
            // InternalPactDSL.g:2773:2: ( rule__ThirdParty__DefinitionAssignment_3 )?
            {
             before(grammarAccess.getThirdPartyAccess().getDefinitionAssignment_3()); 
            // InternalPactDSL.g:2774:2: ( rule__ThirdParty__DefinitionAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalPactDSL.g:2774:3: rule__ThirdParty__DefinitionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ThirdParty__DefinitionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThirdPartyAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__3__Impl"


    // $ANTLR start "rule__ThirdParty__Group__4"
    // InternalPactDSL.g:2782:1: rule__ThirdParty__Group__4 : rule__ThirdParty__Group__4__Impl rule__ThirdParty__Group__5 ;
    public final void rule__ThirdParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2786:1: ( rule__ThirdParty__Group__4__Impl rule__ThirdParty__Group__5 )
            // InternalPactDSL.g:2787:2: rule__ThirdParty__Group__4__Impl rule__ThirdParty__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ThirdParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__4"


    // $ANTLR start "rule__ThirdParty__Group__4__Impl"
    // InternalPactDSL.g:2794:1: rule__ThirdParty__Group__4__Impl : ( ( rule__ThirdParty__AddressAssignment_4 )? ) ;
    public final void rule__ThirdParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2798:1: ( ( ( rule__ThirdParty__AddressAssignment_4 )? ) )
            // InternalPactDSL.g:2799:1: ( ( rule__ThirdParty__AddressAssignment_4 )? )
            {
            // InternalPactDSL.g:2799:1: ( ( rule__ThirdParty__AddressAssignment_4 )? )
            // InternalPactDSL.g:2800:2: ( rule__ThirdParty__AddressAssignment_4 )?
            {
             before(grammarAccess.getThirdPartyAccess().getAddressAssignment_4()); 
            // InternalPactDSL.g:2801:2: ( rule__ThirdParty__AddressAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalPactDSL.g:2801:3: rule__ThirdParty__AddressAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ThirdParty__AddressAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThirdPartyAccess().getAddressAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__4__Impl"


    // $ANTLR start "rule__ThirdParty__Group__5"
    // InternalPactDSL.g:2809:1: rule__ThirdParty__Group__5 : rule__ThirdParty__Group__5__Impl rule__ThirdParty__Group__6 ;
    public final void rule__ThirdParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2813:1: ( rule__ThirdParty__Group__5__Impl rule__ThirdParty__Group__6 )
            // InternalPactDSL.g:2814:2: rule__ThirdParty__Group__5__Impl rule__ThirdParty__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__ThirdParty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__5"


    // $ANTLR start "rule__ThirdParty__Group__5__Impl"
    // InternalPactDSL.g:2821:1: rule__ThirdParty__Group__5__Impl : ( ( rule__ThirdParty__CompanyNumberAssignment_5 )? ) ;
    public final void rule__ThirdParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2825:1: ( ( ( rule__ThirdParty__CompanyNumberAssignment_5 )? ) )
            // InternalPactDSL.g:2826:1: ( ( rule__ThirdParty__CompanyNumberAssignment_5 )? )
            {
            // InternalPactDSL.g:2826:1: ( ( rule__ThirdParty__CompanyNumberAssignment_5 )? )
            // InternalPactDSL.g:2827:2: ( rule__ThirdParty__CompanyNumberAssignment_5 )?
            {
             before(grammarAccess.getThirdPartyAccess().getCompanyNumberAssignment_5()); 
            // InternalPactDSL.g:2828:2: ( rule__ThirdParty__CompanyNumberAssignment_5 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalPactDSL.g:2828:3: rule__ThirdParty__CompanyNumberAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ThirdParty__CompanyNumberAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThirdPartyAccess().getCompanyNumberAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__5__Impl"


    // $ANTLR start "rule__ThirdParty__Group__6"
    // InternalPactDSL.g:2836:1: rule__ThirdParty__Group__6 : rule__ThirdParty__Group__6__Impl ;
    public final void rule__ThirdParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2840:1: ( rule__ThirdParty__Group__6__Impl )
            // InternalPactDSL.g:2841:2: rule__ThirdParty__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ThirdParty__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__6"


    // $ANTLR start "rule__ThirdParty__Group__6__Impl"
    // InternalPactDSL.g:2847:1: rule__ThirdParty__Group__6__Impl : ( ( rule__ThirdParty__FeaturesAssignment_6 )* ) ;
    public final void rule__ThirdParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2851:1: ( ( ( rule__ThirdParty__FeaturesAssignment_6 )* ) )
            // InternalPactDSL.g:2852:1: ( ( rule__ThirdParty__FeaturesAssignment_6 )* )
            {
            // InternalPactDSL.g:2852:1: ( ( rule__ThirdParty__FeaturesAssignment_6 )* )
            // InternalPactDSL.g:2853:2: ( rule__ThirdParty__FeaturesAssignment_6 )*
            {
             before(grammarAccess.getThirdPartyAccess().getFeaturesAssignment_6()); 
            // InternalPactDSL.g:2854:2: ( rule__ThirdParty__FeaturesAssignment_6 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==33) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPactDSL.g:2854:3: rule__ThirdParty__FeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__ThirdParty__FeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getThirdPartyAccess().getFeaturesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__Group__6__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__0"
    // InternalPactDSL.g:2863:1: rule__SubjectMatter__Group__0 : rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1 ;
    public final void rule__SubjectMatter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2867:1: ( rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1 )
            // InternalPactDSL.g:2868:2: rule__SubjectMatter__Group__0__Impl rule__SubjectMatter__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__SubjectMatter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__0"


    // $ANTLR start "rule__SubjectMatter__Group__0__Impl"
    // InternalPactDSL.g:2875:1: rule__SubjectMatter__Group__0__Impl : ( 'SubjectMatter:' ) ;
    public final void rule__SubjectMatter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2879:1: ( ( 'SubjectMatter:' ) )
            // InternalPactDSL.g:2880:1: ( 'SubjectMatter:' )
            {
            // InternalPactDSL.g:2880:1: ( 'SubjectMatter:' )
            // InternalPactDSL.g:2881:2: 'SubjectMatter:'
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__0__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__1"
    // InternalPactDSL.g:2890:1: rule__SubjectMatter__Group__1 : rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2 ;
    public final void rule__SubjectMatter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2894:1: ( rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2 )
            // InternalPactDSL.g:2895:2: rule__SubjectMatter__Group__1__Impl rule__SubjectMatter__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SubjectMatter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__1"


    // $ANTLR start "rule__SubjectMatter__Group__1__Impl"
    // InternalPactDSL.g:2902:1: rule__SubjectMatter__Group__1__Impl : ( ( rule__SubjectMatter__NameAssignment_1 ) ) ;
    public final void rule__SubjectMatter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2906:1: ( ( ( rule__SubjectMatter__NameAssignment_1 ) ) )
            // InternalPactDSL.g:2907:1: ( ( rule__SubjectMatter__NameAssignment_1 ) )
            {
            // InternalPactDSL.g:2907:1: ( ( rule__SubjectMatter__NameAssignment_1 ) )
            // InternalPactDSL.g:2908:2: ( rule__SubjectMatter__NameAssignment_1 )
            {
             before(grammarAccess.getSubjectMatterAccess().getNameAssignment_1()); 
            // InternalPactDSL.g:2909:2: ( rule__SubjectMatter__NameAssignment_1 )
            // InternalPactDSL.g:2909:3: rule__SubjectMatter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__1__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__2"
    // InternalPactDSL.g:2917:1: rule__SubjectMatter__Group__2 : rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3 ;
    public final void rule__SubjectMatter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2921:1: ( rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3 )
            // InternalPactDSL.g:2922:2: rule__SubjectMatter__Group__2__Impl rule__SubjectMatter__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__SubjectMatter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__2"


    // $ANTLR start "rule__SubjectMatter__Group__2__Impl"
    // InternalPactDSL.g:2929:1: rule__SubjectMatter__Group__2__Impl : ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) ) ;
    public final void rule__SubjectMatter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2933:1: ( ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) ) )
            // InternalPactDSL.g:2934:1: ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) )
            {
            // InternalPactDSL.g:2934:1: ( ( rule__SubjectMatter__SubjectMatterAssignment_2 ) )
            // InternalPactDSL.g:2935:2: ( rule__SubjectMatter__SubjectMatterAssignment_2 )
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterAssignment_2()); 
            // InternalPactDSL.g:2936:2: ( rule__SubjectMatter__SubjectMatterAssignment_2 )
            // InternalPactDSL.g:2936:3: rule__SubjectMatter__SubjectMatterAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__SubjectMatterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__2__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__3"
    // InternalPactDSL.g:2944:1: rule__SubjectMatter__Group__3 : rule__SubjectMatter__Group__3__Impl rule__SubjectMatter__Group__4 ;
    public final void rule__SubjectMatter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2948:1: ( rule__SubjectMatter__Group__3__Impl rule__SubjectMatter__Group__4 )
            // InternalPactDSL.g:2949:2: rule__SubjectMatter__Group__3__Impl rule__SubjectMatter__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__SubjectMatter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__3"


    // $ANTLR start "rule__SubjectMatter__Group__3__Impl"
    // InternalPactDSL.g:2956:1: rule__SubjectMatter__Group__3__Impl : ( ( rule__SubjectMatter__DefinitionAssignment_3 )? ) ;
    public final void rule__SubjectMatter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2960:1: ( ( ( rule__SubjectMatter__DefinitionAssignment_3 )? ) )
            // InternalPactDSL.g:2961:1: ( ( rule__SubjectMatter__DefinitionAssignment_3 )? )
            {
            // InternalPactDSL.g:2961:1: ( ( rule__SubjectMatter__DefinitionAssignment_3 )? )
            // InternalPactDSL.g:2962:2: ( rule__SubjectMatter__DefinitionAssignment_3 )?
            {
             before(grammarAccess.getSubjectMatterAccess().getDefinitionAssignment_3()); 
            // InternalPactDSL.g:2963:2: ( rule__SubjectMatter__DefinitionAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==30) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalPactDSL.g:2963:3: rule__SubjectMatter__DefinitionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubjectMatter__DefinitionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubjectMatterAccess().getDefinitionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__3__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__4"
    // InternalPactDSL.g:2971:1: rule__SubjectMatter__Group__4 : rule__SubjectMatter__Group__4__Impl rule__SubjectMatter__Group__5 ;
    public final void rule__SubjectMatter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2975:1: ( rule__SubjectMatter__Group__4__Impl rule__SubjectMatter__Group__5 )
            // InternalPactDSL.g:2976:2: rule__SubjectMatter__Group__4__Impl rule__SubjectMatter__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__SubjectMatter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__4"


    // $ANTLR start "rule__SubjectMatter__Group__4__Impl"
    // InternalPactDSL.g:2983:1: rule__SubjectMatter__Group__4__Impl : ( ( rule__SubjectMatter__AddressAssignment_4 )? ) ;
    public final void rule__SubjectMatter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:2987:1: ( ( ( rule__SubjectMatter__AddressAssignment_4 )? ) )
            // InternalPactDSL.g:2988:1: ( ( rule__SubjectMatter__AddressAssignment_4 )? )
            {
            // InternalPactDSL.g:2988:1: ( ( rule__SubjectMatter__AddressAssignment_4 )? )
            // InternalPactDSL.g:2989:2: ( rule__SubjectMatter__AddressAssignment_4 )?
            {
             before(grammarAccess.getSubjectMatterAccess().getAddressAssignment_4()); 
            // InternalPactDSL.g:2990:2: ( rule__SubjectMatter__AddressAssignment_4 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPactDSL.g:2990:3: rule__SubjectMatter__AddressAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubjectMatter__AddressAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubjectMatterAccess().getAddressAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__4__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__5"
    // InternalPactDSL.g:2998:1: rule__SubjectMatter__Group__5 : rule__SubjectMatter__Group__5__Impl rule__SubjectMatter__Group__6 ;
    public final void rule__SubjectMatter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3002:1: ( rule__SubjectMatter__Group__5__Impl rule__SubjectMatter__Group__6 )
            // InternalPactDSL.g:3003:2: rule__SubjectMatter__Group__5__Impl rule__SubjectMatter__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__SubjectMatter__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__5"


    // $ANTLR start "rule__SubjectMatter__Group__5__Impl"
    // InternalPactDSL.g:3010:1: rule__SubjectMatter__Group__5__Impl : ( ( rule__SubjectMatter__CompanyNumberAssignment_5 )? ) ;
    public final void rule__SubjectMatter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3014:1: ( ( ( rule__SubjectMatter__CompanyNumberAssignment_5 )? ) )
            // InternalPactDSL.g:3015:1: ( ( rule__SubjectMatter__CompanyNumberAssignment_5 )? )
            {
            // InternalPactDSL.g:3015:1: ( ( rule__SubjectMatter__CompanyNumberAssignment_5 )? )
            // InternalPactDSL.g:3016:2: ( rule__SubjectMatter__CompanyNumberAssignment_5 )?
            {
             before(grammarAccess.getSubjectMatterAccess().getCompanyNumberAssignment_5()); 
            // InternalPactDSL.g:3017:2: ( rule__SubjectMatter__CompanyNumberAssignment_5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==32) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalPactDSL.g:3017:3: rule__SubjectMatter__CompanyNumberAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubjectMatter__CompanyNumberAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubjectMatterAccess().getCompanyNumberAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__5__Impl"


    // $ANTLR start "rule__SubjectMatter__Group__6"
    // InternalPactDSL.g:3025:1: rule__SubjectMatter__Group__6 : rule__SubjectMatter__Group__6__Impl ;
    public final void rule__SubjectMatter__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3029:1: ( rule__SubjectMatter__Group__6__Impl )
            // InternalPactDSL.g:3030:2: rule__SubjectMatter__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubjectMatter__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__6"


    // $ANTLR start "rule__SubjectMatter__Group__6__Impl"
    // InternalPactDSL.g:3036:1: rule__SubjectMatter__Group__6__Impl : ( ( rule__SubjectMatter__FeaturesAssignment_6 )* ) ;
    public final void rule__SubjectMatter__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3040:1: ( ( ( rule__SubjectMatter__FeaturesAssignment_6 )* ) )
            // InternalPactDSL.g:3041:1: ( ( rule__SubjectMatter__FeaturesAssignment_6 )* )
            {
            // InternalPactDSL.g:3041:1: ( ( rule__SubjectMatter__FeaturesAssignment_6 )* )
            // InternalPactDSL.g:3042:2: ( rule__SubjectMatter__FeaturesAssignment_6 )*
            {
             before(grammarAccess.getSubjectMatterAccess().getFeaturesAssignment_6()); 
            // InternalPactDSL.g:3043:2: ( rule__SubjectMatter__FeaturesAssignment_6 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==33) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPactDSL.g:3043:3: rule__SubjectMatter__FeaturesAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SubjectMatter__FeaturesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getSubjectMatterAccess().getFeaturesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__Group__6__Impl"


    // $ANTLR start "rule__DefinedTerm__Group__0"
    // InternalPactDSL.g:3052:1: rule__DefinedTerm__Group__0 : rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1 ;
    public final void rule__DefinedTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3056:1: ( rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1 )
            // InternalPactDSL.g:3057:2: rule__DefinedTerm__Group__0__Impl rule__DefinedTerm__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DefinedTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__0"


    // $ANTLR start "rule__DefinedTerm__Group__0__Impl"
    // InternalPactDSL.g:3064:1: rule__DefinedTerm__Group__0__Impl : ( 'definedAs' ) ;
    public final void rule__DefinedTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3068:1: ( ( 'definedAs' ) )
            // InternalPactDSL.g:3069:1: ( 'definedAs' )
            {
            // InternalPactDSL.g:3069:1: ( 'definedAs' )
            // InternalPactDSL.g:3070:2: 'definedAs'
            {
             before(grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDefinedTermAccess().getDefinedAsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__0__Impl"


    // $ANTLR start "rule__DefinedTerm__Group__1"
    // InternalPactDSL.g:3079:1: rule__DefinedTerm__Group__1 : rule__DefinedTerm__Group__1__Impl ;
    public final void rule__DefinedTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3083:1: ( rule__DefinedTerm__Group__1__Impl )
            // InternalPactDSL.g:3084:2: rule__DefinedTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__1"


    // $ANTLR start "rule__DefinedTerm__Group__1__Impl"
    // InternalPactDSL.g:3090:1: rule__DefinedTerm__Group__1__Impl : ( ( rule__DefinedTerm__DefinitionAssignment_1 ) ) ;
    public final void rule__DefinedTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3094:1: ( ( ( rule__DefinedTerm__DefinitionAssignment_1 ) ) )
            // InternalPactDSL.g:3095:1: ( ( rule__DefinedTerm__DefinitionAssignment_1 ) )
            {
            // InternalPactDSL.g:3095:1: ( ( rule__DefinedTerm__DefinitionAssignment_1 ) )
            // InternalPactDSL.g:3096:2: ( rule__DefinedTerm__DefinitionAssignment_1 )
            {
             before(grammarAccess.getDefinedTermAccess().getDefinitionAssignment_1()); 
            // InternalPactDSL.g:3097:2: ( rule__DefinedTerm__DefinitionAssignment_1 )
            // InternalPactDSL.g:3097:3: rule__DefinedTerm__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefinedTerm__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefinedTermAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__Group__1__Impl"


    // $ANTLR start "rule__Address__Group__0"
    // InternalPactDSL.g:3106:1: rule__Address__Group__0 : rule__Address__Group__0__Impl rule__Address__Group__1 ;
    public final void rule__Address__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3110:1: ( rule__Address__Group__0__Impl rule__Address__Group__1 )
            // InternalPactDSL.g:3111:2: rule__Address__Group__0__Impl rule__Address__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Address__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Address__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0"


    // $ANTLR start "rule__Address__Group__0__Impl"
    // InternalPactDSL.g:3118:1: rule__Address__Group__0__Impl : ( 'withAddress' ) ;
    public final void rule__Address__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3122:1: ( ( 'withAddress' ) )
            // InternalPactDSL.g:3123:1: ( 'withAddress' )
            {
            // InternalPactDSL.g:3123:1: ( 'withAddress' )
            // InternalPactDSL.g:3124:2: 'withAddress'
            {
             before(grammarAccess.getAddressAccess().getWithAddressKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getWithAddressKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__0__Impl"


    // $ANTLR start "rule__Address__Group__1"
    // InternalPactDSL.g:3133:1: rule__Address__Group__1 : rule__Address__Group__1__Impl ;
    public final void rule__Address__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3137:1: ( rule__Address__Group__1__Impl )
            // InternalPactDSL.g:3138:2: rule__Address__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Address__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1"


    // $ANTLR start "rule__Address__Group__1__Impl"
    // InternalPactDSL.g:3144:1: rule__Address__Group__1__Impl : ( ( rule__Address__DefinitionAssignment_1 ) ) ;
    public final void rule__Address__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3148:1: ( ( ( rule__Address__DefinitionAssignment_1 ) ) )
            // InternalPactDSL.g:3149:1: ( ( rule__Address__DefinitionAssignment_1 ) )
            {
            // InternalPactDSL.g:3149:1: ( ( rule__Address__DefinitionAssignment_1 ) )
            // InternalPactDSL.g:3150:2: ( rule__Address__DefinitionAssignment_1 )
            {
             before(grammarAccess.getAddressAccess().getDefinitionAssignment_1()); 
            // InternalPactDSL.g:3151:2: ( rule__Address__DefinitionAssignment_1 )
            // InternalPactDSL.g:3151:3: rule__Address__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Address__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__Group__1__Impl"


    // $ANTLR start "rule__CompanyNumber__Group__0"
    // InternalPactDSL.g:3160:1: rule__CompanyNumber__Group__0 : rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1 ;
    public final void rule__CompanyNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3164:1: ( rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1 )
            // InternalPactDSL.g:3165:2: rule__CompanyNumber__Group__0__Impl rule__CompanyNumber__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CompanyNumber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__0"


    // $ANTLR start "rule__CompanyNumber__Group__0__Impl"
    // InternalPactDSL.g:3172:1: rule__CompanyNumber__Group__0__Impl : ( 'withCompanyNumber' ) ;
    public final void rule__CompanyNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3176:1: ( ( 'withCompanyNumber' ) )
            // InternalPactDSL.g:3177:1: ( 'withCompanyNumber' )
            {
            // InternalPactDSL.g:3177:1: ( 'withCompanyNumber' )
            // InternalPactDSL.g:3178:2: 'withCompanyNumber'
            {
             before(grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompanyNumberAccess().getWithCompanyNumberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__0__Impl"


    // $ANTLR start "rule__CompanyNumber__Group__1"
    // InternalPactDSL.g:3187:1: rule__CompanyNumber__Group__1 : rule__CompanyNumber__Group__1__Impl ;
    public final void rule__CompanyNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3191:1: ( rule__CompanyNumber__Group__1__Impl )
            // InternalPactDSL.g:3192:2: rule__CompanyNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__1"


    // $ANTLR start "rule__CompanyNumber__Group__1__Impl"
    // InternalPactDSL.g:3198:1: rule__CompanyNumber__Group__1__Impl : ( ( rule__CompanyNumber__DefinitionAssignment_1 ) ) ;
    public final void rule__CompanyNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3202:1: ( ( ( rule__CompanyNumber__DefinitionAssignment_1 ) ) )
            // InternalPactDSL.g:3203:1: ( ( rule__CompanyNumber__DefinitionAssignment_1 ) )
            {
            // InternalPactDSL.g:3203:1: ( ( rule__CompanyNumber__DefinitionAssignment_1 ) )
            // InternalPactDSL.g:3204:2: ( rule__CompanyNumber__DefinitionAssignment_1 )
            {
             before(grammarAccess.getCompanyNumberAccess().getDefinitionAssignment_1()); 
            // InternalPactDSL.g:3205:2: ( rule__CompanyNumber__DefinitionAssignment_1 )
            // InternalPactDSL.g:3205:3: rule__CompanyNumber__DefinitionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompanyNumber__DefinitionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyNumberAccess().getDefinitionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalPactDSL.g:3214:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3218:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalPactDSL.g:3219:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalPactDSL.g:3226:1: rule__Feature__Group__0__Impl : ( 'withFeature' ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3230:1: ( ( 'withFeature' ) )
            // InternalPactDSL.g:3231:1: ( 'withFeature' )
            {
            // InternalPactDSL.g:3231:1: ( 'withFeature' )
            // InternalPactDSL.g:3232:2: 'withFeature'
            {
             before(grammarAccess.getFeatureAccess().getWithFeatureKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getWithFeatureKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalPactDSL.g:3241:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3245:1: ( rule__Feature__Group__1__Impl )
            // InternalPactDSL.g:3246:2: rule__Feature__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalPactDSL.g:3252:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__FeatureAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3256:1: ( ( ( rule__Feature__FeatureAssignment_1 ) ) )
            // InternalPactDSL.g:3257:1: ( ( rule__Feature__FeatureAssignment_1 ) )
            {
            // InternalPactDSL.g:3257:1: ( ( rule__Feature__FeatureAssignment_1 ) )
            // InternalPactDSL.g:3258:2: ( rule__Feature__FeatureAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getFeatureAssignment_1()); 
            // InternalPactDSL.g:3259:2: ( rule__Feature__FeatureAssignment_1 )
            // InternalPactDSL.g:3259:3: rule__Feature__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__FeatureAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getFeatureAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__InWriting__Group__0"
    // InternalPactDSL.g:3268:1: rule__InWriting__Group__0 : rule__InWriting__Group__0__Impl rule__InWriting__Group__1 ;
    public final void rule__InWriting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3272:1: ( rule__InWriting__Group__0__Impl rule__InWriting__Group__1 )
            // InternalPactDSL.g:3273:2: rule__InWriting__Group__0__Impl rule__InWriting__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InWriting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InWriting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__0"


    // $ANTLR start "rule__InWriting__Group__0__Impl"
    // InternalPactDSL.g:3280:1: rule__InWriting__Group__0__Impl : ( 'inWriting' ) ;
    public final void rule__InWriting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3284:1: ( ( 'inWriting' ) )
            // InternalPactDSL.g:3285:1: ( 'inWriting' )
            {
            // InternalPactDSL.g:3285:1: ( 'inWriting' )
            // InternalPactDSL.g:3286:2: 'inWriting'
            {
             before(grammarAccess.getInWritingAccess().getInWritingKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getInWritingAccess().getInWritingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__0__Impl"


    // $ANTLR start "rule__InWriting__Group__1"
    // InternalPactDSL.g:3295:1: rule__InWriting__Group__1 : rule__InWriting__Group__1__Impl ;
    public final void rule__InWriting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3299:1: ( rule__InWriting__Group__1__Impl )
            // InternalPactDSL.g:3300:2: rule__InWriting__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__1"


    // $ANTLR start "rule__InWriting__Group__1__Impl"
    // InternalPactDSL.g:3306:1: rule__InWriting__Group__1__Impl : ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) ) ;
    public final void rule__InWriting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3310:1: ( ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) ) )
            // InternalPactDSL.g:3311:1: ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) )
            {
            // InternalPactDSL.g:3311:1: ( ( rule__InWriting__CustomWritingFormalityAssignment_1 ) )
            // InternalPactDSL.g:3312:2: ( rule__InWriting__CustomWritingFormalityAssignment_1 )
            {
             before(grammarAccess.getInWritingAccess().getCustomWritingFormalityAssignment_1()); 
            // InternalPactDSL.g:3313:2: ( rule__InWriting__CustomWritingFormalityAssignment_1 )
            // InternalPactDSL.g:3313:3: rule__InWriting__CustomWritingFormalityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InWriting__CustomWritingFormalityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInWritingAccess().getCustomWritingFormalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__Group__1__Impl"


    // $ANTLR start "rule__ByEmail__Group__0"
    // InternalPactDSL.g:3322:1: rule__ByEmail__Group__0 : rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1 ;
    public final void rule__ByEmail__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3326:1: ( rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1 )
            // InternalPactDSL.g:3327:2: rule__ByEmail__Group__0__Impl rule__ByEmail__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ByEmail__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__0"


    // $ANTLR start "rule__ByEmail__Group__0__Impl"
    // InternalPactDSL.g:3334:1: rule__ByEmail__Group__0__Impl : ( 'byEmail' ) ;
    public final void rule__ByEmail__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3338:1: ( ( 'byEmail' ) )
            // InternalPactDSL.g:3339:1: ( 'byEmail' )
            {
            // InternalPactDSL.g:3339:1: ( 'byEmail' )
            // InternalPactDSL.g:3340:2: 'byEmail'
            {
             before(grammarAccess.getByEmailAccess().getByEmailKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getByEmailKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__0__Impl"


    // $ANTLR start "rule__ByEmail__Group__1"
    // InternalPactDSL.g:3349:1: rule__ByEmail__Group__1 : rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2 ;
    public final void rule__ByEmail__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3353:1: ( rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2 )
            // InternalPactDSL.g:3354:2: rule__ByEmail__Group__1__Impl rule__ByEmail__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ByEmail__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__1"


    // $ANTLR start "rule__ByEmail__Group__1__Impl"
    // InternalPactDSL.g:3361:1: rule__ByEmail__Group__1__Impl : ( 'to' ) ;
    public final void rule__ByEmail__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3365:1: ( ( 'to' ) )
            // InternalPactDSL.g:3366:1: ( 'to' )
            {
            // InternalPactDSL.g:3366:1: ( 'to' )
            // InternalPactDSL.g:3367:2: 'to'
            {
             before(grammarAccess.getByEmailAccess().getToKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__1__Impl"


    // $ANTLR start "rule__ByEmail__Group__2"
    // InternalPactDSL.g:3376:1: rule__ByEmail__Group__2 : rule__ByEmail__Group__2__Impl ;
    public final void rule__ByEmail__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3380:1: ( rule__ByEmail__Group__2__Impl )
            // InternalPactDSL.g:3381:2: rule__ByEmail__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__2"


    // $ANTLR start "rule__ByEmail__Group__2__Impl"
    // InternalPactDSL.g:3387:1: rule__ByEmail__Group__2__Impl : ( ( rule__ByEmail__EmailAddressAssignment_2 ) ) ;
    public final void rule__ByEmail__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3391:1: ( ( ( rule__ByEmail__EmailAddressAssignment_2 ) ) )
            // InternalPactDSL.g:3392:1: ( ( rule__ByEmail__EmailAddressAssignment_2 ) )
            {
            // InternalPactDSL.g:3392:1: ( ( rule__ByEmail__EmailAddressAssignment_2 ) )
            // InternalPactDSL.g:3393:2: ( rule__ByEmail__EmailAddressAssignment_2 )
            {
             before(grammarAccess.getByEmailAccess().getEmailAddressAssignment_2()); 
            // InternalPactDSL.g:3394:2: ( rule__ByEmail__EmailAddressAssignment_2 )
            // InternalPactDSL.g:3394:3: rule__ByEmail__EmailAddressAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ByEmail__EmailAddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getByEmailAccess().getEmailAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__Group__2__Impl"


    // $ANTLR start "rule__GivingNotice__Group__0"
    // InternalPactDSL.g:3403:1: rule__GivingNotice__Group__0 : rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1 ;
    public final void rule__GivingNotice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3407:1: ( rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1 )
            // InternalPactDSL.g:3408:2: rule__GivingNotice__Group__0__Impl rule__GivingNotice__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__GivingNotice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__0"


    // $ANTLR start "rule__GivingNotice__Group__0__Impl"
    // InternalPactDSL.g:3415:1: rule__GivingNotice__Group__0__Impl : ( 'givingNoticeTo' ) ;
    public final void rule__GivingNotice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3419:1: ( ( 'givingNoticeTo' ) )
            // InternalPactDSL.g:3420:1: ( 'givingNoticeTo' )
            {
            // InternalPactDSL.g:3420:1: ( 'givingNoticeTo' )
            // InternalPactDSL.g:3421:2: 'givingNoticeTo'
            {
             before(grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getGivingNoticeToKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__0__Impl"


    // $ANTLR start "rule__GivingNotice__Group__1"
    // InternalPactDSL.g:3430:1: rule__GivingNotice__Group__1 : rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2 ;
    public final void rule__GivingNotice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3434:1: ( rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2 )
            // InternalPactDSL.g:3435:2: rule__GivingNotice__Group__1__Impl rule__GivingNotice__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__GivingNotice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__1"


    // $ANTLR start "rule__GivingNotice__Group__1__Impl"
    // InternalPactDSL.g:3442:1: rule__GivingNotice__Group__1__Impl : ( ( rule__GivingNotice__SuperTypeAssignment_1 ) ) ;
    public final void rule__GivingNotice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3446:1: ( ( ( rule__GivingNotice__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:3447:1: ( ( rule__GivingNotice__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:3447:1: ( ( rule__GivingNotice__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:3448:2: ( rule__GivingNotice__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:3449:2: ( rule__GivingNotice__SuperTypeAssignment_1 )
            // InternalPactDSL.g:3449:3: rule__GivingNotice__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__1__Impl"


    // $ANTLR start "rule__GivingNotice__Group__2"
    // InternalPactDSL.g:3457:1: rule__GivingNotice__Group__2 : rule__GivingNotice__Group__2__Impl ;
    public final void rule__GivingNotice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3461:1: ( rule__GivingNotice__Group__2__Impl )
            // InternalPactDSL.g:3462:2: rule__GivingNotice__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__2"


    // $ANTLR start "rule__GivingNotice__Group__2__Impl"
    // InternalPactDSL.g:3468:1: rule__GivingNotice__Group__2__Impl : ( ( rule__GivingNotice__Group_2__0 ) ) ;
    public final void rule__GivingNotice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3472:1: ( ( ( rule__GivingNotice__Group_2__0 ) ) )
            // InternalPactDSL.g:3473:1: ( ( rule__GivingNotice__Group_2__0 ) )
            {
            // InternalPactDSL.g:3473:1: ( ( rule__GivingNotice__Group_2__0 ) )
            // InternalPactDSL.g:3474:2: ( rule__GivingNotice__Group_2__0 )
            {
             before(grammarAccess.getGivingNoticeAccess().getGroup_2()); 
            // InternalPactDSL.g:3475:2: ( rule__GivingNotice__Group_2__0 )
            // InternalPactDSL.g:3475:3: rule__GivingNotice__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group__2__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__0"
    // InternalPactDSL.g:3484:1: rule__GivingNotice__Group_2__0 : rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1 ;
    public final void rule__GivingNotice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3488:1: ( rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1 )
            // InternalPactDSL.g:3489:2: rule__GivingNotice__Group_2__0__Impl rule__GivingNotice__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__GivingNotice__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__0"


    // $ANTLR start "rule__GivingNotice__Group_2__0__Impl"
    // InternalPactDSL.g:3496:1: rule__GivingNotice__Group_2__0__Impl : ( 'withDuration' ) ;
    public final void rule__GivingNotice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3500:1: ( ( 'withDuration' ) )
            // InternalPactDSL.g:3501:1: ( 'withDuration' )
            {
            // InternalPactDSL.g:3501:1: ( 'withDuration' )
            // InternalPactDSL.g:3502:2: 'withDuration'
            {
             before(grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getWithDurationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__0__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__1"
    // InternalPactDSL.g:3511:1: rule__GivingNotice__Group_2__1 : rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2 ;
    public final void rule__GivingNotice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3515:1: ( rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2 )
            // InternalPactDSL.g:3516:2: rule__GivingNotice__Group_2__1__Impl rule__GivingNotice__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__GivingNotice__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__1"


    // $ANTLR start "rule__GivingNotice__Group_2__1__Impl"
    // InternalPactDSL.g:3523:1: rule__GivingNotice__Group_2__1__Impl : ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) ) ;
    public final void rule__GivingNotice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3527:1: ( ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) ) )
            // InternalPactDSL.g:3528:1: ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) )
            {
            // InternalPactDSL.g:3528:1: ( ( rule__GivingNotice__NumDaysAssignment_2_1 ) )
            // InternalPactDSL.g:3529:2: ( rule__GivingNotice__NumDaysAssignment_2_1 )
            {
             before(grammarAccess.getGivingNoticeAccess().getNumDaysAssignment_2_1()); 
            // InternalPactDSL.g:3530:2: ( rule__GivingNotice__NumDaysAssignment_2_1 )
            // InternalPactDSL.g:3530:3: rule__GivingNotice__NumDaysAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__NumDaysAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGivingNoticeAccess().getNumDaysAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__1__Impl"


    // $ANTLR start "rule__GivingNotice__Group_2__2"
    // InternalPactDSL.g:3538:1: rule__GivingNotice__Group_2__2 : rule__GivingNotice__Group_2__2__Impl ;
    public final void rule__GivingNotice__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3542:1: ( rule__GivingNotice__Group_2__2__Impl )
            // InternalPactDSL.g:3543:2: rule__GivingNotice__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivingNotice__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__2"


    // $ANTLR start "rule__GivingNotice__Group_2__2__Impl"
    // InternalPactDSL.g:3549:1: rule__GivingNotice__Group_2__2__Impl : ( 'days' ) ;
    public final void rule__GivingNotice__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3553:1: ( ( 'days' ) )
            // InternalPactDSL.g:3554:1: ( 'days' )
            {
            // InternalPactDSL.g:3554:1: ( 'days' )
            // InternalPactDSL.g:3555:2: 'days'
            {
             before(grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getDaysKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__Group_2__2__Impl"


    // $ANTLR start "rule__CustomFormality__Group__0"
    // InternalPactDSL.g:3565:1: rule__CustomFormality__Group__0 : rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1 ;
    public final void rule__CustomFormality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3569:1: ( rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1 )
            // InternalPactDSL.g:3570:2: rule__CustomFormality__Group__0__Impl rule__CustomFormality__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CustomFormality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__0"


    // $ANTLR start "rule__CustomFormality__Group__0__Impl"
    // InternalPactDSL.g:3577:1: rule__CustomFormality__Group__0__Impl : ( 'ContractFormality' ) ;
    public final void rule__CustomFormality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3581:1: ( ( 'ContractFormality' ) )
            // InternalPactDSL.g:3582:1: ( 'ContractFormality' )
            {
            // InternalPactDSL.g:3582:1: ( 'ContractFormality' )
            // InternalPactDSL.g:3583:2: 'ContractFormality'
            {
             before(grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCustomFormalityAccess().getContractFormalityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__0__Impl"


    // $ANTLR start "rule__CustomFormality__Group__1"
    // InternalPactDSL.g:3592:1: rule__CustomFormality__Group__1 : rule__CustomFormality__Group__1__Impl ;
    public final void rule__CustomFormality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3596:1: ( rule__CustomFormality__Group__1__Impl )
            // InternalPactDSL.g:3597:2: rule__CustomFormality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__1"


    // $ANTLR start "rule__CustomFormality__Group__1__Impl"
    // InternalPactDSL.g:3603:1: rule__CustomFormality__Group__1__Impl : ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) ) ;
    public final void rule__CustomFormality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3607:1: ( ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) ) )
            // InternalPactDSL.g:3608:1: ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) )
            {
            // InternalPactDSL.g:3608:1: ( ( rule__CustomFormality__CustomFormalityAssignment_1 ) )
            // InternalPactDSL.g:3609:2: ( rule__CustomFormality__CustomFormalityAssignment_1 )
            {
             before(grammarAccess.getCustomFormalityAccess().getCustomFormalityAssignment_1()); 
            // InternalPactDSL.g:3610:2: ( rule__CustomFormality__CustomFormalityAssignment_1 )
            // InternalPactDSL.g:3610:3: rule__CustomFormality__CustomFormalityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomFormality__CustomFormalityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomFormalityAccess().getCustomFormalityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__Group__1__Impl"


    // $ANTLR start "rule__GivenConsent__Group__0"
    // InternalPactDSL.g:3619:1: rule__GivenConsent__Group__0 : rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1 ;
    public final void rule__GivenConsent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3623:1: ( rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1 )
            // InternalPactDSL.g:3624:2: rule__GivenConsent__Group__0__Impl rule__GivenConsent__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__GivenConsent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__0"


    // $ANTLR start "rule__GivenConsent__Group__0__Impl"
    // InternalPactDSL.g:3631:1: rule__GivenConsent__Group__0__Impl : ( ( rule__GivenConsent__SuperTypeAssignment_0 ) ) ;
    public final void rule__GivenConsent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3635:1: ( ( ( rule__GivenConsent__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3636:1: ( ( rule__GivenConsent__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3636:1: ( ( rule__GivenConsent__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3637:2: ( rule__GivenConsent__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3638:2: ( rule__GivenConsent__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3638:3: rule__GivenConsent__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenConsentAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__0__Impl"


    // $ANTLR start "rule__GivenConsent__Group__1"
    // InternalPactDSL.g:3646:1: rule__GivenConsent__Group__1 : rule__GivenConsent__Group__1__Impl ;
    public final void rule__GivenConsent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3650:1: ( rule__GivenConsent__Group__1__Impl )
            // InternalPactDSL.g:3651:2: rule__GivenConsent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivenConsent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__1"


    // $ANTLR start "rule__GivenConsent__Group__1__Impl"
    // InternalPactDSL.g:3657:1: rule__GivenConsent__Group__1__Impl : ( 'gaveConsent' ) ;
    public final void rule__GivenConsent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3661:1: ( ( 'gaveConsent' ) )
            // InternalPactDSL.g:3662:1: ( 'gaveConsent' )
            {
            // InternalPactDSL.g:3662:1: ( 'gaveConsent' )
            // InternalPactDSL.g:3663:2: 'gaveConsent'
            {
             before(grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getGivenConsentAccess().getGaveConsentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__Group__1__Impl"


    // $ANTLR start "rule__GivenWrittenConsent__Group__0"
    // InternalPactDSL.g:3673:1: rule__GivenWrittenConsent__Group__0 : rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1 ;
    public final void rule__GivenWrittenConsent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3677:1: ( rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1 )
            // InternalPactDSL.g:3678:2: rule__GivenWrittenConsent__Group__0__Impl rule__GivenWrittenConsent__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__GivenWrittenConsent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__0"


    // $ANTLR start "rule__GivenWrittenConsent__Group__0__Impl"
    // InternalPactDSL.g:3685:1: rule__GivenWrittenConsent__Group__0__Impl : ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) ) ;
    public final void rule__GivenWrittenConsent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3689:1: ( ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3690:1: ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3690:1: ( ( rule__GivenWrittenConsent__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3691:2: ( rule__GivenWrittenConsent__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3692:2: ( rule__GivenWrittenConsent__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3692:3: rule__GivenWrittenConsent__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__0__Impl"


    // $ANTLR start "rule__GivenWrittenConsent__Group__1"
    // InternalPactDSL.g:3700:1: rule__GivenWrittenConsent__Group__1 : rule__GivenWrittenConsent__Group__1__Impl ;
    public final void rule__GivenWrittenConsent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3704:1: ( rule__GivenWrittenConsent__Group__1__Impl )
            // InternalPactDSL.g:3705:2: rule__GivenWrittenConsent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GivenWrittenConsent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__1"


    // $ANTLR start "rule__GivenWrittenConsent__Group__1__Impl"
    // InternalPactDSL.g:3711:1: rule__GivenWrittenConsent__Group__1__Impl : ( 'gaveWrittenConsent' ) ;
    public final void rule__GivenWrittenConsent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3715:1: ( ( 'gaveWrittenConsent' ) )
            // InternalPactDSL.g:3716:1: ( 'gaveWrittenConsent' )
            {
            // InternalPactDSL.g:3716:1: ( 'gaveWrittenConsent' )
            // InternalPactDSL.g:3717:2: 'gaveWrittenConsent'
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getGivenWrittenConsentAccess().getGaveWrittenConsentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__Group__1__Impl"


    // $ANTLR start "rule__Ownership__Group__0"
    // InternalPactDSL.g:3727:1: rule__Ownership__Group__0 : rule__Ownership__Group__0__Impl rule__Ownership__Group__1 ;
    public final void rule__Ownership__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3731:1: ( rule__Ownership__Group__0__Impl rule__Ownership__Group__1 )
            // InternalPactDSL.g:3732:2: rule__Ownership__Group__0__Impl rule__Ownership__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Ownership__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__0"


    // $ANTLR start "rule__Ownership__Group__0__Impl"
    // InternalPactDSL.g:3739:1: rule__Ownership__Group__0__Impl : ( ( rule__Ownership__SuperTypeAssignment_0 ) ) ;
    public final void rule__Ownership__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3743:1: ( ( ( rule__Ownership__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3744:1: ( ( rule__Ownership__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3744:1: ( ( rule__Ownership__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3745:2: ( rule__Ownership__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3746:2: ( rule__Ownership__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3746:3: rule__Ownership__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__0__Impl"


    // $ANTLR start "rule__Ownership__Group__1"
    // InternalPactDSL.g:3754:1: rule__Ownership__Group__1 : rule__Ownership__Group__1__Impl rule__Ownership__Group__2 ;
    public final void rule__Ownership__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3758:1: ( rule__Ownership__Group__1__Impl rule__Ownership__Group__2 )
            // InternalPactDSL.g:3759:2: rule__Ownership__Group__1__Impl rule__Ownership__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Ownership__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__1"


    // $ANTLR start "rule__Ownership__Group__1__Impl"
    // InternalPactDSL.g:3766:1: rule__Ownership__Group__1__Impl : ( ( rule__Ownership__Alternatives_1 ) ) ;
    public final void rule__Ownership__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3770:1: ( ( ( rule__Ownership__Alternatives_1 ) ) )
            // InternalPactDSL.g:3771:1: ( ( rule__Ownership__Alternatives_1 ) )
            {
            // InternalPactDSL.g:3771:1: ( ( rule__Ownership__Alternatives_1 ) )
            // InternalPactDSL.g:3772:2: ( rule__Ownership__Alternatives_1 )
            {
             before(grammarAccess.getOwnershipAccess().getAlternatives_1()); 
            // InternalPactDSL.g:3773:2: ( rule__Ownership__Alternatives_1 )
            // InternalPactDSL.g:3773:3: rule__Ownership__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__1__Impl"


    // $ANTLR start "rule__Ownership__Group__2"
    // InternalPactDSL.g:3781:1: rule__Ownership__Group__2 : rule__Ownership__Group__2__Impl rule__Ownership__Group__3 ;
    public final void rule__Ownership__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3785:1: ( rule__Ownership__Group__2__Impl rule__Ownership__Group__3 )
            // InternalPactDSL.g:3786:2: rule__Ownership__Group__2__Impl rule__Ownership__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Ownership__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ownership__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__2"


    // $ANTLR start "rule__Ownership__Group__2__Impl"
    // InternalPactDSL.g:3793:1: rule__Ownership__Group__2__Impl : ( ( rule__Ownership__CustomOwnershipAssignment_2 )* ) ;
    public final void rule__Ownership__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3797:1: ( ( ( rule__Ownership__CustomOwnershipAssignment_2 )* ) )
            // InternalPactDSL.g:3798:1: ( ( rule__Ownership__CustomOwnershipAssignment_2 )* )
            {
            // InternalPactDSL.g:3798:1: ( ( rule__Ownership__CustomOwnershipAssignment_2 )* )
            // InternalPactDSL.g:3799:2: ( rule__Ownership__CustomOwnershipAssignment_2 )*
            {
             before(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_2()); 
            // InternalPactDSL.g:3800:2: ( rule__Ownership__CustomOwnershipAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_STRING) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalPactDSL.g:3800:3: rule__Ownership__CustomOwnershipAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Ownership__CustomOwnershipAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getOwnershipAccess().getCustomOwnershipAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__2__Impl"


    // $ANTLR start "rule__Ownership__Group__3"
    // InternalPactDSL.g:3808:1: rule__Ownership__Group__3 : rule__Ownership__Group__3__Impl ;
    public final void rule__Ownership__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3812:1: ( rule__Ownership__Group__3__Impl )
            // InternalPactDSL.g:3813:2: rule__Ownership__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__3"


    // $ANTLR start "rule__Ownership__Group__3__Impl"
    // InternalPactDSL.g:3819:1: rule__Ownership__Group__3__Impl : ( ( rule__Ownership__SuperTypeAssignment_3 ) ) ;
    public final void rule__Ownership__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3823:1: ( ( ( rule__Ownership__SuperTypeAssignment_3 ) ) )
            // InternalPactDSL.g:3824:1: ( ( rule__Ownership__SuperTypeAssignment_3 ) )
            {
            // InternalPactDSL.g:3824:1: ( ( rule__Ownership__SuperTypeAssignment_3 ) )
            // InternalPactDSL.g:3825:2: ( rule__Ownership__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_3()); 
            // InternalPactDSL.g:3826:2: ( rule__Ownership__SuperTypeAssignment_3 )
            // InternalPactDSL.g:3826:3: rule__Ownership__SuperTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Ownership__SuperTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__Group__3__Impl"


    // $ANTLR start "rule__RightToUse__Group__0"
    // InternalPactDSL.g:3835:1: rule__RightToUse__Group__0 : rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1 ;
    public final void rule__RightToUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3839:1: ( rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1 )
            // InternalPactDSL.g:3840:2: rule__RightToUse__Group__0__Impl rule__RightToUse__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__RightToUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__0"


    // $ANTLR start "rule__RightToUse__Group__0__Impl"
    // InternalPactDSL.g:3847:1: rule__RightToUse__Group__0__Impl : ( ( rule__RightToUse__SuperTypeAssignment_0 ) ) ;
    public final void rule__RightToUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3851:1: ( ( ( rule__RightToUse__SuperTypeAssignment_0 ) ) )
            // InternalPactDSL.g:3852:1: ( ( rule__RightToUse__SuperTypeAssignment_0 ) )
            {
            // InternalPactDSL.g:3852:1: ( ( rule__RightToUse__SuperTypeAssignment_0 ) )
            // InternalPactDSL.g:3853:2: ( rule__RightToUse__SuperTypeAssignment_0 )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_0()); 
            // InternalPactDSL.g:3854:2: ( rule__RightToUse__SuperTypeAssignment_0 )
            // InternalPactDSL.g:3854:3: rule__RightToUse__SuperTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__SuperTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__0__Impl"


    // $ANTLR start "rule__RightToUse__Group__1"
    // InternalPactDSL.g:3862:1: rule__RightToUse__Group__1 : rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2 ;
    public final void rule__RightToUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3866:1: ( rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2 )
            // InternalPactDSL.g:3867:2: rule__RightToUse__Group__1__Impl rule__RightToUse__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__RightToUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__1"


    // $ANTLR start "rule__RightToUse__Group__1__Impl"
    // InternalPactDSL.g:3874:1: rule__RightToUse__Group__1__Impl : ( ( rule__RightToUse__Alternatives_1 ) ) ;
    public final void rule__RightToUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3878:1: ( ( ( rule__RightToUse__Alternatives_1 ) ) )
            // InternalPactDSL.g:3879:1: ( ( rule__RightToUse__Alternatives_1 ) )
            {
            // InternalPactDSL.g:3879:1: ( ( rule__RightToUse__Alternatives_1 ) )
            // InternalPactDSL.g:3880:2: ( rule__RightToUse__Alternatives_1 )
            {
             before(grammarAccess.getRightToUseAccess().getAlternatives_1()); 
            // InternalPactDSL.g:3881:2: ( rule__RightToUse__Alternatives_1 )
            // InternalPactDSL.g:3881:3: rule__RightToUse__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__1__Impl"


    // $ANTLR start "rule__RightToUse__Group__2"
    // InternalPactDSL.g:3889:1: rule__RightToUse__Group__2 : rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3 ;
    public final void rule__RightToUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3893:1: ( rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3 )
            // InternalPactDSL.g:3894:2: rule__RightToUse__Group__2__Impl rule__RightToUse__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__RightToUse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__2"


    // $ANTLR start "rule__RightToUse__Group__2__Impl"
    // InternalPactDSL.g:3901:1: rule__RightToUse__Group__2__Impl : ( ( rule__RightToUse__CustomUsageAssignment_2 )* ) ;
    public final void rule__RightToUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3905:1: ( ( ( rule__RightToUse__CustomUsageAssignment_2 )* ) )
            // InternalPactDSL.g:3906:1: ( ( rule__RightToUse__CustomUsageAssignment_2 )* )
            {
            // InternalPactDSL.g:3906:1: ( ( rule__RightToUse__CustomUsageAssignment_2 )* )
            // InternalPactDSL.g:3907:2: ( rule__RightToUse__CustomUsageAssignment_2 )*
            {
             before(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_2()); 
            // InternalPactDSL.g:3908:2: ( rule__RightToUse__CustomUsageAssignment_2 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_STRING) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPactDSL.g:3908:3: rule__RightToUse__CustomUsageAssignment_2
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__RightToUse__CustomUsageAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getRightToUseAccess().getCustomUsageAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__2__Impl"


    // $ANTLR start "rule__RightToUse__Group__3"
    // InternalPactDSL.g:3916:1: rule__RightToUse__Group__3 : rule__RightToUse__Group__3__Impl ;
    public final void rule__RightToUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3920:1: ( rule__RightToUse__Group__3__Impl )
            // InternalPactDSL.g:3921:2: rule__RightToUse__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__3"


    // $ANTLR start "rule__RightToUse__Group__3__Impl"
    // InternalPactDSL.g:3927:1: rule__RightToUse__Group__3__Impl : ( ( rule__RightToUse__SuperTypeAssignment_3 ) ) ;
    public final void rule__RightToUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3931:1: ( ( ( rule__RightToUse__SuperTypeAssignment_3 ) ) )
            // InternalPactDSL.g:3932:1: ( ( rule__RightToUse__SuperTypeAssignment_3 ) )
            {
            // InternalPactDSL.g:3932:1: ( ( rule__RightToUse__SuperTypeAssignment_3 ) )
            // InternalPactDSL.g:3933:2: ( rule__RightToUse__SuperTypeAssignment_3 )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_3()); 
            // InternalPactDSL.g:3934:2: ( rule__RightToUse__SuperTypeAssignment_3 )
            // InternalPactDSL.g:3934:3: rule__RightToUse__SuperTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RightToUse__SuperTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__Group__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__0"
    // InternalPactDSL.g:3943:1: rule__PaymentObligation__Group__0 : rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1 ;
    public final void rule__PaymentObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3947:1: ( rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1 )
            // InternalPactDSL.g:3948:2: rule__PaymentObligation__Group__0__Impl rule__PaymentObligation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__PaymentObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__0"


    // $ANTLR start "rule__PaymentObligation__Group__0__Impl"
    // InternalPactDSL.g:3955:1: rule__PaymentObligation__Group__0__Impl : ( 'PaymentObligation:' ) ;
    public final void rule__PaymentObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3959:1: ( ( 'PaymentObligation:' ) )
            // InternalPactDSL.g:3960:1: ( 'PaymentObligation:' )
            {
            // InternalPactDSL.g:3960:1: ( 'PaymentObligation:' )
            // InternalPactDSL.g:3961:2: 'PaymentObligation:'
            {
             before(grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getPaymentObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__0__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__1"
    // InternalPactDSL.g:3970:1: rule__PaymentObligation__Group__1 : rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2 ;
    public final void rule__PaymentObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3974:1: ( rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2 )
            // InternalPactDSL.g:3975:2: rule__PaymentObligation__Group__1__Impl rule__PaymentObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__PaymentObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__1"


    // $ANTLR start "rule__PaymentObligation__Group__1__Impl"
    // InternalPactDSL.g:3982:1: rule__PaymentObligation__Group__1__Impl : ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__PaymentObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:3986:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:3987:1: ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:3987:1: ( ( rule__PaymentObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:3988:2: ( rule__PaymentObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:3989:2: ( rule__PaymentObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:3989:3: rule__PaymentObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__1__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__2"
    // InternalPactDSL.g:3997:1: rule__PaymentObligation__Group__2 : rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3 ;
    public final void rule__PaymentObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4001:1: ( rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3 )
            // InternalPactDSL.g:4002:2: rule__PaymentObligation__Group__2__Impl rule__PaymentObligation__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__PaymentObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__2"


    // $ANTLR start "rule__PaymentObligation__Group__2__Impl"
    // InternalPactDSL.g:4009:1: rule__PaymentObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__PaymentObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4013:1: ( ( 'must' ) )
            // InternalPactDSL.g:4014:1: ( 'must' )
            {
            // InternalPactDSL.g:4014:1: ( 'must' )
            // InternalPactDSL.g:4015:2: 'must'
            {
             before(grammarAccess.getPaymentObligationAccess().getMustKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__2__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__3"
    // InternalPactDSL.g:4024:1: rule__PaymentObligation__Group__3 : rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4 ;
    public final void rule__PaymentObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4028:1: ( rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4 )
            // InternalPactDSL.g:4029:2: rule__PaymentObligation__Group__3__Impl rule__PaymentObligation__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__PaymentObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__3"


    // $ANTLR start "rule__PaymentObligation__Group__3__Impl"
    // InternalPactDSL.g:4036:1: rule__PaymentObligation__Group__3__Impl : ( 'pay' ) ;
    public final void rule__PaymentObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4040:1: ( ( 'pay' ) )
            // InternalPactDSL.g:4041:1: ( 'pay' )
            {
            // InternalPactDSL.g:4041:1: ( 'pay' )
            // InternalPactDSL.g:4042:2: 'pay'
            {
             before(grammarAccess.getPaymentObligationAccess().getPayKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getPayKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__4"
    // InternalPactDSL.g:4051:1: rule__PaymentObligation__Group__4 : rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5 ;
    public final void rule__PaymentObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4055:1: ( rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5 )
            // InternalPactDSL.g:4056:2: rule__PaymentObligation__Group__4__Impl rule__PaymentObligation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__PaymentObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__4"


    // $ANTLR start "rule__PaymentObligation__Group__4__Impl"
    // InternalPactDSL.g:4063:1: rule__PaymentObligation__Group__4__Impl : ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) ) ;
    public final void rule__PaymentObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4067:1: ( ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) ) )
            // InternalPactDSL.g:4068:1: ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4068:1: ( ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* ) )
            // InternalPactDSL.g:4069:2: ( ( rule__PaymentObligation__SumAssignment_4 ) ) ( ( rule__PaymentObligation__SumAssignment_4 )* )
            {
            // InternalPactDSL.g:4069:2: ( ( rule__PaymentObligation__SumAssignment_4 ) )
            // InternalPactDSL.g:4070:3: ( rule__PaymentObligation__SumAssignment_4 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:4071:3: ( rule__PaymentObligation__SumAssignment_4 )
            // InternalPactDSL.g:4071:4: rule__PaymentObligation__SumAssignment_4
            {
            pushFollow(FOLLOW_20);
            rule__PaymentObligation__SumAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 

            }

            // InternalPactDSL.g:4074:2: ( ( rule__PaymentObligation__SumAssignment_4 )* )
            // InternalPactDSL.g:4075:3: ( rule__PaymentObligation__SumAssignment_4 )*
            {
             before(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 
            // InternalPactDSL.g:4076:3: ( rule__PaymentObligation__SumAssignment_4 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_INT) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalPactDSL.g:4076:4: rule__PaymentObligation__SumAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__PaymentObligation__SumAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getPaymentObligationAccess().getSumAssignment_4()); 

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
    // $ANTLR end "rule__PaymentObligation__Group__4__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__5"
    // InternalPactDSL.g:4085:1: rule__PaymentObligation__Group__5 : rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6 ;
    public final void rule__PaymentObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4089:1: ( rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6 )
            // InternalPactDSL.g:4090:2: rule__PaymentObligation__Group__5__Impl rule__PaymentObligation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__PaymentObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__5"


    // $ANTLR start "rule__PaymentObligation__Group__5__Impl"
    // InternalPactDSL.g:4097:1: rule__PaymentObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__PaymentObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4101:1: ( ( 'to' ) )
            // InternalPactDSL.g:4102:1: ( 'to' )
            {
            // InternalPactDSL.g:4102:1: ( 'to' )
            // InternalPactDSL.g:4103:2: 'to'
            {
             before(grammarAccess.getPaymentObligationAccess().getToKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__5__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__6"
    // InternalPactDSL.g:4112:1: rule__PaymentObligation__Group__6 : rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7 ;
    public final void rule__PaymentObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4116:1: ( rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7 )
            // InternalPactDSL.g:4117:2: rule__PaymentObligation__Group__6__Impl rule__PaymentObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__PaymentObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__6"


    // $ANTLR start "rule__PaymentObligation__Group__6__Impl"
    // InternalPactDSL.g:4124:1: rule__PaymentObligation__Group__6__Impl : ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__PaymentObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4128:1: ( ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4129:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4129:1: ( ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4130:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) ) ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4130:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4131:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4132:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4132:4: rule__PaymentObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__PaymentObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4135:2: ( ( rule__PaymentObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4136:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4137:3: ( rule__PaymentObligation__SuperTypeAssignment_6 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPactDSL.g:4137:4: rule__PaymentObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__PaymentObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getPaymentObligationAccess().getSuperTypeAssignment_6()); 

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
    // $ANTLR end "rule__PaymentObligation__Group__6__Impl"


    // $ANTLR start "rule__PaymentObligation__Group__7"
    // InternalPactDSL.g:4146:1: rule__PaymentObligation__Group__7 : rule__PaymentObligation__Group__7__Impl ;
    public final void rule__PaymentObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4150:1: ( rule__PaymentObligation__Group__7__Impl )
            // InternalPactDSL.g:4151:2: rule__PaymentObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__7"


    // $ANTLR start "rule__PaymentObligation__Group__7__Impl"
    // InternalPactDSL.g:4157:1: rule__PaymentObligation__Group__7__Impl : ( ( rule__PaymentObligation__Group_7__0 )? ) ;
    public final void rule__PaymentObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4161:1: ( ( ( rule__PaymentObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4162:1: ( ( rule__PaymentObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4162:1: ( ( rule__PaymentObligation__Group_7__0 )? )
            // InternalPactDSL.g:4163:2: ( rule__PaymentObligation__Group_7__0 )?
            {
             before(grammarAccess.getPaymentObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4164:2: ( rule__PaymentObligation__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalPactDSL.g:4164:3: rule__PaymentObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PaymentObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPaymentObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group__7__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__0"
    // InternalPactDSL.g:4173:1: rule__PaymentObligation__Group_7__0 : rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1 ;
    public final void rule__PaymentObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4177:1: ( rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1 )
            // InternalPactDSL.g:4178:2: rule__PaymentObligation__Group_7__0__Impl rule__PaymentObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__PaymentObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__0"


    // $ANTLR start "rule__PaymentObligation__Group_7__0__Impl"
    // InternalPactDSL.g:4185:1: rule__PaymentObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__PaymentObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4189:1: ( ( 'by' ) )
            // InternalPactDSL.g:4190:1: ( 'by' )
            {
            // InternalPactDSL.g:4190:1: ( 'by' )
            // InternalPactDSL.g:4191:2: 'by'
            {
             before(grammarAccess.getPaymentObligationAccess().getByKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__0__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__1"
    // InternalPactDSL.g:4200:1: rule__PaymentObligation__Group_7__1 : rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2 ;
    public final void rule__PaymentObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4204:1: ( rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2 )
            // InternalPactDSL.g:4205:2: rule__PaymentObligation__Group_7__1__Impl rule__PaymentObligation__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__PaymentObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__1"


    // $ANTLR start "rule__PaymentObligation__Group_7__1__Impl"
    // InternalPactDSL.g:4212:1: rule__PaymentObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__PaymentObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4216:1: ( ( 'date' ) )
            // InternalPactDSL.g:4217:1: ( 'date' )
            {
            // InternalPactDSL.g:4217:1: ( 'date' )
            // InternalPactDSL.g:4218:2: 'date'
            {
             before(grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__1__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__2"
    // InternalPactDSL.g:4227:1: rule__PaymentObligation__Group_7__2 : rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3 ;
    public final void rule__PaymentObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4231:1: ( rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3 )
            // InternalPactDSL.g:4232:2: rule__PaymentObligation__Group_7__2__Impl rule__PaymentObligation__Group_7__3
            {
            pushFollow(FOLLOW_19);
            rule__PaymentObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__2"


    // $ANTLR start "rule__PaymentObligation__Group_7__2__Impl"
    // InternalPactDSL.g:4239:1: rule__PaymentObligation__Group_7__2__Impl : ( ( rule__PaymentObligation__DayAssignment_7_2 ) ) ;
    public final void rule__PaymentObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4243:1: ( ( ( rule__PaymentObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4244:1: ( ( rule__PaymentObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4244:1: ( ( rule__PaymentObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4245:2: ( rule__PaymentObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getPaymentObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4246:2: ( rule__PaymentObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4246:3: rule__PaymentObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__2__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__3"
    // InternalPactDSL.g:4254:1: rule__PaymentObligation__Group_7__3 : rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4 ;
    public final void rule__PaymentObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4258:1: ( rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4 )
            // InternalPactDSL.g:4259:2: rule__PaymentObligation__Group_7__3__Impl rule__PaymentObligation__Group_7__4
            {
            pushFollow(FOLLOW_19);
            rule__PaymentObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__3"


    // $ANTLR start "rule__PaymentObligation__Group_7__3__Impl"
    // InternalPactDSL.g:4266:1: rule__PaymentObligation__Group_7__3__Impl : ( ( rule__PaymentObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__PaymentObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4270:1: ( ( ( rule__PaymentObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:4271:1: ( ( rule__PaymentObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:4271:1: ( ( rule__PaymentObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:4272:2: ( rule__PaymentObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getPaymentObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:4273:2: ( rule__PaymentObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:4273:3: rule__PaymentObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__3__Impl"


    // $ANTLR start "rule__PaymentObligation__Group_7__4"
    // InternalPactDSL.g:4281:1: rule__PaymentObligation__Group_7__4 : rule__PaymentObligation__Group_7__4__Impl ;
    public final void rule__PaymentObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4285:1: ( rule__PaymentObligation__Group_7__4__Impl )
            // InternalPactDSL.g:4286:2: rule__PaymentObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__4"


    // $ANTLR start "rule__PaymentObligation__Group_7__4__Impl"
    // InternalPactDSL.g:4292:1: rule__PaymentObligation__Group_7__4__Impl : ( ( rule__PaymentObligation__YearAssignment_7_4 ) ) ;
    public final void rule__PaymentObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4296:1: ( ( ( rule__PaymentObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:4297:1: ( ( rule__PaymentObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:4297:1: ( ( rule__PaymentObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:4298:2: ( rule__PaymentObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getPaymentObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:4299:2: ( rule__PaymentObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:4299:3: rule__PaymentObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__PaymentObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getPaymentObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__Group_7__4__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__0"
    // InternalPactDSL.g:4308:1: rule__DeliveryObligation__Group__0 : rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1 ;
    public final void rule__DeliveryObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4312:1: ( rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1 )
            // InternalPactDSL.g:4313:2: rule__DeliveryObligation__Group__0__Impl rule__DeliveryObligation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__DeliveryObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__0"


    // $ANTLR start "rule__DeliveryObligation__Group__0__Impl"
    // InternalPactDSL.g:4320:1: rule__DeliveryObligation__Group__0__Impl : ( 'DeliveryObligation:' ) ;
    public final void rule__DeliveryObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4324:1: ( ( 'DeliveryObligation:' ) )
            // InternalPactDSL.g:4325:1: ( 'DeliveryObligation:' )
            {
            // InternalPactDSL.g:4325:1: ( 'DeliveryObligation:' )
            // InternalPactDSL.g:4326:2: 'DeliveryObligation:'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDeliveryObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__0__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__1"
    // InternalPactDSL.g:4335:1: rule__DeliveryObligation__Group__1 : rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2 ;
    public final void rule__DeliveryObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4339:1: ( rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2 )
            // InternalPactDSL.g:4340:2: rule__DeliveryObligation__Group__1__Impl rule__DeliveryObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__DeliveryObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__1"


    // $ANTLR start "rule__DeliveryObligation__Group__1__Impl"
    // InternalPactDSL.g:4347:1: rule__DeliveryObligation__Group__1__Impl : ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__DeliveryObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4351:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4352:1: ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4352:1: ( ( rule__DeliveryObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4353:2: ( rule__DeliveryObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4354:2: ( rule__DeliveryObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4354:3: rule__DeliveryObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__1__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__2"
    // InternalPactDSL.g:4362:1: rule__DeliveryObligation__Group__2 : rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3 ;
    public final void rule__DeliveryObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4366:1: ( rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3 )
            // InternalPactDSL.g:4367:2: rule__DeliveryObligation__Group__2__Impl rule__DeliveryObligation__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__DeliveryObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__2"


    // $ANTLR start "rule__DeliveryObligation__Group__2__Impl"
    // InternalPactDSL.g:4374:1: rule__DeliveryObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__DeliveryObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4378:1: ( ( 'must' ) )
            // InternalPactDSL.g:4379:1: ( 'must' )
            {
            // InternalPactDSL.g:4379:1: ( 'must' )
            // InternalPactDSL.g:4380:2: 'must'
            {
             before(grammarAccess.getDeliveryObligationAccess().getMustKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__2__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__3"
    // InternalPactDSL.g:4389:1: rule__DeliveryObligation__Group__3 : rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4 ;
    public final void rule__DeliveryObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4393:1: ( rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4 )
            // InternalPactDSL.g:4394:2: rule__DeliveryObligation__Group__3__Impl rule__DeliveryObligation__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__DeliveryObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__3"


    // $ANTLR start "rule__DeliveryObligation__Group__3__Impl"
    // InternalPactDSL.g:4401:1: rule__DeliveryObligation__Group__3__Impl : ( 'deliver' ) ;
    public final void rule__DeliveryObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4405:1: ( ( 'deliver' ) )
            // InternalPactDSL.g:4406:1: ( 'deliver' )
            {
            // InternalPactDSL.g:4406:1: ( 'deliver' )
            // InternalPactDSL.g:4407:2: 'deliver'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDeliverKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__3__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__4"
    // InternalPactDSL.g:4416:1: rule__DeliveryObligation__Group__4 : rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5 ;
    public final void rule__DeliveryObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4420:1: ( rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5 )
            // InternalPactDSL.g:4421:2: rule__DeliveryObligation__Group__4__Impl rule__DeliveryObligation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__DeliveryObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__4"


    // $ANTLR start "rule__DeliveryObligation__Group__4__Impl"
    // InternalPactDSL.g:4428:1: rule__DeliveryObligation__Group__4__Impl : ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) ) ;
    public final void rule__DeliveryObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4432:1: ( ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) ) )
            // InternalPactDSL.g:4433:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4433:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* ) )
            // InternalPactDSL.g:4434:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* )
            {
            // InternalPactDSL.g:4434:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:4435:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4436:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )
            // InternalPactDSL.g:4436:4: rule__DeliveryObligation__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__DeliveryObligation__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 

            }

            // InternalPactDSL.g:4439:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_4 )* )
            // InternalPactDSL.g:4440:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )*
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4441:3: ( rule__DeliveryObligation__SuperTypeAssignment_4 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalPactDSL.g:4441:4: rule__DeliveryObligation__SuperTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeliveryObligation__SuperTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_4()); 

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
    // $ANTLR end "rule__DeliveryObligation__Group__4__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__5"
    // InternalPactDSL.g:4450:1: rule__DeliveryObligation__Group__5 : rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6 ;
    public final void rule__DeliveryObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4454:1: ( rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6 )
            // InternalPactDSL.g:4455:2: rule__DeliveryObligation__Group__5__Impl rule__DeliveryObligation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__DeliveryObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__5"


    // $ANTLR start "rule__DeliveryObligation__Group__5__Impl"
    // InternalPactDSL.g:4462:1: rule__DeliveryObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__DeliveryObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4466:1: ( ( 'to' ) )
            // InternalPactDSL.g:4467:1: ( 'to' )
            {
            // InternalPactDSL.g:4467:1: ( 'to' )
            // InternalPactDSL.g:4468:2: 'to'
            {
             before(grammarAccess.getDeliveryObligationAccess().getToKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__5__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__6"
    // InternalPactDSL.g:4477:1: rule__DeliveryObligation__Group__6 : rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7 ;
    public final void rule__DeliveryObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4481:1: ( rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7 )
            // InternalPactDSL.g:4482:2: rule__DeliveryObligation__Group__6__Impl rule__DeliveryObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__DeliveryObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__6"


    // $ANTLR start "rule__DeliveryObligation__Group__6__Impl"
    // InternalPactDSL.g:4489:1: rule__DeliveryObligation__Group__6__Impl : ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__DeliveryObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4493:1: ( ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4494:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4494:1: ( ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4495:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) ) ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4495:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4496:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4497:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4497:4: rule__DeliveryObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__DeliveryObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4500:2: ( ( rule__DeliveryObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4501:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4502:3: ( rule__DeliveryObligation__SuperTypeAssignment_6 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==RULE_ID) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPactDSL.g:4502:4: rule__DeliveryObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DeliveryObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeAssignment_6()); 

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
    // $ANTLR end "rule__DeliveryObligation__Group__6__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group__7"
    // InternalPactDSL.g:4511:1: rule__DeliveryObligation__Group__7 : rule__DeliveryObligation__Group__7__Impl ;
    public final void rule__DeliveryObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4515:1: ( rule__DeliveryObligation__Group__7__Impl )
            // InternalPactDSL.g:4516:2: rule__DeliveryObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__7"


    // $ANTLR start "rule__DeliveryObligation__Group__7__Impl"
    // InternalPactDSL.g:4522:1: rule__DeliveryObligation__Group__7__Impl : ( ( rule__DeliveryObligation__Group_7__0 )? ) ;
    public final void rule__DeliveryObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4526:1: ( ( ( rule__DeliveryObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4527:1: ( ( rule__DeliveryObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4527:1: ( ( rule__DeliveryObligation__Group_7__0 )? )
            // InternalPactDSL.g:4528:2: ( rule__DeliveryObligation__Group_7__0 )?
            {
             before(grammarAccess.getDeliveryObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4529:2: ( rule__DeliveryObligation__Group_7__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==46) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalPactDSL.g:4529:3: rule__DeliveryObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DeliveryObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeliveryObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group__7__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__0"
    // InternalPactDSL.g:4538:1: rule__DeliveryObligation__Group_7__0 : rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1 ;
    public final void rule__DeliveryObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4542:1: ( rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1 )
            // InternalPactDSL.g:4543:2: rule__DeliveryObligation__Group_7__0__Impl rule__DeliveryObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__DeliveryObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__0"


    // $ANTLR start "rule__DeliveryObligation__Group_7__0__Impl"
    // InternalPactDSL.g:4550:1: rule__DeliveryObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__DeliveryObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4554:1: ( ( 'by' ) )
            // InternalPactDSL.g:4555:1: ( 'by' )
            {
            // InternalPactDSL.g:4555:1: ( 'by' )
            // InternalPactDSL.g:4556:2: 'by'
            {
             before(grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__0__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__1"
    // InternalPactDSL.g:4565:1: rule__DeliveryObligation__Group_7__1 : rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2 ;
    public final void rule__DeliveryObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4569:1: ( rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2 )
            // InternalPactDSL.g:4570:2: rule__DeliveryObligation__Group_7__1__Impl rule__DeliveryObligation__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__DeliveryObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__1"


    // $ANTLR start "rule__DeliveryObligation__Group_7__1__Impl"
    // InternalPactDSL.g:4577:1: rule__DeliveryObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__DeliveryObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4581:1: ( ( 'date' ) )
            // InternalPactDSL.g:4582:1: ( 'date' )
            {
            // InternalPactDSL.g:4582:1: ( 'date' )
            // InternalPactDSL.g:4583:2: 'date'
            {
             before(grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__1__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__2"
    // InternalPactDSL.g:4592:1: rule__DeliveryObligation__Group_7__2 : rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3 ;
    public final void rule__DeliveryObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4596:1: ( rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3 )
            // InternalPactDSL.g:4597:2: rule__DeliveryObligation__Group_7__2__Impl rule__DeliveryObligation__Group_7__3
            {
            pushFollow(FOLLOW_19);
            rule__DeliveryObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__2"


    // $ANTLR start "rule__DeliveryObligation__Group_7__2__Impl"
    // InternalPactDSL.g:4604:1: rule__DeliveryObligation__Group_7__2__Impl : ( ( rule__DeliveryObligation__DayAssignment_7_2 ) ) ;
    public final void rule__DeliveryObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4608:1: ( ( ( rule__DeliveryObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4609:1: ( ( rule__DeliveryObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4609:1: ( ( rule__DeliveryObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4610:2: ( rule__DeliveryObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4611:2: ( rule__DeliveryObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4611:3: rule__DeliveryObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__2__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__3"
    // InternalPactDSL.g:4619:1: rule__DeliveryObligation__Group_7__3 : rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4 ;
    public final void rule__DeliveryObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4623:1: ( rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4 )
            // InternalPactDSL.g:4624:2: rule__DeliveryObligation__Group_7__3__Impl rule__DeliveryObligation__Group_7__4
            {
            pushFollow(FOLLOW_19);
            rule__DeliveryObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__3"


    // $ANTLR start "rule__DeliveryObligation__Group_7__3__Impl"
    // InternalPactDSL.g:4631:1: rule__DeliveryObligation__Group_7__3__Impl : ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__DeliveryObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4635:1: ( ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:4636:1: ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:4636:1: ( ( rule__DeliveryObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:4637:2: ( rule__DeliveryObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:4638:2: ( rule__DeliveryObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:4638:3: rule__DeliveryObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__3__Impl"


    // $ANTLR start "rule__DeliveryObligation__Group_7__4"
    // InternalPactDSL.g:4646:1: rule__DeliveryObligation__Group_7__4 : rule__DeliveryObligation__Group_7__4__Impl ;
    public final void rule__DeliveryObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4650:1: ( rule__DeliveryObligation__Group_7__4__Impl )
            // InternalPactDSL.g:4651:2: rule__DeliveryObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__4"


    // $ANTLR start "rule__DeliveryObligation__Group_7__4__Impl"
    // InternalPactDSL.g:4657:1: rule__DeliveryObligation__Group_7__4__Impl : ( ( rule__DeliveryObligation__YearAssignment_7_4 ) ) ;
    public final void rule__DeliveryObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4661:1: ( ( ( rule__DeliveryObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:4662:1: ( ( rule__DeliveryObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:4662:1: ( ( rule__DeliveryObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:4663:2: ( rule__DeliveryObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getDeliveryObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:4664:2: ( rule__DeliveryObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:4664:3: rule__DeliveryObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__DeliveryObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getDeliveryObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__Group_7__4__Impl"


    // $ANTLR start "rule__TransferObligation__Group__0"
    // InternalPactDSL.g:4673:1: rule__TransferObligation__Group__0 : rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1 ;
    public final void rule__TransferObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4677:1: ( rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1 )
            // InternalPactDSL.g:4678:2: rule__TransferObligation__Group__0__Impl rule__TransferObligation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__TransferObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__0"


    // $ANTLR start "rule__TransferObligation__Group__0__Impl"
    // InternalPactDSL.g:4685:1: rule__TransferObligation__Group__0__Impl : ( 'TransferObligation:' ) ;
    public final void rule__TransferObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4689:1: ( ( 'TransferObligation:' ) )
            // InternalPactDSL.g:4690:1: ( 'TransferObligation:' )
            {
            // InternalPactDSL.g:4690:1: ( 'TransferObligation:' )
            // InternalPactDSL.g:4691:2: 'TransferObligation:'
            {
             before(grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getTransferObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__0__Impl"


    // $ANTLR start "rule__TransferObligation__Group__1"
    // InternalPactDSL.g:4700:1: rule__TransferObligation__Group__1 : rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2 ;
    public final void rule__TransferObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4704:1: ( rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2 )
            // InternalPactDSL.g:4705:2: rule__TransferObligation__Group__1__Impl rule__TransferObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__TransferObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__1"


    // $ANTLR start "rule__TransferObligation__Group__1__Impl"
    // InternalPactDSL.g:4712:1: rule__TransferObligation__Group__1__Impl : ( ( rule__TransferObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__TransferObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4716:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:4717:1: ( ( rule__TransferObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:4717:1: ( ( rule__TransferObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:4718:2: ( rule__TransferObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:4719:2: ( rule__TransferObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:4719:3: rule__TransferObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__1__Impl"


    // $ANTLR start "rule__TransferObligation__Group__2"
    // InternalPactDSL.g:4727:1: rule__TransferObligation__Group__2 : rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3 ;
    public final void rule__TransferObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4731:1: ( rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3 )
            // InternalPactDSL.g:4732:2: rule__TransferObligation__Group__2__Impl rule__TransferObligation__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__TransferObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__2"


    // $ANTLR start "rule__TransferObligation__Group__2__Impl"
    // InternalPactDSL.g:4739:1: rule__TransferObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__TransferObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4743:1: ( ( 'must' ) )
            // InternalPactDSL.g:4744:1: ( 'must' )
            {
            // InternalPactDSL.g:4744:1: ( 'must' )
            // InternalPactDSL.g:4745:2: 'must'
            {
             before(grammarAccess.getTransferObligationAccess().getMustKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__2__Impl"


    // $ANTLR start "rule__TransferObligation__Group__3"
    // InternalPactDSL.g:4754:1: rule__TransferObligation__Group__3 : rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4 ;
    public final void rule__TransferObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4758:1: ( rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4 )
            // InternalPactDSL.g:4759:2: rule__TransferObligation__Group__3__Impl rule__TransferObligation__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__TransferObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__3"


    // $ANTLR start "rule__TransferObligation__Group__3__Impl"
    // InternalPactDSL.g:4766:1: rule__TransferObligation__Group__3__Impl : ( 'transfer' ) ;
    public final void rule__TransferObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4770:1: ( ( 'transfer' ) )
            // InternalPactDSL.g:4771:1: ( 'transfer' )
            {
            // InternalPactDSL.g:4771:1: ( 'transfer' )
            // InternalPactDSL.g:4772:2: 'transfer'
            {
             before(grammarAccess.getTransferObligationAccess().getTransferKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getTransferKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__3__Impl"


    // $ANTLR start "rule__TransferObligation__Group__4"
    // InternalPactDSL.g:4781:1: rule__TransferObligation__Group__4 : rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5 ;
    public final void rule__TransferObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4785:1: ( rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5 )
            // InternalPactDSL.g:4786:2: rule__TransferObligation__Group__4__Impl rule__TransferObligation__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__TransferObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__4"


    // $ANTLR start "rule__TransferObligation__Group__4__Impl"
    // InternalPactDSL.g:4793:1: rule__TransferObligation__Group__4__Impl : ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) ) ;
    public final void rule__TransferObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4797:1: ( ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) ) )
            // InternalPactDSL.g:4798:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) )
            {
            // InternalPactDSL.g:4798:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* ) )
            // InternalPactDSL.g:4799:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_4 )* )
            {
            // InternalPactDSL.g:4799:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 ) )
            // InternalPactDSL.g:4800:3: ( rule__TransferObligation__SuperTypeAssignment_4 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4801:3: ( rule__TransferObligation__SuperTypeAssignment_4 )
            // InternalPactDSL.g:4801:4: rule__TransferObligation__SuperTypeAssignment_4
            {
            pushFollow(FOLLOW_11);
            rule__TransferObligation__SuperTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 

            }

            // InternalPactDSL.g:4804:2: ( ( rule__TransferObligation__SuperTypeAssignment_4 )* )
            // InternalPactDSL.g:4805:3: ( rule__TransferObligation__SuperTypeAssignment_4 )*
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:4806:3: ( rule__TransferObligation__SuperTypeAssignment_4 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPactDSL.g:4806:4: rule__TransferObligation__SuperTypeAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TransferObligation__SuperTypeAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_4()); 

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
    // $ANTLR end "rule__TransferObligation__Group__4__Impl"


    // $ANTLR start "rule__TransferObligation__Group__5"
    // InternalPactDSL.g:4815:1: rule__TransferObligation__Group__5 : rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6 ;
    public final void rule__TransferObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4819:1: ( rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6 )
            // InternalPactDSL.g:4820:2: rule__TransferObligation__Group__5__Impl rule__TransferObligation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__TransferObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__5"


    // $ANTLR start "rule__TransferObligation__Group__5__Impl"
    // InternalPactDSL.g:4827:1: rule__TransferObligation__Group__5__Impl : ( 'to' ) ;
    public final void rule__TransferObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4831:1: ( ( 'to' ) )
            // InternalPactDSL.g:4832:1: ( 'to' )
            {
            // InternalPactDSL.g:4832:1: ( 'to' )
            // InternalPactDSL.g:4833:2: 'to'
            {
             before(grammarAccess.getTransferObligationAccess().getToKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__5__Impl"


    // $ANTLR start "rule__TransferObligation__Group__6"
    // InternalPactDSL.g:4842:1: rule__TransferObligation__Group__6 : rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7 ;
    public final void rule__TransferObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4846:1: ( rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7 )
            // InternalPactDSL.g:4847:2: rule__TransferObligation__Group__6__Impl rule__TransferObligation__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__TransferObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__6"


    // $ANTLR start "rule__TransferObligation__Group__6__Impl"
    // InternalPactDSL.g:4854:1: rule__TransferObligation__Group__6__Impl : ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__TransferObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4858:1: ( ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:4859:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:4859:1: ( ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:4860:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 ) ) ( ( rule__TransferObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:4860:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:4861:3: ( rule__TransferObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4862:3: ( rule__TransferObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:4862:4: rule__TransferObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__TransferObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:4865:2: ( ( rule__TransferObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:4866:3: ( rule__TransferObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:4867:3: ( rule__TransferObligation__SuperTypeAssignment_6 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPactDSL.g:4867:4: rule__TransferObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TransferObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getTransferObligationAccess().getSuperTypeAssignment_6()); 

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
    // $ANTLR end "rule__TransferObligation__Group__6__Impl"


    // $ANTLR start "rule__TransferObligation__Group__7"
    // InternalPactDSL.g:4876:1: rule__TransferObligation__Group__7 : rule__TransferObligation__Group__7__Impl ;
    public final void rule__TransferObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4880:1: ( rule__TransferObligation__Group__7__Impl )
            // InternalPactDSL.g:4881:2: rule__TransferObligation__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__7"


    // $ANTLR start "rule__TransferObligation__Group__7__Impl"
    // InternalPactDSL.g:4887:1: rule__TransferObligation__Group__7__Impl : ( ( rule__TransferObligation__Group_7__0 )? ) ;
    public final void rule__TransferObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4891:1: ( ( ( rule__TransferObligation__Group_7__0 )? ) )
            // InternalPactDSL.g:4892:1: ( ( rule__TransferObligation__Group_7__0 )? )
            {
            // InternalPactDSL.g:4892:1: ( ( rule__TransferObligation__Group_7__0 )? )
            // InternalPactDSL.g:4893:2: ( rule__TransferObligation__Group_7__0 )?
            {
             before(grammarAccess.getTransferObligationAccess().getGroup_7()); 
            // InternalPactDSL.g:4894:2: ( rule__TransferObligation__Group_7__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPactDSL.g:4894:3: rule__TransferObligation__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TransferObligation__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransferObligationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group__7__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__0"
    // InternalPactDSL.g:4903:1: rule__TransferObligation__Group_7__0 : rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1 ;
    public final void rule__TransferObligation__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4907:1: ( rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1 )
            // InternalPactDSL.g:4908:2: rule__TransferObligation__Group_7__0__Impl rule__TransferObligation__Group_7__1
            {
            pushFollow(FOLLOW_36);
            rule__TransferObligation__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__0"


    // $ANTLR start "rule__TransferObligation__Group_7__0__Impl"
    // InternalPactDSL.g:4915:1: rule__TransferObligation__Group_7__0__Impl : ( 'by' ) ;
    public final void rule__TransferObligation__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4919:1: ( ( 'by' ) )
            // InternalPactDSL.g:4920:1: ( 'by' )
            {
            // InternalPactDSL.g:4920:1: ( 'by' )
            // InternalPactDSL.g:4921:2: 'by'
            {
             before(grammarAccess.getTransferObligationAccess().getByKeyword_7_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getByKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__0__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__1"
    // InternalPactDSL.g:4930:1: rule__TransferObligation__Group_7__1 : rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2 ;
    public final void rule__TransferObligation__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4934:1: ( rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2 )
            // InternalPactDSL.g:4935:2: rule__TransferObligation__Group_7__1__Impl rule__TransferObligation__Group_7__2
            {
            pushFollow(FOLLOW_19);
            rule__TransferObligation__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__1"


    // $ANTLR start "rule__TransferObligation__Group_7__1__Impl"
    // InternalPactDSL.g:4942:1: rule__TransferObligation__Group_7__1__Impl : ( 'date' ) ;
    public final void rule__TransferObligation__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4946:1: ( ( 'date' ) )
            // InternalPactDSL.g:4947:1: ( 'date' )
            {
            // InternalPactDSL.g:4947:1: ( 'date' )
            // InternalPactDSL.g:4948:2: 'date'
            {
             before(grammarAccess.getTransferObligationAccess().getDateKeyword_7_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getDateKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__1__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__2"
    // InternalPactDSL.g:4957:1: rule__TransferObligation__Group_7__2 : rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3 ;
    public final void rule__TransferObligation__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4961:1: ( rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3 )
            // InternalPactDSL.g:4962:2: rule__TransferObligation__Group_7__2__Impl rule__TransferObligation__Group_7__3
            {
            pushFollow(FOLLOW_19);
            rule__TransferObligation__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__2"


    // $ANTLR start "rule__TransferObligation__Group_7__2__Impl"
    // InternalPactDSL.g:4969:1: rule__TransferObligation__Group_7__2__Impl : ( ( rule__TransferObligation__DayAssignment_7_2 ) ) ;
    public final void rule__TransferObligation__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4973:1: ( ( ( rule__TransferObligation__DayAssignment_7_2 ) ) )
            // InternalPactDSL.g:4974:1: ( ( rule__TransferObligation__DayAssignment_7_2 ) )
            {
            // InternalPactDSL.g:4974:1: ( ( rule__TransferObligation__DayAssignment_7_2 ) )
            // InternalPactDSL.g:4975:2: ( rule__TransferObligation__DayAssignment_7_2 )
            {
             before(grammarAccess.getTransferObligationAccess().getDayAssignment_7_2()); 
            // InternalPactDSL.g:4976:2: ( rule__TransferObligation__DayAssignment_7_2 )
            // InternalPactDSL.g:4976:3: rule__TransferObligation__DayAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__DayAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getDayAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__2__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__3"
    // InternalPactDSL.g:4984:1: rule__TransferObligation__Group_7__3 : rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4 ;
    public final void rule__TransferObligation__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:4988:1: ( rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4 )
            // InternalPactDSL.g:4989:2: rule__TransferObligation__Group_7__3__Impl rule__TransferObligation__Group_7__4
            {
            pushFollow(FOLLOW_19);
            rule__TransferObligation__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__3"


    // $ANTLR start "rule__TransferObligation__Group_7__3__Impl"
    // InternalPactDSL.g:4996:1: rule__TransferObligation__Group_7__3__Impl : ( ( rule__TransferObligation__MonthAssignment_7_3 ) ) ;
    public final void rule__TransferObligation__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5000:1: ( ( ( rule__TransferObligation__MonthAssignment_7_3 ) ) )
            // InternalPactDSL.g:5001:1: ( ( rule__TransferObligation__MonthAssignment_7_3 ) )
            {
            // InternalPactDSL.g:5001:1: ( ( rule__TransferObligation__MonthAssignment_7_3 ) )
            // InternalPactDSL.g:5002:2: ( rule__TransferObligation__MonthAssignment_7_3 )
            {
             before(grammarAccess.getTransferObligationAccess().getMonthAssignment_7_3()); 
            // InternalPactDSL.g:5003:2: ( rule__TransferObligation__MonthAssignment_7_3 )
            // InternalPactDSL.g:5003:3: rule__TransferObligation__MonthAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__MonthAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getMonthAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__3__Impl"


    // $ANTLR start "rule__TransferObligation__Group_7__4"
    // InternalPactDSL.g:5011:1: rule__TransferObligation__Group_7__4 : rule__TransferObligation__Group_7__4__Impl ;
    public final void rule__TransferObligation__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5015:1: ( rule__TransferObligation__Group_7__4__Impl )
            // InternalPactDSL.g:5016:2: rule__TransferObligation__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__4"


    // $ANTLR start "rule__TransferObligation__Group_7__4__Impl"
    // InternalPactDSL.g:5022:1: rule__TransferObligation__Group_7__4__Impl : ( ( rule__TransferObligation__YearAssignment_7_4 ) ) ;
    public final void rule__TransferObligation__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5026:1: ( ( ( rule__TransferObligation__YearAssignment_7_4 ) ) )
            // InternalPactDSL.g:5027:1: ( ( rule__TransferObligation__YearAssignment_7_4 ) )
            {
            // InternalPactDSL.g:5027:1: ( ( rule__TransferObligation__YearAssignment_7_4 ) )
            // InternalPactDSL.g:5028:2: ( rule__TransferObligation__YearAssignment_7_4 )
            {
             before(grammarAccess.getTransferObligationAccess().getYearAssignment_7_4()); 
            // InternalPactDSL.g:5029:2: ( rule__TransferObligation__YearAssignment_7_4 )
            // InternalPactDSL.g:5029:3: rule__TransferObligation__YearAssignment_7_4
            {
            pushFollow(FOLLOW_2);
            rule__TransferObligation__YearAssignment_7_4();

            state._fsp--;


            }

             after(grammarAccess.getTransferObligationAccess().getYearAssignment_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__Group_7__4__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__0"
    // InternalPactDSL.g:5038:1: rule__LicenceObligation__Group__0 : rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1 ;
    public final void rule__LicenceObligation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5042:1: ( rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1 )
            // InternalPactDSL.g:5043:2: rule__LicenceObligation__Group__0__Impl rule__LicenceObligation__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__LicenceObligation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__0"


    // $ANTLR start "rule__LicenceObligation__Group__0__Impl"
    // InternalPactDSL.g:5050:1: rule__LicenceObligation__Group__0__Impl : ( 'LicenceObligation:' ) ;
    public final void rule__LicenceObligation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5054:1: ( ( 'LicenceObligation:' ) )
            // InternalPactDSL.g:5055:1: ( 'LicenceObligation:' )
            {
            // InternalPactDSL.g:5055:1: ( 'LicenceObligation:' )
            // InternalPactDSL.g:5056:2: 'LicenceObligation:'
            {
             before(grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getLicenceObligationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__0__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__1"
    // InternalPactDSL.g:5065:1: rule__LicenceObligation__Group__1 : rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2 ;
    public final void rule__LicenceObligation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5069:1: ( rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2 )
            // InternalPactDSL.g:5070:2: rule__LicenceObligation__Group__1__Impl rule__LicenceObligation__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__LicenceObligation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__1"


    // $ANTLR start "rule__LicenceObligation__Group__1__Impl"
    // InternalPactDSL.g:5077:1: rule__LicenceObligation__Group__1__Impl : ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) ) ;
    public final void rule__LicenceObligation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5081:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5082:1: ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5082:1: ( ( rule__LicenceObligation__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5083:2: ( rule__LicenceObligation__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5084:2: ( rule__LicenceObligation__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5084:3: rule__LicenceObligation__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__1__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__2"
    // InternalPactDSL.g:5092:1: rule__LicenceObligation__Group__2 : rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3 ;
    public final void rule__LicenceObligation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5096:1: ( rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3 )
            // InternalPactDSL.g:5097:2: rule__LicenceObligation__Group__2__Impl rule__LicenceObligation__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__LicenceObligation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__2"


    // $ANTLR start "rule__LicenceObligation__Group__2__Impl"
    // InternalPactDSL.g:5104:1: rule__LicenceObligation__Group__2__Impl : ( 'must' ) ;
    public final void rule__LicenceObligation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5108:1: ( ( 'must' ) )
            // InternalPactDSL.g:5109:1: ( 'must' )
            {
            // InternalPactDSL.g:5109:1: ( 'must' )
            // InternalPactDSL.g:5110:2: 'must'
            {
             before(grammarAccess.getLicenceObligationAccess().getMustKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getMustKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__2__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__3"
    // InternalPactDSL.g:5119:1: rule__LicenceObligation__Group__3 : rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4 ;
    public final void rule__LicenceObligation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5123:1: ( rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4 )
            // InternalPactDSL.g:5124:2: rule__LicenceObligation__Group__3__Impl rule__LicenceObligation__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__LicenceObligation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__3"


    // $ANTLR start "rule__LicenceObligation__Group__3__Impl"
    // InternalPactDSL.g:5131:1: rule__LicenceObligation__Group__3__Impl : ( 'grant' ) ;
    public final void rule__LicenceObligation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5135:1: ( ( 'grant' ) )
            // InternalPactDSL.g:5136:1: ( 'grant' )
            {
            // InternalPactDSL.g:5136:1: ( 'grant' )
            // InternalPactDSL.g:5137:2: 'grant'
            {
             before(grammarAccess.getLicenceObligationAccess().getGrantKeyword_3()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getGrantKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__3__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__4"
    // InternalPactDSL.g:5146:1: rule__LicenceObligation__Group__4 : rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5 ;
    public final void rule__LicenceObligation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5150:1: ( rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5 )
            // InternalPactDSL.g:5151:2: rule__LicenceObligation__Group__4__Impl rule__LicenceObligation__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__LicenceObligation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__4"


    // $ANTLR start "rule__LicenceObligation__Group__4__Impl"
    // InternalPactDSL.g:5158:1: rule__LicenceObligation__Group__4__Impl : ( 'Licence' ) ;
    public final void rule__LicenceObligation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5162:1: ( ( 'Licence' ) )
            // InternalPactDSL.g:5163:1: ( 'Licence' )
            {
            // InternalPactDSL.g:5163:1: ( 'Licence' )
            // InternalPactDSL.g:5164:2: 'Licence'
            {
             before(grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getLicenceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__4__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__5"
    // InternalPactDSL.g:5173:1: rule__LicenceObligation__Group__5 : rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6 ;
    public final void rule__LicenceObligation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5177:1: ( rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6 )
            // InternalPactDSL.g:5178:2: rule__LicenceObligation__Group__5__Impl rule__LicenceObligation__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__LicenceObligation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__5"


    // $ANTLR start "rule__LicenceObligation__Group__5__Impl"
    // InternalPactDSL.g:5185:1: rule__LicenceObligation__Group__5__Impl : ( 'in' ) ;
    public final void rule__LicenceObligation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5189:1: ( ( 'in' ) )
            // InternalPactDSL.g:5190:1: ( 'in' )
            {
            // InternalPactDSL.g:5190:1: ( 'in' )
            // InternalPactDSL.g:5191:2: 'in'
            {
             before(grammarAccess.getLicenceObligationAccess().getInKeyword_5()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__5__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__6"
    // InternalPactDSL.g:5200:1: rule__LicenceObligation__Group__6 : rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7 ;
    public final void rule__LicenceObligation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5204:1: ( rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7 )
            // InternalPactDSL.g:5205:2: rule__LicenceObligation__Group__6__Impl rule__LicenceObligation__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__LicenceObligation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__6"


    // $ANTLR start "rule__LicenceObligation__Group__6__Impl"
    // InternalPactDSL.g:5212:1: rule__LicenceObligation__Group__6__Impl : ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) ) ;
    public final void rule__LicenceObligation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5216:1: ( ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) ) )
            // InternalPactDSL.g:5217:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) )
            {
            // InternalPactDSL.g:5217:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* ) )
            // InternalPactDSL.g:5218:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* )
            {
            // InternalPactDSL.g:5218:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 ) )
            // InternalPactDSL.g:5219:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5220:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )
            // InternalPactDSL.g:5220:4: rule__LicenceObligation__SuperTypeAssignment_6
            {
            pushFollow(FOLLOW_11);
            rule__LicenceObligation__SuperTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 

            }

            // InternalPactDSL.g:5223:2: ( ( rule__LicenceObligation__SuperTypeAssignment_6 )* )
            // InternalPactDSL.g:5224:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 
            // InternalPactDSL.g:5225:3: ( rule__LicenceObligation__SuperTypeAssignment_6 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPactDSL.g:5225:4: rule__LicenceObligation__SuperTypeAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LicenceObligation__SuperTypeAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_6()); 

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
    // $ANTLR end "rule__LicenceObligation__Group__6__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__7"
    // InternalPactDSL.g:5234:1: rule__LicenceObligation__Group__7 : rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8 ;
    public final void rule__LicenceObligation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5238:1: ( rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8 )
            // InternalPactDSL.g:5239:2: rule__LicenceObligation__Group__7__Impl rule__LicenceObligation__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__LicenceObligation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__7"


    // $ANTLR start "rule__LicenceObligation__Group__7__Impl"
    // InternalPactDSL.g:5246:1: rule__LicenceObligation__Group__7__Impl : ( 'to' ) ;
    public final void rule__LicenceObligation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5250:1: ( ( 'to' ) )
            // InternalPactDSL.g:5251:1: ( 'to' )
            {
            // InternalPactDSL.g:5251:1: ( 'to' )
            // InternalPactDSL.g:5252:2: 'to'
            {
             before(grammarAccess.getLicenceObligationAccess().getToKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getToKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__7__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__8"
    // InternalPactDSL.g:5261:1: rule__LicenceObligation__Group__8 : rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9 ;
    public final void rule__LicenceObligation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5265:1: ( rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9 )
            // InternalPactDSL.g:5266:2: rule__LicenceObligation__Group__8__Impl rule__LicenceObligation__Group__9
            {
            pushFollow(FOLLOW_35);
            rule__LicenceObligation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__8"


    // $ANTLR start "rule__LicenceObligation__Group__8__Impl"
    // InternalPactDSL.g:5273:1: rule__LicenceObligation__Group__8__Impl : ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) ) ;
    public final void rule__LicenceObligation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5277:1: ( ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) ) )
            // InternalPactDSL.g:5278:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) )
            {
            // InternalPactDSL.g:5278:1: ( ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* ) )
            // InternalPactDSL.g:5279:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) ) ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* )
            {
            // InternalPactDSL.g:5279:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 ) )
            // InternalPactDSL.g:5280:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 
            // InternalPactDSL.g:5281:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )
            // InternalPactDSL.g:5281:4: rule__LicenceObligation__SuperTypeAssignment_8
            {
            pushFollow(FOLLOW_11);
            rule__LicenceObligation__SuperTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 

            }

            // InternalPactDSL.g:5284:2: ( ( rule__LicenceObligation__SuperTypeAssignment_8 )* )
            // InternalPactDSL.g:5285:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )*
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 
            // InternalPactDSL.g:5286:3: ( rule__LicenceObligation__SuperTypeAssignment_8 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPactDSL.g:5286:4: rule__LicenceObligation__SuperTypeAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LicenceObligation__SuperTypeAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeAssignment_8()); 

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
    // $ANTLR end "rule__LicenceObligation__Group__8__Impl"


    // $ANTLR start "rule__LicenceObligation__Group__9"
    // InternalPactDSL.g:5295:1: rule__LicenceObligation__Group__9 : rule__LicenceObligation__Group__9__Impl ;
    public final void rule__LicenceObligation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5299:1: ( rule__LicenceObligation__Group__9__Impl )
            // InternalPactDSL.g:5300:2: rule__LicenceObligation__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__9"


    // $ANTLR start "rule__LicenceObligation__Group__9__Impl"
    // InternalPactDSL.g:5306:1: rule__LicenceObligation__Group__9__Impl : ( ( rule__LicenceObligation__Group_9__0 )? ) ;
    public final void rule__LicenceObligation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5310:1: ( ( ( rule__LicenceObligation__Group_9__0 )? ) )
            // InternalPactDSL.g:5311:1: ( ( rule__LicenceObligation__Group_9__0 )? )
            {
            // InternalPactDSL.g:5311:1: ( ( rule__LicenceObligation__Group_9__0 )? )
            // InternalPactDSL.g:5312:2: ( rule__LicenceObligation__Group_9__0 )?
            {
             before(grammarAccess.getLicenceObligationAccess().getGroup_9()); 
            // InternalPactDSL.g:5313:2: ( rule__LicenceObligation__Group_9__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPactDSL.g:5313:3: rule__LicenceObligation__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LicenceObligation__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLicenceObligationAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group__9__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__0"
    // InternalPactDSL.g:5322:1: rule__LicenceObligation__Group_9__0 : rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1 ;
    public final void rule__LicenceObligation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5326:1: ( rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1 )
            // InternalPactDSL.g:5327:2: rule__LicenceObligation__Group_9__0__Impl rule__LicenceObligation__Group_9__1
            {
            pushFollow(FOLLOW_36);
            rule__LicenceObligation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__0"


    // $ANTLR start "rule__LicenceObligation__Group_9__0__Impl"
    // InternalPactDSL.g:5334:1: rule__LicenceObligation__Group_9__0__Impl : ( 'by' ) ;
    public final void rule__LicenceObligation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5338:1: ( ( 'by' ) )
            // InternalPactDSL.g:5339:1: ( 'by' )
            {
            // InternalPactDSL.g:5339:1: ( 'by' )
            // InternalPactDSL.g:5340:2: 'by'
            {
             before(grammarAccess.getLicenceObligationAccess().getByKeyword_9_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getByKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__0__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__1"
    // InternalPactDSL.g:5349:1: rule__LicenceObligation__Group_9__1 : rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2 ;
    public final void rule__LicenceObligation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5353:1: ( rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2 )
            // InternalPactDSL.g:5354:2: rule__LicenceObligation__Group_9__1__Impl rule__LicenceObligation__Group_9__2
            {
            pushFollow(FOLLOW_19);
            rule__LicenceObligation__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__1"


    // $ANTLR start "rule__LicenceObligation__Group_9__1__Impl"
    // InternalPactDSL.g:5361:1: rule__LicenceObligation__Group_9__1__Impl : ( 'date' ) ;
    public final void rule__LicenceObligation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5365:1: ( ( 'date' ) )
            // InternalPactDSL.g:5366:1: ( 'date' )
            {
            // InternalPactDSL.g:5366:1: ( 'date' )
            // InternalPactDSL.g:5367:2: 'date'
            {
             before(grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getDateKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__1__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__2"
    // InternalPactDSL.g:5376:1: rule__LicenceObligation__Group_9__2 : rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3 ;
    public final void rule__LicenceObligation__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5380:1: ( rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3 )
            // InternalPactDSL.g:5381:2: rule__LicenceObligation__Group_9__2__Impl rule__LicenceObligation__Group_9__3
            {
            pushFollow(FOLLOW_19);
            rule__LicenceObligation__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__2"


    // $ANTLR start "rule__LicenceObligation__Group_9__2__Impl"
    // InternalPactDSL.g:5388:1: rule__LicenceObligation__Group_9__2__Impl : ( ( rule__LicenceObligation__DayAssignment_9_2 ) ) ;
    public final void rule__LicenceObligation__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5392:1: ( ( ( rule__LicenceObligation__DayAssignment_9_2 ) ) )
            // InternalPactDSL.g:5393:1: ( ( rule__LicenceObligation__DayAssignment_9_2 ) )
            {
            // InternalPactDSL.g:5393:1: ( ( rule__LicenceObligation__DayAssignment_9_2 ) )
            // InternalPactDSL.g:5394:2: ( rule__LicenceObligation__DayAssignment_9_2 )
            {
             before(grammarAccess.getLicenceObligationAccess().getDayAssignment_9_2()); 
            // InternalPactDSL.g:5395:2: ( rule__LicenceObligation__DayAssignment_9_2 )
            // InternalPactDSL.g:5395:3: rule__LicenceObligation__DayAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__DayAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getDayAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__2__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__3"
    // InternalPactDSL.g:5403:1: rule__LicenceObligation__Group_9__3 : rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4 ;
    public final void rule__LicenceObligation__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5407:1: ( rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4 )
            // InternalPactDSL.g:5408:2: rule__LicenceObligation__Group_9__3__Impl rule__LicenceObligation__Group_9__4
            {
            pushFollow(FOLLOW_19);
            rule__LicenceObligation__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__3"


    // $ANTLR start "rule__LicenceObligation__Group_9__3__Impl"
    // InternalPactDSL.g:5415:1: rule__LicenceObligation__Group_9__3__Impl : ( ( rule__LicenceObligation__MonthAssignment_9_3 ) ) ;
    public final void rule__LicenceObligation__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5419:1: ( ( ( rule__LicenceObligation__MonthAssignment_9_3 ) ) )
            // InternalPactDSL.g:5420:1: ( ( rule__LicenceObligation__MonthAssignment_9_3 ) )
            {
            // InternalPactDSL.g:5420:1: ( ( rule__LicenceObligation__MonthAssignment_9_3 ) )
            // InternalPactDSL.g:5421:2: ( rule__LicenceObligation__MonthAssignment_9_3 )
            {
             before(grammarAccess.getLicenceObligationAccess().getMonthAssignment_9_3()); 
            // InternalPactDSL.g:5422:2: ( rule__LicenceObligation__MonthAssignment_9_3 )
            // InternalPactDSL.g:5422:3: rule__LicenceObligation__MonthAssignment_9_3
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__MonthAssignment_9_3();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getMonthAssignment_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__3__Impl"


    // $ANTLR start "rule__LicenceObligation__Group_9__4"
    // InternalPactDSL.g:5430:1: rule__LicenceObligation__Group_9__4 : rule__LicenceObligation__Group_9__4__Impl ;
    public final void rule__LicenceObligation__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5434:1: ( rule__LicenceObligation__Group_9__4__Impl )
            // InternalPactDSL.g:5435:2: rule__LicenceObligation__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__4"


    // $ANTLR start "rule__LicenceObligation__Group_9__4__Impl"
    // InternalPactDSL.g:5441:1: rule__LicenceObligation__Group_9__4__Impl : ( ( rule__LicenceObligation__YearAssignment_9_4 ) ) ;
    public final void rule__LicenceObligation__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5445:1: ( ( ( rule__LicenceObligation__YearAssignment_9_4 ) ) )
            // InternalPactDSL.g:5446:1: ( ( rule__LicenceObligation__YearAssignment_9_4 ) )
            {
            // InternalPactDSL.g:5446:1: ( ( rule__LicenceObligation__YearAssignment_9_4 ) )
            // InternalPactDSL.g:5447:2: ( rule__LicenceObligation__YearAssignment_9_4 )
            {
             before(grammarAccess.getLicenceObligationAccess().getYearAssignment_9_4()); 
            // InternalPactDSL.g:5448:2: ( rule__LicenceObligation__YearAssignment_9_4 )
            // InternalPactDSL.g:5448:3: rule__LicenceObligation__YearAssignment_9_4
            {
            pushFollow(FOLLOW_2);
            rule__LicenceObligation__YearAssignment_9_4();

            state._fsp--;


            }

             after(grammarAccess.getLicenceObligationAccess().getYearAssignment_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__Group_9__4__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__0"
    // InternalPactDSL.g:5457:1: rule__ConstraintParty__Group__0 : rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1 ;
    public final void rule__ConstraintParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5461:1: ( rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1 )
            // InternalPactDSL.g:5462:2: rule__ConstraintParty__Group__0__Impl rule__ConstraintParty__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__0"


    // $ANTLR start "rule__ConstraintParty__Group__0__Impl"
    // InternalPactDSL.g:5469:1: rule__ConstraintParty__Group__0__Impl : ( 'ConstraintParty:' ) ;
    public final void rule__ConstraintParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5473:1: ( ( 'ConstraintParty:' ) )
            // InternalPactDSL.g:5474:1: ( 'ConstraintParty:' )
            {
            // InternalPactDSL.g:5474:1: ( 'ConstraintParty:' )
            // InternalPactDSL.g:5475:2: 'ConstraintParty:'
            {
             before(grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getConstraintPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__0__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__1"
    // InternalPactDSL.g:5484:1: rule__ConstraintParty__Group__1 : rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2 ;
    public final void rule__ConstraintParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5488:1: ( rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2 )
            // InternalPactDSL.g:5489:2: rule__ConstraintParty__Group__1__Impl rule__ConstraintParty__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__ConstraintParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__1"


    // $ANTLR start "rule__ConstraintParty__Group__1__Impl"
    // InternalPactDSL.g:5496:1: rule__ConstraintParty__Group__1__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__ConstraintParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5500:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5501:1: ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5501:1: ( ( rule__ConstraintParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5502:2: ( rule__ConstraintParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5503:2: ( rule__ConstraintParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5503:3: rule__ConstraintParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__1__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__2"
    // InternalPactDSL.g:5511:1: rule__ConstraintParty__Group__2 : rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3 ;
    public final void rule__ConstraintParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5515:1: ( rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3 )
            // InternalPactDSL.g:5516:2: rule__ConstraintParty__Group__2__Impl rule__ConstraintParty__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConstraintParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__2"


    // $ANTLR start "rule__ConstraintParty__Group__2__Impl"
    // InternalPactDSL.g:5523:1: rule__ConstraintParty__Group__2__Impl : ( 'mustNot' ) ;
    public final void rule__ConstraintParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5527:1: ( ( 'mustNot' ) )
            // InternalPactDSL.g:5528:1: ( 'mustNot' )
            {
            // InternalPactDSL.g:5528:1: ( 'mustNot' )
            // InternalPactDSL.g:5529:2: 'mustNot'
            {
             before(grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getMustNotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__2__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__3"
    // InternalPactDSL.g:5538:1: rule__ConstraintParty__Group__3 : rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4 ;
    public final void rule__ConstraintParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5542:1: ( rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4 )
            // InternalPactDSL.g:5543:2: rule__ConstraintParty__Group__3__Impl rule__ConstraintParty__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__ConstraintParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__3"


    // $ANTLR start "rule__ConstraintParty__Group__3__Impl"
    // InternalPactDSL.g:5550:1: rule__ConstraintParty__Group__3__Impl : ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) ) ;
    public final void rule__ConstraintParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5554:1: ( ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) ) )
            // InternalPactDSL.g:5555:1: ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) )
            {
            // InternalPactDSL.g:5555:1: ( ( rule__ConstraintParty__ForbiddenActionAssignment_3 ) )
            // InternalPactDSL.g:5556:2: ( rule__ConstraintParty__ForbiddenActionAssignment_3 )
            {
             before(grammarAccess.getConstraintPartyAccess().getForbiddenActionAssignment_3()); 
            // InternalPactDSL.g:5557:2: ( rule__ConstraintParty__ForbiddenActionAssignment_3 )
            // InternalPactDSL.g:5557:3: rule__ConstraintParty__ForbiddenActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__ForbiddenActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getForbiddenActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__3__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__4"
    // InternalPactDSL.g:5565:1: rule__ConstraintParty__Group__4 : rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5 ;
    public final void rule__ConstraintParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5569:1: ( rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5 )
            // InternalPactDSL.g:5570:2: rule__ConstraintParty__Group__4__Impl rule__ConstraintParty__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__ConstraintParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__4"


    // $ANTLR start "rule__ConstraintParty__Group__4__Impl"
    // InternalPactDSL.g:5577:1: rule__ConstraintParty__Group__4__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? ) ;
    public final void rule__ConstraintParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5581:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? ) )
            // InternalPactDSL.g:5582:1: ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? )
            {
            // InternalPactDSL.g:5582:1: ( ( rule__ConstraintParty__SuperTypeAssignment_4 )? )
            // InternalPactDSL.g:5583:2: ( rule__ConstraintParty__SuperTypeAssignment_4 )?
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:5584:2: ( rule__ConstraintParty__SuperTypeAssignment_4 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalPactDSL.g:5584:3: rule__ConstraintParty__SuperTypeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParty__SuperTypeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__4__Impl"


    // $ANTLR start "rule__ConstraintParty__Group__5"
    // InternalPactDSL.g:5592:1: rule__ConstraintParty__Group__5 : rule__ConstraintParty__Group__5__Impl ;
    public final void rule__ConstraintParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5596:1: ( rule__ConstraintParty__Group__5__Impl )
            // InternalPactDSL.g:5597:2: rule__ConstraintParty__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__5"


    // $ANTLR start "rule__ConstraintParty__Group__5__Impl"
    // InternalPactDSL.g:5603:1: rule__ConstraintParty__Group__5__Impl : ( ( rule__ConstraintParty__Group_5__0 )? ) ;
    public final void rule__ConstraintParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5607:1: ( ( ( rule__ConstraintParty__Group_5__0 )? ) )
            // InternalPactDSL.g:5608:1: ( ( rule__ConstraintParty__Group_5__0 )? )
            {
            // InternalPactDSL.g:5608:1: ( ( rule__ConstraintParty__Group_5__0 )? )
            // InternalPactDSL.g:5609:2: ( rule__ConstraintParty__Group_5__0 )?
            {
             before(grammarAccess.getConstraintPartyAccess().getGroup_5()); 
            // InternalPactDSL.g:5610:2: ( rule__ConstraintParty__Group_5__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==36) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPactDSL.g:5610:3: rule__ConstraintParty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintParty__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintPartyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group__5__Impl"


    // $ANTLR start "rule__ConstraintParty__Group_5__0"
    // InternalPactDSL.g:5619:1: rule__ConstraintParty__Group_5__0 : rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1 ;
    public final void rule__ConstraintParty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5623:1: ( rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1 )
            // InternalPactDSL.g:5624:2: rule__ConstraintParty__Group_5__0__Impl rule__ConstraintParty__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintParty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__0"


    // $ANTLR start "rule__ConstraintParty__Group_5__0__Impl"
    // InternalPactDSL.g:5631:1: rule__ConstraintParty__Group_5__0__Impl : ( 'to' ) ;
    public final void rule__ConstraintParty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5635:1: ( ( 'to' ) )
            // InternalPactDSL.g:5636:1: ( 'to' )
            {
            // InternalPactDSL.g:5636:1: ( 'to' )
            // InternalPactDSL.g:5637:2: 'to'
            {
             before(grammarAccess.getConstraintPartyAccess().getToKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getToKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__0__Impl"


    // $ANTLR start "rule__ConstraintParty__Group_5__1"
    // InternalPactDSL.g:5646:1: rule__ConstraintParty__Group_5__1 : rule__ConstraintParty__Group_5__1__Impl ;
    public final void rule__ConstraintParty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5650:1: ( rule__ConstraintParty__Group_5__1__Impl )
            // InternalPactDSL.g:5651:2: rule__ConstraintParty__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__1"


    // $ANTLR start "rule__ConstraintParty__Group_5__1__Impl"
    // InternalPactDSL.g:5657:1: rule__ConstraintParty__Group_5__1__Impl : ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__ConstraintParty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5661:1: ( ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) ) )
            // InternalPactDSL.g:5662:1: ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) )
            {
            // InternalPactDSL.g:5662:1: ( ( rule__ConstraintParty__SuperTypeAssignment_5_1 ) )
            // InternalPactDSL.g:5663:2: ( rule__ConstraintParty__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_5_1()); 
            // InternalPactDSL.g:5664:2: ( rule__ConstraintParty__SuperTypeAssignment_5_1 )
            // InternalPactDSL.g:5664:3: rule__ConstraintParty__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintParty__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__Group_5__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__0"
    // InternalPactDSL.g:5673:1: rule__ConstraintThirdParty__Group__0 : rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1 ;
    public final void rule__ConstraintThirdParty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5677:1: ( rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1 )
            // InternalPactDSL.g:5678:2: rule__ConstraintThirdParty__Group__0__Impl rule__ConstraintThirdParty__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintThirdParty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group__0__Impl"
    // InternalPactDSL.g:5685:1: rule__ConstraintThirdParty__Group__0__Impl : ( 'ConstraintThirdParty:' ) ;
    public final void rule__ConstraintThirdParty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5689:1: ( ( 'ConstraintThirdParty:' ) )
            // InternalPactDSL.g:5690:1: ( 'ConstraintThirdParty:' )
            {
            // InternalPactDSL.g:5690:1: ( 'ConstraintThirdParty:' )
            // InternalPactDSL.g:5691:2: 'ConstraintThirdParty:'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getConstraintThirdPartyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__1"
    // InternalPactDSL.g:5700:1: rule__ConstraintThirdParty__Group__1 : rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2 ;
    public final void rule__ConstraintThirdParty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5704:1: ( rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2 )
            // InternalPactDSL.g:5705:2: rule__ConstraintThirdParty__Group__1__Impl rule__ConstraintThirdParty__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__ConstraintThirdParty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group__1__Impl"
    // InternalPactDSL.g:5712:1: rule__ConstraintThirdParty__Group__1__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) ) ;
    public final void rule__ConstraintThirdParty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5716:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) ) )
            // InternalPactDSL.g:5717:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) )
            {
            // InternalPactDSL.g:5717:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:5718:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:5719:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_1 )
            // InternalPactDSL.g:5719:3: rule__ConstraintThirdParty__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__2"
    // InternalPactDSL.g:5727:1: rule__ConstraintThirdParty__Group__2 : rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3 ;
    public final void rule__ConstraintThirdParty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5731:1: ( rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3 )
            // InternalPactDSL.g:5732:2: rule__ConstraintThirdParty__Group__2__Impl rule__ConstraintThirdParty__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ConstraintThirdParty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__2"


    // $ANTLR start "rule__ConstraintThirdParty__Group__2__Impl"
    // InternalPactDSL.g:5739:1: rule__ConstraintThirdParty__Group__2__Impl : ( 'mustNot' ) ;
    public final void rule__ConstraintThirdParty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5743:1: ( ( 'mustNot' ) )
            // InternalPactDSL.g:5744:1: ( 'mustNot' )
            {
            // InternalPactDSL.g:5744:1: ( 'mustNot' )
            // InternalPactDSL.g:5745:2: 'mustNot'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getMustNotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__2__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__3"
    // InternalPactDSL.g:5754:1: rule__ConstraintThirdParty__Group__3 : rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4 ;
    public final void rule__ConstraintThirdParty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5758:1: ( rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4 )
            // InternalPactDSL.g:5759:2: rule__ConstraintThirdParty__Group__3__Impl rule__ConstraintThirdParty__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__ConstraintThirdParty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__3"


    // $ANTLR start "rule__ConstraintThirdParty__Group__3__Impl"
    // InternalPactDSL.g:5766:1: rule__ConstraintThirdParty__Group__3__Impl : ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) ) ;
    public final void rule__ConstraintThirdParty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5770:1: ( ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) ) )
            // InternalPactDSL.g:5771:1: ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) )
            {
            // InternalPactDSL.g:5771:1: ( ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 ) )
            // InternalPactDSL.g:5772:2: ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionAssignment_3()); 
            // InternalPactDSL.g:5773:2: ( rule__ConstraintThirdParty__ForbiddenActionAssignment_3 )
            // InternalPactDSL.g:5773:3: rule__ConstraintThirdParty__ForbiddenActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__ForbiddenActionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__3__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__4"
    // InternalPactDSL.g:5781:1: rule__ConstraintThirdParty__Group__4 : rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5 ;
    public final void rule__ConstraintThirdParty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5785:1: ( rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5 )
            // InternalPactDSL.g:5786:2: rule__ConstraintThirdParty__Group__4__Impl rule__ConstraintThirdParty__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__ConstraintThirdParty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__4"


    // $ANTLR start "rule__ConstraintThirdParty__Group__4__Impl"
    // InternalPactDSL.g:5793:1: rule__ConstraintThirdParty__Group__4__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? ) ;
    public final void rule__ConstraintThirdParty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5797:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? ) )
            // InternalPactDSL.g:5798:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? )
            {
            // InternalPactDSL.g:5798:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )? )
            // InternalPactDSL.g:5799:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_4()); 
            // InternalPactDSL.g:5800:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_4 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalPactDSL.g:5800:3: rule__ConstraintThirdParty__SuperTypeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__SuperTypeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__4__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__5"
    // InternalPactDSL.g:5808:1: rule__ConstraintThirdParty__Group__5 : rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6 ;
    public final void rule__ConstraintThirdParty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5812:1: ( rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6 )
            // InternalPactDSL.g:5813:2: rule__ConstraintThirdParty__Group__5__Impl rule__ConstraintThirdParty__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__ConstraintThirdParty__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__5"


    // $ANTLR start "rule__ConstraintThirdParty__Group__5__Impl"
    // InternalPactDSL.g:5820:1: rule__ConstraintThirdParty__Group__5__Impl : ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? ) ;
    public final void rule__ConstraintThirdParty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5824:1: ( ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? ) )
            // InternalPactDSL.g:5825:1: ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? )
            {
            // InternalPactDSL.g:5825:1: ( ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )? )
            // InternalPactDSL.g:5826:2: ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoAssignment_5()); 
            // InternalPactDSL.g:5827:2: ( rule__ConstraintThirdParty__AdditionalInfoAssignment_5 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_STRING) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPactDSL.g:5827:3: rule__ConstraintThirdParty__AdditionalInfoAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__AdditionalInfoAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__5__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__6"
    // InternalPactDSL.g:5835:1: rule__ConstraintThirdParty__Group__6 : rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7 ;
    public final void rule__ConstraintThirdParty__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5839:1: ( rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7 )
            // InternalPactDSL.g:5840:2: rule__ConstraintThirdParty__Group__6__Impl rule__ConstraintThirdParty__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__ConstraintThirdParty__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__6"


    // $ANTLR start "rule__ConstraintThirdParty__Group__6__Impl"
    // InternalPactDSL.g:5847:1: rule__ConstraintThirdParty__Group__6__Impl : ( ( rule__ConstraintThirdParty__Group_6__0 )? ) ;
    public final void rule__ConstraintThirdParty__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5851:1: ( ( ( rule__ConstraintThirdParty__Group_6__0 )? ) )
            // InternalPactDSL.g:5852:1: ( ( rule__ConstraintThirdParty__Group_6__0 )? )
            {
            // InternalPactDSL.g:5852:1: ( ( rule__ConstraintThirdParty__Group_6__0 )? )
            // InternalPactDSL.g:5853:2: ( rule__ConstraintThirdParty__Group_6__0 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup_6()); 
            // InternalPactDSL.g:5854:2: ( rule__ConstraintThirdParty__Group_6__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==36) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalPactDSL.g:5854:3: rule__ConstraintThirdParty__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__6__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group__7"
    // InternalPactDSL.g:5862:1: rule__ConstraintThirdParty__Group__7 : rule__ConstraintThirdParty__Group__7__Impl ;
    public final void rule__ConstraintThirdParty__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5866:1: ( rule__ConstraintThirdParty__Group__7__Impl )
            // InternalPactDSL.g:5867:2: rule__ConstraintThirdParty__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__7"


    // $ANTLR start "rule__ConstraintThirdParty__Group__7__Impl"
    // InternalPactDSL.g:5873:1: rule__ConstraintThirdParty__Group__7__Impl : ( ( rule__ConstraintThirdParty__Group_7__0 )? ) ;
    public final void rule__ConstraintThirdParty__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5877:1: ( ( ( rule__ConstraintThirdParty__Group_7__0 )? ) )
            // InternalPactDSL.g:5878:1: ( ( rule__ConstraintThirdParty__Group_7__0 )? )
            {
            // InternalPactDSL.g:5878:1: ( ( rule__ConstraintThirdParty__Group_7__0 )? )
            // InternalPactDSL.g:5879:2: ( rule__ConstraintThirdParty__Group_7__0 )?
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getGroup_7()); 
            // InternalPactDSL.g:5880:2: ( rule__ConstraintThirdParty__Group_7__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalPactDSL.g:5880:3: rule__ConstraintThirdParty__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ConstraintThirdParty__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group__7__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__0"
    // InternalPactDSL.g:5889:1: rule__ConstraintThirdParty__Group_6__0 : rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1 ;
    public final void rule__ConstraintThirdParty__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5893:1: ( rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1 )
            // InternalPactDSL.g:5894:2: rule__ConstraintThirdParty__Group_6__0__Impl rule__ConstraintThirdParty__Group_6__1
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintThirdParty__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__0__Impl"
    // InternalPactDSL.g:5901:1: rule__ConstraintThirdParty__Group_6__0__Impl : ( 'to' ) ;
    public final void rule__ConstraintThirdParty__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5905:1: ( ( 'to' ) )
            // InternalPactDSL.g:5906:1: ( 'to' )
            {
            // InternalPactDSL.g:5906:1: ( 'to' )
            // InternalPactDSL.g:5907:2: 'to'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getToKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__1"
    // InternalPactDSL.g:5916:1: rule__ConstraintThirdParty__Group_6__1 : rule__ConstraintThirdParty__Group_6__1__Impl ;
    public final void rule__ConstraintThirdParty__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5920:1: ( rule__ConstraintThirdParty__Group_6__1__Impl )
            // InternalPactDSL.g:5921:2: rule__ConstraintThirdParty__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group_6__1__Impl"
    // InternalPactDSL.g:5927:1: rule__ConstraintThirdParty__Group_6__1__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) ) ;
    public final void rule__ConstraintThirdParty__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5931:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) ) )
            // InternalPactDSL.g:5932:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) )
            {
            // InternalPactDSL.g:5932:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 ) )
            // InternalPactDSL.g:5933:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_6_1()); 
            // InternalPactDSL.g:5934:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_6_1 )
            // InternalPactDSL.g:5934:3: rule__ConstraintThirdParty__SuperTypeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_6__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__0"
    // InternalPactDSL.g:5943:1: rule__ConstraintThirdParty__Group_7__0 : rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1 ;
    public final void rule__ConstraintThirdParty__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5947:1: ( rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1 )
            // InternalPactDSL.g:5948:2: rule__ConstraintThirdParty__Group_7__0__Impl rule__ConstraintThirdParty__Group_7__1
            {
            pushFollow(FOLLOW_45);
            rule__ConstraintThirdParty__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__0"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__0__Impl"
    // InternalPactDSL.g:5955:1: rule__ConstraintThirdParty__Group_7__0__Impl : ( 'unless' ) ;
    public final void rule__ConstraintThirdParty__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5959:1: ( ( 'unless' ) )
            // InternalPactDSL.g:5960:1: ( 'unless' )
            {
            // InternalPactDSL.g:5960:1: ( 'unless' )
            // InternalPactDSL.g:5961:2: 'unless'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getUnlessKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__0__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__1"
    // InternalPactDSL.g:5970:1: rule__ConstraintThirdParty__Group_7__1 : rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2 ;
    public final void rule__ConstraintThirdParty__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5974:1: ( rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2 )
            // InternalPactDSL.g:5975:2: rule__ConstraintThirdParty__Group_7__1__Impl rule__ConstraintThirdParty__Group_7__2
            {
            pushFollow(FOLLOW_46);
            rule__ConstraintThirdParty__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__1"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__1__Impl"
    // InternalPactDSL.g:5982:1: rule__ConstraintThirdParty__Group_7__1__Impl : ( 'withWrittenConsent' ) ;
    public final void rule__ConstraintThirdParty__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:5986:1: ( ( 'withWrittenConsent' ) )
            // InternalPactDSL.g:5987:1: ( 'withWrittenConsent' )
            {
            // InternalPactDSL.g:5987:1: ( 'withWrittenConsent' )
            // InternalPactDSL.g:5988:2: 'withWrittenConsent'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getWithWrittenConsentKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__1__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__2"
    // InternalPactDSL.g:5997:1: rule__ConstraintThirdParty__Group_7__2 : rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3 ;
    public final void rule__ConstraintThirdParty__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6001:1: ( rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3 )
            // InternalPactDSL.g:6002:2: rule__ConstraintThirdParty__Group_7__2__Impl rule__ConstraintThirdParty__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__ConstraintThirdParty__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__2"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__2__Impl"
    // InternalPactDSL.g:6009:1: rule__ConstraintThirdParty__Group_7__2__Impl : ( 'of' ) ;
    public final void rule__ConstraintThirdParty__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6013:1: ( ( 'of' ) )
            // InternalPactDSL.g:6014:1: ( 'of' )
            {
            // InternalPactDSL.g:6014:1: ( 'of' )
            // InternalPactDSL.g:6015:2: 'of'
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getOfKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__2__Impl"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__3"
    // InternalPactDSL.g:6024:1: rule__ConstraintThirdParty__Group_7__3 : rule__ConstraintThirdParty__Group_7__3__Impl ;
    public final void rule__ConstraintThirdParty__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6028:1: ( rule__ConstraintThirdParty__Group_7__3__Impl )
            // InternalPactDSL.g:6029:2: rule__ConstraintThirdParty__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__3"


    // $ANTLR start "rule__ConstraintThirdParty__Group_7__3__Impl"
    // InternalPactDSL.g:6035:1: rule__ConstraintThirdParty__Group_7__3__Impl : ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) ) ;
    public final void rule__ConstraintThirdParty__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6039:1: ( ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) ) )
            // InternalPactDSL.g:6040:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) )
            {
            // InternalPactDSL.g:6040:1: ( ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 ) )
            // InternalPactDSL.g:6041:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_7_3()); 
            // InternalPactDSL.g:6042:2: ( rule__ConstraintThirdParty__SuperTypeAssignment_7_3 )
            // InternalPactDSL.g:6042:3: rule__ConstraintThirdParty__SuperTypeAssignment_7_3
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintThirdParty__SuperTypeAssignment_7_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeAssignment_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__Group_7__3__Impl"


    // $ANTLR start "rule__ForConvenience__Group__0"
    // InternalPactDSL.g:6051:1: rule__ForConvenience__Group__0 : rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1 ;
    public final void rule__ForConvenience__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6055:1: ( rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1 )
            // InternalPactDSL.g:6056:2: rule__ForConvenience__Group__0__Impl rule__ForConvenience__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ForConvenience__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__0"


    // $ANTLR start "rule__ForConvenience__Group__0__Impl"
    // InternalPactDSL.g:6063:1: rule__ForConvenience__Group__0__Impl : ( 'TerminationForConvenience:' ) ;
    public final void rule__ForConvenience__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6067:1: ( ( 'TerminationForConvenience:' ) )
            // InternalPactDSL.g:6068:1: ( 'TerminationForConvenience:' )
            {
            // InternalPactDSL.g:6068:1: ( 'TerminationForConvenience:' )
            // InternalPactDSL.g:6069:2: 'TerminationForConvenience:'
            {
             before(grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getTerminationForConvenienceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__0__Impl"


    // $ANTLR start "rule__ForConvenience__Group__1"
    // InternalPactDSL.g:6078:1: rule__ForConvenience__Group__1 : rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2 ;
    public final void rule__ForConvenience__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6082:1: ( rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2 )
            // InternalPactDSL.g:6083:2: rule__ForConvenience__Group__1__Impl rule__ForConvenience__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__ForConvenience__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__1"


    // $ANTLR start "rule__ForConvenience__Group__1__Impl"
    // InternalPactDSL.g:6090:1: rule__ForConvenience__Group__1__Impl : ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__ForConvenience__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6094:1: ( ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6095:1: ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6095:1: ( ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6096:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 ) ) ( ( rule__ForConvenience__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6096:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6097:3: ( rule__ForConvenience__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6098:3: ( rule__ForConvenience__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6098:4: rule__ForConvenience__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ForConvenience__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6101:2: ( ( rule__ForConvenience__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6102:3: ( rule__ForConvenience__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6103:3: ( rule__ForConvenience__SuperTypeAssignment_1 )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalPactDSL.g:6103:4: rule__ForConvenience__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForConvenience__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

             after(grammarAccess.getForConvenienceAccess().getSuperTypeAssignment_1()); 

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
    // $ANTLR end "rule__ForConvenience__Group__1__Impl"


    // $ANTLR start "rule__ForConvenience__Group__2"
    // InternalPactDSL.g:6112:1: rule__ForConvenience__Group__2 : rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3 ;
    public final void rule__ForConvenience__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6116:1: ( rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3 )
            // InternalPactDSL.g:6117:2: rule__ForConvenience__Group__2__Impl rule__ForConvenience__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__ForConvenience__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__2"


    // $ANTLR start "rule__ForConvenience__Group__2__Impl"
    // InternalPactDSL.g:6124:1: rule__ForConvenience__Group__2__Impl : ( 'may' ) ;
    public final void rule__ForConvenience__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6128:1: ( ( 'may' ) )
            // InternalPactDSL.g:6129:1: ( 'may' )
            {
            // InternalPactDSL.g:6129:1: ( 'may' )
            // InternalPactDSL.g:6130:2: 'may'
            {
             before(grammarAccess.getForConvenienceAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__2__Impl"


    // $ANTLR start "rule__ForConvenience__Group__3"
    // InternalPactDSL.g:6139:1: rule__ForConvenience__Group__3 : rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4 ;
    public final void rule__ForConvenience__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6143:1: ( rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4 )
            // InternalPactDSL.g:6144:2: rule__ForConvenience__Group__3__Impl rule__ForConvenience__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__ForConvenience__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__3"


    // $ANTLR start "rule__ForConvenience__Group__3__Impl"
    // InternalPactDSL.g:6151:1: rule__ForConvenience__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__ForConvenience__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6155:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6156:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6156:1: ( 'terminate' )
            // InternalPactDSL.g:6157:2: 'terminate'
            {
             before(grammarAccess.getForConvenienceAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__3__Impl"


    // $ANTLR start "rule__ForConvenience__Group__4"
    // InternalPactDSL.g:6166:1: rule__ForConvenience__Group__4 : rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5 ;
    public final void rule__ForConvenience__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6170:1: ( rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5 )
            // InternalPactDSL.g:6171:2: rule__ForConvenience__Group__4__Impl rule__ForConvenience__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ForConvenience__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__4"


    // $ANTLR start "rule__ForConvenience__Group__4__Impl"
    // InternalPactDSL.g:6178:1: rule__ForConvenience__Group__4__Impl : ( 'by' ) ;
    public final void rule__ForConvenience__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6182:1: ( ( 'by' ) )
            // InternalPactDSL.g:6183:1: ( 'by' )
            {
            // InternalPactDSL.g:6183:1: ( 'by' )
            // InternalPactDSL.g:6184:2: 'by'
            {
             before(grammarAccess.getForConvenienceAccess().getByKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__4__Impl"


    // $ANTLR start "rule__ForConvenience__Group__5"
    // InternalPactDSL.g:6193:1: rule__ForConvenience__Group__5 : rule__ForConvenience__Group__5__Impl ;
    public final void rule__ForConvenience__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6197:1: ( rule__ForConvenience__Group__5__Impl )
            // InternalPactDSL.g:6198:2: rule__ForConvenience__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__5"


    // $ANTLR start "rule__ForConvenience__Group__5__Impl"
    // InternalPactDSL.g:6204:1: rule__ForConvenience__Group__5__Impl : ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) ) ;
    public final void rule__ForConvenience__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6208:1: ( ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) ) )
            // InternalPactDSL.g:6209:1: ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) )
            {
            // InternalPactDSL.g:6209:1: ( ( rule__ForConvenience__CustomTerminationAssignment_5 ) )
            // InternalPactDSL.g:6210:2: ( rule__ForConvenience__CustomTerminationAssignment_5 )
            {
             before(grammarAccess.getForConvenienceAccess().getCustomTerminationAssignment_5()); 
            // InternalPactDSL.g:6211:2: ( rule__ForConvenience__CustomTerminationAssignment_5 )
            // InternalPactDSL.g:6211:3: rule__ForConvenience__CustomTerminationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ForConvenience__CustomTerminationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForConvenienceAccess().getCustomTerminationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__Group__5__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__0"
    // InternalPactDSL.g:6220:1: rule__OnReasonableNotice__Group__0 : rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1 ;
    public final void rule__OnReasonableNotice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6224:1: ( rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1 )
            // InternalPactDSL.g:6225:2: rule__OnReasonableNotice__Group__0__Impl rule__OnReasonableNotice__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OnReasonableNotice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__0"


    // $ANTLR start "rule__OnReasonableNotice__Group__0__Impl"
    // InternalPactDSL.g:6232:1: rule__OnReasonableNotice__Group__0__Impl : ( 'TerminationOnReasonableNotice:' ) ;
    public final void rule__OnReasonableNotice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6236:1: ( ( 'TerminationOnReasonableNotice:' ) )
            // InternalPactDSL.g:6237:1: ( 'TerminationOnReasonableNotice:' )
            {
            // InternalPactDSL.g:6237:1: ( 'TerminationOnReasonableNotice:' )
            // InternalPactDSL.g:6238:2: 'TerminationOnReasonableNotice:'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getTerminationOnReasonableNoticeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__0__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__1"
    // InternalPactDSL.g:6247:1: rule__OnReasonableNotice__Group__1 : rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2 ;
    public final void rule__OnReasonableNotice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6251:1: ( rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2 )
            // InternalPactDSL.g:6252:2: rule__OnReasonableNotice__Group__1__Impl rule__OnReasonableNotice__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__OnReasonableNotice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__1"


    // $ANTLR start "rule__OnReasonableNotice__Group__1__Impl"
    // InternalPactDSL.g:6259:1: rule__OnReasonableNotice__Group__1__Impl : ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__OnReasonableNotice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6263:1: ( ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6264:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6264:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6265:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) ) ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6265:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6266:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6267:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6267:4: rule__OnReasonableNotice__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__OnReasonableNotice__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6270:2: ( ( rule__OnReasonableNotice__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6271:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6272:3: ( rule__OnReasonableNotice__SuperTypeAssignment_1 )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==RULE_ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalPactDSL.g:6272:4: rule__OnReasonableNotice__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__OnReasonableNotice__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_1()); 

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
    // $ANTLR end "rule__OnReasonableNotice__Group__1__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__2"
    // InternalPactDSL.g:6281:1: rule__OnReasonableNotice__Group__2 : rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3 ;
    public final void rule__OnReasonableNotice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6285:1: ( rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3 )
            // InternalPactDSL.g:6286:2: rule__OnReasonableNotice__Group__2__Impl rule__OnReasonableNotice__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__OnReasonableNotice__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__2"


    // $ANTLR start "rule__OnReasonableNotice__Group__2__Impl"
    // InternalPactDSL.g:6293:1: rule__OnReasonableNotice__Group__2__Impl : ( 'may' ) ;
    public final void rule__OnReasonableNotice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6297:1: ( ( 'may' ) )
            // InternalPactDSL.g:6298:1: ( 'may' )
            {
            // InternalPactDSL.g:6298:1: ( 'may' )
            // InternalPactDSL.g:6299:2: 'may'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__2__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__3"
    // InternalPactDSL.g:6308:1: rule__OnReasonableNotice__Group__3 : rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4 ;
    public final void rule__OnReasonableNotice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6312:1: ( rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4 )
            // InternalPactDSL.g:6313:2: rule__OnReasonableNotice__Group__3__Impl rule__OnReasonableNotice__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__OnReasonableNotice__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__3"


    // $ANTLR start "rule__OnReasonableNotice__Group__3__Impl"
    // InternalPactDSL.g:6320:1: rule__OnReasonableNotice__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__OnReasonableNotice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6324:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6325:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6325:1: ( 'terminate' )
            // InternalPactDSL.g:6326:2: 'terminate'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__3__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__4"
    // InternalPactDSL.g:6335:1: rule__OnReasonableNotice__Group__4 : rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5 ;
    public final void rule__OnReasonableNotice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6339:1: ( rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5 )
            // InternalPactDSL.g:6340:2: rule__OnReasonableNotice__Group__4__Impl rule__OnReasonableNotice__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__OnReasonableNotice__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__4"


    // $ANTLR start "rule__OnReasonableNotice__Group__4__Impl"
    // InternalPactDSL.g:6347:1: rule__OnReasonableNotice__Group__4__Impl : ( 'by' ) ;
    public final void rule__OnReasonableNotice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6351:1: ( ( 'by' ) )
            // InternalPactDSL.g:6352:1: ( 'by' )
            {
            // InternalPactDSL.g:6352:1: ( 'by' )
            // InternalPactDSL.g:6353:2: 'by'
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__4__Impl"


    // $ANTLR start "rule__OnReasonableNotice__Group__5"
    // InternalPactDSL.g:6362:1: rule__OnReasonableNotice__Group__5 : rule__OnReasonableNotice__Group__5__Impl ;
    public final void rule__OnReasonableNotice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6366:1: ( rule__OnReasonableNotice__Group__5__Impl )
            // InternalPactDSL.g:6367:2: rule__OnReasonableNotice__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__5"


    // $ANTLR start "rule__OnReasonableNotice__Group__5__Impl"
    // InternalPactDSL.g:6373:1: rule__OnReasonableNotice__Group__5__Impl : ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) ) ;
    public final void rule__OnReasonableNotice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6377:1: ( ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) ) )
            // InternalPactDSL.g:6378:1: ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) )
            {
            // InternalPactDSL.g:6378:1: ( ( rule__OnReasonableNotice__SuperTypeAssignment_5 ) )
            // InternalPactDSL.g:6379:2: ( rule__OnReasonableNotice__SuperTypeAssignment_5 )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_5()); 
            // InternalPactDSL.g:6380:2: ( rule__OnReasonableNotice__SuperTypeAssignment_5 )
            // InternalPactDSL.g:6380:3: rule__OnReasonableNotice__SuperTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OnReasonableNotice__SuperTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__Group__5__Impl"


    // $ANTLR start "rule__ForBreach__Group__0"
    // InternalPactDSL.g:6389:1: rule__ForBreach__Group__0 : rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1 ;
    public final void rule__ForBreach__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6393:1: ( rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1 )
            // InternalPactDSL.g:6394:2: rule__ForBreach__Group__0__Impl rule__ForBreach__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ForBreach__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__0"


    // $ANTLR start "rule__ForBreach__Group__0__Impl"
    // InternalPactDSL.g:6401:1: rule__ForBreach__Group__0__Impl : ( 'TerminationForBreach:' ) ;
    public final void rule__ForBreach__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6405:1: ( ( 'TerminationForBreach:' ) )
            // InternalPactDSL.g:6406:1: ( 'TerminationForBreach:' )
            {
            // InternalPactDSL.g:6406:1: ( 'TerminationForBreach:' )
            // InternalPactDSL.g:6407:2: 'TerminationForBreach:'
            {
             before(grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getTerminationForBreachKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__0__Impl"


    // $ANTLR start "rule__ForBreach__Group__1"
    // InternalPactDSL.g:6416:1: rule__ForBreach__Group__1 : rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2 ;
    public final void rule__ForBreach__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6420:1: ( rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2 )
            // InternalPactDSL.g:6421:2: rule__ForBreach__Group__1__Impl rule__ForBreach__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__ForBreach__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__1"


    // $ANTLR start "rule__ForBreach__Group__1__Impl"
    // InternalPactDSL.g:6428:1: rule__ForBreach__Group__1__Impl : ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__ForBreach__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6432:1: ( ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6433:1: ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6433:1: ( ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6434:2: ( ( rule__ForBreach__SuperTypeAssignment_1 ) ) ( ( rule__ForBreach__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6434:2: ( ( rule__ForBreach__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6435:3: ( rule__ForBreach__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6436:3: ( rule__ForBreach__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6436:4: rule__ForBreach__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__ForBreach__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6439:2: ( ( rule__ForBreach__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6440:3: ( rule__ForBreach__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6441:3: ( rule__ForBreach__SuperTypeAssignment_1 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_ID) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalPactDSL.g:6441:4: rule__ForBreach__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ForBreach__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_1()); 

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
    // $ANTLR end "rule__ForBreach__Group__1__Impl"


    // $ANTLR start "rule__ForBreach__Group__2"
    // InternalPactDSL.g:6450:1: rule__ForBreach__Group__2 : rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3 ;
    public final void rule__ForBreach__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6454:1: ( rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3 )
            // InternalPactDSL.g:6455:2: rule__ForBreach__Group__2__Impl rule__ForBreach__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__ForBreach__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__2"


    // $ANTLR start "rule__ForBreach__Group__2__Impl"
    // InternalPactDSL.g:6462:1: rule__ForBreach__Group__2__Impl : ( 'may' ) ;
    public final void rule__ForBreach__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6466:1: ( ( 'may' ) )
            // InternalPactDSL.g:6467:1: ( 'may' )
            {
            // InternalPactDSL.g:6467:1: ( 'may' )
            // InternalPactDSL.g:6468:2: 'may'
            {
             before(grammarAccess.getForBreachAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__2__Impl"


    // $ANTLR start "rule__ForBreach__Group__3"
    // InternalPactDSL.g:6477:1: rule__ForBreach__Group__3 : rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4 ;
    public final void rule__ForBreach__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6481:1: ( rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4 )
            // InternalPactDSL.g:6482:2: rule__ForBreach__Group__3__Impl rule__ForBreach__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__ForBreach__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__3"


    // $ANTLR start "rule__ForBreach__Group__3__Impl"
    // InternalPactDSL.g:6489:1: rule__ForBreach__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__ForBreach__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6493:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6494:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6494:1: ( 'terminate' )
            // InternalPactDSL.g:6495:2: 'terminate'
            {
             before(grammarAccess.getForBreachAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__3__Impl"


    // $ANTLR start "rule__ForBreach__Group__4"
    // InternalPactDSL.g:6504:1: rule__ForBreach__Group__4 : rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5 ;
    public final void rule__ForBreach__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6508:1: ( rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5 )
            // InternalPactDSL.g:6509:2: rule__ForBreach__Group__4__Impl rule__ForBreach__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ForBreach__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__4"


    // $ANTLR start "rule__ForBreach__Group__4__Impl"
    // InternalPactDSL.g:6516:1: rule__ForBreach__Group__4__Impl : ( 'forBreachOf' ) ;
    public final void rule__ForBreach__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6520:1: ( ( 'forBreachOf' ) )
            // InternalPactDSL.g:6521:1: ( 'forBreachOf' )
            {
            // InternalPactDSL.g:6521:1: ( 'forBreachOf' )
            // InternalPactDSL.g:6522:2: 'forBreachOf'
            {
             before(grammarAccess.getForBreachAccess().getForBreachOfKeyword_4()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getForBreachOfKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__4__Impl"


    // $ANTLR start "rule__ForBreach__Group__5"
    // InternalPactDSL.g:6531:1: rule__ForBreach__Group__5 : rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6 ;
    public final void rule__ForBreach__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6535:1: ( rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6 )
            // InternalPactDSL.g:6536:2: rule__ForBreach__Group__5__Impl rule__ForBreach__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__ForBreach__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__5"


    // $ANTLR start "rule__ForBreach__Group__5__Impl"
    // InternalPactDSL.g:6543:1: rule__ForBreach__Group__5__Impl : ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) ) ;
    public final void rule__ForBreach__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6547:1: ( ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) ) )
            // InternalPactDSL.g:6548:1: ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) )
            {
            // InternalPactDSL.g:6548:1: ( ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* ) )
            // InternalPactDSL.g:6549:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) ) ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* )
            {
            // InternalPactDSL.g:6549:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 ) )
            // InternalPactDSL.g:6550:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 
            // InternalPactDSL.g:6551:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )
            // InternalPactDSL.g:6551:4: rule__ForBreach__ObligationBreachedAssignment_5
            {
            pushFollow(FOLLOW_31);
            rule__ForBreach__ObligationBreachedAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 

            }

            // InternalPactDSL.g:6554:2: ( ( rule__ForBreach__ObligationBreachedAssignment_5 )* )
            // InternalPactDSL.g:6555:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )*
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 
            // InternalPactDSL.g:6556:3: ( rule__ForBreach__ObligationBreachedAssignment_5 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_STRING) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalPactDSL.g:6556:4: rule__ForBreach__ObligationBreachedAssignment_5
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__ForBreach__ObligationBreachedAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getForBreachAccess().getObligationBreachedAssignment_5()); 

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
    // $ANTLR end "rule__ForBreach__Group__5__Impl"


    // $ANTLR start "rule__ForBreach__Group__6"
    // InternalPactDSL.g:6565:1: rule__ForBreach__Group__6 : rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7 ;
    public final void rule__ForBreach__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6569:1: ( rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7 )
            // InternalPactDSL.g:6570:2: rule__ForBreach__Group__6__Impl rule__ForBreach__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__ForBreach__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__6"


    // $ANTLR start "rule__ForBreach__Group__6__Impl"
    // InternalPactDSL.g:6577:1: rule__ForBreach__Group__6__Impl : ( 'by' ) ;
    public final void rule__ForBreach__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6581:1: ( ( 'by' ) )
            // InternalPactDSL.g:6582:1: ( 'by' )
            {
            // InternalPactDSL.g:6582:1: ( 'by' )
            // InternalPactDSL.g:6583:2: 'by'
            {
             before(grammarAccess.getForBreachAccess().getByKeyword_6()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getByKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__6__Impl"


    // $ANTLR start "rule__ForBreach__Group__7"
    // InternalPactDSL.g:6592:1: rule__ForBreach__Group__7 : rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8 ;
    public final void rule__ForBreach__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6596:1: ( rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8 )
            // InternalPactDSL.g:6597:2: rule__ForBreach__Group__7__Impl rule__ForBreach__Group__8
            {
            pushFollow(FOLLOW_50);
            rule__ForBreach__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__7"


    // $ANTLR start "rule__ForBreach__Group__7__Impl"
    // InternalPactDSL.g:6604:1: rule__ForBreach__Group__7__Impl : ( ( rule__ForBreach__SuperTypeAssignment_7 ) ) ;
    public final void rule__ForBreach__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6608:1: ( ( ( rule__ForBreach__SuperTypeAssignment_7 ) ) )
            // InternalPactDSL.g:6609:1: ( ( rule__ForBreach__SuperTypeAssignment_7 ) )
            {
            // InternalPactDSL.g:6609:1: ( ( rule__ForBreach__SuperTypeAssignment_7 ) )
            // InternalPactDSL.g:6610:2: ( rule__ForBreach__SuperTypeAssignment_7 )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypeAssignment_7()); 
            // InternalPactDSL.g:6611:2: ( rule__ForBreach__SuperTypeAssignment_7 )
            // InternalPactDSL.g:6611:3: rule__ForBreach__SuperTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__SuperTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getSuperTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__7__Impl"


    // $ANTLR start "rule__ForBreach__Group__8"
    // InternalPactDSL.g:6619:1: rule__ForBreach__Group__8 : rule__ForBreach__Group__8__Impl ;
    public final void rule__ForBreach__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6623:1: ( rule__ForBreach__Group__8__Impl )
            // InternalPactDSL.g:6624:2: rule__ForBreach__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__8"


    // $ANTLR start "rule__ForBreach__Group__8__Impl"
    // InternalPactDSL.g:6630:1: rule__ForBreach__Group__8__Impl : ( ( rule__ForBreach__Group_8__0 )? ) ;
    public final void rule__ForBreach__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6634:1: ( ( ( rule__ForBreach__Group_8__0 )? ) )
            // InternalPactDSL.g:6635:1: ( ( rule__ForBreach__Group_8__0 )? )
            {
            // InternalPactDSL.g:6635:1: ( ( rule__ForBreach__Group_8__0 )? )
            // InternalPactDSL.g:6636:2: ( rule__ForBreach__Group_8__0 )?
            {
             before(grammarAccess.getForBreachAccess().getGroup_8()); 
            // InternalPactDSL.g:6637:2: ( rule__ForBreach__Group_8__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==59) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalPactDSL.g:6637:3: rule__ForBreach__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForBreach__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForBreachAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group__8__Impl"


    // $ANTLR start "rule__ForBreach__Group_8__0"
    // InternalPactDSL.g:6646:1: rule__ForBreach__Group_8__0 : rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1 ;
    public final void rule__ForBreach__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6650:1: ( rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1 )
            // InternalPactDSL.g:6651:2: rule__ForBreach__Group_8__0__Impl rule__ForBreach__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__ForBreach__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForBreach__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__0"


    // $ANTLR start "rule__ForBreach__Group_8__0__Impl"
    // InternalPactDSL.g:6658:1: rule__ForBreach__Group_8__0__Impl : ( 'unless' ) ;
    public final void rule__ForBreach__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6662:1: ( ( 'unless' ) )
            // InternalPactDSL.g:6663:1: ( 'unless' )
            {
            // InternalPactDSL.g:6663:1: ( 'unless' )
            // InternalPactDSL.g:6664:2: 'unless'
            {
             before(grammarAccess.getForBreachAccess().getUnlessKeyword_8_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getUnlessKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__0__Impl"


    // $ANTLR start "rule__ForBreach__Group_8__1"
    // InternalPactDSL.g:6673:1: rule__ForBreach__Group_8__1 : rule__ForBreach__Group_8__1__Impl ;
    public final void rule__ForBreach__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6677:1: ( rule__ForBreach__Group_8__1__Impl )
            // InternalPactDSL.g:6678:2: rule__ForBreach__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__1"


    // $ANTLR start "rule__ForBreach__Group_8__1__Impl"
    // InternalPactDSL.g:6684:1: rule__ForBreach__Group_8__1__Impl : ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) ) ;
    public final void rule__ForBreach__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6688:1: ( ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) ) )
            // InternalPactDSL.g:6689:1: ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) )
            {
            // InternalPactDSL.g:6689:1: ( ( rule__ForBreach__RemedialSchemeAssignment_8_1 ) )
            // InternalPactDSL.g:6690:2: ( rule__ForBreach__RemedialSchemeAssignment_8_1 )
            {
             before(grammarAccess.getForBreachAccess().getRemedialSchemeAssignment_8_1()); 
            // InternalPactDSL.g:6691:2: ( rule__ForBreach__RemedialSchemeAssignment_8_1 )
            // InternalPactDSL.g:6691:3: rule__ForBreach__RemedialSchemeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__ForBreach__RemedialSchemeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getForBreachAccess().getRemedialSchemeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__Group_8__1__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__0"
    // InternalPactDSL.g:6700:1: rule__OnInsolvencyEvent__Group__0 : rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1 ;
    public final void rule__OnInsolvencyEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6704:1: ( rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1 )
            // InternalPactDSL.g:6705:2: rule__OnInsolvencyEvent__Group__0__Impl rule__OnInsolvencyEvent__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OnInsolvencyEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__0"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__0__Impl"
    // InternalPactDSL.g:6712:1: rule__OnInsolvencyEvent__Group__0__Impl : ( 'TerminationUponInsolvency:' ) ;
    public final void rule__OnInsolvencyEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6716:1: ( ( 'TerminationUponInsolvency:' ) )
            // InternalPactDSL.g:6717:1: ( 'TerminationUponInsolvency:' )
            {
            // InternalPactDSL.g:6717:1: ( 'TerminationUponInsolvency:' )
            // InternalPactDSL.g:6718:2: 'TerminationUponInsolvency:'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getTerminationUponInsolvencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__0__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__1"
    // InternalPactDSL.g:6727:1: rule__OnInsolvencyEvent__Group__1 : rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2 ;
    public final void rule__OnInsolvencyEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6731:1: ( rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2 )
            // InternalPactDSL.g:6732:2: rule__OnInsolvencyEvent__Group__1__Impl rule__OnInsolvencyEvent__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__OnInsolvencyEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__1"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__1__Impl"
    // InternalPactDSL.g:6739:1: rule__OnInsolvencyEvent__Group__1__Impl : ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__OnInsolvencyEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6743:1: ( ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6744:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6744:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6745:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) ) ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6745:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6746:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6747:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6747:4: rule__OnInsolvencyEvent__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__OnInsolvencyEvent__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6750:2: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6751:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6752:3: ( rule__OnInsolvencyEvent__SuperTypeAssignment_1 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ID) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalPactDSL.g:6752:4: rule__OnInsolvencyEvent__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__OnInsolvencyEvent__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_1()); 

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
    // $ANTLR end "rule__OnInsolvencyEvent__Group__1__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__2"
    // InternalPactDSL.g:6761:1: rule__OnInsolvencyEvent__Group__2 : rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3 ;
    public final void rule__OnInsolvencyEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6765:1: ( rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3 )
            // InternalPactDSL.g:6766:2: rule__OnInsolvencyEvent__Group__2__Impl rule__OnInsolvencyEvent__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__OnInsolvencyEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__2"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__2__Impl"
    // InternalPactDSL.g:6773:1: rule__OnInsolvencyEvent__Group__2__Impl : ( 'may' ) ;
    public final void rule__OnInsolvencyEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6777:1: ( ( 'may' ) )
            // InternalPactDSL.g:6778:1: ( 'may' )
            {
            // InternalPactDSL.g:6778:1: ( 'may' )
            // InternalPactDSL.g:6779:2: 'may'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__2__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__3"
    // InternalPactDSL.g:6788:1: rule__OnInsolvencyEvent__Group__3 : rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4 ;
    public final void rule__OnInsolvencyEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6792:1: ( rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4 )
            // InternalPactDSL.g:6793:2: rule__OnInsolvencyEvent__Group__3__Impl rule__OnInsolvencyEvent__Group__4
            {
            pushFollow(FOLLOW_51);
            rule__OnInsolvencyEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__3"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__3__Impl"
    // InternalPactDSL.g:6800:1: rule__OnInsolvencyEvent__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__OnInsolvencyEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6804:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:6805:1: ( 'terminate' )
            {
            // InternalPactDSL.g:6805:1: ( 'terminate' )
            // InternalPactDSL.g:6806:2: 'terminate'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__3__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__4"
    // InternalPactDSL.g:6815:1: rule__OnInsolvencyEvent__Group__4 : rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5 ;
    public final void rule__OnInsolvencyEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6819:1: ( rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5 )
            // InternalPactDSL.g:6820:2: rule__OnInsolvencyEvent__Group__4__Impl rule__OnInsolvencyEvent__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__OnInsolvencyEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__4"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__4__Impl"
    // InternalPactDSL.g:6827:1: rule__OnInsolvencyEvent__Group__4__Impl : ( 'upon' ) ;
    public final void rule__OnInsolvencyEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6831:1: ( ( 'upon' ) )
            // InternalPactDSL.g:6832:1: ( 'upon' )
            {
            // InternalPactDSL.g:6832:1: ( 'upon' )
            // InternalPactDSL.g:6833:2: 'upon'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getUponKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__4__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__5"
    // InternalPactDSL.g:6842:1: rule__OnInsolvencyEvent__Group__5 : rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6 ;
    public final void rule__OnInsolvencyEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6846:1: ( rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6 )
            // InternalPactDSL.g:6847:2: rule__OnInsolvencyEvent__Group__5__Impl rule__OnInsolvencyEvent__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__OnInsolvencyEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__5"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__5__Impl"
    // InternalPactDSL.g:6854:1: rule__OnInsolvencyEvent__Group__5__Impl : ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) ) ;
    public final void rule__OnInsolvencyEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6858:1: ( ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) ) )
            // InternalPactDSL.g:6859:1: ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) )
            {
            // InternalPactDSL.g:6859:1: ( ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 ) )
            // InternalPactDSL.g:6860:2: ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventAssignment_5()); 
            // InternalPactDSL.g:6861:2: ( rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 )
            // InternalPactDSL.g:6861:3: rule__OnInsolvencyEvent__InsolvencyEventAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__InsolvencyEventAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__5__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__6"
    // InternalPactDSL.g:6869:1: rule__OnInsolvencyEvent__Group__6 : rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7 ;
    public final void rule__OnInsolvencyEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6873:1: ( rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7 )
            // InternalPactDSL.g:6874:2: rule__OnInsolvencyEvent__Group__6__Impl rule__OnInsolvencyEvent__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__OnInsolvencyEvent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__6"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__6__Impl"
    // InternalPactDSL.g:6881:1: rule__OnInsolvencyEvent__Group__6__Impl : ( 'of' ) ;
    public final void rule__OnInsolvencyEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6885:1: ( ( 'of' ) )
            // InternalPactDSL.g:6886:1: ( 'of' )
            {
            // InternalPactDSL.g:6886:1: ( 'of' )
            // InternalPactDSL.g:6887:2: 'of'
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getOfKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__6__Impl"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__7"
    // InternalPactDSL.g:6896:1: rule__OnInsolvencyEvent__Group__7 : rule__OnInsolvencyEvent__Group__7__Impl ;
    public final void rule__OnInsolvencyEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6900:1: ( rule__OnInsolvencyEvent__Group__7__Impl )
            // InternalPactDSL.g:6901:2: rule__OnInsolvencyEvent__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__7"


    // $ANTLR start "rule__OnInsolvencyEvent__Group__7__Impl"
    // InternalPactDSL.g:6907:1: rule__OnInsolvencyEvent__Group__7__Impl : ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) ) ;
    public final void rule__OnInsolvencyEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6911:1: ( ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) ) )
            // InternalPactDSL.g:6912:1: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) )
            {
            // InternalPactDSL.g:6912:1: ( ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 ) )
            // InternalPactDSL.g:6913:2: ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_7()); 
            // InternalPactDSL.g:6914:2: ( rule__OnInsolvencyEvent__SuperTypeAssignment_7 )
            // InternalPactDSL.g:6914:3: rule__OnInsolvencyEvent__SuperTypeAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__OnInsolvencyEvent__SuperTypeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypeAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__Group__7__Impl"


    // $ANTLR start "rule__CustomTermination__Group__0"
    // InternalPactDSL.g:6923:1: rule__CustomTermination__Group__0 : rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1 ;
    public final void rule__CustomTermination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6927:1: ( rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1 )
            // InternalPactDSL.g:6928:2: rule__CustomTermination__Group__0__Impl rule__CustomTermination__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__CustomTermination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__0"


    // $ANTLR start "rule__CustomTermination__Group__0__Impl"
    // InternalPactDSL.g:6935:1: rule__CustomTermination__Group__0__Impl : ( 'Termination:' ) ;
    public final void rule__CustomTermination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6939:1: ( ( 'Termination:' ) )
            // InternalPactDSL.g:6940:1: ( 'Termination:' )
            {
            // InternalPactDSL.g:6940:1: ( 'Termination:' )
            // InternalPactDSL.g:6941:2: 'Termination:'
            {
             before(grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getTerminationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__0__Impl"


    // $ANTLR start "rule__CustomTermination__Group__1"
    // InternalPactDSL.g:6950:1: rule__CustomTermination__Group__1 : rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2 ;
    public final void rule__CustomTermination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6954:1: ( rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2 )
            // InternalPactDSL.g:6955:2: rule__CustomTermination__Group__1__Impl rule__CustomTermination__Group__2
            {
            pushFollow(FOLLOW_47);
            rule__CustomTermination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__1"


    // $ANTLR start "rule__CustomTermination__Group__1__Impl"
    // InternalPactDSL.g:6962:1: rule__CustomTermination__Group__1__Impl : ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) ) ;
    public final void rule__CustomTermination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6966:1: ( ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) ) )
            // InternalPactDSL.g:6967:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) )
            {
            // InternalPactDSL.g:6967:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* ) )
            // InternalPactDSL.g:6968:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 ) ) ( ( rule__CustomTermination__SuperTypeAssignment_1 )* )
            {
            // InternalPactDSL.g:6968:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 ) )
            // InternalPactDSL.g:6969:3: ( rule__CustomTermination__SuperTypeAssignment_1 )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6970:3: ( rule__CustomTermination__SuperTypeAssignment_1 )
            // InternalPactDSL.g:6970:4: rule__CustomTermination__SuperTypeAssignment_1
            {
            pushFollow(FOLLOW_11);
            rule__CustomTermination__SuperTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 

            }

            // InternalPactDSL.g:6973:2: ( ( rule__CustomTermination__SuperTypeAssignment_1 )* )
            // InternalPactDSL.g:6974:3: ( rule__CustomTermination__SuperTypeAssignment_1 )*
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 
            // InternalPactDSL.g:6975:3: ( rule__CustomTermination__SuperTypeAssignment_1 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ID) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalPactDSL.g:6975:4: rule__CustomTermination__SuperTypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__CustomTermination__SuperTypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_1()); 

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
    // $ANTLR end "rule__CustomTermination__Group__1__Impl"


    // $ANTLR start "rule__CustomTermination__Group__2"
    // InternalPactDSL.g:6984:1: rule__CustomTermination__Group__2 : rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3 ;
    public final void rule__CustomTermination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:6988:1: ( rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3 )
            // InternalPactDSL.g:6989:2: rule__CustomTermination__Group__2__Impl rule__CustomTermination__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__CustomTermination__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__2"


    // $ANTLR start "rule__CustomTermination__Group__2__Impl"
    // InternalPactDSL.g:6996:1: rule__CustomTermination__Group__2__Impl : ( 'may' ) ;
    public final void rule__CustomTermination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7000:1: ( ( 'may' ) )
            // InternalPactDSL.g:7001:1: ( 'may' )
            {
            // InternalPactDSL.g:7001:1: ( 'may' )
            // InternalPactDSL.g:7002:2: 'may'
            {
             before(grammarAccess.getCustomTerminationAccess().getMayKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getMayKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__2__Impl"


    // $ANTLR start "rule__CustomTermination__Group__3"
    // InternalPactDSL.g:7011:1: rule__CustomTermination__Group__3 : rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4 ;
    public final void rule__CustomTermination__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7015:1: ( rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4 )
            // InternalPactDSL.g:7016:2: rule__CustomTermination__Group__3__Impl rule__CustomTermination__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__CustomTermination__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__3"


    // $ANTLR start "rule__CustomTermination__Group__3__Impl"
    // InternalPactDSL.g:7023:1: rule__CustomTermination__Group__3__Impl : ( 'terminate' ) ;
    public final void rule__CustomTermination__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7027:1: ( ( 'terminate' ) )
            // InternalPactDSL.g:7028:1: ( 'terminate' )
            {
            // InternalPactDSL.g:7028:1: ( 'terminate' )
            // InternalPactDSL.g:7029:2: 'terminate'
            {
             before(grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getTerminateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__3__Impl"


    // $ANTLR start "rule__CustomTermination__Group__4"
    // InternalPactDSL.g:7038:1: rule__CustomTermination__Group__4 : rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5 ;
    public final void rule__CustomTermination__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7042:1: ( rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5 )
            // InternalPactDSL.g:7043:2: rule__CustomTermination__Group__4__Impl rule__CustomTermination__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__CustomTermination__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__4"


    // $ANTLR start "rule__CustomTermination__Group__4__Impl"
    // InternalPactDSL.g:7050:1: rule__CustomTermination__Group__4__Impl : ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) ) ;
    public final void rule__CustomTermination__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7054:1: ( ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) ) )
            // InternalPactDSL.g:7055:1: ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) )
            {
            // InternalPactDSL.g:7055:1: ( ( rule__CustomTermination__CustomTerminationClauseAssignment_4 ) )
            // InternalPactDSL.g:7056:2: ( rule__CustomTermination__CustomTerminationClauseAssignment_4 )
            {
             before(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseAssignment_4()); 
            // InternalPactDSL.g:7057:2: ( rule__CustomTermination__CustomTerminationClauseAssignment_4 )
            // InternalPactDSL.g:7057:3: rule__CustomTermination__CustomTerminationClauseAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__CustomTerminationClauseAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__4__Impl"


    // $ANTLR start "rule__CustomTermination__Group__5"
    // InternalPactDSL.g:7065:1: rule__CustomTermination__Group__5 : rule__CustomTermination__Group__5__Impl ;
    public final void rule__CustomTermination__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7069:1: ( rule__CustomTermination__Group__5__Impl )
            // InternalPactDSL.g:7070:2: rule__CustomTermination__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__5"


    // $ANTLR start "rule__CustomTermination__Group__5__Impl"
    // InternalPactDSL.g:7076:1: rule__CustomTermination__Group__5__Impl : ( ( rule__CustomTermination__Group_5__0 )? ) ;
    public final void rule__CustomTermination__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7080:1: ( ( ( rule__CustomTermination__Group_5__0 )? ) )
            // InternalPactDSL.g:7081:1: ( ( rule__CustomTermination__Group_5__0 )? )
            {
            // InternalPactDSL.g:7081:1: ( ( rule__CustomTermination__Group_5__0 )? )
            // InternalPactDSL.g:7082:2: ( rule__CustomTermination__Group_5__0 )?
            {
             before(grammarAccess.getCustomTerminationAccess().getGroup_5()); 
            // InternalPactDSL.g:7083:2: ( rule__CustomTermination__Group_5__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==46) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalPactDSL.g:7083:3: rule__CustomTermination__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CustomTermination__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCustomTerminationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group__5__Impl"


    // $ANTLR start "rule__CustomTermination__Group_5__0"
    // InternalPactDSL.g:7092:1: rule__CustomTermination__Group_5__0 : rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1 ;
    public final void rule__CustomTermination__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7096:1: ( rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1 )
            // InternalPactDSL.g:7097:2: rule__CustomTermination__Group_5__0__Impl rule__CustomTermination__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__CustomTermination__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__0"


    // $ANTLR start "rule__CustomTermination__Group_5__0__Impl"
    // InternalPactDSL.g:7104:1: rule__CustomTermination__Group_5__0__Impl : ( 'by' ) ;
    public final void rule__CustomTermination__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7108:1: ( ( 'by' ) )
            // InternalPactDSL.g:7109:1: ( 'by' )
            {
            // InternalPactDSL.g:7109:1: ( 'by' )
            // InternalPactDSL.g:7110:2: 'by'
            {
             before(grammarAccess.getCustomTerminationAccess().getByKeyword_5_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getByKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__0__Impl"


    // $ANTLR start "rule__CustomTermination__Group_5__1"
    // InternalPactDSL.g:7119:1: rule__CustomTermination__Group_5__1 : rule__CustomTermination__Group_5__1__Impl ;
    public final void rule__CustomTermination__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7123:1: ( rule__CustomTermination__Group_5__1__Impl )
            // InternalPactDSL.g:7124:2: rule__CustomTermination__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__1"


    // $ANTLR start "rule__CustomTermination__Group_5__1__Impl"
    // InternalPactDSL.g:7130:1: rule__CustomTermination__Group_5__1__Impl : ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) ) ;
    public final void rule__CustomTermination__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7134:1: ( ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) ) )
            // InternalPactDSL.g:7135:1: ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) )
            {
            // InternalPactDSL.g:7135:1: ( ( rule__CustomTermination__SuperTypeAssignment_5_1 ) )
            // InternalPactDSL.g:7136:2: ( rule__CustomTermination__SuperTypeAssignment_5_1 )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_5_1()); 
            // InternalPactDSL.g:7137:2: ( rule__CustomTermination__SuperTypeAssignment_5_1 )
            // InternalPactDSL.g:7137:3: rule__CustomTermination__SuperTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__CustomTermination__SuperTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__Group_5__1__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__0"
    // InternalPactDSL.g:7146:1: rule__ApplicableLaw__Group__0 : rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1 ;
    public final void rule__ApplicableLaw__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7150:1: ( rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1 )
            // InternalPactDSL.g:7151:2: rule__ApplicableLaw__Group__0__Impl rule__ApplicableLaw__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ApplicableLaw__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__0"


    // $ANTLR start "rule__ApplicableLaw__Group__0__Impl"
    // InternalPactDSL.g:7158:1: rule__ApplicableLaw__Group__0__Impl : ( 'ApplicableLaw:' ) ;
    public final void rule__ApplicableLaw__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7162:1: ( ( 'ApplicableLaw:' ) )
            // InternalPactDSL.g:7163:1: ( 'ApplicableLaw:' )
            {
            // InternalPactDSL.g:7163:1: ( 'ApplicableLaw:' )
            // InternalPactDSL.g:7164:2: 'ApplicableLaw:'
            {
             before(grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getApplicableLawAccess().getApplicableLawKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__0__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__1"
    // InternalPactDSL.g:7173:1: rule__ApplicableLaw__Group__1 : rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2 ;
    public final void rule__ApplicableLaw__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7177:1: ( rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2 )
            // InternalPactDSL.g:7178:2: rule__ApplicableLaw__Group__1__Impl rule__ApplicableLaw__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__ApplicableLaw__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__1"


    // $ANTLR start "rule__ApplicableLaw__Group__1__Impl"
    // InternalPactDSL.g:7185:1: rule__ApplicableLaw__Group__1__Impl : ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) ) ;
    public final void rule__ApplicableLaw__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7189:1: ( ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) ) )
            // InternalPactDSL.g:7190:1: ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) )
            {
            // InternalPactDSL.g:7190:1: ( ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 ) )
            // InternalPactDSL.g:7191:2: ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 )
            {
             before(grammarAccess.getApplicableLawAccess().getCustomApplicableLawAssignment_1()); 
            // InternalPactDSL.g:7192:2: ( rule__ApplicableLaw__CustomApplicableLawAssignment_1 )
            // InternalPactDSL.g:7192:3: rule__ApplicableLaw__CustomApplicableLawAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__CustomApplicableLawAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicableLawAccess().getCustomApplicableLawAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__1__Impl"


    // $ANTLR start "rule__ApplicableLaw__Group__2"
    // InternalPactDSL.g:7200:1: rule__ApplicableLaw__Group__2 : rule__ApplicableLaw__Group__2__Impl ;
    public final void rule__ApplicableLaw__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7204:1: ( rule__ApplicableLaw__Group__2__Impl )
            // InternalPactDSL.g:7205:2: rule__ApplicableLaw__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ApplicableLaw__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__2"


    // $ANTLR start "rule__ApplicableLaw__Group__2__Impl"
    // InternalPactDSL.g:7211:1: rule__ApplicableLaw__Group__2__Impl : ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? ) ;
    public final void rule__ApplicableLaw__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7215:1: ( ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? ) )
            // InternalPactDSL.g:7216:1: ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? )
            {
            // InternalPactDSL.g:7216:1: ( ( rule__ApplicableLaw__DefinitionAssignment_2 )? )
            // InternalPactDSL.g:7217:2: ( rule__ApplicableLaw__DefinitionAssignment_2 )?
            {
             before(grammarAccess.getApplicableLawAccess().getDefinitionAssignment_2()); 
            // InternalPactDSL.g:7218:2: ( rule__ApplicableLaw__DefinitionAssignment_2 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==30) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalPactDSL.g:7218:3: rule__ApplicableLaw__DefinitionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ApplicableLaw__DefinitionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getApplicableLawAccess().getDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__Group__2__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__0"
    // InternalPactDSL.g:7227:1: rule__Jurisdiction__Group__0 : rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1 ;
    public final void rule__Jurisdiction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7231:1: ( rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1 )
            // InternalPactDSL.g:7232:2: rule__Jurisdiction__Group__0__Impl rule__Jurisdiction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Jurisdiction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__0"


    // $ANTLR start "rule__Jurisdiction__Group__0__Impl"
    // InternalPactDSL.g:7239:1: rule__Jurisdiction__Group__0__Impl : ( 'Jurisdiction:' ) ;
    public final void rule__Jurisdiction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7243:1: ( ( 'Jurisdiction:' ) )
            // InternalPactDSL.g:7244:1: ( 'Jurisdiction:' )
            {
            // InternalPactDSL.g:7244:1: ( 'Jurisdiction:' )
            // InternalPactDSL.g:7245:2: 'Jurisdiction:'
            {
             before(grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getJurisdictionAccess().getJurisdictionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__0__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__1"
    // InternalPactDSL.g:7254:1: rule__Jurisdiction__Group__1 : rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2 ;
    public final void rule__Jurisdiction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7258:1: ( rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2 )
            // InternalPactDSL.g:7259:2: rule__Jurisdiction__Group__1__Impl rule__Jurisdiction__Group__2
            {
            pushFollow(FOLLOW_52);
            rule__Jurisdiction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__1"


    // $ANTLR start "rule__Jurisdiction__Group__1__Impl"
    // InternalPactDSL.g:7266:1: rule__Jurisdiction__Group__1__Impl : ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) ) ;
    public final void rule__Jurisdiction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7270:1: ( ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) ) )
            // InternalPactDSL.g:7271:1: ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) )
            {
            // InternalPactDSL.g:7271:1: ( ( rule__Jurisdiction__CustomJurisdictionAssignment_1 ) )
            // InternalPactDSL.g:7272:2: ( rule__Jurisdiction__CustomJurisdictionAssignment_1 )
            {
             before(grammarAccess.getJurisdictionAccess().getCustomJurisdictionAssignment_1()); 
            // InternalPactDSL.g:7273:2: ( rule__Jurisdiction__CustomJurisdictionAssignment_1 )
            // InternalPactDSL.g:7273:3: rule__Jurisdiction__CustomJurisdictionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__CustomJurisdictionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJurisdictionAccess().getCustomJurisdictionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__1__Impl"


    // $ANTLR start "rule__Jurisdiction__Group__2"
    // InternalPactDSL.g:7281:1: rule__Jurisdiction__Group__2 : rule__Jurisdiction__Group__2__Impl ;
    public final void rule__Jurisdiction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7285:1: ( rule__Jurisdiction__Group__2__Impl )
            // InternalPactDSL.g:7286:2: rule__Jurisdiction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Jurisdiction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__2"


    // $ANTLR start "rule__Jurisdiction__Group__2__Impl"
    // InternalPactDSL.g:7292:1: rule__Jurisdiction__Group__2__Impl : ( ( rule__Jurisdiction__DefinitionAssignment_2 )? ) ;
    public final void rule__Jurisdiction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7296:1: ( ( ( rule__Jurisdiction__DefinitionAssignment_2 )? ) )
            // InternalPactDSL.g:7297:1: ( ( rule__Jurisdiction__DefinitionAssignment_2 )? )
            {
            // InternalPactDSL.g:7297:1: ( ( rule__Jurisdiction__DefinitionAssignment_2 )? )
            // InternalPactDSL.g:7298:2: ( rule__Jurisdiction__DefinitionAssignment_2 )?
            {
             before(grammarAccess.getJurisdictionAccess().getDefinitionAssignment_2()); 
            // InternalPactDSL.g:7299:2: ( rule__Jurisdiction__DefinitionAssignment_2 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==30) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalPactDSL.g:7299:3: rule__Jurisdiction__DefinitionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Jurisdiction__DefinitionAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJurisdictionAccess().getDefinitionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__Group__2__Impl"


    // $ANTLR start "rule__Notices__Group__0"
    // InternalPactDSL.g:7308:1: rule__Notices__Group__0 : rule__Notices__Group__0__Impl rule__Notices__Group__1 ;
    public final void rule__Notices__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7312:1: ( rule__Notices__Group__0__Impl rule__Notices__Group__1 )
            // InternalPactDSL.g:7313:2: rule__Notices__Group__0__Impl rule__Notices__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Notices__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Notices__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__0"


    // $ANTLR start "rule__Notices__Group__0__Impl"
    // InternalPactDSL.g:7320:1: rule__Notices__Group__0__Impl : ( 'Notices:' ) ;
    public final void rule__Notices__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7324:1: ( ( 'Notices:' ) )
            // InternalPactDSL.g:7325:1: ( 'Notices:' )
            {
            // InternalPactDSL.g:7325:1: ( 'Notices:' )
            // InternalPactDSL.g:7326:2: 'Notices:'
            {
             before(grammarAccess.getNoticesAccess().getNoticesKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getNoticesAccess().getNoticesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__0__Impl"


    // $ANTLR start "rule__Notices__Group__1"
    // InternalPactDSL.g:7335:1: rule__Notices__Group__1 : rule__Notices__Group__1__Impl ;
    public final void rule__Notices__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7339:1: ( rule__Notices__Group__1__Impl )
            // InternalPactDSL.g:7340:2: rule__Notices__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Notices__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__1"


    // $ANTLR start "rule__Notices__Group__1__Impl"
    // InternalPactDSL.g:7346:1: rule__Notices__Group__1__Impl : ( ( rule__Notices__CustomNoticeAssignment_1 ) ) ;
    public final void rule__Notices__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7350:1: ( ( ( rule__Notices__CustomNoticeAssignment_1 ) ) )
            // InternalPactDSL.g:7351:1: ( ( rule__Notices__CustomNoticeAssignment_1 ) )
            {
            // InternalPactDSL.g:7351:1: ( ( rule__Notices__CustomNoticeAssignment_1 ) )
            // InternalPactDSL.g:7352:2: ( rule__Notices__CustomNoticeAssignment_1 )
            {
             before(grammarAccess.getNoticesAccess().getCustomNoticeAssignment_1()); 
            // InternalPactDSL.g:7353:2: ( rule__Notices__CustomNoticeAssignment_1 )
            // InternalPactDSL.g:7353:3: rule__Notices__CustomNoticeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Notices__CustomNoticeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNoticesAccess().getCustomNoticeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__Group__1__Impl"


    // $ANTLR start "rule__Model__TitleAssignment_1"
    // InternalPactDSL.g:7362:1: rule__Model__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7366:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7367:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7367:2: ( RULE_STRING )
            // InternalPactDSL.g:7368:3: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getTitleSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TitleAssignment_1"


    // $ANTLR start "rule__Model__EntityTypesAssignment_4_0"
    // InternalPactDSL.g:7377:1: rule__Model__EntityTypesAssignment_4_0 : ( ruleEntityType ) ;
    public final void rule__Model__EntityTypesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7381:1: ( ( ruleEntityType ) )
            // InternalPactDSL.g:7382:2: ( ruleEntityType )
            {
            // InternalPactDSL.g:7382:2: ( ruleEntityType )
            // InternalPactDSL.g:7383:3: ruleEntityType
            {
             before(grammarAccess.getModelAccess().getEntityTypesEntityTypeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntityTypesEntityTypeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntityTypesAssignment_4_0"


    // $ANTLR start "rule__Model__FormalityTypesAssignment_6_0"
    // InternalPactDSL.g:7392:1: rule__Model__FormalityTypesAssignment_6_0 : ( ruleFormalityType ) ;
    public final void rule__Model__FormalityTypesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7396:1: ( ( ruleFormalityType ) )
            // InternalPactDSL.g:7397:2: ( ruleFormalityType )
            {
            // InternalPactDSL.g:7397:2: ( ruleFormalityType )
            // InternalPactDSL.g:7398:3: ruleFormalityType
            {
             before(grammarAccess.getModelAccess().getFormalityTypesFormalityTypeParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFormalityType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFormalityTypesFormalityTypeParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FormalityTypesAssignment_6_0"


    // $ANTLR start "rule__Model__ActionTypesAssignment_8_0"
    // InternalPactDSL.g:7407:1: rule__Model__ActionTypesAssignment_8_0 : ( ruleActionType ) ;
    public final void rule__Model__ActionTypesAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7411:1: ( ( ruleActionType ) )
            // InternalPactDSL.g:7412:2: ( ruleActionType )
            {
            // InternalPactDSL.g:7412:2: ( ruleActionType )
            // InternalPactDSL.g:7413:3: ruleActionType
            {
             before(grammarAccess.getModelAccess().getActionTypesActionTypeParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleActionType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getActionTypesActionTypeParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ActionTypesAssignment_8_0"


    // $ANTLR start "rule__Model__StateTypesAssignment_10_0"
    // InternalPactDSL.g:7422:1: rule__Model__StateTypesAssignment_10_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7426:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:7427:2: ( ruleStateType )
            {
            // InternalPactDSL.g:7427:2: ( ruleStateType )
            // InternalPactDSL.g:7428:3: ruleStateType
            {
             before(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StateTypesAssignment_10_0"


    // $ANTLR start "rule__Model__PrimaryObligationTypesAssignment_12_0"
    // InternalPactDSL.g:7437:1: rule__Model__PrimaryObligationTypesAssignment_12_0 : ( rulePrimaryObligationType ) ;
    public final void rule__Model__PrimaryObligationTypesAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7441:1: ( ( rulePrimaryObligationType ) )
            // InternalPactDSL.g:7442:2: ( rulePrimaryObligationType )
            {
            // InternalPactDSL.g:7442:2: ( rulePrimaryObligationType )
            // InternalPactDSL.g:7443:3: rulePrimaryObligationType
            {
             before(grammarAccess.getModelAccess().getPrimaryObligationTypesPrimaryObligationTypeParserRuleCall_12_0_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryObligationType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPrimaryObligationTypesPrimaryObligationTypeParserRuleCall_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PrimaryObligationTypesAssignment_12_0"


    // $ANTLR start "rule__Model__StateTypesAssignment_14_0"
    // InternalPactDSL.g:7452:1: rule__Model__StateTypesAssignment_14_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_14_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7456:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:7457:2: ( ruleStateType )
            {
            // InternalPactDSL.g:7457:2: ( ruleStateType )
            // InternalPactDSL.g:7458:3: ruleStateType
            {
             before(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_14_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_14_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StateTypesAssignment_14_0"


    // $ANTLR start "rule__Model__TerminationTypesAssignment_16_0"
    // InternalPactDSL.g:7467:1: rule__Model__TerminationTypesAssignment_16_0 : ( ruleTerminationType ) ;
    public final void rule__Model__TerminationTypesAssignment_16_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7471:1: ( ( ruleTerminationType ) )
            // InternalPactDSL.g:7472:2: ( ruleTerminationType )
            {
            // InternalPactDSL.g:7472:2: ( ruleTerminationType )
            // InternalPactDSL.g:7473:3: ruleTerminationType
            {
             before(grammarAccess.getModelAccess().getTerminationTypesTerminationTypeParserRuleCall_16_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerminationType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTerminationTypesTerminationTypeParserRuleCall_16_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TerminationTypesAssignment_16_0"


    // $ANTLR start "rule__Model__StateTypesAssignment_18_0"
    // InternalPactDSL.g:7482:1: rule__Model__StateTypesAssignment_18_0 : ( ruleStateType ) ;
    public final void rule__Model__StateTypesAssignment_18_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7486:1: ( ( ruleStateType ) )
            // InternalPactDSL.g:7487:2: ( ruleStateType )
            {
            // InternalPactDSL.g:7487:2: ( ruleStateType )
            // InternalPactDSL.g:7488:3: ruleStateType
            {
             before(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_18_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStateTypesStateTypeParserRuleCall_18_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StateTypesAssignment_18_0"


    // $ANTLR start "rule__Model__BoilerplateTypesAssignment_20_0"
    // InternalPactDSL.g:7497:1: rule__Model__BoilerplateTypesAssignment_20_0 : ( ruleBoilerplateType ) ;
    public final void rule__Model__BoilerplateTypesAssignment_20_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7501:1: ( ( ruleBoilerplateType ) )
            // InternalPactDSL.g:7502:2: ( ruleBoilerplateType )
            {
            // InternalPactDSL.g:7502:2: ( ruleBoilerplateType )
            // InternalPactDSL.g:7503:3: ruleBoilerplateType
            {
             before(grammarAccess.getModelAccess().getBoilerplateTypesBoilerplateTypeParserRuleCall_20_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBoilerplateType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBoilerplateTypesBoilerplateTypeParserRuleCall_20_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BoilerplateTypesAssignment_20_0"


    // $ANTLR start "rule__EffectiveDate__DayAssignment_1_0"
    // InternalPactDSL.g:7512:1: rule__EffectiveDate__DayAssignment_1_0 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__DayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7516:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7517:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7517:2: ( RULE_INT )
            // InternalPactDSL.g:7518:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getDayINTTerminalRuleCall_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getDayINTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__DayAssignment_1_0"


    // $ANTLR start "rule__EffectiveDate__MonthAssignment_1_1"
    // InternalPactDSL.g:7527:1: rule__EffectiveDate__MonthAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__MonthAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7531:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7532:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7532:2: ( RULE_INT )
            // InternalPactDSL.g:7533:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getMonthINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getMonthINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__MonthAssignment_1_1"


    // $ANTLR start "rule__EffectiveDate__YearAssignment_1_2"
    // InternalPactDSL.g:7542:1: rule__EffectiveDate__YearAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__EffectiveDate__YearAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7546:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7547:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7547:2: ( RULE_INT )
            // InternalPactDSL.g:7548:3: RULE_INT
            {
             before(grammarAccess.getEffectiveDateAccess().getYearINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEffectiveDateAccess().getYearINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EffectiveDate__YearAssignment_1_2"


    // $ANTLR start "rule__Party__NameAssignment_1"
    // InternalPactDSL.g:7557:1: rule__Party__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Party__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7561:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:7562:2: ( RULE_ID )
            {
            // InternalPactDSL.g:7562:2: ( RULE_ID )
            // InternalPactDSL.g:7563:3: RULE_ID
            {
             before(grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__NameAssignment_1"


    // $ANTLR start "rule__Party__FullnameAssignment_2"
    // InternalPactDSL.g:7572:1: rule__Party__FullnameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Party__FullnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7576:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7577:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7577:2: ( RULE_STRING )
            // InternalPactDSL.g:7578:3: RULE_STRING
            {
             before(grammarAccess.getPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__FullnameAssignment_2"


    // $ANTLR start "rule__Party__DefinitionAssignment_3"
    // InternalPactDSL.g:7587:1: rule__Party__DefinitionAssignment_3 : ( ruleDefinedTerm ) ;
    public final void rule__Party__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7591:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:7592:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:7592:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:7593:3: ruleDefinedTerm
            {
             before(grammarAccess.getPartyAccess().getDefinitionDefinedTermParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getPartyAccess().getDefinitionDefinedTermParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__DefinitionAssignment_3"


    // $ANTLR start "rule__Party__AddressAssignment_4"
    // InternalPactDSL.g:7602:1: rule__Party__AddressAssignment_4 : ( ruleAddress ) ;
    public final void rule__Party__AddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7606:1: ( ( ruleAddress ) )
            // InternalPactDSL.g:7607:2: ( ruleAddress )
            {
            // InternalPactDSL.g:7607:2: ( ruleAddress )
            // InternalPactDSL.g:7608:3: ruleAddress
            {
             before(grammarAccess.getPartyAccess().getAddressAddressParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getPartyAccess().getAddressAddressParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__AddressAssignment_4"


    // $ANTLR start "rule__Party__CompanyNumberAssignment_5"
    // InternalPactDSL.g:7617:1: rule__Party__CompanyNumberAssignment_5 : ( ruleCompanyNumber ) ;
    public final void rule__Party__CompanyNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7621:1: ( ( ruleCompanyNumber ) )
            // InternalPactDSL.g:7622:2: ( ruleCompanyNumber )
            {
            // InternalPactDSL.g:7622:2: ( ruleCompanyNumber )
            // InternalPactDSL.g:7623:3: ruleCompanyNumber
            {
             before(grammarAccess.getPartyAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCompanyNumber();

            state._fsp--;

             after(grammarAccess.getPartyAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__CompanyNumberAssignment_5"


    // $ANTLR start "rule__Party__FeaturesAssignment_6"
    // InternalPactDSL.g:7632:1: rule__Party__FeaturesAssignment_6 : ( ruleFeature ) ;
    public final void rule__Party__FeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7636:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:7637:2: ( ruleFeature )
            {
            // InternalPactDSL.g:7637:2: ( ruleFeature )
            // InternalPactDSL.g:7638:3: ruleFeature
            {
             before(grammarAccess.getPartyAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getPartyAccess().getFeaturesFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Party__FeaturesAssignment_6"


    // $ANTLR start "rule__ThirdParty__NameAssignment_1"
    // InternalPactDSL.g:7647:1: rule__ThirdParty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ThirdParty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7651:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:7652:2: ( RULE_ID )
            {
            // InternalPactDSL.g:7652:2: ( RULE_ID )
            // InternalPactDSL.g:7653:3: RULE_ID
            {
             before(grammarAccess.getThirdPartyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__NameAssignment_1"


    // $ANTLR start "rule__ThirdParty__FullnameAssignment_2"
    // InternalPactDSL.g:7662:1: rule__ThirdParty__FullnameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ThirdParty__FullnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7666:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7667:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7667:2: ( RULE_STRING )
            // InternalPactDSL.g:7668:3: RULE_STRING
            {
             before(grammarAccess.getThirdPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getThirdPartyAccess().getFullnameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__FullnameAssignment_2"


    // $ANTLR start "rule__ThirdParty__DefinitionAssignment_3"
    // InternalPactDSL.g:7677:1: rule__ThirdParty__DefinitionAssignment_3 : ( ruleDefinedTerm ) ;
    public final void rule__ThirdParty__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7681:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:7682:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:7682:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:7683:3: ruleDefinedTerm
            {
             before(grammarAccess.getThirdPartyAccess().getDefinitionDefinedTermParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getThirdPartyAccess().getDefinitionDefinedTermParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__DefinitionAssignment_3"


    // $ANTLR start "rule__ThirdParty__AddressAssignment_4"
    // InternalPactDSL.g:7692:1: rule__ThirdParty__AddressAssignment_4 : ( ruleAddress ) ;
    public final void rule__ThirdParty__AddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7696:1: ( ( ruleAddress ) )
            // InternalPactDSL.g:7697:2: ( ruleAddress )
            {
            // InternalPactDSL.g:7697:2: ( ruleAddress )
            // InternalPactDSL.g:7698:3: ruleAddress
            {
             before(grammarAccess.getThirdPartyAccess().getAddressAddressParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getThirdPartyAccess().getAddressAddressParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__AddressAssignment_4"


    // $ANTLR start "rule__ThirdParty__CompanyNumberAssignment_5"
    // InternalPactDSL.g:7707:1: rule__ThirdParty__CompanyNumberAssignment_5 : ( ruleCompanyNumber ) ;
    public final void rule__ThirdParty__CompanyNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7711:1: ( ( ruleCompanyNumber ) )
            // InternalPactDSL.g:7712:2: ( ruleCompanyNumber )
            {
            // InternalPactDSL.g:7712:2: ( ruleCompanyNumber )
            // InternalPactDSL.g:7713:3: ruleCompanyNumber
            {
             before(grammarAccess.getThirdPartyAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCompanyNumber();

            state._fsp--;

             after(grammarAccess.getThirdPartyAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__CompanyNumberAssignment_5"


    // $ANTLR start "rule__ThirdParty__FeaturesAssignment_6"
    // InternalPactDSL.g:7722:1: rule__ThirdParty__FeaturesAssignment_6 : ( ruleFeature ) ;
    public final void rule__ThirdParty__FeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7726:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:7727:2: ( ruleFeature )
            {
            // InternalPactDSL.g:7727:2: ( ruleFeature )
            // InternalPactDSL.g:7728:3: ruleFeature
            {
             before(grammarAccess.getThirdPartyAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getThirdPartyAccess().getFeaturesFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ThirdParty__FeaturesAssignment_6"


    // $ANTLR start "rule__SubjectMatter__NameAssignment_1"
    // InternalPactDSL.g:7737:1: rule__SubjectMatter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SubjectMatter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7741:1: ( ( RULE_ID ) )
            // InternalPactDSL.g:7742:2: ( RULE_ID )
            {
            // InternalPactDSL.g:7742:2: ( RULE_ID )
            // InternalPactDSL.g:7743:3: RULE_ID
            {
             before(grammarAccess.getSubjectMatterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__NameAssignment_1"


    // $ANTLR start "rule__SubjectMatter__SubjectMatterAssignment_2"
    // InternalPactDSL.g:7752:1: rule__SubjectMatter__SubjectMatterAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SubjectMatter__SubjectMatterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7756:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7757:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7757:2: ( RULE_STRING )
            // InternalPactDSL.g:7758:3: RULE_STRING
            {
             before(grammarAccess.getSubjectMatterAccess().getSubjectMatterSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSubjectMatterAccess().getSubjectMatterSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__SubjectMatterAssignment_2"


    // $ANTLR start "rule__SubjectMatter__DefinitionAssignment_3"
    // InternalPactDSL.g:7767:1: rule__SubjectMatter__DefinitionAssignment_3 : ( ruleDefinedTerm ) ;
    public final void rule__SubjectMatter__DefinitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7771:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:7772:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:7772:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:7773:3: ruleDefinedTerm
            {
             before(grammarAccess.getSubjectMatterAccess().getDefinitionDefinedTermParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getSubjectMatterAccess().getDefinitionDefinedTermParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__DefinitionAssignment_3"


    // $ANTLR start "rule__SubjectMatter__AddressAssignment_4"
    // InternalPactDSL.g:7782:1: rule__SubjectMatter__AddressAssignment_4 : ( ruleAddress ) ;
    public final void rule__SubjectMatter__AddressAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7786:1: ( ( ruleAddress ) )
            // InternalPactDSL.g:7787:2: ( ruleAddress )
            {
            // InternalPactDSL.g:7787:2: ( ruleAddress )
            // InternalPactDSL.g:7788:3: ruleAddress
            {
             before(grammarAccess.getSubjectMatterAccess().getAddressAddressParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAddress();

            state._fsp--;

             after(grammarAccess.getSubjectMatterAccess().getAddressAddressParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__AddressAssignment_4"


    // $ANTLR start "rule__SubjectMatter__CompanyNumberAssignment_5"
    // InternalPactDSL.g:7797:1: rule__SubjectMatter__CompanyNumberAssignment_5 : ( ruleCompanyNumber ) ;
    public final void rule__SubjectMatter__CompanyNumberAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7801:1: ( ( ruleCompanyNumber ) )
            // InternalPactDSL.g:7802:2: ( ruleCompanyNumber )
            {
            // InternalPactDSL.g:7802:2: ( ruleCompanyNumber )
            // InternalPactDSL.g:7803:3: ruleCompanyNumber
            {
             before(grammarAccess.getSubjectMatterAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCompanyNumber();

            state._fsp--;

             after(grammarAccess.getSubjectMatterAccess().getCompanyNumberCompanyNumberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__CompanyNumberAssignment_5"


    // $ANTLR start "rule__SubjectMatter__FeaturesAssignment_6"
    // InternalPactDSL.g:7812:1: rule__SubjectMatter__FeaturesAssignment_6 : ( ruleFeature ) ;
    public final void rule__SubjectMatter__FeaturesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7816:1: ( ( ruleFeature ) )
            // InternalPactDSL.g:7817:2: ( ruleFeature )
            {
            // InternalPactDSL.g:7817:2: ( ruleFeature )
            // InternalPactDSL.g:7818:3: ruleFeature
            {
             before(grammarAccess.getSubjectMatterAccess().getFeaturesFeatureParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getSubjectMatterAccess().getFeaturesFeatureParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubjectMatter__FeaturesAssignment_6"


    // $ANTLR start "rule__DefinedTerm__DefinitionAssignment_1"
    // InternalPactDSL.g:7827:1: rule__DefinedTerm__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DefinedTerm__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7831:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7832:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7832:2: ( RULE_STRING )
            // InternalPactDSL.g:7833:3: RULE_STRING
            {
             before(grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDefinedTermAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefinedTerm__DefinitionAssignment_1"


    // $ANTLR start "rule__Address__DefinitionAssignment_1"
    // InternalPactDSL.g:7842:1: rule__Address__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Address__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7846:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7847:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7847:2: ( RULE_STRING )
            // InternalPactDSL.g:7848:3: RULE_STRING
            {
             before(grammarAccess.getAddressAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAddressAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Address__DefinitionAssignment_1"


    // $ANTLR start "rule__CompanyNumber__DefinitionAssignment_1"
    // InternalPactDSL.g:7857:1: rule__CompanyNumber__DefinitionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CompanyNumber__DefinitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7861:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7862:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7862:2: ( RULE_STRING )
            // InternalPactDSL.g:7863:3: RULE_STRING
            {
             before(grammarAccess.getCompanyNumberAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCompanyNumberAccess().getDefinitionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompanyNumber__DefinitionAssignment_1"


    // $ANTLR start "rule__Feature__FeatureAssignment_1"
    // InternalPactDSL.g:7872:1: rule__Feature__FeatureAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Feature__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7876:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7877:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7877:2: ( RULE_STRING )
            // InternalPactDSL.g:7878:3: RULE_STRING
            {
             before(grammarAccess.getFeatureAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__FeatureAssignment_1"


    // $ANTLR start "rule__InWriting__CustomWritingFormalityAssignment_1"
    // InternalPactDSL.g:7887:1: rule__InWriting__CustomWritingFormalityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__InWriting__CustomWritingFormalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7891:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7892:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7892:2: ( RULE_STRING )
            // InternalPactDSL.g:7893:3: RULE_STRING
            {
             before(grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInWritingAccess().getCustomWritingFormalitySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InWriting__CustomWritingFormalityAssignment_1"


    // $ANTLR start "rule__ByEmail__EmailAddressAssignment_2"
    // InternalPactDSL.g:7902:1: rule__ByEmail__EmailAddressAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ByEmail__EmailAddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7906:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7907:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7907:2: ( RULE_STRING )
            // InternalPactDSL.g:7908:3: RULE_STRING
            {
             before(grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getByEmailAccess().getEmailAddressSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ByEmail__EmailAddressAssignment_2"


    // $ANTLR start "rule__GivingNotice__SuperTypeAssignment_1"
    // InternalPactDSL.g:7917:1: rule__GivingNotice__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__GivingNotice__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7921:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7922:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7922:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7923:3: ( RULE_ID )
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:7924:3: ( RULE_ID )
            // InternalPactDSL.g:7925:4: RULE_ID
            {
             before(grammarAccess.getGivingNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGivingNoticeAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__SuperTypeAssignment_1"


    // $ANTLR start "rule__GivingNotice__NumDaysAssignment_2_1"
    // InternalPactDSL.g:7936:1: rule__GivingNotice__NumDaysAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__GivingNotice__NumDaysAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7940:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:7941:2: ( RULE_INT )
            {
            // InternalPactDSL.g:7941:2: ( RULE_INT )
            // InternalPactDSL.g:7942:3: RULE_INT
            {
             before(grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGivingNoticeAccess().getNumDaysINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivingNotice__NumDaysAssignment_2_1"


    // $ANTLR start "rule__CustomFormality__CustomFormalityAssignment_1"
    // InternalPactDSL.g:7951:1: rule__CustomFormality__CustomFormalityAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CustomFormality__CustomFormalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7955:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:7956:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:7956:2: ( RULE_STRING )
            // InternalPactDSL.g:7957:3: RULE_STRING
            {
             before(grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomFormalityAccess().getCustomFormalitySTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomFormality__CustomFormalityAssignment_1"


    // $ANTLR start "rule__GivenConsent__SuperTypeAssignment_0"
    // InternalPactDSL.g:7966:1: rule__GivenConsent__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GivenConsent__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7970:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7971:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7971:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7972:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:7973:3: ( RULE_ID )
            // InternalPactDSL.g:7974:4: RULE_ID
            {
             before(grammarAccess.getGivenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGivenConsentAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenConsent__SuperTypeAssignment_0"


    // $ANTLR start "rule__GivenWrittenConsent__SuperTypeAssignment_0"
    // InternalPactDSL.g:7985:1: rule__GivenWrittenConsent__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__GivenWrittenConsent__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:7989:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:7990:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:7990:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:7991:3: ( RULE_ID )
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:7992:3: ( RULE_ID )
            // InternalPactDSL.g:7993:4: RULE_ID
            {
             before(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getGivenWrittenConsentAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GivenWrittenConsent__SuperTypeAssignment_0"


    // $ANTLR start "rule__Ownership__SuperTypeAssignment_0"
    // InternalPactDSL.g:8004:1: rule__Ownership__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Ownership__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8008:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8009:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8009:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8010:3: ( RULE_ID )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:8011:3: ( RULE_ID )
            // InternalPactDSL.g:8012:4: RULE_ID
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOwnershipAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__SuperTypeAssignment_0"


    // $ANTLR start "rule__Ownership__CustomOwnershipAssignment_2"
    // InternalPactDSL.g:8023:1: rule__Ownership__CustomOwnershipAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ownership__CustomOwnershipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8027:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8028:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8028:2: ( RULE_STRING )
            // InternalPactDSL.g:8029:3: RULE_STRING
            {
             before(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getCustomOwnershipSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__CustomOwnershipAssignment_2"


    // $ANTLR start "rule__Ownership__SuperTypeAssignment_3"
    // InternalPactDSL.g:8038:1: rule__Ownership__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Ownership__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8042:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8043:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8043:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8044:3: ( RULE_ID )
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 
            // InternalPactDSL.g:8045:3: ( RULE_ID )
            // InternalPactDSL.g:8046:4: RULE_ID
            {
             before(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOwnershipAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ownership__SuperTypeAssignment_3"


    // $ANTLR start "rule__RightToUse__SuperTypeAssignment_0"
    // InternalPactDSL.g:8057:1: rule__RightToUse__SuperTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__RightToUse__SuperTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8061:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8062:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8062:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8063:3: ( RULE_ID )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_0_0()); 
            // InternalPactDSL.g:8064:3: ( RULE_ID )
            // InternalPactDSL.g:8065:4: RULE_ID
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getSuperTypePartyIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRightToUseAccess().getSuperTypePartyCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__SuperTypeAssignment_0"


    // $ANTLR start "rule__RightToUse__CustomUsageAssignment_2"
    // InternalPactDSL.g:8076:1: rule__RightToUse__CustomUsageAssignment_2 : ( RULE_STRING ) ;
    public final void rule__RightToUse__CustomUsageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8080:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8081:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8081:2: ( RULE_STRING )
            // InternalPactDSL.g:8082:3: RULE_STRING
            {
             before(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getCustomUsageSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__CustomUsageAssignment_2"


    // $ANTLR start "rule__RightToUse__SuperTypeAssignment_3"
    // InternalPactDSL.g:8091:1: rule__RightToUse__SuperTypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RightToUse__SuperTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8095:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8096:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8096:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8097:3: ( RULE_ID )
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 
            // InternalPactDSL.g:8098:3: ( RULE_ID )
            // InternalPactDSL.g:8099:4: RULE_ID
            {
             before(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRightToUseAccess().getSuperTypeSubjectMatterCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightToUse__SuperTypeAssignment_3"


    // $ANTLR start "rule__PrimaryObligationType__CustomObligationAssignment_6"
    // InternalPactDSL.g:8110:1: rule__PrimaryObligationType__CustomObligationAssignment_6 : ( RULE_STRING ) ;
    public final void rule__PrimaryObligationType__CustomObligationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8114:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8115:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8115:2: ( RULE_STRING )
            // InternalPactDSL.g:8116:3: RULE_STRING
            {
             before(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimaryObligationTypeAccess().getCustomObligationSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryObligationType__CustomObligationAssignment_6"


    // $ANTLR start "rule__PaymentObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:8125:1: rule__PaymentObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__PaymentObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8129:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8130:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8130:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8131:3: ( RULE_ID )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8132:3: ( RULE_ID )
            // InternalPactDSL.g:8133:4: RULE_ID
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__PaymentObligation__SumAssignment_4"
    // InternalPactDSL.g:8144:1: rule__PaymentObligation__SumAssignment_4 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__SumAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8148:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8149:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8149:2: ( RULE_INT )
            // InternalPactDSL.g:8150:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getSumINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSumINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SumAssignment_4"


    // $ANTLR start "rule__PaymentObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:8159:1: rule__PaymentObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__PaymentObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8163:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8164:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8164:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8165:3: ( RULE_ID )
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:8166:3: ( RULE_ID )
            // InternalPactDSL.g:8167:4: RULE_ID
            {
             before(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getPaymentObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__PaymentObligation__DayAssignment_7_2"
    // InternalPactDSL.g:8178:1: rule__PaymentObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8182:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8183:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8183:2: ( RULE_INT )
            // InternalPactDSL.g:8184:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__DayAssignment_7_2"


    // $ANTLR start "rule__PaymentObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:8193:1: rule__PaymentObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8197:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8198:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8198:2: ( RULE_INT )
            // InternalPactDSL.g:8199:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__PaymentObligation__YearAssignment_7_4"
    // InternalPactDSL.g:8208:1: rule__PaymentObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__PaymentObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8212:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8213:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8213:2: ( RULE_INT )
            // InternalPactDSL.g:8214:3: RULE_INT
            {
             before(grammarAccess.getPaymentObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentObligation__YearAssignment_7_4"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:8223:1: rule__DeliveryObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8227:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8228:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8228:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8229:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8230:3: ( RULE_ID )
            // InternalPactDSL.g:8231:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_4"
    // InternalPactDSL.g:8242:1: rule__DeliveryObligation__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8246:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8247:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8247:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8248:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8249:3: ( RULE_ID )
            // InternalPactDSL.g:8250:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_4"


    // $ANTLR start "rule__DeliveryObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:8261:1: rule__DeliveryObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__DeliveryObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8265:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8266:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8266:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8267:3: ( RULE_ID )
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:8268:3: ( RULE_ID )
            // InternalPactDSL.g:8269:4: RULE_ID
            {
             before(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getDeliveryObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__DeliveryObligation__DayAssignment_7_2"
    // InternalPactDSL.g:8280:1: rule__DeliveryObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8284:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8285:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8285:2: ( RULE_INT )
            // InternalPactDSL.g:8286:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__DayAssignment_7_2"


    // $ANTLR start "rule__DeliveryObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:8295:1: rule__DeliveryObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8299:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8300:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8300:2: ( RULE_INT )
            // InternalPactDSL.g:8301:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__DeliveryObligation__YearAssignment_7_4"
    // InternalPactDSL.g:8310:1: rule__DeliveryObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__DeliveryObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8314:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8315:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8315:2: ( RULE_INT )
            // InternalPactDSL.g:8316:3: RULE_INT
            {
             before(grammarAccess.getDeliveryObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDeliveryObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeliveryObligation__YearAssignment_7_4"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:8325:1: rule__TransferObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8329:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8330:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8330:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8331:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8332:3: ( RULE_ID )
            // InternalPactDSL.g:8333:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_4"
    // InternalPactDSL.g:8344:1: rule__TransferObligation__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8348:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8349:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8349:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8350:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8351:3: ( RULE_ID )
            // InternalPactDSL.g:8352:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_4"


    // $ANTLR start "rule__TransferObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:8363:1: rule__TransferObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__TransferObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8367:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8368:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8368:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8369:3: ( RULE_ID )
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0()); 
            // InternalPactDSL.g:8370:3: ( RULE_ID )
            // InternalPactDSL.g:8371:4: RULE_ID
            {
             before(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransferObligationAccess().getSuperTypePartyCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__TransferObligation__DayAssignment_7_2"
    // InternalPactDSL.g:8382:1: rule__TransferObligation__DayAssignment_7_2 : ( RULE_INT ) ;
    public final void rule__TransferObligation__DayAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8386:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8387:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8387:2: ( RULE_INT )
            // InternalPactDSL.g:8388:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getDayINTTerminalRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__DayAssignment_7_2"


    // $ANTLR start "rule__TransferObligation__MonthAssignment_7_3"
    // InternalPactDSL.g:8397:1: rule__TransferObligation__MonthAssignment_7_3 : ( RULE_INT ) ;
    public final void rule__TransferObligation__MonthAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8401:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8402:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8402:2: ( RULE_INT )
            // InternalPactDSL.g:8403:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getMonthINTTerminalRuleCall_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__MonthAssignment_7_3"


    // $ANTLR start "rule__TransferObligation__YearAssignment_7_4"
    // InternalPactDSL.g:8412:1: rule__TransferObligation__YearAssignment_7_4 : ( RULE_INT ) ;
    public final void rule__TransferObligation__YearAssignment_7_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8416:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8417:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8417:2: ( RULE_INT )
            // InternalPactDSL.g:8418:3: RULE_INT
            {
             before(grammarAccess.getTransferObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTransferObligationAccess().getYearINTTerminalRuleCall_7_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TransferObligation__YearAssignment_7_4"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_1"
    // InternalPactDSL.g:8427:1: rule__LicenceObligation__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8431:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8432:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8432:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8433:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8434:3: ( RULE_ID )
            // InternalPactDSL.g:8435:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_1"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_6"
    // InternalPactDSL.g:8446:1: rule__LicenceObligation__SuperTypeAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8450:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8451:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8451:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8452:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0()); 
            // InternalPactDSL.g:8453:3: ( RULE_ID )
            // InternalPactDSL.g:8454:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypeSubjectMatterCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_6"


    // $ANTLR start "rule__LicenceObligation__SuperTypeAssignment_8"
    // InternalPactDSL.g:8465:1: rule__LicenceObligation__SuperTypeAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__LicenceObligation__SuperTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8469:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8470:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8470:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8471:3: ( RULE_ID )
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0()); 
            // InternalPactDSL.g:8472:3: ( RULE_ID )
            // InternalPactDSL.g:8473:4: RULE_ID
            {
             before(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getLicenceObligationAccess().getSuperTypePartyCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__SuperTypeAssignment_8"


    // $ANTLR start "rule__LicenceObligation__DayAssignment_9_2"
    // InternalPactDSL.g:8484:1: rule__LicenceObligation__DayAssignment_9_2 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__DayAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8488:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8489:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8489:2: ( RULE_INT )
            // InternalPactDSL.g:8490:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getDayINTTerminalRuleCall_9_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getDayINTTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__DayAssignment_9_2"


    // $ANTLR start "rule__LicenceObligation__MonthAssignment_9_3"
    // InternalPactDSL.g:8499:1: rule__LicenceObligation__MonthAssignment_9_3 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__MonthAssignment_9_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8503:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8504:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8504:2: ( RULE_INT )
            // InternalPactDSL.g:8505:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getMonthINTTerminalRuleCall_9_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getMonthINTTerminalRuleCall_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__MonthAssignment_9_3"


    // $ANTLR start "rule__LicenceObligation__YearAssignment_9_4"
    // InternalPactDSL.g:8514:1: rule__LicenceObligation__YearAssignment_9_4 : ( RULE_INT ) ;
    public final void rule__LicenceObligation__YearAssignment_9_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8518:1: ( ( RULE_INT ) )
            // InternalPactDSL.g:8519:2: ( RULE_INT )
            {
            // InternalPactDSL.g:8519:2: ( RULE_INT )
            // InternalPactDSL.g:8520:3: RULE_INT
            {
             before(grammarAccess.getLicenceObligationAccess().getYearINTTerminalRuleCall_9_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLicenceObligationAccess().getYearINTTerminalRuleCall_9_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LicenceObligation__YearAssignment_9_4"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:8529:1: rule__ConstraintParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8533:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8534:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8534:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8535:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8536:3: ( RULE_ID )
            // InternalPactDSL.g:8537:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__ConstraintParty__ForbiddenActionAssignment_3"
    // InternalPactDSL.g:8548:1: rule__ConstraintParty__ForbiddenActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ConstraintParty__ForbiddenActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8552:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8553:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8553:2: ( RULE_STRING )
            // InternalPactDSL.g:8554:3: RULE_STRING
            {
             before(grammarAccess.getConstraintPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__ForbiddenActionAssignment_3"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:8563:1: rule__ConstraintParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8567:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8568:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8568:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8569:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8570:3: ( RULE_ID )
            // InternalPactDSL.g:8571:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__ConstraintParty__SuperTypeAssignment_5_1"
    // InternalPactDSL.g:8582:1: rule__ConstraintParty__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintParty__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8586:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8587:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8587:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8588:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0()); 
            // InternalPactDSL.g:8589:3: ( RULE_ID )
            // InternalPactDSL.g:8590:4: RULE_ID
            {
             before(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getConstraintPartyAccess().getSuperTypePartyCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintParty__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_1"
    // InternalPactDSL.g:8601:1: rule__ConstraintThirdParty__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8605:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8606:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8606:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8607:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8608:3: ( RULE_ID )
            // InternalPactDSL.g:8609:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_1"


    // $ANTLR start "rule__ConstraintThirdParty__ForbiddenActionAssignment_3"
    // InternalPactDSL.g:8620:1: rule__ConstraintThirdParty__ForbiddenActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ConstraintThirdParty__ForbiddenActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8624:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8625:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8625:2: ( RULE_STRING )
            // InternalPactDSL.g:8626:3: RULE_STRING
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getForbiddenActionSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__ForbiddenActionAssignment_3"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_4"
    // InternalPactDSL.g:8635:1: rule__ConstraintThirdParty__SuperTypeAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8639:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8640:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8640:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8641:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 
            // InternalPactDSL.g:8642:3: ( RULE_ID )
            // InternalPactDSL.g:8643:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeSubjectMatterCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_4"


    // $ANTLR start "rule__ConstraintThirdParty__AdditionalInfoAssignment_5"
    // InternalPactDSL.g:8654:1: rule__ConstraintThirdParty__AdditionalInfoAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ConstraintThirdParty__AdditionalInfoAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8658:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8659:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8659:2: ( RULE_STRING )
            // InternalPactDSL.g:8660:3: RULE_STRING
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getAdditionalInfoSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__AdditionalInfoAssignment_5"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_6_1"
    // InternalPactDSL.g:8669:1: rule__ConstraintThirdParty__SuperTypeAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8673:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8674:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8674:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8675:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0()); 
            // InternalPactDSL.g:8676:3: ( RULE_ID )
            // InternalPactDSL.g:8677:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypeThirdPartyCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_6_1"


    // $ANTLR start "rule__ConstraintThirdParty__SuperTypeAssignment_7_3"
    // InternalPactDSL.g:8688:1: rule__ConstraintThirdParty__SuperTypeAssignment_7_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConstraintThirdParty__SuperTypeAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8692:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8693:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8693:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8694:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0()); 
            // InternalPactDSL.g:8695:3: ( RULE_ID )
            // InternalPactDSL.g:8696:4: RULE_ID
            {
             before(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_7_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyIDTerminalRuleCall_7_3_0_1()); 

            }

             after(grammarAccess.getConstraintThirdPartyAccess().getSuperTypePartyCrossReference_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstraintThirdParty__SuperTypeAssignment_7_3"


    // $ANTLR start "rule__ForConvenience__SuperTypeAssignment_1"
    // InternalPactDSL.g:8707:1: rule__ForConvenience__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForConvenience__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8711:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8712:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8712:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8713:3: ( RULE_ID )
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8714:3: ( RULE_ID )
            // InternalPactDSL.g:8715:4: RULE_ID
            {
             before(grammarAccess.getForConvenienceAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getForConvenienceAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__SuperTypeAssignment_1"


    // $ANTLR start "rule__ForConvenience__CustomTerminationAssignment_5"
    // InternalPactDSL.g:8726:1: rule__ForConvenience__CustomTerminationAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ForConvenience__CustomTerminationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8730:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8731:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8731:2: ( RULE_STRING )
            // InternalPactDSL.g:8732:3: RULE_STRING
            {
             before(grammarAccess.getForConvenienceAccess().getCustomTerminationSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForConvenienceAccess().getCustomTerminationSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForConvenience__CustomTerminationAssignment_5"


    // $ANTLR start "rule__OnReasonableNotice__SuperTypeAssignment_1"
    // InternalPactDSL.g:8741:1: rule__OnReasonableNotice__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnReasonableNotice__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8745:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8746:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8746:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8747:3: ( RULE_ID )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8748:3: ( RULE_ID )
            // InternalPactDSL.g:8749:4: RULE_ID
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__SuperTypeAssignment_1"


    // $ANTLR start "rule__OnReasonableNotice__SuperTypeAssignment_5"
    // InternalPactDSL.g:8760:1: rule__OnReasonableNotice__SuperTypeAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__OnReasonableNotice__SuperTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8764:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8765:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8765:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8766:3: ( RULE_ID )
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0()); 
            // InternalPactDSL.g:8767:3: ( RULE_ID )
            // InternalPactDSL.g:8768:4: RULE_ID
            {
             before(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getOnReasonableNoticeAccess().getSuperTypeGivingNoticeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnReasonableNotice__SuperTypeAssignment_5"


    // $ANTLR start "rule__ForBreach__SuperTypeAssignment_1"
    // InternalPactDSL.g:8779:1: rule__ForBreach__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ForBreach__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8783:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8784:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8784:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8785:3: ( RULE_ID )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8786:3: ( RULE_ID )
            // InternalPactDSL.g:8787:4: RULE_ID
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__SuperTypeAssignment_1"


    // $ANTLR start "rule__ForBreach__ObligationBreachedAssignment_5"
    // InternalPactDSL.g:8798:1: rule__ForBreach__ObligationBreachedAssignment_5 : ( RULE_STRING ) ;
    public final void rule__ForBreach__ObligationBreachedAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8802:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8803:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8803:2: ( RULE_STRING )
            // InternalPactDSL.g:8804:3: RULE_STRING
            {
             before(grammarAccess.getForBreachAccess().getObligationBreachedSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getObligationBreachedSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__ObligationBreachedAssignment_5"


    // $ANTLR start "rule__ForBreach__SuperTypeAssignment_7"
    // InternalPactDSL.g:8813:1: rule__ForBreach__SuperTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ForBreach__SuperTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8817:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8818:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8818:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8819:3: ( RULE_ID )
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0()); 
            // InternalPactDSL.g:8820:3: ( RULE_ID )
            // InternalPactDSL.g:8821:4: RULE_ID
            {
             before(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getForBreachAccess().getSuperTypePartyCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__SuperTypeAssignment_7"


    // $ANTLR start "rule__ForBreach__RemedialSchemeAssignment_8_1"
    // InternalPactDSL.g:8832:1: rule__ForBreach__RemedialSchemeAssignment_8_1 : ( RULE_STRING ) ;
    public final void rule__ForBreach__RemedialSchemeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8836:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8837:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8837:2: ( RULE_STRING )
            // InternalPactDSL.g:8838:3: RULE_STRING
            {
             before(grammarAccess.getForBreachAccess().getRemedialSchemeSTRINGTerminalRuleCall_8_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getForBreachAccess().getRemedialSchemeSTRINGTerminalRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForBreach__RemedialSchemeAssignment_8_1"


    // $ANTLR start "rule__OnInsolvencyEvent__SuperTypeAssignment_1"
    // InternalPactDSL.g:8847:1: rule__OnInsolvencyEvent__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OnInsolvencyEvent__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8851:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8852:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8852:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8853:3: ( RULE_ID )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8854:3: ( RULE_ID )
            // InternalPactDSL.g:8855:4: RULE_ID
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__SuperTypeAssignment_1"


    // $ANTLR start "rule__OnInsolvencyEvent__InsolvencyEventAssignment_5"
    // InternalPactDSL.g:8866:1: rule__OnInsolvencyEvent__InsolvencyEventAssignment_5 : ( RULE_STRING ) ;
    public final void rule__OnInsolvencyEvent__InsolvencyEventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8870:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8871:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8871:2: ( RULE_STRING )
            // InternalPactDSL.g:8872:3: RULE_STRING
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getInsolvencyEventSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__InsolvencyEventAssignment_5"


    // $ANTLR start "rule__OnInsolvencyEvent__SuperTypeAssignment_7"
    // InternalPactDSL.g:8881:1: rule__OnInsolvencyEvent__SuperTypeAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__OnInsolvencyEvent__SuperTypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8885:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8886:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8886:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8887:3: ( RULE_ID )
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0()); 
            // InternalPactDSL.g:8888:3: ( RULE_ID )
            // InternalPactDSL.g:8889:4: RULE_ID
            {
             before(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getOnInsolvencyEventAccess().getSuperTypePartyCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnInsolvencyEvent__SuperTypeAssignment_7"


    // $ANTLR start "rule__CustomTermination__SuperTypeAssignment_1"
    // InternalPactDSL.g:8900:1: rule__CustomTermination__SuperTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomTermination__SuperTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8904:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8905:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8905:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8906:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0()); 
            // InternalPactDSL.g:8907:3: ( RULE_ID )
            // InternalPactDSL.g:8908:4: RULE_ID
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getSuperTypePartyIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypePartyCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__SuperTypeAssignment_1"


    // $ANTLR start "rule__CustomTermination__CustomTerminationClauseAssignment_4"
    // InternalPactDSL.g:8919:1: rule__CustomTermination__CustomTerminationClauseAssignment_4 : ( RULE_STRING ) ;
    public final void rule__CustomTermination__CustomTerminationClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8923:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8924:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8924:2: ( RULE_STRING )
            // InternalPactDSL.g:8925:3: RULE_STRING
            {
             before(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getCustomTerminationClauseSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__CustomTerminationClauseAssignment_4"


    // $ANTLR start "rule__CustomTermination__SuperTypeAssignment_5_1"
    // InternalPactDSL.g:8934:1: rule__CustomTermination__SuperTypeAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__CustomTermination__SuperTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8938:1: ( ( ( RULE_ID ) ) )
            // InternalPactDSL.g:8939:2: ( ( RULE_ID ) )
            {
            // InternalPactDSL.g:8939:2: ( ( RULE_ID ) )
            // InternalPactDSL.g:8940:3: ( RULE_ID )
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0()); 
            // InternalPactDSL.g:8941:3: ( RULE_ID )
            // InternalPactDSL.g:8942:4: RULE_ID
            {
             before(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getCustomTerminationAccess().getSuperTypeGivingNoticeCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CustomTermination__SuperTypeAssignment_5_1"


    // $ANTLR start "rule__ApplicableLaw__CustomApplicableLawAssignment_1"
    // InternalPactDSL.g:8953:1: rule__ApplicableLaw__CustomApplicableLawAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ApplicableLaw__CustomApplicableLawAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8957:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8958:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8958:2: ( RULE_STRING )
            // InternalPactDSL.g:8959:3: RULE_STRING
            {
             before(grammarAccess.getApplicableLawAccess().getCustomApplicableLawSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getApplicableLawAccess().getCustomApplicableLawSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__CustomApplicableLawAssignment_1"


    // $ANTLR start "rule__ApplicableLaw__DefinitionAssignment_2"
    // InternalPactDSL.g:8968:1: rule__ApplicableLaw__DefinitionAssignment_2 : ( ruleDefinedTerm ) ;
    public final void rule__ApplicableLaw__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8972:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:8973:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:8973:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:8974:3: ruleDefinedTerm
            {
             before(grammarAccess.getApplicableLawAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getApplicableLawAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicableLaw__DefinitionAssignment_2"


    // $ANTLR start "rule__Jurisdiction__CustomJurisdictionAssignment_1"
    // InternalPactDSL.g:8983:1: rule__Jurisdiction__CustomJurisdictionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Jurisdiction__CustomJurisdictionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:8987:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:8988:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:8988:2: ( RULE_STRING )
            // InternalPactDSL.g:8989:3: RULE_STRING
            {
             before(grammarAccess.getJurisdictionAccess().getCustomJurisdictionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJurisdictionAccess().getCustomJurisdictionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__CustomJurisdictionAssignment_1"


    // $ANTLR start "rule__Jurisdiction__DefinitionAssignment_2"
    // InternalPactDSL.g:8998:1: rule__Jurisdiction__DefinitionAssignment_2 : ( ruleDefinedTerm ) ;
    public final void rule__Jurisdiction__DefinitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9002:1: ( ( ruleDefinedTerm ) )
            // InternalPactDSL.g:9003:2: ( ruleDefinedTerm )
            {
            // InternalPactDSL.g:9003:2: ( ruleDefinedTerm )
            // InternalPactDSL.g:9004:3: ruleDefinedTerm
            {
             before(grammarAccess.getJurisdictionAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinedTerm();

            state._fsp--;

             after(grammarAccess.getJurisdictionAccess().getDefinitionDefinedTermParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jurisdiction__DefinitionAssignment_2"


    // $ANTLR start "rule__Notices__CustomNoticeAssignment_1"
    // InternalPactDSL.g:9013:1: rule__Notices__CustomNoticeAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Notices__CustomNoticeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPactDSL.g:9017:1: ( ( RULE_STRING ) )
            // InternalPactDSL.g:9018:2: ( RULE_STRING )
            {
            // InternalPactDSL.g:9018:2: ( RULE_STRING )
            // InternalPactDSL.g:9019:3: RULE_STRING
            {
             before(grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNoticesAccess().getCustomNoticeSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notices__CustomNoticeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000012C003C0040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000012C00000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0515080000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0515080000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x4000000003800040L,0x0000000000000016L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x4000000000800002L,0x0000000000000016L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800001000000050L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000040000000L});

}