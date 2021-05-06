fun main() {
    //imprimirSoma(4,5)
    //printaTexto("Pedro")
    //aprovados();
}

fun imprimirSoma(a: Int, b: Int) {
    print(a + b)
}

fun printaTexto(nome: String) {
    print("Bom dia ${nome}, hoje será um dia bem legal")
}

fun aprovados() {
    val aprovados = listOf("Pedro", "João", "Ana", "Paulo")
    print("O primeiro/a colocado/a foi ${aprovados[2]}.")
}

