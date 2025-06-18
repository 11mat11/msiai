/**
 */
package projekt.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projekt.Base;
import projekt.Head;
import projekt.Link;
import projekt.Meta;
import projekt.ProjektPackage;
import projekt.Style;
import projekt.Title;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projekt.impl.HeadImpl#getMetas <em>Metas</em>}</li>
 *   <li>{@link projekt.impl.HeadImpl#getTitles <em>Titles</em>}</li>
 *   <li>{@link projekt.impl.HeadImpl#getBases <em>Bases</em>}</li>
 *   <li>{@link projekt.impl.HeadImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link projekt.impl.HeadImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeadImpl extends MinimalEObjectImpl.Container implements Head {
	/**
	 * The cached value of the '{@link #getMetas() <em>Metas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetas()
	 * @generated
	 * @ordered
	 */
	protected EList<Meta> metas;

	/**
	 * The cached value of the '{@link #getTitles() <em>Titles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitles()
	 * @generated
	 * @ordered
	 */
	protected EList<Title> titles;

	/**
	 * The cached value of the '{@link #getBases() <em>Bases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBases()
	 * @generated
	 * @ordered
	 */
	protected EList<Base> bases;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<Style> styles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjektPackage.Literals.HEAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Meta> getMetas() {
		if (metas == null) {
			metas = new EObjectContainmentEList<Meta>(Meta.class, this, ProjektPackage.HEAD__METAS);
		}
		return metas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Title> getTitles() {
		if (titles == null) {
			titles = new EObjectContainmentEList<Title>(Title.class, this, ProjektPackage.HEAD__TITLES);
		}
		return titles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Base> getBases() {
		if (bases == null) {
			bases = new EObjectContainmentEList<Base>(Base.class, this, ProjektPackage.HEAD__BASES);
		}
		return bases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, ProjektPackage.HEAD__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Style> getStyles() {
		if (styles == null) {
			styles = new EObjectContainmentEList<Style>(Style.class, this, ProjektPackage.HEAD__STYLES);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjektPackage.HEAD__METAS:
			return ((InternalEList<?>) getMetas()).basicRemove(otherEnd, msgs);
		case ProjektPackage.HEAD__TITLES:
			return ((InternalEList<?>) getTitles()).basicRemove(otherEnd, msgs);
		case ProjektPackage.HEAD__BASES:
			return ((InternalEList<?>) getBases()).basicRemove(otherEnd, msgs);
		case ProjektPackage.HEAD__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case ProjektPackage.HEAD__STYLES:
			return ((InternalEList<?>) getStyles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjektPackage.HEAD__METAS:
			return getMetas();
		case ProjektPackage.HEAD__TITLES:
			return getTitles();
		case ProjektPackage.HEAD__BASES:
			return getBases();
		case ProjektPackage.HEAD__LINKS:
			return getLinks();
		case ProjektPackage.HEAD__STYLES:
			return getStyles();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjektPackage.HEAD__METAS:
			getMetas().clear();
			getMetas().addAll((Collection<? extends Meta>) newValue);
			return;
		case ProjektPackage.HEAD__TITLES:
			getTitles().clear();
			getTitles().addAll((Collection<? extends Title>) newValue);
			return;
		case ProjektPackage.HEAD__BASES:
			getBases().clear();
			getBases().addAll((Collection<? extends Base>) newValue);
			return;
		case ProjektPackage.HEAD__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case ProjektPackage.HEAD__STYLES:
			getStyles().clear();
			getStyles().addAll((Collection<? extends Style>) newValue);
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
		case ProjektPackage.HEAD__METAS:
			getMetas().clear();
			return;
		case ProjektPackage.HEAD__TITLES:
			getTitles().clear();
			return;
		case ProjektPackage.HEAD__BASES:
			getBases().clear();
			return;
		case ProjektPackage.HEAD__LINKS:
			getLinks().clear();
			return;
		case ProjektPackage.HEAD__STYLES:
			getStyles().clear();
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
		case ProjektPackage.HEAD__METAS:
			return metas != null && !metas.isEmpty();
		case ProjektPackage.HEAD__TITLES:
			return titles != null && !titles.isEmpty();
		case ProjektPackage.HEAD__BASES:
			return bases != null && !bases.isEmpty();
		case ProjektPackage.HEAD__LINKS:
			return links != null && !links.isEmpty();
		case ProjektPackage.HEAD__STYLES:
			return styles != null && !styles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HeadImpl
