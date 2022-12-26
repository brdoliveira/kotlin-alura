import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro"
            )
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome="Fran", cpf="", senha= 2),
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo conta corrente: ${contaCorrente.saldo}")
    println("saldo conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque - conta corrente: ${contaCorrente.saldo}")
    println("saldo após saque - conta poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca,1)

    println("saldo conta corrente após transferir para conta poupança: ${contaCorrente.saldo}")
    println("saldo conta poupanca após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente,2)

    println("saldo conta poupança após transferir para conta corrente: ${contaPoupanca.saldo}")
    println("saldo conta corrente após receber transferencia: ${contaCorrente.saldo}")
}