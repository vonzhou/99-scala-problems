
object P03 {
  // use lib function `ls`
  def nthBuiltin[A](n: Int, ls: List[A]): A =
    if (n >= 0) ls(n)
    else throw new NoSuchElementException

  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    println(nthBuiltin(2, list))
    println(nthRecursive(2, list))
  }
}

