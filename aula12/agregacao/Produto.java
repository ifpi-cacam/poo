package compras.agregacao;

/**
 *
 * @author nairon
 */
public class Produto {
    
    private String nome;
    private double preco;
    private Data validade;

    public Produto(String nome, double preco, Data validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
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
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the validade
     */
    public Data getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(Data validade) {
        this.validade = validade;
    }

    
}
