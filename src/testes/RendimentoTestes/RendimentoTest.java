package testes.RendimentoTestes;
import excecoes.DescricaoEmBrancoException;
import excecoes.NomeEmBrancoException;
import excecoes.ValorDeducaoInvalidoException;
import excecoes.ValorRendimentoInvalidoException;
import model.cadastro.*;
import model.cadastro.PensaoAlimenticia;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class RendimentoTest {
    private Cadastro cadastro = new Cadastro();

    @Test
    public void testeCadastraRendimento() throws Exception{
        cadastro.cadastrarRendimento("Salário empresa", 5000f);
        assertEquals("Salário empresa", cadastro.rendimento.getDescricao());
        assertEquals(5000f, cadastro.rendimento.getValor(), 0f);
    }

    @Test(expected = ValorRendimentoInvalidoException.class)
    public void testeValorMenorQueZero() throws Exception {
        Validacao.validarValorRendimento(-1f);
    }

    @Test(expected = DescricaoEmBrancoException.class)
    public void testeDescricaoEmBranco() throws Exception {
        Validacao.validarDescricaoRendimento("");
    }


}
