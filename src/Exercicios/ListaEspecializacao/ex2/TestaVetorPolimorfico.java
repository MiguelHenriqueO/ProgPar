package ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestaVetorPolimorfico {
    public static void exibir(Desenvolvedor camaleao){ // no polimorfismo o tipo deve ser sempre a super classe e os args devem ser sempre as subclasses
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }
    static void main(String[] args) {
        Junior j1 = new Junior("paulo","java",1800.00f,"robert");

        Pleno p1 = new Pleno("robert","java",2400.00f,20);

        Senior s1 = new Senior("Mario", "C#", 4000.00f,2000);

        Desenvolvedor De = new Desenvolvedor("João", "python", 2000.0f);

        ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();
        desenvolvedores.add(j1);
        desenvolvedores.add(p1);
        desenvolvedores.add(s1);
        desenvolvedores.add(De);

        for (Desenvolvedor d :  desenvolvedores){
            exibir(d);
            System.out.println("Bonûs: "+d.calcularBonus());;
            System.out.println(d.toString());
        }

    }
}
