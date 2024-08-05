import java.util.Scanner;

public class AulaSwitch {
    public static void main(String[] args) {
        // Dado os dias da semana de 1 a 7, imprima se é dia útil
        // Considere dia da semana 1 como domingo

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dia da semana:");
        int diaDaSemana = scanner.nextInt();


        switch (diaDaSemana){
            case 1, 7:
                String naoDia = "Não é dia útil";
                System.out.println(naoDia);
                break;
            case 2, 3, 4, 5, 6:
                String diaUtil = "Dia útil";
                System.out.println(diaUtil);
                break;
            default:
                String valorInvalido = "Digite um válor válido";
                System.out.println(valorInvalido);
        }


    }
}
