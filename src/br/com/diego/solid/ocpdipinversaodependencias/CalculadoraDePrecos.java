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

public class CalculadoraDePrecos {
    private final TabelaDePreco tabelaDePreco;
    private final ServicoDeEntrega servicoEntrega;

    public CalculadoraDePrecos(TabelaDePreco tabelaDePreco, ServicoDeEntrega servicoEntrega) {
        this.tabelaDePreco = tabelaDePreco;
        this.servicoEntrega = servicoEntrega;
    }

    public double calcula(Compra produto) {

        double desconto = this.tabelaDePreco.descontoPara(produto.getValor());
        double frete = this.servicoEntrega.para(produto.getCidade());

        return (produto.getValor() * (1 - desconto)) + frete;
    }
}
