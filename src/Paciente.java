public class Paciente extends Pessoa {
    boolean isPaciente;

    @Override
    public void darEntrada() {
        isPaciente = true;
    }
}
