package compras.agregacao;

/**
 *
 * @author nairon
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private Data dtNasc;

    public Cliente(String nome, int idade, Data dtNasc) {
        this.nome = nome;
        this.idade = idade;
        this.dtNasc = dtNasc;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the dtNasc
     */
    public Data getDtNasc() {
        return dtNasc;
    }

    /**
     * @param dtNasc the dtNasc to set
     */
    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }
    
}
