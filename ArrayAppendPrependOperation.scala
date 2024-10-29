import scala.io.StdIn._
object ArrayAppendPrependOperation{
    def main(args:Array[String])
    {
        println("How many Elements :")
        var n =readInt
        var arr1=new Array[Int](n)
         for(i <- 0 to n-1)
        {   println("Enter Ele:")
            arr1(i)=readInt
        }
        println("Enter Number you want to Append  int Array1:")
        var ele=readInt
        arr1= arr1:+ele
        println("Afther Appending Number to Array ")
         for(i <- arr1)
        {  
             println(i)
            
        }
         println("How many Elements  Array 2:")
        var n1 =readInt
        var arr2=new Array[Int](n1)
         for(i <- 0 to n1-1)
        {   println("Enter Ele:")
            arr2(i)=readInt
        }

      arr1= arr1 ++ arr2 // append arr2 to arr1

        println("Afther Appending Array2 to Array1 ")
         for(i <- arr1)
        {  
             println(i)
            
        }

         println("Enter Number you want to prepend  int Array1:")
        var ele1=readInt
        arr1=ele1+:arr1
        println("Afther prepending Number to Array ")
         for(i <- arr1 )
        {  
             println(i)
            
        }


        println("How many Elements  Array 2:")
        var n3 =readInt
        var arr3=new Array[Int](n3)
         for(i <- 0 to n3-1)
        {   println("Enter Ele:")
            arr3(i)=readInt
        }
         arr1=arr3++:arr1 // prepending pend arr3 to arr1

       println("Afther prepending Array3 to Array1 ")
         for(i <- arr1)
        {  
             println(i)
            
        }


    }
}