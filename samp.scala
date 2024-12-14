import scala.io.StdIn._
import scala.util.control._
import scala.math.pow
import scala.collection.mutable.ArrayBuffer

object samp{
def main(args:Array[String])
{	println("Enter the String :")
	var s=readLine
	var cnt=0
	
	println("Enter char:")
	var ch=readChar

	for(i <- s;if i==ch)
	{
	cnt=cnt+1
		
	}
	var out=if(ch.isLetter)s.replace(ch,'?') else if(ch.isDigit)s.replace(ch,'*') else s.replace(ch,'@')

	println(" New stirng =:")
	println(out)
	println("occurances of char:"+cnt)
}
}

