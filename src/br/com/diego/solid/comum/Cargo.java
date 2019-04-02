package br.com.diego.solid.comum;

import br.com.diego.solid.coesao.CalculaDezOuVintePorcento;
import br.com.diego.solid.coesao.CalculaQuinzeOuVinteCincoPorcento;
import br.com.diego.solid.coesao.RegraDeCalculo;

/**
 * Enum Cargo.
 * 
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
