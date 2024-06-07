public interface ModoVenda {
    void efetuarVenda(String produto, String cliente, int quantidade);
    double calcularDesconto();
}