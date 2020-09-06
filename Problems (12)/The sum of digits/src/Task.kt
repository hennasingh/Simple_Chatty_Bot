import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var input = scanner.nextInt()
    val hundreds_input = input / 100
    val remainder = input % 100
    val tens_input = remainder /10
    val ones_input = remainder % 10

    println("${hundreds_input + tens_input + ones_input}")


}