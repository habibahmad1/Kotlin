fun  rumusKubus(s1:Int,s2:Int):Int{
    val luas = s1 * s2
    return luas
}

fun main() {
    println(rumusKubus(10,10))
    
    val keliling = 4 * rumusKubus(10,10)
    println(keliling)
}