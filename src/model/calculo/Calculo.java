package model.calculo;

import model.cadastro.Deducao;
import model.cadastro.Rendimento;

import java.util.ArrayList;

public class Calculo {
    float totalDeducoes;
    float totalImpostos = 0f;
    float aliquotaEfetiva;
    Rendimento rendimento = new Rendimento();

    double VALOR_LIMITE_FAIXA1 = 1903.98;
    double VALOR_LIMITE_FAIXA2 = 922.67;
    double VALOR_LIMITE_FAIXA3 = 924.40;
    double VALOR_LIMITE_FAIXA4 = 913.63;
    double VALOR_LIMITE_FAIXA5 = VALOR_LIMITE_FAIXA4 + VALOR_LIMITE_FAIXA3 + VALOR_LIMITE_FAIXA2 + VALOR_LIMITE_FAIXA1;

    double porcentagemFaixa2 = 0.075;
    double porcentagemFaixa3 = 0.15;
    double porcentagemFaixa4 = 0.225;
    double porcentagemFaixa5 = 0.275;

    public double getVALOR_LIMITE_FAIXA1() {
        return VALOR_LIMITE_FAIXA1;
    }
    public double getVALOR_LIMITE_FAIXA2() {
        return VALOR_LIMITE_FAIXA2;
    }
    public double getVALOR_LIMITE_FAIXA3() {
        return VALOR_LIMITE_FAIXA3;
    }
    public double getVALOR_LIMITE_FAIXA4() {
        return VALOR_LIMITE_FAIXA4;
    }
    public double getVALOR_LIMITE_FAIXA5() {
        return VALOR_LIMITE_FAIXA5;
    }

    public double getPorcentagemFaixa2() {
        return porcentagemFaixa2;
    }
    public double getPorcentagemFaixa3() {
        return porcentagemFaixa3;
    }
    public double getPorcentagemFaixa4() {
        return porcentagemFaixa4;
    }
    public double getPorcentagemFaixa5() {
        return porcentagemFaixa5;
    }

    public float getTotalImpostos() {
        return totalImpostos;
    }

    public void setAliquotaEfetiva() {
        this.aliquotaEfetiva = (this.totalImpostos/rendimento.getTotalRendimentos()) * 100;
    }

    public float getAliquotaEfetiva() {
        return aliquotaEfetiva;
    }

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
        CalculaImposto ci = new CalculaImposto(this, this.getTotalDeducoes(), 0);
        return ci.computar();
    }

    public float estaNaFaixa5(float baseDeCalculo, double VALOR_LIMITE){
        float totalImpostos = 0f;
        if (baseDeCalculo > VALOR_LIMITE){
            double valorDaFaixa = baseDeCalculo - VALOR_LIMITE;
            totalImpostos += valorDaFaixa * porcentagemFaixa5;
            return totalImpostos;
        }
        else{
            return 0;
        }
    }

    public float estaNaFaixa4(float baseDeCalculo, double VALOR_LIMITE){
        float totalImpostos = 0f;

        if (baseDeCalculo > VALOR_LIMITE) {
            double valorDaFaixa = Math.min(baseDeCalculo - (VALOR_LIMITE_FAIXA3 + VALOR_LIMITE_FAIXA2 + VALOR_LIMITE_FAIXA1), VALOR_LIMITE_FAIXA4);
            totalImpostos += valorDaFaixa * porcentagemFaixa4;
            return totalImpostos;
        }
        else{
            return 0;
        }
    }

    public float estaNaFaixa3(float baseDeCalculo, double VALOR_LIMITE){
        float totalImpostos = 0f;

        if (baseDeCalculo > VALOR_LIMITE) {
            double valorDaFaixa = Math.min(baseDeCalculo - (VALOR_LIMITE_FAIXA2 + VALOR_LIMITE_FAIXA1), VALOR_LIMITE_FAIXA3);
            totalImpostos += valorDaFaixa * porcentagemFaixa3;

            return totalImpostos;
        }
        else{
            return 0;
        }


    }

    public float estaNaFaixa2(float baseDeCalculo, double VALOR_LIMITE) {
        float totalImpostos = 0f;

        if (baseDeCalculo > VALOR_LIMITE) {
            double valorDaFaixa = Math.min(baseDeCalculo - VALOR_LIMITE_FAIXA1, VALOR_LIMITE_FAIXA2);
            totalImpostos += valorDaFaixa * porcentagemFaixa2;
            return totalImpostos;
        } else {
            return 0;
        }
    }


}
