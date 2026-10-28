package biblioteca.ifpi;

public class BibliotecaPrincipal {

    public static void main(String[] args) {

        Exemplar ex = new Exemplar("Material de POO", "Livro", 5.0, false);
        // System.out.println("Valor do exemplar: " + ex.getValor());

        Exemplar ex_ = new Exemplar("Material de ED", "Midia", 1.2, false);
        // System.out.println("Valor do exemplar: " + ex_.getValor());

        Estudante est = new Estudante("Maria", 22, "F", "Algoritmos");

        Emprestimo emp = new Emprestimo(est, ex_, 10, 30);
        emp.mostrarInfoEmprestimo();

    }
}
