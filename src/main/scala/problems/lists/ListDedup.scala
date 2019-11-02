package problems

object ListDedup {
  def dedup[T](xs: List[T]): List[T] = xs match {
    case Nil => Nil
    case List(x) => List(x)
    case x :: y :: ys => {
      if (x == y) {
        dedup(y :: ys)
      } else {
        x :: dedup(y :: ys)
      }
    }
  }
}
