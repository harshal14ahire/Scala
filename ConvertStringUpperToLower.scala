import scala.io.StdIn.{readLine}

object ConvertStringUpperToLower{
    def main(args:Array[String])
    {
            println("Enter String To Convert To Lowercase And Count Number of uppercase Char:")
            var str:String=readLine
            var out:String=""
            var cnt:Int=0
            for(i <- str)
            {
                if(i.isLetter&& i.isUpper)
                {
                    cnt=cnt+1
                 out=out+i.toLower

                }
                else{
                    out =out+i
                }
            }
            printf("%s String After Converting lowerCase:%s",str,out)
            println("Count of UppercaseLetter in Given String is :"+cnt)
            
    }
}