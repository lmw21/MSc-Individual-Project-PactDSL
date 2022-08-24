/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Termination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomTermination#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomTermination#getCustomTerminationClause <em>Custom Termination Clause</em>}</li>
 * </ul>
 *
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getCustomTermination()
 * @model
 * @generated
 */
public interface CustomTermination extends TerminationType
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(EObject)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getCustomTermination_SuperType()
   * @model
   * @generated
   */
  EObject getSuperType();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomTermination#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(EObject value);

  /**
   * Returns the value of the '<em><b>Custom Termination Clause</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Termination Clause</em>' attribute.
   * @see #setCustomTerminationClause(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getCustomTermination_CustomTerminationClause()
   * @model
   * @generated
   */
  String getCustomTerminationClause();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.CustomTermination#getCustomTerminationClause <em>Custom Termination Clause</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Termination Clause</em>' attribute.
   * @see #getCustomTerminationClause()
   * @generated
   */
  void setCustomTerminationClause(String value);

} // CustomTermination
