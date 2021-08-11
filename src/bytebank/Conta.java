package bytebank;

public class Conta {
    // valor padrao 0
    double saldo;
    int agencia;
    int numero;
    String titular;

// metodo sem retorno
    public void deposita(double valor) {

        this.saldo += valor;

    }
// metodo com retorno
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
        this.saldo -= valor;
        return true;
    } else {

        return false;

        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >=valor) {

            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;

    }

}
