package bytebankencapsulado;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(500,200);
//        // conta inconsistente
//        conta.setAgencia(-50);
//        conta.setNumero(-330);

        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(500,21215);

        System.out.println(Conta.getTotal());

    }
}
