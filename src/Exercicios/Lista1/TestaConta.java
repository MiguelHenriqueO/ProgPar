public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(264,233,"jão Silva");

        c1.deposito(500.0f);

        c1.sacar(200.0f);

        System.out.println(c1.toString());

        Conta c2 = new Conta(281,332,"Maria Souza");

        c2.sacar(50.0f);

        c1.encerrarConta();

        c1.sacar(300.0f);
        c1.encerrarConta();

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
