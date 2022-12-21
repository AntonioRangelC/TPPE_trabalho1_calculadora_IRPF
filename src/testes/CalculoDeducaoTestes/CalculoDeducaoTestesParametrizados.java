package testes.CalculoDeducaoTestes;
import model.cadastro.Deducao;
import model.cadastro.Rendimento;
import model.calculo.Calculo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculoDeducaoTestesParametrizados {
    Object[][] deducaoERendimento;
    float valorEsperado;

    Calculo dedu;

    @Before
    public void setup() {
        dedu = new Calculo();
    }

    public CalculoDeducaoTestesParametrizados(Object[][] deducaoERendimento, float valorEsperado) {
        this.deducaoERendimento = deducaoERendimento;
        this.valorEsperado = valorEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Object[][] valores = new Object[][] {
                {new Object[][] {
                        {"Previdência", 200f, "Salário", 10000f}
                }, 9800f},
                {new Object[][] {
                        {"Pensão", 400f, "Aluguel", 2000f}
                }, 1600f},
                {new Object[][] {
                        {"Pensão", -400f, "Aluguel", -2000f}
                }, 0f}
        };
        return Arrays.asList(valores);
    }


    @Test
    public void testCalculoDeducao() {
        ArrayList<Rendimento> rendimentos = new ArrayList<Rendimento>();
        ArrayList<Deducao> deducoes = new ArrayList<Deducao>();

        for (Object[] deduRendi : deducaoERendimento) {
            if (deduRendi[0] != null && deduRendi[1] != null) {
                deducoes.add(new Deducao((String) deduRendi[0], (float)deduRendi[1]));
            }
            if (deduRendi[2] != null && deduRendi[3] != null) {
                rendimentos.add(new Rendimento((String)deduRendi[2], (float)deduRendi[3]));
            }

        }
        dedu.calcularDeducoes(deducoes, rendimentos);
    }
}
