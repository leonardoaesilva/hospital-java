import java.util.List;

public final class Neurologista extends Medico {
    public Neurologista() {}

    public Neurologista(String nome, String numeroCPF, Double salarioBase, String turnoServico, String numeroCRM) {
        super(nome, numeroCPF, salarioBase, turnoServico, numeroCRM);
    }

    @Override
    public String realizarDiagnostico(List<String> sintomas) {
        int contador = 0;

        for (int i = 0; i < sintomas.size(); i++) {
            if (sintomas.get(i).equals("Dor de cabeça") || sintomas.get(i).equals("Insônia") || sintomas.get(i).equals("Tontura"))
                contador++;
        }

        return "Do(s) " + sintomas.size() + " sintoma(s) apresentado(s), " + contador + " pode(m) ser sinal(is) de problema(s) psicológico(s).";
    }
}
