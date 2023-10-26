fun main() {
    fun hello(name:String, lambda: (String)->String) : String{
        val namlambda = lambda(name)
        return "Hi, $namlambda"
    }

    val besar = fun (nilai: String):String{
        if (nilai == ""){
            return "Test"
        } else  {
            return nilai.uppercase()
        }
    }

    println(hello("Master",besar))
    println(hello("",besar))

    println(hello("Kecil", fun  (nilai2: String):String{
        return nilai2.lowercase()
    }))
}
