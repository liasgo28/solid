package br.com.diego.solid.coesao;

import br.com.diego.solid.comum.Funcionario;

public class CalculaDezOuVintePorcento implements RegraDeCalculo {
    @Override
    public double calcula(Funcionario funcionario) {
        if (funcionario.getSalarioBase() > 3000.0) {
            return funcionario.getSalarioBase() * 0.8;
        }
        else {
            return funcionario.getSalarioBase() * 0.9;
        }
    }

}
