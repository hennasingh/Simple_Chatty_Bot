import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val input1 = scanner.next().single()

    if (input1.isUpperCase() || input1.isDigit() && input1 != '0') {
        println(true)
    } else {
        println(false)
    }
}