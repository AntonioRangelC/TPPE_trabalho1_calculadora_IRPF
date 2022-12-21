package testes.DeducaoTestes;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import model.cadastro.Cadastro;
import model.cadastro.Deducao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DeducaoTestesParametrizados {
    private Cadastro cadastro;
    @Before
    public void setuUp() {
        cadastro = new Cadastro();

    }



    //Atributos do obj de teste
    Object[][] deducoes;
    float valorEsperado;


    //construtor obj de teste
    public DeducaoTestesParametrizados(Object[][] deducao,float valorEsperado) {
        this.deducoes=deducao;
        this.valorEsperado=valorEsperado;
    }

    @Parameters
    public static Collection<Object[]>getParametres(){


        Object[][]resposta = new Object[][] {
                { new Object[][]{
                        {"Previdencia",670f}
                }, 670f },

                {new Object[][]{
                        {"Previdencia",230f},
                }, 230f  },

                { new Object[][]{
                        {"Previdencia",3400f},
                        {"Funpresp",100f},
                }, 3500f },

                { new Object[][]{
                        {"Previdencia",4500f},
                        {"Funpresp",100f},
                        {"Funpresp 2",250f},
                }, 4850f },

        };

        return Arrays.asList(resposta);
    }




    @Test
    public void cadastroDeducoes() throws Exception {
        Deducao deducao_obj = new Deducao();
        for(Object[]deducao:deducoes) {
            Cadastro.cadastrarDeducao((String)deducao[0], (Float)deducao[1]);
        }
        assertEquals(valorEsperado, deducao_obj.getTotalDeducoes(),0f);
    }



}
