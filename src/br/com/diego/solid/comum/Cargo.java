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

package br.com.diego.solid.comum;

import br.com.diego.solid.coesao.CalculaDezOuVintePorcento;
import br.com.diego.solid.coesao.CalculaQuinzeOuVinteCincoPorcento;
import br.com.diego.solid.coesao.RegraDeCalculo;

/**
 * Enum Cargo.
 * 
 * @author Diego Rodrigues do Nascimento (P51701802)
 */
public enum Cargo {

    /** desenvolvedor. */
    DESENVOLVEDOR(new CalculaDezOuVintePorcento()),

    /** dba. */
    DBA(new CalculaDezOuVintePorcento()),

    /** tester. */
    TESTER(new CalculaQuinzeOuVinteCincoPorcento());

    /** regra. */
    private RegraDeCalculo regra;

    /**
     * Cria uma nova inst�ncia de cargo.
     * 
     * @param regra do tipo RegraDeCalculo
     */
    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    /**
     * Retorna o regra.
     * 
     * @return regra
     */
    public RegraDeCalculo getRegra() {
        return regra;
    }
}
