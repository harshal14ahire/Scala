import scala.io.StdIn.{readInt}
import scala.math.BigInt


object FatorialOfNumber{
    def main(args:Array[String])
    {
        println("Enter Number to Find Factorial:")
        val n:Int=readInt
        println("Factorial of Number uing Recursion is:"+calculateFactorial(n))
          }
   def calculateFactorial( n: Int):BigInt={
    if(n==0)
     1;
    else{
        n*calculateFactorial(n-1)
    }
   }
}