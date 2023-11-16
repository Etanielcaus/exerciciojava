package Classes.Carros;

public class CarroTest {
    public static void main(String[] args) {
        Carros carro1 = new Carros();
        carro1.ano = 1972;
        carro1.nome = "uno";
        carro1.modelo = "SPORTIVO";

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
    }
}
