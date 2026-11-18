package sistemacorrida;

public class Resultado {

    private String tempoFinal;
    private String situacao;

    public Resultado(String tempoFinal, String situacao) {
        this.tempoFinal = tempoFinal;
        this.situacao = situacao;
    }

    public String getTempoFinal() {
        return tempoFinal;
    }

    public void setTempoFinal(String tempoFinal) {
        this.tempoFinal = tempoFinal;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
