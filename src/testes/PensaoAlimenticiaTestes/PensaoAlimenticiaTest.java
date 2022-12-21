package testes.PensaoAlimenticiaTestes;

import excecoes.DescricaoEmBrancoException;
import excecoes.ValorDeducaoInvalidoException;
import model.cadastro.*;
import model.cadastro.PensaoAlimenticia;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class PensaoAlimenticiaTest {
    private Cadastro cadastro = new Cadastro();


    @Test
    public void testeCadastraPensaoAlimenticia() throws Exception {
        cadastro.cadastraPensaoAlimenticia("Pensao do Antonio", 1549f);

        assertEquals(1549f, cadastro.deducao.getPensaoAlimenticia(), 0f);
    }

    @Test
    public void testDuasPensaoAlimenticia() throws Exception {
        cadastro.cadastraPensaoAlimenticia("Pensao Vitor",1000f);
        cadastro.cadastraPensaoAlimenticia("Pensao Lameque",1000f);
        assertEquals(2000f, cadastro.deducao.getPensaoAlimenticia(),0f);
    }

    @Test(expected = DescricaoEmBrancoException.class)
    public void testeDescEmBranco() throws Exception {
        cadastro.cadastraPensaoAlimenticia(" ", 1000f);

    }

    @Test(expected = ValorDeducaoInvalidoException.class)
    public void testeValorMenorOuIgualZero() throws Exception {
        cadastro.cadastraPensaoAlimenticia(" Pensão Luiza", 0f);

    }






}
