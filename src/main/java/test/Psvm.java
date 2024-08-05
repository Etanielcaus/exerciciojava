package test;

public class Psvm {
    public static void main(String[] args) {

        // Instanciando Professores
        Professores professor1 = new Professores("Pedro");
        Professores professor2 = new Professores("Andre");
        Professores professor3 = new Professores("Maria");
        Professores professor4 = new Professores("José");

        // Instanciando a materia
        Materia materia = new Materia("Matemática");
        Materia materia1 = new Materia("Portugues");

        // Instanciando os seminários
        Seminarios seminario1 = new Seminarios("Unipar");
        Seminarios seminario2 = new Seminarios("Harvest");

        // Instanciando Alunos
        Estudantes estudante01 = new Estudantes("João");
        Estudantes estudante03 = new Estudantes("José");
        Estudantes estudante04 = new Estudantes("Pedroca");
        Estudantes estudante05 = new Estudantes("Kaue");

        // Professores de matéria especifica.
        professor1.setMateria(materia);
        professor2.setMateria(materia1);

        // Criando o Local
        Localidade local1 = new Localidade("Rua antonieta, 255");
        Localidade local2 = new Localidade("Rua das Dores, 456");

        //Classe de alunos
        Estudantes[] estudantes = {estudante01, estudante05, estudante03, estudante04};

        // Configurando o seminário
        seminario1.setEstudantes(estudantes);
        seminario1.setMateria(materia1);
        seminario1.setProfessor(professor1);
        seminario1.setLocal(local1);

        seminario1.imprimeSeminario();

        System.out.println("===========");

        seminario2.setEstudantes(estudantes);
        seminario2.setProfessor(professor2);
        seminario2.setMateria(materia);
        seminario2.setLocal(local2);

        seminario2.imprimeSeminario();

    }
}
