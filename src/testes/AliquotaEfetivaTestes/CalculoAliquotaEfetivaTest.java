package testes.AliquotaEfetivaTestes;

import model.cadastro.Deducao;
import model.cadastro.Rendimento;
import model.calculo.Calculo;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Before;
import model.cadastro.Cadastro;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class CalculoAliquotaEfetivaTest {
    Calculo calculo;
    Rendimento rendimento_obj = new Rendimento();
    Deducao deducao_obj = new Deducao();
    Cadastro cadastro = new Cadastro();

    Object[][] rendimentos;
    Object[][] deducoes;
    private float aliquotaEfetivaEsperado;

    public CalculoAliquotaEfetivaTest(Object[][] rendimentos, Object[][] deducoes, float aliquotaEfetivaEsperado){
        this.rendimentos = rendimentos;
        this.deducoes = deducoes;
        this.aliquotaEfetivaEsperado = aliquotaEfetivaEsperado;
    }

    @Before
    public void setup(){
        calculo = new Calculo();
    }

    @Parameterized.Parameters
    public static Iterable getParameters() {
        Object[][] dados = new Object[][] {
                { new Object[][] {
                        {"Aluguel", 2903.98f },
                }, new Object[][] {
                        {"Aluguel Deducao", 1000f},
                }, 0f },
                { new Object[][] {
                        {"Aluguel", 5664.68f },
                }, new Object[][] {
                        {"Aluguel Deducao", 500f},
                }, 9.72f },
                { new Object[][] {
                        {"Salario", 5664.68f },
                }, new Object[][] {
                        {"Salario Deducao", 1000f},
                }, 7.29f },
                { new Object[][] {
                        {"Pensao", 4751.05f },
                }, new Object[][] {
                        {"Pensao Deducao", 1000f},
                }, 4.37f },
                { new Object[][] {
                            {"Imovel", 3826.65f },
                }, new Object[][] {
                        {"Imovel Deducao", 1000f},
                }, 1.8f},
                { new Object[][] {
                        { "Pensao", 1913.33f },
                        { "Imovel" , 1913.32f }
                }, new Object[][] {
                        {"Pensao Deducao", 500f},
                        {"Imovel Deducao", 500f}
                }, 0f},
        };

        return Arrays.asList(dados);
    }

    @Test
    public void Test() throws Exception{
        for (Object[] rendimento : rendimentos) {
            cadastro.cadastrarRendimento((String)rendimento[0], (float)rendimento[1]);
        }
        for (Object[] deducao : deducoes) {
            Cadastro.cadastrarDeducao((String)deducao[0], (float)deducao[1]);
        }
        calculo.calcularDeducoes(Deducao.getDeducoes(), Rendimento.getRendimentos());
        calculo.calculaImposto();
        calculo.setAliquotaEfetiva();
        assertEquals(this.aliquotaEfetivaEsperado, calculo.getAliquotaEfetiva(), 2f);
        Deducao.deducoes.clear();
        Rendimento.rendimentos.clear();

    }

}
