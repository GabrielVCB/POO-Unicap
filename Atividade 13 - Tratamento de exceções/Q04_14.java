import java.util.Scanner;
import java.util.InputMismatchException;

public class Q04_14 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);
        int index = 0;

        try {
            while (true) {
                try {
                    int newVetor = sc.nextInt();
                    vetor[index] = newVetor;
                    index++;
                    if (newVetor == 0) break;
                } catch (InputMismatchException error) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                    sc.next();
                } catch (ArrayIndexOutOfBoundsException error) {
                    System.out.println("Limite de 10 números atingido.");
                    break;
                }
            }
        } finally {
            sc.close();
            System.out.print("Números inseridos: ");
            for (int i = 0; i < index; i++) {
                System.out.print(vetor[i] + " ");
            }
        }
    }
}
