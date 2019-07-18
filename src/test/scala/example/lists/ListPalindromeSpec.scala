package problems

import org.scalatest._

class ListPalindromeSpec extends FlatSpec with Matchers {
  "ListPalindrome" should "return true for a palindrome" in {
    ListPalindrome.palindrome(List(1, 2, 3, 3, 2, 1)) shouldEqual true
  }

  it should "return true for empty list" in {
    ListPalindrome.palindrome(Nil) shouldEqual true
  }

  it should "return true for one element list" in {
    ListPalindrome.palindrome(List(1)) shouldEqual true
  }

  it should "return false for non palindrome" in {
    ListPalindrome.palindrome(List(1, 2, 3)) shouldEqual false
  }
}
