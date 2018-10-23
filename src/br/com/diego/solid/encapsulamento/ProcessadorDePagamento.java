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

import java.util.List;

public class ProcessadorDePagamento {
    public void processa(List<TipoPagamento> tiposPagamentos, Fatura fatura) {
        for (TipoPagamento tipoPagamento : tiposPagamentos) {
            Pagamento pagamento = new Pagamento(tipoPagamento.getValor(), tipoPagamento.getMeioPagamento());
            fatura.adicionaPagamento(pagamento);
        }

    }
}
