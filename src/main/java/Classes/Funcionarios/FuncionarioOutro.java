package Classes.Funcionarios;

public class FuncionarioOutro {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salario != null) {
            for (double salarios :
                    this.salario) {
                System.out.println(salarios);
            }
            media();
        }
        if (this.salario == null) {
            System.out.println("Sem salario");
        }
    }

    private void media(){

        for (double salario : this.salario) {
            media += salario;
        }
        media = media / salario.length;
        System.out.println(media);
    }
}
