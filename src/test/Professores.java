package test;

public class Professores {
    private String Nome;
    private Materia materia;

    public Professores(String nome) {
        Nome = nome;
    }

    public Professores(String nome, Materia materia) {
        Nome = nome;
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }


}
