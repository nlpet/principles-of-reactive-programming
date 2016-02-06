object test {

  /*
   * Test case pattern matching
   */
  val f: String => Integer = {
    case "a" => 1
    case "b" => 2
  }
  f("a")
  f("b")
  // f("c") // Fail


  /*
   * Test partial functions
   */
  val g: PartialFunction[String, String] = {
    case "a" => "A"
    case "b" => "B"
  }

  g.isDefinedAt("a")
  g.isDefinedAt("b")
  g.isDefinedAt("c")


  val h: PartialFunction[List[Int], String] = {
    case Nil => "one"
    case x :: y :: rest => "two"
  }

  h.isDefinedAt(List(1, 2, 3))
  h.isDefinedAt(List())
  h.isDefinedAt(List(1))
}

