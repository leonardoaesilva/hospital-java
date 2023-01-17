public class Atendente extends Funcionario {
    private Byte linhaRamal;

    public Atendente() {}

    public Atendente(String nome, String numeroCPF, Double salarioBase, String turnoServico, Byte linhaRamal) {
        super(nome, numeroCPF, salarioBase, turnoServico);
        this.linhaRamal = linhaRamal;
    }

    public Byte getLinhaRamal() {
        return linhaRamal;
    }

    public void setLinhaRamal(Byte linhaRamal) {
        this.linhaRamal = linhaRamal;
    }
}
