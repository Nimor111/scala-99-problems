package problems

object ListDuplicate {
  def duplicate[T](xs: List[T]): List[T] = xs.foldRight(List[T]())((e, acc) => e :: e :: acc)
}
