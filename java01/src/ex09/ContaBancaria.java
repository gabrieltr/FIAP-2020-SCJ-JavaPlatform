package ex09;

public class ContaBancaria {

    private double saldo;
    protected String nomeCliente;
    protected String endCliente;
    protected String cpfCliente;

    public ContaBancaria(String nomeCliente, String endCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.endCliente = endCliente;
        this.cpfCliente = cpfCliente;
    }

    // métodos
    public void saque(double valor) {
        saldo -= valor;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria [cpfCliente=" + cpfCliente + ", endCliente=" + endCliente + ", nomeCliente=" + nomeCliente
                + ", saldo=" + saldo + "]";
    }

}