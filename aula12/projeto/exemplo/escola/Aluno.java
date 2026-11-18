package exemplo.escola;

public class Aluno {

    private String nome;
    private int idade;
    private RegistroAcademico ra;

    public Aluno(String nome, int idade, Data dtInicio, double mediaGeral) {
        this.nome = nome;
        this.idade = idade;
        // Exemplo de Composicao
        this.ra = new RegistroAcademico(mediaGeral, dtInicio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public RegistroAcademico getRa() {
        return ra;
    }

    public void setRa(RegistroAcademico ra) {
        this.ra = ra;
    }

    public String mostraData(){
        return ra.getDtInicio().getDia()+"/"+ra.getDtInicio().getMes()+"/"+ra.getDtInicio().getAno();
    }
}
