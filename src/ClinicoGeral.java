import java.util.List;

public final class ClinicoGeral extends Medico {
    public ClinicoGeral() {}

    public ClinicoGeral(String nome, String numeroCPF, Double salarioBase, String turnoServico, String numeroCRM) {
        super(nome, numeroCPF, salarioBase, turnoServico, numeroCRM);
    }

    @Override
    public String realizarDiagnostico(List<String> sintomas) {
        if (sintomas.contains("Coriza"))
            return sintomas.get(sintomas.indexOf("Coriza")) + " com certeza é virose.";
        return "300ml de dipirona na veia e pronto.";
    }
}
