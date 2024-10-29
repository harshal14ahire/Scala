import  scala.io.StdIn.{readInt}
object DecimalTOBinaryHexadecimal
{
    def main(args:Array[String])
    {
       print("Enter Number to Convert Into Binary and HexaDecimal:")
       var n =readInt
       println("Binary Number of"+n+" is :")
        toBinary(n)
         println("\nHexadecimal Number of"+n+" is :")
        toHexadecimal(n)
 
    }
    def toBinary( n :Int) : Unit=
    { 
        if(n!=0)
        {
            toBinary(n/2)
            printf("%d",n%2)
        }

        
    }
    def toHexadecimal(n:Int):Unit=
    {
        if(n!=0)
        {
            toHexadecimal(n/16)
            var ch ='A'

            n match{
                case x if(x%16< 10)=>printf("%d",n%16)
                case _ =>printf("%c",(ch+((n%16)-10)))
            }
        }
    }
}