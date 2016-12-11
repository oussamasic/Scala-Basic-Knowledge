import scala.Console

object HelloName {
  def main(args: Array[String]): Unit = {
  	
    println("what is your FirstName : ")
    var firstname = readLine;
    var m :  String = firstname.toString()
    println("what is your LastName : ")
    var lastname = readLine;
    var n :  String = lastname.toString()
    println("Hello Mr  " +m+"  " +n)
  }
}
