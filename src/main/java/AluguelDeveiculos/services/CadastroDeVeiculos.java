package AluguelDeveiculos.services;

import AluguelDeveiculos.Dominio.Carro;
import AluguelDeveiculos.Dominio.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeVeiculos<T> {
    public static void main(String[] args) {
        CadastroDeVeiculos<Carro> cadastro = new CadastroDeVeiculos<>();
        cadastro.executar();
    }

    public void executar() {
        Scanner sc = new Scanner(System.in);
        List<T> listaDeVeiculos = new ArrayList<>();

        while (true) {
            System.out.println("Deseja criar um veiculo? (Y/N)");
            String yOrN = sc.nextLine();
            if (yOrN.equalsIgnoreCase("Y")) {
                System.out.println("Deseja criar uma moto ou um carro? (moto/carro)");
                String motoOuCarro = sc.nextLine();

                if (motoOuCarro.equalsIgnoreCase("moto")) {
                    System.out.println("Digite o nome do veiculo: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a placa do veiculo: ");
                    String placa = sc.nextLine();
                    System.out.println("Digite o modelo do veiculo: ");
                    String modelo = sc.nextLine();
                    T moto = criarMoto(nome, placa, modelo);
                    adicionar(moto, listaDeVeiculos);

                } else if (motoOuCarro.equalsIgnoreCase("carro")) {
                    System.out.println("Digite o nome do veiculo: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a placa do veiculo: ");
                    String placa = sc.nextLine();
                    System.out.println("Digite o modelo do veiculo: ");
                    String modelo = sc.nextLine();

                    T carro = criarCarro(nome, placa, modelo);
                    adicionar(carro, listaDeVeiculos);

                } else {
                    System.out.println("Opção inválida!");
                }

            } else if (yOrN.equalsIgnoreCase("N")) {
                System.out.println(listaDeVeiculos);
                break;
            } else {
                System.out.println("Entrada inválida! Tente novamente.");
            }
        }

        sc.close();
    }

    public void adicionar(T veiculo, List<T> listaDeVeiculos) {
        listaDeVeiculos.add(veiculo);
    }

    public T criarCarro(String nome, String placa, String modelo) {
        Carro carro = new Carro(nome, placa, modelo);
        return (T) carro;
    }

    public T criarMoto(String nome, String placa, String modelo){
        Moto moto = new Moto(nome, placa, modelo);
        return (T) moto;
    }
}
