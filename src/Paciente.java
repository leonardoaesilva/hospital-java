public class Paciente extends Pessoa {
    private boolean isEmObservacao;

    public Paciente() {}

    public Paciente(String nome, String numeroCPF) {
        super(nome, numeroCPF);
        this.isEmObservacao = false;
    }

    @Override
    public void darEntrada() {
        isEmObservacao = true;
    }

    public boolean isEmObservacao() {
        return isEmObservacao;
    }

    public void setEmObservacao(boolean emObservacao) {
        isEmObservacao = emObservacao;
    }
}
