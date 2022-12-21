package testes.CalculoImpostosTestes;

import model.cadastro.Deducao;
import model.cadastro.Rendimento;
import model.calculo.Calculo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculoImpostosTeste {

    Calculo calculo;
    @Before
    public void setup() {
        calculo = new Calculo();
    }

    @Test
    public void calculoTotalImpostosFaixa1() {
        Deducao deducao = new Deducao("Previdência", 200f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Salário", 1400f);
        Rendimento.rendimentos.add(rendimento);


        calculo.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(0f, calculo.calculaImposto(), 0f);
    }
}
