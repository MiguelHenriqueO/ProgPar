public class Streaming {
    public String usuario, plano, ultimoFilmeAssistido;
    public float mensalidade;
    public boolean ativo;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";
        this.plano = plano;

        if (this.plano.equals("Básico")){
            this.mensalidade = 25.90f;
        }else if (this.plano.equals("Premium")) {
            this.mensalidade = 45.90f;
        }else if (this.plano.equals("Familia")) {
            this.mensalidade = 60.90f;
        }else{
            System.out.println("Plano Inválido");
        }
    }

    public void ultimoFilmeAssistido(String nomeFilme){
        if (this.ativo){
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Último filme assistido: " + nomeFilme);
        }else {
            System.out.println("Conta inativa, verifique se há faturas não pagas");
        }
    }

    public void desativarConta(){
        if (this.ativo){
            this.ativo = false;
        }else {
            System.out.println("Conta já está desativada");
        }
    }

    public String toString() {
        String status;

        if (this.ativo){
            status = "Ativa";
        }else {
            status = "Suspenso";
        }

        return ("Usuario: " + this.usuario + "\nPlano: " + this.plano + "\nMensalidade: " + mensalidade + "\nUltimo filme assistido: " + ultimoFilmeAssistido + "\nStatus da conta: " + status);


    }
}

