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
    public void testCalculo(){
        Deducao deducao = new Deducao("Previdência", 200f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Salário", 10000f);
        Rendimento.rendimentos.add(rendimento);


        dedu.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(9800f, dedu.getTotalDeducoes(), 0f);
    }

}