package bytebankencapsulado;

public class TestaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta(200,100);

//        conta.setNumero(2000);
        System.out.println(conta.getNumero());

        Cliente daiane = new Cliente();

        daiane.setNome("Daiane");

        conta.setTitular(daiane);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programadora");
        Cliente titulardaConta = conta.getTitular();
        titulardaConta.setProfissao("programadora");
    }
}
