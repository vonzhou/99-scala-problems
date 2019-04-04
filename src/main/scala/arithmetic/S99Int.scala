package arithmetic

/**
  * @author vonzhou
  * @date 2019/4/4
  */
class S99Int(val start: Int) {

  import S99Int._

  def isPrime: Boolean =
    (start > 1) && !(2 to scala.math.sqrt(start).toInt).exists(x => start % x == 0)

  def isCoprimeTo(n: Int): Boolean = isPrime && new S99Int(n).isPrime

  def totient: Int = (1 to start) filter { start.isCoprimeTo(_) } length


}

object S99Int {
  implicit def int2S99Int(i: Int): S99Int = new S99Int(i)

  def gcd(m: Int, n: Int): Int = if (n == 0) m else gcd(n, m % n)


  def main(args: Array[String]): Unit = {
    //    println(1.isPrime)
    //    println(7.isPrime)

//    println(gcd(8, 3))
//    println(gcd(1, 1))

    println(1 to 6)
  }

}
