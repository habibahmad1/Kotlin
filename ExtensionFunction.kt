fun String.contoh():String = "Ini function buatan $this"

fun String.menyapa() = println("Welcome $this")

fun Int.hitungs(s1:Int,s2:Int):Int = s1 / s2

fun main() {
    val test = "Contoh"
    val angka = 10

    println(test.contoh())

    test.menyapa()

    println(angka.hitungs(100,20))
}