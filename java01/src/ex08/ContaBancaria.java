package ex08;

public class ContaBancaria {

	// atributos
	private String titular;
	private double taxaBancaria = 1.0;
	private double saldo;

	// métodos
	public void saque(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	// getters / setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTaxaBancaria() {
		return getTaxaBancaria(1, 0);
	}

	public double getTaxaBancaria(int dias) {
		return getTaxaBancaria(dias, 0);
	}

	public double getTaxaBancaria(int dias, int meses) {
		return this.taxaBancaria * (dias + (meses * 30));
	}
}
