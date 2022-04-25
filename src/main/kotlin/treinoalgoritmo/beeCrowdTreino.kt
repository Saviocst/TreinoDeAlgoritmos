package treinoalgoritmo

fun beeCrowdTreino() {

    val quantidade = readLine()!!.toInt()
    var valor = 0

    for (num in 1..quantidade) {

        if (num <= quantidade) {
            val (numero1, numero2) = readLine()!!.split(' ').map(String::toInt)

            if (numero1 < numero2) {
                for (impar in numero1 + 1 until numero2) {

                    if (impar % 2 != 0) {
                        valor += impar

                    }
                }
            } else {
                for (impar in numero2 + 1 until numero1) {

                    if (impar % 2 != 0) {
                        valor += impar

                    }
                }
            }
            println(valor)
            valor = 0
        }
    }
}