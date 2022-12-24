import modelo.ContaPoupanca

fun testaCopiasEReferencias(){
    // copia
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    // referência
    val contaJoao = ContaPoupanca("João",10000)
    contaJoao.titular = "João"
    val contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
}