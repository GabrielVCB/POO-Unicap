public class Main {
    public static void main(String[] args) {
        ModoVenda vendaLojaFisica = new VendaLojaFisica();
        ModoVenda vendaOnline = new VendaOnline();

        NotificacaoVenda notificacaoEmail = new NotificacaoEmail();

        RegistroVenda registroVendaLojaFisica = new RegistroVenda(vendaLojaFisica, notificacaoEmail);
        registroVendaLojaFisica.registrarVenda("computador", "kaila", 1);

        RegistroVenda registroVendaOnline = new RegistroVenda(vendaOnline, notificacaoEmail);
        registroVendaOnline.registrarVenda("carro", "Antonio", 2);
    }
}
