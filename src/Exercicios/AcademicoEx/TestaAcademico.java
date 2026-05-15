public class TestaAcademico {

    public static void main(String[] args) {


        Aluno a1 = new Aluno(1, "miguel", "ccp", 244);
        Aluno a2 = new Aluno(2, "paulo", "engenharia", 442);

        Disciplina d1 = new Disciplina(10, "Programação Orientada a Objetos", "Dani");

        d1.matricularAluno(a1);
        d1.matricularAluno(a2);

        d1.criarAvaliacao(80, "prova semestral");

        Avaliacao av = d1.buscarAvaliacao(80);

        if(av != null){
            av.adicionarQuestao(1, "quanto é 1 + 1?", 2);
            av.adicionarQuestao(2, "quanto é 0 / 0?", 2);
            av.adicionarQuestao(3, "Duuvidas?", 8);
        }

        System.out.println(d1.toString());


    }
}
