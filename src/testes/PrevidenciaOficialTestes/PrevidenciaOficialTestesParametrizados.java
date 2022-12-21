package testes.PrevidenciaOficialTestes;
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
public class PrevidenciaOficialTestesParametrizados {

    private Cadastro cadastro;

    @Before
    public void setup(){
        cadastro = new Cadastro();
    }

    Object[][] previdenciasOficiais;
    float valorEsperado;

    public PrevidenciaOficialTestesParametrizados(Object[][] previdenciasOficiais, float valorEsperado){
        this.previdenciasOficiais = previdenciasOficiais;
        this.valorEsperado = valorEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Object[][]resposta = new Object[][] {
                { new Object[][]{
                        {"Previdência Social", 450f}
                }, 450f} ,

                {new Object[][]{
                        {"Previdência Privada", 170f}
                }, 170f },

                {new Object[][] {
                        {"INSS", 300f},
                        {"Previdencia BRB", 400f},
                }, 700f },

                {new Object[][]{
                        {"INSS", 1000f},
                        {"Previdencia BRB", 980f},
                        {"Previdência Privada", 200f}
                }, 2180f },
        };

        return Arrays.asList(resposta);
    }

    @Test
    public void cadastroPensoesAlimenticias() throws Exception {

        for(Object[]previdenciaOficial:previdenciasOficiais){
            cadastro.cadastraPensaoAlimenticia((String) previdenciaOficial[0], (Float) previdenciaOficial[1]);
        }

        assertEquals(valorEsperado, cadastro.deducao.getPensaoAlimenticia(), 0f);
    }
}
