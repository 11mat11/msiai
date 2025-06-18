/**
 */
package projekt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.FormField#getType <em>Type</em>}</li>
 *   <li>{@link projekt.FormField#getName <em>Name</em>}</li>
 *   <li>{@link projekt.FormField#getLabel_name <em>Label name</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getFormField()
 * @model
 * @generated
 */
public interface FormField extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see projekt.ProjektPackage#getFormField_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link projekt.FormField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projekt.ProjektPackage#getFormField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projekt.FormField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label name</em>' attribute.
	 * @see #setLabel_name(String)
	 * @see projekt.ProjektPackage#getFormField_Label_name()
	 * @model
	 * @generated
	 */
	String getLabel_name();

	/**
	 * Sets the value of the '{@link projekt.FormField#getLabel_name <em>Label name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label name</em>' attribute.
	 * @see #getLabel_name()
	 * @generated
	 */
	void setLabel_name(String value);

} // FormField
