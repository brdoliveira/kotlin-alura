fun main() {
    println("Bem vindo ao Bytebank")

// testaLoopWhile()
// testaLoopFor()
// testaCondicoes(saldo)
}

fun testaLoopWhile() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alexia $i"
        val numeroConta: Int = 1000 + 1
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }
}

fun testaLoopFor() {
    //    for (i in 1..5) {
    for (i in 5 downTo 1 step 2) {
        if (i == 4) {
            continue
            //break
        }
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + 1
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}