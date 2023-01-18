import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private List<String> sintomas;

    public Paciente() {
        this.sintomas = new ArrayList<>();
    }

    public Paciente(String nome, String numeroCPF) {
        super(nome, numeroCPF);
        this.sintomas = new ArrayList<>();
    }

    public List<String> getSintomas() {
        return sintomas;
    }

//    public void setSintomas(List<String> sintomas) {
//        this.sintomas = sintomas;
//    }

    public void addSintoma(String descricao) {
        this.sintomas.add(descricao);
    }
}
