package model.cadastro;

import excecoes.DescricaoEmBrancoException;
import excecoes.ValorRendimentoInvalidoException;

import java.util.ArrayList;

public class Rendimento {
  private String descricao;
  private Float valor;

  public Float getTotalRendimentos() {
    float valorTotalrndimentos = 0;
    for (Rendimento rend : rendimentos) {
      valorTotalrndimentos += rend.valor;
    }
    return valorTotalrndimentos;
  }

  float totalRendimentos = 0;

  public static ArrayList<Rendimento> rendimentos = new ArrayList<Rendimento>();

  public static ArrayList<Rendimento> getRendimentos() {
    return rendimentos;
  }

  public Rendimento(String descricao, Float valor){
    this.descricao = descricao;
    this.valor = valor;
  }
  public Rendimento(){

  }


  /*public Float getTotalRendimentos() {
    return totalRendimentos;
  }*/

  public Float getValor() {
    return this.valor;
  }

  public String getDescricao() {
    return this.descricao;
  }
}