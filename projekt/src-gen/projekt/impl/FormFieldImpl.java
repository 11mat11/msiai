/**
 */
package projekt.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import projekt.FormField;
import projekt.ProjektPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projekt.impl.FormFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link projekt.impl.FormFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link projekt.impl.FormFieldImpl#getLabel_name <em>Label name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormFieldImpl extends MinimalEObjectImpl.Container implements FormField {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	protected FormFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjektPackage.Literals.FORM_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektPackage.FORM_FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektPackage.FORM_FIELD__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjektPackage.FORM_FIELD__LABEL_NAME, oldLabel_name,
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
		case ProjektPackage.FORM_FIELD__TYPE:
			return getType();
		case ProjektPackage.FORM_FIELD__NAME:
			return getName();
		case ProjektPackage.FORM_FIELD__LABEL_NAME:
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
		case ProjektPackage.FORM_FIELD__TYPE:
			setType((String) newValue);
			return;
		case ProjektPackage.FORM_FIELD__NAME:
			setName((String) newValue);
			return;
		case ProjektPackage.FORM_FIELD__LABEL_NAME:
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
		case ProjektPackage.FORM_FIELD__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ProjektPackage.FORM_FIELD__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjektPackage.FORM_FIELD__LABEL_NAME:
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
		case ProjektPackage.FORM_FIELD__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case ProjektPackage.FORM_FIELD__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjektPackage.FORM_FIELD__LABEL_NAME:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", label_name: ");
		result.append(label_name);
		result.append(')');
		return result.toString();
	}

} //FormFieldImpl
