import Classes.Comida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchListId {
    public static void main(String[] args) {
        Comida feijao = new Comida("Feijão", 4);
        Comida brocolis = new Comida("Brocolis", 6);
        Comida arroz = new Comida("Arroz", 1);

        List<Comida> listaComidas = new ArrayList<Comida>();

        listaComidas.add(arroz);
        listaComidas.add(feijao);
        listaComidas.add(brocolis);

        Collections.sort(listaComidas);

        int indexBinarySearch = Collections.binarySearch(listaComidas,feijao );
        System.out.println(indexBinarySearch);

        for (Comida comida1 : listaComidas) {
            System.out.println(comida1);
        }
    }
}
