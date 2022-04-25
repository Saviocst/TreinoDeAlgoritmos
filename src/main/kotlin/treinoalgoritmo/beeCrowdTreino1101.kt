package treinoalgoritmo
fun beeCrowdTreino1101(){
    println("Digite os numeros: ")

    do {
        val (numero1, numero2) = readLine()!!.split(' ').map(String::toInt)
        var soma = 0

        if (numero1 > numero2 && numero2 > 0 && numero1 > 0){
            for (sequencia in numero2..numero1){
                print("$sequencia ")
                soma += sequencia
            }
            println("Sum=$soma")

        }else if (numero1 < numero2 && numero2 > 0 && numero1 > 0){
            for (sequencia in numero1..numero2){
                print("$sequencia ")
                soma += sequencia
            }
            println("Sum=$soma")

        }
    }while (numero2 > 0 && numero1 > 0)

}