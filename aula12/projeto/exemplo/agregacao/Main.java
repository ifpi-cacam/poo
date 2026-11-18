package exemplo.agregacao;

public class Main {

    public static void main(String[] args) {

        // Exemplo de Agregação
        // O objeto sala s1 agrega o objeto c1
        Sala s1 = new Sala("Sala de Artes", "Dep-01");
        Curso c1 = new Curso("POO", 20, s1);
        // O objeto s1 não necessariamente precisa estar vinculado somente ao curso c1
        Curso c2 = new Curso("Redes de Computadores", 30, s1);
    }

}
