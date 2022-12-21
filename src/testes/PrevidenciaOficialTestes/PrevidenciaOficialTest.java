
package testes.PrevidenciaOficialTestes;
import excecoes.DescricaoEmBrancoException;
import excecoes.ValorDeducaoInvalidoException;
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
        cadastro.cadastrarPrevidenciaOficial("Contribuição da previdência", 3000f);
        cadastro.cadastrarPrevidenciaOficial("INSS", 100f);
        cadastro.cadastrarPrevidenciaOficial("Carnê INSS 2", 4000f);
        assertEquals(7100f, cadastro.deducao.getTotalDeducaoPrevidenciaOficial(),0f);
    }




    @Test(expected = ValorDeducaoInvalidoException.class)
    public void testeValorMenorOuIgualZero() throws Exception {
        cadastro.cadastrarPrevidenciaOficial(" INSS", 0f);

    }

    @Test(expected = DescricaoEmBrancoException.class)
    public void testeDescEmBranco() throws Exception {
        cadastro.cadastrarPrevidenciaOficial(" ", 1000f);

    }
}

