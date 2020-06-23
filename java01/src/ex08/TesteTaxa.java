package ex08;

public class TesteTaxa {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria();
        System.out.println( c.getTaxaBancaria() );
        System.out.println( c.getTaxaBancaria(40) );
        System.out.println( c.getTaxaBancaria(1, 2) );
    }
}