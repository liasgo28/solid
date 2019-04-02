package br.com.diego.solid.acomplamento;

public class NotaFiscalDao implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Nota fical DAO");

    }

}
