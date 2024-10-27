//ass3 print 1 to n numbers those are divisible by 3,5;
import scala.io.StdIn.{readInt}
object NumberPrint1N{
    def  main(args:Array[String])
    {
        println(" Enter Value of N")
        val n=readInt()
       for(i <- 1 to n if (i%3==0 && i%5==0))
       {
        println(i)
       
       }
       println("Second Method in scala")
       for(i <- 1 to n)
       {
        val num=i match{
            case i if(i%3==0 && i%5==0)=> i.toString
            case _ =>" "
        }
    
        print(num+"")

       }
        
     val out = for { j <- 1 to n if j % 3 == 0 && j % 5 == 0 } yield j
System.out.println("Your numbers that are divisible by 5 and 3: " + out)

    }
}

