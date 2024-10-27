//scala program to find given number is Armstong or not
import scala.math.pow
import scala.io.StdIn.{readLine}

object ArmstrongNumber{
    def main (args:Array[String])
    {
     println(" Enter no to check is Armstrong or Not:")
      var n =readLine()
     if(isArmstrong(n))
     {
        println(n+"Is Armstrong ...")
     }
     else{
        println(n+" is not Armstrong ...")

     }   

    }
    def isArmstrong(n:String):Boolean={
        val len=n.length
      var n1=n.toInt
      var sum=0
      while(n1!=0)
      {
        var rem=n1%10
        sum=sum+pow(rem,len).toInt
        n1=n1/10
      }
      if(sum==n.toInt)//
      {
        return true
      }

     return false

// sum==n.toInt  one line in concise

    }
}