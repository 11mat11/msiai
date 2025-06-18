/**
 */
package projekt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.Heading#getH_number <em>Hnumber</em>}</li>
 *   <li>{@link projekt.Heading#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getHeading()
 * @model
 * @generated
 */
public interface Heading extends EObject {
	/**
	 * Returns the value of the '<em><b>Hnumber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hnumber</em>' attribute.
	 * @see #setH_number(int)
	 * @see projekt.ProjektPackage#getHeading_H_number()
	 * @model
	 * @generated
	 */
	int getH_number();

	/**
	 * Sets the value of the '{@link projekt.Heading#getH_number <em>Hnumber</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hnumber</em>' attribute.
	 * @see #getH_number()
	 * @generated
	 */
	void setH_number(int value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see projekt.ProjektPackage#getHeading_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link projekt.Heading#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Heading
