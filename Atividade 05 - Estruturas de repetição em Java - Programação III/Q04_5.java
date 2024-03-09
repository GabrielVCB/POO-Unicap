import java.util.Scanner;

public class Q04_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pessoas = 0;
        double soma = 0;
        while (pessoas < 5) {
            double altura = sc.nextDouble();
            soma+=altura;
            pessoas++;
        }
        double media = soma / 5;
        System.out.printf("Altura media: %.2f",media);
        sc.close();
    }
}