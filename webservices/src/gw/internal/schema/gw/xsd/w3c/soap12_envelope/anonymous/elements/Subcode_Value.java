package gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Subcode_Value extends gw.xml.XmlElement implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2003/05/soap-envelope", "Value", "soap12" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPEINSTANCETYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.types.simple.QName" );
          }
        };

  public Subcode_Value() {
    this( new gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.QName() );
  }

  public Subcode_Value( gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.QName typeInstance ) {
    super( $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  protected Subcode_Value( javax.xml.namespace.QName qname, gw.lang.reflect.IType type, gw.lang.reflect.IType schemaDefinedTypeInstanceType, gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    super( qname, type, schemaDefinedTypeInstanceType, typeInstance );
  }


  public gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.QName getTypeInstance() {
    //noinspection RedundantCast
    return (gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.QName) super.getTypeInstance();
  }

  public void setTypeInstance( gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.QName param ) {
    super.setTypeInstance( param );
  }


  public javax.xml.namespace.QName getValue() {
    return (javax.xml.namespace.QName) TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().getValue( this );
  }

  public void setValue( javax.xml.namespace.QName param ) {
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, param );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( byte[] byteArray ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( byte[] byteArray, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.io.File file ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.io.InputStream inputStream ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.io.InputStream inputStream, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.io.Reader reader ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.lang.String xmlString ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.net.URL url ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url } );
  }

  public static gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.soap12_envelope.anonymous.elements.Subcode_Value) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url, options } );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -6014282781002754770L;

}
