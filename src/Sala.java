public abstract class Sala {
    private boolean alocada;
    private String ala;
    private String bloco;

    public Sala() {
        this.alocada = false;
    }

    public Sala(String ala, String bloco) {
        this.alocada = false;
        this.ala = ala;
        this.bloco = bloco;
    }

    public abstract void reservar(int dd, int mm, int aa);

    public boolean isAlocada() {
        return alocada;
    }

    public void setAlocada(boolean alocada) {
        this.alocada = alocada;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
}
