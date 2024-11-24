import scala.io.StdIn._

abstract class Shape(dim1:Float,dim2:Float,dim3:Float)
{

    def area():Float
    def perimeter():Float
    def volume():Float
    final val pi=3.142f

}
class Circle (dim1:Float) extends Shape(dim1,0.0f,0.0f)
{
    def area:Float= pi*dim1*dim1
    def perimeter:Float=2*pi*dim1
    def volume:Float=0.0f

}
class Rectangle(dim1:Float,dim2:Float) extends Shape(dim1,dim2,0.0f)
{

     def area:Float= (dim1*dim2)
    def perimeter:Float=2*(dim2+dim1)
    def volume:Float=0.0f

}

class Cone(dim1:Float,dim2:Float,dim3:Float) extends Shape(dim1,dim2,dim3)
{
     def area:Float=pi*dim1* (dim1*dim3)// πr(r+l)
    def perimeter:Float=0.0f
    def volume:Float=0.33f*pi*dim1*dim1*dim2//  =>1/3 pi r^2h   
}

object Ass18{
    def main(Args:Array[String])
    {
        println("Enter radius of circle:")
        var r=readFloat
        var c= new Circle(r)
        println("Area of circle:"+c.area())
        println("perimeter of circle:"+c.perimeter())

        println("Enter Lengeth(width),breadth(height) of rectnagle")
        var rec=new Rectangle(readFloat,readFloat)
          println("Area of Rectangle:"+rec.area())
        println("perimeter of perimeter:"+rec.perimeter())

        println("Enter radius ,Height,length of cone:")
        var cone= new Cone(readFloat,readFloat,readFloat)
        println("Aread of Cone:"+cone.area())
        println("Vloume of cone is:"+cone.volume())
        


    }

}
