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
        Deducao.deducoes.clear();
        Deducao.valorTotalOutrasDeducoes = 0;
        Cadastro.cadastrarDeducao("Previdencia privada", 1000f);

        assertEquals(1000f, Deducao.getValorTotalOutrasDeducoes(),0f);
    }


    @Test
    public void testeCadastraDuasDeducao() throws Exception {
        Deducao.deducoes.clear();
        Cadastro.cadastrarDeducao("Previdencia privada", 1500f);
        Cadastro.cadastrarDeducao("Funpresp", 2000f);

        assertEquals(3500f, Deducao.getValorTotalOutrasDeducoes(),0f);
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
