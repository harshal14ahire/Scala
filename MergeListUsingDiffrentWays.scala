import scala.collection.immutable.List

object MergeListUsingDiffrentWays{
    def main(args:Array[String])
    {
        var list1= List("banna","apple","black berry","blue berry")
        var list2=List("lily","lotus","rose")
        println("Concation of list1 and list2 by ++"+(list1 ++ list2))

        println("Concation of list1 and list2 by ++"+(list1 ::: list2))

     println("Concation of list1 and list2 by List.concat()++"+List.concat(list1,list2))

     println("sorting list1 by ascending order:"+list1.sortWith(_<_))
     println("sorting list1 by descending order:"+list1.sortWith(_>_))

}
}