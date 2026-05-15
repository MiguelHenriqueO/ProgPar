package ProjSoftware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProj;
    private ArrayList<Programador> programadores;

    public Projeto(int id, String nomeProj) {
        this.id = id;
        this.nomeProj = nomeProj;
        this.programadores = new ArrayList<>();
    }

    public Projeto() {
        this.programadores = new ArrayList<>();
    }

    public void ContratarProgramador(Programador a){
        this.programadores.add(a);
    }

    public String VerificarProgramadores(){
        String resultado = "Programadores no seu projeto " + this.nomeProj + ":\n";

        for(Programador p : programadores){
            resultado += p.getNome() + " (" + p.getLinguagemPrincipal() + ")\n";
        }

        return resultado;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProj() {
        return this.nomeProj;
    }

    public void setNomeProj(String nomeProj) {
        this.nomeProj = nomeProj;
    }

    public ArrayList<Programador> getProgramadores() {
        return this.programadores;
    }

    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "id=" + this.id +
                ", nomeProj='" + this.nomeProj + '\'' +
                ", programadores=" + this.programadores +
                '}';
    }
}


