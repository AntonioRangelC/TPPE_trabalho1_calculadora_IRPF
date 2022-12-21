package excecoes;

public class NomeEmBrancoException extends Exception{
    public NomeEmBrancoException() {
        super("Nome do dependente não pode ficar em branco");
    }
}
