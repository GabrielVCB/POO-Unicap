//Teste questão 4
import java.util.ArrayList;
public class test2 {
    public static void main(String[] args) {
        BancoDeDados bd = new BancoDeDados(new ArrayList<>(), "João", 25);

        bd.adicionarRegistro(1);
        bd.adicionarRegistro(2);

        bd.listarRegistros();

        bd.removerRegistro(1);

        bd.listarRegistros();

        bd.atualizarRegistro(2);

        bd.listarRegistros();
    }
}
