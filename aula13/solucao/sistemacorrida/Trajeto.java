package sistemacorrida;

public class Trajeto {

    private String nome;
    private double distancia;
    private String local;

    public Trajeto(String nome, double distancia, String local) {
        this.nome = nome;
        this.distancia = distancia;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
