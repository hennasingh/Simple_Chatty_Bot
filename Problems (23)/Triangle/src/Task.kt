import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val side1 = scanner.nextInt()
    val side2 = scanner.nextInt()
    val side3 = scanner.nextInt()

    if (side1 + side2 > side3 && side2 +side3 > side1 && side1 +side3 > side2) {
        println("YES")
    } else {
        println("NO")
    }
}