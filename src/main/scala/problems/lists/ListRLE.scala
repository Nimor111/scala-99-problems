package problems

object ListRLE {
  def rle[T](xs: List[T]): List[(Int, T)] = ListPack.pack(xs).map(e => (e.length, e.head))
}
