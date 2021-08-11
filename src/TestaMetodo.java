public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaDaiane = new Conta();
        Conta contaDoVictor = new Conta();

        contaDaDaiane.saldo = 100;
        contaDaDaiane.deposita(50); // altera o valor, metodo

        System.out.println(contaDaDaiane.saldo);

        boolean conseguiuRetirar = contaDaDaiane.saca(10);

        System.out.println(contaDaDaiane.saldo);
        System.out.println(conseguiuRetirar);

        contaDoVictor.deposita(1000);

        boolean sucessoTransferencia = contaDoVictor.transfere(100, contaDaDaiane);

        //boolean sucessoTransferencia2 = contaDoVictor.transfere(0, contaDaDaiane);

        if(sucessoTransferencia){

            System.out.println("Transferencia feita com sucesso");
        } else {

            System.out.println("Saldo insuficiente");
        }
        System.out.println(contaDaDaiane.saldo);
        System.out.println(contaDoVictor.saldo);


    }

}
