class Principal{

    public static void main(String args[]){
        System.out.println("Bem Vindo ao Java!");
        Conta c1 = new Conta();
        c1.deposito(1000);
        c1.mostraSaldo();
        c1.saque(100);
        c1.mostraSaldo();
        c1.saque(901);
        c1.mostraSaldo();
    }

}