package problems

import scala.annotation.tailrec

object ListReverse {
  def reverse[T](list: List[T]): List[T] = {
    @tailrec
    def reverse[T](list: List[T], xs: List[T]): List[T] = {
      list match {
        case Nil => xs
        case l :: ls => reverse(ls, l :: xs)
      }
    }

    reverse(list, Nil)
  }
}
