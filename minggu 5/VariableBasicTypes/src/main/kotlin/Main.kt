//1. Byte
//fun main(args : Array<String>) {
//    val range: Byte = 112
//    println("$range")
//
//    // The code below gives error. Why?
//    // val range1: Byte = 200
//}

2. Short
fun main(args : Array<String>) {

    val temperature: Short = -11245
    println("$temperature")
}

3. Int
fun main(args : Array<String>) {

    val score: Int =  100000
    println("$score")
}

4. Long
fun main(args : Array<String>) {

    // score is of type Int
    val score = 10
    println("$score")
}

5. Double

fun main(args : Array<String>) {

    // distance is of type Double
    val distance = 999.5
    println("$distance")
}

Float

fun main(args : Array<String>) {

    // distance is of type Float
    val distance = 19.5F
    println("$distance")
}

fun main(args : Array<String>) {

    var test: Number = 12.2
    println("$test")

    test = 12
    // Int smart cast from Number
    println("$test")

    test = 120L
    // Long smart cast from Number
    println("$test")
}

Char

fun main(args : Array<String>) {

    val letter: Char
    letter = 'k'
    println("$letter")
}

Boolean

fun main(args : Array<String>) {

    val flag = true
    println("$flag")
}