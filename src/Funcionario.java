public class Funcionario extends Pessoa {
    private boolean isEmServico;
    private Double salarioBase;
    private String turnoServico;

    public Funcionario() {}

    public Funcionario(String nome, String numeroCPF, Double salarioBase, String turnoServico) {
        super(nome, numeroCPF);
        this.isEmServico = false;
        this.salarioBase = salarioBase;
        this.turnoServico = turnoServico;
    }

    @Override
    public void darEntrada() {
        isEmServico = true;
    }

    public boolean isEmServico() {
        return isEmServico;
    }

    public void setEmServico(boolean emServico) {
        isEmServico = emServico;
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
