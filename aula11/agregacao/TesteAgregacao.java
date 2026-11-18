package compras.agregacao;

/**
 *
 * @author nairon
 */
public class TesteAgregacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Data dt1 = new Data(10, 01, 2002);
        Data dt2 = new Data(02, 01, 1990);
        
        Produto p1  = new Produto("Arroz", 2.5, dt1);
        Cliente cl1 = new Cliente("José", 28, dt2);
        
        Compra cp = new Compra(cl1, p1, 5);
        
        System.out.println("Informações da Compra: ");
        System.out.println("Nome do cliente: " + cp.getCli().getNome());
        System.out.println("Idade do cliente: " + cp.getCli().getIdade());        
        int dia = cp.getCli().getDtNasc().getDia();
        int mes = cp.getCli().getDtNasc().getMes();
        int ano = cp.getCli().getDtNasc().getAno();        
        System.out.println("Data de Nascimento do cliente: " 
                + dia + "/" + mes + "/" + ano);
        
        System.out.println("Nome do produto: " + cp.getProd().getNome());
        System.out.println("Quantidade: " + cp.getQuant());
        dia = cp.getProd().getValidade().getDia();
        mes = cp.getProd().getValidade().getMes();
        ano = cp.getProd().getValidade().getAno();                
        System.out.println("Data de Validade do produto: " 
                + dia + "/" + mes + "/" + ano);
        
        System.out.println("Valor total da compra: " + cp.getTotal());
        
        
    }
    
}
