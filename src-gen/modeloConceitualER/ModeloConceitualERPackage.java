/**
 */
package modeloConceitualER;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see modeloConceitualER.ModeloConceitualERFactory
 * @model kind="package"
 * @generated
 */
public interface ModeloConceitualERPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modeloConceitualER";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/modeloConceitualER";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "modeloConceitualER";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModeloConceitualERPackage eINSTANCE = modeloConceitualER.impl.ModeloConceitualERPackageImpl.init();

	/**
	 * The meta object id for the '{@link modeloConceitualER.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloConceitualER.impl.SchemaImpl
	 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__LINK = 1;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloConceitualER.impl.ElementsImpl <em>Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloConceitualER.impl.ElementsImpl
	 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getElements()
	 * @generated
	 */
	int ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Attributelinksource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS__ATTRIBUTELINKSOURCE = 0;

	/**
	 * The number of structural features of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloConceitualER.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloConceitualER.impl.EntityImpl
	 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Attributelinksource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTELINKSOURCE = ELEMENTS__ATTRIBUTELINKSOURCE;

	/**
	 * The feature id for the '<em><b>Relationshiplink</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONSHIPLINK = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloConceitualER.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloConceitualER.impl.RelationshipImpl
	 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Attributelinksource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ATTRIBUTELINKSOURCE = ELEMENTS__ATTRIBUTELINKSOURCE;

	/**
	 * The feature id for the '<em><b>Relationshiplink</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATIONSHIPLINK = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloConceitualER.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloConceitualER.impl.AttributeImpl
	 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Attributelinksource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTELINKSOURCE = ELEMENTS__ATTRIBUTELINKSOURCE;

	/**
	 * The feature id for the '<em><b>Attributelinktarget</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTELINKTARGET = ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloConceitualER.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloConceitualER.impl.LinkImpl
	 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 5;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modeloConceitualER.impl.AttributeLinkImpl <em>Attribute Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloConceitualER.impl.AttributeLinkImpl
	 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getAttributeLink()
	 * @generated
	 */
	int ATTRIBUTE_LINK = 6;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINK__ATTRIBUTE = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINK__ELEMENTS = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modeloConceitualER.impl.RelationshipLinkImpl <em>Relationship Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modeloConceitualER.impl.RelationshipLinkImpl
	 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getRelationshipLink()
	 * @generated
	 */
	int RELATIONSHIP_LINK = 7;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__ENTITY = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK__RELATIONSHIP = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link modeloConceitualER.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see modeloConceitualER.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloConceitualER.Schema#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see modeloConceitualER.Schema#getElements()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link modeloConceitualER.Schema#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see modeloConceitualER.Schema#getLink()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Link();

	/**
	 * Returns the meta object for class '{@link modeloConceitualER.Elements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elements</em>'.
	 * @see modeloConceitualER.Elements
	 * @generated
	 */
	EClass getElements();

	/**
	 * Returns the meta object for the reference list '{@link modeloConceitualER.Elements#getAttributelinksource <em>Attributelinksource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributelinksource</em>'.
	 * @see modeloConceitualER.Elements#getAttributelinksource()
	 * @see #getElements()
	 * @generated
	 */
	EReference getElements_Attributelinksource();

	/**
	 * Returns the meta object for class '{@link modeloConceitualER.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see modeloConceitualER.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the reference list '{@link modeloConceitualER.Entity#getRelationshiplink <em>Relationshiplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationshiplink</em>'.
	 * @see modeloConceitualER.Entity#getRelationshiplink()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relationshiplink();

	/**
	 * Returns the meta object for class '{@link modeloConceitualER.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see modeloConceitualER.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference list '{@link modeloConceitualER.Relationship#getRelationshiplink <em>Relationshiplink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationshiplink</em>'.
	 * @see modeloConceitualER.Relationship#getRelationshiplink()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Relationshiplink();

	/**
	 * Returns the meta object for class '{@link modeloConceitualER.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see modeloConceitualER.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the reference '{@link modeloConceitualER.Attribute#getAttributelinktarget <em>Attributelinktarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attributelinktarget</em>'.
	 * @see modeloConceitualER.Attribute#getAttributelinktarget()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Attributelinktarget();

	/**
	 * Returns the meta object for class '{@link modeloConceitualER.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see modeloConceitualER.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link modeloConceitualER.AttributeLink <em>Attribute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Link</em>'.
	 * @see modeloConceitualER.AttributeLink
	 * @generated
	 */
	EClass getAttributeLink();

	/**
	 * Returns the meta object for the reference '{@link modeloConceitualER.AttributeLink#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see modeloConceitualER.AttributeLink#getAttribute()
	 * @see #getAttributeLink()
	 * @generated
	 */
	EReference getAttributeLink_Attribute();

	/**
	 * Returns the meta object for the reference '{@link modeloConceitualER.AttributeLink#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Elements</em>'.
	 * @see modeloConceitualER.AttributeLink#getElements()
	 * @see #getAttributeLink()
	 * @generated
	 */
	EReference getAttributeLink_Elements();

	/**
	 * Returns the meta object for class '{@link modeloConceitualER.RelationshipLink <em>Relationship Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Link</em>'.
	 * @see modeloConceitualER.RelationshipLink
	 * @generated
	 */
	EClass getRelationshipLink();

	/**
	 * Returns the meta object for the reference '{@link modeloConceitualER.RelationshipLink#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see modeloConceitualER.RelationshipLink#getEntity()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EReference getRelationshipLink_Entity();

	/**
	 * Returns the meta object for the reference '{@link modeloConceitualER.RelationshipLink#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see modeloConceitualER.RelationshipLink#getRelationship()
	 * @see #getRelationshipLink()
	 * @generated
	 */
	EReference getRelationshipLink_Relationship();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModeloConceitualERFactory getModeloConceitualERFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link modeloConceitualER.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloConceitualER.impl.SchemaImpl
		 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ELEMENTS = eINSTANCE.getSchema_Elements();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__LINK = eINSTANCE.getSchema_Link();

		/**
		 * The meta object literal for the '{@link modeloConceitualER.impl.ElementsImpl <em>Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloConceitualER.impl.ElementsImpl
		 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getElements()
		 * @generated
		 */
		EClass ELEMENTS = eINSTANCE.getElements();

		/**
		 * The meta object literal for the '<em><b>Attributelinksource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTS__ATTRIBUTELINKSOURCE = eINSTANCE.getElements_Attributelinksource();

		/**
		 * The meta object literal for the '{@link modeloConceitualER.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloConceitualER.impl.EntityImpl
		 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Relationshiplink</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONSHIPLINK = eINSTANCE.getEntity_Relationshiplink();

		/**
		 * The meta object literal for the '{@link modeloConceitualER.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloConceitualER.impl.RelationshipImpl
		 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Relationshiplink</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATIONSHIPLINK = eINSTANCE.getRelationship_Relationshiplink();

		/**
		 * The meta object literal for the '{@link modeloConceitualER.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloConceitualER.impl.AttributeImpl
		 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attributelinktarget</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ATTRIBUTELINKTARGET = eINSTANCE.getAttribute_Attributelinktarget();

		/**
		 * The meta object literal for the '{@link modeloConceitualER.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloConceitualER.impl.LinkImpl
		 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link modeloConceitualER.impl.AttributeLinkImpl <em>Attribute Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloConceitualER.impl.AttributeLinkImpl
		 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getAttributeLink()
		 * @generated
		 */
		EClass ATTRIBUTE_LINK = eINSTANCE.getAttributeLink();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LINK__ATTRIBUTE = eINSTANCE.getAttributeLink_Attribute();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_LINK__ELEMENTS = eINSTANCE.getAttributeLink_Elements();

		/**
		 * The meta object literal for the '{@link modeloConceitualER.impl.RelationshipLinkImpl <em>Relationship Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modeloConceitualER.impl.RelationshipLinkImpl
		 * @see modeloConceitualER.impl.ModeloConceitualERPackageImpl#getRelationshipLink()
		 * @generated
		 */
		EClass RELATIONSHIP_LINK = eINSTANCE.getRelationshipLink();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_LINK__ENTITY = eINSTANCE.getRelationshipLink_Entity();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_LINK__RELATIONSHIP = eINSTANCE.getRelationshipLink_Relationship();

	}

} //ModeloConceitualERPackage
