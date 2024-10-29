import scala.io.StdIn.{readInt}
import scala.collection.mutable.ArrayBuffer


object IntersectionOfTwoArrays
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

         print("How many Numbers in Arr2:")
      val n1=readInt
      var arr2=new Array[Int](n1)
        for(i <- 0 to n1-1)
        {   println("Enter Ele:")
            arr2(i)=readInt
        }
        val arr3 = ArrayBuffer[Int]()
    for (i <- arr1)
     {
      if (arr2.contains(i) && !arr3.contains(i)) 
      {
        arr3 += i  // Add element to arr3 if it's in arr2 and not already in arr3
      }
    }
        println("intersection of Array1 and Array 2:")
        for( i <- arr3)
        {
          println(i)

        }
    }
}