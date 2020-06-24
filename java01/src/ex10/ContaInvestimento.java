package ex10;

public class ContaInvestimento extends Conta implements Tributacao {

    public ContaInvestimento(Cliente cliente) {
        super(cliente);
    }

    public void saque(double valor) {
        saldo -= valor * 1.03;
    }

    public void exibeValorIR() {
        System.out.println("Tributo: " + calculaTributo());
    }

    @Override
    public double calculaTributo() {
        return saldo * .03;
    }
}