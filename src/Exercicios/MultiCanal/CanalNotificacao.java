public abstract class CanalNotificacao {
    public String destinatario, mensagem;

    public CanalNotificacao() {
    }

    public CanalNotificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }

    public void exibirDados(){
        System.out.println("Destinatário :" +  destinatario);
        System.out.println("Mensagem :" +  mensagem);
    }

    public abstract void enviar();

    public String getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "CanalNotificacao{" +
                "destinatario='" + destinatario + '\'' +
                ", mensagem='" + mensagem + '\'' +
                '}';
    }
}
