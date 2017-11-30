/**
 */
package modeloConceitualER.impl;

import modeloConceitualER.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModeloConceitualERFactoryImpl extends EFactoryImpl implements ModeloConceitualERFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModeloConceitualERFactory init() {
		try {
			ModeloConceitualERFactory theModeloConceitualERFactory = (ModeloConceitualERFactory) EPackage.Registry.INSTANCE
					.getEFactory(ModeloConceitualERPackage.eNS_URI);
			if (theModeloConceitualERFactory != null) {
				return theModeloConceitualERFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModeloConceitualERFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloConceitualERFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ModeloConceitualERPackage.SCHEMA:
			return createSchema();
		case ModeloConceitualERPackage.ENTITY:
			return createEntity();
		case ModeloConceitualERPackage.RELATIONSHIP:
			return createRelationship();
		case ModeloConceitualERPackage.ATTRIBUTE:
			return createAttribute();
		case ModeloConceitualERPackage.ATTRIBUTE_LINK:
			return createAttributeLink();
		case ModeloConceitualERPackage.RELATIONSHIP_LINK:
			return createRelationshipLink();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeLink createAttributeLink() {
		AttributeLinkImpl attributeLink = new AttributeLinkImpl();
		return attributeLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipLink createRelationshipLink() {
		RelationshipLinkImpl relationshipLink = new RelationshipLinkImpl();
		return relationshipLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeloConceitualERPackage getModeloConceitualERPackage() {
		return (ModeloConceitualERPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModeloConceitualERPackage getPackage() {
		return ModeloConceitualERPackage.eINSTANCE;
	}

} //ModeloConceitualERFactoryImpl
