import scala.io.StdIn.{readLine,readChar}

object StringCharReplacement
{
    def main(args:Array[String])
    {
        println("Enter String:")
        var str:String=readLine
        println("Enter Char")
        var ch:Char=readChar
        var cnt:Int=0
        for(i <- str;if ch==i)
        cnt=cnt+1

        var out=if(ch.isDigit)str.replace(ch,'*')
                else if(ch.isLetter)str.replace(ch,'?')
                else str.replace(ch,'@')
        println("Count of given Character inf given String is :"+cnt)
        println("Resultant String is :"+out)
                
        
    }

}


