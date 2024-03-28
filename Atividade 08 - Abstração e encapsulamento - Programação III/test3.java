//Teste Questão 5
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o livro a ser buscado: ");
        String busca = sc.nextLine();
        Livro livro = new Livro("Narnia", "Lewis", 1985);
        livro.listar(busca);
        sc.close();
    }
}
