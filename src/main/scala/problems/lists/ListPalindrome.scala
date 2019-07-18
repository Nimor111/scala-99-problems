package problems

object ListPalindrome {
  def palindrome[T](list: List[T]): Boolean = {
    list match {
      case Nil => true
      case List(x) => true
      case x :: xs => x == xs.last && palindrome(xs.take(xs.length - 1))
    }
  }
}
