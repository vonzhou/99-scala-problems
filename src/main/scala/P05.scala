
object P05 {
  def reverseBuiltin[A](ls: List[A]): List[A] = ls.reverse

  // Simple recursive.  O(n^2)
  def reverseRecursive[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => reverseRecursive(tail) ::: List(h)
  }

  // Tail recursive.
  def reverseTailRecursive[A](ls: List[A]): List[A] = {
    def reverseR(result: List[A], curList: List[A]): List[A] = curList match {
      case Nil => result
      case h :: tail => reverseR(h :: result, tail)
    }

    reverseR(Nil, ls)
  }

  // Pure functional
  def reverseFunctional[A](ls: List[A]): List[A] =
    ls.foldLeft(List[A]()) { (r, h) => h :: r }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(reverseBuiltin(list))
    println(reverseRecursive(list))
    println(reverseTailRecursive(list))
    println(reverseFunctional(list))
  }
}



