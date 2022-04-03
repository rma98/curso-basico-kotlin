fun main() {
    println(isLetter('7'))

    println(isNoDigit('5'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNoDigit(c: Char) = c !in '0'..'9'
