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
package br.com.diego.solid.encapsulamento;

public class Boleto implements TipoPagamento {
    private final double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public MeioDePagamento getMeioPagamento() {
        return MeioDePagamento.BOLETO;
    }
}
