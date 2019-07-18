package problems

import org.scalatest._

class ListDedupSpec extends FlatSpec with Matchers {
  "ListDedup dedup" should "remove duplicates" in {
    ListDedup.dedup(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List('a, 'b, 'c, 'a, 'd, 'e)
    ListDedup.dedup(List('a, 'a, 'a, 'a, 'a)) shouldEqual List('a)
    ListDedup.dedup(List('a)) shouldEqual List('a)
  }

  it should "work on empty lists" in {
    ListDedup.dedup(Nil) shouldEqual Nil
  }
}

