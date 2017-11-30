/**
 */
package modeloConceitualER;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.Elements#getAttributelinksource <em>Attributelinksource</em>}</li>
 * </ul>
 *
 * @see modeloConceitualER.ModeloConceitualERPackage#getElements()
 * @model abstract="true"
 * @generated
 */
public interface Elements extends EObject {
	/**
	 * Returns the value of the '<em><b>Attributelinksource</b></em>' reference list.
	 * The list contents are of type {@link modeloConceitualER.AttributeLink}.
	 * It is bidirectional and its opposite is '{@link modeloConceitualER.AttributeLink#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributelinksource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributelinksource</em>' reference list.
	 * @see modeloConceitualER.ModeloConceitualERPackage#getElements_Attributelinksource()
	 * @see modeloConceitualER.AttributeLink#getElements
	 * @model opposite="elements"
	 * @generated
	 */
	EList<AttributeLink> getAttributelinksource();

} // Elements
