package Biblioteca;

public class Leitor {
    private int id;
    private String nome;

    public Leitor() {
    }

    public Leitor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Leitor{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                '}';
    }
}
