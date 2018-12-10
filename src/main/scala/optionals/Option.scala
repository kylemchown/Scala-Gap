package optionals

object Option {
  def optionalTest1(string1: Option[String]) ={
    string1 match{
      case Some(s) => string1
      case None => "No String was entered"
    }
  }

  def optionalTest2(string1: Option[String] = None) ={
    string1 match{
      case Some(s) => string1
      case None => "No String was entered"
    }
  }

  val optionalVal: Option[String] = Some("qwer")
}
