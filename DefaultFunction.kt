fun defaultfun(namaDepan: String,namaBelakang:String? =null){
    if(namaBelakang == null){
        println("Hello $namaDepan")
    } else {
        println("Hello $namaDepan $namaBelakang")
    }
}

fun main() {
    defaultfun("Rini")
    defaultfun("Rudi","Arianto")
}