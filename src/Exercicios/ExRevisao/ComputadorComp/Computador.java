package ComputadorComp;

public class Computador {
    private int id;
    private String marca;
    private Processador processador;

    public Computador() {
    }

    public Computador(int id, String marca,String marcaP, String modelo, double frequencia) {
        this.id = id;
        this.marca = marca;

        this.processador = new Processador(marcaP, modelo, frequencia);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id=" + this.id +
                ", marca='" + this.marca + '\'' +
                ", processador=" + this.processador +
                '}';
    }
}
