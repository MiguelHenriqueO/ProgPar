import javax.swing.*;

public class Carro{
    //Variaveis ou propriedades ou atributos
    public String marca, modelo; // String é um tipo de dado do tipo classe
    public float velocidade; // float é um tipo primitivo de dado
    public boolean motor; // boolean também é um tipo primitivo de dado

    //Constructor
    public Carro(String marca, String modelo, float velocidade, boolean motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.motor = motor;
    }

    //ligar carro
    public void ligarCarro(){
        if (!this.motor){
            this.motor = true;
        }
        System.out.println("motor ligado");
    }

    public void acelerarCarro(float x){
       if (this.motor) {
           this.velocidade += x;
           System.out.println("nova velocidade: " + this.velocidade);
       }
    }

    public void frearCarro(float x){
        if (!this.motor && this.velocidade - x > 0){
            this.velocidade -= x;
            System.out.println("Nova velocidade: " + this.velocidade);
        }
        else{
            System.out.println("Não freou");
        }

    }

    //desligar carro
    public void desligarCarro(){
        if(this.motor){
            this.motor = false;
            this.velocidade = 0;
        }
        System.out.println("motor desligado");
    }

    public void mostrarModelo(){
        String info = String.format("Marca: %s, \n Modelo: %s, \n Velocidade: %.2f, \n Motor ligado: %b \n", marca, modelo, velocidade, motor);
        JOptionPane.showMessageDialog(null, info, "Informações do carro", JOptionPane.INFORMATION_MESSAGE);
    }

    //metodo que converte o objeto em String
    // this. representa o objeto que chama o metodo
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo + " Velocidade: " + this.velocidade + " Motor: " + this.motor;
    }
}