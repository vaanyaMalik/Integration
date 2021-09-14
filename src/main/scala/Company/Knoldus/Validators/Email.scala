package Company.Knoldus.Validators

class Email{

  def containsNoSpecialChars(string: String): Boolean = {
    val pattern = "^[a-zA-Z0-9@.]*$".r
    val w = pattern.findAllIn(string).mkString.length == string.length
    val x = string.contains("@");
    val segments = string.split("@")
    // Grab the last segment
    val document = segments(segments.length - 1)
    val y = pattern.findAllIn(document).mkString.length == document.length
    val z = string.contains(".com") | string.contains(".net") | string.contains(".org");
    val a =  w & x & y;
    return a;
  }

}
