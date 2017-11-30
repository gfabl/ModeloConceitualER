/**
 */
package modeloConceitualER.impl;

import modeloConceitualER.Attribute;
import modeloConceitualER.AttributeLink;
import modeloConceitualER.ModeloConceitualERPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.impl.AttributeImpl#getAttributelinktarget <em>Attributelinktarget</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends ElementsImpl implements Attribute {
	/**
	 * The cached value of the '{@link #getAttributelinktarget() <em>Attributelinktarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributelinktarget()
	 * @generated
	 * @ordered
	 */
	protected AttributeLink attributelinktarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloConceitualERPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLink getAttributelinktarget() {
		if (attributelinktarget != null && attributelinktarget.eIsProxy()) {
			InternalEObject oldAttributelinktarget = (InternalEObject) attributelinktarget;
			attributelinktarget = (AttributeLink) eResolveProxy(oldAttributelinktarget);
			if (attributelinktarget != oldAttributelinktarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET, oldAttributelinktarget,
							attributelinktarget));
			}
		}
		return attributelinktarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLink basicGetAttributelinktarget() {
		return attributelinktarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributelinktarget(AttributeLink newAttributelinktarget, NotificationChain msgs) {
		AttributeLink oldAttributelinktarget = attributelinktarget;
		attributelinktarget = newAttributelinktarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET, oldAttributelinktarget,
					newAttributelinktarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributelinktarget(AttributeLink newAttributelinktarget) {
		if (newAttributelinktarget != attributelinktarget) {
			NotificationChain msgs = null;
			if (attributelinktarget != null)
				msgs = ((InternalEObject) attributelinktarget).eInverseRemove(this,
						ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE, AttributeLink.class, msgs);
			if (newAttributelinktarget != null)
				msgs = ((InternalEObject) newAttributelinktarget).eInverseAdd(this,
						ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE, AttributeLink.class, msgs);
			msgs = basicSetAttributelinktarget(newAttributelinktarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET, newAttributelinktarget,
					newAttributelinktarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET:
			if (attributelinktarget != null)
				msgs = ((InternalEObject) attributelinktarget).eInverseRemove(this,
						ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE, AttributeLink.class, msgs);
			return basicSetAttributelinktarget((AttributeLink) otherEnd, msgs);
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
		case ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET:
			return basicSetAttributelinktarget(null, msgs);
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
		case ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET:
			if (resolve)
				return getAttributelinktarget();
			return basicGetAttributelinktarget();
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
		case ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET:
			setAttributelinktarget((AttributeLink) newValue);
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
		case ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET:
			setAttributelinktarget((AttributeLink) null);
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
		case ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET:
			return attributelinktarget != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeImpl
