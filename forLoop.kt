fun main() {
    val nilaiA= arrayOf(10,20,30,40,50)

    var total = 0
    for (nilaiB in nilaiA) {
        println(nilaiB)
        total++
    }
    println("Total ulang = $total")

    for (i in 100 downTo 0 step 2)
    {
        println(i)
    }

}