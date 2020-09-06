import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var ones =0
    var minus=0
    var zero =0

    repeat(n){
        var value = scanner.nextInt()
        if (value ==0) {
            zero++
        } else if (value == 1) {
            ones++
        } else {
            minus++
        }
    }

    print("${zero} ${ones} ${minus}")
}