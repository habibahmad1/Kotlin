fun keBesar(huruf: String): String = huruf.uppercase()

fun main() {
    val contohLambda: (String,String) -> String = {name: String,gender: String ->
        val hasil = "$name $gender"
        hasil
    }
    val hasil = contohLambda("Master","Male")
    println(hasil)

    val angka: (Int) -> Int ={
        it
    }

    println(angka(21))

    val cetakHuruf: (String) -> String = ::keBesar
    println(keBesar("halo saya huruf besar"))
}