package problems

object ListFlatten {
  def flatten(xs: List[Any]): List[Any] = {
    xs flatMap { x =>
      x match {
        case x: List[_] => flatten(x)
        case e => List(e)
      }
    }
  }
}
