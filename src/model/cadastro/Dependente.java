package model.cadastro;

import java.util.ArrayList;

public class Dependente {

    private String nomeDependente;
    private String dataDeNascimento;
    public ArrayList<Dependente> dependentes = new ArrayList<Dependente>();

    public Dependente(String nomeDependente, String dataDeNascimento) {
        super();
        this.nomeDependente = nomeDependente;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Dependente() {
    }
}
