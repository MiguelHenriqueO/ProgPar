package ExClasseAbstrata.ExInterface.src;

public class FechaduraEletronica implements Autenticavel, DispositivoLigavel{

    @Override
    public void ligar() {
        System.out.println("Dispositivo Ligado");
    }
    @Override
    public void desligar() {
        System.out.println("Dispositivo Desligado");
    }

    @Override
    public void ValidarAcesso(String senha) {
        if (senha.equals("123")) {
            System.out.println("Senha Correta, Destrancando");
        }
    }


}
