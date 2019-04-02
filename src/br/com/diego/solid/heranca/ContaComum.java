package br.com.diego.solid.heranca;

public class ContaComum {

    private final ManipuladorDeSaldo manipulador;

    public ContaComum() {
        this.manipulador = new ManipuladorDeSaldo();
    }

    public void rende() {
        this.manipulador.rende(1.1);
    }

    public void saca(double valor) {
        manipulador.saca(valor);
    }

    public void deposita(double valor) {
        manipulador.deposita(valor);
    }

    public double getSaldo() {
        return manipulador.getSaldo();
    }

}
