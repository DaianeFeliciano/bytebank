package bytebank;

public class TesteReferencias {
    public static void main(String[] args) {

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 400;

        System.out.println("saldo da 1 conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta; // copia a referencia do objeto para segundaConta
        // mesma coisa, uma conta só

        System.out.println(segundaConta.saldo);
        segundaConta.saldo += 100;
        // referencia para o mesmo objetio, só uma conta:
        System.out.println(segundaConta.saldo);
        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta) {

            System.out.println("mesma conta");

        }
    }
}
