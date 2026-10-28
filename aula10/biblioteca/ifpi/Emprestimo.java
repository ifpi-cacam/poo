package biblioteca.ifpi;

public class Emprestimo {

    public static final double multaFixa = 2.0;

    private Estudante es;
    private Exemplar ex;
    private boolean atrasado;
    private int periodo;
    private int periodoReal;
    private double valorTotal;

    public Emprestimo(Estudante es,
                      Exemplar ex,
                      int periodo,
                      int periodoReal) {

        if(ex.isEmprestado()==false) {
            this.es = es;
            this.ex = ex;
            if (periodo >= 7 && periodo <= 15) {
                this.periodo = periodo;
            } else {
                if (periodo > 15) {
                    this.periodo = 15;
                }
                if (periodo < 7) {
                    this.periodo = 7;
                }
            }
            this.periodoReal = periodoReal;
            if (periodoReal > periodo) {
                atrasado = true;
            } else {
                atrasado = false;
            }
        }else{
            System.out.println("Não é possível criar o emprestimo - EXEMPLAR EMPRESADO");
        }
    }

    public void verificaAtrasado(){
        if(periodoReal>periodo){
            atrasado = true;
        }else{
            atrasado = false;
        }
    }

    public void calculaTotal(){
        verificaAtrasado();
        if(atrasado){
            valorTotal = 2.0 + 0.5*(periodoReal - periodo) + ex.getValor();
        }else{
            valorTotal = ex.getValor();
        }
    }

    public Estudante getEs() {
        return es;
    }

    public void setEs(Estudante es) {
        this.es = es;
    }

    public Exemplar getEx() {
        return ex;
    }

    public void setEx(Exemplar ex) {
        this.ex = ex;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getPeriodoReal() {
        return periodoReal;
    }

    public void setPeriodoReal(int periodoReal) {
        this.periodoReal = periodoReal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void mostrarInfoEmprestimo(){
        calculaTotal();
        System.out.println("Informações do Emprestimo: ");
        es.mostrarInfoAluno();
        ex.mostrarInfoExemplar();
        System.out.println("Atrasado: " + this.isAtrasado());
        System.out.println("Periodo: " + this.getPeriodo());
        System.out.println("Periodo Real: " + this.getPeriodoReal());
        System.out.println("Valor Total: " + this.getValorTotal());
    }
}
