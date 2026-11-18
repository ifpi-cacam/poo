package exemplo.composicao;

public class Cliente {

    private String nome;
    private int idade;
    private Conta conta;

    public Cliente(String nome, int idade, double saldo) {
        this.nome = nome;
        this.idade = idade;
        this.conta = new Conta(saldo);
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

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
