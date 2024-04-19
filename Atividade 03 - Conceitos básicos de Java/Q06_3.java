import java.util.Scanner;

public class Q06_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double quadrado = n * n;
        System.out.printf("Quadrado = %f", quadrado);
        sc.close();
    }
}
