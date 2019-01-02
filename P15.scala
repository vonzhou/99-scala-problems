// P15 (**) Duplicate the elements of a list a given number of times.
//     Example:
//     scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
//     res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)

object P15 {
  def duplicateN[A](n: Int, ls: List[A]): List[A] =
    ls flatMap {
      //      List.make(n, _)
      List.fill(n)(_)
    }
}

val lst = List('a, 'b, 'c, 'c, 'd)
P15.duplicateN(3, lst)