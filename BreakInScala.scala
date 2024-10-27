import scala.util.control.Breaks
import scala.util.control.Breaks._
object BreakInScala{
    def main(args:Array[String])
    {  println("breaking loop using break() method")
       Breaks.breakable{
        for(i <- 0 to 10)
        {
            if(i<=5)
            {
                println(i)
                } 
                else{   
                     break()
                }
        }

       }

        println(" breaking above with an instance of the Breaks class")
        val loop = new Breaks
            loop.breakable 
            {
              for(i <- 0 to 10)
              {
                 if(i<=5)
                {
                println(i )
                 }
                    else {
                         loop.break()
                        }
            
                }
            }


    }
}