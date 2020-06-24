package ex10;

public class Main {
    public static void main(String[] args) {
        ContaInvestimento c = new ContaInvestimento(new Cliente("nome", "endereco", "numeroRG", "numeroCPF"));
        c.deposita(1000);
        c.exibirSaldo();
        c.exibeValorIR();

    }
}