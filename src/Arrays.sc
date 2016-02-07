import Array._

object Test {

  def main(): Unit = {
    val lst = List(1, 2, 3, 4, 5, 6, 7)

    for (x <- lst) {
      // println(x)
    }

    // printf("Sum of list: %d", sum(lst))

    var max = lst.head
    for (i <- 1 until lst.length) {
      if (lst(i) > max) max = lst(i)
    }
    println(s"Max of lst is $max")

    // Multi-dimensional arrays
    val matrix = Array.ofDim[Int](3,3)
    var v = 0
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        matrix(i)(j) = v
        v += 1
      }
    }

    print2DArray(matrix, "2D Array:")


    val l1 = Array(9, 8, 7)
    val l2 = Array(4, 5, 6)
    val l3 = concat(l1, l2)
    printArray(l3, "Concatenated two arrays:")
  }

  def sum(xs: List[Int]): Int = {
    xs match {
      case x :: tail => x + sum(tail)
      case Nil => 0
    }
  }

  def printArray[T](xs: Array[T], msg: String): Unit = {
    println(msg)
    for (x <- xs) {
      print(" " + x)
    }
    println()
  }

  def print2DArray[T](xs: Array[Array[T]], msg: String): Unit = {
    println(msg)
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + xs(i)(j))
      }
      println()
    }
  }

  main()
}
