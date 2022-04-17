fun main(args: Array<String>) {

    fun callMe() {
        println("Printing from callMe() function.")
        println("This is cool (still printing from inside).")
    }


    callMe()
    println("Printing outside from callMe() function.")


//    Kotlin Infix Function Call

    val a = true
    val b = false
    var result: Boolean

    result = a or b // a.or(b)
    println("result = $result")

    result = a and b // a.and(b)
    println("result = $result")


//      Kotlin Default Argument

    fun displayBorder(character: Char = '=', length: Int = 15) {
        for (i in 1..length) {
            print(character)
        }
    }


    println("Output when no argument is passed:")
    displayBorder()

    println("\n\n'*' is used as a first argument.")
    println("Output when first argument is passed:")
    displayBorder('*')

    println("\n\n'*' is used as a first argument.")
    println("5 is used as a second argument.")
    println("Output when both arguments are passed:")
    displayBorder('*', 5)

//    Kotlin Recursion (Recursive Function) and Tail Recursion


    fun main(args: Array<String>) {
        val number = 4
        val result: Long

        result = factorial(number)
        println("Factorial of $number = $result")
    }

    fun factorial(n: Int): Long {
        return if (n == 1) n.toLong() else n*factorial(n-1)
    }

//
}