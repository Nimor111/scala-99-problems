package problems

import org.scalatest._

class ListLengthSpec extends FlatSpec with Matchers {
  "ListLength" should "return the length of a non-empty list" in {
    ListLength.len(List(1, 2, 3)) shouldEqual 3
  }

  it should "return 0 on empty lists" in {
    ListLength.len(Nil) shouldEqual 0
  }
}
