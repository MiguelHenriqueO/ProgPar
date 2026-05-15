import javax.swing.*;

public class TestaCarro {
    public static void main(String[] args) {

        /*String marca = JOptionPane.showInputDialog(null, "Marca do carro: ");
        String modelo = JOptionPane.showInputDialog(null, "Modelo do carro: ");
        float velocidade = Float.parseFloat(JOptionPane.showInputDialog(null, "Velocidade do carro: "));
        boolean motor = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Motor ligado: "));
        float acelerado = Float.parseFloat(JOptionPane.showInputDialog(null, "Acelerar em:"))
        obj1.mostrarModelo();
        obj2.mostrarModelo();
        */

        Carro obj1 = new Carro("fiat", "uno", 0, false);
        System.out.println(obj1.toString());

        obj1.ligarCarro();
        obj1.acelerarCarro(100);
        obj1.frearCarro(60);
        obj1.frearCarro(40);
        System.out.println(obj1.toString());


        Carro obj2 = new Carro("GM", "onix", 0, false);
        System.out.println(obj1.toString());

        obj2.ligarCarro();
        obj2.acelerarCarro(100);
        obj2.frearCarro(60);
        obj2.frearCarro(40);

        System.out.println(obj2.toString());

        obj1.desligarCarro();
        System.out.println(obj1.toString());


        obj2.desligarCarro();
        System.out.println(obj2.toString());

    }
}
