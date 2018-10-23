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