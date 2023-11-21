package Classes.Funcionarios;

public class FuncionarioOutro {
    public String nome;
    public int idade;
    public double[] salario;

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
        double media = 0;
        for (double salario : this.salario) {
            media += salario;
        }
        media = media / salario.length;
        System.out.println(media);
    }
}
