inline fun hello(name: () -> String,noinline lastName: () ->String):String{
    return "Hello ${name()} ${lastName()}"
}


fun main() {
   for (i in 0..10 step 2){
       println(hello({"Master"},{"Welcome"}))
       println("$i")
   }
}