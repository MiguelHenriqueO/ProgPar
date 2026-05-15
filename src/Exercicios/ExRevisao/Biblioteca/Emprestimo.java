package Biblioteca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo, dataDevolucaoPrev;
    private Leitor leitor;
    private Livro livro;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrev, Leitor leitor, Livro livro) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrev = dataDevolucaoPrev;
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDataDevolucaoPrev() {
        return this.dataDevolucaoPrev;
    }

    public void setDataDevolucaoPrev(LocalDateTime dataDevolucaoPrev) {
        this.dataDevolucaoPrev = dataDevolucaoPrev;
    }

    public Leitor getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'ás' HH:mm");
        return "Emprestimo{" +
                "dataEmprestimo=" + this.dataEmprestimo.format(formatoBR) +
                ", dataDevolucaoPrev=" + this.dataDevolucaoPrev.format(formatoBR) +
                ", leitor=" + this.leitor.getNome() +
                ", livro=" + this.livro.getTitulo() +
                '}';
    }
}
