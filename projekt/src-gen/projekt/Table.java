/**
 */
package projekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.Table#getTableRows <em>Table Rows</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Rows</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.TableRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Rows</em>' containment reference list.
	 * @see projekt.ProjektPackage#getTable_TableRows()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableRow> getTableRows();

} // Table
