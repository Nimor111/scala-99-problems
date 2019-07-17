package problems

import org.scalatest._

class ListReverseSpec extends FlatSpec with Matchers {
  "ListReverse" should "return a non-empty list reversed" in {
    ListReverse.reverse(List(1, 2, 3)) shouldEqual List(3, 2, 1)
  }

  it should "return same list on empty list" in {
    ListReverse.reverse(Nil) shouldEqual Nil
  }
}
