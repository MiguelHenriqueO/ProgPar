package ComputadorComp;

public class TestaComputador {
    public static void main(String[] args){

        Computador pc = new Computador(20,"dell","intel","i7",4.5);

        Computador pc2 = new Computador();


        System.out.println(pc.toString());
        System.out.println(pc2.toString());
    }
}
