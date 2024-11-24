import scala.io.StdIn._

object Ass23 {
    def lowerCaseCharToUpperCase(ch:Char):Char={
        if(ch.isLower)
        {
            return ch.toUpper
        }
        return ch
    }
    def main(args:Array[String])
    {
        println("Enter YOur String to COnver lowercase Char to Upper case Char:")
           var str=readLine
           println("Yore resultant string is:="+str.map(lowerCaseCharToUpperCase))
           

    }
}