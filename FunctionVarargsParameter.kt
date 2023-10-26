fun hitungTotal(name: String, vararg values: Int): Int{
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

fun main() {
    //val  contoh = arrayOf(10,10,10,20)
    val result = hitungTotal("Hasilnya :",20,20)

    println(result)
}