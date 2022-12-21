package testes.CalculoImpostosTestes;

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
    public void calculoTotalImpostosDuplicacao() {
        float baseDeCalculo = 1000f;
        assertEquals(10f, calculo.calculaImposto(baseDeCalculo), 0f);

        baseDeCalculo = 100f;
        assertEquals(0f, calculo.calculaImposto(baseDeCalculo), 0f);
    }
}
