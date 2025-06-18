/**
 */
package projekt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projekt.FormLabel;
import projekt.ProjektPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projekt.impl.FormLabelImpl#getLabel_name <em>Label name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormLabelImpl extends MinimalEObjectImpl.Container implements FormLabel {
	/**
	 * The default value of the '{@link #getLabel_name() <em>Label name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_name()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel_name() <em>Label name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel_name()
	 * @generated
	 * @ordered
	 */
	protected String label_name = LABEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjektPackage.Literals.FORM_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel_name() {
		return label_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel_name(String newLabel_name) {
		String oldLabel_name = label_name;
		label_name = newLabel_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektPackage.FORM_LABEL__LABEL_NAME, oldLabel_name,
					label_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjektPackage.FORM_LABEL__LABEL_NAME:
			return getLabel_name();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjektPackage.FORM_LABEL__LABEL_NAME:
			setLabel_name((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjektPackage.FORM_LABEL__LABEL_NAME:
			setLabel_name(LABEL_NAME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjektPackage.FORM_LABEL__LABEL_NAME:
			return LABEL_NAME_EDEFAULT == null ? label_name != null : !LABEL_NAME_EDEFAULT.equals(label_name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (label_name: ");
		result.append(label_name);
		result.append(')');
		return result.toString();
	}

} //FormLabelImpl
