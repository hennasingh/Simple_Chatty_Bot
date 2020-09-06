import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    val input1 = scanner.next().first()
    val input2 = scanner.next().first()
    val input3 = scanner.next().first()

    if (input1 + 1 == input2 && input1 + 2 == input3) {
        println(true)
    } else {
        println(false)
      }
}