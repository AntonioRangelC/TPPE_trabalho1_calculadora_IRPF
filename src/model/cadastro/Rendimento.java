package model.cadastro;

import excecoes.DescricaoEmBrancoException;
import excecoes.ValorRendimentoInvalidoException;

import java.util.ArrayList;

public class Rendimento {
  private String descricao;
  private Float valor;
  public static ArrayList<Rendimento> rendimentos = new ArrayList<Rendimento>();

    public static ArrayList<Rendimento> getRendimentos() {
        return rendimentos;
    }

    public Rendimento(String descricao, Float valor){
      super();
      this.descricao = descricao;
      this.valor = valor;
  }

  public Float getValor() {
      return this.valor;
  }

  public String getDescricao() {
      return this.descricao;
  }
}