package ex08;

public class ContaEspecial extends ContaBancaria {

    @Override
    public void saque(double valor) {
        valor*=1.1;
        super.saque(valor);
    }
}
