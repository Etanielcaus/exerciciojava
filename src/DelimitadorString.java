import java.util.Scanner;

public class DelimitadorString {
    public static void main(String[] args) {
        String texto = "Nome Email true 18";
        Scanner scanner = new Scanner(texto);

        scanner.useDelimiter(" ");// Caso for vírgula
        // utilizar por exemplo (, )

        while (scanner.hasNext()){
            if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " + b);
            } else if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Integer: "+i);
            } else {
                System.out.println(scanner.next());
            }
        }

    }
}
