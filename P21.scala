// P21 (*) Insert an element at a given position into a list.
//     Example:
//     scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
//     res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)

object P21 {
  def insertAt[A](e: A, n: Int, ls: List[A]): List[A] = ls.splitAt(n) match {
    case (pre, post) => pre ::: e :: post
  }
}

val list1 = List(1, 2)
val list2 = List(3, 4)

val a = list1 :: list2
val b = list1 ::: list2

P21.insertAt('new, 1, List('a, 'b, 'c, 'd))