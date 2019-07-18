package problems

import org.scalatest._

class ListFlattenSpec extends FlatSpec with Matchers {
  "ListFlatten flatten" should "flatten a non-empty list" in {
    ListFlatten.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldEqual List(
      1, 1, 2, 3, 5, 8)
  }

  it should "work on empty lists" in {
    ListFlatten.flatten(Nil) shouldEqual Nil
  }

  it should "not change already flattened list" in {
    ListFlatten.flatten(List(1, 2, 3, 4)) shouldEqual List(1, 2, 3, 4)
  }
}
