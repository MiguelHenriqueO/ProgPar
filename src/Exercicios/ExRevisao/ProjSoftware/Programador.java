package ProjSoftware;

public class Programador {
    private int id;
    private String nome,linguagemPrincipal;

    public Programador() {
    }

    public Programador(int id, String nome, String linguagemPrincipal) {
        this.id = id;
        this.nome = nome;
        this.linguagemPrincipal = linguagemPrincipal;
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

    public String getLinguagemPrincipal() {
        return this.linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }


    @Override
    public String toString() {
        return "Programador{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", linguagemPrincipal='" + this.linguagemPrincipal + '\'' +
                '}';
    }
}
