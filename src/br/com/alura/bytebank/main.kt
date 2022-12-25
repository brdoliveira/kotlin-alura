import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )
    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 1000,
        cep= "00000-000"
    )

    println(endereco.hashCode())
    println(endereco.equals(enderecoNovo))
    println(endereco.toString())

}

fun imprime(valor: Any): Any{
    println(valor)
    return valor
}