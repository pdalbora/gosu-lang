package gw.internal.schema.gw.xsd.w3c.xmlschema.anonymous.attributes;

/***************************************************************************/
/* THIS IS AUTOGENERATED CODE - DO NOT MODIFY OR YOUR CHANGES WILL BE LOST */
/* THIS CODE CAN BE REGENERATED USING 'xsd-codegen'                        */
/***************************************************************************/
public class Element_Type implements gw.internal.xml.IXmlGeneratedClass {

  public static final javax.xml.namespace.QName $QNAME = new javax.xml.namespace.QName( "", "type", "" );
  public static final gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType> TYPE = new gw.util.concurrent.LockingLazyVar<gw.lang.reflect.IType>( gw.lang.reflect.TypeSystem.getGlobalLock() ) {
          @Override
          protected gw.lang.reflect.IType init() {
            return gw.lang.reflect.TypeSystem.getByFullName( "gw.xsd.w3c.xmlschema.anonymous.attributes.Element_Type" );
          }
        };

  private Element_Type() {
  }

  public static gw.xml.XmlSimpleValue createSimpleValue( javax.xml.namespace.QName value ) {
    //noinspection RedundantArrayCreation
    return (gw.xml.XmlSimpleValue) TYPE.get().getTypeInfo().getMethod( "createSimpleValue", gw.lang.reflect.TypeSystem.get( javax.xml.namespace.QName.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { value } );
  }

  public static void set( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType anyType, javax.xml.namespace.QName value ) {
    //noinspection RedundantArrayCreation
    TYPE.get().getTypeInfo().getMethod( "set", gw.lang.reflect.TypeSystem.get( gw.internal.schema.gw.xsd.w3c.xmlschema.types.complex.AnyType.class ), gw.lang.reflect.TypeSystem.get( javax.xml.namespace.QName.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { anyType, value } );
  }

  public static void set( gw.xml.XmlElement element, javax.xml.namespace.QName value ) {
    //noinspection RedundantArrayCreation
    TYPE.get().getTypeInfo().getMethod( "set", gw.lang.reflect.TypeSystem.get( gw.xml.XmlElement.class ), gw.lang.reflect.TypeSystem.get( javax.xml.namespace.QName.class ) ).getCallHandler().handleCall( null, new java.lang.Object[] { element, value } );
  }

  @SuppressWarnings( {"UnusedDeclaration"} )
  private static final long FINGERPRINT = 2110283714877373226L;

}
