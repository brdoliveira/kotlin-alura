fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Alexia $i"
        val numeroConta: Int = 1000 + 1
        val saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    //    for (i in 1..5) {
    for (item in 5 downTo 1 step 2) {
        if (item == 4) {
            continue
            //break
        }
        val titular = "Alex $item"
        val numeroConta: Int = 1000 + 1
        val saldo = item + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
}