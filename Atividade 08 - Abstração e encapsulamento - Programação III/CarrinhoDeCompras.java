//Questão 3
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<String> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        this.itens.add(item);
    }

    public void removerItem(String item) {
        this.itens.remove(item);
    }

    public List<String> listarItens() {
        return new ArrayList<>(this.itens);
    }
}
