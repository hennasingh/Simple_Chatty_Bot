import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val input1 = scanner.next().first()
    val input2 = scanner.next().first()

   if (input1 - 32 == input2 || input1 + 32 == input2) {
       println("true")
   } else {
       println("false")
     }

   }
