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
