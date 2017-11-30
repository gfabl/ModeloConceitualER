/**
 */
package modeloConceitualER.impl;

import modeloConceitualER.Entity;
import modeloConceitualER.ModeloConceitualERPackage;
import modeloConceitualER.Relationship;
import modeloConceitualER.RelationshipLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.impl.RelationshipLinkImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link modeloConceitualER.impl.RelationshipLinkImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipLinkImpl extends LinkImpl implements RelationshipLink {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModeloConceitualERPackage.Literals.RELATIONSHIP_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject) entity;
			entity = (Entity) eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY, oldEntity, newEntity);
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
	public void setEntity(Entity newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this,
						ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK, Entity.class, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject) newEntity).eInverseAdd(this,
						ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK, Entity.class, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY,
					newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject) relationship;
			relationship = (Relationship) eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Relationship newRelationship, NotificationChain msgs) {
		Relationship oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP, oldRelationship, newRelationship);
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
	public void setRelationship(Relationship newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject) relationship).eInverseRemove(this,
						ModeloConceitualERPackage.RELATIONSHIP__RELATIONSHIPLINK, Relationship.class, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject) newRelationship).eInverseAdd(this,
						ModeloConceitualERPackage.RELATIONSHIP__RELATIONSHIPLINK, Relationship.class, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY:
			if (entity != null)
				msgs = ((InternalEObject) entity).eInverseRemove(this,
						ModeloConceitualERPackage.ENTITY__RELATIONSHIPLINK, Entity.class, msgs);
			return basicSetEntity((Entity) otherEnd, msgs);
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP:
			if (relationship != null)
				msgs = ((InternalEObject) relationship).eInverseRemove(this,
						ModeloConceitualERPackage.RELATIONSHIP__RELATIONSHIPLINK, Relationship.class, msgs);
			return basicSetRelationship((Relationship) otherEnd, msgs);
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
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY:
			return basicSetEntity(null, msgs);
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP:
			return basicSetRelationship(null, msgs);
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
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY:
			if (resolve)
				return getEntity();
			return basicGetEntity();
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP:
			if (resolve)
				return getRelationship();
			return basicGetRelationship();
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
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY:
			setEntity((Entity) newValue);
			return;
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP:
			setRelationship((Relationship) newValue);
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
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY:
			setEntity((Entity) null);
			return;
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP:
			setRelationship((Relationship) null);
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
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__ENTITY:
			return entity != null;
		case ModeloConceitualERPackage.RELATIONSHIP_LINK__RELATIONSHIP:
			return relationship != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipLinkImpl
