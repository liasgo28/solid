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
     * Cria uma nova instância de cargo.
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
