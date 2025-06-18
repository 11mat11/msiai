/**
 */
package projekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.Head#getMetas <em>Metas</em>}</li>
 *   <li>{@link projekt.Head#getTitles <em>Titles</em>}</li>
 *   <li>{@link projekt.Head#getBases <em>Bases</em>}</li>
 *   <li>{@link projekt.Head#getLinks <em>Links</em>}</li>
 *   <li>{@link projekt.Head#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getHead()
 * @model
 * @generated
 */
public interface Head extends EObject {
	/**
	 * Returns the value of the '<em><b>Metas</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Meta}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metas</em>' containment reference list.
	 * @see projekt.ProjektPackage#getHead_Metas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Meta> getMetas();

	/**
	 * Returns the value of the '<em><b>Titles</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Title}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' containment reference list.
	 * @see projekt.ProjektPackage#getHead_Titles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Title> getTitles();

	/**
	 * Returns the value of the '<em><b>Bases</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Base}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bases</em>' containment reference list.
	 * @see projekt.ProjektPackage#getHead_Bases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Base> getBases();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see projekt.ProjektPackage#getHead_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.Style}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see projekt.ProjektPackage#getHead_Styles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Style> getStyles();

} // Head
