package Classes;

import java.io.Serializable;
import java.util.Objects;

public class Comida implements Comparable<Comida>{
    private String nome;

    public Comida(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comida comida = (Comida) o;
        return Objects.equals(nome, comida.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Comida o) {
        return this.nome.compareTo(o.getNome());
    }
}
