package problems

object ListRLE {
  def rle[T](xs: List[T]): List[(Int, T)] =
    ListPack.pack(xs).map(e => (e.length, e.head))

  sealed trait RLEElement[T]
  case class Tuple[T](count: Int, value: T) extends RLEElement[T]
  case class Single[T](value: T) extends RLEElement[T]

  def rleModified[T](xs: List[T]): List[RLEElement[T]] =
    ListPack
      .pack(xs)
      .map(
        x =>
          x match {
            case List(x) => Single(x)
            case x :: xs => Tuple((x :: xs).length, x)
          })

  def rleDirect[T](xs: List[T]): List[(Int, T)] = xs match {
    case Nil => Nil
    case head :: _ => {
      val (eqList, rest) = xs.span(_ == head)
      (eqList.length, head) :: rleDirect(rest)
    }
  }
}
