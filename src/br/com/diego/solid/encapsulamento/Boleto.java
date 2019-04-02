package br.com.diego.solid.encapsulamento;

public class Boleto implements TipoPagamento {
    private final double valor;

    public Boleto(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public MeioDePagamento getMeioPagamento() {
        return MeioDePagamento.BOLETO;
    }
}
