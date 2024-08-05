package Classes.Funcionarios;

public class Funcionarios {
    public String nome;
    public int idade;
    public double salario;

    public void funcionarios(String nome, int idade, double salario){
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.salario);
    }

}
