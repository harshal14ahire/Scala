// program to find avrage of number from in interval n1 to n2

import scala.io.StdIn.{readInt,readFloat}
object AverageOfNumberBetwwenRange{
    def main(args:Array[String])
    {
        println(" enter n1 orlb:")
        val n1:Int=readInt
        println("Enter ub or n2:")
        val n2:Int=readInt
        
        if(n1<n2)
        {
            var sum=0
           for(i <- n1 to n2)
           {
            sum=sum+i
           }
           var avg=sum/(n2-n1+1).toFloat
           println("Average of Number in betwwen n1 to n2:is="+avg)
        }
        else{
              var sum=0
           for(i <- n2 to n1)
           {
            sum=sum+i
           }
           var avg=sum/(n1-n2+1).toFloat
           println("Average of Number in betwwen n1 to n2:is="+avhjg)

        }
    }
}