/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Convenience</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ForConvenience#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ForConvenience#getCustomTermination <em>Custom Termination</em>}</li>
 * </ul>
 *
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getForConvenience()
 * @model
 * @generated
 */
public interface ForConvenience extends TerminationType
{
  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Party)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getForConvenience_SuperType()
   * @model
   * @generated
   */
  Party getSuperType();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.ForConvenience#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Party value);

  /**
   * Returns the value of the '<em><b>Custom Termination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Termination</em>' attribute.
   * @see #setCustomTermination(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getForConvenience_CustomTermination()
   * @model
   * @generated
   */
  String getCustomTermination();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.ForConvenience#getCustomTermination <em>Custom Termination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Termination</em>' attribute.
   * @see #getCustomTermination()
   * @generated
   */
  void setCustomTermination(String value);

} // ForConvenience