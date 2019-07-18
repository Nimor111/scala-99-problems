package problems

import org.scalatest._

class ListRlESpec extends FlatSpec with Matchers {
  "ListRLE rle" should "do a run-length encoding of a list" in {
    ListRLE.rle(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List(
      (4, 'a),
      (1, 'b),
      (2, 'c),
      (2, 'a),
      (1, 'd),
      (4, 'e))
  }
}
