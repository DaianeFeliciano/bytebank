package bytebankdois;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente daiane = new Cliente();

        daiane.nome = "Daiane Feliciano";
        daiane.cpf = "222.222.222 - 22";
        daiane.profissao ="Programadora";

        Conta contaDaDaiane = new Conta();
        contaDaDaiane.deposita(100);

        // associa a cliente daiane a contaDaDaiane
        contaDaDaiane.titular = daiane; // composição

        System.out.println(contaDaDaiane.titular.nome);


    }
}


