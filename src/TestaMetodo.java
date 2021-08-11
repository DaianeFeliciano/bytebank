public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaDaiane = new Conta();

        contaDaDaiane.saldo = 100;
        contaDaDaiane.deposita(50); // altera o valor, metodo

        System.out.println(contaDaDaiane.saldo);

        boolean conseguiuRetirar = contaDaDaiane.saca(10);

        System.out.println(contaDaDaiane.saldo);
        System.out.println(conseguiuRetirar);
    }

}
