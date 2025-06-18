/**
 */
package projekt;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projekt.TableRow#getTableCells <em>Table Cells</em>}</li>
 * </ul>
 *
 * @see projekt.ProjektPackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Cells</b></em>' containment reference list.
	 * The list contents are of type {@link projekt.TableCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Cells</em>' containment reference list.
	 * @see projekt.ProjektPackage#getTableRow_TableCells()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableCell> getTableCells();

} // TableRow
