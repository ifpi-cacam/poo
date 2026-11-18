package compras.agregacao;

/**
 *
 * @author nairon
 */
public class Compra {
    
    private Cliente cli;
    private Produto prod;
    private int quant;
    private double total;

    public Compra(Cliente cli, Produto prod, int quant) {
        this.cli = cli;
        this.prod = prod;
        this.quant = quant;
        this.total = this.quant*prod.getPreco();
    }

    /**
     * @return the cli
     */
    public Cliente getCli() {
        return cli;
    }

    /**
     * @param cli the cli to set
     */
    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    /**
     * @return the prod
     */
    public Produto getProd() {
        return prod;
    }

    /**
     * @param prod the prod to set
     */
    public void setProd(Produto prod) {
        this.prod = prod;
    }

    /**
     * @return the quant
     */
    public int getQuant() {
        return quant;
    }

    /**
     * @param quant the quant to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    
}
