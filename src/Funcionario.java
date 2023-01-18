public abstract class Funcionario extends Pessoa {
    private boolean emServico;
    private Double salarioBase;
    private String turnoServico;

    public Funcionario() {
        this.emServico = false;
    }

    public Funcionario(String nome, String numeroCPF, Double salarioBase, String turnoServico) {
        super(nome, numeroCPF);
        this.emServico = false;
        this.salarioBase = salarioBase;
        this.turnoServico = turnoServico;
    }

    public final void baterPonto() {
        setEmServico(!emServico);
    }

    public boolean isEmServico() {
        return emServico;
    }

    public void setEmServico(boolean emServico) {
        this.emServico = emServico;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getTurnoServico() {
        return turnoServico;
    }

    public void setTurnoServico(String turnoServico) {
        this.turnoServico = turnoServico;
    }
}
