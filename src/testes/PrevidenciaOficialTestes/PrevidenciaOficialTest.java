/*
package testes.PrevidenciaOficialTestes;
import model.cadastro.Cadastro;
import model.cadastro.Deducao;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PrevidenciaOficialTest {
    private Cadastro cadastro = new Cadastro();
    @Test
    public void testeCadastroPrevOficial() throws Exception{
        cadastro.cadastrarPrevidenciaOficial("Contribuição compulsoria", 1000f);
        assertEquals(1000f, cadastro.deducao.getTotalDeducaoPrevidenciaOficial(),0f);
    }

    @Test
    public void testeCadastroPrevOficialDOIS() throws Exception{
        cadastro.cadastrarPrevidenciaOficial("Contribuição compulsoria", 500f);
        assertEquals(500f, cadastro.deducao.getTotalDeducaoPrevidenciaOficial(),0f);
    }

    @Test
    public void testeCadastroDUASrevOficialDOIS() throws Exception{
        cadastro.cadastrarPrevidenciaOficial("Contribuição compulsoria", 500f);
        cadastro.cadastrarPrevidenciaOficial("Carnê INSS", 600f);
        assertEquals(1100f, cadastro.deducao.getTotalDeducaoPrevidenciaOficial(),0f);
    }

    @Test
    public void testeCadastroTRESrevOficialDOIS() throws Exception{
        simul.cadastrarPrevidenciaOficial("Contribuição compulsoria", 1000f);
        simul.cadastrarPrevidenciaOficial("Carnê INSS", 2000f);
        simul.cadastrarPrevidenciaOficial("Carnê INSS 2", 3000f);
        assertEquals(6000f, simul.getTotalDeducaoPrevidenciaOficial(),0f);
    }

    @Test(expected = DescricaoEmBrancoException.class)
    public void testeDescEmBranco() throws Exception {
        simul.cadastrarPrevidenciaOficial(" ", 1000f);

    }

    @Test(expected = ValorDeducaoInvalidoException.class)
    public void testeValorMenorOuIgualZero() throws Exception {
        simul.cadastrarPrevidenciaOficial(" Carnê", 0f);

    }
}
*/
