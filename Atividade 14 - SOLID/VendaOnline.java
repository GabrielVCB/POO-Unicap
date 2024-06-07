
public class VendaOnline implements ModoVenda {
    @Override
    public void efetuarVenda(String produto, String cliente, int quantidade) {
        System.out.println("Venda online realizada: Produto - " + produto + ", Cliente - " + cliente + ", Quantidade - " + quantidade);
    }

    @Override
    public double calcularDesconto() {
        return 0.15; 
    }
}
