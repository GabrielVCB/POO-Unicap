//Questão 4
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoDeDados {
    private List<Integer> registros;
    private String nome;
    private int idade;

    Scanner sc = new Scanner(System.in);

    public BancoDeDados(List<Integer> registro, String nome, int idade) {
        this.registros = new ArrayList<>();
        this.nome = nome;
        this.idade = idade;
    }

    public void adicionarRegistro(Integer registro) {
        this.registros.add(registro);
        System.out.println("Digite o nome: ");
        this.nome = sc.nextLine();
        System.out.println("Digite a idade: ");
        this.idade = sc.nextInt();
        sc.nextLine();  // Para consumir o '\n' restante
        System.out.println("Registro adicionado!\n");
    }

    public void atualizarRegistro(Integer registro) {
        System.out.println("Digite o novo nome: ");
        this.nome = sc.nextLine();
        System.out.println("Digite a nova idade: ");
        this.idade = sc.nextInt();
        sc.nextLine();  // Para consumir o '\n' restante
    }

    public void listarRegistros() {
        System.out.println("Lista: ");
        System.out.println(new ArrayList<>(this.registros));
        System.out.printf("Nome: %s\nIdade: %d\n\n", this.nome, this.idade);
    }    

    public void removerRegistro(Integer registro) {
        this.registros.remove(registro);
        System.out.println("Registro removido!\n");
    }
}
