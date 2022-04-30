package treinoalgoritmo
fun beeCrowdTreino1131() {
    var vitoriaInter = 0
    var vitoriaGremio = 0
    var empates = 0
    var qtdGrenais = 1
    var vitoria: String

    do {
        val (placar1, placar2) = readLine()!!.split(' ').map(String::toInt)
        println("Novo grenal (1-sim 2-nao)")
        val novoGrenal = readLine()!!.toInt()

        if (novoGrenal == 1) qtdGrenais++

        if (placar1 > placar2) {
            vitoriaInter++
        } else if (placar1 == placar2) {
            empates++
        } else {
            vitoriaGremio++
        }

        vitoria = if (vitoriaInter > vitoriaGremio) {
            "Inter venceu mais"
        } else if (vitoriaInter < vitoriaGremio) {
            "Gremio venceu mais"
        } else {
            "Nao houve vencedor"
        }

    } while (novoGrenal != 2)

    println("$qtdGrenais grenais\nInter:$vitoriaInter\nGremio:$vitoriaGremio\nEmpates:$empates\n${vitoria}")
}

