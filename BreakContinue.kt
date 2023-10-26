fun main() {
    var i =1

    while (true) {
        println("Mobil dengan kecepatan $i")
        i++
        if (i > 100){
            break
        }
    }

    for (i in 1..100){
        if (i % 2 == 1) {
            continue
        }
        println("Nilai ke- $i")
    }

}