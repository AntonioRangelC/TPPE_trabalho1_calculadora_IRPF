
import excecoes.*;
package model.cadastro;

public class Cadastro {

    public static void  cadastrarDeducao(){
        char continuarCadastrando = '1';
        while(continuarCadastrando == '1'){
            Deducao deducao = new Deducao();

            deducao.setDescricao(Leitura.lerString("Digite a descrição da dedução"));
            deducao.setDescricao(cadastrarDescricao(deducao.getDescricao()));

            deducao.setValor(Leitura.lerFloat("Digite o valor da dedução"));
            deducao.setValor(cadastrarValor(deducao.getValor()));


            Deducao.deducoes.add(deducao);

            System.out.println("Deseja cadastrar mais deduções?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            continuarCadastrando = Leitura.lerChar("");
        }


    }

    public static String cadastrarDescricao(String descricao){

        try{
            Validacao.validarDescricaoDeducao(descricao);
        } catch (DescricaoEmBrancoException e){
            e.printStackTrace();
            System.out.println(e.toString());
            descricao = Leitura.lerString("Digite a descrição da dedução");
            cadastrarDescricao(descricao);
        }

        return descricao;
    }

    public static float cadastrarValor(float valor){
        try{
            Validacao.validarValorDeducao(valor);
        } catch (ValorDeducaoInvalidoException e){
            e.printStackTrace();
            System.out.println(e.toString());
            valor  = Leitura.lerFloat("Digite o valor da dedução");
            cadastrarValor(valor);
        }

        return valor;
    }
}
