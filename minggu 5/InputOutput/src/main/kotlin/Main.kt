//Output

//fun main(args : Array<String>) {
//    println("Kotlin is interesting.")
//}

//print() and println()

fun main(args : Array<String>) {
    println("1. println ");
    println("2. println ");

    print("1. print ");
    print("2. print");
}

//Print Variables and Literals

fun main(args : Array<String>) {
    val score = 12.3

    println("score")
    println("$score")
    println("score = $score")
    println("${score + score}")
    println(12.3)
}

//Input

//Print String Entered By the User

fun main(args: Array<String>) {
    print("Enter text: ")

    val stringInput = readLine()!!
    println("You entered: $stringInput")
}

//Getting Integer Input from the User

//import java.util.Scanner
//
//fun main(args: Array<String>) {
//
//    // Creates an instance which takes input from standard input (keyboard)
//    val reader = Scanner(System.`in`)
//    print("Enter a number: ")
//
//    // nextInt() reads the next integer from the keyboard
//    var integer:Int = reader.nextInt()
//
//    println("You entered: $integer")
//}