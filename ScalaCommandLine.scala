
object ScalaCommandLine{
    def main (args:Array[String])
    {     var sum=0
        for(arg <- args)
        {
            sum=sum+arg.toInt

        }
        print("Sum is:="+sum)
        
    }

}
