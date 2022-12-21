package testes.DependentesTestes;

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
        //assertEquals();
    }

    @Test
    public void testeCadastraDependenteDois() throws Exception {
        cadastro.cadastraDependente("", "");
    }

}
