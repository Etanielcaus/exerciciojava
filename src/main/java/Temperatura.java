import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        // Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
        // Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15;
        // Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos graus celsius está aí?");
        double temperaturaCelsius = scanner.nextDouble();

        double converteKelvin = temperaturaCelsius + 273.15;
        double converteFahrenheit = temperaturaCelsius * 1.8 + 32;
        double converteReamur = temperaturaCelsius * 0.8;
        double converteRankine = temperaturaCelsius * 1.8 + 32 + 459.67;

        System.out.println("Converte em Kelvin: "+converteKelvin);
        System.out.println("Converte em Fahrenheit: "+converteFahrenheit);
        System.out.println("Converte em Reamur: "+converteReamur);
        System.out.println("Converte em Rankine: "+converteRankine);
    }
}
