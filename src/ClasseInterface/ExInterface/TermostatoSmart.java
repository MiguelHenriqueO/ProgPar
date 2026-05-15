package ExClasseAbstrata.ExInterface.src;

public class TermostatoSmart implements DispositivoLigavel, SensorTemperatura{
    @Override
    public void ligar() {
        System.out.println("Termostato Ligado");
    }
    @Override
    public void desligar() {
        System.out.println("Termostato Desligado");
    }

    @Override
    public double lerTemperatura() {
        System.out.println("Temperatura atual de 22.0 °C");
        return 22.0;
    }
}
