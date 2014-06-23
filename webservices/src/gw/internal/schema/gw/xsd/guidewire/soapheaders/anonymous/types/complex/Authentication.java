package gw.internal.schema.gw.xsd.guidewire.soapheaders.anonymous.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Authentication extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Password = new javax.xml.namespace.QName( "http://guidewire.com/ws/soapheaders", "password", "gwsoap" );
  public static final javax.xml.namespace.QName $ELEMENT_QNAME_Username = new javax.xml.namespace.QName( "http://guidewire.com/ws/soapheaders", "username", "gwsoap" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.guidewire.soapheaders.anonymous.types.complex.Authentication" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public Authentication() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected Authentication( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public java.lang.String Password() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Password" ).getAccessor().getValue( this );
  }

  public void setPassword$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Password" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.guidewire.soapheaders.anonymous.elements.Authentication_Password Password_elem() {
    return (gw.internal.schema.gw.xsd.guidewire.soapheaders.anonymous.elements.Authentication_Password) TYPE.get().getTypeInfo().getProperty( "Password_elem" ).getAccessor().getValue( this );
  }

  public void setPassword_elem$( gw.internal.schema.gw.xsd.guidewire.soapheaders.anonymous.elements.Authentication_Password param ) {
    TYPE.get().getTypeInfo().getProperty( "Password_elem" ).getAccessor().setValue( this, param );
  }


  public java.lang.String Username() {
    return (java.lang.String) TYPE.get().getTypeInfo().getProperty( "Username" ).getAccessor().getValue( this );
  }

  public void setUsername$( java.lang.String param ) {
    TYPE.get().getTypeInfo().getProperty( "Username" ).getAccessor().setValue( this, param );
  }


  public gw.internal.schema.gw.xsd.guidewire.soapheaders.anonymous.elements.Authentication_Username Username_elem() {
    return (gw.internal.schema.gw.xsd.guidewire.soapheaders.anonymous.elements.Authentication_Username) TYPE.get().getTypeInfo().getProperty( "Username_elem" ).getAccessor().getValue( this );
  }

  public void setUsername_elem$( gw.internal.schema.gw.xsd.guidewire.soapheaders.anonymous.elements.Authentication_Username param ) {
    TYPE.get().getTypeInfo().getProperty( "Username_elem" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = -6229229505065566777L;

}
