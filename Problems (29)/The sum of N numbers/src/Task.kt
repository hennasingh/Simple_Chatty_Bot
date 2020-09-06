import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var n = scanner.nextInt()
    var sum = 0

    for (i in 1..n) {
        var number = scanner.nextInt()
        sum += number
    }
    println(sum)
}