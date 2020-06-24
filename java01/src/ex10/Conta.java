package ex10;

public abstract class Conta {
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void exibirSaldo() {
        System.out.println(toString());
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor * 1.03;
    }

    @Override
    public String toString() {
        return "Conta [cliente=" + cliente + ", saldo=" + saldo + "]";
    }

}