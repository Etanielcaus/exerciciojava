import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalcularDatas {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);

        LocalTime localTime = LocalTime.now();

        int hour = localTime.getHour();
        int minute = localTime.getMinute();

        System.out.println("Digite o ano: ");
        int year = scanner.nextInt();

        System.out.println("Digite o mes: ");
        int month = scanner.nextInt();

        System.out.println("Digite o dia: ");
        int day = scanner.nextInt();

        adicionarData(year, month, day, hour, minute);

    }

    public static void adicionarData(int year, int month, int day, int hour, int minute){
        LocalDateTime aniversario = LocalDateTime.of(year, month, day, hour, minute);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dias:" + ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("Meses:" + ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("Anos:" + ChronoUnit.YEARS.between(aniversario, now));
        System.out.println("Semanas:" + ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("Horas:" + ChronoUnit.HOURS.between(aniversario, now));
    }
}
