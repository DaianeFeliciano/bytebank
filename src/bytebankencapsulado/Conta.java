package bytebankencapsulado;

public class Conta {
    // valor padrao 0
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular; // para composição
    private static int total; // atributo da classe static
// construtor
    public Conta(int agencia, int numero){
        total++;
        //System.out.println("total de contas" + total);
        this.agencia = agencia;
        this.numero = numero;

    }

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

    public double getSaldo() {

        return this.saldo;
    }

    public int getNumero() {

        return this.numero;

    }

    public void setNumero(int numero) {
        if(numero <=0) {
            System.out.println("não pode número menor igual0");
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <=0) {

            System.out.println("não pode valores menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}
