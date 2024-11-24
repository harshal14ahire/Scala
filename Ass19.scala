import scala.io.StdIn._
trait Resizable{
    def reSizeWidth(width:Float):Unit
    def reSizeHight(height:Float):Unit
}

trait Drawable
{
    def draw():Unit
}

class Rectangle(var width:Float,var height:Float) extends Resizable with Drawable
{
    override def toString():String={
        return s"Height:$height\t width:$width"

    }
    def draw():Unit={
        println(" Rectangle is Drawn..")

    }
    def reSizeHight(height:Float):Unit=
    {
        this.height=this.height+height

    }
    def reSizeWidth(width:Float):Unit={
        this.width=this.width+width

    }

}
object Ass19{
    def main(args:Array[String])
    {
        println("Enter widht and Heigth:")
        var r = new Rectangle(readFloat,readFloat)
        println("Original Height And Widht is:"+r)
        r.reSizeHight(3.53f)
        r.reSizeWidth(4.43f)
        println("New Height and Widht is :"+r)
        r.draw()
        
    }
}