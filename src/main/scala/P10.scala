
object P10 {
  def encode[A](ls: List[A]): List[(Int, A)] =
    P09.pack(ls) map { e => (e.length, e.head) }

  def main(args: Array[String]): Unit = {
    val lst = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    println(encode(lst))
  }
}


