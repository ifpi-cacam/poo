/*
 * Plataforma 1.0
 * Copyright (c) 2024 M.I. - MONTREAL INFORMATICA S.A,
 * Inc. All Rights Reserved.
 *
 * Este software contém informações confidenciais e de propriedade da M.I. - MONTREAL INFORMATICA S.A.
 * ("Informações Confidenciais"). Você não deve divulgar qualquer tipo de
 * informações confidenciais e deve usá-las apenas, de acordo com os termos do
 * contrato de licença firmado com a MONTREAL.
 *
 * A MONTREAL não faz declarações ou garantias sobre a adequação do software,
 * expressa ou implicitamente, incluindo, mas não se limitando, a garantias de
 * comercialização, adequação para um determinado fim ou qualquer tipo de violação.
 *
 * A M.I. - MONTREAL INFORMATICA S.A. NÃO SERÁ RESPONSÁVEL POR
 * QUAISQUER DANOS SOFRIDOS PELO LICENCIADO EM DECORRÊNCIA DO USO, MODIFICAÇÃO
 * OU DISTRIBUIÇÃO DESTE SOFTWARE OU SEUS DERIVADOS.
 */
package empresa;

public class Empregado {

    // Site da disciplina -> https://ifpi-cacam.github.io/poo/
    // nairon.viana@ifpi.edu.br

    private String nome;
    private double salario;

    // O atributo vr é estático pois pertence à classe Empregado
    public static double vr = 1000;

    public Empregado(){

    }

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.vr = 1000;
    }

    public Empregado(String nome) {
        this.nome = nome;
        this.salario = 0;
        this.vr = 1000;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Operação/método estático pode ser acessado através da classe
    public static void mostrarValeRefeicao(){
        System.out.println("Valor do vale refeicao para TODOS os objetos Empregado: " + vr);
    }

}
