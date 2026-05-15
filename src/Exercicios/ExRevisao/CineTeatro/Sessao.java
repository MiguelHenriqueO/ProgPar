package CineTeatro;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sessao {
    private int id;
    private LocalDateTime horario;
    private int sala;

    // Agregação
    private Filme filme;

    // Composição
    private ArrayList<Ingresso> ingressos;

    public Sessao(int id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    // Agregação
    public void vincularFilme(Filme filme) {
        this.filme = filme;
    }

    // Composição
    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso ingresso = new Ingresso(id, assento, tipo, preco);
        ingressos.add(ingresso);
    }

    public void exibirSessao() {
        System.out.println("Sessão ID: " + id);
        System.out.println("Sala: " + sala);
        System.out.println("Horário: " + horario);

        System.out.println("\nFilme:");
        System.out.println(filme);

        System.out.println("\nIngressos vendidos:");
        for (Ingresso i : ingressos) {
            System.out.println(i);
        }
    }
}