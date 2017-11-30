/**
 */
package modeloConceitualER;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.Relationship#getRelationshiplink <em>Relationshiplink</em>}</li>
 * </ul>
 *
 * @see modeloConceitualER.ModeloConceitualERPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Elements {
	/**
	 * Returns the value of the '<em><b>Relationshiplink</b></em>' reference list.
	 * The list contents are of type {@link modeloConceitualER.RelationshipLink}.
	 * It is bidirectional and its opposite is '{@link modeloConceitualER.RelationshipLink#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationshiplink</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationshiplink</em>' reference list.
	 * @see modeloConceitualER.ModeloConceitualERPackage#getRelationship_Relationshiplink()
	 * @see modeloConceitualER.RelationshipLink#getRelationship
	 * @model opposite="relationship" upper="2"
	 * @generated
	 */
	EList<RelationshipLink> getRelationshiplink();

} // Relationship
