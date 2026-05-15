public class Cozinheiro extends Usuario{
    public Cozinheiro(int idUsuario, String nome, String tipo) {
        super(idUsuario, nome, tipo);
    }

    @Override
    public String toString() {
        return super.toString() +"Cozinheiro{}";
    }
}
