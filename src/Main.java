import Class.Contador;
import Class.ParametrosInvalidosException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = Integer.parseInt(terminal.nextLine());
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = Integer.parseInt(terminal.nextLine());

        try {

            Contador.contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }
}