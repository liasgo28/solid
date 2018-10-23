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
package br.com.diego.solid.ocpdipinversaodependencias;

public class TabelaDePrecoDiferenciada implements TabelaDePreco {
    @Override
    public double descontoPara(double valor) {
        if (valor > 10000)
            return 0.03;
        if (valor > 100000)
            return 0.05;
        return 0;
    }
}
