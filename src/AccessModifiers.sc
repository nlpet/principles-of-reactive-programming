/*
 * Private members:
 * A private member is visible only inside the class or
 * object that contains the member definition
 */
class Outer {
  class Inner {
    private def f() { println("f") }
    class InnerMost {
      f() // OK
    }
  }
  //(new Inner).f() // Error
}

/*
 * Protected members
 * A protected member is only accessible from subclasses of
 * the class in which the member is defined.
 */
class Super {
  protected def f() { println("f") }
}
class Sub extends Super {
  f() // OK
}
class OuterSnd {
  // (new Super).f() // Error
}


/*
 * Scope of protection:
 * Access modifiers in Scala can be augmented with qualifiers.
 * A modifier of the form private[X] or protected[X] means that
 * access is private or protected "up to" X, where X designates
 * some enclosing package, class or singleton object.
 */
package building {
  package room {
    class Locker {
      private[building] val rooms = null
      private[room] val furniture = null
      private[this] val contents = null

      def help(another : Locker) {
        println(another.rooms)
        println(another.contents) //ERROR
      }
    }
  }
}