import Classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Pessoa joao = new Pessoa("joao", 18);
        Pessoa maria = new Pessoa("maria", 22);
        Pessoa lana = new Pessoa("lana", 12);
        Pessoa julio = new Pessoa("julio", 25);
        Pessoa andre = new Pessoa("andre", 15);

        lista.add(lana);
        lista.add(julio);
        lista.add(andre);
        lista.add(joao);
        lista.add(maria);

        for (Pessoa p : lista) {
            if (p.getIdade() > 18) {
                System.out.println(p);
            }
        }
        System.out.println("===");
        String noName = "joao";
        for (Pessoa p : lista){
            if (!p.getNome().equals(noName)){
                System.out.println(p);
            }
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
