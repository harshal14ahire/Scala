import scala.io.StdIn.{readLine}
import scala.collection.mutable.ListBuffer

class Account{
  private var accno:Int=0
  private var name:String=""
  private var bal:Float=0.0
  private val minbal=500.0f
  def this( name:String , bal:Float)
	{
	this()
	this.accno=Account.getAccNo()
	this.name=name
	this.bal=bal
	}
 def viewBal():Float=bal

def deposite(amt:Float):Unit=
{
bal+=amt
 
}

def widraw( amt:Float):Boolean=
{
  if(bal-amt<minbal)
  return false
  else
{
    bal = bal-amt
} 
}

 def getAccNo():Int=
{
return accno
}

override def toString():String={
return "Account Number:"+accno+"Name of Account Holder:"+name+"Balance in Account is:"+bal


}

object Account
{
  var cnt=12355632
 def getAccNo():Int=
{
cnt+=1 
return cnt
}
}


object practiclProgram
{
	def main(args:Array[String])
	{
   println("How many Account you want to open:")
   var n=readInt
  var a= new Array[Account](n)
   for(i <- 0 to n-1)
  {
        println("Enter name and opening Bal:")
	a(i)= new Account(readLine,readFloat)
	println(a(i))
  }	

					
}
}