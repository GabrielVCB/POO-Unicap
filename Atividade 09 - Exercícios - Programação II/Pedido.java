import java.util.ArrayList;
public class Pedido {
    private int numero;
    private ArrayList<ItemPedido> itens;
    private double total;

    public Pedido(int numero, ArrayList<ItemPedido> itens) {
        this.numero = numero;
        this.itens = itens;
    }

    public int getNumero() {
        return numero;
    }

    public double getTotal() {
        return total;
    }

    public void calcularTotal() {
        total = 0;
        for (ItemPedido item : itens) {
            total += item.getPreco();
        }
    }
}
