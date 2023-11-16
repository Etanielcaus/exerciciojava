package Classes.Carros;


import java.util.Scanner;

public class CarroTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carros carro1 = new Carros();
        System.out.println("Digite o nome do carro: ");
        carro1.nome = scanner.next();
        System.out.println("Digite o ano do carro: ");
        carro1.ano = scanner.nextInt();
        System.out.println("Digite o modelo do carro: ");
        carro1.modelo = scanner.next();

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
    }
}
