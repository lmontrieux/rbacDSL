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
import uk.ac.open.rbacDSL.Assignment;
import uk.ac.open.rbacDSL.ForbiddenScenario;
import uk.ac.open.rbacDSL.GrantedScenario;
import uk.ac.open.rbacDSL.ObjectRoleScenario;
import uk.ac.open.rbacDSL.ObjectScenario;
import uk.ac.open.rbacDSL.Permission;
import uk.ac.open.rbacDSL.RBACObject;
import uk.ac.open.rbacDSL.Rbac;
import uk.ac.open.rbacDSL.RbacDSLPackage;
import uk.ac.open.rbacDSL.Role;
import uk.ac.open.rbacDSL.User;
import uk.ac.open.rbacDSL.UserRoleScenario;
import uk.ac.open.services.RbacDSLGrammarAccess;

@SuppressWarnings("all")
public class RbacDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RbacDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RbacDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RbacDSLPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.FORBIDDEN_SCENARIO:
				if(context == grammarAccess.getForbiddenScenarioRule() ||
				   context == grammarAccess.getScenarioElementRule()) {
					sequence_ForbiddenScenario(context, (ForbiddenScenario) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.GRANTED_SCENARIO:
				if(context == grammarAccess.getGrantedScenarioRule() ||
				   context == grammarAccess.getScenarioElementRule()) {
					sequence_GrantedScenario(context, (GrantedScenario) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.OBJECT_ROLE_SCENARIO:
				if(context == grammarAccess.getObjectRoleScenarioRule() ||
				   context == grammarAccess.getScenarioElementRule()) {
					sequence_ObjectRoleScenario(context, (ObjectRoleScenario) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.OBJECT_SCENARIO:
				if(context == grammarAccess.getObjectScenarioRule() ||
				   context == grammarAccess.getScenarioElementRule()) {
					sequence_ObjectScenario(context, (ObjectScenario) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.PERMISSION:
				if(context == grammarAccess.getPermissionRule() ||
				   context == grammarAccess.getPolicyElementRule()) {
					sequence_Permission(context, (Permission) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.RBAC_OBJECT:
				if(context == grammarAccess.getPolicyElementRule() ||
				   context == grammarAccess.getRBACObjectRule()) {
					sequence_RBACObject(context, (RBACObject) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.RBAC:
				if(context == grammarAccess.getRbacRule()) {
					sequence_Rbac(context, (Rbac) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.ROLE:
				if(context == grammarAccess.getPolicyElementRule() ||
				   context == grammarAccess.getRoleRule()) {
					sequence_Role(context, (Role) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.USER:
				if(context == grammarAccess.getPolicyElementRule() ||
				   context == grammarAccess.getUserRule()) {
					sequence_User(context, (User) semanticObject); 
					return; 
				}
				else break;
			case RbacDSLPackage.USER_ROLE_SCENARIO:
				if(context == grammarAccess.getScenarioElementRule() ||
				   context == grammarAccess.getUserRoleScenarioRule()) {
					sequence_UserRoleScenario(context, (UserRoleScenario) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (object=[RBACObject|ID] actions+=[Permission|ID]*)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID user=[User|ID] roles+=[Role|ID]* object+=Assignment+)
	 */
	protected void sequence_ForbiddenScenario(EObject context, ForbiddenScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID user=[User|ID] roles+=[Role|ID]* object+=Assignment+)
	 */
	protected void sequence_GrantedScenario(EObject context, GrantedScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID role+=[Role|ID] assignment+=Assignment+)
	 */
	protected void sequence_ObjectRoleScenario(EObject context, ObjectRoleScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID assignment+=Assignment+)
	 */
	protected void sequence_ObjectScenario(EObject context, ObjectScenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Permission(EObject context, Permission semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RbacDSLPackage.Literals.POLICY_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RbacDSLPackage.Literals.POLICY_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPermissionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID permissions+=[Permission|ID]*)
	 */
	protected void sequence_RBACObject(EObject context, RBACObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (policyElements+=PolicyElement* scenarioElements+=ScenarioElement*)
	 */
	protected void sequence_Rbac(EObject context, Rbac semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID parent+=[Role|ID]* ssod+=[Role|ID]* dsod+=[Role|ID]* assignments+=Assignment*)
	 */
	protected void sequence_Role(EObject context, Role semanticObject) {
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
