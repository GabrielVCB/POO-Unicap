public class Main {
    public static void main(String[] args) {
        CaixaFragil caixa1 = new CaixaFragil(1, "Livros", 15.0, 10.0, 20.0);
        CaixaFragil caixa2 = new CaixaFragil(2, "Vidro", 10.0, 10.0, 15.0);

        PilhaDeCaixas pilhaDeCaixas = new PilhaDeCaixas(30.0);

        System.out.println(pilhaDeCaixas.empilhar(caixa1) ? "Caixa 1 empilhada com sucesso!" : "Falha ao empilhar a Caixa 1.");
        System.out.println(pilhaDeCaixas.empilhar(caixa2) ? "Caixa 2 empilhada com sucesso!" : "Falha ao empilhar a Caixa 2.");

        pilhaDeCaixas.exibirCaixas();

        Caixa caixaDesempilhada = pilhaDeCaixas.desempilhar();
        if (caixaDesempilhada != null) {
            System.out.println("Caixa " + caixaDesempilhada.getId() + " foi desempilhada.");
        }
    }
}
