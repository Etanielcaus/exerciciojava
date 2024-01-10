package Package.HerancaSimples;

public class Carro extends Veiculo{
    private String donoDoCarro;

    public Carro(String marca, String modelo, int ano, String donoDoCarro) {
        super(marca, modelo, ano);
        this.donoDoCarro = donoDoCarro;
    }

    public void acelerarCarro(){
        System.out.println("O " + donoDoCarro + " está acelerando seu " + this.modelo);
    }

    public String getDonoDoCarro() {
        return donoDoCarro;
    }

    public void setDonoDoCarro(String donoDoCarro) {
        this.donoDoCarro = donoDoCarro;
    }
}
