//abstract class List[+T] {
//
//  def map[U](f: T => U): List[U] = this match {
//    case x :: xs => f(x) :: xs.map(f)
//    case Nil => Nil
//  }
//}

// List of ints
val x = List(1, 2, 3, 4, 4, 4, 5)

x.head
x.tail
x.slice(0, 3)
x.distinct

// Set of ints
val y = Set(1, 3, 5, 7)
y.seq
var ys = Set("a", "b", "c", "c", "d")
ys.seq
ys.++(List(1, 2))
ys.&(Set(5, 6))