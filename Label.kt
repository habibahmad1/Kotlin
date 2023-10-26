fun main() {
    loopI@ for (i in 1..20){
        loopJ@ for (j in 1..20){
            if (i > 10){
                break@loopI
            }
            println("$i * $j = ${i*j}")

        }
    }
}