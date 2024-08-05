public class Alunos {
    private String nome;
    private int idade;

    public Alunos(String nomeDoAluno, int idadeDoAluno){
        this.nome = nomeDoAluno;
        this.idade = idadeDoAluno;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
