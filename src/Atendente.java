public class Atendente extends Funcionario {
    private boolean emAtendimento;

    public Atendente() {}

    public Atendente(String nome, String numeroCPF, Double salarioBase, String turnoServico) {
        super(nome, numeroCPF, salarioBase, turnoServico);
        this.emAtendimento = false;
    }

    public void iniciarAtendimento() {
        if (isEmAtendimento())
            System.out.println("Atendentes indisponíveis no momento. Aguarde para ser atendido.");
        else {
            System.out.println("Dirija-se ao balcão de atendimento.");
            setEmAtendimento(true);
        }
    }

    public boolean isEmAtendimento() {
        return emAtendimento;
    }

    public void setEmAtendimento(boolean emAtendimento) {
        this.emAtendimento = emAtendimento;
    }
}
