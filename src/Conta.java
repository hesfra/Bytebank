public class Conta {

    private int agencia;
    private int numero;
    private static int total = 0;
    private Cliente titular;
    private double saldo;

    public Conta (int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero =  numero;
    }

    void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {

        return this.saldo;
    }

    public int getNumero() {

        return this.numero;
    }

    public void setNumero(int numero) {
        if(numero <=0){
            System.out.println("Não pode valor menor ou igual a 0");
        return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia<=0 ) {
            System.out.println("Não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }
}

