package test;

public class Seminarios {
    private String conteudo;
    private Materia materia;
    private Estudantes[] estudantes;

    private Professores professor;

    private Localidade local;

    public Seminarios(String conteudo) {
        this.conteudo = conteudo;
    }

    public Seminarios(String conteudo, Materia materia, Estudantes[] estudantes, Professores professor) {
        this.conteudo = conteudo;
        this.materia = materia;
        this.estudantes = estudantes;
        this.professor = professor;
    }

    public Professores getProfessor() {
        return professor;
    }

    public Seminarios(String conteudo, Materia materia, Estudantes[] estudantes, Professores professor, Localidade local) {
        this.conteudo = conteudo;
        this.materia = materia;
        this.estudantes = estudantes;
        this.professor = professor;
        this.local = local;
    }

    public Localidade getLocal() {
        return local;
    }

    public void setLocal(Localidade local) {
        this.local = local;
    }

    public void setProfessor(Professores professor) {
        this.professor = professor;
    }

    public Estudantes[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudantes[] estudantes) {
        this.estudantes = estudantes;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimeSeminario(){
        System.out.println("Seminario: " + this.getConteudo());
        System.out.println("Professor: " + this.professor.getNome());
        System.out.println("Materia: " + this.professor.getMateria().getMateria());
        System.out.println("Local: "+ this.local.getLocal());
        System.out.println("-----Alunos------");
        for (Estudantes estudantes : estudantes ){
            System.out.println(estudantes.getNome());
        }

    }
}
