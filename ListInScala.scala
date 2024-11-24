import scala.collection.immutable.List

object ListInScala{
    def main(args:Array[String])
    {  println("Five Ways to create List in scala")

        println(" 1.Scaala List using uing List Style:")
        var lispstyle= 2::3::4::Nil
        println(lispstyle)

        println("2.List in scala uing range function()")
        var rangelist=List.range(3,49,4)
        println(rangelist)


        println("3.thid way is Uisng the fill() method")
        var filllist=List.fill(5)("shiva")
        println(filllist)
   println("4.List Using tablute() ,method of List")
        var tabulatelist=List.tabulate(11)(n =>n*n)
       println(tabulatelist)

      println("5.like java List() in scala")
     var     javalikelist=List("shuhash","is","going","to","make","billion","dollars","in","10 years")
   
   println(javalikelist)




        
    }
}