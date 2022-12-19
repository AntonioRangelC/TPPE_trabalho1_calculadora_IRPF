package model.cadastro;
import java.util.Scanner;

public class Leitura {
    public static String lerString(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in).nextLine().trim();
    }

    public static char lerChar(String mensagem) {
        System.out.print(mensagem);
        return new Scanner(System.in).next().trim().toUpperCase().charAt(0);
    }

    public static int lerInt(String mensagem) {
        System.out.println("Digite o " + mensagem);
        return new Scanner(System.in).nextInt();
    }

    public static float lerFloat(String mensagem) {
        System.out.println("Digite o " + mensagem);
        return new Scanner(System.in).nextFloat();
    }
}
