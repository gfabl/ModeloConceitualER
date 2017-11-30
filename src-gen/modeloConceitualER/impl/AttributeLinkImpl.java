/**
 */
package modeloConceitualER.impl;

import modeloConceitualER.Attribute;
import modeloConceitualER.AttributeLink;
import modeloConceitualER.Elements;
import modeloConceitualER.ModeloConceitualERPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.impl.AttributeLinkImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link modeloConceitualER.impl.AttributeLinkImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeLinkImpl extends LinkImpl implements AttributeLink {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected Elements elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloConceitualERPackage.Literals.ATTRIBUTE_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject) attribute;
			attribute = (Attribute) eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(Attribute newAttribute, NotificationChain msgs) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE, oldAttribute, newAttribute);
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
	public void setAttribute(Attribute newAttribute) {
		if (newAttribute != attribute) {
			NotificationChain msgs = null;
			if (attribute != null)
				msgs = ((InternalEObject) attribute).eInverseRemove(this,
						ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET, Attribute.class, msgs);
			if (newAttribute != null)
				msgs = ((InternalEObject) newAttribute).eInverseAdd(this,
						ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET, Attribute.class, msgs);
			msgs = basicSetAttribute(newAttribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE,
					newAttribute, newAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements getElements() {
		if (elements != null && elements.eIsProxy()) {
			InternalEObject oldElements = (InternalEObject) elements;
			elements = (Elements) eResolveProxy(oldElements);
			if (elements != oldElements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS, oldElements, elements));
			}
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Elements basicGetElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(Elements newElements, NotificationChain msgs) {
		Elements oldElements = elements;
		elements = newElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS, oldElements, newElements);
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
	public void setElements(Elements newElements) {
		if (newElements != elements) {
			NotificationChain msgs = null;
			if (elements != null)
				msgs = ((InternalEObject) elements).eInverseRemove(this,
						ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE, Elements.class, msgs);
			if (newElements != null)
				msgs = ((InternalEObject) newElements).eInverseAdd(this,
						ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE, Elements.class, msgs);
			msgs = basicSetElements(newElements, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS,
					newElements, newElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE:
			if (attribute != null)
				msgs = ((InternalEObject) attribute).eInverseRemove(this,
						ModeloConceitualERPackage.ATTRIBUTE__ATTRIBUTELINKTARGET, Attribute.class, msgs);
			return basicSetAttribute((Attribute) otherEnd, msgs);
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS:
			if (elements != null)
				msgs = ((InternalEObject) elements).eInverseRemove(this,
						ModeloConceitualERPackage.ELEMENTS__ATTRIBUTELINKSOURCE, Elements.class, msgs);
			return basicSetElements((Elements) otherEnd, msgs);
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
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE:
			return basicSetAttribute(null, msgs);
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS:
			return basicSetElements(null, msgs);
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
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE:
			if (resolve)
				return getAttribute();
			return basicGetAttribute();
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS:
			if (resolve)
				return getElements();
			return basicGetElements();
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
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE:
			setAttribute((Attribute) newValue);
			return;
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS:
			setElements((Elements) newValue);
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
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE:
			setAttribute((Attribute) null);
			return;
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS:
			setElements((Elements) null);
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
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ATTRIBUTE:
			return attribute != null;
		case ModeloConceitualERPackage.ATTRIBUTE_LINK__ELEMENTS:
			return elements != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeLinkImpl
