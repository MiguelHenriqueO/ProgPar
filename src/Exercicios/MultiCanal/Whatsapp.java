public class Whatsapp extends CanalNotificacao{
    private String statusLeitura;

    public Whatsapp(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    public Whatsapp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Zap para " + this.destinatario + " Mensagem: " + this.mensagem);
    }

    public String getStatusLeitura() {
        return this.statusLeitura;
    }

    public void setStatusLeitura(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    @Override
    public String toString() {
        return super.toString() + "Whatsapp{" +
                "statusLeitura='" + statusLeitura + '\'' +
                '}';
    }
}
