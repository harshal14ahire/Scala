import scala.util.control.Breaks
import scala.util.control.Breaks._
import scala.io.StdIn.{readInt}

object CheckNumberPrime
{
    def main(args :Array[String])
    {
        println("How many Numbers :")
        var n=readInt

       val outer =new Breaks
       outer.breakable
       {
          for( i <- 1 until n)
          {
            println("Enter "+i +" Number")
            var ele=readInt
            
            if(ele <=1 )
            outer.break
            else if(ele==2|| ele==3)
            println(ele)
            if(ele%2==0)
            outer.break
            else
            {
                val inner =new Breaks
                inner.breakable{
                    for(j <- 2 until ele/2)
                    {
                        if(ele%j==0)
                        outer.break

                    }
                    println(ele)
                }
            }            
          }
       }
    }
}

