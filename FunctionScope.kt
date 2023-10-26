fun helo(nama: String, umur:Int?){
    if (umur == null) {
        println("Hello $nama")
    } else {
        println("Hello $nama umur $umur")
    }
}

fun main() {
    fun pekenalan(nama: String, umur:Int?){
        if (umur == null) {
            println("Hello $nama")
        } else {
            println("Hello $nama umur $umur")
        }
    }

    pekenalan("Rini",23)
    helo("Doni",null)
}