
object P01 {
  // use built-in function
  def lastBuiltin[A](ls: List[A]): A = ls.last

  // recursive and pattern matching
  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil => h
    case _ :: tail => lastRecursive(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val list = List(1, 1, 2, 3, 5, 8)
    var a = lastBuiltin(list)
    println(a)
    a = lastRecursive(list)
    println(a)
  }
}

