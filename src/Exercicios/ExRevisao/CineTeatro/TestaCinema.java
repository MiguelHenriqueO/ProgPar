package CineTeatro;
import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {


        Filme filme1 = new Filme(1, "Batman", "Ação", 120);
        Filme filme2 = new Filme(2, "Duna", "Ficção Científica", 150);


        LocalDateTime horario = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao = new Sessao(1, horario, 1);


        sessao.vincularFilme(filme1);


        sessao.venderIngresso(1, "A1", "Inteira", 30f);
        sessao.venderIngresso(2, "A2", "Meia", 15f);
        sessao.venderIngresso(3, "A3", "Inteira", 30f);


        sessao.exibirSessao();
    }
}
