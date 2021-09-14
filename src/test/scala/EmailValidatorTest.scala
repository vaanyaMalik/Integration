import Company.Knoldus.Validators.EmailValidator
import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {
  "Company Name" should "exits" in{
    val obj =new EmailValidator()
    // Checks that Email is valid or not valid
    assert(obj.isValid("xyz@gmail.com")==true)
    assert(obj.isValid("philips123@gmail.com")==true)
    assert(obj.isValid("knoldus@gmail.com")==true)
    assert(obj.existInDb("xyz@gmail.com")==false)
    assert(obj.existInDb("philips123@gmail.com")==false)
    assert(obj.existInDb("knoldus@gmail.com")==true)

  }
}

