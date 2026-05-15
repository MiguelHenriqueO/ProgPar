public class TestaStreaming {
    public static void main(String[] args) {
            Streaming s1 = new Streaming("miguel", "Básico");

            s1.ultimoFilmeAssistido("101 Dalmatas");
            System.out.println(s1.toString());

            Streaming s2 = new Streaming("eu", "Premium");
            s2.desativarConta();
            s2.ultimoFilmeAssistido("Marley e eu");
            System.out.println(s2.toString());
    }

}
