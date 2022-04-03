// Crie um programa que calcule e exiba o resultdado da média de temperatura informadas pelo usuário

fun main() {
    var temperatura: Int = 0
    var somatorio: Int = 0
    var quantidade: Int = 0

    while (temperatura != 999) {
        println("Digite uma temperatua ou 999 para sair:")
        temperatura = readLine()!!.toInt()

        if (temperatura != 999) {
            somatorio += temperatura
            quantidade++
        }
    }

    println("A media da temeperatura e = ${somatorio/quantidade}")
}