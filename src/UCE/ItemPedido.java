public class ItemPedido {
    private int idProduto;
    private float preco;
    private int quantidade;

    public ItemPedido(int statusPedido) {

    }

    public ItemPedido(int statusPedido, int idProduto, float preco, int quantidade) {
        this.idProduto = idProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return this.idProduto;
    }

    public float getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return  "Item{" +
                "idProduto=" + idProduto +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
