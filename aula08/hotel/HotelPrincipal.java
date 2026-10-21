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
package hotel;

public class HotelPrincipal {

    public static void main(String[] args) {

        Cliente cli = new Cliente("Joana Silva", "+5586999999999");
        Quarto qua = new Quarto(123, "DUPLO", 235.55);

        Reserva res = new Reserva(123,
                "22-05-2026",
                "25-05-2026",
                cli, qua
        );

        System.out.println("Data de entrada da reserva: " + res.getDataEntrada());
        System.out.println("Data de saida da reserva: " + res.getDataSaida());
        System.out.println("Nome do cliente que reservou: " + res.getCliente().getNome());
        System.out.println("Tipo do quarto da reserva: " + res.getQuarto().getTipo());

        res.resumeReserva();
    }
}
