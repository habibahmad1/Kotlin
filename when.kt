fun main() {
    val menu = 'B'

    when (menu) {
        'A' -> println("Bakso")
        'B' -> println("Mie Ayam")
        'C' -> {
            println("Pizza")
            println("Dan Tesh Manis")
        }
        else -> {
            println("Tidak Ada Menu Itu")
        }
    }

    val nilai = 'A'

    when (nilai){
        'A','B','C' -> {
            println("Selamat Kamu Lulus!")
        }
        else-> {
            println("Coba Lagi")
        }
    }

    var nilaiLulus  = 14
    val contoh = 10..20

    when (nilaiLulus){
        in contoh -> println("Ini Range")
        !in contoh -> println("BUkan Range")
    }
}