package problems

object PrimesBetween {
  def prime(n: Int): Boolean = {
    if (n == 1 || n == 0) return false

    (2 until Math.sqrt(n).toInt + 1).toList.foldLeft(true)((acc, e) => {
      if (n % e == 0) {
        return false
      }
      acc
    })
  }

  def primesBetween(n: Int, m: Int): List[Int] = {
    (n until m).toList.foldRight(List[Int]())((e, acc) => if (prime(e)) e :: acc else acc)
  }
}
