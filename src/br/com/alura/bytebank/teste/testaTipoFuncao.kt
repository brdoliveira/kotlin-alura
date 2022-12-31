package br.com.alura.bytebank.teste

fun testaFuncaoAnonima() {
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))

    val calculadoraBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) {
            return salario + 50.00
        }
        return salario + 100.00
    }
    println(calculadoraBonificacaoAnonima(1000.00))
}

fun testeFuncaoLambda() {
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    } // Ficam vinculadas a variavel
    println(minhaFuncaoLambda(10, 15))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.00) {
            return@lambda salario + 50
        }
        return@lambda salario + 100.00
    }
    println(calculaBonificacao(1100.0))
}

private fun testaTipoClasse() {
    val minhaFuncaoClasses: (Int,Int) -> Int = Soma()
    println(minhaFuncaoClasses(10,10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int,Int) -> Int = ::soma
    println(minhaFuncao(5,10))
}

fun soma(a: Int , b: Int) : Int {
    return a + b
}

class Soma: (Int,Int) -> Int {
    override fun invoke(a: Int, b: Int): Int = a + b
}