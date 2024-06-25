import Classes.Pessoa;

public class HashCode {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joao", 15);
        Pessoa p1 = new Pessoa("Joao", 15);
        Pessoa p2 = new Pessoa("Andressa", 12);
        Pessoa p3 = new Pessoa("Julio", 13);

        System.out.println(p.equals(p1));
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
