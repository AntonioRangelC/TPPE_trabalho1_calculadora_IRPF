package testes.DependentesTestes;

import excecoes.NomeEmBrancoException;
import model.cadastro.Cadastro;
import model.cadastro.Dependente;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DependentesTest {
    private Cadastro cadastro;
    private Dependente dependente = new Dependente();

    @Before
    public void setup() {
        cadastro = new Cadastro();
    }

    @Test
    public void testeCadastraDependenteUm() throws Exception {
        cadastro.cadastraDependente("Lameque Fernandes", "22/05/2000");
        assertEquals("Lameque Fernandes", cadastro.deducao.dependentes.get(0).getNomeDependente());
        assertEquals("22/05/2000", cadastro.deducao.dependentes.get(0).getDataDeNascimento());
    }

    @Test(expected = NomeEmBrancoException.class)
    public void testeCadastraDependenteDois() throws Exception {
        cadastro.cadastraDependente(" ", "22/05/2000");
        assertEquals(" ", cadastro.deducao.dependentes.get(0).getNomeDependente());
        assertEquals("22/05/2000", cadastro.deducao.dependentes.get(0).getDataDeNascimento());
    }

    @Test
    public void testeCadastraDependenteTres() throws Exception {
        cadastro.cadastraDependente("Antonio Rangel", "10/10/1999");
        assertEquals("Antonio Rangel", cadastro.deducao.dependentes.get(0).getNomeDependente());

        cadastro.cadastraDependente("Vitor Diniz", "07/02/1998");
        assertEquals("Vitor Diniz", cadastro.deducao.dependentes.get(1).getNomeDependente());

        cadastro.cadastraDependente("Ana Caroline", "11/09/2022");
        assertEquals("Ana Caroline", cadastro.deducao.dependentes.get(2).getNomeDependente());
    }

}
