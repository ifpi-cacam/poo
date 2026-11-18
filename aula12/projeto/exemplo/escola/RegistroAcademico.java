package exemplo.escola;

public class RegistroAcademico {

    private double mediaGeral;
    private Data dtInicio;

    public RegistroAcademico(double mediaGeral, Data dtInicio) {
        this.mediaGeral = mediaGeral;
        // Exemplo de agregação
        this.dtInicio = dtInicio;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public Data getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Data dtInicio) {
        this.dtInicio = dtInicio;
    }
}
