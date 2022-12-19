package testes;

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
        dedu.calcularDeducoes(9800f);
        assertEquals(9800f, dedu.getTotalDeducoes(), 0f);
    }

}