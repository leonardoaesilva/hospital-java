public class Main {
    public static void main(String[] args) {
        Atendente f1 = new Atendente("Nome", "CPF", 2345.0, "Manhã", 42);
        System.out.println(f1.isEmServico());
        f1.baterPonto();
        System.out.println(f1.isEmServico());
        f1.baterPonto();
        System.out.println(f1.isEmServico());
        System.out.println(f1.getLinhaRamal());
    }
}