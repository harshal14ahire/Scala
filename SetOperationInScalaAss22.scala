import scala.collection.mutable.Set


object SetOperationInScalaAss22{
    def main(args:Array[String])
    {
        var s1= Set(1,2,3,4)
        var s2= Set(7,9,0)
        println("Set 1:="+s1)
        println("Set 2:="+s2)
        // adding Element to Set uing +=
       s1+=6
       println("Afther Adding 6 uing += to Set1:="+s1)

       // adding element in set by add method
       s1.add(7)
       println("Afther Adding 7 uing add() method to Set1:="+s1)
       // adding sequence of Elements in Set uing ++=
       s2++=List(11,34,9,43)
        println("Afther Adding List(11,34,9,4) sequence to s2  using ++= -"+s2)
        // set intersection opetration in scala using intersect() method

        println("Intersection of Set s1,and Set s2 is:"+s1.intersect(s2))
        
    }
}