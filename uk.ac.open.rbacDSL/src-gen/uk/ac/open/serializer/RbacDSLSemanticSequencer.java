package uk.ac.open.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.open.rbacDSL.ForbiddenScenario;
import uk.ac.open.rbacDSL.GrantedScenario;
import uk.ac.open.rbacDSL.Permission;
import uk.ac.open.rbacDSL.Policy;
import uk.ac.open.rbacDSL.Rbac;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Resource;
import uk.ac.open.rbacDSL.Role;
import uk.ac.open.rbacDSL.Scenarios;
import uk.ac.open.rbacDSL.User;
import uk.ac.open.rbacDSL.UserRoleScenario;
import uk.ac.open.services.RbacDSLGrammarAccess;

@SuppressWarnings("all")
public class RbacDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RbacDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RbacDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RbacDSLPackage.FORBIDDEN_SCENARIO:
				if(context == grammarAccess.getForbiddenScenarioRule() ||
				   context == grammarAccess.getUserScenarioRule()) {
					sequence_ForbiddenScenario(context, (ForbiddenScenario) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.GRANTED_SCENARIO:
				if(context == grammarAccess.getGrantedScenarioRule() ||
				   context == grammarAccess.getUserScenarioRule()) {
					sequence_GrantedScenario(context, (GrantedScenario) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.PERMISSION:
				if(context == grammarAccess.getPermissionRule()) {
					sequence_Permission(context, (Permission) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.POLICY:
				if(context == grammarAccess.getPolicyRule()) {
					sequence_Policy(context, (Policy) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.RBAC:
				if(context == grammarAccess.getRbacRule()) {
					sequence_Rbac(context, (Rbac) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.RESOURCE:
				if(context == grammarAccess.getResourceRule()) {
					sequence_Resource(context, (Resource) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.ROLE:
				if(context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.SCENARIOS:
				if(context == grammarAccess.getScenariosRule()) {
					sequence_Scenarios(context, (Scenarios) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.USER:
				if(context == grammarAccess.getUserRule()) {
					sequence_User(context, (User) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.USER_ROLE_SCENARIO:
				if(context == grammarAccess.getUserRoleScenarioRule()) {
					sequence_UserRoleScenario(context, (UserRoleScenario) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID user=[User|ID] roles+=[Role|ID]* resources+=[Resource|ID]+)
	 */
	protected void sequence_ForbiddenScenario(EObject context, ForbiddenScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID user=[User|ID] roles+=[Role|ID]* resources+=[Resource|ID]+)
	 */
	protected void sequence_GrantedScenario(EObject context, GrantedScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Permission(EObject context, Permission semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RbacDSLPackage.Literals.PERMISSION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RbacDSLPackage.Literals.PERMISSION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPermissionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (users+=User* roles+=Role* permissions+=Permission* resources+=Resource*)
	 */
	protected void sequence_Policy(EObject context, Policy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (policy=Policy scenarios=Scenarios)
	 */
	protected void sequence_Rbac(EObject context, Rbac semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RbacDSLPackage.Literals.RBAC__POLICY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RbacDSLPackage.Literals.RBAC__POLICY));
			if(transientValues.isValueTransient(semanticObject, RbacDSLPackage.Literals.RBAC__SCENARIOS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RbacDSLPackage.Literals.RBAC__SCENARIOS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRbacAccess().getPolicyPolicyParserRuleCall_0_0(), semanticObject.getPolicy());
		feeder.accept(grammarAccess.getRbacAccess().getScenariosScenariosParserRuleCall_1_0(), semanticObject.getScenarios());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID permissions+=[Permission|ID]*)
	 */
	protected void sequence_Resource(EObject context, Resource semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent=[Role|ID]? ssod+=[Role|ID]* dsod+=[Role|ID]* permissions+=[Permission|ID]*)
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (userScenarios+=UserScenario* userRoleScenarios+=UserRoleScenario*)
	 */
	protected void sequence_Scenarios(EObject context, Scenarios semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID roles+=[Role|ID]+)
	 */
	protected void sequence_UserRoleScenario(EObject context, UserRoleScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID roles+=[Role|ID]*)
	 */
	protected void sequence_User(EObject context, User semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
