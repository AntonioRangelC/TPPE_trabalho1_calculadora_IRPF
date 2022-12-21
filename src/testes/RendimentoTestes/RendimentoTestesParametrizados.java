package testes.RendimentoTestes;
import static org.junit.Assert.assertEquals;

import model.cadastro.Cadastro;
import model.cadastro.Rendimento;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RendimentoTestesParametrizados {
    private Cadastro cadastro;

    Object[][] rendimentos;
    float valorTotal;

    @Before
    public void setuUp() {
        cadastro = new Cadastro();
    }

    public  RendimentoTestesParametrizados(Object[][] rendimentos, float valorTotal) {
        this.rendimentos = rendimentos;
        this.valorTotal = valorTotal;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Object[][] valores = new Object[][] {
                {new Object[][]{
                        {"Salário empresa",5000f}
                }, 5000f},
                {new Object[][]{
                        {"Aluguel",500f},
//                        {"Salário Mensal",3800f}
                }, 500f},
                {new Object[][]{
                        {"Salário",1800f},
//                        {"Pensão",200f},
//                        {"Dividendos",200f}
                }, 1800f},
                {new Object[][]{
                        {"Salário",700f},
                }, 700f},
                {new Object[][]{
                        {"Salário",120035f},
                }, 120035f},
        };
        return Arrays.asList(valores);
    }

    @Test
    public void testeRendimentos() throws Exception {
        for (Object[] rend : rendimentos) {
            cadastro.cadastrarRendimento((String) rend[0], (float) rend[1]);
            assertEquals(valorTotal, cadastro.rendimento.getTotalRendimentos(), 0f);
            cadastro.rendimento.rendimentos.clear();
        }

//        for (int i=0; i<rendimentos.length-1; i++) {
//            for (int j=0; j<rendimentos[i].length; j+=2) {
//                int aux = j+1;
//                cadastro.cadastrarRendimento((String) rendimentos[i][j], (float) rendimentos[i][aux]);
//                aux = 0;
//            }
//            assertEquals(valorTotal, cadastro.rendimento.getTotalRendimentos(), 0f);
//            cadastro.rendimento.rendimentos.clear();
//        }
    }
}
