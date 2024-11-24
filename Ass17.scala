import scala.io.StdIn.{readInt,readFloat,readLine}

class Player (no:Int,name:String,age:Int)
{
override def toString():String={
return s"Pno:$no\tName:$name\tAge:$age"
}

}
class CricketPlayer(no:Int,name:String,age:Int,noinig:Int,batavg:Float,balavg:Float)extends Player (no:Int,name:String,age:Int)
{
   override def toString():String=
   {
     return super.toString()+s"no of innings:$noinig\tBating Avg::$batavg\t balling Avg:$balavg"
   }
  
def getBatAvg():Float={return batavg}
 
}

class FootBallPlayer(no:Int,name:String,age:Int,nogames:Int,goal:Int)extends Player (no:Int,name:String,age:Int)
{

  override def toString():String=
   {
     return super.toString()+s"no of games:$nogames\t goals:$goal"
   }
  
def getGoal():Int={return goal}


}

object Ass17{
def main(args:Array[String])
{
  println("How Many Players Data:")
  var n:Int=readInt
  
  var p=new Array[Player](n)

 for(i <- 0 to n-1)
{
  println("Enter Player P Number, pname, page")
  var pno=readInt
  var pname=readLine
  var page=readInt
  println(" Enter 1 for CricketPlayer 2 for FootBallPlayer")
  var ch=readInt
  if(ch==1)
  {
    println("Enter no of innings, batavg, balavg:")
    p(i) = new CricketPlayer(pno,pname,page,readInt,readFloat,readFloat)
  }
  else if (ch==2){
  println("Enter No of matches played,and no of goals :")
   p(i)= new FootBallPlayer(pno,pname,page,readInt,readInt)
  }
else{println("Please Entter Valid Choice")
    }
 
  }
 println("Cricket Players Having Bating Average >50:")
 for(i  <- 0 to n-1)
  {
    if(p(i).getClass.getName.equals("CricketPlayer") && p(i).asInstanceOf[CricketPlayer].getBatAvg()>50)
{
println(p(i))
}
}
 println("FootBall Player  Players with goals >50:")
 for(i  <- 0 to n-1)
  {
    if(p(i).getClass.getName.equals("FootBallPlayer") && p(i).asInstanceOf[FootBallPlayer].getGoal()>50)
{
println(p(i))
}
}
}
}



 



