package bytebankdois;

public class TestaContaSemCliente {

    public static void main(String[] args) {
        Conta contaDoVictor = new Conta();
        System.out.println(contaDoVictor.getSaldo());

        contaDoVictor.titular = new Cliente();

        contaDoVictor.titular.nome = "Victor";
        System.out.println(contaDoVictor.titular.nome);
    }
}
