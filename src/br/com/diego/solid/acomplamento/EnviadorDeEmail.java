package br.com.diego.solid.acomplamento;

public class EnviadorDeEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {
        System.out.println("Envia email");

    }

}
