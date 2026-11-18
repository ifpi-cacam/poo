package compras.composicao;

/**
 *
 * @author nairon
 */
public class TesteComposicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pedido pedido = new Pedido("Arroz", 4, 2.5);
        
        System.out.println("Valor total do pedido: " + pedido.getValor());
        System.out.println("Nome do produto: " + pedido.getItem().getNome());
        System.out.println("Preço do produto: " + pedido.getItem().getPreco());
        System.out.println("Quantidade do produto: " + pedido.getItem().getQuant());
                
    }
    
}
