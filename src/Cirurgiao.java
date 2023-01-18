import java.util.List;

public final class Cirurgiao extends Medico {
    public Cirurgiao() {}

    public Cirurgiao(String nome, String numeroCPF, Double salarioBase, String turnoServico, String numeroCRM) {
        super(nome, numeroCPF, salarioBase, turnoServico, numeroCRM);
    }

    @Override
    public String realizarDiagnostico(List<String> sintomas) {
        int contador = 0;

        if (sintomas.contains("Fratura exposta") || sintomas.contains("Ligamento rompido") || sintomas.contains("Osso quebrado"))
            contador++;

        return contador + " cirurgia(s) deve(m) ser marcada(s).";
    }
}
