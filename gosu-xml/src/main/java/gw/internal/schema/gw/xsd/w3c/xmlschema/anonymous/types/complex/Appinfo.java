package gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.types.complex;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Appinfo extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $ATTRIBUTE_QNAME_Source = new javax.xml.namespace.QName( "", "source", "" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.anonymous.types.complex.Appinfo" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public Appinfo() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected Appinfo( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }


  public java.net.URI Source() {
    return (java.net.URI) TYPE.get().getTypeInfo().getProperty( "Source" ).getAccessor().getValue( this );
  }

  public void setSource$( java.net.URI param ) {
    TYPE.get().getTypeInfo().getProperty( "Source" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2110283714877373226L;

}
