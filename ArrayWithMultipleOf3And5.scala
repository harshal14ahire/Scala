import scala.io.StdIn.{readInt}
import scala.collection.mutable.ArrayBuffer


object ArrayWithMultipleOf3And5
{
    def  main(args:Array[String])
    {
      print("How many Numbers in Arr1:")
      val n=readInt
      var arr1=new Array[Int](n)
        for(i <- 0 to n-1)
        {   println("Enter Ele:")
            arr1(i)=readInt
        }

         var arr3=arr1.filter(_ % 3==0)
       arr3= arr3.filter(_ % 5==0)   
       println("array number with multiple of 3,5:")
        for( i <- arr3)
        {
           println(i)
        }
        
        }
}