package problems

object ListLength {
  def len[T](list: List[T]): Int = {
    list match {
      case Nil => 0
      case _ :: xs => 1 + len(xs)
    }
  }
}
