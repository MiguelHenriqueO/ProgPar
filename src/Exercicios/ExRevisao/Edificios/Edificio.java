package Edificios;

import java.util.ArrayList;

public class Edificio {
    private String nome, endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio() {
        this.apartamentos = new ArrayList<>();
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public void ConstruirApartamento(int num, int andar){
        Apartamento aux = new Apartamento(num, andar);
        this.apartamentos.add(aux);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Apartamento> getApartamentos() {
        return this.apartamentos;
    }

    public void setApartamentos(ArrayList<Apartamento> apartamentos) {
        this.apartamentos = apartamentos;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nome='" + this.nome + '\'' +
                ", endereco='" + this.endereco + '\'' +
                ", apartamentos=" + this.apartamentos +
                '}';
    }
}
