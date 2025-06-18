/**
 */
package projekt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.FormLabel#getLabel_name <em>Label name</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getFormLabel()
 * @model
 * @generated
 */
public interface FormLabel extends EObject {
	/**
	 * Returns the value of the '<em><b>Label name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label name</em>' attribute.
	 * @see #setLabel_name(String)
	 * @see projekt.ProjektPackage#getFormLabel_Label_name()
	 * @model
	 * @generated
	 */
	String getLabel_name();

	/**
	 * Sets the value of the '{@link projekt.FormLabel#getLabel_name <em>Label name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label name</em>' attribute.
	 * @see #getLabel_name()
	 * @generated
	 */
	void setLabel_name(String value);

} // FormLabel
