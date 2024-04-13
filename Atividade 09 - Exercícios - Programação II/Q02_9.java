import java.util.ArrayList;
public class Q02_9 {
    public static void main(String[] args) {
        ArrayList<ItemPedido> itensPedido1 = new ArrayList<>();
        itensPedido1.add(new ItemPedido("Produto 1", 100));
        itensPedido1.add(new ItemPedido("Produto 2", 200));
        Pedido pedido1 = new Pedido(1, itensPedido1);

        ArrayList<ItemPedido> itensPedido2 = new ArrayList<>();
        itensPedido2.add(new ItemPedido("Produto 3", 300));
        itensPedido2.add(new ItemPedido("Produto 4", 400));
        Pedido pedido2 = new Pedido(2, itensPedido2);

        ArrayList<ItemPedido> itensPedido3 = new ArrayList<>();
        itensPedido3.add(new ItemPedido("Produto 5", 100));
        itensPedido3.add(new ItemPedido("Produto 6", 200));
        Pedido pedido3 = new Pedido(3, itensPedido3);

        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);

        for (Pedido pedido : pedidos) {
            pedido.calcularTotal();
        }

        // Identificar e exibir os números dos pedidos com valor total acima de R$500
        System.out.println("Números dos pedidos com valor total acima de R$500:");
        for (Pedido pedido : pedidos) {
            if (pedido.getTotal() > 500) {
                System.out.println(pedido.getNumero());
            }
        }
    }
}
