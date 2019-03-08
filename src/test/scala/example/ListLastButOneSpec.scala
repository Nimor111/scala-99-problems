package problems

import org.scalatest._

class ListLastButOneSpec extends FlatSpec with Matchers {
  "The ListLastButOne object" should "return before last element of list" in {
    ListLastButOne.lastButOne(List(1, 1, 2, 3, 5, 8)) shouldEqual Some(5)
  }

  it should "return None on empty listor list with one elem" in {
    ListLastButOne.lastButOne(List()) shouldEqual None
    ListLastButOne.lastButOne(List(1)) shouldEqual None
  }
}
