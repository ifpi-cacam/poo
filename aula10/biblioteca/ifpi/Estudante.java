package biblioteca.ifpi;

public class Estudante {

    private String nome;
    private int idade;
    private String sexo;
    private String disciplina;

    public Estudante(String nome, int idade, String sexo, String disciplina) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.disciplina = disciplina;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void mostrarInfoAluno(){
        System.out.println("Informações do Aluno: ");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Disciplina: " + this.getDisciplina());
    }
}

