fun main() {
    val teks= "Halo Master"
    var master= "Habib"
    var gabung= "$teks $master"
    var panjang= "$gabung = ${gabung.length}"
    val ambilHuruf= teks[3]
    var contoh2= """
        -Kp.Gelam Jaya,
        -Kab.Tangerang,
        -Kec.Pasar Kemis,
        -Banten
    """.trimMargin("-")

    println("Huruf ke 4 adalah "+ambilHuruf)

    println(panjang)

    println(contoh2)
}