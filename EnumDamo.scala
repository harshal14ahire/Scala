

object  EnumDamo extends Enumeration{
    type EnumDamo =Value

    val pi=Value("3.142")
    val gc=Value("9.8")
    def main ( args:Array[String])
    {
        println("Value of PI through Enum in Scala "+EnumDamo.pi)
    }
}