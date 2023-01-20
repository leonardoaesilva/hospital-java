import java.util.List;

public abstract class Medico extends Funcionario {
    private String numeroCRM;

    public Medico() {}

    public Medico(String nome, String numeroCPF, Double salarioBase, String turnoServico, String numeroCRM) {
        super(nome, numeroCPF, salarioBase, turnoServico);
        this.numeroCRM = numeroCRM;
    }

    public abstract String realizarDiagnostico(List<String> sintomas);

    public String getNumeroCRM() {
        return numeroCRM;
    }

//    public void setNumeroCRM(String numeroCRM) {
//        this.numeroCRM = numeroCRM;
//    }
}
