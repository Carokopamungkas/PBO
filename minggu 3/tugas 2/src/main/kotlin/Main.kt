class buku (var judul: String, var pengarang: String, var penerbit: String, var tahun: Int){
}

fun main () {
    val a = buku("Pemrograman Berbasis Objek Dengan Java, ", "Indrajani, ", "Elexmedia Komputindo, ", 2007)
    val b = buku("Dasar Pemrograman Java, ", "Abdul Kadir, ", "Andi Ofset, ", 2004)
    println(a.judul + a.pengarang + a.penerbit + a.tahun)
    println(b.judul + b.pengarang + b.penerbit + b.tahun)
}