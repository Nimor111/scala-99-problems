package problems

import scala.annotation.tailrec

object ListKth {
  @tailrec def kth[T](k: Int, list: List[T]): Option[T] = {
    if (list.length == 0) {
      return None
    }

    if (k == 0) {
      return Some(list(k))
    }

    kth(k - 1, list.tail)
  }
}
