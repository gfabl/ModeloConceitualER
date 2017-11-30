/**
 */
package modeloConceitualER;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.Attribute#getAttributelinktarget <em>Attributelinktarget</em>}</li>
 * </ul>
 *
 * @see modeloConceitualER.ModeloConceitualERPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Elements {
	/**
	 * Returns the value of the '<em><b>Attributelinktarget</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modeloConceitualER.AttributeLink#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributelinktarget</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributelinktarget</em>' reference.
	 * @see #setAttributelinktarget(AttributeLink)
	 * @see modeloConceitualER.ModeloConceitualERPackage#getAttribute_Attributelinktarget()
	 * @see modeloConceitualER.AttributeLink#getAttribute
	 * @model opposite="attribute" required="true"
	 * @generated
	 */
	AttributeLink getAttributelinktarget();

	/**
	 * Sets the value of the '{@link modeloConceitualER.Attribute#getAttributelinktarget <em>Attributelinktarget</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributelinktarget</em>' reference.
	 * @see #getAttributelinktarget()
	 * @generated
	 */
	void setAttributelinktarget(AttributeLink value);

} // Attribute
