package testes.DependentesTestes;

import excecoes.NomeEmBrancoException;
import model.cadastro.Dependente;
import org.junit.Before;
import model.cadastro.Cadastro;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DependentesTestesParametrizados {
    private Cadastro cadastro;
    Object[][] dependentes;
    ArrayList<String> nomeDependentes;

    @Before
    public void setuUp() {
        cadastro = new Cadastro();
    }

    public DependentesTestesParametrizados(Object[][] dependentes, ArrayList<String> nomeDependentes) {
        this.dependentes = dependentes;
        this.nomeDependentes = nomeDependentes;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        ArrayList<String> nomes1 = new ArrayList<String>();
        nomes1.add("Lameque Fernandes");
        ArrayList<String> nomes2 = new ArrayList<String>();
        nomes2.add("teste");
        ArrayList<String> nomes3 = new ArrayList<String>();
        nomes2.add("Antonio Rangel");
        nomes2.add("Vitor Diniz");
        nomes2.add("Ana Caroline");

        Object[][] valores = new Object[][] {
                {new Object[][] {
                        {"Lameque Fernandes", "22/05/2000"}
                }, nomes1},
                {new Object[][] {
                        {"Teste", "06/05/1984"}
                }, nomes2},
                {new Object[][] {
                        {"Antonio Rangel", "10/10/1999"},
                        {"Vitor Diniz", "07/02/1998"},
                        {"Ana Caroline", "11/09/2022"}
                }, nomes3}
        };
        return Arrays.asList(valores);
    }

    @Test
    public void testeDependentes() throws NomeEmBrancoException {
        ArrayList<String> nomeDosDependentes = new ArrayList<String>();
        for (Object[] dependente : dependentes) {
            cadastro.cadastraDependente((String)dependente[0], (String)dependente[1]);
            nomeDependentes.add(new String((String)dependente[0]));
        }

        for (int i=0; i < nomeDosDependentes.size(); i++) {
            assertEquals(nomeDosDependentes, cadastro.deducao.dependentes.get(i).getNomeDependente());
        }
    }
}
