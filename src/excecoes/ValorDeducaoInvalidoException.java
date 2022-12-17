package excecoes;

public class ValorDeducaoInvalidoException extends Exception{
    public ValorDeducaoInvalidoException() {
        super("O valor da dedução é inválido. Preencha um número maior ou igual a 0.");
    }
}
