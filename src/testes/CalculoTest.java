package testes;

import model.cadastro.*;
import model.calculo.Calculo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculoTest {

    Calculo dedu;

    @Before
    public void setup() {
        dedu = new Calculo();
    }

    @Test
    public void testCalculo1(){
        Deducao deducao = new Deducao("Previdência", 200f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Salário", 10000f);
        Rendimento.rendimentos.add(rendimento);


        dedu.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(9800f, dedu.getTotalDeducoes(), 0f);

    }

    @Test
    public void testCalculo2(){
        Deducao deducao = new Deducao("Pensão", 400f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Aluguel", 2000f);
        Rendimento.rendimentos.add(rendimento);


        dedu.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(1600f, dedu.calcularDeducoes(Deducao.getDeducoes(), Rendimento.getRendimentos()), 0f);

    }

    @Test
    public void testCalculo3(){
        Deducao deducao = new Deducao("Pensão", -400f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Aluguel", -2000f);
        Rendimento.rendimentos.add(rendimento);

        dedu.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());

        assertEquals(true, (dedu.calcularDeducoes(Deducao.getDeducoes(), Rendimento.getRendimentos()) > 0.0));
    }

}