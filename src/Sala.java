public abstract class Sala {
    private String ala;
    private String bloco;

    public Sala() {}

    public Sala(String ala, String bloco) {
        this.ala = ala;
        this.bloco = bloco;
    }

    public abstract void reservar(int dd, int mm, int aa);

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
