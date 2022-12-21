package testes.CalculoImpostosTestes;

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
public class CalculoImpostosTestesParametrizados {

    Object[][] deducaoERendimento;
    float valorEsperado;

    Calculo calculo;

    @Before
    public void setup() {
        calculo = new Calculo();

        Deducao.deducoes.clear();
        Rendimento.rendimentos.clear();
    }

    public CalculoImpostosTestesParametrizados(Object[][] deducaoERendimento, float valorEsperado) {
        this.deducaoERendimento = deducaoERendimento;
        this.valorEsperado = valorEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        Object[][] valores = new Object[][] {
                {new Object[][] {
                        {"Previdência", 200f, "Salário", 1400f}
                }, 0f},
                {new Object[][] {
                        {"Previdência", 0f, "Salário", 2437.40f}
                }, 40f},
                {new Object[][] {
                        {"Previdência", 102f, "Salário", 3000f}
                }, 79.9f},
                {new Object[][] {
                        {"Previdência", 101.5f, "Salário", 4000f}
                }, 241.03f},
                {new Object[][] {
                        {"Previdência", 1200f, "Salário", 10000f}
                }, 1550.64f}
        };
        return Arrays.asList(valores);
    }

    @Test
    public void testCalculoImposto() {
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
        calculo.calcularDeducoes(deducoes, rendimentos);
        calculo.calculaImposto();
    }

}
