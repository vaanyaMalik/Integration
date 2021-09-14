import Company.Knoldus.Validators.Divide
import org.scalatest.funsuite.AnyFunSuite

class DivideTest extends  AnyFunSuite{
  val someOperation = new Divide
  test("do something")
  {
    val expectedResult = 4
    val result = {
      someOperation.divide(8, 2);
    }
    assert(result == expectedResult)
  }
}
