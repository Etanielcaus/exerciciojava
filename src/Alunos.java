public class Alunos {
    private String nome;
    private int idade;

    public Alunos(String nomeDoAluno, int idadeDoAluno){
        this.nome = nomeDoAluno;
        this.idade = idadeDoAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
