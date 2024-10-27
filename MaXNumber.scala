import scala.io.StdIn.{readInt}
object MaXNumber{
    def main(args:Array[String])
    {
        println("Enter Three Number to check Maximum ")
        var a=readInt
        var b=readInt
        var c= readInt
        var  max= if(a>b && a>c) c else  if(b>a && b>c) b else c
        println(" Maximum Number between three is:"+max);
        
    }
}