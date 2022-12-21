package model.cadastro;
import excecoes.*;


public class Cadastro {
    public Deducao deducao = new Deducao();
    public Rendimento rendimento = new Rendimento();

    public void cadastraDependente(String nomeDependente, String dataDeNascimento) throws NomeEmBrancoException {
        if(nomeDependente == null){
            throw new NomeEmBrancoException();
        }
        if(nomeDependente.trim().length()<1) {
            throw new NomeEmBrancoException();
        }
        Dependente dependente = new Dependente(nomeDependente, dataDeNascimento);
        deducao.dependentes.add(dependente);

        deducao.valorTotalDependente += deducao.deducaoPorDependente;
    }


    public void cadastraPensaoAlimenticia(String descPensaoAlimenticia, float valorPensaoAlimenticia)
            throws DescricaoEmBrancoException, ValorDeducaoInvalidoException {
        if(descPensaoAlimenticia.trim().length()<1) {
            throw new DescricaoEmBrancoException();
        }
        if(valorPensaoAlimenticia<=0) {
            throw new ValorDeducaoInvalidoException();
        }
        PensaoAlimenticia pensao = new PensaoAlimenticia(descPensaoAlimenticia,valorPensaoAlimenticia);

        deducao.pensoesAlimenticias.add(pensao);
        deducao.valorTotalPensaoAlimenticia += valorPensaoAlimenticia;

    }

    public void cadastrarPrevidenciaOficial(String descPrevidenciaOficial, float valor)
            throws  DescricaoEmBrancoException,  ValorDeducaoInvalidoException{
        if(descPrevidenciaOficial.trim().length()<1) {
            throw new DescricaoEmBrancoException();
        }
        if(valor<=0) {
            throw new ValorDeducaoInvalidoException();
        }
        PrevidenciaOficial prev = new PrevidenciaOficial(descPrevidenciaOficial,valor);
        deducao.previdenciasOficiais.add(prev);
        deducao.totalPrevidenciOficial += valor;

    }

    public void cadastrarRendimento(String descricao, float valor){


        try{
            Validacao.validarDescricaoRendimento(descricao);
        } catch (DescricaoEmBrancoException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }



        try{
            Validacao.validarValorRendimento(valor);
        } catch (ValorRendimentoInvalidoException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }

        rendimento = new Rendimento(descricao, valor);
        Rendimento.rendimentos.add(rendimento);
        rendimento.totalRendimentos += valor;

    }


    public static void cadastrarDeducao(String descricao, float valor){
        Deducao deducao = new Deducao(descricao, valor);
        try{
            Validacao.validarDescricaoDeducao(descricao);
        } catch (DescricaoEmBrancoException e){
            e.printStackTrace();
            System.out.println(e.toString());
        }

        try{
            Validacao.validarValorDeducao(valor);
        } catch (ValorDeducaoInvalidoException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }

        Deducao.deducoes.add(deducao);
        Deducao.valorTotalOutrasDeducoes += valor;
    }


    /*public static void  cadastrarDeducao(){
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
    }*/
}
