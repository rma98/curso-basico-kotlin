fun main() {
    println(max1(10, 15))
}

// Corpo do bloco
fun max(a: Int, b: Int): Int {
    return if (a > b ) a else b
}

// Corpo de expressão
fun max1(a: Int, b: Int): Int = if (a > b) a else b