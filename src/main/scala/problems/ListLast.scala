package problems

object ListLast {
  def last[T](list: List[T]): Option[T] = {
    list match {
      case List() => None
      case List(x) => Some(x)
      case _ :: xs => last(xs)
    }
  }
}
