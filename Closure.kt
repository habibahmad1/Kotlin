fun main() {
    var counter = 0

    val lambda = {
        println("Lambda Function ke $counter")
        counter++
    }

    val anonymousFun = fun() {
        println("Anonymous Function ke $counter")
        counter++
    }

    fun increment (){
        println("Increment FUnction ke $counter")
        counter++
    }

    lambda()
    anonymousFun()
    increment()

    lambda()
    anonymousFun()
    increment()

    println(counter)
}