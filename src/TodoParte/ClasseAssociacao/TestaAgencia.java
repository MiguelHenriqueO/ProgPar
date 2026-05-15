package ClasseAssociacao;

import java.time.LocalDateTime;

public class TestaAgencia {
    public static void main(String[] args){
        Passageiro pas1 = new Passageiro("123", "Fulano");

        LocalDateTime data = LocalDateTime.of(2026, 4, 18, 8, 15);
        Voo vo1 = new Voo(777, "ribeirão preto", "Brasília", data);

        Reserva re1 = new Reserva(111,LocalDateTime.now(),12, pas1, vo1);
        System.out.println(re1.toString());


        //usando o objeto re1 exiba o destino do voo da reserva
        System.out.println(re1.getVoo().getDestino());

        //usando o objeto re1 exiba o nome do passageiro
        System.out.println(re1.getPassageiro().getNome());
    }
}
