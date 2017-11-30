/**
 */
package modeloConceitualER.impl;

import java.util.Collection;

import modeloConceitualER.AttributeLink;
import modeloConceitualER.Elements;
import modeloConceitualER.ModeloConceitualERPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.impl.ElementsImpl#getAttributelinksource <em>Attributelinksource</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementsImpl extends MinimalEObjectImpl.Container implements Elements {
	/**
	 * The cached value of the '{@link #getAttributelinksource() <em>Attributelinksource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributelinksource()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeLink> attributelinksource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloConceitualERPackage.Literals.ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeLink> getAttributelinksource() {
		if (attributelinksource == null) {
			attributelinksource = new EObjectWithInverseResolvingEList<AttributeLink>(AttributeLink.class, this,
					ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE,
					ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS);
		}
		return attributelinksource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributelinksource()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE:
			return ((InternalEList<?>) getAttributelinksource()).basicRemove(otherEnd, msgs);
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
		case ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE:
			return getAttributelinksource();
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
		case ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE:
			getAttributelinksource().clear();
			getAttributelinksource().addAll((Collection<? extends AttributeLink>) newValue);
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
		case ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE:
			getAttributelinksource().clear();
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
		case ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE:
			return attributelinksource != null && !attributelinksource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementsImpl
