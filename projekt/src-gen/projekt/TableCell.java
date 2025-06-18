/**
 */
package projekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.TableCell#getBodyElements <em>Body Elements</em>}</li>
 *   <li>{@link projekt.TableCell#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends EObject {
	/**
	 * Returns the value of the '<em><b>Body Elements</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.BodyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Elements</em>' containment reference list.
	 * @see projekt.ProjektPackage#getTableCell_BodyElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<BodyElement> getBodyElements();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see projekt.ProjektPackage#getTableCell_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link projekt.TableCell#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TableCell
