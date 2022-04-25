package treinoalgoritmo

fun beeCrowdTreino1114(){

    do{
        val senha = readLine()!!.toInt()
        if (senha == 2002) println("Acesso Permitido") else println("Senha Invalida")
    }while (senha != 2002)

    println("Desafio Feito !!!")
}