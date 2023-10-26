fun main() {
    fun factorialLoop(nilai: Int):Int {
        var hasil = 1

        for (i in nilai downTo 1) {
            hasil *= i
        }
        return  hasil
    }

    println(factorialLoop(10))

    fun recursive(value: Int) :Int {
        return when (value){
            1 -> 1
            else -> value * recursive(value-1)
        }
    }
    println(recursive(10))
}