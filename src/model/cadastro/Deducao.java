package cadastro;
import java.util.ArrayList;

public class Deducao {
    private  String descricao;
    private  float valor;
    public static ArrayList<Deducao> deducoes = new ArrayList<Deducao>();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Deducao(String descricao, float valor) {
        super();
        this.descricao = descricao;
        this.valor = valor;
    }

    public Deducao(){

    }
}
