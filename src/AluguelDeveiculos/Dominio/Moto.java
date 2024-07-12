package AluguelDeveiculos.Dominio;

public class Moto{
    private String marca;
    private String placa;
    private String nome;

    public Moto(String marca, String placa, String nome) {
        this.marca = marca;
        this.placa = placa;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
