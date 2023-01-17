public abstract class Pessoa {
    private String nome;
    private String numeroCPF;

    public Pessoa() {}

    public Pessoa(String nome, String numeroCPF) {
        this.nome = nome;
        this.numeroCPF = numeroCPF;
    }

    public abstract void darEntrada();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }
}
