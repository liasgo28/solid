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
