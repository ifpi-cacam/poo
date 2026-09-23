public class Conta{

    private char tipo;
    private double saldo;
    private String dataAbertura;

    public Conta(){}

    public void abrirConta(String dataAbertura){
       tipo = 'C'; 
       dataAbertura = "11/09/2026";
    }

    public void saque(double x){
        if(x<=saldo){
            saldo = saldo -x;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposito(double x){
        saldo = saldo + x;
    }

    public void mostraSaldo(){
        System.out.println("Saldo: " + saldo);
    }

}