package gw.internal.gosu.parser.annotation

uses gw.BaseVerifyErrantTest

class MiscAnnotationTest extends BaseVerifyErrantTest {

  function testHasTestClassAnnotationWithInnerClass() {
    var ann = HasTestClassAnnotationWithInnerClass.Type.BackingClass.getMethod( "oknow", {} ).getAnnotation( TestClassAnnotationWithInnerClass )
    assertNotNull( ann )
    assertTrue( ann.expected().SimpleName == "None" )
    assertTrue( ann.timeout() == 0L )
  }

}