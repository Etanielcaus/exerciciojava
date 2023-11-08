import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculaTaxa {
    public static void main(String[] args) {
        double salarioAnualAlto = 30000;
        double salarioAnualMedio = 28000;
        double salarioAnualBaixo = 21000;

        double taxaAnual = 12;

        double resultadoAlto = (taxaAnual * salarioAnualAlto) / 100;
        double resultadoMedio = (taxaAnual * salarioAnualMedio) / 100;
        double resultadoBaixo = (taxaAnual * salarioAnualBaixo) / 100;

        System.out.println(resultadoAlto);
        System.out.println(resultadoMedio);
        System.out.println(resultadoBaixo);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o salario Anual?");
        double salarioAnual = scanner.nextDouble();
        double taxa;

        if (salarioAnual <= 34.712){
            taxa = 9.7;
        } else if (salarioAnual >= 34.713 && salarioAnual < 68507) {
            taxa = 37.55;
        } else {
            taxa = 49.50;
        }

        double resultado = (salarioAnual * taxa) / 100;

        // Formatar o resultado com duas casas decimais
        DecimalFormat df = new DecimalFormat("0.00");
        String resultadoFormatado = df.format(resultado);

        System.out.println(resultadoFormatado);
    }
}
