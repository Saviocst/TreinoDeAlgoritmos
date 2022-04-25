package treinoalgoritmo

fun beeCrowdTreino1117() {
    var contador = 0
    var media = 0.0
    var somaNotas = 0.0

    do {
        val notas = readLine()!!.toDouble()
        if (notas > 0 && notas <= 10) {
            contador++
            somaNotas += notas
            media = somaNotas / 2
        } else {
            println("nota invalida")
        }

    } while (contador < 2)
    println("media = %.2f".format(media))
}
