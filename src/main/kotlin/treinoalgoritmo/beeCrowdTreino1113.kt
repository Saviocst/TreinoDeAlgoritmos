package treinoalgoritmo

fun beeCrowdTreino1113(){
    println("Digite o par de numeros: ")
    do {
        val (numero1, numero2) = readLine()!!.split(' ').map(String::toInt)
        if (numero1 > numero2 && numero1 != numero2) println("Decrescente") else if (numero1 < numero2 && numero1 != numero2) println("Crescente")
    }while (numero1 != numero2)

}