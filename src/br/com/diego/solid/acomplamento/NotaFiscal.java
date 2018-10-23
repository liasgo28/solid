/*
 * ====================================================================
 * Direitos de cópia pela BRASILPREV
 * 
 * Todos os direitos reservados.
 * 
 * Este sistema contém informações confidenciais e de propriedade da
 * BRASILPREV ("Informações Confidenciais").
 * Você não deve divulgar tais informações confidenciais e deve
 * usá-las somente em conformidade com os termos do contrato de licença
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