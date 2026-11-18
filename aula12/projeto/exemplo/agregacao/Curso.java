package exemplo.agregacao;

public class Curso {
    private String nome;
    private int duracao;
    private Sala sala;

    public Curso(String nome, int duracao, Sala sala) {
        this.nome = nome;
        this.duracao = duracao;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
