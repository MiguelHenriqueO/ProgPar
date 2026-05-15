public class Questao {
    private int numero;
    private String enunciado;
    private float valor;

    public Questao(){

    }

    public Questao(int numero, String enunciado, float valor) {
        this.numero = numero;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return this.enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "numero=" + this.numero +
                ", enunciado='" + this.enunciado + '\'' +
                ", valor=" + this.valor +
                '}';
    }
}
