/**
 */
package modeloConceitualER.impl;

import modeloConceitualER.Attribute;
import modeloConceitualER.AttributeLink;
import modeloConceitualER.Elements;
import modeloConceitualER.Entity;
import modeloConceitualER.Link;
import modeloConceitualER.ModeloConceitualERFactory;
import modeloConceitualER.ModeloConceitualERPackage;
import modeloConceitualER.Relationship;
import modeloConceitualER.RelationshipLink;
import modeloConceitualER.Schema;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloConceitualERPackageImpl extends EPackageImpl implements ModeloConceitualERPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see modeloConceitualER.ModeloConceitualERPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModeloConceitualERPackageImpl() {
		super(eNS_URI, ModeloConceitualERFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModeloConceitualERPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModeloConceitualERPackage init() {
		if (isInited)
			return (ModeloConceitualERPackage) EPackage.Registry.INSTANCE
					.getEPackage(ModeloConceitualERPackage.eNS_URI);

		// Obtain or create and register package
		ModeloConceitualERPackageImpl theModeloConceitualERPackage = (ModeloConceitualERPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ModeloConceitualERPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ModeloConceitualERPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theModeloConceitualERPackage.createPackageContents();

		// Initialize created meta-data
		theModeloConceitualERPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModeloConceitualERPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModeloConceitualERPackage.eNS_URI, theModeloConceitualERPackage);
		return theModeloConceitualERPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Elements() {
		return (EReference) schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema_Link() {
		return (EReference) schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElements() {
		return elementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElements_Attributelinksource() {
		return (EReference) elementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relationshiplink() {
		return (EReference) entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Relationshiplink() {
		return (EReference) relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Attributelinktarget() {
		return (EReference) attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeLink() {
		return attributeLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeLink_Attribute() {
		return (EReference) attributeLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeLink_Elements() {
		return (EReference) attributeLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipLink() {
		return relationshipLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipLink_Entity() {
		return (EReference) relationshipLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipLink_Relationship() {
		return (EReference) relationshipLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloConceitualERFactory getModeloConceitualERFactory() {
		return (ModeloConceitualERFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__ELEMENTS);
		createEReference(schemaEClass, SCHEMA__LINK);

		elementsEClass = createEClass(ELEMENTS);
		createEReference(elementsEClass, ELEMENTS__ATTRIBUTELINKSOURCE);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__RELATIONSHIPLINK);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATIONSHIPLINK);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__ATTRIBUTELINKTARGET);

		linkEClass = createEClass(LINK);

		attributeLinkEClass = createEClass(ATTRIBUTE_LINK);
		createEReference(attributeLinkEClass, ATTRIBUTE_LINK__ATTRIBUTE);
		createEReference(attributeLinkEClass, ATTRIBUTE_LINK__ELEMENTS);

		relationshipLinkEClass = createEClass(RELATIONSHIP_LINK);
		createEReference(relationshipLinkEClass, RELATIONSHIP_LINK__ENTITY);
		createEReference(relationshipLinkEClass, RELATIONSHIP_LINK__RELATIONSHIP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getElements());
		relationshipEClass.getESuperTypes().add(this.getElements());
		attributeEClass.getESuperTypes().add(this.getElements());
		attributeLinkEClass.getESuperTypes().add(this.getLink());
		relationshipLinkEClass.getESuperTypes().add(this.getLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema_Elements(), this.getElements(), null, "elements", null, 0, -1, Schema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema_Link(), this.getLink(), null, "link", null, 0, -1, Schema.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(elementsEClass, Elements.class, "Elements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElements_Attributelinksource(), this.getAttributeLink(), this.getAttributeLink_Elements(),
				"attributelinksource", null, 0, -1, Elements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Relationshiplink(), this.getRelationshipLink(), this.getRelationshipLink_Entity(),
				"relationshiplink", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Relationshiplink(), this.getRelationshipLink(),
				this.getRelationshipLink_Relationship(), "relationshiplink", null, 0, 2, Relationship.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Attributelinktarget(), this.getAttributeLink(), this.getAttributeLink_Attribute(),
				"attributelinktarget", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeLinkEClass, AttributeLink.class, "AttributeLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeLink_Attribute(), this.getAttribute(), this.getAttribute_Attributelinktarget(),
				"attribute", null, 1, 1, AttributeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeLink_Elements(), this.getElements(), this.getElements_Attributelinksource(),
				"elements", null, 1, 1, AttributeLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipLinkEClass, RelationshipLink.class, "RelationshipLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipLink_Entity(), this.getEntity(), this.getEntity_Relationshiplink(), "entity",
				null, 1, 1, RelationshipLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipLink_Relationship(), this.getRelationship(),
				this.getRelationship_Relationshiplink(), "relationship", null, 1, 1, RelationshipLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModeloConceitualERPackageImpl
