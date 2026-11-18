package sistemacorrida;

public class Corrida {

    // Agregação
    private Corredor corr;
    // Agregação
    private Trajeto traj;
    // Composição
    private Resultado res;
    private String data;
    private String horario;

    public Corrida(Corredor corr,
                   Trajeto traj,
                   String tempoFinal,
                   String situacao,
                   String data,
                   String horario) {
        // Passa o objeto completo -> Agregação
        this.corr = corr;
        // Passa o objeto completo -> Agregação
        this.traj = traj;
        // Passo os atributos para a criação do objeto dentro do construtor -> Composição
        this.res = new Resultado(tempoFinal, situacao);
        this.data = data;
        this.horario = horario;
    }

    public Corredor getCorr() {
        return corr;
    }

    public void setCorr(Corredor corr) {
        this.corr = corr;
    }

    public Trajeto getTraj() {
        return traj;
    }

    public void setTraj(Trajeto traj) {
        this.traj = traj;
    }

    public Resultado getRes() {
        return res;
    }

    public void setRes(Resultado res) {
        this.res = res;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
