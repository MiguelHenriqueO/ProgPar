public class TestaPlacar {
    public static void main(String[] args){

        Placar p1 = new Placar("bola fora", "cexta");

        p1.registrarPonto("Casa", 2);
        p1.registrarPonto("Visitante", 10);
        p1.registrarPonto("Visitante", -1);
        p1.registrarPonto("Visitante", 3);
        System.out.println(p1.toString());

        p1.proximoQuarto();
        System.out.println(p1.toString());

        p1.proximoQuarto();
        System.out.println(p1.toString());

        p1.proximoQuarto();
        System.out.println(p1.toString());

        p1.proximoQuarto();
        System.out.println(p1.toString());

    }


}
