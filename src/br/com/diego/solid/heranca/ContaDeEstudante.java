package br.com.diego.solid.heranca;

public class ContaDeEstudante extends ContaComum {

    private final ManipuladorDeSaldo m;
    private int milhas;

    public ContaDeEstudante() {
        m = new ManipuladorDeSaldo();
    }

    @Override
    public void deposita(double valor) {
        m.deposita(valor);
        this.milhas += (int) valor;
    }

    public int getMilhas() {
        return milhas;
    }
}