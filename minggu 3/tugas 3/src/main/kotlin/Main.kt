class matematika {
    fun tambah (a: Int,b: Int): Int {
        return a + b
    }
    fun kurang (a: Int,b: Int): Int {
        return a - b
    }
    fun kali (a: Int, b: Int): Int {
        return a * b
    }
    fun bagi (a: Double, b: Double): Double {
        return a / b
    }
}
fun main() {
    var matik = matematika()
    println("Hasil dari 20 + 20 = " + matik.tambah(20, 20))
    println("Hasil dari 10 - 5 = " + matik.kurang(10, 5))
    println("Hasil dari 10 * 20 = " + matik.kali(10, 20))
    println("Hasil dari 35 / 2 = " + matik.bagi(35.0, 2.0))

}