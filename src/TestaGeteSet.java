public class TestaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta(1, 2);
        //conta.numero = 1337
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        Cliente paulo = new Cliente();
        //conta.titular = paulo;
        paulo.setNome("Paulo silveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());

    }

}

