fun fullName(namaDepan: String, namaBelakang: String?) {
    if (namaBelakang == null){
        println("Hello $namaDepan")
    } else {
        println("Hello $namaDepan $namaBelakang")
    }
}

fun main() {
    fullName("Dini","Audini")
    fullName("Reni",null)
    fullName("Dinda", "Salia")
}