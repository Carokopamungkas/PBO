fun main(args: Array<String>) {

    //Programiz if expresion

    val number = -10

    val result = if (number > 0) {
        "Positive number"
    } else {
        "Negative number"
    }

    println(result)

    //when Expression
    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("$operator is invalid")
    }

    //while Loop

    var i = 1

    while (i <= 5) {
        println("Line $i")
        ++i
    }

    //do...while Loop

    var sum: Int = 0
    var input: String

    do {
        print("Enter an integer: ")
        input = readLine()!!
        sum += input.toInt()

    } while (input != "0")

    println("sum = $sum")

    //break

    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }


}