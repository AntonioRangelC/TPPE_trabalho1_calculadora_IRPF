package testes.PensaoAlimenticiaTestes;

import model.cadastro.Cadastro;
import model.cadastro.Deducao;
import model.cadastro.PensaoAlimenticia;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PensaoAlimenticiaTestesParametrizados{
    private Cadastro cadastro;

    @Before
    public void setup(){
        cadastro = new Cadastro();
    }

    Object[][] pensoesAlimenticias;
    float valorEsperado;

    public PensaoAlimenticiaTestesParametrizados(Object[][] pensaoAlimenticia, float valorEsperado){
        this.pensoesAlimenticias = pensaoAlimenticia;
        this.valorEsperado = valorEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Object[][]resposta = new Object[][] {
                { new Object[][]{
                        {"Pensao do Antonio", 100f}
                }, 100f} ,

                {new Object[][]{
                        {"Pensao do Lameque", 500f}
                }, 500f },

                {new Object[][] {
                        {"Pensao do Vitor", 1500f},
                        {"Pensao do Rafa", 1400f},
                }, 2900f },

                {new Object[][]{
                        {"Pensao do Joao", 300f},
                        {"Pensao do jorge", 340f},
                        {"Pensao do pedro", 400f}
                }, 1040f },
        };

        return Arrays.asList(resposta);
    }

    @Test
    public void cadastroPensoesAlimenticias() throws Exception {

        for(Object[]pensaoAlimenticia:pensoesAlimenticias){
           cadastro.cadastraPensaoAlimenticia((String) pensaoAlimenticia[0], (Float) pensaoAlimenticia[1]);
        }

        assertEquals(valorEsperado, cadastro.deducao.getPensaoAlimenticia(), 0f);
    }
}
