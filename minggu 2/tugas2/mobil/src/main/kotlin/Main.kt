class Mobil {
    var warna = ""
    var tahunProduksi = 0
}
fun main(args : Array<String>){
    val mobilku = Mobil()
    mobilku.warna = "Hitam"
    mobilku.tahunProduksi = 1997
    println("Warna :"+ mobilku.warna)
    println("Tahun :"+ mobilku.tahunProduksi)

}