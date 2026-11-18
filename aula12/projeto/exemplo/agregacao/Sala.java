package exemplo.agregacao;

public class Sala {
    private String nomeSala;
    private String localSala;

    public Sala(String nomeSala, String localSala) {
        this.nomeSala = nomeSala;
        this.localSala = localSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public String getLocalSala() {
        return localSala;
    }

    public void setLocalSala(String localSala) {
        this.localSala = localSala;
    }
}
