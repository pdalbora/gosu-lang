package gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class UnsignedShort extends gw.internal.schema.gw.xsd.w3c.xmlschema.types.simple.UnsignedInt implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "http://www.w3.org/2001/XMLSchema", "unsignedShort", "xs" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.types.simple.UnsignedShort" );
          }
        };
  private static final gw.util.concurrent.LockingLazyVar<java.lang.Object> SCHEMAINFO = new gw.util.concurrent.LockingLazyVar<java.lang.Object>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected java.lang.Object init() {
            gw.lang.reflect.IType type = TYPE.get();
            return getSchemaInfoByType( type );
          }
        };

  public UnsignedShort() {
    super( TYPE.get(), SCHEMAINFO.get() );
  }

  protected UnsignedShort( gw.lang.reflect.IType type, java.lang.Object schemaInfo ) {
    super( type, schemaInfo );
  }

  public UnsignedShort( java.lang.Integer value ) {
    this();
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, value );
  }


  @Deprecated
  public java.lang.Long getValue$$gw_xsd_w3c_xmlschema_types_simple_UnsignedInt() {
    return super.getValue$$gw_xsd_w3c_xmlschema_types_simple_UnsignedInt();
  }

  @Deprecated
  public void setValue$$gw_xsd_w3c_xmlschema_types_simple_UnsignedInt( java.lang.Long param ) {
    super.setValue$$gw_xsd_w3c_xmlschema_types_simple_UnsignedInt( param );
  }

  public java.lang.Integer getValue$$gw_xsd_w3c_xmlschema_types_simple_UnsignedShort() {
    return (java.lang.Integer) TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().getValue( this );
  }

  public void setValue$$gw_xsd_w3c_xmlschema_types_simple_UnsignedShort( java.lang.Integer param ) {
    TYPE.get().getTypeInfo().getProperty( "$Value" ).getAccessor().setValue( this, param );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2110283714877373226L;

}
