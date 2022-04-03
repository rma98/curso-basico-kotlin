import java.lang.IllegalArgumentException

// ((1 + 2) + 4) = 7
interface Expressao2
class Numero2(val valor: Int) : Expressao2
class Soma2(val esquerdo: Expressao2, val direito: Expressao2) : Expressao2

fun avaliacao(expressao2: Expressao2): Int =
    when(expressao2) {
        is Numero2 -> {
            println("Expressao com numero: ${expressao2.valor}")
            expressao2.valor
        }
        is Soma2 -> {
            avaliacao(expressao2.esquerdo) + avaliacao(expressao2.direito)
        }
        else -> throw IllegalArgumentException("Expressao e desconhecida")
    }


fun main() {
    // ((1 + 2) + 4) = 7
    val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
    println(resultado)
}
