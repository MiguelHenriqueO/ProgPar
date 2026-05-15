import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void exibir(CanalNotificacao camaleao){
        camaleao.enviar();
    }

    static void main(String[] args) {

        Email Em1 = new Email("eu", "oi td bom?", "saudação");

        Sms Sm1 = new Sms("paulo", "bem vindo", 16994209);

        Whatsapp W1 = new Whatsapp("joão", "como vai?", "visto");

        ArrayList<CanalNotificacao> canais = new ArrayList<>();
        canais.add(Em1);
        canais.add(Sm1);
        canais.add(W1);

        for (CanalNotificacao camaleao : canais) {
            camaleao.enviar();
        }

    }
}
