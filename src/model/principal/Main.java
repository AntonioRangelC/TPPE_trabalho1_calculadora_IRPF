package model.principal;
import model.cadastro.*;


public class Main {

    public static void main(String[] args) {

        char menu = '1';

        while(menu != '0'){
            System.out.println("CALCULADORA DE IMPOSTO DE RENDA");
            System.out.println("Escolha uma das opções");
            System.out.println("1. Cadastrar rendimentos");
            System.out.println("2. Cadastrar Dedução");
            System.out.println("0. Encerrar programa");

            for(int aux = 0; aux < Deducao.deducoes.size(); aux++){
                System.out.println("Deduções:");
                System.out.println("\t " + Deducao.deducoes.get(aux).getDescricao() + " - R$ " + Deducao.deducoes.get(aux).getValor());
            }

            char opcao = Leitura.lerChar("");

            switch (opcao){
                case '1':
                    //cadastro de rendimentos
                    break;
                case '2':
                    Cadastro.cadastrarDeducao();
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("Deseja voltar ao menu?");
            System.out.println("1. Sim");
            System.out.println("0. Não (Encerrar o programa)");
            menu = Leitura.lerChar("");
        }

    }
}
