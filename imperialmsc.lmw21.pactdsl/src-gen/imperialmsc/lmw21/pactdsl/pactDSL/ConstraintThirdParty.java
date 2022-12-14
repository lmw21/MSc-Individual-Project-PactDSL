/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Third Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ConstraintThirdParty#getForbiddenAction <em>Forbidden Action</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ConstraintThirdParty#getAdditionalInfo <em>Additional Info</em>}</li>
 * </ul>
 *
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getConstraintThirdParty()
 * @model
 * @generated
 */
public interface ConstraintThirdParty extends PrimaryObligationType
{
  /**
   * Returns the value of the '<em><b>Forbidden Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forbidden Action</em>' attribute.
   * @see #setForbiddenAction(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getConstraintThirdParty_ForbiddenAction()
   * @model
   * @generated
   */
  String getForbiddenAction();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.ConstraintThirdParty#getForbiddenAction <em>Forbidden Action</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Forbidden Action</em>' attribute.
   * @see #getForbiddenAction()
   * @generated
   */
  void setForbiddenAction(String value);

  /**
   * Returns the value of the '<em><b>Additional Info</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additional Info</em>' attribute.
   * @see #setAdditionalInfo(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getConstraintThirdParty_AdditionalInfo()
   * @model
   * @generated
   */
  String getAdditionalInfo();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.ConstraintThirdParty#getAdditionalInfo <em>Additional Info</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Additional Info</em>' attribute.
   * @see #getAdditionalInfo()
   * @generated
   */
  void setAdditionalInfo(String value);

} // ConstraintThirdParty
