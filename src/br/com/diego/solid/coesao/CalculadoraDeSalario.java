/*
 * ====================================================================
 * Direitos de cópia pela BRASILPREV
 * 
 * Todos os direitos reservados.
 * 
 * Este sistema contém informações confidenciais e de propriedade da
 * BRASILPREV ("Informações Confidenciais").
 * Você não deve divulgar tais informações confidenciais e deve
 * usá-las somente em conformidade com os termos do contrato de licença
 * definidos pela BRASILPREV.
 * ==================================================================== 
 */

package br.com.diego.solid.coesao;

import br.com.diego.solid.comum.Funcionario;

public class CalculadoraDeSalario {
    public double calcula(Funcionario funcionario) {
        return funcionario.calculaSalario();

    }

}
