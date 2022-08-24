/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicable Law</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ApplicableLaw#getCustomApplicableLaw <em>Custom Applicable Law</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ApplicableLaw#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getApplicableLaw()
 * @model
 * @generated
 */
public interface ApplicableLaw extends BoilerplateType
{
  /**
   * Returns the value of the '<em><b>Custom Applicable Law</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom Applicable Law</em>' attribute.
   * @see #setCustomApplicableLaw(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getApplicableLaw_CustomApplicableLaw()
   * @model
   * @generated
   */
  String getCustomApplicableLaw();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.ApplicableLaw#getCustomApplicableLaw <em>Custom Applicable Law</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom Applicable Law</em>' attribute.
   * @see #getCustomApplicableLaw()
   * @generated
   */
  void setCustomApplicableLaw(String value);

  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
   * The list contents are of type {@link imperialmsc.lmw21.pactdsl.pactDSL.DefinedTerm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference list.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getApplicableLaw_Definition()
   * @model containment="true"
   * @generated
   */
  EList<DefinedTerm> getDefinition();

} // ApplicableLaw
