package exemplo.composicao;

public class Main {

    Cliente c1 = new Cliente("Maria Silva", 22, 200);
    Conta conta1 = c1.getConta();

    Cliente c2 = new Cliente("Pedro Jose", 30, 150);
    Conta conta2 = c2.getConta();
}
