package problems

import org.scalatest._

class ListDuplicateSpec extends FlatSpec with Matchers {
  "ListDuplicate duplicate" should "duplicate list elements" in {
    ListDuplicate.duplicate(List('a, 'b, 'c, 'c, 'd)) shouldEqual List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }
}
