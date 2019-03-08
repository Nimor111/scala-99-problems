package problems

import org.scalatest._

class ListKthSpec extends FlatSpec with Matchers {
  "The ListKth object" should "return kth element of list" in {
    ListKth.kth(1, List(1, 2, 3)) shouldEqual Some(2)
  }

  it should "return None on larger k than list" in {
    ListKth.kth(7, List(1, 2, 3)) shouldEqual None
  }

  it should "return None on empty List" in {
    ListKth.kth(5, List()) shouldEqual None
  }
}
