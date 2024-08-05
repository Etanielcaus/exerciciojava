package AluguelDeveiculos.Dominio;

public class Carro {
    private String nome;
    private String placa;
    private String modelo;

    public Carro(String nome, String placa, String modelo) {
        this.nome = nome;
        this.placa = placa;
        this.modelo = modelo;
    }

    // Getters and setters if needed

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
