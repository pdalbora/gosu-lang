package gw.internal.gosu.compiler.sample.statement.classes.inner

class InnerCanImplInnerInterface
{
  function makeInner() : Inner
  {
    return new Inner()
  }

  interface IFoo
  {
    function innerInterface1() : String
    function innerInterface2() : Number
  }

  class Inner implements IFoo
  {
    function innerInterface1() : String
    {
      return "1"
    }

    function innerInterface2() : Number
    {
      return 2
    }
  }
}