public class Aluno {
    private String nome, curso;
    private int id, ra;

    public Aluno(){

    }
    public Aluno(int id, String nome, String curso, int ra) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.ra = ra;
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

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getRa() {
        return this.ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + this.id + '\'' +
                ", nome='" + this.nome + '\'' +
                ", curso='" + this.curso + '\'' +
                ", ra=" + this.ra +
                '}';
    }
}
