
import scala.io.StdIn.{readInt,readLine}

object ArrayInScala{
      def main (args:Array[String])
      {
        println("Enter n IN IN Scala:")
        var n=readInt
        var arr=new Array[Int](n)
        for(i <- 0 to n-1)
        {   println("Enter Ele:")
            arr(i)=readInt
        }
        /*   var strarr=new Array[String](n)
        
        for(i <- 0 to n-1)
        {   println("Enter String:")
            strarr(i)=readLine
        }
     
        for(i <- arr )
        {
            print(i+" " )

        }

        
        for(j <- strarr )
        {
            print(j+" " )
        }
        var farr= Array(24.34,65.43,65.34)
*/
         for(j <- arr )
        {
            print(j+" " )
      
        }
        // 2D Array in scala..
        val  mulDim=  Array.ofDim[Int](2,2)
         for(j <- 0 to 1)
        {
           for(i <- 0 to 1 )
        {println("Enter A"+j+i+"Ele")
            mulDim(j)(i)=readInt
        }
        
        }

           for(j <- 0 to 1)
        {
           for(i <- 0 to 1 )
        {
            println(mulDim(j)(i))//=readInt
        }
        }
        //generic Array in scala
        var genarr= new Array[Any](3)
        genarr(0)="abc"
        genarr(1)=3.45
        genarr(2)=353
         println("All data of generic Array:")
        for(i <- genarr)
        {
            println(i)
         
        }
        }
      
}