public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta ();
        Conta segundaConta = new Conta ();

        primeiraConta.saldo = 200;

        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;

        System.out.println(primeiraConta.saldo);

        segundaConta.saldo = 200;

        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
    }
}
