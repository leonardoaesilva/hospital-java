public class Funcionario extends Pessoa {
    boolean isTrabalhando;

    @Override
    public void darEntrada() {
        isTrabalhando = true;
    }
}
