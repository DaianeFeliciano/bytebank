package bytebankdois;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(500);
        //conta.saca(600);
        System.out.println(conta.saca(600));

//        // proibido
//        conta.saldo = conta.saldo - 600; // nao ideal para acessar pelos atributos e sim pelos métodos
//        System.out.println(conta.saldo);
        System.out.println(conta.getSaldo());


    }
}
