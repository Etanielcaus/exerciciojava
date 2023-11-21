package Classes.Funcionarios;

public class FuncionarioInstancia {
    public static void main(String[] args) {
        Funcionarios funcionario01 = new Funcionarios();
        Funcionarios funcionario02 = new Funcionarios();
        Funcionarios funcionario03 = new Funcionarios();
        funcionario01.funcionarios("Joao", 23, 1350);
        funcionario02.funcionarios("Maria", 23, 1850);
        funcionario03.funcionarios("Frida", 25, 1500);
        funcionario01.imprimirDados();

        double mediaSalario = (funcionario01.salario + funcionario02.salario + funcionario03.salario) / 3;
        String formato = "%.2f";
        String formatado = String.format(formato, mediaSalario);
        System.out.println(formatado);
    }
}
