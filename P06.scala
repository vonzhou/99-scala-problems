// P06 (*) Find out whether a list is a palindrome.
//     Example:
//     scala> isPalindrome(List(1, 2, 3, 2, 1))
//     res0: Boolean = true

object P06 {
  // In theory, we could be slightly more efficient than this.  This approach
  // traverses the list twice: once to reverse it, and once to check equality.
  // Technically, we only need to check the first half of the list for equality
  // with the first half of the reversed list.  The code to do that more
  // efficiently than this implementation is much more complicated, so we'll
  // leave things with this clear and concise implementation.
  def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse

  def isPalindrome2[A](ls: List[A]): Boolean = {
    if (ls.isEmpty)
      false
    for (i <- 0 to ls.length / 2) {
      if (ls(i) != ls(ls.length - 1 - i))
        false
    }
    true
  }
}


val list = List(1, 2, 3, 2, 1)
P06.isPalindrome(list)
P06.isPalindrome2(list)