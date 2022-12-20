package model.calculo;

import model.cadastro.Deducao;
import model.cadastro.Rendimento;

import java.util.ArrayList;

public class Calculo {
    float totalDeducoes;
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
}
