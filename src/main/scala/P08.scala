
object P08 {
  // Standard recursive.
  def compressRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => h :: compressRecursive(tail.dropWhile(_ == h))
  }

  // Tail recursive.
  def compressTailRecursive[A](ls: List[A]): List[A] = {
    def compressR(result: List[A], curList: List[A]): List[A] = curList match {
      case h :: tail => compressR(h :: result, tail.dropWhile(_ == h))
      case Nil => result.reverse
    }

    compressR(Nil, ls)
  }

  // Functional.
  def compressFunctional[A](ls: List[A]): List[A] =
    ls.foldRight(List[A]()) { (h, r) =>
      if (r.isEmpty || r.head != h) h :: r
      else r
    }


  def main(args: Array[String]): Unit = {
    val lst1 = List(1, 1, 2, 1, 3, 4)
    lst1.dropWhile(_ == 1)

    val lst = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(compressRecursive(lst))
    println(compressTailRecursive(lst))
    println(compressFunctional(lst))
  }
}


