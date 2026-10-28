package biblioteca.ifpi;

public class Exemplar {

    private String descricao;
    private String tipo;
    private double valor;
    private boolean emprestado;

    public Exemplar(String descricao, String tipo, double valor, boolean emprestado) {
        this.descricao = descricao;
        this.tipo = tipo;
        if(valor<=2.0) {
            this.valor = valor;
        }else{
            System.out.println("Valor inválido (máx. 2.0 reais)");
            this.valor = 2.0;
        }
        this.emprestado = emprestado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public void mostrarInfoExemplar(){
        System.out.println("Informações do Exemplar: ");
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Emprestado: " + this.isEmprestado());
    }
}
