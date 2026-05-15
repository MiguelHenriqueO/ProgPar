package TimeBasquete;

import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class Time {
    private int id;
    private String nome, Tecnico;
    private ArrayList<Atleta> atletas;

    public Time() {
        this.atletas = new ArrayList<>();
    }

    public Time(int id, String nome, String Tecnico) {
        this.id = id;
        this.nome = nome;
        this.Tecnico = Tecnico;
        this.atletas = new ArrayList<>();
    }

    public void contratarAtleta(Atleta a){
        this.atletas.add(a);
        System.out.println("Novo atleta contratado!");
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

    public String getTime() {
        return this.Tecnico;
    }

    public void setTime(String time) {
        this.Tecnico = time;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + this.id +
                ", nome='" + this.nome + '\'' +
                ", time='" + this.Tecnico + '\'' +
                ", times=" + this.atletas +
                '}';
    }
}
