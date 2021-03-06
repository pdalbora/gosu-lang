package gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class TBinding_Operation extends gw.xml.XmlElement implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Name = new javax.xml.namespace.QName( "", "name", "" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Documentation = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "documentation", "wsdl" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Fault = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "fault", "wsdl" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Input = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "input", "wsdl" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Output = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "output", "wsdl" );
  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://schemas.xmlsoap.org/wsdl/", "operation", "wsdl" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPEINSTANCETYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.wsdl.types.complex.TBindingOperation" );
          }
        };

  public TBinding_Operation() {
    this( new gw.internal.schema.gw.xsd.w3c.wsdl.types.complex.TBindingOperation() );
  }

  public TBinding_Operation( gw.internal.schema.gw.xsd.w3c.wsdl.types.complex.TBindingOperation typeInstance ) {
    super( $QNAME, TYPE.get(), TYPEINSTANCETYPE.get(), typeInstance );
  }

  protected TBinding_Operation( javax.xml.namespace.QName qname, gw.lang.reflect.IType type, gw.lang.reflect.IType schemaDefinedTypeInstanceType, gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType typeInstance ) {
    super( qname, type, schemaDefinedTypeInstanceType, typeInstance );
  }


  public gw.internal.schema.gw.xsd.w3c.wsdl.types.complex.TBindingOperation getTypeInstance() {
    //noinspection RedundantCast
    return (gw.internal.schema.gw.xsd.w3c.wsdl.types.complex.TBindingOperation) super.getTypeInstance();
  }

  public void setTypeInstance( gw.internal.schema.gw.xsd.w3c.wsdl.types.complex.TBindingOperation param ) {
    super.setTypeInstance( param );
  }


  public gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation Documentation() {
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation) TYPE.get().getTypeInfo().getProperty( "Documentation" ).getAccessor().getValue( this );
  }

  public void setDocumentation$( gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TDocumented_Documentation param ) {
    TYPE.get().getTypeInfo().getProperty( "Documentation" ).getAccessor().setValue( this, param );
  }


  public java.util.List<gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Fault> Fault() {
    //noinspection unchecked
    return (java.util.List<gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Fault>) TYPE.get().getTypeInfo().getProperty( "Fault" ).getAccessor().getValue( this );
  }

  public void setFault$( java.util.List<gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Fault> param ) {
    TYPE.get().getTypeInfo().getProperty( "Fault" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Input Input() {
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Input) TYPE.get().getTypeInfo().getProperty( "Input" ).getAccessor().getValue( this );
  }

  public void setInput$( gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Input param ) {
    TYPE.get().getTypeInfo().getProperty( "Input" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Name() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Name" ).getAccessor().getValue( this );
  }

  public void setName$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Name" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Output Output() {
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Output) TYPE.get().getTypeInfo().getProperty( "Output" ).getAccessor().getValue( this );
  }

  public void setOutput$( gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBindingOperation_Output param ) {
    TYPE.get().getTypeInfo().getProperty( "Output" ).getAccessor().setValue( this, param );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( byte[] byteArray ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( byte[] byteArray, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( byte[].class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { byteArray, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.io.File file ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.io.File file, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.File.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { file, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.io.InputStream inputStream ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.io.InputStream inputStream, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.InputStream.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { inputStream, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.io.Reader reader ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.io.Reader reader, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.io.Reader.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { reader, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.lang.String xmlString ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.lang.String xmlString, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.lang.String.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { xmlString, options } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.net.URL url ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url } );
  }

  public static gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation parse( java.net.URL url, gw.xml.XmlParseOptions options ) {
    //noinspection RedundantArrayCreation
    return (gw.internal.schema.gw.xsd.w3c.wsdl.anonymous.elements.TBinding_Operation) TYPE.get().getTypeInfo().getMethod( "parse", gw.lang.reflect.TypeSystem.get( java.net.URL.class ), gw.lang.reflect.TypeSystem.get( gw.xml.XmlParseOptions.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { url, options } );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -6050492648119042255L;

}
