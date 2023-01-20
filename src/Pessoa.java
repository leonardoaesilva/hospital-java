public abstract class Pessoa {
    private String nome;
    private String numeroCPF;

    public Pessoa() {}

    public Pessoa(String nome, String numeroCPF) {
        this.nome = nome;
        this.numeroCPF = numeroCPF;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pessoa))
            return false;
        else if (this == obj)
            return true;
        Pessoa p = (Pessoa) obj;
        return this.numeroCPF.equals(p.numeroCPF);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

//    public void setNumeroCPF(String numeroCPF) {
//        this.numeroCPF = numeroCPF;
//    }
}
