import Classes.Comida;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaDeComida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Comida> comidaList = new ArrayList<Comida>();

        while (true){
            System.out.println("LISTA DE COMIDA");
            System.out.println("-=-=-=-=-=-=-=-=-");
            System.out.println("(A) Adicionar, (E) Excluir, (V) Visualizar Lista");
            String entrada = sc.next();

            Collections.sort(comidaList);

            if (entrada.equals("A")){
                System.out.print("Qual comida deseja adicionar: ");
                String comidaAdicionar = sc.next();
                Comida comida = new Comida(comidaAdicionar);
                adicionarComida(comidaList, comida);

            } else if (entrada.equals("E")){
                System.out.print("Qual comida deseja excluir: ");
                String comidaExcluir = sc.next();
                Comida comidaParaExcluir = encontrarComida(comidaList, comidaExcluir);
                if (comidaParaExcluir != null) {
                    excluirComida(comidaList ,comidaParaExcluir);
                    System.out.println("Comida removida com sucesso!");
                } else {
                    System.out.println("Comida não encontrada na lista.");
                }

            } else if (entrada.equals("V")){
                visualizarLista(comidaList);

            } else {
                System.out.println("Digite algo valido");
            }
        }

    }

    private static void adicionarComida(ArrayList<Comida> list, Comida comida){
        list.add(comida);
    }

    private static void visualizarLista(ArrayList list){
        System.out.println("=======");
        System.out.println("Lista de Comidas: ");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("=======");
    }

    private static void excluirComida(ArrayList list, Comida comida){
        list.remove(comida);
    }

    private static Comida encontrarComida(ArrayList<Comida> list, String nome){
        for (Comida c : list) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

}
