package problems

import org.scalatest._

class ListLastSpec extends FlatSpec with Matchers {
  "The ListLastElem object" should "return last element of list" in {
    ListLast.last(List(1, 1, 2, 3, 5, 8)) shouldEqual Some(8)
  }

  it should "return None on empty list" in {
    ListLast.last(List()) shouldEqual None
  }
}
