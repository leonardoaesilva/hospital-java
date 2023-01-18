public class Main {
    public static void main(String[] args) {
        Paciente pacienteA = new Paciente("Clovis", "120938124-00");
        Paciente pacienteB = new Paciente("Maura", "120938124-01");

        Atendente atendente = new Atendente("Regis", "102958729-18", 0.0, "Integral");
        Cirurgiao cirurgiao = new Cirurgiao("Paulo", "130954878-93", 0.0, "Manhã", "CRM/PA 683049");
        ClinicoGeral clinicoGeral = new ClinicoGeral("Rubens", "164573426-90", 0.0, "Tarde", "CRM/PR 192874");
        Neurologista neurologista = new Neurologista("Carla", "873429190-29", 0.0, "Noite", "CRM/CE 567238");

        atendente.iniciarAtendimento();

        pacienteA.adcSintoma("Coriza");
        pacienteA.adcSintoma("Dor de cabeça");
        pacienteA.adcSintoma("Fratura exposta");
        pacienteA.adcSintoma("Insônia");
        pacienteA.adcSintoma("Tontura");

        pacienteB.adcSintoma("Tontura");

        System.out.println("Sintomas de " + pacienteB.getNome() + ": " + pacienteB.getSintomas().toString());
        System.out.println(neurologista.realizarDiagnostico(pacienteB.getSintomas()));
        System.out.println(cirurgiao.realizarDiagnostico(pacienteB.getSintomas()));
        System.out.println(clinicoGeral.realizarDiagnostico(pacienteB.getSintomas()));
    }
}
