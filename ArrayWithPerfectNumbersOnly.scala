import scala.io.StdIn.{readInt}

object ArrayWithPerfectNumbersOnly
{
    def  main(args:Array[String])
    {
      print("How many Numbers:")
      val n=readInt
      var perfectArray=new Array[Int](n)
      for(i <-  0 to n-1)
      {
        println(" Enter Number:")
        var ele=readInt
        var sum=0
        for(i <- 1 to ele/2)
        {
            if(ele%i==0) 
            sum=sum+i

        }
        if(sum==ele)
        perfectArray=ele +:perfectArray
      }
println("Array of Perfect Numbers Only...")
  for(i <- perfectArray)
  { 
    if(i!=0)
    println(i)
  }
    }
}