package problems

import org.scalatest._

class ListPackSpec extends FlatSpec with Matchers {
  "ListPack pack" should "pack a non-empty list" in {
    ListPack.pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual
      List(
        List('a, 'a, 'a, 'a),
        List('b),
        List('c, 'c),
        List('a, 'a),
        List('d),
        List('e, 'e, 'e, 'e))
    ListPack.pack(List('a, 'a, 'a, 'a)) shouldEqual List(List('a, 'a, 'a, 'a))
  }

  it should "work on an empty list" in {
    ListPack.pack(Nil) shouldEqual Nil
  }
}
