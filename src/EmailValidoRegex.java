import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidoRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (email.matches(regex)){
            System.out.println(email + " valido.");
        } else {
            System.out.println(email + "email invalido.");
        }
    }
}
