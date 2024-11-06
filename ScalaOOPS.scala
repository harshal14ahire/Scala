import scala.io.StdIn.{readInt,readLine}

class Student(val name:String,val rollno:Int){
 
      override def toString():String=
    {
    return s"Name of Student :$name \t Roll Number:$rollno"

    }
   /* def getMarks():Float={
        println("How many Stubjects:")
        var n=readInt
        var arr = new Array[Float](n)


        println("Enter Mark:")
        arr(i)=readFloat

      }
      return (arr.sum/500)*100
      //println("percentage of All Subject id:="+avg)
    }
*/
    

}
 
object ScalaOOPS{
    def main(args:Array[String])
    {
        println("How No of Student :")
        var n:Int=readInt

      
        var studnet =new Array[ Student](n)
        for( i <- 0 to n-1)
        {   println("Enter Name of Student and Rollno:")
            studnet(i)=new Student(readLine,readInt)
            
        
        }
         for( i <- 0 to n-1)
        println("Student info is:"+studnet(i))
        //println("Percentag of "+studnet.getMarks())
    }

}