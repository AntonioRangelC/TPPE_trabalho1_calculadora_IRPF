package model.cadastro;

import excecoes.DescricaoEmBrancoException;
import excecoes.ValorRendimentoInvalidoException;

import java.util.ArrayList;

public class Rendimento {
  private String descricao;
  private Float valor;
  public static ArrayList<Rendimento> rendimentos = new ArrayList<Rendimento>();

  public Rendimento(String descricao, Float valor) throws DescricaoEmBrancoException, ValorRendimentoInvalidoException {
      if (descricao == null){
          throw new DescricaoEmBrancoException();
      }
      if (descricao.isEmpty()) {
          throw new DescricaoEmBrancoException();
      }
      if (valor <= 0) {
          throw new ValorRendimentoInvalidoException();
      }
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