public class NotificacaoEmail implements NotificacaoVenda {

    public void enviarConfirmacao(String produto, String cliente, int quantidade) {
        System.out.println("Email de confirmação enviado: Produto - " + produto + ", Cliente - " + cliente + ", Quantidade - " + quantidade);
    }
    public void enviarRecibo() {
        System.out.println("Recibo enviado por email.");
    }
}