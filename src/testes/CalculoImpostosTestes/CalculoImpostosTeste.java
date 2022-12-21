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

        Deducao.deducoes.clear();
        Rendimento.rendimentos.clear();
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

    @Test
    public void calculoTotalImpostosFaixa2() {
        Deducao deducao = new Deducao("Previdência", 0f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Salário", 2437.40f);
        Rendimento.rendimentos.add(rendimento);


        calculo.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(40f, calculo.calculaImposto(), 0.0099f);
    }

    @Test
    public void calculoTotalImpostosFaixa3() {
        Deducao deducao = new Deducao("Previdência", 102f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Salário", 3000f);
        Rendimento.rendimentos.add(rendimento);


        calculo.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(79.9f, calculo.calculaImposto(), 0.0099f);
    }

    @Test
    public void calculoTotalImpostosFaixa4() {
        Deducao deducao = new Deducao("Previdência", 101.5f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Salário", 4000f);
        Rendimento.rendimentos.add(rendimento);


        calculo.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(241.03f, calculo.calculaImposto(), 0.0099f);
    }

    @Test
    public void calculoTotalImpostosFaixa5() {
        Deducao deducao = new Deducao("Previdência", 1200f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Salário", 10000f);
        Rendimento.rendimentos.add(rendimento);


        calculo.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(1550.64f, calculo.calculaImposto(), 0.0099f);
    }
}
