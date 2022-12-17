package excecoes;

public class DescricaoEmBrancoException extends Exception{
    public DescricaoEmBrancoException(){
        super("A descrição da dedução não pode ficar em branco.");
    }
}
