import scala.io.StdIn._
import scala.util.control._

class Account {
    private var accno: Int = 0
    private var name: String = ""
    private val minbal: Float = 500.0f 
    private var bal: Float = 0.0f

    
    def this(accno: Int, name: String, bal: Float) { 
        this()
        this.accno = accno
        this.name = name
        this.bal = bal
    }

    def viewBalance(): Float = bal 

    def deposit(newbal: Float): Unit = { 
        bal = bal + newbal
    }

    def withdraw(amt: Float): Boolean = {
        if (bal - amt < minbal) {
            false // Fixed "false" typo (was "flase")
        } else {
            bal = bal - amt
            true
        }
    }

    override def toString: String = { 
        s"AccNo: $accno\nName: $name\nBalance: $bal"
    }

    def getAccno(): Int = accno
}

object Ass15 {
    def main(args: Array[String]): Unit = {
        var cnt = 100
        println("Enter the Number OF Accounts to be opened:")
        var n = readInt()
        var arr = new Array[Account](n)

        for (i <- 0 until n)
         { 
            println("Enter Account Holder Name & Opening Balance:")
            val name = readLine()
            val openingBalance = readFloat()
            arr(i) = new Account(cnt + i, name, openingBalance)
            println("Congratulations! Your Account Has Been Opened.")
            println(arr(i))
        }

        val outer = new Breaks
        val inner = new Breaks

 
        outer.breakable
         {
            while (true) 
            {
                println("1: Withdraw, 2: Deposit, 3: View Balance, 4: Exit\n")
                println("Enter your choice:")
                val ch = readInt()

                if (ch == 4) outer.break()

                println("Enter Account number to perform Transaction:")
                var accno = readInt()
                var index = -1

                inner.breakable
                 {
                    for (i <- 0 until n) 
                    {
                        if (arr(i).getAccno() == accno) 
                        {
                            index = i
                            inner.break
                        }
                    }
                 }
                    if (index == -1) 
                    {
                        println("Account Not Found.")
                    } else {
                        ch match {
                            case 1 =>
                                println("Enter Amount to withdraw:")
                                val amt = readFloat()
                                if (arr(index).withdraw(amt))
                                    println("Transaction successful.")
                                else
                                    println("Insufficient Balance.")

                            case 2 =>
                                println("Enter Amount to deposit:")
                                val amt = readFloat()
                                arr(index).deposit(amt)
                                println("Amount Deposited.")

                            case 3 =>
                                println("Your Account Balance is: " + arr(index).viewBalance())

                            case _ =>
                                println("Invalid choice. Please try again.")
                        }
                    }
                
            }
        }
    }
}
