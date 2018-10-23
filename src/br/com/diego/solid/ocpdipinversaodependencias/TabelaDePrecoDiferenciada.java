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
