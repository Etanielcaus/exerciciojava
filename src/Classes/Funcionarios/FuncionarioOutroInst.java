package Classes.Funcionarios;

public class FuncionarioOutroInst {
    public static void main(String[] args) {
        FuncionarioOutro funcionario01 = new FuncionarioOutro();
        funcionario01.setNome("Naruto");
        funcionario01.setIdade(20);
//        funcionario01.salario = null;
        funcionario01.setSalario(new double[]{1560, 1720, 1200});
        System.out.println(funcionario01.getSalario());
        funcionario01.imprimir();

    }
}
