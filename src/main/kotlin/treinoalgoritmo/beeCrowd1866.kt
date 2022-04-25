package treinoalgoritmo

fun beeCrowd1866() {
    val qtd = readLine()!!.toInt()

    for (num in 1..qtd) {
        if (num <= qtd) {
            val qtd2 = readLine()!!.toInt()
            if (qtd2 % 2 == 0) println("0") else println("1")
        }
    }
}
