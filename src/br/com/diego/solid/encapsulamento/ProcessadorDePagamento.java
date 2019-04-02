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
