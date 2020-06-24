package ex10;

public class Cliente {
    private String nome;
    private String endereco;
    private String numeroRG;
    private String numeroCPF;

    public Cliente() {
    }

    public Cliente(String numeroRG) {
        this();
        this.numeroRG = numeroRG;
    }

    public Cliente(String nome, String endereco, String numeroRG, String numeroCPF) {
        this(numeroRG);
        this.nome = nome;
        this.endereco = endereco;
        this.numeroCPF = numeroCPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(String numeroRG) {
        this.numeroRG = numeroRG;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    @Override
    public String toString() {
        return "Cliente [endereco=" + endereco + ", nome=" + nome + ", numeroCPF=" + numeroCPF + ", numeroRG="
                + numeroRG + "]";
    }

}