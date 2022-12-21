package testes.DeducaoTestes;
import excecoes.DescricaoEmBrancoException;
import excecoes.ValorDeducaoInvalidoException;
import model.cadastro.Cadastro;
import model.cadastro.Deducao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class DeducaoTest {
    private Cadastro cadastro;
    private Deducao deducao = new Deducao();

    @Before
    public void setup(){
        cadastro = new Cadastro();
    }

    @Test
    public void testeCadastraDeducaoUm() throws Exception {
        Cadastro.cadastrarDeducao("Previdencia privada", 1000f);

        assertEquals(1000f, deducao.getTotalDeducoes(),0f);
    }
    @Test
    public void testeCadastraDeducaoDois() throws Exception {
        Cadastro.cadastrarDeducao("Previdencia privada", 1300f);

        assertEquals(1300f, deducao.getTotalDeducoes(),0f);
    }

    @Test
    public void testeCadastraDuasDeducao() throws Exception {
        Cadastro.cadastrarDeducao("Previdencia privada", 1000f);
        Cadastro.cadastrarDeducao("Funpresp", 2000f);

        assertEquals(3000f, deducao.getTotalDeducoes(),0f);
    }

    @Test(expected = DescricaoEmBrancoException.class)
    public void testeDescEmBranco() throws Exception {
        cadastro.cadastrarPrevidenciaOficial(" ", 3010f);

    }

    @Test(expected = ValorDeducaoInvalidoException.class)
    public void testeValorMenorOuIgualZero() throws Exception {
        cadastro.cadastrarPrevidenciaOficial(" Funpresp", 0f);

    }

}
