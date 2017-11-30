/**
 */
package modeloConceitualER;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.Schema#getElements <em>Elements</em>}</li>
 *   <li>{@link modeloConceitualER.Schema#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see modeloConceitualER.ModeloConceitualERPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link modeloConceitualER.Elements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see modeloConceitualER.ModeloConceitualERPackage#getSchema_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Elements> getElements();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference list.
	 * The list contents are of type {@link modeloConceitualER.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference list.
	 * @see modeloConceitualER.ModeloConceitualERPackage#getSchema_Link()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLink();

} // Schema
