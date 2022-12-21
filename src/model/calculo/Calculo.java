package model.calculo;

import model.cadastro.Deducao;
import model.cadastro.Rendimento;

import java.util.ArrayList;

public class Calculo {
    float totalDeducoes;
    //Base de cálculo
    public float calcularDeducoes(ArrayList<Deducao> deducoes, ArrayList<Rendimento> rendimentos){

        float somaRendimentos = 0;
        float somaDeducoes = 0;
        for(Deducao aux : deducoes){
            if(aux.getValor() < 0f){
                return 0;
            }
            somaDeducoes = somaDeducoes + aux.getValor();
        }

        for(Rendimento aux2: rendimentos){
            if(aux2.getValor() < 0f){
                return 0;
            }
            somaRendimentos = somaRendimentos + aux2.getValor();
        }

        this.setTotalDeducoes(somaRendimentos - somaDeducoes);

        return this.getTotalDeducoes();
    }

    public float getTotalDeducoes() {
        return totalDeducoes;
    }

    public void setTotalDeducoes(float totalDeducoes) {
        this.totalDeducoes = totalDeducoes;
    }

    public float calculaImposto() {
        double VALOR_LIMITE_FAIXA1 = 1903.98;
        double VALOR_LIMITE_FAIXA2 = 922.67;
        double VALOR_LIMITE_FAIXA3 = 924.40;
        double VALOR_LIMITE_FAIXA4 = 913.63;
        double VALOR_LIMITE_FAIXA5 = VALOR_LIMITE_FAIXA4 + VALOR_LIMITE_FAIXA3 + VALOR_LIMITE_FAIXA2 + VALOR_LIMITE_FAIXA1;

        double porcentagemFaixa2 = 0.075;
        double porcentagemFaixa3 = 0.15;
        double porcentagemFaixa4 = 0.225;
        double porcentagemFaixa5 = 0.275;

        float baseDeCalculo = this.getTotalDeducoes();
        float totalImpostos = 0f;
        double valorDaFaixa = 0;

        if (baseDeCalculo > VALOR_LIMITE_FAIXA5) {
            valorDaFaixa = baseDeCalculo - VALOR_LIMITE_FAIXA5;
            totalImpostos += valorDaFaixa * porcentagemFaixa5;
        }

        if (baseDeCalculo > VALOR_LIMITE_FAIXA3 + VALOR_LIMITE_FAIXA2 + VALOR_LIMITE_FAIXA1) {
            valorDaFaixa = Math.min(baseDeCalculo - (VALOR_LIMITE_FAIXA3 + VALOR_LIMITE_FAIXA2 + VALOR_LIMITE_FAIXA1), VALOR_LIMITE_FAIXA4);
            totalImpostos += valorDaFaixa * porcentagemFaixa4;
        }

        if (baseDeCalculo > VALOR_LIMITE_FAIXA2 + VALOR_LIMITE_FAIXA1) {
            valorDaFaixa = Math.min(baseDeCalculo - (VALOR_LIMITE_FAIXA2 + VALOR_LIMITE_FAIXA1), VALOR_LIMITE_FAIXA3);
            totalImpostos += valorDaFaixa * porcentagemFaixa3;
        }

        if (baseDeCalculo > VALOR_LIMITE_FAIXA1) {
            valorDaFaixa = Math.min(baseDeCalculo - VALOR_LIMITE_FAIXA1, VALOR_LIMITE_FAIXA2);
            totalImpostos += valorDaFaixa * porcentagemFaixa2;
        }

        return totalImpostos;
    }
}
