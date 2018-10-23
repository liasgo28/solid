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
package br.com.diego.solid.heranca;

public class ContaDeEstudante extends ContaComum {

    private final ManipuladorDeSaldo m;
    private int milhas;

    public ContaDeEstudante() {
        m = new ManipuladorDeSaldo();
    }

    @Override
    public void deposita(double valor) {
        m.deposita(valor);
        this.milhas += (int) valor;
    }

    public int getMilhas() {
        return milhas;
    }
}