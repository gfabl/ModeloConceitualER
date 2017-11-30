/**
 */
package modeloConceitualER;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.Entity#getRelationshiplink <em>Relationshiplink</em>}</li>
 * </ul>
 *
 * @see modeloConceitualER.ModeloConceitualERPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Elements {
	/**
	 * Returns the value of the '<em><b>Relationshiplink</b></em>' reference list.
	 * The list contents are of type {@link modeloConceitualER.RelationshipLink}.
	 * It is bidirectional and its opposite is '{@link modeloConceitualER.RelationshipLink#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationshiplink</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationshiplink</em>' reference list.
	 * @see modeloConceitualER.ModeloConceitualERPackage#getEntity_Relationshiplink()
	 * @see modeloConceitualER.RelationshipLink#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	EList<RelationshipLink> getRelationshiplink();

} // Entity
