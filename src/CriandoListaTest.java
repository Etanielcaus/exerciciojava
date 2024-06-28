import Classes.Comida;

import java.util.Arrays;
import java.util.List;

public class CriandoListaTest {
    public static void main(String[] args) {
        Comida feijao = new Comida("Feijão", 4);
        Comida brocolis = new Comida("Brocolis", 6);
        Comida arroz = new Comida("Arroz", 1);
        Comida tomate = new Comida("Tomate", 5);
        List<Comida> listComidaTest = Arrays.asList(feijao, brocolis, arroz);
        System.out.println(listComidaTest);

        Comida[] listComidaTestArray = listComidaTest.toArray(new Comida[listComidaTest.size()]);
//        listComidaTestArray[3] = tomate; Não é possível redimensionar o Array.
        System.out.println(Arrays.toString(listComidaTestArray));
    }
}
