fun main(args: Array<String>) {

//    Kotlin Class and Object

    class Lamp {

        // property (data member)
        private var isOn: Boolean = false

        // member function
        fun turnOn() {
            isOn = true
        }

        // member function
        fun turnOff() {
            isOn = false
        }

        fun displayLightStatus(lamp: String) {
            if (isOn == true)
                println("$lamp lamp is on.")
            else
                println("$lamp lamp is off.")
        }
    }


    val l1 = Lamp() // create l1 object of Lamp class
    val l2 = Lamp() // create l2 object of Lamp class

    l1.turnOn()
    l2.turnOff()

    l1.displayLightStatus("l1")
    l2.displayLightStatus("l2")

//    Kotlin Constructors
    class Person(val firstName: String, var age: Int) {

    }
    val person1 = Person("Joe", 25)

    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")


    //    Kotlin Getters and Setters
    fun main(args: Array<String>) {

        val p = Person()
        p.name = "jack"
        println("${p.name}")
    }

    class Person {
        var name: String = "defaultValue"

            get() = field

            set(value) {
                field = value
            }



    //  Kotlin Inheritance
    open class Person(age: Int, name: String) {
        init {
            println("My name is $name.")
            println("My age is $age")
        }
    }

        class MathTeacher(age: Int, name: String): Person(age, name) {

            fun teachMaths() {
                println("I teach in primary school.")
            }
        }

        class Footballer(age: Int, name: String): Person(age, name) {
            fun playFootball() {
                println("I play for LA Galaxy.")
            }
        }

        fun main(args: Array<String>) {
            val t1 = MathTeacher(25, "Jack")
            t1.teachMaths()

            println()

            val f1 = Footballer(29, "Christiano")
            f1.playFootball()
        }

    // Kotlin Abstract Class
    abstract class Person(name: String) {

        init {
            println("My name is $name.")
        }

        fun displaySSN(ssn: Int) {
            println("My SSN is $ssn.")
        }

        abstract fun displayJob(description: String)
    }

        class Teacher(name: String): Person(name) {

            override fun displayJob(description: String) {
                println(description)
            }
        }


            val jack = Teacher("Jack Smith")
            jack.displayJob("I'm a mathematics teacher.")
            jack.displaySSN(23123)


    // Kotlin Interfaces
    interface MyInterface {

        // property with implementation
        val prop: Int
            get() = 23
    }

        class InterfaceImp : MyInterface {
            // class body
        }


            val obj = InterfaceImp()
            println(obj.prop)

    // Kotlin Nested and Inner Class
    class Outer {

        val a = "Outside Nested class."

        class Nested {
            val b = "Inside Nested class."
            fun callMe() = "Function call from inside Nested class."
        }
    }


            // accessing member of Nested class
            println(Outer.Nested().b)

            // creating object of Nested class
            val nested = Outer.Nested()
            println(nested.callMe())


    // Kotlin Data Class
    data class User(val name: String, val age: Int)


            val jack = User("jack", 29)
            println("name = ${jack.name}")
            println("age = ${jack.age}")


    // Kotlin Sealed Classes
    sealed class Expr
        class Const(val value: Int) : Expr()
        class Sum(val left: Expr, val right: Expr) : Expr()
        object NotANumber : Expr()


        fun eval(e: Expr): Int =
            when (e) {
                is Const -> e.value
                is Sum -> eval(e.right) + eval(e.left)
                NotANumber -> java.lang.Double.NaN
            }

    //    Kotlin Object Declarations and Expressions

        object Test {
            private var a: Int = 0
            var b: Int = 1

            fun makeMe12(): Int {
                a = 12
                return a
            }
        }


            val result: Int

            result = Test.makeMe12()

            println("b = ${Test.b}")
            println("result = $result")


    //Kotlin Companion Objects

        class Person {
            companion object Test {
                fun callMe() = println("I'm called.")
            }
        }


            Person.callMe()

    //Kotlin Extension Function
    fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)


            val myString= "Hello Everyone"
            val result = myString.removeFirstLastChar()
            println("First character is: $result")



}




