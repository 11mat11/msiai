/**
 */
package projekt;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Html</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.Html#getHead <em>Head</em>}</li>
 *   <li>{@link projekt.Html#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getHtml()
 * @model
 * @generated
 */
public interface Html extends EObject {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(Head)
	 * @see projekt.ProjektPackage#getHtml_Head()
	 * @model containment="true"
	 * @generated
	 */
	Head getHead();

	/**
	 * Sets the value of the '{@link projekt.Html#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(Head value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(Body)
	 * @see projekt.ProjektPackage#getHtml_Body()
	 * @model containment="true"
	 * @generated
	 */
	Body getBody();

	/**
	 * Sets the value of the '{@link projekt.Html#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Body value);

} // Html
