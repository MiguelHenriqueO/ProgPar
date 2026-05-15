public class Email extends CanalNotificacao{
    private String assunto;

    public Email(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando E-mail para " + this.destinatario+ " com o assunto: "+ this.assunto+ " : " + this.mensagem);
    }

    public String getAssunto() {
        return this.assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return super.toString() +"Email{" +
                "assunto='" + assunto + '\'' +
                '}';
    }
}
