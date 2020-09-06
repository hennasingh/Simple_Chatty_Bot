import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var max =0

    val n = scanner.nextInt()
    repeat(n){
        val next = scanner.nextInt()
        if (next%4 ==0) {
            max = maxOf(max, next)
        }
    }
    println(max)
}