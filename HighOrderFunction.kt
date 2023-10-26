fun main() {

    fun hello(name:String, lambda: (String)->String) : String{
        val namlambda = lambda(name)
        return "Hi, $namlambda"
    }

    val keBesar = { contoh1: String -> contoh1.uppercase() }
    println( hello("Master", keBesar))

    println(hello("Master",{ nilai:String->nilai.lowercase()}))
}