fun main() {
    /* ############################################### */
    /*                COMO CRIAR COLEÇÕES              */
    /* ############################################### */
    // ArrayList - Classe
    val frutas1 = ArrayList<String>()
    frutas1.add("Mac    a")
    frutas1.add("Banana")
    frutas1.add("Morango")
    println(frutas1)

    // ArrayList - Função
    val frutas2 = arrayListOf("Maca", "Banana", "Morango")



    /* ############################################### */
    /*              BIBLIOTECA PADRÃO JAVA             */
    /* ############################################### */

    //Vamos confirmar que de fato as coleções são da biblioteca
    // Java padrão
    println(HashSet::class.java)

    // Podemos tirar muito mais proveito das coleções em Kotlin
    println(frutas2.last())
}