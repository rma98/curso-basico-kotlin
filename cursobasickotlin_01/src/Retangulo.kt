class Retangulo(val altura: Int, val largura: Int) {
    val isQuadrado
        get() = altura == largura

}

fun main() {
    val retangulo: Retangulo = Retangulo(11, 10)
    println(retangulo.isQuadrado)
}