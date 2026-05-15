package Biblioteca;

import java.time.LocalDateTime;

public class TestaBiblioteca {
    public static void main(String[] args){

        Leitor le1 = new Leitor(10, "Pedro");
        Livro li1 = new Livro(20,"Cap1", "acis");

        LocalDateTime DataDev = LocalDateTime.of(2026,5,23,14,50);
        Emprestimo em1 = new Emprestimo(LocalDateTime.now(), DataDev, le1, li1);

        System.out.println(em1.toString());

    }
}
