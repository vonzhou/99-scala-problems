
object P07 {
  def flatten(ls: List[Any]): List[Any] = ls flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }

  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4)
    var res = list1.flatMap(x => List(x))
    println(res)


    val list2 = List(List(1, 1), 2, List(3, List(5, 8)))
    val res2 = flatten(list2)
    println(res2)
  }
}




