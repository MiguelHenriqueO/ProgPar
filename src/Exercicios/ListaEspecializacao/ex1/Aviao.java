package ex1;

public class Aviao extends Veiculo{
    private float altitudeMax;

    public Aviao() {
        super();
    }

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return this.altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover(){
        System.out.printf("Avião voando a %d km/h e %d metros%n", velocidade, altitudeMax);
    }

    @Override
    public void abastecer(){
        System.out.println("Abastecendo com querosene de aviação");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                super.toString() +
                "Altitude máxima: " + altitudeMax +
                '}';
    }


}
