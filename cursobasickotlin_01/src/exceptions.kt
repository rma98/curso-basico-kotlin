import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun main() {
   try {
       val porcetagem = porcentagem(101)
       println(porcetagem)
   } catch (e: IllegalArgumentException) {
       println(e.message)
   }

    val idade = lerIdade()
    println(idade)
}

fun porcentagem(numero: Int): String {
    return if (numero in 1..100) {
        "$numero%"
    } else {
        throw IllegalArgumentException("numero deve esta entre 1 e 100")
    }
}

fun lerIdade(): Int? {
    val reader = FileReader(File("src/idades.txt"))
    val buffer = BufferedReader(reader)

    try {
        val numero = buffer.readLine()
        return Integer.parseInt(numero)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        buffer.close()
    }
}

