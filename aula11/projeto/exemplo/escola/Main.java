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
package exemplo.escola;

public class Main {

    public static void main(String[] args) {

        Data dt1 = new Data(22, 10, 2025);
        // Entre Data e RegistroAcademico --> Agregação
        // Entre RegistroAcademico e Aluno --> Composição
        Aluno al1 = new Aluno("Maria", 22, dt1, 7.5);
        Aluno al2 = new Aluno("Maria", 30, dt1, 4.5);

        System.out.println("Data para os 2 rAs: " + dt1.getDia()+"/"+dt1.getMes()+"/"+dt1.getAno());
        System.out.println("Registro Academico do Aluno 1 (media): " + al1.getRa().getMediaGeral() );
        System.out.println("Registro Academico do Aluno 1 (data): " + al1.mostraData());
        System.out.println("Registro Academico do Aluno 2 (media): " + al2.getRa().getMediaGeral() );
        System.out.println("Registro Academico do Aluno 2 (data): " + al2.mostraData());

    }

}
