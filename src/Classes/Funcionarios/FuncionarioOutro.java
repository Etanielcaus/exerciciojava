package Classes.Funcionarios;

public class FuncionarioOutro {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimir(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (this.salario != null) {
            for (double salario :
                    this.salario) {
                System.out.println(salario);
            }
            media();
        }
    }

    public void media(){
        double media = 0;
        if (this.salario != null) {
            for (double salario : this.salario) {
                media += salario;
            }
        }
        media = media / salario.length;
        System.out.println(media);
    }
}
