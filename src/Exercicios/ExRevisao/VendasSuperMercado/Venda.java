package VendasSuperMercado;

import java.util.ArrayList;

public class Venda {
    private int id;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens;

    public Venda(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // Cria o item dentro da venda (COMPOSIÇÃO)
    public void adicionarItem(int idItem, int quantidade, Produto produto) {
        ItemVenda item = new ItemVenda(idItem, quantidade, produto);
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemVenda item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void exibirVenda() {
        System.out.println("Venda ID: " + id);
        System.out.println("Cliente: " + cliente.getNome());

        for (ItemVenda item : itens) {
            System.out.println(item);
        }

        System.out.println("Total: R$ " + calcularTotal());
    }
}
