import java.util.Scanner;

public class Q24_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0;
        while (true) {
            int number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number%2 == 0) {
                pares++;
            } else {
                impares++;
            }
        } 
        System.out.printf("Pares: %d\nImpares: %d",pares, impares);
        sc.close();
    }
}