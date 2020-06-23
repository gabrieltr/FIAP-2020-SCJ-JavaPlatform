package ex08;

public class Teste {

    public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();
        System.out.println("\n"+c1.getClass().getSimpleName());
        c1.setTitular("Dan");
		c1.deposita(100);
		System.out.println(c1.getSaldo());
		c1.saque(10);
		System.out.println(c1.getSaldo());
        System.out.println(c1.getTitular());

        c1 = new ContaEspecial();
        System.out.println("\n"+c1.getClass().getSimpleName());
		c1.setTitular("Dan");
		c1.deposita(100);
		System.out.println(c1.getSaldo());
		c1.saque(10);
		System.out.println(c1.getSaldo());
        System.out.println(c1.getTitular());

        c1 = new ContaDigital();
        System.out.println("\n"+c1.getClass().getSimpleName());
		c1.setTitular("Dan");
		c1.deposita(100);
		System.out.println(c1.getSaldo());
        c1.saque(100);
        c1.saque(10);
		System.out.println(c1.getSaldo());
        System.out.println(c1.getTitular());

    }
}