package ex09;

public class ContaEspecial extends ContaBancaria {

    public ContaEspecial(String nomeCliente, String endCliente, String cpfCliente) {
        super(nomeCliente, endCliente, cpfCliente);
    }

    @Override
    public void saque(double valor) {
        valor *= 1.1;
        super.saque(valor);
    }

    @Override
    public String toString() {
        return "ContaEspecial [" + super.toString() + "]";
    }

}
