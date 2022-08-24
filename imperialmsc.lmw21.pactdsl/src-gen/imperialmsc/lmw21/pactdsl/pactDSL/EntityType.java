/**
 * generated by Xtext 2.25.0
 */
package imperialmsc.lmw21.pactdsl.pactDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.EntityType#getName <em>Name</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.EntityType#getDefinition <em>Definition</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.EntityType#getAddress <em>Address</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.EntityType#getCompanyNumber <em>Company Number</em>}</li>
 *   <li>{@link imperialmsc.lmw21.pactdsl.pactDSL.EntityType#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getEntityType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link imperialmsc.lmw21.pactdsl.pactDSL.EntityType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference list.
   * The list contents are of type {@link imperialmsc.lmw21.pactdsl.pactDSL.DefinedTerm}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference list.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getEntityType_Definition()
   * @model containment="true"
   * @generated
   */
  EList<DefinedTerm> getDefinition();

  /**
   * Returns the value of the '<em><b>Address</b></em>' containment reference list.
   * The list contents are of type {@link imperialmsc.lmw21.pactdsl.pactDSL.Address}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Address</em>' containment reference list.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getEntityType_Address()
   * @model containment="true"
   * @generated
   */
  EList<Address> getAddress();

  /**
   * Returns the value of the '<em><b>Company Number</b></em>' containment reference list.
   * The list contents are of type {@link imperialmsc.lmw21.pactdsl.pactDSL.CompanyNumber}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Company Number</em>' containment reference list.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getEntityType_CompanyNumber()
   * @model containment="true"
   * @generated
   */
  EList<CompanyNumber> getCompanyNumber();

  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link imperialmsc.lmw21.pactdsl.pactDSL.Feature}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see imperialmsc.lmw21.pactdsl.pactDSL.PactDSLPackage#getEntityType_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // EntityType
