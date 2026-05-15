public class Sms extends CanalNotificacao{
    private int numTelefone;

    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    public Sms(String destinatario, String mensagem, int numTelefone) {
        super(destinatario, mensagem);
        this.numTelefone = numTelefone;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para o número " + this.numTelefone +  " : " + this.mensagem);
    }

    public int getNumTelefone() {
        return this.numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    @Override
    public String toString() {
        return super.toString() + "Sms{" +
                "numTelefone=" + numTelefone +
                '}';
    }


}
