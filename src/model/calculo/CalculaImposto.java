package model.calculo;

public class CalculaImposto {
    float baseDeCalculo;
    float totalImpostos;
    Calculo calculo = new Calculo();

    public CalculaImposto(Calculo calculo, float baseCalculo, float totalImpostos){
        this.calculo = calculo;
        this.baseDeCalculo = baseCalculo;
        this.totalImpostos = totalImpostos;
    }

    public float computar(){

        totalImpostos += calculo.estaNaFaixa5(baseDeCalculo, calculo.getVALOR_LIMITE_FAIXA5());

        totalImpostos += calculo.estaNaFaixa4(baseDeCalculo, calculo.getVALOR_LIMITE_FAIXA3() + calculo.getVALOR_LIMITE_FAIXA2() + calculo.getVALOR_LIMITE_FAIXA1());

        totalImpostos += calculo.estaNaFaixa3(baseDeCalculo, calculo.getVALOR_LIMITE_FAIXA2() + calculo.getVALOR_LIMITE_FAIXA1());

        totalImpostos += calculo.estaNaFaixa2(baseDeCalculo, calculo.getVALOR_LIMITE_FAIXA1());

        return totalImpostos;
    }
}
