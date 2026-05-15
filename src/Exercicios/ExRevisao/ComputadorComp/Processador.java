package ComputadorComp;

public class Processador {
    private String marcaP, modelo;
    private double frequencia;

    public Processador() {
    }

    public Processador(String marcaP, String modelo, double frequencia) {
        this.marcaP = marcaP;
        this.modelo = modelo;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return this.marcaP;
    }

    public void setMarca(String marcaP) {
        this.marcaP = marcaP;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return this.frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "marca='" + this.marcaP + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", frequencia=" + this.frequencia +
                '}';
    }
}
