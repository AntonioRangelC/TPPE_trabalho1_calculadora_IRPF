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
    public void calculoTotalImpostosFalsificado() {
        float baseDeCalculo = 2000f;

        assertEquals(100f, calculo.calculaImposto(baseDeCalculo), 0f);
    }
}
