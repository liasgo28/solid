/*
 * ====================================================================
 * Direitos de c�pia pela BRASILPREV
 * 
 * Todos os direitos reservados.
 * 
 * Este sistema cont�m informa��es confidenciais e de propriedade da
 * BRASILPREV ("Informa��es Confidenciais").
 * Voc� n�o deve divulgar tais informa��es confidenciais e deve
 * us�-las somente em conformidade com os termos do contrato de licen�a
 * definidos pela BRASILPREV.
 * ==================================================================== 
 */
package br.com.diego.solid.acomplamento;

public class NotaFiscal {

    private int id;
    private double valorBruto;
    private double impostos;

    public NotaFiscal(int id, double valorBruto, double impostos) {
        this.id = id;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
    }

    public NotaFiscal(double valorBruto, double impostos) {
        this(0, valorBruto, impostos);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public double getValorLiquido() {
        return this.valorBruto - this.impostos;
    }

}