/**
 */
package modeloConceitualER;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.RelationshipLink#getEntity <em>Entity</em>}</li>
 *   <li>{@link modeloConceitualER.RelationshipLink#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see modeloConceitualER.ModeloConceitualERPackage#getRelationshipLink()
 * @model
 * @generated
 */
public interface RelationshipLink extends Link {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modeloConceitualER.Entity#getRelationshiplink <em>Relationshiplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see modeloConceitualER.ModeloConceitualERPackage#getRelationshipLink_Entity()
	 * @see modeloConceitualER.Entity#getRelationshiplink
	 * @model opposite="relationshiplink" required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link modeloConceitualER.RelationshipLink#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modeloConceitualER.Relationship#getRelationshiplink <em>Relationshiplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(Relationship)
	 * @see modeloConceitualER.ModeloConceitualERPackage#getRelationshipLink_Relationship()
	 * @see modeloConceitualER.Relationship#getRelationshiplink
	 * @model opposite="relationshiplink" required="true"
	 * @generated
	 */
	Relationship getRelationship();

	/**
	 * Sets the value of the '{@link modeloConceitualER.RelationshipLink#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Relationship value);

} // RelationshipLink
