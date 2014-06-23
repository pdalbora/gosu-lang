package gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class AttributeGroup_Attribute extends gw.xml.XmlElement implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Default = new javax.xml.namespace.QName( "", "default", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Fixed = new javax.xml.namespace.QName( "", "fixed", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Form = new javax.xml.namespace.QName( "", "form", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Id = new javax.xml.namespace.QName( "", "id", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Name = new javax.xml.namespace.QName( "", "name", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Ref = new javax.xml.namespace.QName( "", "ref", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Type = new javax.xml.namespace.QName( "", "type", "" );
  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Use = new javax.xml.namespace.QName( "", "use", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Annotation = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "annotation", "xs" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_SimpleType = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "simpleType", "xs" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "attribute", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPEINSTANCETYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.types.complex.Attribute" );
          }
        };

  public AttributeGroup_Attribute() {
    this( new gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.Attribute() );
  }

  public AttributeGroup_Attribute( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.Attribute typeInstance ) {
    super( $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  protected AttributeGroup_Attribute( javax.xml.namespace.QName qname, gw.lang.reflect.IType type, gw.lang.reflect.IType schemaDefinedTypeInstanceType, gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    super( qname, type, schemaDefinedTypeInstanceType, typeInstance );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.Attribute getTypeInstance() {
    //noinspection RedundantCast
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.Attribute) super.getTypeInstance();
  }

  public void setTypeInstance( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.Attribute param ) {
    super.setTypeInstance( param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation Annotation() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation) TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().getValue( this );
  }

  public void setAnnotation$( gw.internal.schema.gw.xsd.w3c.xmlschema.Annotation param ) {
    TYPE.get().getTypeInfo().getProperty( "Annotation" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Default() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Default" ).getAccessor().getValue( this );
  }

  public void setDefault$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Default" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Fixed() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Fixed" ).getAccessor().getValue( this );
  }

  public void setFixed$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Fixed" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.enums.FormChoice Form() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.enums.FormChoice) TYPE.get().getTypeInfo().getProperty( "Form" ).getAccessor().getValue( this );
  }

  public void setForm$( gw.internal.schema.gw.xsd.w3c.xmlschema.enums.FormChoice param ) {
    TYPE.get().getTypeInfo().getProperty( "Form" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Id() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().getValue( this );
  }

  public void setId$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Id" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Name() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Name" ).getAccessor().getValue( this );
  }

  public void setName$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Name" ).getAccessor().setValue( this, param );
  }


  public javax.xml.namespace.QName Ref() {
    return (javax.xml.namespace.QName) TYPE.get().getTypeInfo().getProperty( "Ref" ).getAccessor().getValue( this );
  }

  public void setRef$( javax.xml.namespace.QName param ) {
    TYPE.get().getTypeInfo().getProperty( "Ref" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.Attribute_SimpleType SimpleType() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.Attribute_SimpleType) TYPE.get().getTypeInfo().getProperty( "SimpleType" ).getAccessor().getValue( this );
  }

  public void setSimpleType$( gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.Attribute_SimpleType param ) {
    TYPE.get().getTypeInfo().getProperty( "SimpleType" ).getAccessor().setValue( this, param );
  }


  public javax.xml.namespace.QName Type() {
    return (javax.xml.namespace.QName) TYPE.get().getTypeInfo().getProperty( "Type" ).getAccessor().getValue( this );
  }

  public void setType$( javax.xml.namespace.QName param ) {
    TYPE.get().getTypeInfo().getProperty( "Type" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.enums.Attribute_Use Use() {
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.enums.Attribute_Use) TYPE.get().getTypeInfo().getProperty( "Use" ).getAccessor().getValue( this );
  }

  public void setUse$( gw.internal.schema.gw.xsd.w3c.xmlschema.enums.Attribute_Use param ) {
    TYPE.get().getTypeInfo().getProperty( "Use" ).getAccessor().setValue( this, param );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( byte[] byteArray ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( byte[] byteArray, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.io.File file ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.io.InputStream inputStream ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.io.InputStream inputStream, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.io.Reader reader ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.lang.String xmlString ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.net.URL url ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url } );
  }

  public static gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.elements.AttributeGroup_Attribute) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url, options } );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2110283714877373226L;

}
