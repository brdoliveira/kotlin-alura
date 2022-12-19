fun main() {
    println("Bem vindo ao Bytebank")

    val contaAlex = Conta(titular ="Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(numero =1001, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    print(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaFran.deposita(70.0)
    print(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na cont da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")
    if(contaFran.transfere(100.0, contaAlex)){
        println("Transferência sucedida")
    }else{
        println("Falha na transferência")
    }

    println(contaFran.saldo)
    println(contaAlex.saldo)
}

class Conta(
    var titular: String,
    val numero: Int = 0
 ){
    var saldo = 0.0
        private set

    fun deposita(valor: Double){
        if(valor > 0){
            this.saldo += valor
        }
    }

    fun saca(valor : Double){
        if(saldo > valor){
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean{
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double{
//        return this.saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = valor
//        }
//    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}