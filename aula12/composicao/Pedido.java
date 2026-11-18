package compras.composicao;

/**
 *
 * @author nairon
 */
public class Pedido {
    
    private ItemProduto item;
    private double valor;

    public Pedido(String nome, int quant, double preco) {
        this.item = new ItemProduto(nome, quant, preco);
        this.valor = item.getQuant() * item.getPreco();
    }

    /**
     * @return the item
     */
    public ItemProduto getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(ItemProduto item) {
        this.item = item;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
        
    
}
