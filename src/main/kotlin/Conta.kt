class Conta(
    var titular: String,
    val numeroConta: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double): Boolean {
        if (valor <= 0) {
            return false
        }
        this.saldo += valor
        return true
    }

    fun saca(valor: Double): Boolean {
        if (valor >= this.saldo) {
            return false
        }
        this.saldo -= valor
        return true
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (valor >= this.saldo) {
            return false
        }
        contaDestino.deposita(valor)
        this.saca(valor)
        return true
    }
}