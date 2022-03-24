//fun main() {
//    println("Hello World")
//}

//fun main() {
//    println(3 + 3)
//}

// This is a comment
//fun main() {
//    println("Hello World")
//}

//fun main() {
//    var name = "John" // String
//    val birthyear = 1975 // Int
//    println(name)
//    println(birthyear)
//}

//fun main() {
//    val myNum = 5               // Int
//    val myDoubleNum = 5.99      // Double
//    val myLetter = 'D'          // Char
//    val myBoolean = true        // Boolean
//    val myText = "Hello"        // String
//    println(myNum)
//    println(myDoubleNum)
//    println(myLetter)
//    println(myBoolean)
//    println(myText)
//}

//fun main() {
//    var sum1 = 100 + 50        // 150 (100 + 50)
//    var sum2 = sum1 + 250      // 400 (150 + 250)
//    var sum3 = sum2 + sum2     // 800 (400 + 400)
//    println(sum1)
//    println(sum2)
//    println(sum3)
//}

//fun main() {
//    var name: String
//    name = "John"
//    println(name)
//}

//fun main() {
//    val isKotlinFun: Boolean = true
//    val isFishTasty: Boolean = false
//    println(isKotlinFun)   // Outputs true
//    println(isFishTasty)   // Outputs false
//}

//fun main() {
//    if (20 > 18) {
//        println("20 is greater than 18")
//    }
//}

//fun main() {
//    val time = 20
//    if (time < 18) {
//        println("Good day.")
//    } else {
//        println("Good evening.")
//    }
//}

//fun main() {
//    val day = 4
//
//    val result = when (day) {
//        1 -> "Monday"
//        2 -> "Tuesday"
//        3 -> "Wednesday"
//        4 -> "Thursday"
//        5 -> "Friday"
//        6 -> "Saturday"
//        7 -> "Sunday"
//        else -> "Invalid day."
//    }
//    println(result)
//}

//fun main() {
//    var i = 0
//    while (i < 5) {
//        println(i)
//        i++
//    }
//}

//fun main() {
//    var i = 0;
//    do {
//        println(i)
//        i++
//    }
//    while (i < 5)
//}

//fun main() {
//    var i = 0
//    while (i < 10) {
//        println(i)
//        i++
//        if (i == 4) {
//            break
//        }
//    }
//}

//fun main() {
//    var i = 0
//    while (i < 10) {
//        if (i == 4) {
//            i++
//            continue
//        }
//        println(i)
//        i++
//}
//}

//fun main() {
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    println(cars[0])
//}

//fun main() {
//    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
//    for (x in cars) {
//        println(x)
//    }
//}


//fun main() {
//    for (nums in 5..15) {
//        println(nums)
//    }
//}


//fun myFunction() {
//    println("I just got executed!")
//}
//
//fun main() {
//    myFunction()
//}




// Kotlin Classes and Objects
//class Car {
//    var brand = ""
//    var model = ""
//    var year = 0
//}
//
//fun main() {
//    val c1 = Car()
//    c1.brand = "Ford"
//    c1.model = "Mustang"
//    c1.year = 1969
//
//    println(c1.brand)
//    println(c1.model)
//    println(c1.year)
//}


//Constructors
//class Car {
//    var brand = ""
//    var model = ""
//    var year = 0
//}
//
//fun main() {
//    val c1 = Car()
//    c1.brand = "Ford"
//    c1.model = "Mustang"
//    c1.year = 1969
//
//    println(c1.brand)
//    println(c1.model)
//    println(c1.year)
//}



//Class Functions
//class Car(var brand: String, var model: String, var year: Int) {
//    // Class function
//    fun drive() {
//        println("Wrooom!")
//    }
//}
//
//fun main() {
//    val c1 = Car("Ford", "Mustang", 1969)
//
//    // Print property values
//    println(c1.brand + " " + c1.model + " " + c1.year)
//
//    // Call the function
//    c1.drive()
//}




//Inheritance

// Superclass
open class MyParentClass {
    val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x) // x is defined in the superclass
    }
}

// Create an object of the MyChildClass and call myFunction
fun main() {
    val myObj = MyChildClass()
    myObj.myFunction()
}




