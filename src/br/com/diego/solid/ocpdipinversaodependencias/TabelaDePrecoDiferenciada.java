package br.com.diego.solid.ocpdipinversaodependencias;

public class TabelaDePrecoDiferenciada implements TabelaDePreco {
    @Override
    public double descontoPara(double valor) {
        if (valor > 10000)
            return 0.03;
        if (valor > 100000)
            return 0.05;
        return 0;
    }
}
