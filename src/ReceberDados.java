import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReceberDados {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Etaniel\\Desktop\\Desenvolvimento\\exerciciojava\\src\\Files\\file.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = scanner.next();

        System.out.println("Escreva sua idade: ");
        String idade = scanner.next();

        escreverNoArquivo(file, nome, idade);

    }

    public static void escreverNoArquivo(File file, String nome, String idade){
        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write("Nome: "+nome);
            fileWriter.write(System.lineSeparator());
            fileWriter.write("Idade: "+ idade);
            fileWriter.write(System.lineSeparator());
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
