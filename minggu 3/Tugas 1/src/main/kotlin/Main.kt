class Mobil2 {
    var warna = ""
    var tahunProduksi = 0


    fun hidup() {
        println("hidupkan mesin...")
    }

    fun mati() {
        println("matikan mesin...")
    }
    fun gigi() {
        println("ubah gigi...")
    }
}

fun main(args : Array<String>){
    var mobilku = Mobil2()
    mobilku.warna = "Hitam"
    mobilku.tahunProduksi = 1997
    println("Warna :"+ mobilku.warna)
    println("Tahun :"+ mobilku.tahunProduksi)
    mobilku.hidup()
    mobilku.mati()
    mobilku.gigi()

}