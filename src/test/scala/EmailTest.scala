
import Company.Knoldus.Validators.Email
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.mockito.MockitoSugar

class EmailTest extends  AnyFunSuite with MockitoSugar{
  val someOperation = new Email
  test("String")
  {
    val expectedResult = true;
    val result = someOperation.containsNoSpecialChars("Xnmpy@.net");
    val results = someOperation.containsNoSpecialChars("Xmabc987@.net");
    assert(result == expectedResult)
    assert(results == expectedResult)
  }


}
