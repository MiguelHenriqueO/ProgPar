import java.util.ArrayList;

public class Avaliacao {
    private int id;
    private String nome;
    private final ArrayList<Questao> questoes;

    public Avaliacao(){this.questoes = new ArrayList<>();}

    public Avaliacao(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.questoes = new ArrayList<>();
    }

    public void adicionarQuestao(int num, String texto, float peso){
        Questao aux = new Questao(num, texto, peso);
        this.questoes.add(aux);
        System.out.println("Questão adicionada com sucesso!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", avaliacao=" + questoes +
                '}';
    }
}
