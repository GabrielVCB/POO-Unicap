import java.util.Scanner;

public class Q13_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int soma = 0;

        while (number > 0) {
            soma += (number % 10) * (number % 10) * (number % 10);
            number /= 10;
        }

        System.out.printf("Soma dos dígitos: %d", soma);
        sc.close();
    }
}
