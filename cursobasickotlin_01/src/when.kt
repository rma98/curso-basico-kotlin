fun obterMnemonica(cor: Cor) =
    when(cor) {
        Cor.VERMELHO -> "Ver"
        Cor.ANARELO -> "Alguem"
        Cor.VERDE -> "Viver"
        Cor.AZUL -> "Alem e"
        Cor.LARANJA -> "Legal"
    }

fun obtertemperatura(cor: Cor): String {
    return when(cor) {
        Cor.VERMELHO, Cor.LARANJA, Cor.ANARELO -> "Quente"
        Cor.VERDE -> "Neutro"
        Cor.AZUL -> "Frio"
    }
}

fun main() {
    val mnemonica = obterMnemonica(Cor.VERMELHO)
    println(mnemonica)

    val temperatura = obtertemperatura(Cor.AZUL)
    println(temperatura)
}