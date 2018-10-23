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

public class ContaComum {

    private final ManipuladorDeSaldo manipulador;

    public ContaComum() {
        this.manipulador = new ManipuladorDeSaldo();
    }

    public void rende() {
        this.manipulador.rende(1.1);
    }

    public void saca(double valor) {
        manipulador.saca(valor);
    }

    public void deposita(double valor) {
        manipulador.deposita(valor);
    }

    public double getSaldo() {
        return manipulador.getSaldo();
    }

}
