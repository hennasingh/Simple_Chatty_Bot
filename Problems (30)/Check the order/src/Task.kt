import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val times = scanner.nextInt()
    var first = scanner.nextInt()
    val output = "YES"


    repeat(times-1) {
        val number = scanner.nextInt()
        if (first < number) {
            first = number
        } else {
            return println("NO")
        }
    }
    println(output)
}