import scala.io.StdIn.{readInt}

object MatrixAddition{
    def main(args:Array[String])
     {
        println("Accepting Dimetion of Matrix A:=")
        println("Enter Dimetion of MAtrix A(M x N):")
        var m:Int=readInt
        var n:Int=readInt

        println("Accepting Dimetion of Matrix B:=")
        println("Enter Dimetion of MAtrix B(M x N):")
        var m1:Int=readInt
        var n1:Int=readInt

        if(m1!=m&& n!=n1)
       { println("Matrix Addtion IS not Possible..")
        sys.exit(0)
       }
       var mat1= Array.ofDim[Int](m,n)
       var mat2= Array.ofDim[Int](m1,n1)
      println("Enter Elements of Matrix:A:=")
      for( i <- 0 to m-1)
      {
        for(j <- 0 to n-1)
        {
            println("Enter A["+(i+1)+(j+1)+"]")
            mat1(i)(j)=readInt
        }
      }

        println("Enter Elements of Matrix:B:=")
      for( i <- 0 to m1-1)
      {
        for(j <- 0 to n1-1)
        {
            println("Enter A["+(i+1)+(j+1)+"]")
            mat2(i)(j)=readInt
        }
      }
        
      var res=Array.ofDim[Int](m1,n1)
         
        for( i <- 0 to m1-1)
      {
        for(j <- 0 to n1-1)
        {
            res(i)(j)=mat1(i)(j)+mat2(i)(j)
        }
      }
     

     println("Addition Of MAtrix A+B is  :")
      for( i <- 0 to m1-1)
      {
        for(j <- 0 to n1-1)
        {
            print(res(i)(j)+" " )
            
        }
        println()
      }

       var res1=Array.ofDim[Int](m1,n1)
         
        for( i <- 0 to m1-1)
      {
        for(j <- 0 to n1-1)
        {
            res(i)(j)=0
            for(k <- 0 to n1-1)
            {
                res1(i)(j)+=mat1(j)(k)*mat2(k)(j)
           }
      }
      }

    println("Multiplication Of MAtrix AxB is  :")
      for( i <- 0 to m1-1)
      {
        for(j <- 0 to n1-1)
        {
            print(res1(i)(j)+" " )
            
        }
        println()
      }
  }
}