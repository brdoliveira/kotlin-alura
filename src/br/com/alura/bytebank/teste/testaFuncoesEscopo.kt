package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaFuncoesEscopo() {
    //    val endereco  = Endereco(logradouro = "Rua Vergueiro", numero = 3185)
    //    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    //    println(enderecoEmMaiusculo)
    var endereco = Endereco()
        .also { println("Criando endereco") }
        .apply {
            logradouro = "Rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let(::println)

    Endereco(logradouro = "Rua Vergueiro", numero = 3185)
        .run {
            "$logradouro, $numero".toUpperCase()
        }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = ::println)
}