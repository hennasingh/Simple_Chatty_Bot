import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val classOne = scanner.nextInt()
    var desksOne = classOne/2
    if(classOne % 2 != 0) desksOne+=1

    val classTwo = scanner.nextInt()
    var desksTwo = classTwo/2
    if(classTwo % 2 != 0) desksTwo+=1

    val classThree = scanner.nextInt()
    var desksThree = classThree/2
    if(classThree % 2 != 0) desksThree+=1

    val total = desksThree + desksTwo + desksOne

    println(total)
}