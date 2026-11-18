package sistemacorrida;

public class Main {

    public static void main(String[] args) {

        // Objeto por agregação
        Corredor co = new Corredor("Pedro Sousa", "abc-123");
        // Objeto por agregação
        Trajeto tr = new Trajeto("Pista Circular", 200, "Campo Maior");
        // Objeto por composição
        Corrida cr = new Corrida(co, tr, "10min30s", "Concluído", "22/05/2026", "10h20m");

        Trajeto tr2 = new Trajeto("Pista com declive", 100, "Teresina");
        // Outra corrida
        Corrida cr_2 = new Corrida(co, tr2, "20min30s", "Pendente", "10/11/2026", "09h30m");
    }
}