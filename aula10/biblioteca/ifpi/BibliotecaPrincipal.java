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
