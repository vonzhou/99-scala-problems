// P12 (**) Decode a run-length encoded list.
//     Given a run-length code list generated as specified in problem P10,
//     construct its uncompressed version.
//
//     Example:
//     scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
//     res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

object P12 {
  def decode[A](ls: List[(Int, A)]): List[A] =
  // @deprecated("use `fill' instead", "2.8.0")
  //    ls flatMap { e => List.make(e._1, e._2) }
    ls flatMap { e => List.fill(e._1)(e._2) }
}

val lst = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
P12.decode(lst)