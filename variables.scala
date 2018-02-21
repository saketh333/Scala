// Source: https://www.tutorialspoint.com/scala/scala_variables.htm

object Demo {
   def main(args: Array[String]) {
      var myVar :Int = 10;
      val myVal :String = "Hello Scala with datatype declaration.";
      var myVar1 = 20;
      val myVal1 = "Hello Scala new without datatype declaration.";
      val (myVal3, myVal2) = Pair("Hello World", 33); // tuple implementation
      
      println(myVar); println(myVal); println(myVar1); 
      println(myVal1); println(myVal2); println(myVal3)
   }
}
