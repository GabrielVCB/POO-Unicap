import java.util.ArrayList;
import java.util.Scanner;
public class Q02_14 {
    public static void main(String[] args) {
        ArrayList<Integer> idades = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade " + (i + 1) + ": ");
            int novaIdade = sc.nextInt();
            idades.add(novaIdade);
        }
        try {
            System.out.println("Digite a posição da idade que deseja deletar: ");
            int posicao = sc.nextInt();
            idades.remove(posicao);
        } catch (Exception e) {
            System.out.println("Posição inválida");
        } finally {
            for (int i = 0; i < idades.size(); i++) {
                System.out.println("Idade " + (i + 1) + ": " + idades.get(i));
            }
            sc.close();
        }
    }
}
