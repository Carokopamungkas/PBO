fun main() {

    //FAKTORIAL

    var hasil: Int = 1
    println("Masukkan bilangan bulat : ")
    var n: Int = readLine()!!.toInt();
    if (n <= 0){
        println("Angka yang dimasukkan bukan bilangan bulat atau adalah angka 0")
    } else {
        for (i in 1..n) {
            hasil *= i


        }
        println("Angka faktorial " + n + " adalah " + hasil)
    }


        //BILANGAN BULAT SIMETRIS ATAU BUKAN

        println("masukkan angak: ")
        var num: Int = readLine()!!.toInt();
        var reversedInteger = 0
        var remainder: Int
        val originalInteger: Int

        originalInteger = num

        while (num != 0) {
            remainder = num % 10
            reversedInteger = reversedInteger * 10 + remainder
            num /= 10
        }

        if (originalInteger == reversedInteger)
            println("True")
        else
            println("Flase")


        // KONVERSI WAKTU
        println("masukkan angak: ")
        var angka: Int = readLine()!!.toInt();
        val jam = angka / 3600
        val menit = (angka/ 60 ) % 60
        val detik = angka % 60

        println("$angka = $jam jam $menit menit $detik detik")




        //menggabungkan dan mengurutkan array
        val arr = arrayOf(3,4,4)
        val arr1 = arrayOf(3,2,1)
        var result = arr + arr1
        result.sortBy { it }
        println(result.contentToString())



}


