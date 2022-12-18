package model.rendimento;

import exceptions.DescricaoEmBrancoException;
import exceptions.ValorRendimentoInvalidoException;

public class rendimento {
  private String descricao;
  private Float valor;

  public rendimento(String descricao, Float valor) throws DescricaoEmBrancoException, ValorRendimentoInvalidoException {
      if (descricao.isEmpty() || descricao == null) {
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