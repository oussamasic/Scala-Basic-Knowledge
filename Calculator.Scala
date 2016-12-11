import scala.Console

object Calculator {
  def main(args: Array[String]): Unit = {
  	
    println("please tape")
    println("choose  1 to use the Calculator")
    println("choose  0 to exit ")
     var test = Console.readInt
     if(test==0) {println("By By")} 
     while(test!=0) {
    println("choose an operation : tape a number")
    println("choose  1 for : +")
    println("choose  2 for : -")
    println("choose  3 for : /")
    println("choose  4 for : *")
    
    var operation = Console.readInt;
   
   if(operation>4) {println("no operation")}
   else {
     println("tape the first number ")
      var a = Console.readDouble
      println("tape the second number ")
      var b = Console.readDouble
     
if(operation==1) {var c = a+b; println("the result is  " +c)}
if(operation==2) {var c = a-b; println("the result is  " +c)}
if(operation==3) {var c = a/b;
if(b==0) {println("impossible operation !!");
println("tape the second number ")
      var d = Console.readDouble
      var r = a/d;
       println("the result is  " +r)
       } else { println("the result is  " +c)} }
if(operation==4) {var c = a*b; println("the result is  " +c)}

}
  
}
}
}
