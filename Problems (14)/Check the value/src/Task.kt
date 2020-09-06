import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val input = scanner.nextInt()
    if(input > 0 && input < 10){
        println(true)
    }else{
        println(false)
    }
}