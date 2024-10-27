import scala.io.StdIn.{readInt}

object RangeInScalaDemo{
    def main (args:Array[String])
    {
        println(" Enter Lower limit :")
        var l=readInt
        println(" Enter upper limit :")
        var u=readInt
        println(" Enter incremetor limit :")
        var i=readInt
         val rvar=Range(l,u,i)
        println("first var is :"+rvar(0))
       println("Last ele :"+rvar.last)

       println("iteration over variable:")
       for(i <- rvar)
        {
            print(i+" ")
        }
    }
}