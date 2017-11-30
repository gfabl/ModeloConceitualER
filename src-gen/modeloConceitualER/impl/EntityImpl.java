/**
 */
package modeloConceitualER.impl;

import java.util.Collection;

import modeloConceitualER.Entity;
import modeloConceitualER.ModeloConceitualERPackage;
import modeloConceitualER.RelationshipLink;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.impl.EntityImpl#getRelationshiplink <em>Relationshiplink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends ElementsImpl implements Entity {
	/**
	 * The cached value of the '{@link #getRelationshiplink() <em>Relationshiplink</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshiplink()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipLink> relationshiplink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloConceitualERPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationshipLink> getRelationshiplink() {
		if (relationshiplink == null) {
			relationshiplink = new EObjectWithInverseResolvingEList<RelationshipLink>(RelationshipLink.class, this,
					ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK,
					ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY);
		}
		return relationshiplink;
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
		case ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRelationshiplink()).basicAdd(otherEnd, msgs);
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
		case ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK:
			return ((InternalEList<?>) getRelationshiplink()).basicRemove(otherEnd, msgs);
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
		case ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK:
			return getRelationshiplink();
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
		case ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK:
			getRelationshiplink().clear();
			getRelationshiplink().addAll((Collection<? extends RelationshipLink>) newValue);
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
		case ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK:
			getRelationshiplink().clear();
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
		case ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK:
			return relationshiplink != null && !relationshiplink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
