package gw.internal.gosu.parser.classTests.gwtest.modifiers
uses gw.testharness.DoNotVerifyResource

@DoNotVerifyResource
class ErrantClassDoesNotDeclareOverrideOnOverriddenFunction extends BaseOverrideModierTestClass
{
  function foo()
  {
  }
}