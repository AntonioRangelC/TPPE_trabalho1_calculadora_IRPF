package model.cadastro;

public class PensaoAlimenticia {
    private String descricao;
    private float valor;

    public PensaoAlimenticia(String descricao, float valor) {
        super();
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public PensaoAlimenticia() {

    }
}
