import Classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa joao = new Pessoa("joao", 18);
        Pessoa maria = new Pessoa("maria", 22);

        lista.add(joao);
        lista.add(maria);
        for (Pessoa p : lista) {
            System.out.println(p.toString());
        }

        System.out.println("===");
        lista.remove(joao);

        if (lista.contains(maria)){
            lista.remove(maria);
        }
        for (Pessoa p : lista) {
            System.out.println(p.toString());
        }
    }
}
