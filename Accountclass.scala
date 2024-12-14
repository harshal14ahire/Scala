import scala.io.StdIn.{readInt}
import scala.util.control._

class Account{
private var accno:Int=0
private var name:String=""
private var bal:Float=0.0f
private val minbal:Float=0.0f

def this(name:String,bal:Float)
{
   this()
	this.accno=Account.getAccountNumber()
	this.name=name
	this.bal=bal
}

override def toString():String={
return "\nAccount No: "+accno+" Name:"+name+" Balance:"+bal


}
 def viewBal():Float=bal

def deposite(amt:Float):Unit={
 bal+=amt
}

def withdraw(amt:Float) :Boolean=
{
  if(bal-amt<minbal)
   return false
  else
  bal-=amt
  return true
}

def getAccno():Int=accno





}
object Account
{
 var cnt:Int=123455
 def getAccountNumber():Int=
{
    cnt+=1
	return cnt
   
}
}

object Accountclass
{
def main(args:Array[String])
{
  println("How Many Account you want to open:")
  var n=readInt
 var a= new Array[Account](n)
for(i <- 0 to n-1)
{
   println("Enter Name and Opening balance:")
   a(i)= new Account(readLine,readFloat)
    println(a(i))
}

 val outer=new Breaks
 outer.breakable{
 while(true){
  println("\n1:widhraw\n2:deposite\n3:viewBalance: \n 4:Exit")
   println("Enter choice")
   var ch=readInt
   if(ch==4) return//outer.break
 println("Enter Account number:")
  var acno=readInt
 var index=isvalidAccno(a,n,acno)
 if(index == -1)
 println("Account Not Found")
 else
{
 ch match
{
  case 1=>println("Enter amount to withdraw:")
          var amt=readFloat
	if(a(index).withdraw(amt))
	{ 
         println("transaction done")
	}
	else{
          println("insufficent balance")

         }
  case 2=>println("Enter Amount to deposite:")
	a(index).deposite(readFloat)
	println("Amount deposited Successfully")
  case 3=>println("Account Balance is :"+a(index).viewBal())
  case _ => println("Enter valid number")
	

}
}
}
}
}

def  isvalidAccno(a:Array[Account],n:Int,acno:Int):Int=
{
    for(i <- 0 to n-1)
    {
      if(a(i).getAccno()==acno)
	return i
     }
return -1
}
}