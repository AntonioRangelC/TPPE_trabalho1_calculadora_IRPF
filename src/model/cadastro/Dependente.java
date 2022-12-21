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

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public Dependente() {
    }
}
