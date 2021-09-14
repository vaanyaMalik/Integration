import Company.Knoldus.Validators.Fibonacci
import org.scalatest.funsuite.AnyFunSuite

class FibonacciTest extends AnyFunSuite {
  val o = new Fibonacci
  test("Fibo")
  {
    val ExpectedResult = 21
    val ExpectedResults = 34
    val result = o.fib1(8)
    val results = o.fib1(9)
    assert(result == ExpectedResult)
    assert(results == ExpectedResults)
  }


}
