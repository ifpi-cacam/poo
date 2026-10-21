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

public class Reserva {

    private int codigo;
    private String dataEntrada;
    private String dataSaida;
    private Cliente cliente;
    private Quarto quarto;

    public Reserva(int codigo,
                   String dataEntrada,
                   String dataSaida,
                   Cliente cliente,
                   Quarto quarto) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.cliente = cliente;
        this.quarto = quarto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public void resumeReserva(){
        System.out.println("Informações da reserva");
        System.out.println("Codigo " + this.getCodigo());
        System.out.println("Data de Entrada " + this.getDataEntrada());
        System.out.println("Data de Saida " + this.getDataSaida());
        cliente.resumoCliente();
        quarto.resumoQuarto();
    }
}
