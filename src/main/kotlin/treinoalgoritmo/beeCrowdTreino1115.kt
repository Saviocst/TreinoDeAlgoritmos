package treinoalgoritmo

fun beeCrowdTreino1115(){
    do {
        val (x, y) = readLine()!!.split(' ').map(String::toInt)

        if (x > 0 && y > 0) println("primeiro")
        else if (x < 0 && y > 0) println("segundo")
        else if (x < 0 && y < 0) println("terceiro")
        else if (x > 0 && y < 0) println("quarto")

    }while (x != 0 && y != 0)
}