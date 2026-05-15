public class Placar {
    public String nomeTimeCasa, nomeTimeVisitante;
    public int pontosCasa, pontosVisitante, periodoQuarto;

    public Placar (String nomeTimeCasa, String nomeTimeVisitante){
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;

    }

    public void registrarPonto(String time, int tipo){

        if (tipo >= 1 && tipo <= 3){
            if (time.equals("Casa")) {
                this.pontosCasa += tipo;
            } else if (time.equals("Visitante")) {
                this.pontosVisitante += tipo;
            }else{
                System.out.println("Time inválido");
            }
        }else{
            System.out.println("Quantidade de pontos inválida");
        }
    }

    public void proximoQuarto(){
        if(this.periodoQuarto < 4){
            this.periodoQuarto++;
            System.out.println("Iniciando o " + periodoQuarto + "º quarto.");
        }else{
            System.out.println("o jogo acabou");
        }
    }

    public String toString(){
        return ("Time casa: " + nomeTimeCasa + "\nTime Visitante: " + nomeTimeVisitante + "\nPontos casa: " + pontosCasa + " X " + "Pontos Visitante: "+ pontosVisitante + "\nPeriodo: " + periodoQuarto);
    }
}
