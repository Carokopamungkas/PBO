interface Animal{
    var Size : String
    var Foots : String
    fun Move(): String

}

class Mammals(override var Size: String, override var Foots: String): Animal {
    var Food = arrayOf("fruits", "meat")
    var Skin = "feather "
    override fun Move(): String = "Run"
}
open class Bird (override var Size: String, override var Foots: String): Animal {
    open var Food = arrayOf("insect", "fish", "grain")
    var Skin = "non feather"
    override fun Move() : String = "fly"
}

class Pinguin(Size: String, Foots: String): Bird(Size,Foots){
    override var Food = arrayOf("Fish")
    override fun Move():String = "fly"
}

fun main(args: Array<String>) {
    println("------Mammals------")
    val A1 = Mammals("Large","medium")
    println("Mammals Size:".plus(A1.Size))
    println("have foots:".plus(A1.Foots))
    println("Foods:".plus(A1.Food.contentToString()))
    println("Skin:".plus(A1.Skin))
    println("Move:".plus(A1.Move()))
    println("-------------------")

    println("-------Birds-------")
    val B1 = Bird("Small","Small")
    println("Brids Size:".plus(B1.Size))
    println("have foots:".plus(B1.Foots))
    println("Foods:".plus(B1.Food.contentToString()))
    println("Skin:".plus(B1.Skin))
    println("Move:".plus(B1.Move()))
    println("-------------------")

    println("-----Pinguin------")
    val C3 = Pinguin("Medium","Small")
    println("Pinguin Size:".plus(C3.Size))
    println("have foots:".plus(C3.Foots))
    println("Foods:".plus(C3.Food.contentToString()))
    println("Skin:".plus(C3.Skin))
    println("Move:".plus(C3.Move()))
    println("-------------------")
}