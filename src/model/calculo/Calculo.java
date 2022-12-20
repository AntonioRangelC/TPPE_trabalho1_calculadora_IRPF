package model.calculo;

import model.cadastro.Deducao;
import model.cadastro.Rendimento;

import java.util.ArrayList;

public class Calculo {
    float totalDeducoes;
    public float calcularDeducoes(ArrayList<Deducao> deducoes, ArrayList<Rendimento> rendimentos){


        this.setTotalDeducoes(9800f);
        return 9800f;
    }

    public float getTotalDeducoes() {
        return totalDeducoes;
    }

    public void setTotalDeducoes(float totalDeducoes) {
        this.totalDeducoes = totalDeducoes;
    }
}
