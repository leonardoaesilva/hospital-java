public final class Cirurgiao extends Medico {
    public Cirurgiao() {}

    public Cirurgiao(String nome, String numeroCPF, Double salarioBase, String turnoServico, String numeroCRM) {
        super(nome, numeroCPF, salarioBase, turnoServico, numeroCRM);
    }

    @Override
    public String realizarDiagnostico() {
        return null;
    }
}
