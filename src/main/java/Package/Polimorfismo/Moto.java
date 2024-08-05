package Package.Polimorfismo;

public class Moto extends Veiculo {
    private String donoDaMoto;

    public Moto(String marca, String modelo, int ano, String donoDaMoto) {
        super(marca, modelo, ano);
        this.donoDaMoto = donoDaMoto;
    }

    public void ligarVeiculo(){
        super.ligarVeiculo();
        System.out.println("O " + this.donoDaMoto + " conseguiu ligar.");
    }

    public String getDonoDaMoto() {
        return donoDaMoto;
    }

    public void setDonoDaMoto(String donoDaMoto) {
        this.donoDaMoto = donoDaMoto;
    }
}
