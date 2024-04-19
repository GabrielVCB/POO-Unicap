import java.util.Stack;
public class PilhaDeCaixas {
    private double alturaMaxPermitida;
    private Stack<Caixa> pilha;

    public PilhaDeCaixas(double alturaMaxPermitida) {
        this.alturaMaxPermitida = alturaMaxPermitida;
        this.pilha = new Stack<>();
    }

    public boolean empilhar(Caixa caixa) {
        double novaAltura = pilha.stream().mapToDouble(Caixa::getAltura).sum() + caixa.getAltura();
        if (novaAltura > alturaMaxPermitida) {
            return false;
        }

        if (caixa instanceof CaixaFragil) {
            double pesoAcima = pilha.stream().mapToDouble(Caixa::getPeso).sum();
            if (pesoAcima > ((CaixaFragil) caixa).getPesoMaxSuportado()) {
                return false;
            }
        }

        pilha.push(caixa);
        return true;
    }

    public Caixa desempilhar() {
        if (pilha.isEmpty()) {
            System.out.println("Pilha vazia.");
            return null;
        }

        return pilha.pop();
    }

    public double getAlturaAtual() {
        return pilha.stream().mapToDouble(Caixa::getAltura).sum();
    }

    public double getPesoTotal() {
        return pilha.stream().mapToDouble(Caixa::getPeso).sum();
    }

    public void exibirCaixas() {
        System.out.println("Caixas na pilha, de cima para baixo:");
        for (int i = pilha.size() - 1; i >= 0; i--) {
            pilha.get(i).exibirEtiqueta();
            System.out.println();
        }
        System.out.println("Altura total: " + getAlturaAtual());
        System.out.println("Peso total: " + getPesoTotal());
    }
}