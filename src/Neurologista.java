public final class Neurologista extends Medico {
    public Neurologista() {}

    public Neurologista(String nome, String numeroCPF, Double salarioBase, String turnoServico, String numeroCRM) {
        super(nome, numeroCPF, salarioBase, turnoServico, numeroCRM);
    }

    @Override
    public String realizarDiagnostico() {
        return null;
    }
}
