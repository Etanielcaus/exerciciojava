import java.util.ArrayList;
import java.util.List;

public class ListTests {
    private String[] alunos;

    static void imprimeLista(List<Alunos> lista){
        for (Alunos alunos:
             lista) {
            System.out.println("Nome: " + alunos.getNome() + " Idade: " + alunos.getIdade());
        }
    }

    public static void main(String[] args) {
        List lista1 = new ArrayList<>();

        Alunos aluno1 = new Alunos("lula", 75);
        Alunos aluno2 = new Alunos("Bolsonaro", 65);

        lista1.add(aluno1);
        lista1.add(aluno2);

        imprimeLista(lista1);

        //System.out.println(lista1);
    }
}
