import java.util.Scanner;

public class Q01_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um nome: ");
            String nome = scanner.nextLine();

            System.out.print("Digite um número: ");
            int posicao = scanner.nextInt();

            if (posicao < 0 || posicao >= nome.length()) {
                System.out.println("Posição inválida");
            } else {
                char caractere = nome.charAt(posicao);
                System.out.println("O caractere na posição " + posicao + " é: " + caractere);
            }
        } catch (Exception e) {
            System.out.println("Posição inválida");
        } finally {
            scanner.close();
        }
    }
}
