import scala.io.StdIn._
object Factorial{
    def main(args:Array[String])
    {
        println("Enter Number to find Factorial:")
        var s=readInt
        var fact=1
        for(i <- 1 to s)
        {
            fact=fact*i;
        }
        println("Facatorial of Number is:"+fact)
    }
}