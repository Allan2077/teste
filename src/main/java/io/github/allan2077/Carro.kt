package io.github.allan2077

data class Carro(
        val pudim: String = "", val idade: Int = 1
)


fun main() {
    val carro = Carro(
            idade = 1, pudim = ""
    )

    val carros = listOf(Carro("Carro 1" ), Carro("Carro 2", 2))

    carros.forEach{
        println(it.idade)
    }
}