package TimeBasquete;

public class TestaTime {
    public static void main(String[] args){

        Atleta a1 = new Atleta(1, "Lucas", "Armador");

        Time t1 = new Time(10, "Franca Basquete", "Helinho");
        t1.contratarAtleta(a1);

        System.out.println("Antes de anular o time:");
        System.out.println(a1);
        System.out.println(t1);

        t1 = null;

        System.out.println("\nDepois de anular o time:");
        System.out.println(a1);
    }
}
