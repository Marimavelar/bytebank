fun main() {
    println("Hello World. Welcome to Bytebank.")


}

fun testaLacos() {
    // var -> Variável mutável
    // val -> Variável NÃO mutável

    for (i in 0..4) {
        val titular = "Mariana $i"
        val numeroConta = 1
        var saldo = 0.0
        saldo += i

        println("Titular da conta: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        testaCondicoes(saldo)
    }
}

fun testaCondicoes(saldo: Double) {
//    if (saldo > 0.0){
//        println("Conta com saldo positivo.")
//    } else if (saldo == 0.0) {
//        println("Conta com saldo neutro.")
//    } else {
//        println("Conta com saldo negativo.")
//    }

    when {
        saldo > 0.0 -> println("Conta com saldo positivo.")
        saldo == 0.0 -> {
            println("Conta com saldo neutro.")
        }
        else -> {
            println("Conta com saldo negativo.")
        }
    }
}
