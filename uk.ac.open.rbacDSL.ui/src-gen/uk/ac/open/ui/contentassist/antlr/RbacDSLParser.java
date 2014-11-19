/*
* generated by Xtext
*/
package uk.ac.open.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import uk.ac.open.services.RbacDSLGrammarAccess;

public class RbacDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private RbacDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected uk.ac.open.ui.contentassist.antlr.internal.InternalRbacDSLParser createParser() {
		uk.ac.open.ui.contentassist.antlr.internal.InternalRbacDSLParser result = new uk.ac.open.ui.contentassist.antlr.internal.InternalRbacDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRbacAccess().getGroup(), "rule__Rbac__Group__0");
					put(grammarAccess.getRbacAccess().getNameAssignment_1(), "rule__Rbac__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			uk.ac.open.ui.contentassist.antlr.internal.InternalRbacDSLParser typedParser = (uk.ac.open.ui.contentassist.antlr.internal.InternalRbacDSLParser) parser;
			typedParser.entryRuleRbac();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RbacDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RbacDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
