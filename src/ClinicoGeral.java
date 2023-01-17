public final class ClinicoGeral extends Medico {
    public ClinicoGeral() {}

    public ClinicoGeral(String nome, String numeroCPF, Double salarioBase, String turnoServico, String numeroCRM) {
        super(nome, numeroCPF, salarioBase, turnoServico, numeroCRM);
    }

    @Override
    public String realizarDiagnostico() {
        return null;
    }
}
