package ex1;

public class TestaVeiculo {
    public static void exibe(Veiculo referencia){
        referencia.mover();
        referencia.abastecer();
    }
    void main(String[] args) {
        Aviao av1 = new Aviao("yamaha","m32a",320.5f,300.0f);
        exibe(av1);
        CarroEletrico cE1 = new CarroEletrico("tesla","tesla 2",200.0f, 200);
        exibe(cE1);
        Veiculo v = new Aviao("panam","h320m",200.5f,150.0f);
        exibe(v);

        v = new CarroEletrico("byd","a",100.0f, 150);
        exibe(v);
    }
}
