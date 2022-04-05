//1. Arithmetic Operators

//Arithmetic Operators

//fun main(args: Array<String>) {
//
//    val number1 = 12.5
//    val number2 = 3.5
//    var result: Double
//
//    result = number1 + number2
//    println("number1 + number2 = $result")
//
//    result = number1 - number2
//    println("number1 - number2 = $result")
//
//    result = number1 * number2
//    println("number1 * number2 = $result")
//
//    result = number1 / number2
//    println("number1 / number2 = $result")
//
//    result = number1 % number2
//    println("number1 % number2 = $result")
//}

//Concatenation of Strings

//fun main(args: Array<String>) {
//
//    val start = "Talk is cheap. "
//    val middle = "Show me the code. "
//    val end = "- Linus Torvalds"
//
//    val result = start + middle + end
//    println(result)
//}
//

//2. Assignment Operators

//Assignment Operators

//fun main(args: Array<String>) {
//    var number = 12
//
//    number *= 5   // number = number*5
//    println("number  = $number")
//}


//3. Unary prefix and Increment / Decrement Operators

//Unary Operators

fun main(args: Array<String>) {
    val a = 1
    val b = true
    var c = 1

    var result: Int
    var booleanResult: Boolean

    result = -a
    println("-a = $result")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")
}


//4. Comparison and Equality Operators

//Comparison and Equality Operators

//fun main(args: Array<String>) {
//
//    val a = -12
//    val b = 12
//
//    // use of greater than operator
//    val max = if (a > b) {
//        println("a is larger than b.")
//        a
//    } else {
//        println("b is larger than a.")
//        b
//    }
//
//    println("max = $max")
//}

//5. Logical Operators

//Logical Operators

//fun main(args: Array<String>) {
//
//    val a = 10
//    val b = 9
//    val c = -1
//    val result: Boolean
//
//    // result is true is a is largest
//    result = (a>b) && (a>c) // result = (a>b) and (a>c)
//    println(result)
//}

//6. in Operator

//in Operator

//fun main(args: Array<String>) {
//
//    val numbers = intArrayOf(1, 4, 42, -3)
//
//    if (4 in numbers) {
//        println("numbers array contains 4.")
//    }
//}

//7. Index access Operator

//Index access Operator

fun main(args: Array<String>) {

    val a  = intArrayOf(1, 2, 3, 4, - 1)
    println(a[1])
    a[1]= 12
    println(a[1])
}