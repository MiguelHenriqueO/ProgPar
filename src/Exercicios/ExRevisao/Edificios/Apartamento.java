package Edificios;

public class Apartamento {
    private int numero, andar;

    public Apartamento() {
    }

    public Apartamento(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return this.andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numero=" + this.numero +
                ", andar=" + this.andar +
                '}';
    }
}
