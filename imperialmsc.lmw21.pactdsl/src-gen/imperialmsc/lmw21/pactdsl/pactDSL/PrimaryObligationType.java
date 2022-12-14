/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Obligation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.PrimaryObligationType#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getPrimaryObligationType()
 * @model
 * @generated
 */
public interface PrimaryObligationType extends EObject
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(EntityType)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getPrimaryObligationType_SuperType()
   * @model
   * @generated
   */
  EntityType getSuperType();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.PrimaryObligationType#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(EntityType value);

} // PrimaryObligationType
