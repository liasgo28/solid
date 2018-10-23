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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {
    private final String cliente;
    private final double valor;
    private final List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public boolean isPago() {
        return pago;
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        if (valorTotalDosPagamentos() >= this.getValor()) {
            this.pago = true;
        }
    }

    private double valorTotalDosPagamentos() {
        double total = 0;

        for (Pagamento p : pagamentos) {
            total += p.getValor();
        }
        return total;
    }
}
