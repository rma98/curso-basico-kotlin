import java.lang.IllegalArgumentException

// ((1 + 2) + 4) = 7
interface Expressao
class Numero(val valor: Int) : Expressao
class Soma(val esquerdo: Expressao, val direito: Expressao) : Expressao

fun avaliacao(expressao: Expressao): Int {
    if (expressao is Numero) {
        return expressao.valor
    }

    if (expressao is Soma) {
        return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
    }

    throw IllegalArgumentException("Expressao e desconhecida")
}

fun main() {
    // ((1 + 2) + 4) = 7
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}