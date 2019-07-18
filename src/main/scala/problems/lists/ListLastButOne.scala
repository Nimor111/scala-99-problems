package problems

object ListLastButOne {
  def lastButOne[T](list: List[T]): Option[T] = {
    list match {
      case List() => None
      case List(x) => None
      case List(x, _) => Some(x)
      case _ :: xs => lastButOne(xs)
    }
  }
}
