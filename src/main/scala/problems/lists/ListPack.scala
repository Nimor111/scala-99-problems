package problems

object ListPack {
  def eqList[T](xs: List[T], x: T): List[T] = xs.foldLeft(List[T]())((acc, e) => if (e == x) e :: acc else return acc)

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case List(x) => List(List(x))
    case x :: y :: ys => {
      if (x == y) {
        val equals = eqList(x :: y :: ys, x)
        equals :: pack(ys.drop(equals.length - 2))
      } else {
        List(x) :: pack(y :: ys)
      }
    }
  }
}
