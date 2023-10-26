fun main() {
    tailrec fun tampilData(nilai: Int) {
        println("Angka ke- $nilai")
        if (nilai < 100) {
            tampilData(nilai+1)
        }
    }
    tampilData(1)

    tailrec fun whenTail(angka: Int, total: Int =1) : Int{
        return when(angka){
        1->total
        else -> whenTail(angka-1, total * angka)
        }
    }
    println(whenTail(10))
}