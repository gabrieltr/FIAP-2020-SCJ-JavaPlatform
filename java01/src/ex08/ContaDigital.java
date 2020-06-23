package ex08;

public class ContaDigital extends ContaBancaria {

    @Override
    public void saque(double valor) {
        if(this.getSaldo()<=0){
            throw new RuntimeException("Não é perimito saque com saldo negativo");
        }
        super.saque(valor);
    }

}