/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Matter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.SubjectMatter#getName <em>Name</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.SubjectMatter#getSubjectMatter <em>Subject Matter</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.SubjectMatter#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getSubjectMatter()
 * @model
 * @generated
 */
public interface SubjectMatter extends EntityType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getSubjectMatter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.SubjectMatter#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Subject Matter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subject Matter</em>' attribute.
   * @see #setSubjectMatter(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getSubjectMatter_SubjectMatter()
   * @model
   * @generated
   */
  String getSubjectMatter();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.SubjectMatter#getSubjectMatter <em>Subject Matter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subject Matter</em>' attribute.
   * @see #getSubjectMatter()
   * @generated
   */
  void setSubjectMatter(String value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link imperialmsc.lmw21.pactdsl.pactDSL.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getSubjectMatter_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeature();

} // SubjectMatter
