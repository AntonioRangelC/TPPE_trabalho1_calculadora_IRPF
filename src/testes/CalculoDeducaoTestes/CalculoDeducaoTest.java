
package testes.CalculoDeducaoTestes;

import model.cadastro.Cadastro;
import model.cadastro.Deducao;
import model.cadastro.Rendimento;
import model.calculo.Calculo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class CalculoDeducaoTest {

    Calculo dedu;
    Cadastro cadastro = new Cadastro();
    Deducao deducao = new Deducao();

    @Before
    public void setup() {
        dedu = new Calculo();
    }



    @Test
    public void testCalculo1(){
        Deducao deducao = new Deducao("Previdência", 200f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Salário", 10000f);
        Rendimento.rendimentos.add(rendimento);


        dedu.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());
        assertEquals(9800f, dedu.getTotalDeducoes(), 0f);

    }


    @Test
    public void testCalculo3(){
        Deducao deducao = new Deducao("Pensão", -400f);
        Deducao.deducoes.add(deducao);

        Rendimento rendimento = new Rendimento("Aluguel", -2000f);
        Rendimento.rendimentos.add(rendimento);

        dedu.calcularDeducoes(Deducao.getDeducoes(),Rendimento.getRendimentos());

        assertEquals(0f, (dedu.calcularDeducoes(Deducao.getDeducoes(), Rendimento.getRendimentos())), 0f);
    }

}
