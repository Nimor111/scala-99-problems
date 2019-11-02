package problems

import org.scalatest._
import ListRLE._

class ListRLESpec extends FlatSpec with Matchers {
  "ListRLE rle" should "do a run-length encoding of a list" in {
    ListRLE.rle(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List(
      (4, 'a),
      (1, 'b),
      (2, 'c),
      (2, 'a),
      (1, 'd),
      (4, 'e))
  }

  "ListRLE modified rle" should "only copy elements with no duplicates" in {
    ListRLE.rleModified(
      List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List(Tuple(4, 'a), Single('b), Tuple(2, 'c), Tuple(2, 'a), Single('d), Tuple(4, 'e))
  }

  "ListRLE rleDirect" should "work the same as the rle method" in {
    ListRLE.rleDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List(
      (4, 'a),
      (1, 'b),
      (2, 'c),
      (2, 'a),
      (1, 'd),
      (4, 'e))
  }
}
