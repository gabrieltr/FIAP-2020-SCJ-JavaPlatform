package ex10;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void saque(double valor) {
        saldo -= valor * 1.03;
    }
}