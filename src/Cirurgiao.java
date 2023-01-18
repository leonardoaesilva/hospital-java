import java.util.List;

public final class Cirurgiao extends Medico {
    private Integer qtdCirurgias;
    private SalaCirurgia sala;

    public Cirurgiao() {
        this.qtdCirurgias = 0;
    }

    public Cirurgiao(String nome, String numeroCPF, Double salarioBase, String turnoServico, String numeroCRM, SalaCirurgia sala) {
        super(nome, numeroCPF, salarioBase, turnoServico, numeroCRM);
        this.qtdCirurgias = 0;
        this.sala = sala;
    }

    @Override
    public String realizarDiagnostico(List<String> sintomas) {
        if (sintomas.contains("Fratura exposta") || sintomas.contains("Ligamento rompido") || sintomas.contains("Osso quebrado"))
            qtdCirurgias++;

        return qtdCirurgias + " cirurgia(s) deve(m) ser marcada(s).";
    }

    public Integer getQtdCirurgias() {
        return qtdCirurgias;
    }

    public void setQtdCirurgias(Integer qtdCirurgias) {
        this.qtdCirurgias = qtdCirurgias;
    }

    public SalaCirurgia getSala() {
        return sala;
    }

    public void setSala(SalaCirurgia sala) {
        this.sala = sala;
    }
}
