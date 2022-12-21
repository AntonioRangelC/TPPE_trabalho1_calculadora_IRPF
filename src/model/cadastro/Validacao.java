package model.cadastro;
import excecoes.*;

public class Validacao {

    public static void validarDescricaoDeducao(String descricao) throws DescricaoEmBrancoException{
        if(descricao == null){
            throw new DescricaoEmBrancoException();
        }
        else if(descricao.isEmpty()){
            throw new DescricaoEmBrancoException();
        }

    }

    public static void validarDescricaoRendimento(String descricao) throws DescricaoEmBrancoException{
        if(descricao == null){
            throw new DescricaoEmBrancoException();
        }
        else if(descricao.isEmpty()){
            throw new DescricaoEmBrancoException();
        }

    }

    public static void validarValorDeducao(float valor) throws ValorDeducaoInvalidoException{
        if(valor < 0){
           throw new ValorDeducaoInvalidoException();
        }
    }

    public static void validarValorRendimento(float valor) throws ValorRendimentoInvalidoException{
        if(valor < 0){
            throw new ValorRendimentoInvalidoException();
        }
    }
}
