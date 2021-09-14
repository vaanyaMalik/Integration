
import Company.Knoldus.Validators.CompanyValidator
import Company.Knoldus.Models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {
  "Company Name" should "exits" in{
    // Company should not already exist in the Database
    val companyObject = new CompanyValidator()
    val company =new Company("OnePlus","xyz@gmail.com","pune");
    assert(companyObject.companyIsValid(company)==false)
  }
}