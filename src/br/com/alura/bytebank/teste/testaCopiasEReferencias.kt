import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias(){
    // copia
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf= "", senha=1)

    // referência
    val contaJoao = ContaPoupanca(joao,10000)
    contaJoao.titular.nome = "João"
    val contaMaria = ContaPoupanca(Cliente(
        nome = "Maria",
        cpf = "",
        senha = 2
    ),1002)
    contaMaria.titular.nome = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
}