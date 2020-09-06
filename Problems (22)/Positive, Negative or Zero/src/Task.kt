import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val input = scanner.nextInt()

    if (input < 0){
        println("negative")
    } else if(input ==0) {
        println("zero")
    } else {
        println("positive")
    }
}