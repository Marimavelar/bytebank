class Conta {
    var titular = "";
    var numeroConta = 0;
    var saldo = 0.0;

    fun deposita(valor: Double) {
        this.saldo += valor;
    }

    fun saca(valor: Double): Boolean {
        if (valor >= this.saldo) {
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    fun transfere(valor: Double, contaDestino: Conta): Boolean {
        if (valor >= this.saldo) {
            return false;
        }
        contaDestino.deposita(valor);
        this.saca(valor);
        return true;
    }
}