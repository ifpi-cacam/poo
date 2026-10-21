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

public class EmpregadoMain {

    public static void main(String[] args) {
        Empregado e1 = new Empregado("Maria", 200);
        Empregado e2 = new Empregado("Jose", 100);

        // Atributos e operações dos objetos Empregado
        System.out.println("Salario de " + e1.getNome()+ ": " + e1.getSalario());
        System.out.println("Salario de " + e2.getNome()+ ": " + e2.getSalario());

        // VR é um atributo estático - não pertence ao objeto, e sim à classe Empregado
        Empregado.vr = 3000;
        System.out.println("VR de " + e1.getNome()+ ": " + Empregado.vr);
        System.out.println("VR de " + e2.getNome()+ ": " + Empregado.vr);

        Empregado.vr = 5000;

        // Chamando uma operação estática da classe Empregado
        Empregado.mostrarValeRefeicao();

    }
}
