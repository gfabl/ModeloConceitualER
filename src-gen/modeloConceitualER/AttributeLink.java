/**
 */
package modeloConceitualER;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link modeloConceitualER.AttributeLink#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link modeloConceitualER.AttributeLink#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see modeloConceitualER.ModeloConceitualERPackage#getAttributeLink()
 * @model
 * @generated
 */
public interface AttributeLink extends Link {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modeloConceitualER.Attribute#getAttributelinktarget <em>Attributelinktarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see modeloConceitualER.ModeloConceitualERPackage#getAttributeLink_Attribute()
	 * @see modeloConceitualER.Attribute#getAttributelinktarget
	 * @model opposite="attributelinktarget" required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link modeloConceitualER.AttributeLink#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link modeloConceitualER.Elements#getAttributelinksource <em>Attributelinksource</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference.
	 * @see #setElements(Elements)
	 * @see modeloConceitualER.ModeloConceitualERPackage#getAttributeLink_Elements()
	 * @see modeloConceitualER.Elements#getAttributelinksource
	 * @model opposite="attributelinksource" required="true"
	 * @generated
	 */
	Elements getElements();

	/**
	 * Sets the value of the '{@link modeloConceitualER.AttributeLink#getElements <em>Elements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elements</em>' reference.
	 * @see #getElements()
	 * @generated
	 */
	void setElements(Elements value);

} // AttributeLink
