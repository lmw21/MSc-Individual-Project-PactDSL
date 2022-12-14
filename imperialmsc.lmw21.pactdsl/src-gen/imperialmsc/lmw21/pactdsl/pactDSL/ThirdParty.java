/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Third Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ThirdParty#getName <em>Name</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ThirdParty#getFullname <em>Fullname</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.ThirdParty#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getThirdParty()
 * @model
 * @generated
 */
public interface ThirdParty extends EntityType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getThirdParty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.ThirdParty#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fullname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fullname</em>' attribute.
   * @see #setFullname(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getThirdParty_Fullname()
   * @model
   * @generated
   */
  String getFullname();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.ThirdParty#getFullname <em>Fullname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fullname</em>' attribute.
   * @see #getFullname()
   * @generated
   */
  void setFullname(String value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link imperialmsc.lmw21.pactdsl.pactDSL.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getThirdParty_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeature();

} // ThirdParty
