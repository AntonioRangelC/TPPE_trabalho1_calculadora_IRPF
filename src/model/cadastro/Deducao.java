package model.cadastro;
import excecoes.*;

import java.util.ArrayList;

public class Deducao {
    private  String descricao;
    private  float valor;

    public static ArrayList<Deducao> deducoes = new ArrayList<Deducao>();

    float deducaoPorDependente = 189.59f;

    public float getTotalDeducoes(){
        return  valorTotalPensaoAlimenticia + valorTotalDependente + totalPrevidenciOficial;
    }

    public Deducao(String descricao, float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public Deducao(){

    }

    public static float getValorTotalOutrasDeducoes() {
        return valorTotalOutrasDeducoes;
    }

    public static float valorTotalOutrasDeducoes;

    float valorTotalPensaoAlimenticia;
    ArrayList<PensaoAlimenticia> pensoesAlimenticias =  new ArrayList<PensaoAlimenticia>();

    float valorTotalDependente;
    public ArrayList<Dependente> dependentes = new ArrayList<Dependente>();

    float totalPrevidenciOficial;
    ArrayList<PrevidenciaOficial> previdenciasOficiais = new ArrayList<PrevidenciaOficial>();



    public float getTotalDeducaoPrevidenciaOficial() {
        return this.totalPrevidenciOficial;
    }


    public float getPensaoAlimenticia() {
        return this.valorTotalPensaoAlimenticia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public static ArrayList<Deducao> getDeducoes() {
        return deducoes;
    }




}
