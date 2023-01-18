public class Atendente extends Funcionario {
    private Integer linhaRamal;

    public Atendente() {}

    public Atendente(String nome, String numeroCPF, Double salarioBase, String turnoServico, Integer linhaRamal) {
        super(nome, numeroCPF, salarioBase, turnoServico);
        this.linhaRamal = linhaRamal;
    }

    public Integer getLinhaRamal() {
        return linhaRamal;
    }

    public void setLinhaRamal(Integer linhaRamal) {
        this.linhaRamal = linhaRamal;
    }
}
