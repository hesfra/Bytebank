public class TestaValores {
    public static void main(String[] args) {

        Conta conta= new Conta(14, 22);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        System.out.println(Conta.getTotal());


    }
}
