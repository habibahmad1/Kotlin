infix fun String.to(nilai: String): String {
    if (nilai == "UP" ) {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun main() {
    val hasil = "Halo Master" to "sadassad"
    print(hasil)
}