public class SalaCirurgia extends Sala {
    private boolean alocada;

    public SalaCirurgia() {}

    public SalaCirurgia(String ala, String bloco) {
        super(ala, bloco);
    }

    @Override
    public void reservar(int dd, int mm, int aa) {
        if (isAlocada())
            System.out.println("Sala já reservada!");
        else if ((dd <= 0 || dd > 31) || (mm <= 0 || mm > 12) || (aa < 0 || aa > 99))
            System.out.println("Data inválida.");
        else {
            System.out.println("Sala reservada com sucesso para esta data.");
            setAlocada(true);
        }
    }

    public boolean isAlocada() {
        return alocada;
    }

    public void setAlocada(boolean alocada) {
        this.alocada = alocada;
    }
}
