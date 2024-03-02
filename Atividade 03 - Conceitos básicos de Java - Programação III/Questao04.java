import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        System.out.printf("Soma=%d", soma);
        sc.close();
    }
}
