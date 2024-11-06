import scala.io.StdIn.{readInt,readFloat,readLine}
import scala.collection.mutable.ListBuffer
class Student
{

    private var id:Int=0
    private var name:String=""
    private var course:String=""

    def this(name:String,course:String)
    {
        this()
        this.id=Student.getcnt()
        this.name=name
        this.course=course
    }
    def setName(name:String):Unit=
    {
        this.name=name
    }
      def setCourse(course:String):Unit=
    {
        this.course=course
    }
    def getId():Int={return id}

    def getName():String={return name}

    def getCourse():String={return course}

    override def toString():String =
    { 
        return s"Student id:$id \t Student Name:$name\t Student Course:$course"
    }
 
 }
object Student
{
    private var cnt:Int= 100
    def getcnt():Int=
    {   cnt=cnt+1
        return cnt
    }
    def getName(arr:Array[Student],cname:String):ListBuffer[String]=
    {
        var myarrList=ListBuffer[String]()
        for(a <- arr)
        {
            if(a.course.equals(cname))
            myarrList+=a.name
        }
        println(myarrList.length)
        return myarrList
    }
}
object Ass16
{
    def main(args:Array[String])
    {
        println("Number of Student:")
        var n=readInt
        var  arr=new Array[Student](n)
        for(i <- 0 to n-1)
        {
            println("Enter Name An Course:")
            arr(i)=new Student(readLine,readLine)

        }
        println("Student details are:")
        for(i <-0 to n-1)
        {
            println(arr(i))
        }
        println("Enter Student Course :") 
        var course=readLine

        var ans:ListBuffer[String]=Student.getName(arr,course)
        if(ans.isEmpty)
        {
          println("no of Student registered for give course..")
        }
        else
        { 
          println(ans)   
        } 
        println("Using Simple Approach...")
        var fg :Boolean=true
        for(i <- 0 to n-1)
        {
            if(arr(i).getCourse().equals(course))
            println(arr(i))
            else fg=false
        }
     if(!fg)
     {
        println("Student with " +course +" not found..")

     }
    } 
}