import java.util.ArrayList;

public class Disciplina {
    private int id;
    private String nome, professor;
    private final ArrayList<Aluno> alunos;
    private final ArrayList<Avaliacao> avaliacoes;

    public Disciplina(){
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public Disciplina(int id, String nome, String professor){
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void matricularAluno(Aluno a){
        this.alunos.add(a);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void criarAvaliacao(int id, String nome){
        Avaliacao aux = new Avaliacao(id, nome);
        this.avaliacoes.add(aux);
        System.out.println("Avaliação criada com sucesso!");
    }

    public Avaliacao buscarAvaliacao(int id){
        for(Avaliacao a : avaliacoes){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return "\nDisciplina: " + nome +
                "\nProfessor: " + professor +
                "\nAlunos: " + alunos +
                "\nAvaliações: " + avaliacoes;
    }
}
