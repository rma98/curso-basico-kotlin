fun calculadora(valor1: Int, valor2: Int) {
    print("""
        MENU
        1 - ADICAO
        2 - SUBTRACAO
        3 - MULTIPLICACAO
        4 - DIVISAO
        
        ESCOLHA UMA DAS OPCOES ACIMA:
    """.trimIndent())
    val opcao = readLine()
    if (opcao == "1") {
        print("$valor1 + $valor2 = ")
        println(valor1 + valor2)
    }
    if (opcao == "2") {
        print("$valor1 - $valor2 = ")
        println(valor1 - valor2)
    }
    if (opcao == "3") {
        print("$valor1 * $valor2 = ")
        println(valor1 * valor2)
    }
    if (opcao == "4") {
        print("$valor1 / $valor2 = ")
        println(valor1 / valor2)
    }
}

fun main() {
    println(calculadora(10, 5))
}
