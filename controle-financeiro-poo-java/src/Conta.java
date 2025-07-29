public abstract class Conta {
    private String titular;
    private String numero;
    protected double saldo;

    public Conta(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    public abstract void depositar(double valor);
    public abstract boolean sacar(double valor);
    public abstract boolean transferir(double valor, Conta destino);
    public double getSaldo() { return saldo; }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }
}
