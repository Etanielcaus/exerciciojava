import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        Alunos joao = new Alunos("Joao", 18);
        Alunos pedro = new Alunos("Pedro", 75);
        Alunos andrei = new Alunos("andrei", 21);
        Alunos sergio = new Alunos("Sergio", 15);
        Alunos maria = new Alunos("Maria", 13);
        Alunos ana = new Alunos("Ana", 11);
        Alunos jose = new Alunos("Jose", 18);

        lista1.add(aluno1);
        lista1.add(aluno2);


        imprimeLista(lista1);

        //System.out.println(lista1);
        System.out.println("===");

        List<Alunos> lista2 = new ArrayList();

        lista2.add(aluno1);
        lista2.add(aluno2);
        lista2.add(joao);
        lista2.add(pedro);
        lista2.add(andrei);
        lista2.add(sergio);
        lista2.add(maria);
        lista2.add(ana);
        lista2.add(jose);

//        lista2.forEach(System.out::println);

//        List<Alunos> collect = lista2.stream().filter(aluno -> aluno.getIdade() <= 65).toList();
//        collect.forEach(System.out::println);

//        Pega todos os que possuem idade menor ou igual a 18
        lista2.stream().map(Alunos::getIdade)
                .filter(a -> a <= 18)
                .forEach(System.out::println);

        System.out.println("Soma das idades...");
        lista2.stream().map(Alunos::getIdade)
                .filter(a -> a <= 18)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
