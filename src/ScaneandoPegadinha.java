import java.util.Scanner;

public class ScaneandoPegadinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are gay?");
        String input = scanner.next();
        if (input.charAt(0) == 'y'){
            System.out.println("OK, good chose.");
        }
        if (input.charAt(0) == 'n'){
            System.out.println("you has certainty with this? ");
            String newinput = scanner.next();
            if (newinput.charAt(0) == 'n'){
                System.out.println("OK");
            }
            System.out.println("YOU ARE GAY!!!!!!");

        }

    }
}
