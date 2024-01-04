import java.util.Scanner;

public class ScanExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua pergunta ");
        System.out.println("Se for verdadeira, direi SIM e se for falsa direi não: ");
        String entrada = scanner.nextLine();

        if (entrada.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
